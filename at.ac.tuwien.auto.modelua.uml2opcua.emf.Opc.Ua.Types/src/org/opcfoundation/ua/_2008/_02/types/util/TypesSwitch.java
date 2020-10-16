/**
 */
package org.opcfoundation.ua._2008._02.types.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.opcfoundation.ua._2008._02.types.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TypesPackage.ACTIVATE_SESSION_REQUEST: {
				ActivateSessionRequest activateSessionRequest = (ActivateSessionRequest)theEObject;
				T result = caseActivateSessionRequest(activateSessionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ACTIVATE_SESSION_RESPONSE: {
				ActivateSessionResponse activateSessionResponse = (ActivateSessionResponse)theEObject;
				T result = caseActivateSessionResponse(activateSessionResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ADD_NODES_ITEM: {
				AddNodesItem addNodesItem = (AddNodesItem)theEObject;
				T result = caseAddNodesItem(addNodesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ADD_NODES_REQUEST: {
				AddNodesRequest addNodesRequest = (AddNodesRequest)theEObject;
				T result = caseAddNodesRequest(addNodesRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ADD_NODES_RESPONSE: {
				AddNodesResponse addNodesResponse = (AddNodesResponse)theEObject;
				T result = caseAddNodesResponse(addNodesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ADD_NODES_RESULT: {
				AddNodesResult addNodesResult = (AddNodesResult)theEObject;
				T result = caseAddNodesResult(addNodesResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ADD_REFERENCES_ITEM: {
				AddReferencesItem addReferencesItem = (AddReferencesItem)theEObject;
				T result = caseAddReferencesItem(addReferencesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ADD_REFERENCES_REQUEST: {
				AddReferencesRequest addReferencesRequest = (AddReferencesRequest)theEObject;
				T result = caseAddReferencesRequest(addReferencesRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ADD_REFERENCES_RESPONSE: {
				AddReferencesResponse addReferencesResponse = (AddReferencesResponse)theEObject;
				T result = caseAddReferencesResponse(addReferencesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.AGGREGATE_CONFIGURATION: {
				AggregateConfiguration aggregateConfiguration = (AggregateConfiguration)theEObject;
				T result = caseAggregateConfiguration(aggregateConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.AGGREGATE_FILTER: {
				AggregateFilter aggregateFilter = (AggregateFilter)theEObject;
				T result = caseAggregateFilter(aggregateFilter);
				if (result == null) result = caseMonitoringFilter(aggregateFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.AGGREGATE_FILTER_RESULT: {
				AggregateFilterResult aggregateFilterResult = (AggregateFilterResult)theEObject;
				T result = caseAggregateFilterResult(aggregateFilterResult);
				if (result == null) result = caseMonitoringFilterResult(aggregateFilterResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ALIAS_NAME_DATA_TYPE: {
				AliasNameDataType aliasNameDataType = (AliasNameDataType)theEObject;
				T result = caseAliasNameDataType(aliasNameDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANONYMOUS_IDENTITY_TOKEN: {
				AnonymousIdentityToken anonymousIdentityToken = (AnonymousIdentityToken)theEObject;
				T result = caseAnonymousIdentityToken(anonymousIdentityToken);
				if (result == null) result = caseUserIdentityToken(anonymousIdentityToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.APPLICATION_DESCRIPTION: {
				ApplicationDescription applicationDescription = (ApplicationDescription)theEObject;
				T result = caseApplicationDescription(applicationDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ATTRIBUTE_OPERAND: {
				AttributeOperand attributeOperand = (AttributeOperand)theEObject;
				T result = caseAttributeOperand(attributeOperand);
				if (result == null) result = caseFilterOperand(attributeOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.AXIS_INFORMATION: {
				AxisInformation axisInformation = (AxisInformation)theEObject;
				T result = caseAxisInformation(axisInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BODY_TYPE: {
				BodyType bodyType = (BodyType)theEObject;
				T result = caseBodyType(bodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROKER_CONNECTION_TRANSPORT_DATA_TYPE: {
				BrokerConnectionTransportDataType brokerConnectionTransportDataType = (BrokerConnectionTransportDataType)theEObject;
				T result = caseBrokerConnectionTransportDataType(brokerConnectionTransportDataType);
				if (result == null) result = caseConnectionTransportDataType(brokerConnectionTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE: {
				BrokerDataSetReaderTransportDataType brokerDataSetReaderTransportDataType = (BrokerDataSetReaderTransportDataType)theEObject;
				T result = caseBrokerDataSetReaderTransportDataType(brokerDataSetReaderTransportDataType);
				if (result == null) result = caseDataSetReaderTransportDataType(brokerDataSetReaderTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE: {
				BrokerDataSetWriterTransportDataType brokerDataSetWriterTransportDataType = (BrokerDataSetWriterTransportDataType)theEObject;
				T result = caseBrokerDataSetWriterTransportDataType(brokerDataSetWriterTransportDataType);
				if (result == null) result = caseDataSetWriterTransportDataType(brokerDataSetWriterTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE: {
				BrokerWriterGroupTransportDataType brokerWriterGroupTransportDataType = (BrokerWriterGroupTransportDataType)theEObject;
				T result = caseBrokerWriterGroupTransportDataType(brokerWriterGroupTransportDataType);
				if (result == null) result = caseWriterGroupTransportDataType(brokerWriterGroupTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROWSE_DESCRIPTION: {
				BrowseDescription browseDescription = (BrowseDescription)theEObject;
				T result = caseBrowseDescription(browseDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROWSE_NEXT_REQUEST: {
				BrowseNextRequest browseNextRequest = (BrowseNextRequest)theEObject;
				T result = caseBrowseNextRequest(browseNextRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROWSE_NEXT_RESPONSE: {
				BrowseNextResponse browseNextResponse = (BrowseNextResponse)theEObject;
				T result = caseBrowseNextResponse(browseNextResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROWSE_PATH: {
				BrowsePath browsePath = (BrowsePath)theEObject;
				T result = caseBrowsePath(browsePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROWSE_PATH_RESULT: {
				BrowsePathResult browsePathResult = (BrowsePathResult)theEObject;
				T result = caseBrowsePathResult(browsePathResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROWSE_PATH_TARGET: {
				BrowsePathTarget browsePathTarget = (BrowsePathTarget)theEObject;
				T result = caseBrowsePathTarget(browsePathTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROWSE_REQUEST: {
				BrowseRequest browseRequest = (BrowseRequest)theEObject;
				T result = caseBrowseRequest(browseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROWSE_RESPONSE: {
				BrowseResponse browseResponse = (BrowseResponse)theEObject;
				T result = caseBrowseResponse(browseResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BROWSE_RESULT: {
				BrowseResult browseResult = (BrowseResult)theEObject;
				T result = caseBrowseResult(browseResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BUILD_INFO: {
				BuildInfo buildInfo = (BuildInfo)theEObject;
				T result = caseBuildInfo(buildInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CALL_METHOD_REQUEST: {
				CallMethodRequest callMethodRequest = (CallMethodRequest)theEObject;
				T result = caseCallMethodRequest(callMethodRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CALL_METHOD_RESULT: {
				CallMethodResult callMethodResult = (CallMethodResult)theEObject;
				T result = caseCallMethodResult(callMethodResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CALL_REQUEST: {
				CallRequest callRequest = (CallRequest)theEObject;
				T result = caseCallRequest(callRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CALL_RESPONSE: {
				CallResponse callResponse = (CallResponse)theEObject;
				T result = caseCallResponse(callResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CANCEL_REQUEST: {
				CancelRequest cancelRequest = (CancelRequest)theEObject;
				T result = caseCancelRequest(cancelRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CANCEL_RESPONSE: {
				CancelResponse cancelResponse = (CancelResponse)theEObject;
				T result = caseCancelResponse(cancelResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CARTESIAN_COORDINATES: {
				CartesianCoordinates cartesianCoordinates = (CartesianCoordinates)theEObject;
				T result = caseCartesianCoordinates(cartesianCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CHANNEL_SECURITY_TOKEN: {
				ChannelSecurityToken channelSecurityToken = (ChannelSecurityToken)theEObject;
				T result = caseChannelSecurityToken(channelSecurityToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CLOSE_SECURE_CHANNEL_REQUEST: {
				CloseSecureChannelRequest closeSecureChannelRequest = (CloseSecureChannelRequest)theEObject;
				T result = caseCloseSecureChannelRequest(closeSecureChannelRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CLOSE_SECURE_CHANNEL_RESPONSE: {
				CloseSecureChannelResponse closeSecureChannelResponse = (CloseSecureChannelResponse)theEObject;
				T result = caseCloseSecureChannelResponse(closeSecureChannelResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CLOSE_SESSION_REQUEST: {
				CloseSessionRequest closeSessionRequest = (CloseSessionRequest)theEObject;
				T result = caseCloseSessionRequest(closeSessionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CLOSE_SESSION_RESPONSE: {
				CloseSessionResponse closeSessionResponse = (CloseSessionResponse)theEObject;
				T result = caseCloseSessionResponse(closeSessionResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.COMPLEX_NUMBER_TYPE: {
				ComplexNumberType complexNumberType = (ComplexNumberType)theEObject;
				T result = caseComplexNumberType(complexNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CONFIGURATION_VERSION_DATA_TYPE: {
				ConfigurationVersionDataType configurationVersionDataType = (ConfigurationVersionDataType)theEObject;
				T result = caseConfigurationVersionDataType(configurationVersionDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CONNECTION_TRANSPORT_DATA_TYPE: {
				ConnectionTransportDataType connectionTransportDataType = (ConnectionTransportDataType)theEObject;
				T result = caseConnectionTransportDataType(connectionTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CONTENT_FILTER: {
				ContentFilter contentFilter = (ContentFilter)theEObject;
				T result = caseContentFilter(contentFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CONTENT_FILTER_ELEMENT: {
				ContentFilterElement contentFilterElement = (ContentFilterElement)theEObject;
				T result = caseContentFilterElement(contentFilterElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT: {
				ContentFilterElementResult contentFilterElementResult = (ContentFilterElementResult)theEObject;
				T result = caseContentFilterElementResult(contentFilterElementResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CONTENT_FILTER_RESULT: {
				ContentFilterResult contentFilterResult = (ContentFilterResult)theEObject;
				T result = caseContentFilterResult(contentFilterResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST: {
				CreateMonitoredItemsRequest createMonitoredItemsRequest = (CreateMonitoredItemsRequest)theEObject;
				T result = caseCreateMonitoredItemsRequest(createMonitoredItemsRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CREATE_MONITORED_ITEMS_RESPONSE: {
				CreateMonitoredItemsResponse createMonitoredItemsResponse = (CreateMonitoredItemsResponse)theEObject;
				T result = caseCreateMonitoredItemsResponse(createMonitoredItemsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CREATE_SESSION_REQUEST: {
				CreateSessionRequest createSessionRequest = (CreateSessionRequest)theEObject;
				T result = caseCreateSessionRequest(createSessionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CREATE_SESSION_RESPONSE: {
				CreateSessionResponse createSessionResponse = (CreateSessionResponse)theEObject;
				T result = caseCreateSessionResponse(createSessionResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CREATE_SUBSCRIPTION_REQUEST: {
				CreateSubscriptionRequest createSubscriptionRequest = (CreateSubscriptionRequest)theEObject;
				T result = caseCreateSubscriptionRequest(createSubscriptionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CREATE_SUBSCRIPTION_RESPONSE: {
				CreateSubscriptionResponse createSubscriptionResponse = (CreateSubscriptionResponse)theEObject;
				T result = caseCreateSubscriptionResponse(createSubscriptionResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CURRENCY_UNIT_TYPE: {
				CurrencyUnitType currencyUnitType = (CurrencyUnitType)theEObject;
				T result = caseCurrencyUnitType(currencyUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_CHANGE_FILTER: {
				DataChangeFilter dataChangeFilter = (DataChangeFilter)theEObject;
				T result = caseDataChangeFilter(dataChangeFilter);
				if (result == null) result = caseMonitoringFilter(dataChangeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_CHANGE_NOTIFICATION: {
				DataChangeNotification dataChangeNotification = (DataChangeNotification)theEObject;
				T result = caseDataChangeNotification(dataChangeNotification);
				if (result == null) result = caseNotificationData(dataChangeNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE: {
				DatagramConnectionTransportDataType datagramConnectionTransportDataType = (DatagramConnectionTransportDataType)theEObject;
				T result = caseDatagramConnectionTransportDataType(datagramConnectionTransportDataType);
				if (result == null) result = caseConnectionTransportDataType(datagramConnectionTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE: {
				DatagramWriterGroupTransportDataType datagramWriterGroupTransportDataType = (DatagramWriterGroupTransportDataType)theEObject;
				T result = caseDatagramWriterGroupTransportDataType(datagramWriterGroupTransportDataType);
				if (result == null) result = caseWriterGroupTransportDataType(datagramWriterGroupTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_SET_META_DATA_TYPE: {
				DataSetMetaDataType dataSetMetaDataType = (DataSetMetaDataType)theEObject;
				T result = caseDataSetMetaDataType(dataSetMetaDataType);
				if (result == null) result = caseDataTypeSchemaHeader(dataSetMetaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_SET_READER_DATA_TYPE: {
				DataSetReaderDataType dataSetReaderDataType = (DataSetReaderDataType)theEObject;
				T result = caseDataSetReaderDataType(dataSetReaderDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_SET_READER_MESSAGE_DATA_TYPE: {
				DataSetReaderMessageDataType dataSetReaderMessageDataType = (DataSetReaderMessageDataType)theEObject;
				T result = caseDataSetReaderMessageDataType(dataSetReaderMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_SET_READER_TRANSPORT_DATA_TYPE: {
				DataSetReaderTransportDataType dataSetReaderTransportDataType = (DataSetReaderTransportDataType)theEObject;
				T result = caseDataSetReaderTransportDataType(dataSetReaderTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE: {
				DataSetWriterDataType dataSetWriterDataType = (DataSetWriterDataType)theEObject;
				T result = caseDataSetWriterDataType(dataSetWriterDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_SET_WRITER_MESSAGE_DATA_TYPE: {
				DataSetWriterMessageDataType dataSetWriterMessageDataType = (DataSetWriterMessageDataType)theEObject;
				T result = caseDataSetWriterMessageDataType(dataSetWriterMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_SET_WRITER_TRANSPORT_DATA_TYPE: {
				DataSetWriterTransportDataType dataSetWriterTransportDataType = (DataSetWriterTransportDataType)theEObject;
				T result = caseDataSetWriterTransportDataType(dataSetWriterTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_TYPE_ATTRIBUTES: {
				DataTypeAttributes dataTypeAttributes = (DataTypeAttributes)theEObject;
				T result = caseDataTypeAttributes(dataTypeAttributes);
				if (result == null) result = caseNodeAttributes(dataTypeAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_TYPE_DEFINITION: {
				DataTypeDefinition dataTypeDefinition = (DataTypeDefinition)theEObject;
				T result = caseDataTypeDefinition(dataTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_TYPE_DESCRIPTION: {
				DataTypeDescription dataTypeDescription = (DataTypeDescription)theEObject;
				T result = caseDataTypeDescription(dataTypeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_TYPE_NODE: {
				DataTypeNode dataTypeNode = (DataTypeNode)theEObject;
				T result = caseDataTypeNode(dataTypeNode);
				if (result == null) result = caseTypeNode(dataTypeNode);
				if (result == null) result = caseNode(dataTypeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER: {
				DataTypeSchemaHeader dataTypeSchemaHeader = (DataTypeSchemaHeader)theEObject;
				T result = caseDataTypeSchemaHeader(dataTypeSchemaHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_VALUE: {
				DataValue dataValue = (DataValue)theEObject;
				T result = caseDataValue(dataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DECIMAL_DATA_TYPE: {
				DecimalDataType decimalDataType = (DecimalDataType)theEObject;
				T result = caseDecimalDataType(decimalDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_AT_TIME_DETAILS: {
				DeleteAtTimeDetails deleteAtTimeDetails = (DeleteAtTimeDetails)theEObject;
				T result = caseDeleteAtTimeDetails(deleteAtTimeDetails);
				if (result == null) result = caseHistoryUpdateDetails(deleteAtTimeDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_EVENT_DETAILS: {
				DeleteEventDetails deleteEventDetails = (DeleteEventDetails)theEObject;
				T result = caseDeleteEventDetails(deleteEventDetails);
				if (result == null) result = caseHistoryUpdateDetails(deleteEventDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_MONITORED_ITEMS_REQUEST: {
				DeleteMonitoredItemsRequest deleteMonitoredItemsRequest = (DeleteMonitoredItemsRequest)theEObject;
				T result = caseDeleteMonitoredItemsRequest(deleteMonitoredItemsRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_MONITORED_ITEMS_RESPONSE: {
				DeleteMonitoredItemsResponse deleteMonitoredItemsResponse = (DeleteMonitoredItemsResponse)theEObject;
				T result = caseDeleteMonitoredItemsResponse(deleteMonitoredItemsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_NODES_ITEM: {
				DeleteNodesItem deleteNodesItem = (DeleteNodesItem)theEObject;
				T result = caseDeleteNodesItem(deleteNodesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_NODES_REQUEST: {
				DeleteNodesRequest deleteNodesRequest = (DeleteNodesRequest)theEObject;
				T result = caseDeleteNodesRequest(deleteNodesRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_NODES_RESPONSE: {
				DeleteNodesResponse deleteNodesResponse = (DeleteNodesResponse)theEObject;
				T result = caseDeleteNodesResponse(deleteNodesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS: {
				DeleteRawModifiedDetails deleteRawModifiedDetails = (DeleteRawModifiedDetails)theEObject;
				T result = caseDeleteRawModifiedDetails(deleteRawModifiedDetails);
				if (result == null) result = caseHistoryUpdateDetails(deleteRawModifiedDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_REFERENCES_ITEM: {
				DeleteReferencesItem deleteReferencesItem = (DeleteReferencesItem)theEObject;
				T result = caseDeleteReferencesItem(deleteReferencesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_REFERENCES_REQUEST: {
				DeleteReferencesRequest deleteReferencesRequest = (DeleteReferencesRequest)theEObject;
				T result = caseDeleteReferencesRequest(deleteReferencesRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_REFERENCES_RESPONSE: {
				DeleteReferencesResponse deleteReferencesResponse = (DeleteReferencesResponse)theEObject;
				T result = caseDeleteReferencesResponse(deleteReferencesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_SUBSCRIPTIONS_REQUEST: {
				DeleteSubscriptionsRequest deleteSubscriptionsRequest = (DeleteSubscriptionsRequest)theEObject;
				T result = caseDeleteSubscriptionsRequest(deleteSubscriptionsRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DELETE_SUBSCRIPTIONS_RESPONSE: {
				DeleteSubscriptionsResponse deleteSubscriptionsResponse = (DeleteSubscriptionsResponse)theEObject;
				T result = caseDeleteSubscriptionsResponse(deleteSubscriptionsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DIAGNOSTIC_INFO: {
				DiagnosticInfo diagnosticInfo = (DiagnosticInfo)theEObject;
				T result = caseDiagnosticInfo(diagnosticInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DISCOVERY_CONFIGURATION: {
				DiscoveryConfiguration discoveryConfiguration = (DiscoveryConfiguration)theEObject;
				T result = caseDiscoveryConfiguration(discoveryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DOUBLE_COMPLEX_NUMBER_TYPE: {
				DoubleComplexNumberType doubleComplexNumberType = (DoubleComplexNumberType)theEObject;
				T result = caseDoubleComplexNumberType(doubleComplexNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ELEMENT_OPERAND: {
				ElementOperand elementOperand = (ElementOperand)theEObject;
				T result = caseElementOperand(elementOperand);
				if (result == null) result = caseFilterOperand(elementOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENDPOINT_CONFIGURATION: {
				EndpointConfiguration endpointConfiguration = (EndpointConfiguration)theEObject;
				T result = caseEndpointConfiguration(endpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENDPOINT_DESCRIPTION: {
				EndpointDescription endpointDescription = (EndpointDescription)theEObject;
				T result = caseEndpointDescription(endpointDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENDPOINT_TYPE: {
				EndpointType endpointType = (EndpointType)theEObject;
				T result = caseEndpointType(endpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE: {
				EndpointUrlListDataType endpointUrlListDataType = (EndpointUrlListDataType)theEObject;
				T result = caseEndpointUrlListDataType(endpointUrlListDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUM_DEFINITION: {
				EnumDefinition enumDefinition = (EnumDefinition)theEObject;
				T result = caseEnumDefinition(enumDefinition);
				if (result == null) result = caseDataTypeDefinition(enumDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUM_DESCRIPTION: {
				EnumDescription enumDescription = (EnumDescription)theEObject;
				T result = caseEnumDescription(enumDescription);
				if (result == null) result = caseDataTypeDescription(enumDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUM_FIELD: {
				EnumField enumField = (EnumField)theEObject;
				T result = caseEnumField(enumField);
				if (result == null) result = caseEnumValueType(enumField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUM_VALUE_TYPE: {
				EnumValueType enumValueType = (EnumValueType)theEObject;
				T result = caseEnumValueType(enumValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.EU_INFORMATION: {
				EUInformation euInformation = (EUInformation)theEObject;
				T result = caseEUInformation(euInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.EVENT_FIELD_LIST: {
				EventFieldList eventFieldList = (EventFieldList)theEObject;
				T result = caseEventFieldList(eventFieldList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.EVENT_FILTER: {
				EventFilter eventFilter = (EventFilter)theEObject;
				T result = caseEventFilter(eventFilter);
				if (result == null) result = caseMonitoringFilter(eventFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.EVENT_FILTER_RESULT: {
				EventFilterResult eventFilterResult = (EventFilterResult)theEObject;
				T result = caseEventFilterResult(eventFilterResult);
				if (result == null) result = caseMonitoringFilterResult(eventFilterResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.EVENT_NOTIFICATION_LIST: {
				EventNotificationList eventNotificationList = (EventNotificationList)theEObject;
				T result = caseEventNotificationList(eventNotificationList);
				if (result == null) result = caseNotificationData(eventNotificationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.EXPANDED_NODE_ID: {
				ExpandedNodeId expandedNodeId = (ExpandedNodeId)theEObject;
				T result = caseExpandedNodeId(expandedNodeId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.EXTENSION_OBJECT: {
				ExtensionObject extensionObject = (ExtensionObject)theEObject;
				T result = caseExtensionObject(extensionObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FIELD_META_DATA: {
				FieldMetaData fieldMetaData = (FieldMetaData)theEObject;
				T result = caseFieldMetaData(fieldMetaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FIELD_TARGET_DATA_TYPE: {
				FieldTargetDataType fieldTargetDataType = (FieldTargetDataType)theEObject;
				T result = caseFieldTargetDataType(fieldTargetDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FILTER_OPERAND: {
				FilterOperand filterOperand = (FilterOperand)theEObject;
				T result = caseFilterOperand(filterOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST: {
				FindServersOnNetworkRequest findServersOnNetworkRequest = (FindServersOnNetworkRequest)theEObject;
				T result = caseFindServersOnNetworkRequest(findServersOnNetworkRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE: {
				FindServersOnNetworkResponse findServersOnNetworkResponse = (FindServersOnNetworkResponse)theEObject;
				T result = caseFindServersOnNetworkResponse(findServersOnNetworkResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FIND_SERVERS_REQUEST: {
				FindServersRequest findServersRequest = (FindServersRequest)theEObject;
				T result = caseFindServersRequest(findServersRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FIND_SERVERS_RESPONSE: {
				FindServersResponse findServersResponse = (FindServersResponse)theEObject;
				T result = caseFindServersResponse(findServersResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FRAME: {
				Frame frame = (Frame)theEObject;
				T result = caseFrame(frame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.GENERIC_ATTRIBUTES: {
				GenericAttributes genericAttributes = (GenericAttributes)theEObject;
				T result = caseGenericAttributes(genericAttributes);
				if (result == null) result = caseNodeAttributes(genericAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.GENERIC_ATTRIBUTE_VALUE: {
				GenericAttributeValue genericAttributeValue = (GenericAttributeValue)theEObject;
				T result = caseGenericAttributeValue(genericAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.GET_ENDPOINTS_REQUEST: {
				GetEndpointsRequest getEndpointsRequest = (GetEndpointsRequest)theEObject;
				T result = caseGetEndpointsRequest(getEndpointsRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.GET_ENDPOINTS_RESPONSE: {
				GetEndpointsResponse getEndpointsResponse = (GetEndpointsResponse)theEObject;
				T result = caseGetEndpointsResponse(getEndpointsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.GUID: {
				Guid guid = (Guid)theEObject;
				T result = caseGuid(guid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_DATA: {
				HistoryData historyData = (HistoryData)theEObject;
				T result = caseHistoryData(historyData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_EVENT: {
				HistoryEvent historyEvent = (HistoryEvent)theEObject;
				T result = caseHistoryEvent(historyEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_EVENT_FIELD_LIST: {
				HistoryEventFieldList historyEventFieldList = (HistoryEventFieldList)theEObject;
				T result = caseHistoryEventFieldList(historyEventFieldList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_MODIFIED_DATA: {
				HistoryModifiedData historyModifiedData = (HistoryModifiedData)theEObject;
				T result = caseHistoryModifiedData(historyModifiedData);
				if (result == null) result = caseHistoryData(historyModifiedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_READ_DETAILS: {
				HistoryReadDetails historyReadDetails = (HistoryReadDetails)theEObject;
				T result = caseHistoryReadDetails(historyReadDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_READ_REQUEST: {
				HistoryReadRequest historyReadRequest = (HistoryReadRequest)theEObject;
				T result = caseHistoryReadRequest(historyReadRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_READ_RESPONSE: {
				HistoryReadResponse historyReadResponse = (HistoryReadResponse)theEObject;
				T result = caseHistoryReadResponse(historyReadResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_READ_RESULT: {
				HistoryReadResult historyReadResult = (HistoryReadResult)theEObject;
				T result = caseHistoryReadResult(historyReadResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_READ_VALUE_ID: {
				HistoryReadValueId historyReadValueId = (HistoryReadValueId)theEObject;
				T result = caseHistoryReadValueId(historyReadValueId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_UPDATE_DETAILS: {
				HistoryUpdateDetails historyUpdateDetails = (HistoryUpdateDetails)theEObject;
				T result = caseHistoryUpdateDetails(historyUpdateDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_UPDATE_REQUEST: {
				HistoryUpdateRequest historyUpdateRequest = (HistoryUpdateRequest)theEObject;
				T result = caseHistoryUpdateRequest(historyUpdateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_UPDATE_RESPONSE: {
				HistoryUpdateResponse historyUpdateResponse = (HistoryUpdateResponse)theEObject;
				T result = caseHistoryUpdateResponse(historyUpdateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HISTORY_UPDATE_RESULT: {
				HistoryUpdateResult historyUpdateResult = (HistoryUpdateResult)theEObject;
				T result = caseHistoryUpdateResult(historyUpdateResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.IDENTITY_MAPPING_RULE_TYPE: {
				IdentityMappingRuleType identityMappingRuleType = (IdentityMappingRuleType)theEObject;
				T result = caseIdentityMappingRuleType(identityMappingRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.INSTANCE_NODE: {
				InstanceNode instanceNode = (InstanceNode)theEObject;
				T result = caseInstanceNode(instanceNode);
				if (result == null) result = caseNode(instanceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ISSUED_IDENTITY_TOKEN: {
				IssuedIdentityToken issuedIdentityToken = (IssuedIdentityToken)theEObject;
				T result = caseIssuedIdentityToken(issuedIdentityToken);
				if (result == null) result = caseUserIdentityToken(issuedIdentityToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE: {
				JsonDataSetReaderMessageDataType jsonDataSetReaderMessageDataType = (JsonDataSetReaderMessageDataType)theEObject;
				T result = caseJsonDataSetReaderMessageDataType(jsonDataSetReaderMessageDataType);
				if (result == null) result = caseDataSetReaderMessageDataType(jsonDataSetReaderMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE: {
				JsonDataSetWriterMessageDataType jsonDataSetWriterMessageDataType = (JsonDataSetWriterMessageDataType)theEObject;
				T result = caseJsonDataSetWriterMessageDataType(jsonDataSetWriterMessageDataType);
				if (result == null) result = caseDataSetWriterMessageDataType(jsonDataSetWriterMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JSON_WRITER_GROUP_MESSAGE_DATA_TYPE: {
				JsonWriterGroupMessageDataType jsonWriterGroupMessageDataType = (JsonWriterGroupMessageDataType)theEObject;
				T result = caseJsonWriterGroupMessageDataType(jsonWriterGroupMessageDataType);
				if (result == null) result = caseWriterGroupMessageDataType(jsonWriterGroupMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.KEY_VALUE_PAIR: {
				KeyValuePair keyValuePair = (KeyValuePair)theEObject;
				T result = caseKeyValuePair(keyValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ADD_NODES_ITEM: {
				ListOfAddNodesItem listOfAddNodesItem = (ListOfAddNodesItem)theEObject;
				T result = caseListOfAddNodesItem(listOfAddNodesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ADD_NODES_RESULT: {
				ListOfAddNodesResult listOfAddNodesResult = (ListOfAddNodesResult)theEObject;
				T result = caseListOfAddNodesResult(listOfAddNodesResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ADD_REFERENCES_ITEM: {
				ListOfAddReferencesItem listOfAddReferencesItem = (ListOfAddReferencesItem)theEObject;
				T result = caseListOfAddReferencesItem(listOfAddReferencesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ALIAS_NAME_DATA_TYPE: {
				ListOfAliasNameDataType listOfAliasNameDataType = (ListOfAliasNameDataType)theEObject;
				T result = caseListOfAliasNameDataType(listOfAliasNameDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_APPLICATION_DESCRIPTION: {
				ListOfApplicationDescription listOfApplicationDescription = (ListOfApplicationDescription)theEObject;
				T result = caseListOfApplicationDescription(listOfApplicationDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ARGUMENT: {
				ListOfArgument listOfArgument = (ListOfArgument)theEObject;
				T result = caseListOfArgument(listOfArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BOOLEAN: {
				ListOfBoolean listOfBoolean = (ListOfBoolean)theEObject;
				T result = caseListOfBoolean(listOfBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE: {
				ListOfBrokerConnectionTransportDataType listOfBrokerConnectionTransportDataType = (ListOfBrokerConnectionTransportDataType)theEObject;
				T result = caseListOfBrokerConnectionTransportDataType(listOfBrokerConnectionTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE: {
				ListOfBrokerDataSetReaderTransportDataType listOfBrokerDataSetReaderTransportDataType = (ListOfBrokerDataSetReaderTransportDataType)theEObject;
				T result = caseListOfBrokerDataSetReaderTransportDataType(listOfBrokerDataSetReaderTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE: {
				ListOfBrokerDataSetWriterTransportDataType listOfBrokerDataSetWriterTransportDataType = (ListOfBrokerDataSetWriterTransportDataType)theEObject;
				T result = caseListOfBrokerDataSetWriterTransportDataType(listOfBrokerDataSetWriterTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE: {
				ListOfBrokerTransportQualityOfService listOfBrokerTransportQualityOfService = (ListOfBrokerTransportQualityOfService)theEObject;
				T result = caseListOfBrokerTransportQualityOfService(listOfBrokerTransportQualityOfService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE: {
				ListOfBrokerWriterGroupTransportDataType listOfBrokerWriterGroupTransportDataType = (ListOfBrokerWriterGroupTransportDataType)theEObject;
				T result = caseListOfBrokerWriterGroupTransportDataType(listOfBrokerWriterGroupTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BROWSE_DESCRIPTION: {
				ListOfBrowseDescription listOfBrowseDescription = (ListOfBrowseDescription)theEObject;
				T result = caseListOfBrowseDescription(listOfBrowseDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BROWSE_PATH: {
				ListOfBrowsePath listOfBrowsePath = (ListOfBrowsePath)theEObject;
				T result = caseListOfBrowsePath(listOfBrowsePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BROWSE_PATH_RESULT: {
				ListOfBrowsePathResult listOfBrowsePathResult = (ListOfBrowsePathResult)theEObject;
				T result = caseListOfBrowsePathResult(listOfBrowsePathResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BROWSE_PATH_TARGET: {
				ListOfBrowsePathTarget listOfBrowsePathTarget = (ListOfBrowsePathTarget)theEObject;
				T result = caseListOfBrowsePathTarget(listOfBrowsePathTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BROWSE_RESULT: {
				ListOfBrowseResult listOfBrowseResult = (ListOfBrowseResult)theEObject;
				T result = caseListOfBrowseResult(listOfBrowseResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BYTE: {
				ListOfByte listOfByte = (ListOfByte)theEObject;
				T result = caseListOfByte(listOfByte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_BYTE_STRING: {
				ListOfByteString listOfByteString = (ListOfByteString)theEObject;
				T result = caseListOfByteString(listOfByteString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_CALL_METHOD_REQUEST: {
				ListOfCallMethodRequest listOfCallMethodRequest = (ListOfCallMethodRequest)theEObject;
				T result = caseListOfCallMethodRequest(listOfCallMethodRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_CALL_METHOD_RESULT: {
				ListOfCallMethodResult listOfCallMethodResult = (ListOfCallMethodResult)theEObject;
				T result = caseListOfCallMethodResult(listOfCallMethodResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_CARTESIAN_COORDINATES: {
				ListOfCartesianCoordinates listOfCartesianCoordinates = (ListOfCartesianCoordinates)theEObject;
				T result = caseListOfCartesianCoordinates(listOfCartesianCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_CONFIGURATION_VERSION_DATA_TYPE: {
				ListOfConfigurationVersionDataType listOfConfigurationVersionDataType = (ListOfConfigurationVersionDataType)theEObject;
				T result = caseListOfConfigurationVersionDataType(listOfConfigurationVersionDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE: {
				ListOfConnectionTransportDataType listOfConnectionTransportDataType = (ListOfConnectionTransportDataType)theEObject;
				T result = caseListOfConnectionTransportDataType(listOfConnectionTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_CONTENT_FILTER: {
				ListOfContentFilter listOfContentFilter = (ListOfContentFilter)theEObject;
				T result = caseListOfContentFilter(listOfContentFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT: {
				ListOfContentFilterElement listOfContentFilterElement = (ListOfContentFilterElement)theEObject;
				T result = caseListOfContentFilterElement(listOfContentFilterElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT_RESULT: {
				ListOfContentFilterElementResult listOfContentFilterElementResult = (ListOfContentFilterElementResult)theEObject;
				T result = caseListOfContentFilterElementResult(listOfContentFilterElementResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_CURRENCY_UNIT_TYPE: {
				ListOfCurrencyUnitType listOfCurrencyUnitType = (ListOfCurrencyUnitType)theEObject;
				T result = caseListOfCurrencyUnitType(listOfCurrencyUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE: {
				ListOfDatagramConnectionTransportDataType listOfDatagramConnectionTransportDataType = (ListOfDatagramConnectionTransportDataType)theEObject;
				T result = caseListOfDatagramConnectionTransportDataType(listOfDatagramConnectionTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE: {
				ListOfDatagramWriterGroupTransportDataType listOfDatagramWriterGroupTransportDataType = (ListOfDatagramWriterGroupTransportDataType)theEObject;
				T result = caseListOfDatagramWriterGroupTransportDataType(listOfDatagramWriterGroupTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_SET_FIELD_CONTENT_MASK: {
				ListOfDataSetFieldContentMask listOfDataSetFieldContentMask = (ListOfDataSetFieldContentMask)theEObject;
				T result = caseListOfDataSetFieldContentMask(listOfDataSetFieldContentMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_SET_META_DATA_TYPE: {
				ListOfDataSetMetaDataType listOfDataSetMetaDataType = (ListOfDataSetMetaDataType)theEObject;
				T result = caseListOfDataSetMetaDataType(listOfDataSetMetaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_SET_ORDERING_TYPE: {
				ListOfDataSetOrderingType listOfDataSetOrderingType = (ListOfDataSetOrderingType)theEObject;
				T result = caseListOfDataSetOrderingType(listOfDataSetOrderingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_SET_READER_DATA_TYPE: {
				ListOfDataSetReaderDataType listOfDataSetReaderDataType = (ListOfDataSetReaderDataType)theEObject;
				T result = caseListOfDataSetReaderDataType(listOfDataSetReaderDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE: {
				ListOfDataSetReaderMessageDataType listOfDataSetReaderMessageDataType = (ListOfDataSetReaderMessageDataType)theEObject;
				T result = caseListOfDataSetReaderMessageDataType(listOfDataSetReaderMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE: {
				ListOfDataSetReaderTransportDataType listOfDataSetReaderTransportDataType = (ListOfDataSetReaderTransportDataType)theEObject;
				T result = caseListOfDataSetReaderTransportDataType(listOfDataSetReaderTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_SET_WRITER_DATA_TYPE: {
				ListOfDataSetWriterDataType listOfDataSetWriterDataType = (ListOfDataSetWriterDataType)theEObject;
				T result = caseListOfDataSetWriterDataType(listOfDataSetWriterDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE: {
				ListOfDataSetWriterMessageDataType listOfDataSetWriterMessageDataType = (ListOfDataSetWriterMessageDataType)theEObject;
				T result = caseListOfDataSetWriterMessageDataType(listOfDataSetWriterMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE: {
				ListOfDataSetWriterTransportDataType listOfDataSetWriterTransportDataType = (ListOfDataSetWriterTransportDataType)theEObject;
				T result = caseListOfDataSetWriterTransportDataType(listOfDataSetWriterTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_TYPE_DEFINITION: {
				ListOfDataTypeDefinition listOfDataTypeDefinition = (ListOfDataTypeDefinition)theEObject;
				T result = caseListOfDataTypeDefinition(listOfDataTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_TYPE_DESCRIPTION: {
				ListOfDataTypeDescription listOfDataTypeDescription = (ListOfDataTypeDescription)theEObject;
				T result = caseListOfDataTypeDescription(listOfDataTypeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_TYPE_SCHEMA_HEADER: {
				ListOfDataTypeSchemaHeader listOfDataTypeSchemaHeader = (ListOfDataTypeSchemaHeader)theEObject;
				T result = caseListOfDataTypeSchemaHeader(listOfDataTypeSchemaHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATA_VALUE: {
				ListOfDataValue listOfDataValue = (ListOfDataValue)theEObject;
				T result = caseListOfDataValue(listOfDataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DATE_TIME: {
				ListOfDateTime listOfDateTime = (ListOfDateTime)theEObject;
				T result = caseListOfDateTime(listOfDateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DELETE_NODES_ITEM: {
				ListOfDeleteNodesItem listOfDeleteNodesItem = (ListOfDeleteNodesItem)theEObject;
				T result = caseListOfDeleteNodesItem(listOfDeleteNodesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DELETE_REFERENCES_ITEM: {
				ListOfDeleteReferencesItem listOfDeleteReferencesItem = (ListOfDeleteReferencesItem)theEObject;
				T result = caseListOfDeleteReferencesItem(listOfDeleteReferencesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DIAGNOSTIC_INFO: {
				ListOfDiagnosticInfo listOfDiagnosticInfo = (ListOfDiagnosticInfo)theEObject;
				T result = caseListOfDiagnosticInfo(listOfDiagnosticInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DIAGNOSTICS_LEVEL: {
				ListOfDiagnosticsLevel listOfDiagnosticsLevel = (ListOfDiagnosticsLevel)theEObject;
				T result = caseListOfDiagnosticsLevel(listOfDiagnosticsLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_DOUBLE: {
				ListOfDouble listOfDouble = (ListOfDouble)theEObject;
				T result = caseListOfDouble(listOfDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ENDPOINT_CONFIGURATION: {
				ListOfEndpointConfiguration listOfEndpointConfiguration = (ListOfEndpointConfiguration)theEObject;
				T result = caseListOfEndpointConfiguration(listOfEndpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ENDPOINT_DESCRIPTION: {
				ListOfEndpointDescription listOfEndpointDescription = (ListOfEndpointDescription)theEObject;
				T result = caseListOfEndpointDescription(listOfEndpointDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ENDPOINT_TYPE: {
				ListOfEndpointType listOfEndpointType = (ListOfEndpointType)theEObject;
				T result = caseListOfEndpointType(listOfEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE: {
				ListOfEndpointUrlListDataType listOfEndpointUrlListDataType = (ListOfEndpointUrlListDataType)theEObject;
				T result = caseListOfEndpointUrlListDataType(listOfEndpointUrlListDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ENUM_DEFINITION: {
				ListOfEnumDefinition listOfEnumDefinition = (ListOfEnumDefinition)theEObject;
				T result = caseListOfEnumDefinition(listOfEnumDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ENUM_DESCRIPTION: {
				ListOfEnumDescription listOfEnumDescription = (ListOfEnumDescription)theEObject;
				T result = caseListOfEnumDescription(listOfEnumDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ENUM_FIELD: {
				ListOfEnumField listOfEnumField = (ListOfEnumField)theEObject;
				T result = caseListOfEnumField(listOfEnumField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ENUM_VALUE_TYPE: {
				ListOfEnumValueType listOfEnumValueType = (ListOfEnumValueType)theEObject;
				T result = caseListOfEnumValueType(listOfEnumValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_EVENT_FIELD_LIST: {
				ListOfEventFieldList listOfEventFieldList = (ListOfEventFieldList)theEObject;
				T result = caseListOfEventFieldList(listOfEventFieldList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_EXPANDED_NODE_ID: {
				ListOfExpandedNodeId listOfExpandedNodeId = (ListOfExpandedNodeId)theEObject;
				T result = caseListOfExpandedNodeId(listOfExpandedNodeId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_EXTENSION_OBJECT: {
				ListOfExtensionObject listOfExtensionObject = (ListOfExtensionObject)theEObject;
				T result = caseListOfExtensionObject(listOfExtensionObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_FIELD_META_DATA: {
				ListOfFieldMetaData listOfFieldMetaData = (ListOfFieldMetaData)theEObject;
				T result = caseListOfFieldMetaData(listOfFieldMetaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_FIELD_TARGET_DATA_TYPE: {
				ListOfFieldTargetDataType listOfFieldTargetDataType = (ListOfFieldTargetDataType)theEObject;
				T result = caseListOfFieldTargetDataType(listOfFieldTargetDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_FLOAT: {
				ListOfFloat listOfFloat = (ListOfFloat)theEObject;
				T result = caseListOfFloat(listOfFloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_FRAME: {
				ListOfFrame listOfFrame = (ListOfFrame)theEObject;
				T result = caseListOfFrame(listOfFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_GENERIC_ATTRIBUTE_VALUE: {
				ListOfGenericAttributeValue listOfGenericAttributeValue = (ListOfGenericAttributeValue)theEObject;
				T result = caseListOfGenericAttributeValue(listOfGenericAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_GUID: {
				ListOfGuid listOfGuid = (ListOfGuid)theEObject;
				T result = caseListOfGuid(listOfGuid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_HISTORY_EVENT_FIELD_LIST: {
				ListOfHistoryEventFieldList listOfHistoryEventFieldList = (ListOfHistoryEventFieldList)theEObject;
				T result = caseListOfHistoryEventFieldList(listOfHistoryEventFieldList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_HISTORY_READ_RESULT: {
				ListOfHistoryReadResult listOfHistoryReadResult = (ListOfHistoryReadResult)theEObject;
				T result = caseListOfHistoryReadResult(listOfHistoryReadResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_HISTORY_READ_VALUE_ID: {
				ListOfHistoryReadValueId listOfHistoryReadValueId = (ListOfHistoryReadValueId)theEObject;
				T result = caseListOfHistoryReadValueId(listOfHistoryReadValueId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_HISTORY_UPDATE_RESULT: {
				ListOfHistoryUpdateResult listOfHistoryUpdateResult = (ListOfHistoryUpdateResult)theEObject;
				T result = caseListOfHistoryUpdateResult(listOfHistoryUpdateResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_IDENTITY_CRITERIA_TYPE: {
				ListOfIdentityCriteriaType listOfIdentityCriteriaType = (ListOfIdentityCriteriaType)theEObject;
				T result = caseListOfIdentityCriteriaType(listOfIdentityCriteriaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_IDENTITY_MAPPING_RULE_TYPE: {
				ListOfIdentityMappingRuleType listOfIdentityMappingRuleType = (ListOfIdentityMappingRuleType)theEObject;
				T result = caseListOfIdentityMappingRuleType(listOfIdentityMappingRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ID_TYPE: {
				ListOfIdType listOfIdType = (ListOfIdType)theEObject;
				T result = caseListOfIdType(listOfIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_INT16: {
				ListOfInt16 listOfInt16 = (ListOfInt16)theEObject;
				T result = caseListOfInt16(listOfInt16);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_INT32: {
				ListOfInt32 listOfInt32 = (ListOfInt32)theEObject;
				T result = caseListOfInt32(listOfInt32);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_INT64: {
				ListOfInt64 listOfInt64 = (ListOfInt64)theEObject;
				T result = caseListOfInt64(listOfInt64);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK: {
				ListOfJsonDataSetMessageContentMask listOfJsonDataSetMessageContentMask = (ListOfJsonDataSetMessageContentMask)theEObject;
				T result = caseListOfJsonDataSetMessageContentMask(listOfJsonDataSetMessageContentMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE: {
				ListOfJsonDataSetReaderMessageDataType listOfJsonDataSetReaderMessageDataType = (ListOfJsonDataSetReaderMessageDataType)theEObject;
				T result = caseListOfJsonDataSetReaderMessageDataType(listOfJsonDataSetReaderMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE: {
				ListOfJsonDataSetWriterMessageDataType listOfJsonDataSetWriterMessageDataType = (ListOfJsonDataSetWriterMessageDataType)theEObject;
				T result = caseListOfJsonDataSetWriterMessageDataType(listOfJsonDataSetWriterMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK: {
				ListOfJsonNetworkMessageContentMask listOfJsonNetworkMessageContentMask = (ListOfJsonNetworkMessageContentMask)theEObject;
				T result = caseListOfJsonNetworkMessageContentMask(listOfJsonNetworkMessageContentMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE: {
				ListOfJsonWriterGroupMessageDataType listOfJsonWriterGroupMessageDataType = (ListOfJsonWriterGroupMessageDataType)theEObject;
				T result = caseListOfJsonWriterGroupMessageDataType(listOfJsonWriterGroupMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_KEY_VALUE_PAIR: {
				ListOfKeyValuePair listOfKeyValuePair = (ListOfKeyValuePair)theEObject;
				T result = caseListOfKeyValuePair(listOfKeyValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_LOCALIZED_TEXT: {
				ListOfLocalizedText listOfLocalizedText = (ListOfLocalizedText)theEObject;
				T result = caseListOfLocalizedText(listOfLocalizedText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_MODEL_CHANGE_STRUCTURE_DATA_TYPE: {
				ListOfModelChangeStructureDataType listOfModelChangeStructureDataType = (ListOfModelChangeStructureDataType)theEObject;
				T result = caseListOfModelChangeStructureDataType(listOfModelChangeStructureDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_MODIFICATION_INFO: {
				ListOfModificationInfo listOfModificationInfo = (ListOfModificationInfo)theEObject;
				T result = caseListOfModificationInfo(listOfModificationInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_REQUEST: {
				ListOfMonitoredItemCreateRequest listOfMonitoredItemCreateRequest = (ListOfMonitoredItemCreateRequest)theEObject;
				T result = caseListOfMonitoredItemCreateRequest(listOfMonitoredItemCreateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_RESULT: {
				ListOfMonitoredItemCreateResult listOfMonitoredItemCreateResult = (ListOfMonitoredItemCreateResult)theEObject;
				T result = caseListOfMonitoredItemCreateResult(listOfMonitoredItemCreateResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_MONITORED_ITEM_MODIFY_REQUEST: {
				ListOfMonitoredItemModifyRequest listOfMonitoredItemModifyRequest = (ListOfMonitoredItemModifyRequest)theEObject;
				T result = caseListOfMonitoredItemModifyRequest(listOfMonitoredItemModifyRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_MONITORED_ITEM_MODIFY_RESULT: {
				ListOfMonitoredItemModifyResult listOfMonitoredItemModifyResult = (ListOfMonitoredItemModifyResult)theEObject;
				T result = caseListOfMonitoredItemModifyResult(listOfMonitoredItemModifyResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_MONITORED_ITEM_NOTIFICATION: {
				ListOfMonitoredItemNotification listOfMonitoredItemNotification = (ListOfMonitoredItemNotification)theEObject;
				T result = caseListOfMonitoredItemNotification(listOfMonitoredItemNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_DATA_TYPE: {
				ListOfNetworkAddressDataType listOfNetworkAddressDataType = (ListOfNetworkAddressDataType)theEObject;
				T result = caseListOfNetworkAddressDataType(listOfNetworkAddressDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE: {
				ListOfNetworkAddressUrlDataType listOfNetworkAddressUrlDataType = (ListOfNetworkAddressUrlDataType)theEObject;
				T result = caseListOfNetworkAddressUrlDataType(listOfNetworkAddressUrlDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_NETWORK_GROUP_DATA_TYPE: {
				ListOfNetworkGroupDataType listOfNetworkGroupDataType = (ListOfNetworkGroupDataType)theEObject;
				T result = caseListOfNetworkGroupDataType(listOfNetworkGroupDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_NODE: {
				ListOfNode listOfNode = (ListOfNode)theEObject;
				T result = caseListOfNode(listOfNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_NODE_ID: {
				ListOfNodeId listOfNodeId = (ListOfNodeId)theEObject;
				T result = caseListOfNodeId(listOfNodeId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_NODE_REFERENCE: {
				ListOfNodeReference listOfNodeReference = (ListOfNodeReference)theEObject;
				T result = caseListOfNodeReference(listOfNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_NODE_TYPE_DESCRIPTION: {
				ListOfNodeTypeDescription listOfNodeTypeDescription = (ListOfNodeTypeDescription)theEObject;
				T result = caseListOfNodeTypeDescription(listOfNodeTypeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_OPEN_FILE_MODE: {
				ListOfOpenFileMode listOfOpenFileMode = (ListOfOpenFileMode)theEObject;
				T result = caseListOfOpenFileMode(listOfOpenFileMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_OPTION_SET: {
				ListOfOptionSet listOfOptionSet = (ListOfOptionSet)theEObject;
				T result = caseListOfOptionSet(listOfOptionSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ORIENTATION: {
				ListOfOrientation listOfOrientation = (ListOfOrientation)theEObject;
				T result = caseListOfOrientation(listOfOrientation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_OVERRIDE_VALUE_HANDLING: {
				ListOfOverrideValueHandling listOfOverrideValueHandling = (ListOfOverrideValueHandling)theEObject;
				T result = caseListOfOverrideValueHandling(listOfOverrideValueHandling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PARSING_RESULT: {
				ListOfParsingResult listOfParsingResult = (ListOfParsingResult)theEObject;
				T result = caseListOfParsingResult(listOfParsingResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE: {
				ListOfPublishedDataItemsDataType listOfPublishedDataItemsDataType = (ListOfPublishedDataItemsDataType)theEObject;
				T result = caseListOfPublishedDataItemsDataType(listOfPublishedDataItemsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE: {
				ListOfPublishedDataSetDataType listOfPublishedDataSetDataType = (ListOfPublishedDataSetDataType)theEObject;
				T result = caseListOfPublishedDataSetDataType(listOfPublishedDataSetDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE: {
				ListOfPublishedDataSetSourceDataType listOfPublishedDataSetSourceDataType = (ListOfPublishedDataSetSourceDataType)theEObject;
				T result = caseListOfPublishedDataSetSourceDataType(listOfPublishedDataSetSourceDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PUBLISHED_EVENTS_DATA_TYPE: {
				ListOfPublishedEventsDataType listOfPublishedEventsDataType = (ListOfPublishedEventsDataType)theEObject;
				T result = caseListOfPublishedEventsDataType(listOfPublishedEventsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PUBLISHED_VARIABLE_DATA_TYPE: {
				ListOfPublishedVariableDataType listOfPublishedVariableDataType = (ListOfPublishedVariableDataType)theEObject;
				T result = caseListOfPublishedVariableDataType(listOfPublishedVariableDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE: {
				ListOfPubSubConfigurationDataType listOfPubSubConfigurationDataType = (ListOfPubSubConfigurationDataType)theEObject;
				T result = caseListOfPubSubConfigurationDataType(listOfPubSubConfigurationDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE: {
				ListOfPubSubConnectionDataType listOfPubSubConnectionDataType = (ListOfPubSubConnectionDataType)theEObject;
				T result = caseListOfPubSubConnectionDataType(listOfPubSubConnectionDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION: {
				ListOfPubSubDiagnosticsCounterClassification listOfPubSubDiagnosticsCounterClassification = (ListOfPubSubDiagnosticsCounterClassification)theEObject;
				T result = caseListOfPubSubDiagnosticsCounterClassification(listOfPubSubDiagnosticsCounterClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PUB_SUB_GROUP_DATA_TYPE: {
				ListOfPubSubGroupDataType listOfPubSubGroupDataType = (ListOfPubSubGroupDataType)theEObject;
				T result = caseListOfPubSubGroupDataType(listOfPubSubGroupDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_PUB_SUB_STATE: {
				ListOfPubSubState listOfPubSubState = (ListOfPubSubState)theEObject;
				T result = caseListOfPubSubState(listOfPubSubState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_QUALIFIED_NAME: {
				ListOfQualifiedName listOfQualifiedName = (ListOfQualifiedName)theEObject;
				T result = caseListOfQualifiedName(listOfQualifiedName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_QUERY_DATA_DESCRIPTION: {
				ListOfQueryDataDescription listOfQueryDataDescription = (ListOfQueryDataDescription)theEObject;
				T result = caseListOfQueryDataDescription(listOfQueryDataDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_QUERY_DATA_SET: {
				ListOfQueryDataSet listOfQueryDataSet = (ListOfQueryDataSet)theEObject;
				T result = caseListOfQueryDataSet(listOfQueryDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_RATIONAL_NUMBER: {
				ListOfRationalNumber listOfRationalNumber = (ListOfRationalNumber)theEObject;
				T result = caseListOfRationalNumber(listOfRationalNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_READER_GROUP_DATA_TYPE: {
				ListOfReaderGroupDataType listOfReaderGroupDataType = (ListOfReaderGroupDataType)theEObject;
				T result = caseListOfReaderGroupDataType(listOfReaderGroupDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE: {
				ListOfReaderGroupMessageDataType listOfReaderGroupMessageDataType = (ListOfReaderGroupMessageDataType)theEObject;
				T result = caseListOfReaderGroupMessageDataType(listOfReaderGroupMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE: {
				ListOfReaderGroupTransportDataType listOfReaderGroupTransportDataType = (ListOfReaderGroupTransportDataType)theEObject;
				T result = caseListOfReaderGroupTransportDataType(listOfReaderGroupTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_READ_VALUE_ID: {
				ListOfReadValueId listOfReadValueId = (ListOfReadValueId)theEObject;
				T result = caseListOfReadValueId(listOfReadValueId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_REDUNDANT_SERVER_DATA_TYPE: {
				ListOfRedundantServerDataType listOfRedundantServerDataType = (ListOfRedundantServerDataType)theEObject;
				T result = caseListOfRedundantServerDataType(listOfRedundantServerDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_REFERENCE_DESCRIPTION: {
				ListOfReferenceDescription listOfReferenceDescription = (ListOfReferenceDescription)theEObject;
				T result = caseListOfReferenceDescription(listOfReferenceDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_REFERENCE_NODE: {
				ListOfReferenceNode listOfReferenceNode = (ListOfReferenceNode)theEObject;
				T result = caseListOfReferenceNode(listOfReferenceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_REGISTERED_SERVER: {
				ListOfRegisteredServer listOfRegisteredServer = (ListOfRegisteredServer)theEObject;
				T result = caseListOfRegisteredServer(listOfRegisteredServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_RELATIVE_PATH_ELEMENT: {
				ListOfRelativePathElement listOfRelativePathElement = (ListOfRelativePathElement)theEObject;
				T result = caseListOfRelativePathElement(listOfRelativePathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_ROLE_PERMISSION_TYPE: {
				ListOfRolePermissionType listOfRolePermissionType = (ListOfRolePermissionType)theEObject;
				T result = caseListOfRolePermissionType(listOfRolePermissionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE: {
				ListOfSamplingIntervalDiagnosticsDataType listOfSamplingIntervalDiagnosticsDataType = (ListOfSamplingIntervalDiagnosticsDataType)theEObject;
				T result = caseListOfSamplingIntervalDiagnosticsDataType(listOfSamplingIntervalDiagnosticsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SBYTE: {
				ListOfSByte listOfSByte = (ListOfSByte)theEObject;
				T result = caseListOfSByte(listOfSByte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE: {
				ListOfSemanticChangeStructureDataType listOfSemanticChangeStructureDataType = (ListOfSemanticChangeStructureDataType)theEObject;
				T result = caseListOfSemanticChangeStructureDataType(listOfSemanticChangeStructureDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SERVER_ON_NETWORK: {
				ListOfServerOnNetwork listOfServerOnNetwork = (ListOfServerOnNetwork)theEObject;
				T result = caseListOfServerOnNetwork(listOfServerOnNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE: {
				ListOfSessionDiagnosticsDataType listOfSessionDiagnosticsDataType = (ListOfSessionDiagnosticsDataType)theEObject;
				T result = caseListOfSessionDiagnosticsDataType(listOfSessionDiagnosticsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE: {
				ListOfSessionSecurityDiagnosticsDataType listOfSessionSecurityDiagnosticsDataType = (ListOfSessionSecurityDiagnosticsDataType)theEObject;
				T result = caseListOfSessionSecurityDiagnosticsDataType(listOfSessionSecurityDiagnosticsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SIGNED_SOFTWARE_CERTIFICATE: {
				ListOfSignedSoftwareCertificate listOfSignedSoftwareCertificate = (ListOfSignedSoftwareCertificate)theEObject;
				T result = caseListOfSignedSoftwareCertificate(listOfSignedSoftwareCertificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SIMPLE_ATTRIBUTE_OPERAND: {
				ListOfSimpleAttributeOperand listOfSimpleAttributeOperand = (ListOfSimpleAttributeOperand)theEObject;
				T result = caseListOfSimpleAttributeOperand(listOfSimpleAttributeOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SIMPLE_TYPE_DESCRIPTION: {
				ListOfSimpleTypeDescription listOfSimpleTypeDescription = (ListOfSimpleTypeDescription)theEObject;
				T result = caseListOfSimpleTypeDescription(listOfSimpleTypeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_STATUS_CODE: {
				ListOfStatusCode listOfStatusCode = (ListOfStatusCode)theEObject;
				T result = caseListOfStatusCode(listOfStatusCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_STATUS_RESULT: {
				ListOfStatusResult listOfStatusResult = (ListOfStatusResult)theEObject;
				T result = caseListOfStatusResult(listOfStatusResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_STRING: {
				ListOfString listOfString = (ListOfString)theEObject;
				T result = caseListOfString(listOfString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_STRUCTURE_DEFINITION: {
				ListOfStructureDefinition listOfStructureDefinition = (ListOfStructureDefinition)theEObject;
				T result = caseListOfStructureDefinition(listOfStructureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_STRUCTURE_DESCRIPTION: {
				ListOfStructureDescription listOfStructureDescription = (ListOfStructureDescription)theEObject;
				T result = caseListOfStructureDescription(listOfStructureDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_STRUCTURE_FIELD: {
				ListOfStructureField listOfStructureField = (ListOfStructureField)theEObject;
				T result = caseListOfStructureField(listOfStructureField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE: {
				ListOfSubscribedDataSetDataType listOfSubscribedDataSetDataType = (ListOfSubscribedDataSetDataType)theEObject;
				T result = caseListOfSubscribedDataSetDataType(listOfSubscribedDataSetDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE: {
				ListOfSubscribedDataSetMirrorDataType listOfSubscribedDataSetMirrorDataType = (ListOfSubscribedDataSetMirrorDataType)theEObject;
				T result = caseListOfSubscribedDataSetMirrorDataType(listOfSubscribedDataSetMirrorDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT: {
				ListOfSubscriptionAcknowledgement listOfSubscriptionAcknowledgement = (ListOfSubscriptionAcknowledgement)theEObject;
				T result = caseListOfSubscriptionAcknowledgement(listOfSubscriptionAcknowledgement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE: {
				ListOfSubscriptionDiagnosticsDataType listOfSubscriptionDiagnosticsDataType = (ListOfSubscriptionDiagnosticsDataType)theEObject;
				T result = caseListOfSubscriptionDiagnosticsDataType(listOfSubscriptionDiagnosticsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_TARGET_VARIABLES_DATA_TYPE: {
				ListOfTargetVariablesDataType listOfTargetVariablesDataType = (ListOfTargetVariablesDataType)theEObject;
				T result = caseListOfTargetVariablesDataType(listOfTargetVariablesDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_THREE_DCARTESIAN_COORDINATES: {
				ListOfThreeDCartesianCoordinates listOfThreeDCartesianCoordinates = (ListOfThreeDCartesianCoordinates)theEObject;
				T result = caseListOfThreeDCartesianCoordinates(listOfThreeDCartesianCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_THREE_DFRAME: {
				ListOfThreeDFrame listOfThreeDFrame = (ListOfThreeDFrame)theEObject;
				T result = caseListOfThreeDFrame(listOfThreeDFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_THREE_DORIENTATION: {
				ListOfThreeDOrientation listOfThreeDOrientation = (ListOfThreeDOrientation)theEObject;
				T result = caseListOfThreeDOrientation(listOfThreeDOrientation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_THREE_DVECTOR: {
				ListOfThreeDVector listOfThreeDVector = (ListOfThreeDVector)theEObject;
				T result = caseListOfThreeDVector(listOfThreeDVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_TIME_ZONE_DATA_TYPE: {
				ListOfTimeZoneDataType listOfTimeZoneDataType = (ListOfTimeZoneDataType)theEObject;
				T result = caseListOfTimeZoneDataType(listOfTimeZoneDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_TRANSFER_RESULT: {
				ListOfTransferResult listOfTransferResult = (ListOfTransferResult)theEObject;
				T result = caseListOfTransferResult(listOfTransferResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_TRUST_LIST_DATA_TYPE: {
				ListOfTrustListDataType listOfTrustListDataType = (ListOfTrustListDataType)theEObject;
				T result = caseListOfTrustListDataType(listOfTrustListDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_UA_BINARY_FILE_DATA_TYPE: {
				ListOfUABinaryFileDataType listOfUABinaryFileDataType = (ListOfUABinaryFileDataType)theEObject;
				T result = caseListOfUABinaryFileDataType(listOfUABinaryFileDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_UADP_DATA_SET_MESSAGE_CONTENT_MASK: {
				ListOfUadpDataSetMessageContentMask listOfUadpDataSetMessageContentMask = (ListOfUadpDataSetMessageContentMask)theEObject;
				T result = caseListOfUadpDataSetMessageContentMask(listOfUadpDataSetMessageContentMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE: {
				ListOfUadpDataSetReaderMessageDataType listOfUadpDataSetReaderMessageDataType = (ListOfUadpDataSetReaderMessageDataType)theEObject;
				T result = caseListOfUadpDataSetReaderMessageDataType(listOfUadpDataSetReaderMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE: {
				ListOfUadpDataSetWriterMessageDataType listOfUadpDataSetWriterMessageDataType = (ListOfUadpDataSetWriterMessageDataType)theEObject;
				T result = caseListOfUadpDataSetWriterMessageDataType(listOfUadpDataSetWriterMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK: {
				ListOfUadpNetworkMessageContentMask listOfUadpNetworkMessageContentMask = (ListOfUadpNetworkMessageContentMask)theEObject;
				T result = caseListOfUadpNetworkMessageContentMask(listOfUadpNetworkMessageContentMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE: {
				ListOfUadpWriterGroupMessageDataType listOfUadpWriterGroupMessageDataType = (ListOfUadpWriterGroupMessageDataType)theEObject;
				T result = caseListOfUadpWriterGroupMessageDataType(listOfUadpWriterGroupMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_UINT16: {
				ListOfUInt16 listOfUInt16 = (ListOfUInt16)theEObject;
				T result = caseListOfUInt16(listOfUInt16);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_UINT32: {
				ListOfUInt32 listOfUInt32 = (ListOfUInt32)theEObject;
				T result = caseListOfUInt32(listOfUInt32);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_UINT64: {
				ListOfUInt64 listOfUInt64 = (ListOfUInt64)theEObject;
				T result = caseListOfUInt64(listOfUInt64);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_UNION: {
				ListOfUnion listOfUnion = (ListOfUnion)theEObject;
				T result = caseListOfUnion(listOfUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_USER_TOKEN_POLICY: {
				ListOfUserTokenPolicy listOfUserTokenPolicy = (ListOfUserTokenPolicy)theEObject;
				T result = caseListOfUserTokenPolicy(listOfUserTokenPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_VARIANT: {
				ListOfVariant listOfVariant = (ListOfVariant)theEObject;
				T result = caseListOfVariant(listOfVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_VECTOR: {
				ListOfVector listOfVector = (ListOfVector)theEObject;
				T result = caseListOfVector(listOfVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_WRITER_GROUP_DATA_TYPE: {
				ListOfWriterGroupDataType listOfWriterGroupDataType = (ListOfWriterGroupDataType)theEObject;
				T result = caseListOfWriterGroupDataType(listOfWriterGroupDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE: {
				ListOfWriterGroupMessageDataType listOfWriterGroupMessageDataType = (ListOfWriterGroupMessageDataType)theEObject;
				T result = caseListOfWriterGroupMessageDataType(listOfWriterGroupMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE: {
				ListOfWriterGroupTransportDataType listOfWriterGroupTransportDataType = (ListOfWriterGroupTransportDataType)theEObject;
				T result = caseListOfWriterGroupTransportDataType(listOfWriterGroupTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_WRITE_VALUE: {
				ListOfWriteValue listOfWriteValue = (ListOfWriteValue)theEObject;
				T result = caseListOfWriteValue(listOfWriteValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LIST_OF_XML_ELEMENT: {
				ListOfXmlElement listOfXmlElement = (ListOfXmlElement)theEObject;
				T result = caseListOfXmlElement(listOfXmlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LITERAL_OPERAND: {
				LiteralOperand literalOperand = (LiteralOperand)theEObject;
				T result = caseLiteralOperand(literalOperand);
				if (result == null) result = caseFilterOperand(literalOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LOCALIZED_TEXT: {
				LocalizedText localizedText = (LocalizedText)theEObject;
				T result = caseLocalizedText(localizedText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION: {
				MdnsDiscoveryConfiguration mdnsDiscoveryConfiguration = (MdnsDiscoveryConfiguration)theEObject;
				T result = caseMdnsDiscoveryConfiguration(mdnsDiscoveryConfiguration);
				if (result == null) result = caseDiscoveryConfiguration(mdnsDiscoveryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.METHOD_ATTRIBUTES: {
				MethodAttributes methodAttributes = (MethodAttributes)theEObject;
				T result = caseMethodAttributes(methodAttributes);
				if (result == null) result = caseNodeAttributes(methodAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.METHOD_NODE: {
				MethodNode methodNode = (MethodNode)theEObject;
				T result = caseMethodNode(methodNode);
				if (result == null) result = caseInstanceNode(methodNode);
				if (result == null) result = caseNode(methodNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE: {
				ModelChangeStructureDataType modelChangeStructureDataType = (ModelChangeStructureDataType)theEObject;
				T result = caseModelChangeStructureDataType(modelChangeStructureDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MODIFICATION_INFO: {
				ModificationInfo modificationInfo = (ModificationInfo)theEObject;
				T result = caseModificationInfo(modificationInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST: {
				ModifyMonitoredItemsRequest modifyMonitoredItemsRequest = (ModifyMonitoredItemsRequest)theEObject;
				T result = caseModifyMonitoredItemsRequest(modifyMonitoredItemsRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MODIFY_MONITORED_ITEMS_RESPONSE: {
				ModifyMonitoredItemsResponse modifyMonitoredItemsResponse = (ModifyMonitoredItemsResponse)theEObject;
				T result = caseModifyMonitoredItemsResponse(modifyMonitoredItemsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST: {
				ModifySubscriptionRequest modifySubscriptionRequest = (ModifySubscriptionRequest)theEObject;
				T result = caseModifySubscriptionRequest(modifySubscriptionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE: {
				ModifySubscriptionResponse modifySubscriptionResponse = (ModifySubscriptionResponse)theEObject;
				T result = caseModifySubscriptionResponse(modifySubscriptionResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST: {
				MonitoredItemCreateRequest monitoredItemCreateRequest = (MonitoredItemCreateRequest)theEObject;
				T result = caseMonitoredItemCreateRequest(monitoredItemCreateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MONITORED_ITEM_CREATE_RESULT: {
				MonitoredItemCreateResult monitoredItemCreateResult = (MonitoredItemCreateResult)theEObject;
				T result = caseMonitoredItemCreateResult(monitoredItemCreateResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST: {
				MonitoredItemModifyRequest monitoredItemModifyRequest = (MonitoredItemModifyRequest)theEObject;
				T result = caseMonitoredItemModifyRequest(monitoredItemModifyRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT: {
				MonitoredItemModifyResult monitoredItemModifyResult = (MonitoredItemModifyResult)theEObject;
				T result = caseMonitoredItemModifyResult(monitoredItemModifyResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MONITORED_ITEM_NOTIFICATION: {
				MonitoredItemNotification monitoredItemNotification = (MonitoredItemNotification)theEObject;
				T result = caseMonitoredItemNotification(monitoredItemNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MONITORING_FILTER: {
				MonitoringFilter monitoringFilter = (MonitoringFilter)theEObject;
				T result = caseMonitoringFilter(monitoringFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MONITORING_FILTER_RESULT: {
				MonitoringFilterResult monitoringFilterResult = (MonitoringFilterResult)theEObject;
				T result = caseMonitoringFilterResult(monitoringFilterResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MONITORING_PARAMETERS: {
				MonitoringParameters monitoringParameters = (MonitoringParameters)theEObject;
				T result = caseMonitoringParameters(monitoringParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NETWORK_ADDRESS_DATA_TYPE: {
				NetworkAddressDataType networkAddressDataType = (NetworkAddressDataType)theEObject;
				T result = caseNetworkAddressDataType(networkAddressDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NETWORK_ADDRESS_URL_DATA_TYPE: {
				NetworkAddressUrlDataType networkAddressUrlDataType = (NetworkAddressUrlDataType)theEObject;
				T result = caseNetworkAddressUrlDataType(networkAddressUrlDataType);
				if (result == null) result = caseNetworkAddressDataType(networkAddressUrlDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NETWORK_GROUP_DATA_TYPE: {
				NetworkGroupDataType networkGroupDataType = (NetworkGroupDataType)theEObject;
				T result = caseNetworkGroupDataType(networkGroupDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NODE_ATTRIBUTES: {
				NodeAttributes nodeAttributes = (NodeAttributes)theEObject;
				T result = caseNodeAttributes(nodeAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NODE_ID: {
				NodeId nodeId = (NodeId)theEObject;
				T result = caseNodeId(nodeId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NODE_REFERENCE: {
				NodeReference nodeReference = (NodeReference)theEObject;
				T result = caseNodeReference(nodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NODE_TYPE_DESCRIPTION: {
				NodeTypeDescription nodeTypeDescription = (NodeTypeDescription)theEObject;
				T result = caseNodeTypeDescription(nodeTypeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NOTIFICATION_DATA: {
				NotificationData notificationData = (NotificationData)theEObject;
				T result = caseNotificationData(notificationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NOTIFICATION_MESSAGE: {
				NotificationMessage notificationMessage = (NotificationMessage)theEObject;
				T result = caseNotificationMessage(notificationMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OBJECT_ATTRIBUTES: {
				ObjectAttributes objectAttributes = (ObjectAttributes)theEObject;
				T result = caseObjectAttributes(objectAttributes);
				if (result == null) result = caseNodeAttributes(objectAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OBJECT_NODE: {
				ObjectNode objectNode = (ObjectNode)theEObject;
				T result = caseObjectNode(objectNode);
				if (result == null) result = caseInstanceNode(objectNode);
				if (result == null) result = caseNode(objectNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OBJECT_TYPE_ATTRIBUTES: {
				ObjectTypeAttributes objectTypeAttributes = (ObjectTypeAttributes)theEObject;
				T result = caseObjectTypeAttributes(objectTypeAttributes);
				if (result == null) result = caseNodeAttributes(objectTypeAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OBJECT_TYPE_NODE: {
				ObjectTypeNode objectTypeNode = (ObjectTypeNode)theEObject;
				T result = caseObjectTypeNode(objectTypeNode);
				if (result == null) result = caseTypeNode(objectTypeNode);
				if (result == null) result = caseNode(objectTypeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST: {
				OpenSecureChannelRequest openSecureChannelRequest = (OpenSecureChannelRequest)theEObject;
				T result = caseOpenSecureChannelRequest(openSecureChannelRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE: {
				OpenSecureChannelResponse openSecureChannelResponse = (OpenSecureChannelResponse)theEObject;
				T result = caseOpenSecureChannelResponse(openSecureChannelResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OPTION_SET: {
				OptionSet optionSet = (OptionSet)theEObject;
				T result = caseOptionSet(optionSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ORIENTATION: {
				Orientation orientation = (Orientation)theEObject;
				T result = caseOrientation(orientation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PARSING_RESULT: {
				ParsingResult parsingResult = (ParsingResult)theEObject;
				T result = caseParsingResult(parsingResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE: {
				ProgramDiagnostic2DataType programDiagnostic2DataType = (ProgramDiagnostic2DataType)theEObject;
				T result = caseProgramDiagnostic2DataType(programDiagnostic2DataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE: {
				ProgramDiagnosticDataType programDiagnosticDataType = (ProgramDiagnosticDataType)theEObject;
				T result = caseProgramDiagnosticDataType(programDiagnosticDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE: {
				PublishedDataItemsDataType publishedDataItemsDataType = (PublishedDataItemsDataType)theEObject;
				T result = casePublishedDataItemsDataType(publishedDataItemsDataType);
				if (result == null) result = casePublishedDataSetSourceDataType(publishedDataItemsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE: {
				PublishedDataSetDataType publishedDataSetDataType = (PublishedDataSetDataType)theEObject;
				T result = casePublishedDataSetDataType(publishedDataSetDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PUBLISHED_DATA_SET_SOURCE_DATA_TYPE: {
				PublishedDataSetSourceDataType publishedDataSetSourceDataType = (PublishedDataSetSourceDataType)theEObject;
				T result = casePublishedDataSetSourceDataType(publishedDataSetSourceDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE: {
				PublishedEventsDataType publishedEventsDataType = (PublishedEventsDataType)theEObject;
				T result = casePublishedEventsDataType(publishedEventsDataType);
				if (result == null) result = casePublishedDataSetSourceDataType(publishedEventsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE: {
				PublishedVariableDataType publishedVariableDataType = (PublishedVariableDataType)theEObject;
				T result = casePublishedVariableDataType(publishedVariableDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PUBLISH_REQUEST: {
				PublishRequest publishRequest = (PublishRequest)theEObject;
				T result = casePublishRequest(publishRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PUBLISH_RESPONSE: {
				PublishResponse publishResponse = (PublishResponse)theEObject;
				T result = casePublishResponse(publishResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE: {
				PubSubConfigurationDataType pubSubConfigurationDataType = (PubSubConfigurationDataType)theEObject;
				T result = casePubSubConfigurationDataType(pubSubConfigurationDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE: {
				PubSubConnectionDataType pubSubConnectionDataType = (PubSubConnectionDataType)theEObject;
				T result = casePubSubConnectionDataType(pubSubConnectionDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE: {
				PubSubGroupDataType pubSubGroupDataType = (PubSubGroupDataType)theEObject;
				T result = casePubSubGroupDataType(pubSubGroupDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.QUALIFIED_NAME: {
				QualifiedName qualifiedName = (QualifiedName)theEObject;
				T result = caseQualifiedName(qualifiedName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.QUERY_DATA_DESCRIPTION: {
				QueryDataDescription queryDataDescription = (QueryDataDescription)theEObject;
				T result = caseQueryDataDescription(queryDataDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.QUERY_DATA_SET: {
				QueryDataSet queryDataSet = (QueryDataSet)theEObject;
				T result = caseQueryDataSet(queryDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.QUERY_FIRST_REQUEST: {
				QueryFirstRequest queryFirstRequest = (QueryFirstRequest)theEObject;
				T result = caseQueryFirstRequest(queryFirstRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.QUERY_FIRST_RESPONSE: {
				QueryFirstResponse queryFirstResponse = (QueryFirstResponse)theEObject;
				T result = caseQueryFirstResponse(queryFirstResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.QUERY_NEXT_REQUEST: {
				QueryNextRequest queryNextRequest = (QueryNextRequest)theEObject;
				T result = caseQueryNextRequest(queryNextRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.QUERY_NEXT_RESPONSE: {
				QueryNextResponse queryNextResponse = (QueryNextResponse)theEObject;
				T result = caseQueryNextResponse(queryNextResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.RATIONAL_NUMBER: {
				RationalNumber rationalNumber = (RationalNumber)theEObject;
				T result = caseRationalNumber(rationalNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READ_ANNOTATION_DATA_DETAILS: {
				ReadAnnotationDataDetails readAnnotationDataDetails = (ReadAnnotationDataDetails)theEObject;
				T result = caseReadAnnotationDataDetails(readAnnotationDataDetails);
				if (result == null) result = caseHistoryReadDetails(readAnnotationDataDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READ_AT_TIME_DETAILS: {
				ReadAtTimeDetails readAtTimeDetails = (ReadAtTimeDetails)theEObject;
				T result = caseReadAtTimeDetails(readAtTimeDetails);
				if (result == null) result = caseHistoryReadDetails(readAtTimeDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READER_GROUP_DATA_TYPE: {
				ReaderGroupDataType readerGroupDataType = (ReaderGroupDataType)theEObject;
				T result = caseReaderGroupDataType(readerGroupDataType);
				if (result == null) result = casePubSubGroupDataType(readerGroupDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READER_GROUP_MESSAGE_DATA_TYPE: {
				ReaderGroupMessageDataType readerGroupMessageDataType = (ReaderGroupMessageDataType)theEObject;
				T result = caseReaderGroupMessageDataType(readerGroupMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READER_GROUP_TRANSPORT_DATA_TYPE: {
				ReaderGroupTransportDataType readerGroupTransportDataType = (ReaderGroupTransportDataType)theEObject;
				T result = caseReaderGroupTransportDataType(readerGroupTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READ_EVENT_DETAILS: {
				ReadEventDetails readEventDetails = (ReadEventDetails)theEObject;
				T result = caseReadEventDetails(readEventDetails);
				if (result == null) result = caseHistoryReadDetails(readEventDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READ_PROCESSED_DETAILS: {
				ReadProcessedDetails readProcessedDetails = (ReadProcessedDetails)theEObject;
				T result = caseReadProcessedDetails(readProcessedDetails);
				if (result == null) result = caseHistoryReadDetails(readProcessedDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READ_RAW_MODIFIED_DETAILS: {
				ReadRawModifiedDetails readRawModifiedDetails = (ReadRawModifiedDetails)theEObject;
				T result = caseReadRawModifiedDetails(readRawModifiedDetails);
				if (result == null) result = caseHistoryReadDetails(readRawModifiedDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READ_REQUEST: {
				ReadRequest readRequest = (ReadRequest)theEObject;
				T result = caseReadRequest(readRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READ_RESPONSE: {
				ReadResponse readResponse = (ReadResponse)theEObject;
				T result = caseReadResponse(readResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.READ_VALUE_ID: {
				ReadValueId readValueId = (ReadValueId)theEObject;
				T result = caseReadValueId(readValueId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE: {
				RedundantServerDataType redundantServerDataType = (RedundantServerDataType)theEObject;
				T result = caseRedundantServerDataType(redundantServerDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REFERENCE_DESCRIPTION: {
				ReferenceDescription referenceDescription = (ReferenceDescription)theEObject;
				T result = caseReferenceDescription(referenceDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REFERENCE_NODE: {
				ReferenceNode referenceNode = (ReferenceNode)theEObject;
				T result = caseReferenceNode(referenceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REFERENCE_TYPE_ATTRIBUTES: {
				ReferenceTypeAttributes referenceTypeAttributes = (ReferenceTypeAttributes)theEObject;
				T result = caseReferenceTypeAttributes(referenceTypeAttributes);
				if (result == null) result = caseNodeAttributes(referenceTypeAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REFERENCE_TYPE_NODE: {
				ReferenceTypeNode referenceTypeNode = (ReferenceTypeNode)theEObject;
				T result = caseReferenceTypeNode(referenceTypeNode);
				if (result == null) result = caseTypeNode(referenceTypeNode);
				if (result == null) result = caseNode(referenceTypeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REGISTERED_SERVER: {
				RegisteredServer registeredServer = (RegisteredServer)theEObject;
				T result = caseRegisteredServer(registeredServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REGISTER_NODES_REQUEST: {
				RegisterNodesRequest registerNodesRequest = (RegisterNodesRequest)theEObject;
				T result = caseRegisterNodesRequest(registerNodesRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REGISTER_NODES_RESPONSE: {
				RegisterNodesResponse registerNodesResponse = (RegisterNodesResponse)theEObject;
				T result = caseRegisterNodesResponse(registerNodesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REGISTER_SERVER2_REQUEST: {
				RegisterServer2Request registerServer2Request = (RegisterServer2Request)theEObject;
				T result = caseRegisterServer2Request(registerServer2Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REGISTER_SERVER2_RESPONSE: {
				RegisterServer2Response registerServer2Response = (RegisterServer2Response)theEObject;
				T result = caseRegisterServer2Response(registerServer2Response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REGISTER_SERVER_REQUEST: {
				RegisterServerRequest registerServerRequest = (RegisterServerRequest)theEObject;
				T result = caseRegisterServerRequest(registerServerRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REGISTER_SERVER_RESPONSE: {
				RegisterServerResponse registerServerResponse = (RegisterServerResponse)theEObject;
				T result = caseRegisterServerResponse(registerServerResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.RELATIVE_PATH: {
				RelativePath relativePath = (RelativePath)theEObject;
				T result = caseRelativePath(relativePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.RELATIVE_PATH_ELEMENT: {
				RelativePathElement relativePathElement = (RelativePathElement)theEObject;
				T result = caseRelativePathElement(relativePathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REPUBLISH_REQUEST: {
				RepublishRequest republishRequest = (RepublishRequest)theEObject;
				T result = caseRepublishRequest(republishRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REPUBLISH_RESPONSE: {
				RepublishResponse republishResponse = (RepublishResponse)theEObject;
				T result = caseRepublishResponse(republishResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REQUEST_HEADER: {
				RequestHeader requestHeader = (RequestHeader)theEObject;
				T result = caseRequestHeader(requestHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.RESPONSE_HEADER: {
				ResponseHeader responseHeader = (ResponseHeader)theEObject;
				T result = caseResponseHeader(responseHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ROLE_PERMISSION_TYPE: {
				RolePermissionType rolePermissionType = (RolePermissionType)theEObject;
				T result = caseRolePermissionType(rolePermissionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE: {
				SamplingIntervalDiagnosticsDataType samplingIntervalDiagnosticsDataType = (SamplingIntervalDiagnosticsDataType)theEObject;
				T result = caseSamplingIntervalDiagnosticsDataType(samplingIntervalDiagnosticsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE: {
				SemanticChangeStructureDataType semanticChangeStructureDataType = (SemanticChangeStructureDataType)theEObject;
				T result = caseSemanticChangeStructureDataType(semanticChangeStructureDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE: {
				ServerDiagnosticsSummaryDataType serverDiagnosticsSummaryDataType = (ServerDiagnosticsSummaryDataType)theEObject;
				T result = caseServerDiagnosticsSummaryDataType(serverDiagnosticsSummaryDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SERVER_ON_NETWORK: {
				ServerOnNetwork serverOnNetwork = (ServerOnNetwork)theEObject;
				T result = caseServerOnNetwork(serverOnNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SERVER_STATUS_DATA_TYPE: {
				ServerStatusDataType serverStatusDataType = (ServerStatusDataType)theEObject;
				T result = caseServerStatusDataType(serverStatusDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SERVICE_COUNTER_DATA_TYPE: {
				ServiceCounterDataType serviceCounterDataType = (ServiceCounterDataType)theEObject;
				T result = caseServiceCounterDataType(serviceCounterDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SERVICE_FAULT: {
				ServiceFault serviceFault = (ServiceFault)theEObject;
				T result = caseServiceFault(serviceFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE: {
				SessionDiagnosticsDataType sessionDiagnosticsDataType = (SessionDiagnosticsDataType)theEObject;
				T result = caseSessionDiagnosticsDataType(sessionDiagnosticsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SESSIONLESS_INVOKE_REQUEST_TYPE: {
				SessionlessInvokeRequestType sessionlessInvokeRequestType = (SessionlessInvokeRequestType)theEObject;
				T result = caseSessionlessInvokeRequestType(sessionlessInvokeRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SESSIONLESS_INVOKE_RESPONSE_TYPE: {
				SessionlessInvokeResponseType sessionlessInvokeResponseType = (SessionlessInvokeResponseType)theEObject;
				T result = caseSessionlessInvokeResponseType(sessionlessInvokeResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE: {
				SessionSecurityDiagnosticsDataType sessionSecurityDiagnosticsDataType = (SessionSecurityDiagnosticsDataType)theEObject;
				T result = caseSessionSecurityDiagnosticsDataType(sessionSecurityDiagnosticsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SET_MONITORING_MODE_REQUEST: {
				SetMonitoringModeRequest setMonitoringModeRequest = (SetMonitoringModeRequest)theEObject;
				T result = caseSetMonitoringModeRequest(setMonitoringModeRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SET_MONITORING_MODE_RESPONSE: {
				SetMonitoringModeResponse setMonitoringModeResponse = (SetMonitoringModeResponse)theEObject;
				T result = caseSetMonitoringModeResponse(setMonitoringModeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SET_PUBLISHING_MODE_REQUEST: {
				SetPublishingModeRequest setPublishingModeRequest = (SetPublishingModeRequest)theEObject;
				T result = caseSetPublishingModeRequest(setPublishingModeRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SET_PUBLISHING_MODE_RESPONSE: {
				SetPublishingModeResponse setPublishingModeResponse = (SetPublishingModeResponse)theEObject;
				T result = caseSetPublishingModeResponse(setPublishingModeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SET_TRIGGERING_REQUEST: {
				SetTriggeringRequest setTriggeringRequest = (SetTriggeringRequest)theEObject;
				T result = caseSetTriggeringRequest(setTriggeringRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SET_TRIGGERING_RESPONSE: {
				SetTriggeringResponse setTriggeringResponse = (SetTriggeringResponse)theEObject;
				T result = caseSetTriggeringResponse(setTriggeringResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIGNATURE_DATA: {
				SignatureData signatureData = (SignatureData)theEObject;
				T result = caseSignatureData(signatureData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIGNED_SOFTWARE_CERTIFICATE: {
				SignedSoftwareCertificate signedSoftwareCertificate = (SignedSoftwareCertificate)theEObject;
				T result = caseSignedSoftwareCertificate(signedSoftwareCertificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND: {
				SimpleAttributeOperand simpleAttributeOperand = (SimpleAttributeOperand)theEObject;
				T result = caseSimpleAttributeOperand(simpleAttributeOperand);
				if (result == null) result = caseFilterOperand(simpleAttributeOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION: {
				SimpleTypeDescription simpleTypeDescription = (SimpleTypeDescription)theEObject;
				T result = caseSimpleTypeDescription(simpleTypeDescription);
				if (result == null) result = caseDataTypeDescription(simpleTypeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STATUS_CHANGE_NOTIFICATION: {
				StatusChangeNotification statusChangeNotification = (StatusChangeNotification)theEObject;
				T result = caseStatusChangeNotification(statusChangeNotification);
				if (result == null) result = caseNotificationData(statusChangeNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STATUS_CODE: {
				StatusCode statusCode = (StatusCode)theEObject;
				T result = caseStatusCode(statusCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STATUS_RESULT: {
				StatusResult statusResult = (StatusResult)theEObject;
				T result = caseStatusResult(statusResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_DEFINITION: {
				StructureDefinition structureDefinition = (StructureDefinition)theEObject;
				T result = caseStructureDefinition(structureDefinition);
				if (result == null) result = caseDataTypeDefinition(structureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_DESCRIPTION: {
				StructureDescription structureDescription = (StructureDescription)theEObject;
				T result = caseStructureDescription(structureDescription);
				if (result == null) result = caseDataTypeDescription(structureDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_FIELD: {
				StructureField structureField = (StructureField)theEObject;
				T result = caseStructureField(structureField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SUBSCRIBED_DATA_SET_DATA_TYPE: {
				SubscribedDataSetDataType subscribedDataSetDataType = (SubscribedDataSetDataType)theEObject;
				T result = caseSubscribedDataSetDataType(subscribedDataSetDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE: {
				SubscribedDataSetMirrorDataType subscribedDataSetMirrorDataType = (SubscribedDataSetMirrorDataType)theEObject;
				T result = caseSubscribedDataSetMirrorDataType(subscribedDataSetMirrorDataType);
				if (result == null) result = caseSubscribedDataSetDataType(subscribedDataSetMirrorDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SUBSCRIPTION_ACKNOWLEDGEMENT: {
				SubscriptionAcknowledgement subscriptionAcknowledgement = (SubscriptionAcknowledgement)theEObject;
				T result = caseSubscriptionAcknowledgement(subscriptionAcknowledgement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE: {
				SubscriptionDiagnosticsDataType subscriptionDiagnosticsDataType = (SubscriptionDiagnosticsDataType)theEObject;
				T result = caseSubscriptionDiagnosticsDataType(subscriptionDiagnosticsDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TARGET_VARIABLES_DATA_TYPE: {
				TargetVariablesDataType targetVariablesDataType = (TargetVariablesDataType)theEObject;
				T result = caseTargetVariablesDataType(targetVariablesDataType);
				if (result == null) result = caseSubscribedDataSetDataType(targetVariablesDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.THREE_DCARTESIAN_COORDINATES: {
				ThreeDCartesianCoordinates threeDCartesianCoordinates = (ThreeDCartesianCoordinates)theEObject;
				T result = caseThreeDCartesianCoordinates(threeDCartesianCoordinates);
				if (result == null) result = caseCartesianCoordinates(threeDCartesianCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.THREE_DFRAME: {
				ThreeDFrame threeDFrame = (ThreeDFrame)theEObject;
				T result = caseThreeDFrame(threeDFrame);
				if (result == null) result = caseFrame(threeDFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.THREE_DORIENTATION: {
				ThreeDOrientation threeDOrientation = (ThreeDOrientation)theEObject;
				T result = caseThreeDOrientation(threeDOrientation);
				if (result == null) result = caseOrientation(threeDOrientation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.THREE_DVECTOR: {
				ThreeDVector threeDVector = (ThreeDVector)theEObject;
				T result = caseThreeDVector(threeDVector);
				if (result == null) result = caseVector(threeDVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TIME_ZONE_DATA_TYPE: {
				TimeZoneDataType timeZoneDataType = (TimeZoneDataType)theEObject;
				T result = caseTimeZoneDataType(timeZoneDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TRANSFER_RESULT: {
				TransferResult transferResult = (TransferResult)theEObject;
				T result = caseTransferResult(transferResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST: {
				TransferSubscriptionsRequest transferSubscriptionsRequest = (TransferSubscriptionsRequest)theEObject;
				T result = caseTransferSubscriptionsRequest(transferSubscriptionsRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_RESPONSE: {
				TransferSubscriptionsResponse transferSubscriptionsResponse = (TransferSubscriptionsResponse)theEObject;
				T result = caseTransferSubscriptionsResponse(transferSubscriptionsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST: {
				TranslateBrowsePathsToNodeIdsRequest translateBrowsePathsToNodeIdsRequest = (TranslateBrowsePathsToNodeIdsRequest)theEObject;
				T result = caseTranslateBrowsePathsToNodeIdsRequest(translateBrowsePathsToNodeIdsRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_RESPONSE: {
				TranslateBrowsePathsToNodeIdsResponse translateBrowsePathsToNodeIdsResponse = (TranslateBrowsePathsToNodeIdsResponse)theEObject;
				T result = caseTranslateBrowsePathsToNodeIdsResponse(translateBrowsePathsToNodeIdsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TRUST_LIST_DATA_TYPE: {
				TrustListDataType trustListDataType = (TrustListDataType)theEObject;
				T result = caseTrustListDataType(trustListDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TYPE_NODE: {
				TypeNode typeNode = (TypeNode)theEObject;
				T result = caseTypeNode(typeNode);
				if (result == null) result = caseNode(typeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE: {
				UABinaryFileDataType uaBinaryFileDataType = (UABinaryFileDataType)theEObject;
				T result = caseUABinaryFileDataType(uaBinaryFileDataType);
				if (result == null) result = caseDataTypeSchemaHeader(uaBinaryFileDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE: {
				UadpDataSetReaderMessageDataType uadpDataSetReaderMessageDataType = (UadpDataSetReaderMessageDataType)theEObject;
				T result = caseUadpDataSetReaderMessageDataType(uadpDataSetReaderMessageDataType);
				if (result == null) result = caseDataSetReaderMessageDataType(uadpDataSetReaderMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE: {
				UadpDataSetWriterMessageDataType uadpDataSetWriterMessageDataType = (UadpDataSetWriterMessageDataType)theEObject;
				T result = caseUadpDataSetWriterMessageDataType(uadpDataSetWriterMessageDataType);
				if (result == null) result = caseDataSetWriterMessageDataType(uadpDataSetWriterMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE: {
				UadpWriterGroupMessageDataType uadpWriterGroupMessageDataType = (UadpWriterGroupMessageDataType)theEObject;
				T result = caseUadpWriterGroupMessageDataType(uadpWriterGroupMessageDataType);
				if (result == null) result = caseWriterGroupMessageDataType(uadpWriterGroupMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UNREGISTER_NODES_REQUEST: {
				UnregisterNodesRequest unregisterNodesRequest = (UnregisterNodesRequest)theEObject;
				T result = caseUnregisterNodesRequest(unregisterNodesRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UNREGISTER_NODES_RESPONSE: {
				UnregisterNodesResponse unregisterNodesResponse = (UnregisterNodesResponse)theEObject;
				T result = caseUnregisterNodesResponse(unregisterNodesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UPDATE_DATA_DETAILS: {
				UpdateDataDetails updateDataDetails = (UpdateDataDetails)theEObject;
				T result = caseUpdateDataDetails(updateDataDetails);
				if (result == null) result = caseHistoryUpdateDetails(updateDataDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UPDATE_EVENT_DETAILS: {
				UpdateEventDetails updateEventDetails = (UpdateEventDetails)theEObject;
				T result = caseUpdateEventDetails(updateEventDetails);
				if (result == null) result = caseHistoryUpdateDetails(updateEventDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS: {
				UpdateStructureDataDetails updateStructureDataDetails = (UpdateStructureDataDetails)theEObject;
				T result = caseUpdateStructureDataDetails(updateStructureDataDetails);
				if (result == null) result = caseHistoryUpdateDetails(updateStructureDataDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.USER_IDENTITY_TOKEN: {
				UserIdentityToken userIdentityToken = (UserIdentityToken)theEObject;
				T result = caseUserIdentityToken(userIdentityToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.USER_NAME_IDENTITY_TOKEN: {
				UserNameIdentityToken userNameIdentityToken = (UserNameIdentityToken)theEObject;
				T result = caseUserNameIdentityToken(userNameIdentityToken);
				if (result == null) result = caseUserIdentityToken(userNameIdentityToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.USER_TOKEN_POLICY: {
				UserTokenPolicy userTokenPolicy = (UserTokenPolicy)theEObject;
				T result = caseUserTokenPolicy(userTokenPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VARIABLE_ATTRIBUTES: {
				VariableAttributes variableAttributes = (VariableAttributes)theEObject;
				T result = caseVariableAttributes(variableAttributes);
				if (result == null) result = caseNodeAttributes(variableAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VARIABLE_NODE: {
				VariableNode variableNode = (VariableNode)theEObject;
				T result = caseVariableNode(variableNode);
				if (result == null) result = caseInstanceNode(variableNode);
				if (result == null) result = caseNode(variableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES: {
				VariableTypeAttributes variableTypeAttributes = (VariableTypeAttributes)theEObject;
				T result = caseVariableTypeAttributes(variableTypeAttributes);
				if (result == null) result = caseNodeAttributes(variableTypeAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VARIABLE_TYPE_NODE: {
				VariableTypeNode variableTypeNode = (VariableTypeNode)theEObject;
				T result = caseVariableTypeNode(variableTypeNode);
				if (result == null) result = caseTypeNode(variableTypeNode);
				if (result == null) result = caseNode(variableTypeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VARIANT: {
				Variant variant = (Variant)theEObject;
				T result = caseVariant(variant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VECTOR: {
				Vector vector = (Vector)theEObject;
				T result = caseVector(vector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VIEW_ATTRIBUTES: {
				ViewAttributes viewAttributes = (ViewAttributes)theEObject;
				T result = caseViewAttributes(viewAttributes);
				if (result == null) result = caseNodeAttributes(viewAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VIEW_DESCRIPTION: {
				ViewDescription viewDescription = (ViewDescription)theEObject;
				T result = caseViewDescription(viewDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VIEW_NODE: {
				ViewNode viewNode = (ViewNode)theEObject;
				T result = caseViewNode(viewNode);
				if (result == null) result = caseInstanceNode(viewNode);
				if (result == null) result = caseNode(viewNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.WRITE_REQUEST: {
				WriteRequest writeRequest = (WriteRequest)theEObject;
				T result = caseWriteRequest(writeRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.WRITE_RESPONSE: {
				WriteResponse writeResponse = (WriteResponse)theEObject;
				T result = caseWriteResponse(writeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.WRITER_GROUP_DATA_TYPE: {
				WriterGroupDataType writerGroupDataType = (WriterGroupDataType)theEObject;
				T result = caseWriterGroupDataType(writerGroupDataType);
				if (result == null) result = casePubSubGroupDataType(writerGroupDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.WRITER_GROUP_MESSAGE_DATA_TYPE: {
				WriterGroupMessageDataType writerGroupMessageDataType = (WriterGroupMessageDataType)theEObject;
				T result = caseWriterGroupMessageDataType(writerGroupMessageDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.WRITER_GROUP_TRANSPORT_DATA_TYPE: {
				WriterGroupTransportDataType writerGroupTransportDataType = (WriterGroupTransportDataType)theEObject;
				T result = caseWriterGroupTransportDataType(writerGroupTransportDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.WRITE_VALUE: {
				WriteValue writeValue = (WriteValue)theEObject;
				T result = caseWriteValue(writeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.X509_IDENTITY_TOKEN: {
				X509IdentityToken x509IdentityToken = (X509IdentityToken)theEObject;
				T result = caseX509IdentityToken(x509IdentityToken);
				if (result == null) result = caseUserIdentityToken(x509IdentityToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.XML_ELEMENT_TYPE: {
				XmlElementType xmlElementType = (XmlElementType)theEObject;
				T result = caseXmlElementType(xmlElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.XV_TYPE: {
				XVType xvType = (XVType)theEObject;
				T result = caseXVType(xvType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activate Session Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activate Session Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivateSessionRequest(ActivateSessionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activate Session Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activate Session Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivateSessionResponse(ActivateSessionResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Nodes Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Nodes Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddNodesItem(AddNodesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Nodes Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Nodes Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddNodesRequest(AddNodesRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Nodes Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Nodes Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddNodesResponse(AddNodesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Nodes Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Nodes Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddNodesResult(AddNodesResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add References Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add References Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddReferencesItem(AddReferencesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add References Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add References Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddReferencesRequest(AddReferencesRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add References Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add References Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddReferencesResponse(AddReferencesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateConfiguration(AggregateConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateFilter(AggregateFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Filter Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Filter Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateFilterResult(AggregateFilterResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Name Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Name Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasNameDataType(AliasNameDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Identity Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Identity Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousIdentityToken(AnonymousIdentityToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationDescription(ApplicationDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeOperand(AttributeOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisInformation(AxisInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyType(BodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broker Connection Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broker Connection Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrokerConnectionTransportDataType(BrokerConnectionTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broker Data Set Reader Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broker Data Set Reader Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrokerDataSetReaderTransportDataType(BrokerDataSetReaderTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broker Data Set Writer Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broker Data Set Writer Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrokerDataSetWriterTransportDataType(BrokerDataSetWriterTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broker Writer Group Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broker Writer Group Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrokerWriterGroupTransportDataType(BrokerWriterGroupTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browse Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browse Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowseDescription(BrowseDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browse Next Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browse Next Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowseNextRequest(BrowseNextRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browse Next Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browse Next Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowseNextResponse(BrowseNextResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browse Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browse Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowsePath(BrowsePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browse Path Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browse Path Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowsePathResult(BrowsePathResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browse Path Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browse Path Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowsePathTarget(BrowsePathTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browse Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browse Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowseRequest(BrowseRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browse Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browse Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowseResponse(BrowseResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browse Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browse Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowseResult(BrowseResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildInfo(BuildInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Method Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Method Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallMethodRequest(CallMethodRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Method Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallMethodResult(CallMethodResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallRequest(CallRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallResponse(CallResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelRequest(CancelRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelResponse(CancelResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianCoordinates(CartesianCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Security Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Security Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelSecurityToken(ChannelSecurityToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Secure Channel Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Secure Channel Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseSecureChannelRequest(CloseSecureChannelRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Secure Channel Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Secure Channel Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseSecureChannelResponse(CloseSecureChannelResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Session Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Session Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseSessionRequest(CloseSessionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Session Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Session Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseSessionResponse(CloseSessionResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexNumberType(ComplexNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Version Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Version Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationVersionDataType(ConfigurationVersionDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionTransportDataType(ConnectionTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentFilter(ContentFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Filter Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentFilterElement(ContentFilterElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Filter Element Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Filter Element Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentFilterElementResult(ContentFilterElementResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Filter Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Filter Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentFilterResult(ContentFilterResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Monitored Items Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Monitored Items Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateMonitoredItemsRequest(CreateMonitoredItemsRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Monitored Items Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Monitored Items Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateMonitoredItemsResponse(CreateMonitoredItemsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Session Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Session Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateSessionRequest(CreateSessionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Session Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Session Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateSessionResponse(CreateSessionResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Subscription Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Subscription Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateSubscriptionRequest(CreateSubscriptionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Subscription Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Subscription Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateSubscriptionResponse(CreateSubscriptionResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencyUnitType(CurrencyUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Change Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Change Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataChangeFilter(DataChangeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Change Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Change Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataChangeNotification(DataChangeNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datagram Connection Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datagram Connection Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatagramConnectionTransportDataType(DatagramConnectionTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datagram Writer Group Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datagram Writer Group Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatagramWriterGroupTransportDataType(DatagramWriterGroupTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set Meta Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set Meta Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetMetaDataType(DataSetMetaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set Reader Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set Reader Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetReaderDataType(DataSetReaderDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set Reader Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set Reader Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetReaderMessageDataType(DataSetReaderMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set Reader Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set Reader Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetReaderTransportDataType(DataSetReaderTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set Writer Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set Writer Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetWriterDataType(DataSetWriterDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set Writer Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set Writer Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetWriterMessageDataType(DataSetWriterMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set Writer Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set Writer Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetWriterTransportDataType(DataSetWriterTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeAttributes(DataTypeAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeDefinition(DataTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeDescription(DataTypeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeNode(DataTypeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Schema Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Schema Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeSchemaHeader(DataTypeSchemaHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValue(DataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalDataType(DecimalDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete At Time Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete At Time Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteAtTimeDetails(DeleteAtTimeDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Event Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Event Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteEventDetails(DeleteEventDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Monitored Items Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Monitored Items Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteMonitoredItemsRequest(DeleteMonitoredItemsRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Monitored Items Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Monitored Items Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteMonitoredItemsResponse(DeleteMonitoredItemsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Nodes Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Nodes Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteNodesItem(DeleteNodesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Nodes Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Nodes Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteNodesRequest(DeleteNodesRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Nodes Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Nodes Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteNodesResponse(DeleteNodesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Raw Modified Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Raw Modified Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteRawModifiedDetails(DeleteRawModifiedDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete References Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete References Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteReferencesItem(DeleteReferencesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete References Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete References Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteReferencesRequest(DeleteReferencesRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete References Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete References Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteReferencesResponse(DeleteReferencesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Subscriptions Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Subscriptions Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteSubscriptionsRequest(DeleteSubscriptionsRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Subscriptions Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Subscriptions Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteSubscriptionsResponse(DeleteSubscriptionsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticInfo(DiagnosticInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discovery Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscoveryConfiguration(DiscoveryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Complex Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Complex Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleComplexNumberType(DoubleComplexNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementOperand(ElementOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointConfiguration(EndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointDescription(EndpointDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointType(EndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Url List Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Url List Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointUrlListDataType(EndpointUrlListDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDefinition(EnumDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDescription(EnumDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumField(EnumField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValueType(EnumValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EU Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EU Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEUInformation(EUInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Field List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Field List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFieldList(EventFieldList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFilter(EventFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Filter Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Filter Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFilterResult(EventFilterResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Notification List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Notification List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventNotificationList(EventNotificationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expanded Node Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expanded Node Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpandedNodeId(ExpandedNodeId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionObject(ExtensionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Meta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldMetaData(FieldMetaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Target Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Target Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldTargetDataType(FieldTargetDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterOperand(FilterOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Servers On Network Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Servers On Network Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindServersOnNetworkRequest(FindServersOnNetworkRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Servers On Network Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Servers On Network Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindServersOnNetworkResponse(FindServersOnNetworkResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Servers Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Servers Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindServersRequest(FindServersRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Servers Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Servers Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindServersResponse(FindServersResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrame(Frame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericAttributes(GenericAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericAttributeValue(GenericAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Endpoints Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Endpoints Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetEndpointsRequest(GetEndpointsRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Endpoints Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Endpoints Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetEndpointsResponse(GetEndpointsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuid(Guid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryData(HistoryData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryEvent(HistoryEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Event Field List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Event Field List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryEventFieldList(HistoryEventFieldList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Modified Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Modified Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryModifiedData(HistoryModifiedData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Read Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Read Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryReadDetails(HistoryReadDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Read Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Read Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryReadRequest(HistoryReadRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Read Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Read Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryReadResponse(HistoryReadResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Read Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Read Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryReadResult(HistoryReadResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Read Value Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Read Value Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryReadValueId(HistoryReadValueId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Update Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Update Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryUpdateDetails(HistoryUpdateDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Update Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Update Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryUpdateRequest(HistoryUpdateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Update Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Update Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryUpdateResponse(HistoryUpdateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Update Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Update Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryUpdateResult(HistoryUpdateResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Mapping Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Mapping Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityMappingRuleType(IdentityMappingRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceNode(InstanceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issued Identity Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issued Identity Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssuedIdentityToken(IssuedIdentityToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Data Set Reader Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Data Set Reader Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonDataSetReaderMessageDataType(JsonDataSetReaderMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Data Set Writer Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Data Set Writer Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonDataSetWriterMessageDataType(JsonDataSetWriterMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Writer Group Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Writer Group Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonWriterGroupMessageDataType(JsonWriterGroupMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValuePair(KeyValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Add Nodes Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Add Nodes Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfAddNodesItem(ListOfAddNodesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Add Nodes Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Add Nodes Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfAddNodesResult(ListOfAddNodesResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Add References Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Add References Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfAddReferencesItem(ListOfAddReferencesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Alias Name Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Alias Name Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfAliasNameDataType(ListOfAliasNameDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Application Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Application Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfApplicationDescription(ListOfApplicationDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfArgument(ListOfArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBoolean(ListOfBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Broker Connection Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Broker Connection Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBrokerConnectionTransportDataType(ListOfBrokerConnectionTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Broker Data Set Reader Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Broker Data Set Reader Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBrokerDataSetReaderTransportDataType(ListOfBrokerDataSetReaderTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Broker Data Set Writer Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Broker Data Set Writer Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBrokerDataSetWriterTransportDataType(ListOfBrokerDataSetWriterTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Broker Transport Quality Of Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Broker Transport Quality Of Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBrokerTransportQualityOfService(ListOfBrokerTransportQualityOfService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Broker Writer Group Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Broker Writer Group Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBrokerWriterGroupTransportDataType(ListOfBrokerWriterGroupTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Browse Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Browse Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBrowseDescription(ListOfBrowseDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Browse Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Browse Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBrowsePath(ListOfBrowsePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Browse Path Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Browse Path Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBrowsePathResult(ListOfBrowsePathResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Browse Path Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Browse Path Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBrowsePathTarget(ListOfBrowsePathTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Browse Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Browse Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfBrowseResult(ListOfBrowseResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfByte(ListOfByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Byte String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Byte String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfByteString(ListOfByteString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Call Method Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Call Method Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfCallMethodRequest(ListOfCallMethodRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Call Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Call Method Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfCallMethodResult(ListOfCallMethodResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Cartesian Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Cartesian Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfCartesianCoordinates(ListOfCartesianCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Configuration Version Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Configuration Version Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfConfigurationVersionDataType(ListOfConfigurationVersionDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Connection Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Connection Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfConnectionTransportDataType(ListOfConnectionTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Content Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Content Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfContentFilter(ListOfContentFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Content Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Content Filter Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfContentFilterElement(ListOfContentFilterElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Content Filter Element Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Content Filter Element Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfContentFilterElementResult(ListOfContentFilterElementResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Currency Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Currency Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfCurrencyUnitType(ListOfCurrencyUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Datagram Connection Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Datagram Connection Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDatagramConnectionTransportDataType(ListOfDatagramConnectionTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Datagram Writer Group Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Datagram Writer Group Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDatagramWriterGroupTransportDataType(ListOfDatagramWriterGroupTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Set Field Content Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Set Field Content Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataSetFieldContentMask(ListOfDataSetFieldContentMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Set Meta Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Set Meta Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataSetMetaDataType(ListOfDataSetMetaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Set Ordering Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Set Ordering Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataSetOrderingType(ListOfDataSetOrderingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Set Reader Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Set Reader Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataSetReaderDataType(ListOfDataSetReaderDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Set Reader Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Set Reader Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataSetReaderMessageDataType(ListOfDataSetReaderMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Set Reader Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Set Reader Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataSetReaderTransportDataType(ListOfDataSetReaderTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Set Writer Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Set Writer Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataSetWriterDataType(ListOfDataSetWriterDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Set Writer Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Set Writer Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataSetWriterMessageDataType(ListOfDataSetWriterMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Set Writer Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Set Writer Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataSetWriterTransportDataType(ListOfDataSetWriterTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataTypeDefinition(ListOfDataTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Type Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Type Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataTypeDescription(ListOfDataTypeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Type Schema Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Type Schema Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataTypeSchemaHeader(ListOfDataTypeSchemaHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDataValue(ListOfDataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDateTime(ListOfDateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Delete Nodes Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Delete Nodes Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDeleteNodesItem(ListOfDeleteNodesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Delete References Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Delete References Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDeleteReferencesItem(ListOfDeleteReferencesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Diagnostic Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Diagnostic Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDiagnosticInfo(ListOfDiagnosticInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Diagnostics Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Diagnostics Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDiagnosticsLevel(ListOfDiagnosticsLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDouble(ListOfDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfEndpointConfiguration(ListOfEndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Endpoint Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Endpoint Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfEndpointDescription(ListOfEndpointDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfEndpointType(ListOfEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Endpoint Url List Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Endpoint Url List Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfEndpointUrlListDataType(ListOfEndpointUrlListDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Enum Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Enum Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfEnumDefinition(ListOfEnumDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Enum Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Enum Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfEnumDescription(ListOfEnumDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Enum Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Enum Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfEnumField(ListOfEnumField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Enum Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Enum Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfEnumValueType(ListOfEnumValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Event Field List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Event Field List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfEventFieldList(ListOfEventFieldList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Expanded Node Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Expanded Node Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfExpandedNodeId(ListOfExpandedNodeId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Extension Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Extension Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfExtensionObject(ListOfExtensionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Field Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Field Meta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfFieldMetaData(ListOfFieldMetaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Field Target Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Field Target Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfFieldTargetDataType(ListOfFieldTargetDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfFloat(ListOfFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfFrame(ListOfFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Generic Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Generic Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfGenericAttributeValue(ListOfGenericAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Guid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Guid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfGuid(ListOfGuid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of History Event Field List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of History Event Field List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfHistoryEventFieldList(ListOfHistoryEventFieldList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of History Read Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of History Read Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfHistoryReadResult(ListOfHistoryReadResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of History Read Value Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of History Read Value Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfHistoryReadValueId(ListOfHistoryReadValueId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of History Update Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of History Update Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfHistoryUpdateResult(ListOfHistoryUpdateResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Identity Criteria Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Identity Criteria Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfIdentityCriteriaType(ListOfIdentityCriteriaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Identity Mapping Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Identity Mapping Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfIdentityMappingRuleType(ListOfIdentityMappingRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfIdType(ListOfIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Int16</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Int16</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfInt16(ListOfInt16 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Int32</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Int32</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfInt32(ListOfInt32 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Int64</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Int64</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfInt64(ListOfInt64 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Json Data Set Message Content Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Json Data Set Message Content Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfJsonDataSetMessageContentMask(ListOfJsonDataSetMessageContentMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Json Data Set Reader Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Json Data Set Reader Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfJsonDataSetReaderMessageDataType(ListOfJsonDataSetReaderMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Json Data Set Writer Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Json Data Set Writer Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfJsonDataSetWriterMessageDataType(ListOfJsonDataSetWriterMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Json Network Message Content Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Json Network Message Content Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfJsonNetworkMessageContentMask(ListOfJsonNetworkMessageContentMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Json Writer Group Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Json Writer Group Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfJsonWriterGroupMessageDataType(ListOfJsonWriterGroupMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Key Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfKeyValuePair(ListOfKeyValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Localized Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Localized Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfLocalizedText(ListOfLocalizedText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Model Change Structure Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Model Change Structure Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfModelChangeStructureDataType(ListOfModelChangeStructureDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Modification Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Modification Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfModificationInfo(ListOfModificationInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Monitored Item Create Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Monitored Item Create Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfMonitoredItemCreateRequest(ListOfMonitoredItemCreateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Monitored Item Create Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Monitored Item Create Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfMonitoredItemCreateResult(ListOfMonitoredItemCreateResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Monitored Item Modify Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Monitored Item Modify Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfMonitoredItemModifyRequest(ListOfMonitoredItemModifyRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Monitored Item Modify Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Monitored Item Modify Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfMonitoredItemModifyResult(ListOfMonitoredItemModifyResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Monitored Item Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Monitored Item Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfMonitoredItemNotification(ListOfMonitoredItemNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Network Address Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Network Address Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfNetworkAddressDataType(ListOfNetworkAddressDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Network Address Url Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Network Address Url Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfNetworkAddressUrlDataType(ListOfNetworkAddressUrlDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Network Group Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Network Group Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfNetworkGroupDataType(ListOfNetworkGroupDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfNode(ListOfNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Node Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Node Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfNodeId(ListOfNodeId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfNodeReference(ListOfNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Node Type Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Node Type Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfNodeTypeDescription(ListOfNodeTypeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Open File Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Open File Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfOpenFileMode(ListOfOpenFileMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Option Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Option Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfOptionSet(ListOfOptionSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Orientation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Orientation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfOrientation(ListOfOrientation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Override Value Handling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Override Value Handling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfOverrideValueHandling(ListOfOverrideValueHandling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Parsing Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Parsing Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfParsingResult(ListOfParsingResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Published Data Items Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Published Data Items Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfPublishedDataItemsDataType(ListOfPublishedDataItemsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Published Data Set Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Published Data Set Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfPublishedDataSetDataType(ListOfPublishedDataSetDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Published Data Set Source Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Published Data Set Source Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfPublishedDataSetSourceDataType(ListOfPublishedDataSetSourceDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Published Events Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Published Events Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfPublishedEventsDataType(ListOfPublishedEventsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Published Variable Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Published Variable Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfPublishedVariableDataType(ListOfPublishedVariableDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Pub Sub Configuration Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Pub Sub Configuration Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfPubSubConfigurationDataType(ListOfPubSubConfigurationDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Pub Sub Connection Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Pub Sub Connection Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfPubSubConnectionDataType(ListOfPubSubConnectionDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Pub Sub Diagnostics Counter Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Pub Sub Diagnostics Counter Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfPubSubDiagnosticsCounterClassification(ListOfPubSubDiagnosticsCounterClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Pub Sub Group Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Pub Sub Group Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfPubSubGroupDataType(ListOfPubSubGroupDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Pub Sub State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Pub Sub State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfPubSubState(ListOfPubSubState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Qualified Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Qualified Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfQualifiedName(ListOfQualifiedName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Query Data Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Query Data Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfQueryDataDescription(ListOfQueryDataDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Query Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Query Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfQueryDataSet(ListOfQueryDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Rational Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Rational Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfRationalNumber(ListOfRationalNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Reader Group Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Reader Group Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfReaderGroupDataType(ListOfReaderGroupDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Reader Group Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Reader Group Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfReaderGroupMessageDataType(ListOfReaderGroupMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Reader Group Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Reader Group Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfReaderGroupTransportDataType(ListOfReaderGroupTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Read Value Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Read Value Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfReadValueId(ListOfReadValueId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Redundant Server Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Redundant Server Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfRedundantServerDataType(ListOfRedundantServerDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Reference Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Reference Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfReferenceDescription(ListOfReferenceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Reference Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Reference Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfReferenceNode(ListOfReferenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Registered Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Registered Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfRegisteredServer(ListOfRegisteredServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Relative Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Relative Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfRelativePathElement(ListOfRelativePathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Role Permission Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Role Permission Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfRolePermissionType(ListOfRolePermissionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Sampling Interval Diagnostics Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Sampling Interval Diagnostics Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSamplingIntervalDiagnosticsDataType(ListOfSamplingIntervalDiagnosticsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of SByte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of SByte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSByte(ListOfSByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Semantic Change Structure Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Semantic Change Structure Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSemanticChangeStructureDataType(ListOfSemanticChangeStructureDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Server On Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Server On Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfServerOnNetwork(ListOfServerOnNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Session Diagnostics Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Session Diagnostics Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSessionDiagnosticsDataType(ListOfSessionDiagnosticsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Session Security Diagnostics Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Session Security Diagnostics Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSessionSecurityDiagnosticsDataType(ListOfSessionSecurityDiagnosticsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Signed Software Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Signed Software Certificate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSignedSoftwareCertificate(ListOfSignedSoftwareCertificate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Simple Attribute Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Simple Attribute Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSimpleAttributeOperand(ListOfSimpleAttributeOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Simple Type Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Simple Type Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSimpleTypeDescription(ListOfSimpleTypeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Status Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Status Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfStatusCode(ListOfStatusCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Status Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Status Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfStatusResult(ListOfStatusResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfString(ListOfString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Structure Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Structure Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfStructureDefinition(ListOfStructureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Structure Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfStructureDescription(ListOfStructureDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Structure Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Structure Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfStructureField(ListOfStructureField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Subscribed Data Set Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Subscribed Data Set Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSubscribedDataSetDataType(ListOfSubscribedDataSetDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Subscribed Data Set Mirror Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Subscribed Data Set Mirror Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSubscribedDataSetMirrorDataType(ListOfSubscribedDataSetMirrorDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Subscription Acknowledgement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Subscription Acknowledgement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSubscriptionAcknowledgement(ListOfSubscriptionAcknowledgement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Subscription Diagnostics Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Subscription Diagnostics Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfSubscriptionDiagnosticsDataType(ListOfSubscriptionDiagnosticsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Target Variables Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Target Variables Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfTargetVariablesDataType(ListOfTargetVariablesDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Three DCartesian Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Three DCartesian Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfThreeDCartesianCoordinates(ListOfThreeDCartesianCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Three DFrame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Three DFrame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfThreeDFrame(ListOfThreeDFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Three DOrientation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Three DOrientation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfThreeDOrientation(ListOfThreeDOrientation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Three DVector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Three DVector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfThreeDVector(ListOfThreeDVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Time Zone Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Time Zone Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfTimeZoneDataType(ListOfTimeZoneDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Transfer Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Transfer Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfTransferResult(ListOfTransferResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Trust List Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Trust List Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfTrustListDataType(ListOfTrustListDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of UA Binary File Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of UA Binary File Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUABinaryFileDataType(ListOfUABinaryFileDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Uadp Data Set Message Content Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Uadp Data Set Message Content Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUadpDataSetMessageContentMask(ListOfUadpDataSetMessageContentMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Uadp Data Set Reader Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Uadp Data Set Reader Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUadpDataSetReaderMessageDataType(ListOfUadpDataSetReaderMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Uadp Data Set Writer Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Uadp Data Set Writer Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUadpDataSetWriterMessageDataType(ListOfUadpDataSetWriterMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Uadp Network Message Content Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Uadp Network Message Content Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUadpNetworkMessageContentMask(ListOfUadpNetworkMessageContentMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Uadp Writer Group Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Uadp Writer Group Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUadpWriterGroupMessageDataType(ListOfUadpWriterGroupMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of UInt16</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of UInt16</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUInt16(ListOfUInt16 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of UInt32</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of UInt32</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUInt32(ListOfUInt32 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of UInt64</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of UInt64</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUInt64(ListOfUInt64 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUnion(ListOfUnion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of User Token Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of User Token Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfUserTokenPolicy(ListOfUserTokenPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfVariant(ListOfVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfVector(ListOfVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Writer Group Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Writer Group Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfWriterGroupDataType(ListOfWriterGroupDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Writer Group Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Writer Group Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfWriterGroupMessageDataType(ListOfWriterGroupMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Writer Group Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Writer Group Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfWriterGroupTransportDataType(ListOfWriterGroupTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Write Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Write Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfWriteValue(ListOfWriteValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Xml Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Xml Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfXmlElement(ListOfXmlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralOperand(LiteralOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localized Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localized Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalizedText(LocalizedText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mdns Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mdns Discovery Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMdnsDiscoveryConfiguration(MdnsDiscoveryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodAttributes(MethodAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodNode(MethodNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Change Structure Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Change Structure Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelChangeStructureDataType(ModelChangeStructureDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modification Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modification Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModificationInfo(ModificationInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Monitored Items Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Monitored Items Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyMonitoredItemsRequest(ModifyMonitoredItemsRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Monitored Items Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Monitored Items Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyMonitoredItemsResponse(ModifyMonitoredItemsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Subscription Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Subscription Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifySubscriptionRequest(ModifySubscriptionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Subscription Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Subscription Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifySubscriptionResponse(ModifySubscriptionResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitored Item Create Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitored Item Create Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoredItemCreateRequest(MonitoredItemCreateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitored Item Create Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitored Item Create Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoredItemCreateResult(MonitoredItemCreateResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitored Item Modify Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitored Item Modify Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoredItemModifyRequest(MonitoredItemModifyRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitored Item Modify Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitored Item Modify Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoredItemModifyResult(MonitoredItemModifyResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitored Item Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitored Item Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoredItemNotification(MonitoredItemNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringFilter(MonitoringFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring Filter Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring Filter Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringFilterResult(MonitoringFilterResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringParameters(MonitoringParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Address Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Address Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkAddressDataType(NetworkAddressDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Address Url Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Address Url Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkAddressUrlDataType(NetworkAddressUrlDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Group Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Group Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkGroupDataType(NetworkGroupDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeAttributes(NodeAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeId(NodeId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeReference(NodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Type Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Type Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeTypeDescription(NodeTypeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationData(NotificationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationMessage(NotificationMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectAttributes(ObjectAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNode(ObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeAttributes(ObjectTypeAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeNode(ObjectTypeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Secure Channel Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Secure Channel Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenSecureChannelRequest(OpenSecureChannelRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Secure Channel Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Secure Channel Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenSecureChannelResponse(OpenSecureChannelResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionSet(OptionSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientation(Orientation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parsing Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parsing Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParsingResult(ParsingResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Diagnostic2 Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Diagnostic2 Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramDiagnostic2DataType(ProgramDiagnostic2DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Diagnostic Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Diagnostic Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramDiagnosticDataType(ProgramDiagnosticDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Published Data Items Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Published Data Items Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishedDataItemsDataType(PublishedDataItemsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Published Data Set Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Published Data Set Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishedDataSetDataType(PublishedDataSetDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Published Data Set Source Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Published Data Set Source Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishedDataSetSourceDataType(PublishedDataSetSourceDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Published Events Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Published Events Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishedEventsDataType(PublishedEventsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Published Variable Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Published Variable Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishedVariableDataType(PublishedVariableDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publish Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publish Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishRequest(PublishRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publish Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publish Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishResponse(PublishResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pub Sub Configuration Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pub Sub Configuration Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubSubConfigurationDataType(PubSubConfigurationDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pub Sub Connection Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pub Sub Connection Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubSubConnectionDataType(PubSubConnectionDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pub Sub Group Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pub Sub Group Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubSubGroupDataType(PubSubGroupDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedName(QualifiedName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Data Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Data Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryDataDescription(QueryDataDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryDataSet(QueryDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query First Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query First Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryFirstRequest(QueryFirstRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query First Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query First Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryFirstResponse(QueryFirstResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Next Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Next Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryNextRequest(QueryNextRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Next Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Next Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryNextResponse(QueryNextResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rational Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rational Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRationalNumber(RationalNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Annotation Data Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Annotation Data Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadAnnotationDataDetails(ReadAnnotationDataDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read At Time Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read At Time Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadAtTimeDetails(ReadAtTimeDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reader Group Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reader Group Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReaderGroupDataType(ReaderGroupDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reader Group Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reader Group Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReaderGroupMessageDataType(ReaderGroupMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reader Group Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reader Group Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReaderGroupTransportDataType(ReaderGroupTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Event Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Event Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadEventDetails(ReadEventDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Processed Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Processed Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadProcessedDetails(ReadProcessedDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Raw Modified Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Raw Modified Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadRawModifiedDetails(ReadRawModifiedDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadRequest(ReadRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadResponse(ReadResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Value Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Value Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadValueId(ReadValueId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redundant Server Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redundant Server Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedundantServerDataType(RedundantServerDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceDescription(ReferenceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceNode(ReferenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceTypeAttributes(ReferenceTypeAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceTypeNode(ReferenceTypeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registered Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registered Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisteredServer(RegisteredServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Nodes Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Nodes Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterNodesRequest(RegisterNodesRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Nodes Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Nodes Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterNodesResponse(RegisterNodesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Server2 Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Server2 Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterServer2Request(RegisterServer2Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Server2 Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Server2 Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterServer2Response(RegisterServer2Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Server Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Server Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterServerRequest(RegisterServerRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Server Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Server Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterServerResponse(RegisterServerResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativePath(RelativePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativePathElement(RelativePathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Republish Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Republish Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepublishRequest(RepublishRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Republish Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Republish Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepublishResponse(RepublishResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestHeader(RequestHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseHeader(ResponseHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Permission Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Permission Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolePermissionType(RolePermissionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Interval Diagnostics Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Interval Diagnostics Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSamplingIntervalDiagnosticsDataType(SamplingIntervalDiagnosticsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Change Structure Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Change Structure Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticChangeStructureDataType(SemanticChangeStructureDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Diagnostics Summary Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Diagnostics Summary Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerDiagnosticsSummaryDataType(ServerDiagnosticsSummaryDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server On Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server On Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerOnNetwork(ServerOnNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Status Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Status Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerStatusDataType(ServerStatusDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Counter Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Counter Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCounterDataType(ServiceCounterDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFault(ServiceFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Diagnostics Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Diagnostics Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionDiagnosticsDataType(SessionDiagnosticsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sessionless Invoke Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sessionless Invoke Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionlessInvokeRequestType(SessionlessInvokeRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sessionless Invoke Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sessionless Invoke Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionlessInvokeResponseType(SessionlessInvokeResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Security Diagnostics Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Security Diagnostics Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionSecurityDiagnosticsDataType(SessionSecurityDiagnosticsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Monitoring Mode Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Monitoring Mode Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetMonitoringModeRequest(SetMonitoringModeRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Monitoring Mode Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Monitoring Mode Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetMonitoringModeResponse(SetMonitoringModeResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Publishing Mode Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Publishing Mode Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetPublishingModeRequest(SetPublishingModeRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Publishing Mode Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Publishing Mode Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetPublishingModeResponse(SetPublishingModeResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Triggering Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Triggering Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTriggeringRequest(SetTriggeringRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Triggering Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Triggering Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTriggeringResponse(SetTriggeringResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureData(SignatureData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signed Software Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signed Software Certificate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignedSoftwareCertificate(SignedSoftwareCertificate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Attribute Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Attribute Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleAttributeOperand(SimpleAttributeOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTypeDescription(SimpleTypeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Change Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Change Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusChangeNotification(StatusChangeNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusCode(StatusCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusResult(StatusResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinition(StructureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDescription(StructureDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureField(StructureField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribed Data Set Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribed Data Set Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribedDataSetDataType(SubscribedDataSetDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribed Data Set Mirror Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribed Data Set Mirror Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribedDataSetMirrorDataType(SubscribedDataSetMirrorDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription Acknowledgement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription Acknowledgement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptionAcknowledgement(SubscriptionAcknowledgement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription Diagnostics Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription Diagnostics Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptionDiagnosticsDataType(SubscriptionDiagnosticsDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Variables Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Variables Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetVariablesDataType(TargetVariablesDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Three DCartesian Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Three DCartesian Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreeDCartesianCoordinates(ThreeDCartesianCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Three DFrame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Three DFrame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreeDFrame(ThreeDFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Three DOrientation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Three DOrientation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreeDOrientation(ThreeDOrientation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Three DVector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Three DVector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreeDVector(ThreeDVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Zone Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Zone Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeZoneDataType(TimeZoneDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferResult(TransferResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Subscriptions Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Subscriptions Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferSubscriptionsRequest(TransferSubscriptionsRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Subscriptions Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Subscriptions Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferSubscriptionsResponse(TransferSubscriptionsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translate Browse Paths To Node Ids Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translate Browse Paths To Node Ids Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslateBrowsePathsToNodeIdsRequest(TranslateBrowsePathsToNodeIdsRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translate Browse Paths To Node Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translate Browse Paths To Node Ids Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslateBrowsePathsToNodeIdsResponse(TranslateBrowsePathsToNodeIdsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trust List Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trust List Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustListDataType(TrustListDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNode(TypeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA Binary File Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA Binary File Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUABinaryFileDataType(UABinaryFileDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uadp Data Set Reader Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uadp Data Set Reader Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUadpDataSetReaderMessageDataType(UadpDataSetReaderMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uadp Data Set Writer Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uadp Data Set Writer Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUadpDataSetWriterMessageDataType(UadpDataSetWriterMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uadp Writer Group Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uadp Writer Group Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUadpWriterGroupMessageDataType(UadpWriterGroupMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unregister Nodes Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unregister Nodes Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnregisterNodesRequest(UnregisterNodesRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unregister Nodes Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unregister Nodes Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnregisterNodesResponse(UnregisterNodesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Data Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Data Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateDataDetails(UpdateDataDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Event Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Event Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateEventDetails(UpdateEventDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Structure Data Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Structure Data Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateStructureDataDetails(UpdateStructureDataDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Identity Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Identity Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIdentityToken(UserIdentityToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Name Identity Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Name Identity Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserNameIdentityToken(UserNameIdentityToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Token Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Token Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTokenPolicy(UserTokenPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAttributes(VariableAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableNode(VariableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableTypeAttributes(VariableTypeAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableTypeNode(VariableTypeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariant(Variant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVector(Vector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewAttributes(ViewAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewDescription(ViewDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewNode(ViewNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteRequest(WriteRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteResponse(WriteResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writer Group Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writer Group Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriterGroupDataType(WriterGroupDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writer Group Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writer Group Message Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriterGroupMessageDataType(WriterGroupMessageDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writer Group Transport Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writer Group Transport Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriterGroupTransportDataType(WriterGroupTransportDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteValue(WriteValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X509 Identity Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X509 Identity Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX509IdentityToken(X509IdentityToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlElementType(XmlElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XV Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XV Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXVType(XVType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TypesSwitch
