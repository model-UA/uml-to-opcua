/**
 */
package org.opcfoundation.ua._2008._02.types.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.opcfoundation.ua._2008._02.types.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesSwitch<Adapter> modelSwitch =
		new TypesSwitch<Adapter>() {
			@Override
			public Adapter caseActivateSessionRequest(ActivateSessionRequest object) {
				return createActivateSessionRequestAdapter();
			}
			@Override
			public Adapter caseActivateSessionResponse(ActivateSessionResponse object) {
				return createActivateSessionResponseAdapter();
			}
			@Override
			public Adapter caseAddNodesItem(AddNodesItem object) {
				return createAddNodesItemAdapter();
			}
			@Override
			public Adapter caseAddNodesRequest(AddNodesRequest object) {
				return createAddNodesRequestAdapter();
			}
			@Override
			public Adapter caseAddNodesResponse(AddNodesResponse object) {
				return createAddNodesResponseAdapter();
			}
			@Override
			public Adapter caseAddNodesResult(AddNodesResult object) {
				return createAddNodesResultAdapter();
			}
			@Override
			public Adapter caseAddReferencesItem(AddReferencesItem object) {
				return createAddReferencesItemAdapter();
			}
			@Override
			public Adapter caseAddReferencesRequest(AddReferencesRequest object) {
				return createAddReferencesRequestAdapter();
			}
			@Override
			public Adapter caseAddReferencesResponse(AddReferencesResponse object) {
				return createAddReferencesResponseAdapter();
			}
			@Override
			public Adapter caseAggregateConfiguration(AggregateConfiguration object) {
				return createAggregateConfigurationAdapter();
			}
			@Override
			public Adapter caseAggregateFilter(AggregateFilter object) {
				return createAggregateFilterAdapter();
			}
			@Override
			public Adapter caseAggregateFilterResult(AggregateFilterResult object) {
				return createAggregateFilterResultAdapter();
			}
			@Override
			public Adapter caseAliasNameDataType(AliasNameDataType object) {
				return createAliasNameDataTypeAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnonymousIdentityToken(AnonymousIdentityToken object) {
				return createAnonymousIdentityTokenAdapter();
			}
			@Override
			public Adapter caseApplicationDescription(ApplicationDescription object) {
				return createApplicationDescriptionAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseAttributeOperand(AttributeOperand object) {
				return createAttributeOperandAdapter();
			}
			@Override
			public Adapter caseAxisInformation(AxisInformation object) {
				return createAxisInformationAdapter();
			}
			@Override
			public Adapter caseBodyType(BodyType object) {
				return createBodyTypeAdapter();
			}
			@Override
			public Adapter caseBrokerConnectionTransportDataType(BrokerConnectionTransportDataType object) {
				return createBrokerConnectionTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseBrokerDataSetReaderTransportDataType(BrokerDataSetReaderTransportDataType object) {
				return createBrokerDataSetReaderTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseBrokerDataSetWriterTransportDataType(BrokerDataSetWriterTransportDataType object) {
				return createBrokerDataSetWriterTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseBrokerWriterGroupTransportDataType(BrokerWriterGroupTransportDataType object) {
				return createBrokerWriterGroupTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseBrowseDescription(BrowseDescription object) {
				return createBrowseDescriptionAdapter();
			}
			@Override
			public Adapter caseBrowseNextRequest(BrowseNextRequest object) {
				return createBrowseNextRequestAdapter();
			}
			@Override
			public Adapter caseBrowseNextResponse(BrowseNextResponse object) {
				return createBrowseNextResponseAdapter();
			}
			@Override
			public Adapter caseBrowsePath(BrowsePath object) {
				return createBrowsePathAdapter();
			}
			@Override
			public Adapter caseBrowsePathResult(BrowsePathResult object) {
				return createBrowsePathResultAdapter();
			}
			@Override
			public Adapter caseBrowsePathTarget(BrowsePathTarget object) {
				return createBrowsePathTargetAdapter();
			}
			@Override
			public Adapter caseBrowseRequest(BrowseRequest object) {
				return createBrowseRequestAdapter();
			}
			@Override
			public Adapter caseBrowseResponse(BrowseResponse object) {
				return createBrowseResponseAdapter();
			}
			@Override
			public Adapter caseBrowseResult(BrowseResult object) {
				return createBrowseResultAdapter();
			}
			@Override
			public Adapter caseBuildInfo(BuildInfo object) {
				return createBuildInfoAdapter();
			}
			@Override
			public Adapter caseCallMethodRequest(CallMethodRequest object) {
				return createCallMethodRequestAdapter();
			}
			@Override
			public Adapter caseCallMethodResult(CallMethodResult object) {
				return createCallMethodResultAdapter();
			}
			@Override
			public Adapter caseCallRequest(CallRequest object) {
				return createCallRequestAdapter();
			}
			@Override
			public Adapter caseCallResponse(CallResponse object) {
				return createCallResponseAdapter();
			}
			@Override
			public Adapter caseCancelRequest(CancelRequest object) {
				return createCancelRequestAdapter();
			}
			@Override
			public Adapter caseCancelResponse(CancelResponse object) {
				return createCancelResponseAdapter();
			}
			@Override
			public Adapter caseCartesianCoordinates(CartesianCoordinates object) {
				return createCartesianCoordinatesAdapter();
			}
			@Override
			public Adapter caseChannelSecurityToken(ChannelSecurityToken object) {
				return createChannelSecurityTokenAdapter();
			}
			@Override
			public Adapter caseCloseSecureChannelRequest(CloseSecureChannelRequest object) {
				return createCloseSecureChannelRequestAdapter();
			}
			@Override
			public Adapter caseCloseSecureChannelResponse(CloseSecureChannelResponse object) {
				return createCloseSecureChannelResponseAdapter();
			}
			@Override
			public Adapter caseCloseSessionRequest(CloseSessionRequest object) {
				return createCloseSessionRequestAdapter();
			}
			@Override
			public Adapter caseCloseSessionResponse(CloseSessionResponse object) {
				return createCloseSessionResponseAdapter();
			}
			@Override
			public Adapter caseComplexNumberType(ComplexNumberType object) {
				return createComplexNumberTypeAdapter();
			}
			@Override
			public Adapter caseConfigurationVersionDataType(ConfigurationVersionDataType object) {
				return createConfigurationVersionDataTypeAdapter();
			}
			@Override
			public Adapter caseConnectionTransportDataType(ConnectionTransportDataType object) {
				return createConnectionTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseContentFilter(ContentFilter object) {
				return createContentFilterAdapter();
			}
			@Override
			public Adapter caseContentFilterElement(ContentFilterElement object) {
				return createContentFilterElementAdapter();
			}
			@Override
			public Adapter caseContentFilterElementResult(ContentFilterElementResult object) {
				return createContentFilterElementResultAdapter();
			}
			@Override
			public Adapter caseContentFilterResult(ContentFilterResult object) {
				return createContentFilterResultAdapter();
			}
			@Override
			public Adapter caseCreateMonitoredItemsRequest(CreateMonitoredItemsRequest object) {
				return createCreateMonitoredItemsRequestAdapter();
			}
			@Override
			public Adapter caseCreateMonitoredItemsResponse(CreateMonitoredItemsResponse object) {
				return createCreateMonitoredItemsResponseAdapter();
			}
			@Override
			public Adapter caseCreateSessionRequest(CreateSessionRequest object) {
				return createCreateSessionRequestAdapter();
			}
			@Override
			public Adapter caseCreateSessionResponse(CreateSessionResponse object) {
				return createCreateSessionResponseAdapter();
			}
			@Override
			public Adapter caseCreateSubscriptionRequest(CreateSubscriptionRequest object) {
				return createCreateSubscriptionRequestAdapter();
			}
			@Override
			public Adapter caseCreateSubscriptionResponse(CreateSubscriptionResponse object) {
				return createCreateSubscriptionResponseAdapter();
			}
			@Override
			public Adapter caseCurrencyUnitType(CurrencyUnitType object) {
				return createCurrencyUnitTypeAdapter();
			}
			@Override
			public Adapter caseDataChangeFilter(DataChangeFilter object) {
				return createDataChangeFilterAdapter();
			}
			@Override
			public Adapter caseDataChangeNotification(DataChangeNotification object) {
				return createDataChangeNotificationAdapter();
			}
			@Override
			public Adapter caseDatagramConnectionTransportDataType(DatagramConnectionTransportDataType object) {
				return createDatagramConnectionTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseDatagramWriterGroupTransportDataType(DatagramWriterGroupTransportDataType object) {
				return createDatagramWriterGroupTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseDataSetMetaDataType(DataSetMetaDataType object) {
				return createDataSetMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseDataSetReaderDataType(DataSetReaderDataType object) {
				return createDataSetReaderDataTypeAdapter();
			}
			@Override
			public Adapter caseDataSetReaderMessageDataType(DataSetReaderMessageDataType object) {
				return createDataSetReaderMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseDataSetReaderTransportDataType(DataSetReaderTransportDataType object) {
				return createDataSetReaderTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseDataSetWriterDataType(DataSetWriterDataType object) {
				return createDataSetWriterDataTypeAdapter();
			}
			@Override
			public Adapter caseDataSetWriterMessageDataType(DataSetWriterMessageDataType object) {
				return createDataSetWriterMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseDataSetWriterTransportDataType(DataSetWriterTransportDataType object) {
				return createDataSetWriterTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseDataTypeAttributes(DataTypeAttributes object) {
				return createDataTypeAttributesAdapter();
			}
			@Override
			public Adapter caseDataTypeDefinition(DataTypeDefinition object) {
				return createDataTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseDataTypeDescription(DataTypeDescription object) {
				return createDataTypeDescriptionAdapter();
			}
			@Override
			public Adapter caseDataTypeNode(DataTypeNode object) {
				return createDataTypeNodeAdapter();
			}
			@Override
			public Adapter caseDataTypeSchemaHeader(DataTypeSchemaHeader object) {
				return createDataTypeSchemaHeaderAdapter();
			}
			@Override
			public Adapter caseDataValue(DataValue object) {
				return createDataValueAdapter();
			}
			@Override
			public Adapter caseDecimalDataType(DecimalDataType object) {
				return createDecimalDataTypeAdapter();
			}
			@Override
			public Adapter caseDeleteAtTimeDetails(DeleteAtTimeDetails object) {
				return createDeleteAtTimeDetailsAdapter();
			}
			@Override
			public Adapter caseDeleteEventDetails(DeleteEventDetails object) {
				return createDeleteEventDetailsAdapter();
			}
			@Override
			public Adapter caseDeleteMonitoredItemsRequest(DeleteMonitoredItemsRequest object) {
				return createDeleteMonitoredItemsRequestAdapter();
			}
			@Override
			public Adapter caseDeleteMonitoredItemsResponse(DeleteMonitoredItemsResponse object) {
				return createDeleteMonitoredItemsResponseAdapter();
			}
			@Override
			public Adapter caseDeleteNodesItem(DeleteNodesItem object) {
				return createDeleteNodesItemAdapter();
			}
			@Override
			public Adapter caseDeleteNodesRequest(DeleteNodesRequest object) {
				return createDeleteNodesRequestAdapter();
			}
			@Override
			public Adapter caseDeleteNodesResponse(DeleteNodesResponse object) {
				return createDeleteNodesResponseAdapter();
			}
			@Override
			public Adapter caseDeleteRawModifiedDetails(DeleteRawModifiedDetails object) {
				return createDeleteRawModifiedDetailsAdapter();
			}
			@Override
			public Adapter caseDeleteReferencesItem(DeleteReferencesItem object) {
				return createDeleteReferencesItemAdapter();
			}
			@Override
			public Adapter caseDeleteReferencesRequest(DeleteReferencesRequest object) {
				return createDeleteReferencesRequestAdapter();
			}
			@Override
			public Adapter caseDeleteReferencesResponse(DeleteReferencesResponse object) {
				return createDeleteReferencesResponseAdapter();
			}
			@Override
			public Adapter caseDeleteSubscriptionsRequest(DeleteSubscriptionsRequest object) {
				return createDeleteSubscriptionsRequestAdapter();
			}
			@Override
			public Adapter caseDeleteSubscriptionsResponse(DeleteSubscriptionsResponse object) {
				return createDeleteSubscriptionsResponseAdapter();
			}
			@Override
			public Adapter caseDiagnosticInfo(DiagnosticInfo object) {
				return createDiagnosticInfoAdapter();
			}
			@Override
			public Adapter caseDiscoveryConfiguration(DiscoveryConfiguration object) {
				return createDiscoveryConfigurationAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDoubleComplexNumberType(DoubleComplexNumberType object) {
				return createDoubleComplexNumberTypeAdapter();
			}
			@Override
			public Adapter caseElementOperand(ElementOperand object) {
				return createElementOperandAdapter();
			}
			@Override
			public Adapter caseEndpointConfiguration(EndpointConfiguration object) {
				return createEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseEndpointDescription(EndpointDescription object) {
				return createEndpointDescriptionAdapter();
			}
			@Override
			public Adapter caseEndpointType(EndpointType object) {
				return createEndpointTypeAdapter();
			}
			@Override
			public Adapter caseEndpointUrlListDataType(EndpointUrlListDataType object) {
				return createEndpointUrlListDataTypeAdapter();
			}
			@Override
			public Adapter caseEnumDefinition(EnumDefinition object) {
				return createEnumDefinitionAdapter();
			}
			@Override
			public Adapter caseEnumDescription(EnumDescription object) {
				return createEnumDescriptionAdapter();
			}
			@Override
			public Adapter caseEnumField(EnumField object) {
				return createEnumFieldAdapter();
			}
			@Override
			public Adapter caseEnumValueType(EnumValueType object) {
				return createEnumValueTypeAdapter();
			}
			@Override
			public Adapter caseEUInformation(EUInformation object) {
				return createEUInformationAdapter();
			}
			@Override
			public Adapter caseEventFieldList(EventFieldList object) {
				return createEventFieldListAdapter();
			}
			@Override
			public Adapter caseEventFilter(EventFilter object) {
				return createEventFilterAdapter();
			}
			@Override
			public Adapter caseEventFilterResult(EventFilterResult object) {
				return createEventFilterResultAdapter();
			}
			@Override
			public Adapter caseEventNotificationList(EventNotificationList object) {
				return createEventNotificationListAdapter();
			}
			@Override
			public Adapter caseExpandedNodeId(ExpandedNodeId object) {
				return createExpandedNodeIdAdapter();
			}
			@Override
			public Adapter caseExtensionObject(ExtensionObject object) {
				return createExtensionObjectAdapter();
			}
			@Override
			public Adapter caseFieldMetaData(FieldMetaData object) {
				return createFieldMetaDataAdapter();
			}
			@Override
			public Adapter caseFieldTargetDataType(FieldTargetDataType object) {
				return createFieldTargetDataTypeAdapter();
			}
			@Override
			public Adapter caseFilterOperand(FilterOperand object) {
				return createFilterOperandAdapter();
			}
			@Override
			public Adapter caseFindServersOnNetworkRequest(FindServersOnNetworkRequest object) {
				return createFindServersOnNetworkRequestAdapter();
			}
			@Override
			public Adapter caseFindServersOnNetworkResponse(FindServersOnNetworkResponse object) {
				return createFindServersOnNetworkResponseAdapter();
			}
			@Override
			public Adapter caseFindServersRequest(FindServersRequest object) {
				return createFindServersRequestAdapter();
			}
			@Override
			public Adapter caseFindServersResponse(FindServersResponse object) {
				return createFindServersResponseAdapter();
			}
			@Override
			public Adapter caseFrame(Frame object) {
				return createFrameAdapter();
			}
			@Override
			public Adapter caseGenericAttributes(GenericAttributes object) {
				return createGenericAttributesAdapter();
			}
			@Override
			public Adapter caseGenericAttributeValue(GenericAttributeValue object) {
				return createGenericAttributeValueAdapter();
			}
			@Override
			public Adapter caseGetEndpointsRequest(GetEndpointsRequest object) {
				return createGetEndpointsRequestAdapter();
			}
			@Override
			public Adapter caseGetEndpointsResponse(GetEndpointsResponse object) {
				return createGetEndpointsResponseAdapter();
			}
			@Override
			public Adapter caseGuid(Guid object) {
				return createGuidAdapter();
			}
			@Override
			public Adapter caseHistoryData(HistoryData object) {
				return createHistoryDataAdapter();
			}
			@Override
			public Adapter caseHistoryEvent(HistoryEvent object) {
				return createHistoryEventAdapter();
			}
			@Override
			public Adapter caseHistoryEventFieldList(HistoryEventFieldList object) {
				return createHistoryEventFieldListAdapter();
			}
			@Override
			public Adapter caseHistoryModifiedData(HistoryModifiedData object) {
				return createHistoryModifiedDataAdapter();
			}
			@Override
			public Adapter caseHistoryReadDetails(HistoryReadDetails object) {
				return createHistoryReadDetailsAdapter();
			}
			@Override
			public Adapter caseHistoryReadRequest(HistoryReadRequest object) {
				return createHistoryReadRequestAdapter();
			}
			@Override
			public Adapter caseHistoryReadResponse(HistoryReadResponse object) {
				return createHistoryReadResponseAdapter();
			}
			@Override
			public Adapter caseHistoryReadResult(HistoryReadResult object) {
				return createHistoryReadResultAdapter();
			}
			@Override
			public Adapter caseHistoryReadValueId(HistoryReadValueId object) {
				return createHistoryReadValueIdAdapter();
			}
			@Override
			public Adapter caseHistoryUpdateDetails(HistoryUpdateDetails object) {
				return createHistoryUpdateDetailsAdapter();
			}
			@Override
			public Adapter caseHistoryUpdateRequest(HistoryUpdateRequest object) {
				return createHistoryUpdateRequestAdapter();
			}
			@Override
			public Adapter caseHistoryUpdateResponse(HistoryUpdateResponse object) {
				return createHistoryUpdateResponseAdapter();
			}
			@Override
			public Adapter caseHistoryUpdateResult(HistoryUpdateResult object) {
				return createHistoryUpdateResultAdapter();
			}
			@Override
			public Adapter caseIdentityMappingRuleType(IdentityMappingRuleType object) {
				return createIdentityMappingRuleTypeAdapter();
			}
			@Override
			public Adapter caseInstanceNode(InstanceNode object) {
				return createInstanceNodeAdapter();
			}
			@Override
			public Adapter caseIssuedIdentityToken(IssuedIdentityToken object) {
				return createIssuedIdentityTokenAdapter();
			}
			@Override
			public Adapter caseJsonDataSetReaderMessageDataType(JsonDataSetReaderMessageDataType object) {
				return createJsonDataSetReaderMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseJsonDataSetWriterMessageDataType(JsonDataSetWriterMessageDataType object) {
				return createJsonDataSetWriterMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseJsonWriterGroupMessageDataType(JsonWriterGroupMessageDataType object) {
				return createJsonWriterGroupMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseKeyValuePair(KeyValuePair object) {
				return createKeyValuePairAdapter();
			}
			@Override
			public Adapter caseListOfAddNodesItem(ListOfAddNodesItem object) {
				return createListOfAddNodesItemAdapter();
			}
			@Override
			public Adapter caseListOfAddNodesResult(ListOfAddNodesResult object) {
				return createListOfAddNodesResultAdapter();
			}
			@Override
			public Adapter caseListOfAddReferencesItem(ListOfAddReferencesItem object) {
				return createListOfAddReferencesItemAdapter();
			}
			@Override
			public Adapter caseListOfAliasNameDataType(ListOfAliasNameDataType object) {
				return createListOfAliasNameDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfApplicationDescription(ListOfApplicationDescription object) {
				return createListOfApplicationDescriptionAdapter();
			}
			@Override
			public Adapter caseListOfArgument(ListOfArgument object) {
				return createListOfArgumentAdapter();
			}
			@Override
			public Adapter caseListOfBoolean(ListOfBoolean object) {
				return createListOfBooleanAdapter();
			}
			@Override
			public Adapter caseListOfBrokerConnectionTransportDataType(ListOfBrokerConnectionTransportDataType object) {
				return createListOfBrokerConnectionTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfBrokerDataSetReaderTransportDataType(ListOfBrokerDataSetReaderTransportDataType object) {
				return createListOfBrokerDataSetReaderTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfBrokerDataSetWriterTransportDataType(ListOfBrokerDataSetWriterTransportDataType object) {
				return createListOfBrokerDataSetWriterTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfBrokerTransportQualityOfService(ListOfBrokerTransportQualityOfService object) {
				return createListOfBrokerTransportQualityOfServiceAdapter();
			}
			@Override
			public Adapter caseListOfBrokerWriterGroupTransportDataType(ListOfBrokerWriterGroupTransportDataType object) {
				return createListOfBrokerWriterGroupTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfBrowseDescription(ListOfBrowseDescription object) {
				return createListOfBrowseDescriptionAdapter();
			}
			@Override
			public Adapter caseListOfBrowsePath(ListOfBrowsePath object) {
				return createListOfBrowsePathAdapter();
			}
			@Override
			public Adapter caseListOfBrowsePathResult(ListOfBrowsePathResult object) {
				return createListOfBrowsePathResultAdapter();
			}
			@Override
			public Adapter caseListOfBrowsePathTarget(ListOfBrowsePathTarget object) {
				return createListOfBrowsePathTargetAdapter();
			}
			@Override
			public Adapter caseListOfBrowseResult(ListOfBrowseResult object) {
				return createListOfBrowseResultAdapter();
			}
			@Override
			public Adapter caseListOfByte(ListOfByte object) {
				return createListOfByteAdapter();
			}
			@Override
			public Adapter caseListOfByteString(ListOfByteString object) {
				return createListOfByteStringAdapter();
			}
			@Override
			public Adapter caseListOfCallMethodRequest(ListOfCallMethodRequest object) {
				return createListOfCallMethodRequestAdapter();
			}
			@Override
			public Adapter caseListOfCallMethodResult(ListOfCallMethodResult object) {
				return createListOfCallMethodResultAdapter();
			}
			@Override
			public Adapter caseListOfCartesianCoordinates(ListOfCartesianCoordinates object) {
				return createListOfCartesianCoordinatesAdapter();
			}
			@Override
			public Adapter caseListOfConfigurationVersionDataType(ListOfConfigurationVersionDataType object) {
				return createListOfConfigurationVersionDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfConnectionTransportDataType(ListOfConnectionTransportDataType object) {
				return createListOfConnectionTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfContentFilter(ListOfContentFilter object) {
				return createListOfContentFilterAdapter();
			}
			@Override
			public Adapter caseListOfContentFilterElement(ListOfContentFilterElement object) {
				return createListOfContentFilterElementAdapter();
			}
			@Override
			public Adapter caseListOfContentFilterElementResult(ListOfContentFilterElementResult object) {
				return createListOfContentFilterElementResultAdapter();
			}
			@Override
			public Adapter caseListOfCurrencyUnitType(ListOfCurrencyUnitType object) {
				return createListOfCurrencyUnitTypeAdapter();
			}
			@Override
			public Adapter caseListOfDatagramConnectionTransportDataType(ListOfDatagramConnectionTransportDataType object) {
				return createListOfDatagramConnectionTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfDatagramWriterGroupTransportDataType(ListOfDatagramWriterGroupTransportDataType object) {
				return createListOfDatagramWriterGroupTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfDataSetFieldContentMask(ListOfDataSetFieldContentMask object) {
				return createListOfDataSetFieldContentMaskAdapter();
			}
			@Override
			public Adapter caseListOfDataSetMetaDataType(ListOfDataSetMetaDataType object) {
				return createListOfDataSetMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfDataSetOrderingType(ListOfDataSetOrderingType object) {
				return createListOfDataSetOrderingTypeAdapter();
			}
			@Override
			public Adapter caseListOfDataSetReaderDataType(ListOfDataSetReaderDataType object) {
				return createListOfDataSetReaderDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfDataSetReaderMessageDataType(ListOfDataSetReaderMessageDataType object) {
				return createListOfDataSetReaderMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfDataSetReaderTransportDataType(ListOfDataSetReaderTransportDataType object) {
				return createListOfDataSetReaderTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfDataSetWriterDataType(ListOfDataSetWriterDataType object) {
				return createListOfDataSetWriterDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfDataSetWriterMessageDataType(ListOfDataSetWriterMessageDataType object) {
				return createListOfDataSetWriterMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfDataSetWriterTransportDataType(ListOfDataSetWriterTransportDataType object) {
				return createListOfDataSetWriterTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfDataTypeDefinition(ListOfDataTypeDefinition object) {
				return createListOfDataTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseListOfDataTypeDescription(ListOfDataTypeDescription object) {
				return createListOfDataTypeDescriptionAdapter();
			}
			@Override
			public Adapter caseListOfDataTypeSchemaHeader(ListOfDataTypeSchemaHeader object) {
				return createListOfDataTypeSchemaHeaderAdapter();
			}
			@Override
			public Adapter caseListOfDataValue(ListOfDataValue object) {
				return createListOfDataValueAdapter();
			}
			@Override
			public Adapter caseListOfDateTime(ListOfDateTime object) {
				return createListOfDateTimeAdapter();
			}
			@Override
			public Adapter caseListOfDeleteNodesItem(ListOfDeleteNodesItem object) {
				return createListOfDeleteNodesItemAdapter();
			}
			@Override
			public Adapter caseListOfDeleteReferencesItem(ListOfDeleteReferencesItem object) {
				return createListOfDeleteReferencesItemAdapter();
			}
			@Override
			public Adapter caseListOfDiagnosticInfo(ListOfDiagnosticInfo object) {
				return createListOfDiagnosticInfoAdapter();
			}
			@Override
			public Adapter caseListOfDiagnosticsLevel(ListOfDiagnosticsLevel object) {
				return createListOfDiagnosticsLevelAdapter();
			}
			@Override
			public Adapter caseListOfDouble(ListOfDouble object) {
				return createListOfDoubleAdapter();
			}
			@Override
			public Adapter caseListOfEndpointConfiguration(ListOfEndpointConfiguration object) {
				return createListOfEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseListOfEndpointDescription(ListOfEndpointDescription object) {
				return createListOfEndpointDescriptionAdapter();
			}
			@Override
			public Adapter caseListOfEndpointType(ListOfEndpointType object) {
				return createListOfEndpointTypeAdapter();
			}
			@Override
			public Adapter caseListOfEndpointUrlListDataType(ListOfEndpointUrlListDataType object) {
				return createListOfEndpointUrlListDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfEnumDefinition(ListOfEnumDefinition object) {
				return createListOfEnumDefinitionAdapter();
			}
			@Override
			public Adapter caseListOfEnumDescription(ListOfEnumDescription object) {
				return createListOfEnumDescriptionAdapter();
			}
			@Override
			public Adapter caseListOfEnumField(ListOfEnumField object) {
				return createListOfEnumFieldAdapter();
			}
			@Override
			public Adapter caseListOfEnumValueType(ListOfEnumValueType object) {
				return createListOfEnumValueTypeAdapter();
			}
			@Override
			public Adapter caseListOfEventFieldList(ListOfEventFieldList object) {
				return createListOfEventFieldListAdapter();
			}
			@Override
			public Adapter caseListOfExpandedNodeId(ListOfExpandedNodeId object) {
				return createListOfExpandedNodeIdAdapter();
			}
			@Override
			public Adapter caseListOfExtensionObject(ListOfExtensionObject object) {
				return createListOfExtensionObjectAdapter();
			}
			@Override
			public Adapter caseListOfFieldMetaData(ListOfFieldMetaData object) {
				return createListOfFieldMetaDataAdapter();
			}
			@Override
			public Adapter caseListOfFieldTargetDataType(ListOfFieldTargetDataType object) {
				return createListOfFieldTargetDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfFloat(ListOfFloat object) {
				return createListOfFloatAdapter();
			}
			@Override
			public Adapter caseListOfFrame(ListOfFrame object) {
				return createListOfFrameAdapter();
			}
			@Override
			public Adapter caseListOfGenericAttributeValue(ListOfGenericAttributeValue object) {
				return createListOfGenericAttributeValueAdapter();
			}
			@Override
			public Adapter caseListOfGuid(ListOfGuid object) {
				return createListOfGuidAdapter();
			}
			@Override
			public Adapter caseListOfHistoryEventFieldList(ListOfHistoryEventFieldList object) {
				return createListOfHistoryEventFieldListAdapter();
			}
			@Override
			public Adapter caseListOfHistoryReadResult(ListOfHistoryReadResult object) {
				return createListOfHistoryReadResultAdapter();
			}
			@Override
			public Adapter caseListOfHistoryReadValueId(ListOfHistoryReadValueId object) {
				return createListOfHistoryReadValueIdAdapter();
			}
			@Override
			public Adapter caseListOfHistoryUpdateResult(ListOfHistoryUpdateResult object) {
				return createListOfHistoryUpdateResultAdapter();
			}
			@Override
			public Adapter caseListOfIdentityCriteriaType(ListOfIdentityCriteriaType object) {
				return createListOfIdentityCriteriaTypeAdapter();
			}
			@Override
			public Adapter caseListOfIdentityMappingRuleType(ListOfIdentityMappingRuleType object) {
				return createListOfIdentityMappingRuleTypeAdapter();
			}
			@Override
			public Adapter caseListOfIdType(ListOfIdType object) {
				return createListOfIdTypeAdapter();
			}
			@Override
			public Adapter caseListOfInt16(ListOfInt16 object) {
				return createListOfInt16Adapter();
			}
			@Override
			public Adapter caseListOfInt32(ListOfInt32 object) {
				return createListOfInt32Adapter();
			}
			@Override
			public Adapter caseListOfInt64(ListOfInt64 object) {
				return createListOfInt64Adapter();
			}
			@Override
			public Adapter caseListOfJsonDataSetMessageContentMask(ListOfJsonDataSetMessageContentMask object) {
				return createListOfJsonDataSetMessageContentMaskAdapter();
			}
			@Override
			public Adapter caseListOfJsonDataSetReaderMessageDataType(ListOfJsonDataSetReaderMessageDataType object) {
				return createListOfJsonDataSetReaderMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfJsonDataSetWriterMessageDataType(ListOfJsonDataSetWriterMessageDataType object) {
				return createListOfJsonDataSetWriterMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfJsonNetworkMessageContentMask(ListOfJsonNetworkMessageContentMask object) {
				return createListOfJsonNetworkMessageContentMaskAdapter();
			}
			@Override
			public Adapter caseListOfJsonWriterGroupMessageDataType(ListOfJsonWriterGroupMessageDataType object) {
				return createListOfJsonWriterGroupMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfKeyValuePair(ListOfKeyValuePair object) {
				return createListOfKeyValuePairAdapter();
			}
			@Override
			public Adapter caseListOfLocalizedText(ListOfLocalizedText object) {
				return createListOfLocalizedTextAdapter();
			}
			@Override
			public Adapter caseListOfModelChangeStructureDataType(ListOfModelChangeStructureDataType object) {
				return createListOfModelChangeStructureDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfModificationInfo(ListOfModificationInfo object) {
				return createListOfModificationInfoAdapter();
			}
			@Override
			public Adapter caseListOfMonitoredItemCreateRequest(ListOfMonitoredItemCreateRequest object) {
				return createListOfMonitoredItemCreateRequestAdapter();
			}
			@Override
			public Adapter caseListOfMonitoredItemCreateResult(ListOfMonitoredItemCreateResult object) {
				return createListOfMonitoredItemCreateResultAdapter();
			}
			@Override
			public Adapter caseListOfMonitoredItemModifyRequest(ListOfMonitoredItemModifyRequest object) {
				return createListOfMonitoredItemModifyRequestAdapter();
			}
			@Override
			public Adapter caseListOfMonitoredItemModifyResult(ListOfMonitoredItemModifyResult object) {
				return createListOfMonitoredItemModifyResultAdapter();
			}
			@Override
			public Adapter caseListOfMonitoredItemNotification(ListOfMonitoredItemNotification object) {
				return createListOfMonitoredItemNotificationAdapter();
			}
			@Override
			public Adapter caseListOfNetworkAddressDataType(ListOfNetworkAddressDataType object) {
				return createListOfNetworkAddressDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfNetworkAddressUrlDataType(ListOfNetworkAddressUrlDataType object) {
				return createListOfNetworkAddressUrlDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfNetworkGroupDataType(ListOfNetworkGroupDataType object) {
				return createListOfNetworkGroupDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfNode(ListOfNode object) {
				return createListOfNodeAdapter();
			}
			@Override
			public Adapter caseListOfNodeId(ListOfNodeId object) {
				return createListOfNodeIdAdapter();
			}
			@Override
			public Adapter caseListOfNodeReference(ListOfNodeReference object) {
				return createListOfNodeReferenceAdapter();
			}
			@Override
			public Adapter caseListOfNodeTypeDescription(ListOfNodeTypeDescription object) {
				return createListOfNodeTypeDescriptionAdapter();
			}
			@Override
			public Adapter caseListOfOpenFileMode(ListOfOpenFileMode object) {
				return createListOfOpenFileModeAdapter();
			}
			@Override
			public Adapter caseListOfOptionSet(ListOfOptionSet object) {
				return createListOfOptionSetAdapter();
			}
			@Override
			public Adapter caseListOfOrientation(ListOfOrientation object) {
				return createListOfOrientationAdapter();
			}
			@Override
			public Adapter caseListOfOverrideValueHandling(ListOfOverrideValueHandling object) {
				return createListOfOverrideValueHandlingAdapter();
			}
			@Override
			public Adapter caseListOfParsingResult(ListOfParsingResult object) {
				return createListOfParsingResultAdapter();
			}
			@Override
			public Adapter caseListOfPublishedDataItemsDataType(ListOfPublishedDataItemsDataType object) {
				return createListOfPublishedDataItemsDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfPublishedDataSetDataType(ListOfPublishedDataSetDataType object) {
				return createListOfPublishedDataSetDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfPublishedDataSetSourceDataType(ListOfPublishedDataSetSourceDataType object) {
				return createListOfPublishedDataSetSourceDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfPublishedEventsDataType(ListOfPublishedEventsDataType object) {
				return createListOfPublishedEventsDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfPublishedVariableDataType(ListOfPublishedVariableDataType object) {
				return createListOfPublishedVariableDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfPubSubConfigurationDataType(ListOfPubSubConfigurationDataType object) {
				return createListOfPubSubConfigurationDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfPubSubConnectionDataType(ListOfPubSubConnectionDataType object) {
				return createListOfPubSubConnectionDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfPubSubDiagnosticsCounterClassification(ListOfPubSubDiagnosticsCounterClassification object) {
				return createListOfPubSubDiagnosticsCounterClassificationAdapter();
			}
			@Override
			public Adapter caseListOfPubSubGroupDataType(ListOfPubSubGroupDataType object) {
				return createListOfPubSubGroupDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfPubSubState(ListOfPubSubState object) {
				return createListOfPubSubStateAdapter();
			}
			@Override
			public Adapter caseListOfQualifiedName(ListOfQualifiedName object) {
				return createListOfQualifiedNameAdapter();
			}
			@Override
			public Adapter caseListOfQueryDataDescription(ListOfQueryDataDescription object) {
				return createListOfQueryDataDescriptionAdapter();
			}
			@Override
			public Adapter caseListOfQueryDataSet(ListOfQueryDataSet object) {
				return createListOfQueryDataSetAdapter();
			}
			@Override
			public Adapter caseListOfRationalNumber(ListOfRationalNumber object) {
				return createListOfRationalNumberAdapter();
			}
			@Override
			public Adapter caseListOfReaderGroupDataType(ListOfReaderGroupDataType object) {
				return createListOfReaderGroupDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfReaderGroupMessageDataType(ListOfReaderGroupMessageDataType object) {
				return createListOfReaderGroupMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfReaderGroupTransportDataType(ListOfReaderGroupTransportDataType object) {
				return createListOfReaderGroupTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfReadValueId(ListOfReadValueId object) {
				return createListOfReadValueIdAdapter();
			}
			@Override
			public Adapter caseListOfRedundantServerDataType(ListOfRedundantServerDataType object) {
				return createListOfRedundantServerDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfReferenceDescription(ListOfReferenceDescription object) {
				return createListOfReferenceDescriptionAdapter();
			}
			@Override
			public Adapter caseListOfReferenceNode(ListOfReferenceNode object) {
				return createListOfReferenceNodeAdapter();
			}
			@Override
			public Adapter caseListOfRegisteredServer(ListOfRegisteredServer object) {
				return createListOfRegisteredServerAdapter();
			}
			@Override
			public Adapter caseListOfRelativePathElement(ListOfRelativePathElement object) {
				return createListOfRelativePathElementAdapter();
			}
			@Override
			public Adapter caseListOfRolePermissionType(ListOfRolePermissionType object) {
				return createListOfRolePermissionTypeAdapter();
			}
			@Override
			public Adapter caseListOfSamplingIntervalDiagnosticsDataType(ListOfSamplingIntervalDiagnosticsDataType object) {
				return createListOfSamplingIntervalDiagnosticsDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfSByte(ListOfSByte object) {
				return createListOfSByteAdapter();
			}
			@Override
			public Adapter caseListOfSemanticChangeStructureDataType(ListOfSemanticChangeStructureDataType object) {
				return createListOfSemanticChangeStructureDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfServerOnNetwork(ListOfServerOnNetwork object) {
				return createListOfServerOnNetworkAdapter();
			}
			@Override
			public Adapter caseListOfSessionDiagnosticsDataType(ListOfSessionDiagnosticsDataType object) {
				return createListOfSessionDiagnosticsDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfSessionSecurityDiagnosticsDataType(ListOfSessionSecurityDiagnosticsDataType object) {
				return createListOfSessionSecurityDiagnosticsDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfSignedSoftwareCertificate(ListOfSignedSoftwareCertificate object) {
				return createListOfSignedSoftwareCertificateAdapter();
			}
			@Override
			public Adapter caseListOfSimpleAttributeOperand(ListOfSimpleAttributeOperand object) {
				return createListOfSimpleAttributeOperandAdapter();
			}
			@Override
			public Adapter caseListOfSimpleTypeDescription(ListOfSimpleTypeDescription object) {
				return createListOfSimpleTypeDescriptionAdapter();
			}
			@Override
			public Adapter caseListOfStatusCode(ListOfStatusCode object) {
				return createListOfStatusCodeAdapter();
			}
			@Override
			public Adapter caseListOfStatusResult(ListOfStatusResult object) {
				return createListOfStatusResultAdapter();
			}
			@Override
			public Adapter caseListOfString(ListOfString object) {
				return createListOfStringAdapter();
			}
			@Override
			public Adapter caseListOfStructureDefinition(ListOfStructureDefinition object) {
				return createListOfStructureDefinitionAdapter();
			}
			@Override
			public Adapter caseListOfStructureDescription(ListOfStructureDescription object) {
				return createListOfStructureDescriptionAdapter();
			}
			@Override
			public Adapter caseListOfStructureField(ListOfStructureField object) {
				return createListOfStructureFieldAdapter();
			}
			@Override
			public Adapter caseListOfSubscribedDataSetDataType(ListOfSubscribedDataSetDataType object) {
				return createListOfSubscribedDataSetDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfSubscribedDataSetMirrorDataType(ListOfSubscribedDataSetMirrorDataType object) {
				return createListOfSubscribedDataSetMirrorDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfSubscriptionAcknowledgement(ListOfSubscriptionAcknowledgement object) {
				return createListOfSubscriptionAcknowledgementAdapter();
			}
			@Override
			public Adapter caseListOfSubscriptionDiagnosticsDataType(ListOfSubscriptionDiagnosticsDataType object) {
				return createListOfSubscriptionDiagnosticsDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfTargetVariablesDataType(ListOfTargetVariablesDataType object) {
				return createListOfTargetVariablesDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfThreeDCartesianCoordinates(ListOfThreeDCartesianCoordinates object) {
				return createListOfThreeDCartesianCoordinatesAdapter();
			}
			@Override
			public Adapter caseListOfThreeDFrame(ListOfThreeDFrame object) {
				return createListOfThreeDFrameAdapter();
			}
			@Override
			public Adapter caseListOfThreeDOrientation(ListOfThreeDOrientation object) {
				return createListOfThreeDOrientationAdapter();
			}
			@Override
			public Adapter caseListOfThreeDVector(ListOfThreeDVector object) {
				return createListOfThreeDVectorAdapter();
			}
			@Override
			public Adapter caseListOfTimeZoneDataType(ListOfTimeZoneDataType object) {
				return createListOfTimeZoneDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfTransferResult(ListOfTransferResult object) {
				return createListOfTransferResultAdapter();
			}
			@Override
			public Adapter caseListOfTrustListDataType(ListOfTrustListDataType object) {
				return createListOfTrustListDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfUABinaryFileDataType(ListOfUABinaryFileDataType object) {
				return createListOfUABinaryFileDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfUadpDataSetMessageContentMask(ListOfUadpDataSetMessageContentMask object) {
				return createListOfUadpDataSetMessageContentMaskAdapter();
			}
			@Override
			public Adapter caseListOfUadpDataSetReaderMessageDataType(ListOfUadpDataSetReaderMessageDataType object) {
				return createListOfUadpDataSetReaderMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfUadpDataSetWriterMessageDataType(ListOfUadpDataSetWriterMessageDataType object) {
				return createListOfUadpDataSetWriterMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfUadpNetworkMessageContentMask(ListOfUadpNetworkMessageContentMask object) {
				return createListOfUadpNetworkMessageContentMaskAdapter();
			}
			@Override
			public Adapter caseListOfUadpWriterGroupMessageDataType(ListOfUadpWriterGroupMessageDataType object) {
				return createListOfUadpWriterGroupMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfUInt16(ListOfUInt16 object) {
				return createListOfUInt16Adapter();
			}
			@Override
			public Adapter caseListOfUInt32(ListOfUInt32 object) {
				return createListOfUInt32Adapter();
			}
			@Override
			public Adapter caseListOfUInt64(ListOfUInt64 object) {
				return createListOfUInt64Adapter();
			}
			@Override
			public Adapter caseListOfUnion(ListOfUnion object) {
				return createListOfUnionAdapter();
			}
			@Override
			public Adapter caseListOfUserTokenPolicy(ListOfUserTokenPolicy object) {
				return createListOfUserTokenPolicyAdapter();
			}
			@Override
			public Adapter caseListOfVariant(ListOfVariant object) {
				return createListOfVariantAdapter();
			}
			@Override
			public Adapter caseListOfVector(ListOfVector object) {
				return createListOfVectorAdapter();
			}
			@Override
			public Adapter caseListOfWriterGroupDataType(ListOfWriterGroupDataType object) {
				return createListOfWriterGroupDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfWriterGroupMessageDataType(ListOfWriterGroupMessageDataType object) {
				return createListOfWriterGroupMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfWriterGroupTransportDataType(ListOfWriterGroupTransportDataType object) {
				return createListOfWriterGroupTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseListOfWriteValue(ListOfWriteValue object) {
				return createListOfWriteValueAdapter();
			}
			@Override
			public Adapter caseListOfXmlElement(ListOfXmlElement object) {
				return createListOfXmlElementAdapter();
			}
			@Override
			public Adapter caseLiteralOperand(LiteralOperand object) {
				return createLiteralOperandAdapter();
			}
			@Override
			public Adapter caseLocalizedText(LocalizedText object) {
				return createLocalizedTextAdapter();
			}
			@Override
			public Adapter caseMdnsDiscoveryConfiguration(MdnsDiscoveryConfiguration object) {
				return createMdnsDiscoveryConfigurationAdapter();
			}
			@Override
			public Adapter caseMethodAttributes(MethodAttributes object) {
				return createMethodAttributesAdapter();
			}
			@Override
			public Adapter caseMethodNode(MethodNode object) {
				return createMethodNodeAdapter();
			}
			@Override
			public Adapter caseModelChangeStructureDataType(ModelChangeStructureDataType object) {
				return createModelChangeStructureDataTypeAdapter();
			}
			@Override
			public Adapter caseModificationInfo(ModificationInfo object) {
				return createModificationInfoAdapter();
			}
			@Override
			public Adapter caseModifyMonitoredItemsRequest(ModifyMonitoredItemsRequest object) {
				return createModifyMonitoredItemsRequestAdapter();
			}
			@Override
			public Adapter caseModifyMonitoredItemsResponse(ModifyMonitoredItemsResponse object) {
				return createModifyMonitoredItemsResponseAdapter();
			}
			@Override
			public Adapter caseModifySubscriptionRequest(ModifySubscriptionRequest object) {
				return createModifySubscriptionRequestAdapter();
			}
			@Override
			public Adapter caseModifySubscriptionResponse(ModifySubscriptionResponse object) {
				return createModifySubscriptionResponseAdapter();
			}
			@Override
			public Adapter caseMonitoredItemCreateRequest(MonitoredItemCreateRequest object) {
				return createMonitoredItemCreateRequestAdapter();
			}
			@Override
			public Adapter caseMonitoredItemCreateResult(MonitoredItemCreateResult object) {
				return createMonitoredItemCreateResultAdapter();
			}
			@Override
			public Adapter caseMonitoredItemModifyRequest(MonitoredItemModifyRequest object) {
				return createMonitoredItemModifyRequestAdapter();
			}
			@Override
			public Adapter caseMonitoredItemModifyResult(MonitoredItemModifyResult object) {
				return createMonitoredItemModifyResultAdapter();
			}
			@Override
			public Adapter caseMonitoredItemNotification(MonitoredItemNotification object) {
				return createMonitoredItemNotificationAdapter();
			}
			@Override
			public Adapter caseMonitoringFilter(MonitoringFilter object) {
				return createMonitoringFilterAdapter();
			}
			@Override
			public Adapter caseMonitoringFilterResult(MonitoringFilterResult object) {
				return createMonitoringFilterResultAdapter();
			}
			@Override
			public Adapter caseMonitoringParameters(MonitoringParameters object) {
				return createMonitoringParametersAdapter();
			}
			@Override
			public Adapter caseNetworkAddressDataType(NetworkAddressDataType object) {
				return createNetworkAddressDataTypeAdapter();
			}
			@Override
			public Adapter caseNetworkAddressUrlDataType(NetworkAddressUrlDataType object) {
				return createNetworkAddressUrlDataTypeAdapter();
			}
			@Override
			public Adapter caseNetworkGroupDataType(NetworkGroupDataType object) {
				return createNetworkGroupDataTypeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseNodeAttributes(NodeAttributes object) {
				return createNodeAttributesAdapter();
			}
			@Override
			public Adapter caseNodeId(NodeId object) {
				return createNodeIdAdapter();
			}
			@Override
			public Adapter caseNodeReference(NodeReference object) {
				return createNodeReferenceAdapter();
			}
			@Override
			public Adapter caseNodeTypeDescription(NodeTypeDescription object) {
				return createNodeTypeDescriptionAdapter();
			}
			@Override
			public Adapter caseNotificationData(NotificationData object) {
				return createNotificationDataAdapter();
			}
			@Override
			public Adapter caseNotificationMessage(NotificationMessage object) {
				return createNotificationMessageAdapter();
			}
			@Override
			public Adapter caseObjectAttributes(ObjectAttributes object) {
				return createObjectAttributesAdapter();
			}
			@Override
			public Adapter caseObjectNode(ObjectNode object) {
				return createObjectNodeAdapter();
			}
			@Override
			public Adapter caseObjectTypeAttributes(ObjectTypeAttributes object) {
				return createObjectTypeAttributesAdapter();
			}
			@Override
			public Adapter caseObjectTypeNode(ObjectTypeNode object) {
				return createObjectTypeNodeAdapter();
			}
			@Override
			public Adapter caseOpenSecureChannelRequest(OpenSecureChannelRequest object) {
				return createOpenSecureChannelRequestAdapter();
			}
			@Override
			public Adapter caseOpenSecureChannelResponse(OpenSecureChannelResponse object) {
				return createOpenSecureChannelResponseAdapter();
			}
			@Override
			public Adapter caseOptionSet(OptionSet object) {
				return createOptionSetAdapter();
			}
			@Override
			public Adapter caseOrientation(Orientation object) {
				return createOrientationAdapter();
			}
			@Override
			public Adapter caseParsingResult(ParsingResult object) {
				return createParsingResultAdapter();
			}
			@Override
			public Adapter caseProgramDiagnostic2DataType(ProgramDiagnostic2DataType object) {
				return createProgramDiagnostic2DataTypeAdapter();
			}
			@Override
			public Adapter caseProgramDiagnosticDataType(ProgramDiagnosticDataType object) {
				return createProgramDiagnosticDataTypeAdapter();
			}
			@Override
			public Adapter casePublishedDataItemsDataType(PublishedDataItemsDataType object) {
				return createPublishedDataItemsDataTypeAdapter();
			}
			@Override
			public Adapter casePublishedDataSetDataType(PublishedDataSetDataType object) {
				return createPublishedDataSetDataTypeAdapter();
			}
			@Override
			public Adapter casePublishedDataSetSourceDataType(PublishedDataSetSourceDataType object) {
				return createPublishedDataSetSourceDataTypeAdapter();
			}
			@Override
			public Adapter casePublishedEventsDataType(PublishedEventsDataType object) {
				return createPublishedEventsDataTypeAdapter();
			}
			@Override
			public Adapter casePublishedVariableDataType(PublishedVariableDataType object) {
				return createPublishedVariableDataTypeAdapter();
			}
			@Override
			public Adapter casePublishRequest(PublishRequest object) {
				return createPublishRequestAdapter();
			}
			@Override
			public Adapter casePublishResponse(PublishResponse object) {
				return createPublishResponseAdapter();
			}
			@Override
			public Adapter casePubSubConfigurationDataType(PubSubConfigurationDataType object) {
				return createPubSubConfigurationDataTypeAdapter();
			}
			@Override
			public Adapter casePubSubConnectionDataType(PubSubConnectionDataType object) {
				return createPubSubConnectionDataTypeAdapter();
			}
			@Override
			public Adapter casePubSubGroupDataType(PubSubGroupDataType object) {
				return createPubSubGroupDataTypeAdapter();
			}
			@Override
			public Adapter caseQualifiedName(QualifiedName object) {
				return createQualifiedNameAdapter();
			}
			@Override
			public Adapter caseQueryDataDescription(QueryDataDescription object) {
				return createQueryDataDescriptionAdapter();
			}
			@Override
			public Adapter caseQueryDataSet(QueryDataSet object) {
				return createQueryDataSetAdapter();
			}
			@Override
			public Adapter caseQueryFirstRequest(QueryFirstRequest object) {
				return createQueryFirstRequestAdapter();
			}
			@Override
			public Adapter caseQueryFirstResponse(QueryFirstResponse object) {
				return createQueryFirstResponseAdapter();
			}
			@Override
			public Adapter caseQueryNextRequest(QueryNextRequest object) {
				return createQueryNextRequestAdapter();
			}
			@Override
			public Adapter caseQueryNextResponse(QueryNextResponse object) {
				return createQueryNextResponseAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseRationalNumber(RationalNumber object) {
				return createRationalNumberAdapter();
			}
			@Override
			public Adapter caseReadAnnotationDataDetails(ReadAnnotationDataDetails object) {
				return createReadAnnotationDataDetailsAdapter();
			}
			@Override
			public Adapter caseReadAtTimeDetails(ReadAtTimeDetails object) {
				return createReadAtTimeDetailsAdapter();
			}
			@Override
			public Adapter caseReaderGroupDataType(ReaderGroupDataType object) {
				return createReaderGroupDataTypeAdapter();
			}
			@Override
			public Adapter caseReaderGroupMessageDataType(ReaderGroupMessageDataType object) {
				return createReaderGroupMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseReaderGroupTransportDataType(ReaderGroupTransportDataType object) {
				return createReaderGroupTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseReadEventDetails(ReadEventDetails object) {
				return createReadEventDetailsAdapter();
			}
			@Override
			public Adapter caseReadProcessedDetails(ReadProcessedDetails object) {
				return createReadProcessedDetailsAdapter();
			}
			@Override
			public Adapter caseReadRawModifiedDetails(ReadRawModifiedDetails object) {
				return createReadRawModifiedDetailsAdapter();
			}
			@Override
			public Adapter caseReadRequest(ReadRequest object) {
				return createReadRequestAdapter();
			}
			@Override
			public Adapter caseReadResponse(ReadResponse object) {
				return createReadResponseAdapter();
			}
			@Override
			public Adapter caseReadValueId(ReadValueId object) {
				return createReadValueIdAdapter();
			}
			@Override
			public Adapter caseRedundantServerDataType(RedundantServerDataType object) {
				return createRedundantServerDataTypeAdapter();
			}
			@Override
			public Adapter caseReferenceDescription(ReferenceDescription object) {
				return createReferenceDescriptionAdapter();
			}
			@Override
			public Adapter caseReferenceNode(ReferenceNode object) {
				return createReferenceNodeAdapter();
			}
			@Override
			public Adapter caseReferenceTypeAttributes(ReferenceTypeAttributes object) {
				return createReferenceTypeAttributesAdapter();
			}
			@Override
			public Adapter caseReferenceTypeNode(ReferenceTypeNode object) {
				return createReferenceTypeNodeAdapter();
			}
			@Override
			public Adapter caseRegisteredServer(RegisteredServer object) {
				return createRegisteredServerAdapter();
			}
			@Override
			public Adapter caseRegisterNodesRequest(RegisterNodesRequest object) {
				return createRegisterNodesRequestAdapter();
			}
			@Override
			public Adapter caseRegisterNodesResponse(RegisterNodesResponse object) {
				return createRegisterNodesResponseAdapter();
			}
			@Override
			public Adapter caseRegisterServer2Request(RegisterServer2Request object) {
				return createRegisterServer2RequestAdapter();
			}
			@Override
			public Adapter caseRegisterServer2Response(RegisterServer2Response object) {
				return createRegisterServer2ResponseAdapter();
			}
			@Override
			public Adapter caseRegisterServerRequest(RegisterServerRequest object) {
				return createRegisterServerRequestAdapter();
			}
			@Override
			public Adapter caseRegisterServerResponse(RegisterServerResponse object) {
				return createRegisterServerResponseAdapter();
			}
			@Override
			public Adapter caseRelativePath(RelativePath object) {
				return createRelativePathAdapter();
			}
			@Override
			public Adapter caseRelativePathElement(RelativePathElement object) {
				return createRelativePathElementAdapter();
			}
			@Override
			public Adapter caseRepublishRequest(RepublishRequest object) {
				return createRepublishRequestAdapter();
			}
			@Override
			public Adapter caseRepublishResponse(RepublishResponse object) {
				return createRepublishResponseAdapter();
			}
			@Override
			public Adapter caseRequestHeader(RequestHeader object) {
				return createRequestHeaderAdapter();
			}
			@Override
			public Adapter caseResponseHeader(ResponseHeader object) {
				return createResponseHeaderAdapter();
			}
			@Override
			public Adapter caseRolePermissionType(RolePermissionType object) {
				return createRolePermissionTypeAdapter();
			}
			@Override
			public Adapter caseSamplingIntervalDiagnosticsDataType(SamplingIntervalDiagnosticsDataType object) {
				return createSamplingIntervalDiagnosticsDataTypeAdapter();
			}
			@Override
			public Adapter caseSemanticChangeStructureDataType(SemanticChangeStructureDataType object) {
				return createSemanticChangeStructureDataTypeAdapter();
			}
			@Override
			public Adapter caseServerDiagnosticsSummaryDataType(ServerDiagnosticsSummaryDataType object) {
				return createServerDiagnosticsSummaryDataTypeAdapter();
			}
			@Override
			public Adapter caseServerOnNetwork(ServerOnNetwork object) {
				return createServerOnNetworkAdapter();
			}
			@Override
			public Adapter caseServerStatusDataType(ServerStatusDataType object) {
				return createServerStatusDataTypeAdapter();
			}
			@Override
			public Adapter caseServiceCounterDataType(ServiceCounterDataType object) {
				return createServiceCounterDataTypeAdapter();
			}
			@Override
			public Adapter caseServiceFault(ServiceFault object) {
				return createServiceFaultAdapter();
			}
			@Override
			public Adapter caseSessionDiagnosticsDataType(SessionDiagnosticsDataType object) {
				return createSessionDiagnosticsDataTypeAdapter();
			}
			@Override
			public Adapter caseSessionlessInvokeRequestType(SessionlessInvokeRequestType object) {
				return createSessionlessInvokeRequestTypeAdapter();
			}
			@Override
			public Adapter caseSessionlessInvokeResponseType(SessionlessInvokeResponseType object) {
				return createSessionlessInvokeResponseTypeAdapter();
			}
			@Override
			public Adapter caseSessionSecurityDiagnosticsDataType(SessionSecurityDiagnosticsDataType object) {
				return createSessionSecurityDiagnosticsDataTypeAdapter();
			}
			@Override
			public Adapter caseSetMonitoringModeRequest(SetMonitoringModeRequest object) {
				return createSetMonitoringModeRequestAdapter();
			}
			@Override
			public Adapter caseSetMonitoringModeResponse(SetMonitoringModeResponse object) {
				return createSetMonitoringModeResponseAdapter();
			}
			@Override
			public Adapter caseSetPublishingModeRequest(SetPublishingModeRequest object) {
				return createSetPublishingModeRequestAdapter();
			}
			@Override
			public Adapter caseSetPublishingModeResponse(SetPublishingModeResponse object) {
				return createSetPublishingModeResponseAdapter();
			}
			@Override
			public Adapter caseSetTriggeringRequest(SetTriggeringRequest object) {
				return createSetTriggeringRequestAdapter();
			}
			@Override
			public Adapter caseSetTriggeringResponse(SetTriggeringResponse object) {
				return createSetTriggeringResponseAdapter();
			}
			@Override
			public Adapter caseSignatureData(SignatureData object) {
				return createSignatureDataAdapter();
			}
			@Override
			public Adapter caseSignedSoftwareCertificate(SignedSoftwareCertificate object) {
				return createSignedSoftwareCertificateAdapter();
			}
			@Override
			public Adapter caseSimpleAttributeOperand(SimpleAttributeOperand object) {
				return createSimpleAttributeOperandAdapter();
			}
			@Override
			public Adapter caseSimpleTypeDescription(SimpleTypeDescription object) {
				return createSimpleTypeDescriptionAdapter();
			}
			@Override
			public Adapter caseStatusChangeNotification(StatusChangeNotification object) {
				return createStatusChangeNotificationAdapter();
			}
			@Override
			public Adapter caseStatusCode(StatusCode object) {
				return createStatusCodeAdapter();
			}
			@Override
			public Adapter caseStatusResult(StatusResult object) {
				return createStatusResultAdapter();
			}
			@Override
			public Adapter caseStructureDefinition(StructureDefinition object) {
				return createStructureDefinitionAdapter();
			}
			@Override
			public Adapter caseStructureDescription(StructureDescription object) {
				return createStructureDescriptionAdapter();
			}
			@Override
			public Adapter caseStructureField(StructureField object) {
				return createStructureFieldAdapter();
			}
			@Override
			public Adapter caseSubscribedDataSetDataType(SubscribedDataSetDataType object) {
				return createSubscribedDataSetDataTypeAdapter();
			}
			@Override
			public Adapter caseSubscribedDataSetMirrorDataType(SubscribedDataSetMirrorDataType object) {
				return createSubscribedDataSetMirrorDataTypeAdapter();
			}
			@Override
			public Adapter caseSubscriptionAcknowledgement(SubscriptionAcknowledgement object) {
				return createSubscriptionAcknowledgementAdapter();
			}
			@Override
			public Adapter caseSubscriptionDiagnosticsDataType(SubscriptionDiagnosticsDataType object) {
				return createSubscriptionDiagnosticsDataTypeAdapter();
			}
			@Override
			public Adapter caseTargetVariablesDataType(TargetVariablesDataType object) {
				return createTargetVariablesDataTypeAdapter();
			}
			@Override
			public Adapter caseThreeDCartesianCoordinates(ThreeDCartesianCoordinates object) {
				return createThreeDCartesianCoordinatesAdapter();
			}
			@Override
			public Adapter caseThreeDFrame(ThreeDFrame object) {
				return createThreeDFrameAdapter();
			}
			@Override
			public Adapter caseThreeDOrientation(ThreeDOrientation object) {
				return createThreeDOrientationAdapter();
			}
			@Override
			public Adapter caseThreeDVector(ThreeDVector object) {
				return createThreeDVectorAdapter();
			}
			@Override
			public Adapter caseTimeZoneDataType(TimeZoneDataType object) {
				return createTimeZoneDataTypeAdapter();
			}
			@Override
			public Adapter caseTransferResult(TransferResult object) {
				return createTransferResultAdapter();
			}
			@Override
			public Adapter caseTransferSubscriptionsRequest(TransferSubscriptionsRequest object) {
				return createTransferSubscriptionsRequestAdapter();
			}
			@Override
			public Adapter caseTransferSubscriptionsResponse(TransferSubscriptionsResponse object) {
				return createTransferSubscriptionsResponseAdapter();
			}
			@Override
			public Adapter caseTranslateBrowsePathsToNodeIdsRequest(TranslateBrowsePathsToNodeIdsRequest object) {
				return createTranslateBrowsePathsToNodeIdsRequestAdapter();
			}
			@Override
			public Adapter caseTranslateBrowsePathsToNodeIdsResponse(TranslateBrowsePathsToNodeIdsResponse object) {
				return createTranslateBrowsePathsToNodeIdsResponseAdapter();
			}
			@Override
			public Adapter caseTrustListDataType(TrustListDataType object) {
				return createTrustListDataTypeAdapter();
			}
			@Override
			public Adapter caseTypeNode(TypeNode object) {
				return createTypeNodeAdapter();
			}
			@Override
			public Adapter caseUABinaryFileDataType(UABinaryFileDataType object) {
				return createUABinaryFileDataTypeAdapter();
			}
			@Override
			public Adapter caseUadpDataSetReaderMessageDataType(UadpDataSetReaderMessageDataType object) {
				return createUadpDataSetReaderMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseUadpDataSetWriterMessageDataType(UadpDataSetWriterMessageDataType object) {
				return createUadpDataSetWriterMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseUadpWriterGroupMessageDataType(UadpWriterGroupMessageDataType object) {
				return createUadpWriterGroupMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseUnion(Union object) {
				return createUnionAdapter();
			}
			@Override
			public Adapter caseUnregisterNodesRequest(UnregisterNodesRequest object) {
				return createUnregisterNodesRequestAdapter();
			}
			@Override
			public Adapter caseUnregisterNodesResponse(UnregisterNodesResponse object) {
				return createUnregisterNodesResponseAdapter();
			}
			@Override
			public Adapter caseUpdateDataDetails(UpdateDataDetails object) {
				return createUpdateDataDetailsAdapter();
			}
			@Override
			public Adapter caseUpdateEventDetails(UpdateEventDetails object) {
				return createUpdateEventDetailsAdapter();
			}
			@Override
			public Adapter caseUpdateStructureDataDetails(UpdateStructureDataDetails object) {
				return createUpdateStructureDataDetailsAdapter();
			}
			@Override
			public Adapter caseUserIdentityToken(UserIdentityToken object) {
				return createUserIdentityTokenAdapter();
			}
			@Override
			public Adapter caseUserNameIdentityToken(UserNameIdentityToken object) {
				return createUserNameIdentityTokenAdapter();
			}
			@Override
			public Adapter caseUserTokenPolicy(UserTokenPolicy object) {
				return createUserTokenPolicyAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseVariableAttributes(VariableAttributes object) {
				return createVariableAttributesAdapter();
			}
			@Override
			public Adapter caseVariableNode(VariableNode object) {
				return createVariableNodeAdapter();
			}
			@Override
			public Adapter caseVariableTypeAttributes(VariableTypeAttributes object) {
				return createVariableTypeAttributesAdapter();
			}
			@Override
			public Adapter caseVariableTypeNode(VariableTypeNode object) {
				return createVariableTypeNodeAdapter();
			}
			@Override
			public Adapter caseVariant(Variant object) {
				return createVariantAdapter();
			}
			@Override
			public Adapter caseVector(Vector object) {
				return createVectorAdapter();
			}
			@Override
			public Adapter caseViewAttributes(ViewAttributes object) {
				return createViewAttributesAdapter();
			}
			@Override
			public Adapter caseViewDescription(ViewDescription object) {
				return createViewDescriptionAdapter();
			}
			@Override
			public Adapter caseViewNode(ViewNode object) {
				return createViewNodeAdapter();
			}
			@Override
			public Adapter caseWriteRequest(WriteRequest object) {
				return createWriteRequestAdapter();
			}
			@Override
			public Adapter caseWriteResponse(WriteResponse object) {
				return createWriteResponseAdapter();
			}
			@Override
			public Adapter caseWriterGroupDataType(WriterGroupDataType object) {
				return createWriterGroupDataTypeAdapter();
			}
			@Override
			public Adapter caseWriterGroupMessageDataType(WriterGroupMessageDataType object) {
				return createWriterGroupMessageDataTypeAdapter();
			}
			@Override
			public Adapter caseWriterGroupTransportDataType(WriterGroupTransportDataType object) {
				return createWriterGroupTransportDataTypeAdapter();
			}
			@Override
			public Adapter caseWriteValue(WriteValue object) {
				return createWriteValueAdapter();
			}
			@Override
			public Adapter caseX509IdentityToken(X509IdentityToken object) {
				return createX509IdentityTokenAdapter();
			}
			@Override
			public Adapter caseXmlElementType(XmlElementType object) {
				return createXmlElementTypeAdapter();
			}
			@Override
			public Adapter caseXVType(XVType object) {
				return createXVTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest <em>Activate Session Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ActivateSessionRequest
	 * @generated
	 */
	public Adapter createActivateSessionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionResponse <em>Activate Session Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ActivateSessionResponse
	 * @generated
	 */
	public Adapter createActivateSessionResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem <em>Add Nodes Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AddNodesItem
	 * @generated
	 */
	public Adapter createAddNodesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AddNodesRequest <em>Add Nodes Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AddNodesRequest
	 * @generated
	 */
	public Adapter createAddNodesRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AddNodesResponse <em>Add Nodes Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AddNodesResponse
	 * @generated
	 */
	public Adapter createAddNodesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AddNodesResult <em>Add Nodes Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AddNodesResult
	 * @generated
	 */
	public Adapter createAddNodesResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem <em>Add References Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AddReferencesItem
	 * @generated
	 */
	public Adapter createAddReferencesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AddReferencesRequest <em>Add References Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AddReferencesRequest
	 * @generated
	 */
	public Adapter createAddReferencesRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AddReferencesResponse <em>Add References Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AddReferencesResponse
	 * @generated
	 */
	public Adapter createAddReferencesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AggregateConfiguration <em>Aggregate Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AggregateConfiguration
	 * @generated
	 */
	public Adapter createAggregateConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AggregateFilter <em>Aggregate Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AggregateFilter
	 * @generated
	 */
	public Adapter createAggregateFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult <em>Aggregate Filter Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AggregateFilterResult
	 * @generated
	 */
	public Adapter createAggregateFilterResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AliasNameDataType <em>Alias Name Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AliasNameDataType
	 * @generated
	 */
	public Adapter createAliasNameDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AnonymousIdentityToken <em>Anonymous Identity Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AnonymousIdentityToken
	 * @generated
	 */
	public Adapter createAnonymousIdentityTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription <em>Application Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ApplicationDescription
	 * @generated
	 */
	public Adapter createApplicationDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AttributeOperand <em>Attribute Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AttributeOperand
	 * @generated
	 */
	public Adapter createAttributeOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.AxisInformation <em>Axis Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.AxisInformation
	 * @generated
	 */
	public Adapter createAxisInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BodyType
	 * @generated
	 */
	public Adapter createBodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType <em>Broker Connection Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType
	 * @generated
	 */
	public Adapter createBrokerConnectionTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrokerDataSetReaderTransportDataType <em>Broker Data Set Reader Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrokerDataSetReaderTransportDataType
	 * @generated
	 */
	public Adapter createBrokerDataSetReaderTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType <em>Broker Data Set Writer Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType
	 * @generated
	 */
	public Adapter createBrokerDataSetWriterTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType <em>Broker Writer Group Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType
	 * @generated
	 */
	public Adapter createBrokerWriterGroupTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription <em>Browse Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseDescription
	 * @generated
	 */
	public Adapter createBrowseDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrowseNextRequest <em>Browse Next Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseNextRequest
	 * @generated
	 */
	public Adapter createBrowseNextRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrowseNextResponse <em>Browse Next Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseNextResponse
	 * @generated
	 */
	public Adapter createBrowseNextResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrowsePath <em>Browse Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrowsePath
	 * @generated
	 */
	public Adapter createBrowsePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrowsePathResult <em>Browse Path Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrowsePathResult
	 * @generated
	 */
	public Adapter createBrowsePathResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrowsePathTarget <em>Browse Path Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrowsePathTarget
	 * @generated
	 */
	public Adapter createBrowsePathTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrowseRequest <em>Browse Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseRequest
	 * @generated
	 */
	public Adapter createBrowseRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrowseResponse <em>Browse Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseResponse
	 * @generated
	 */
	public Adapter createBrowseResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BrowseResult <em>Browse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseResult
	 * @generated
	 */
	public Adapter createBrowseResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.BuildInfo <em>Build Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.BuildInfo
	 * @generated
	 */
	public Adapter createBuildInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CallMethodRequest <em>Call Method Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CallMethodRequest
	 * @generated
	 */
	public Adapter createCallMethodRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult <em>Call Method Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CallMethodResult
	 * @generated
	 */
	public Adapter createCallMethodResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CallRequest <em>Call Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CallRequest
	 * @generated
	 */
	public Adapter createCallRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CallResponse <em>Call Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CallResponse
	 * @generated
	 */
	public Adapter createCallResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CancelRequest <em>Cancel Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CancelRequest
	 * @generated
	 */
	public Adapter createCancelRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CancelResponse <em>Cancel Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CancelResponse
	 * @generated
	 */
	public Adapter createCancelResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CartesianCoordinates <em>Cartesian Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CartesianCoordinates
	 * @generated
	 */
	public Adapter createCartesianCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ChannelSecurityToken <em>Channel Security Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ChannelSecurityToken
	 * @generated
	 */
	public Adapter createChannelSecurityTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CloseSecureChannelRequest <em>Close Secure Channel Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CloseSecureChannelRequest
	 * @generated
	 */
	public Adapter createCloseSecureChannelRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CloseSecureChannelResponse <em>Close Secure Channel Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CloseSecureChannelResponse
	 * @generated
	 */
	public Adapter createCloseSecureChannelResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CloseSessionRequest <em>Close Session Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CloseSessionRequest
	 * @generated
	 */
	public Adapter createCloseSessionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CloseSessionResponse <em>Close Session Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CloseSessionResponse
	 * @generated
	 */
	public Adapter createCloseSessionResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ComplexNumberType <em>Complex Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ComplexNumberType
	 * @generated
	 */
	public Adapter createComplexNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType <em>Configuration Version Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType
	 * @generated
	 */
	public Adapter createConfigurationVersionDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ConnectionTransportDataType <em>Connection Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ConnectionTransportDataType
	 * @generated
	 */
	public Adapter createConnectionTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ContentFilter <em>Content Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ContentFilter
	 * @generated
	 */
	public Adapter createContentFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElement <em>Content Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ContentFilterElement
	 * @generated
	 */
	public Adapter createContentFilterElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult <em>Content Filter Element Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ContentFilterElementResult
	 * @generated
	 */
	public Adapter createContentFilterElementResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ContentFilterResult <em>Content Filter Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ContentFilterResult
	 * @generated
	 */
	public Adapter createContentFilterResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsRequest <em>Create Monitored Items Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsRequest
	 * @generated
	 */
	public Adapter createCreateMonitoredItemsRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsResponse <em>Create Monitored Items Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsResponse
	 * @generated
	 */
	public Adapter createCreateMonitoredItemsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest <em>Create Session Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CreateSessionRequest
	 * @generated
	 */
	public Adapter createCreateSessionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse <em>Create Session Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CreateSessionResponse
	 * @generated
	 */
	public Adapter createCreateSessionResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest <em>Create Subscription Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest
	 * @generated
	 */
	public Adapter createCreateSubscriptionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionResponse <em>Create Subscription Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CreateSubscriptionResponse
	 * @generated
	 */
	public Adapter createCreateSubscriptionResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType <em>Currency Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.CurrencyUnitType
	 * @generated
	 */
	public Adapter createCurrencyUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter <em>Data Change Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataChangeFilter
	 * @generated
	 */
	public Adapter createDataChangeFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataChangeNotification <em>Data Change Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataChangeNotification
	 * @generated
	 */
	public Adapter createDataChangeNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType <em>Datagram Connection Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType
	 * @generated
	 */
	public Adapter createDatagramConnectionTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType <em>Datagram Writer Group Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType
	 * @generated
	 */
	public Adapter createDatagramWriterGroupTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType <em>Data Set Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetMetaDataType
	 * @generated
	 */
	public Adapter createDataSetMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType <em>Data Set Reader Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetReaderDataType
	 * @generated
	 */
	public Adapter createDataSetReaderDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderMessageDataType <em>Data Set Reader Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetReaderMessageDataType
	 * @generated
	 */
	public Adapter createDataSetReaderMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderTransportDataType <em>Data Set Reader Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetReaderTransportDataType
	 * @generated
	 */
	public Adapter createDataSetReaderTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType <em>Data Set Writer Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetWriterDataType
	 * @generated
	 */
	public Adapter createDataSetWriterDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterMessageDataType <em>Data Set Writer Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetWriterMessageDataType
	 * @generated
	 */
	public Adapter createDataSetWriterMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterTransportDataType <em>Data Set Writer Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetWriterTransportDataType
	 * @generated
	 */
	public Adapter createDataSetWriterTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataTypeAttributes <em>Data Type Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataTypeAttributes
	 * @generated
	 */
	public Adapter createDataTypeAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataTypeDefinition <em>Data Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataTypeDefinition
	 * @generated
	 */
	public Adapter createDataTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataTypeDescription <em>Data Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataTypeDescription
	 * @generated
	 */
	public Adapter createDataTypeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataTypeNode <em>Data Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataTypeNode
	 * @generated
	 */
	public Adapter createDataTypeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader <em>Data Type Schema Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader
	 * @generated
	 */
	public Adapter createDataTypeSchemaHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DataValue
	 * @generated
	 */
	public Adapter createDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DecimalDataType <em>Decimal Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DecimalDataType
	 * @generated
	 */
	public Adapter createDecimalDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteAtTimeDetails <em>Delete At Time Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteAtTimeDetails
	 * @generated
	 */
	public Adapter createDeleteAtTimeDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteEventDetails <em>Delete Event Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteEventDetails
	 * @generated
	 */
	public Adapter createDeleteEventDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteMonitoredItemsRequest <em>Delete Monitored Items Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteMonitoredItemsRequest
	 * @generated
	 */
	public Adapter createDeleteMonitoredItemsRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteMonitoredItemsResponse <em>Delete Monitored Items Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteMonitoredItemsResponse
	 * @generated
	 */
	public Adapter createDeleteMonitoredItemsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem <em>Delete Nodes Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteNodesItem
	 * @generated
	 */
	public Adapter createDeleteNodesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesRequest <em>Delete Nodes Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteNodesRequest
	 * @generated
	 */
	public Adapter createDeleteNodesRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesResponse <em>Delete Nodes Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteNodesResponse
	 * @generated
	 */
	public Adapter createDeleteNodesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails <em>Delete Raw Modified Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails
	 * @generated
	 */
	public Adapter createDeleteRawModifiedDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesItem <em>Delete References Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteReferencesItem
	 * @generated
	 */
	public Adapter createDeleteReferencesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest <em>Delete References Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest
	 * @generated
	 */
	public Adapter createDeleteReferencesRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteReferencesResponse <em>Delete References Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteReferencesResponse
	 * @generated
	 */
	public Adapter createDeleteReferencesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest <em>Delete Subscriptions Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest
	 * @generated
	 */
	public Adapter createDeleteSubscriptionsRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsResponse <em>Delete Subscriptions Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsResponse
	 * @generated
	 */
	public Adapter createDeleteSubscriptionsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo <em>Diagnostic Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DiagnosticInfo
	 * @generated
	 */
	public Adapter createDiagnosticInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DiscoveryConfiguration <em>Discovery Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DiscoveryConfiguration
	 * @generated
	 */
	public Adapter createDiscoveryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType <em>Double Complex Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType
	 * @generated
	 */
	public Adapter createDoubleComplexNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ElementOperand <em>Element Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ElementOperand
	 * @generated
	 */
	public Adapter createElementOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration <em>Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EndpointConfiguration
	 * @generated
	 */
	public Adapter createEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription <em>Endpoint Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EndpointDescription
	 * @generated
	 */
	public Adapter createEndpointDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EndpointType <em>Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EndpointType
	 * @generated
	 */
	public Adapter createEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType <em>Endpoint Url List Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType
	 * @generated
	 */
	public Adapter createEndpointUrlListDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EnumDefinition <em>Enum Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EnumDefinition
	 * @generated
	 */
	public Adapter createEnumDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EnumDescription <em>Enum Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EnumDescription
	 * @generated
	 */
	public Adapter createEnumDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EnumField
	 * @generated
	 */
	public Adapter createEnumFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EnumValueType <em>Enum Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EnumValueType
	 * @generated
	 */
	public Adapter createEnumValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EUInformation <em>EU Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EUInformation
	 * @generated
	 */
	public Adapter createEUInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EventFieldList <em>Event Field List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EventFieldList
	 * @generated
	 */
	public Adapter createEventFieldListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EventFilter <em>Event Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EventFilter
	 * @generated
	 */
	public Adapter createEventFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EventFilterResult <em>Event Filter Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EventFilterResult
	 * @generated
	 */
	public Adapter createEventFilterResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.EventNotificationList <em>Event Notification List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.EventNotificationList
	 * @generated
	 */
	public Adapter createEventNotificationListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ExpandedNodeId <em>Expanded Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ExpandedNodeId
	 * @generated
	 */
	public Adapter createExpandedNodeIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ExtensionObject <em>Extension Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ExtensionObject
	 * @generated
	 */
	public Adapter createExtensionObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData <em>Field Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.FieldMetaData
	 * @generated
	 */
	public Adapter createFieldMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType <em>Field Target Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.FieldTargetDataType
	 * @generated
	 */
	public Adapter createFieldTargetDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.FilterOperand <em>Filter Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.FilterOperand
	 * @generated
	 */
	public Adapter createFilterOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest <em>Find Servers On Network Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest
	 * @generated
	 */
	public Adapter createFindServersOnNetworkRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse <em>Find Servers On Network Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse
	 * @generated
	 */
	public Adapter createFindServersOnNetworkResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest <em>Find Servers Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.FindServersRequest
	 * @generated
	 */
	public Adapter createFindServersRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.FindServersResponse <em>Find Servers Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.FindServersResponse
	 * @generated
	 */
	public Adapter createFindServersResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.Frame
	 * @generated
	 */
	public Adapter createFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.GenericAttributes <em>Generic Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.GenericAttributes
	 * @generated
	 */
	public Adapter createGenericAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.GenericAttributeValue <em>Generic Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.GenericAttributeValue
	 * @generated
	 */
	public Adapter createGenericAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest <em>Get Endpoints Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.GetEndpointsRequest
	 * @generated
	 */
	public Adapter createGetEndpointsRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsResponse <em>Get Endpoints Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.GetEndpointsResponse
	 * @generated
	 */
	public Adapter createGetEndpointsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.Guid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.Guid
	 * @generated
	 */
	public Adapter createGuidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryData <em>History Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryData
	 * @generated
	 */
	public Adapter createHistoryDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryEvent <em>History Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryEvent
	 * @generated
	 */
	public Adapter createHistoryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryEventFieldList <em>History Event Field List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryEventFieldList
	 * @generated
	 */
	public Adapter createHistoryEventFieldListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryModifiedData <em>History Modified Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryModifiedData
	 * @generated
	 */
	public Adapter createHistoryModifiedDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryReadDetails <em>History Read Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryReadDetails
	 * @generated
	 */
	public Adapter createHistoryReadDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryReadRequest <em>History Read Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryReadRequest
	 * @generated
	 */
	public Adapter createHistoryReadRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryReadResponse <em>History Read Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryReadResponse
	 * @generated
	 */
	public Adapter createHistoryReadResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryReadResult <em>History Read Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryReadResult
	 * @generated
	 */
	public Adapter createHistoryReadResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId <em>History Read Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryReadValueId
	 * @generated
	 */
	public Adapter createHistoryReadValueIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateDetails <em>History Update Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryUpdateDetails
	 * @generated
	 */
	public Adapter createHistoryUpdateDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest <em>History Update Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest
	 * @generated
	 */
	public Adapter createHistoryUpdateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResponse <em>History Update Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryUpdateResponse
	 * @generated
	 */
	public Adapter createHistoryUpdateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult <em>History Update Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryUpdateResult
	 * @generated
	 */
	public Adapter createHistoryUpdateResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType <em>Identity Mapping Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType
	 * @generated
	 */
	public Adapter createIdentityMappingRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.InstanceNode <em>Instance Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.InstanceNode
	 * @generated
	 */
	public Adapter createInstanceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.IssuedIdentityToken <em>Issued Identity Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.IssuedIdentityToken
	 * @generated
	 */
	public Adapter createIssuedIdentityTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType <em>Json Data Set Reader Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType
	 * @generated
	 */
	public Adapter createJsonDataSetReaderMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType <em>Json Data Set Writer Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType
	 * @generated
	 */
	public Adapter createJsonDataSetWriterMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType <em>Json Writer Group Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType
	 * @generated
	 */
	public Adapter createJsonWriterGroupMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.KeyValuePair
	 * @generated
	 */
	public Adapter createKeyValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfAddNodesItem <em>List Of Add Nodes Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfAddNodesItem
	 * @generated
	 */
	public Adapter createListOfAddNodesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfAddNodesResult <em>List Of Add Nodes Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfAddNodesResult
	 * @generated
	 */
	public Adapter createListOfAddNodesResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfAddReferencesItem <em>List Of Add References Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfAddReferencesItem
	 * @generated
	 */
	public Adapter createListOfAddReferencesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfAliasNameDataType <em>List Of Alias Name Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfAliasNameDataType
	 * @generated
	 */
	public Adapter createListOfAliasNameDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfApplicationDescription <em>List Of Application Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfApplicationDescription
	 * @generated
	 */
	public Adapter createListOfApplicationDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfArgument <em>List Of Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfArgument
	 * @generated
	 */
	public Adapter createListOfArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBoolean <em>List Of Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBoolean
	 * @generated
	 */
	public Adapter createListOfBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBrokerConnectionTransportDataType <em>List Of Broker Connection Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBrokerConnectionTransportDataType
	 * @generated
	 */
	public Adapter createListOfBrokerConnectionTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetReaderTransportDataType <em>List Of Broker Data Set Reader Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetReaderTransportDataType
	 * @generated
	 */
	public Adapter createListOfBrokerDataSetReaderTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetWriterTransportDataType <em>List Of Broker Data Set Writer Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetWriterTransportDataType
	 * @generated
	 */
	public Adapter createListOfBrokerDataSetWriterTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBrokerTransportQualityOfService <em>List Of Broker Transport Quality Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBrokerTransportQualityOfService
	 * @generated
	 */
	public Adapter createListOfBrokerTransportQualityOfServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBrokerWriterGroupTransportDataType <em>List Of Broker Writer Group Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBrokerWriterGroupTransportDataType
	 * @generated
	 */
	public Adapter createListOfBrokerWriterGroupTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBrowseDescription <em>List Of Browse Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBrowseDescription
	 * @generated
	 */
	public Adapter createListOfBrowseDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBrowsePath <em>List Of Browse Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBrowsePath
	 * @generated
	 */
	public Adapter createListOfBrowsePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBrowsePathResult <em>List Of Browse Path Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBrowsePathResult
	 * @generated
	 */
	public Adapter createListOfBrowsePathResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBrowsePathTarget <em>List Of Browse Path Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBrowsePathTarget
	 * @generated
	 */
	public Adapter createListOfBrowsePathTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfBrowseResult <em>List Of Browse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfBrowseResult
	 * @generated
	 */
	public Adapter createListOfBrowseResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfByte <em>List Of Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfByte
	 * @generated
	 */
	public Adapter createListOfByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfByteString <em>List Of Byte String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfByteString
	 * @generated
	 */
	public Adapter createListOfByteStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfCallMethodRequest <em>List Of Call Method Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfCallMethodRequest
	 * @generated
	 */
	public Adapter createListOfCallMethodRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfCallMethodResult <em>List Of Call Method Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfCallMethodResult
	 * @generated
	 */
	public Adapter createListOfCallMethodResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfCartesianCoordinates <em>List Of Cartesian Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfCartesianCoordinates
	 * @generated
	 */
	public Adapter createListOfCartesianCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfConfigurationVersionDataType <em>List Of Configuration Version Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfConfigurationVersionDataType
	 * @generated
	 */
	public Adapter createListOfConfigurationVersionDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfConnectionTransportDataType <em>List Of Connection Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfConnectionTransportDataType
	 * @generated
	 */
	public Adapter createListOfConnectionTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfContentFilter <em>List Of Content Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfContentFilter
	 * @generated
	 */
	public Adapter createListOfContentFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfContentFilterElement <em>List Of Content Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfContentFilterElement
	 * @generated
	 */
	public Adapter createListOfContentFilterElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfContentFilterElementResult <em>List Of Content Filter Element Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfContentFilterElementResult
	 * @generated
	 */
	public Adapter createListOfContentFilterElementResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfCurrencyUnitType <em>List Of Currency Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfCurrencyUnitType
	 * @generated
	 */
	public Adapter createListOfCurrencyUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDatagramConnectionTransportDataType <em>List Of Datagram Connection Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDatagramConnectionTransportDataType
	 * @generated
	 */
	public Adapter createListOfDatagramConnectionTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDatagramWriterGroupTransportDataType <em>List Of Datagram Writer Group Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDatagramWriterGroupTransportDataType
	 * @generated
	 */
	public Adapter createListOfDatagramWriterGroupTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetFieldContentMask <em>List Of Data Set Field Content Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataSetFieldContentMask
	 * @generated
	 */
	public Adapter createListOfDataSetFieldContentMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetMetaDataType <em>List Of Data Set Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataSetMetaDataType
	 * @generated
	 */
	public Adapter createListOfDataSetMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetOrderingType <em>List Of Data Set Ordering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataSetOrderingType
	 * @generated
	 */
	public Adapter createListOfDataSetOrderingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderDataType <em>List Of Data Set Reader Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderDataType
	 * @generated
	 */
	public Adapter createListOfDataSetReaderDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderMessageDataType <em>List Of Data Set Reader Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderMessageDataType
	 * @generated
	 */
	public Adapter createListOfDataSetReaderMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderTransportDataType <em>List Of Data Set Reader Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderTransportDataType
	 * @generated
	 */
	public Adapter createListOfDataSetReaderTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterDataType <em>List Of Data Set Writer Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterDataType
	 * @generated
	 */
	public Adapter createListOfDataSetWriterDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterMessageDataType <em>List Of Data Set Writer Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterMessageDataType
	 * @generated
	 */
	public Adapter createListOfDataSetWriterMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterTransportDataType <em>List Of Data Set Writer Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterTransportDataType
	 * @generated
	 */
	public Adapter createListOfDataSetWriterTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataTypeDefinition <em>List Of Data Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataTypeDefinition
	 * @generated
	 */
	public Adapter createListOfDataTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataTypeDescription <em>List Of Data Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataTypeDescription
	 * @generated
	 */
	public Adapter createListOfDataTypeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataTypeSchemaHeader <em>List Of Data Type Schema Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataTypeSchemaHeader
	 * @generated
	 */
	public Adapter createListOfDataTypeSchemaHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDataValue <em>List Of Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDataValue
	 * @generated
	 */
	public Adapter createListOfDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDateTime <em>List Of Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDateTime
	 * @generated
	 */
	public Adapter createListOfDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDeleteNodesItem <em>List Of Delete Nodes Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDeleteNodesItem
	 * @generated
	 */
	public Adapter createListOfDeleteNodesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDeleteReferencesItem <em>List Of Delete References Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDeleteReferencesItem
	 * @generated
	 */
	public Adapter createListOfDeleteReferencesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo <em>List Of Diagnostic Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo
	 * @generated
	 */
	public Adapter createListOfDiagnosticInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDiagnosticsLevel <em>List Of Diagnostics Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDiagnosticsLevel
	 * @generated
	 */
	public Adapter createListOfDiagnosticsLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfDouble <em>List Of Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfDouble
	 * @generated
	 */
	public Adapter createListOfDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfEndpointConfiguration <em>List Of Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfEndpointConfiguration
	 * @generated
	 */
	public Adapter createListOfEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfEndpointDescription <em>List Of Endpoint Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfEndpointDescription
	 * @generated
	 */
	public Adapter createListOfEndpointDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfEndpointType <em>List Of Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfEndpointType
	 * @generated
	 */
	public Adapter createListOfEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfEndpointUrlListDataType <em>List Of Endpoint Url List Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfEndpointUrlListDataType
	 * @generated
	 */
	public Adapter createListOfEndpointUrlListDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfEnumDefinition <em>List Of Enum Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfEnumDefinition
	 * @generated
	 */
	public Adapter createListOfEnumDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfEnumDescription <em>List Of Enum Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfEnumDescription
	 * @generated
	 */
	public Adapter createListOfEnumDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfEnumField <em>List Of Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfEnumField
	 * @generated
	 */
	public Adapter createListOfEnumFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfEnumValueType <em>List Of Enum Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfEnumValueType
	 * @generated
	 */
	public Adapter createListOfEnumValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfEventFieldList <em>List Of Event Field List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfEventFieldList
	 * @generated
	 */
	public Adapter createListOfEventFieldListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfExpandedNodeId <em>List Of Expanded Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfExpandedNodeId
	 * @generated
	 */
	public Adapter createListOfExpandedNodeIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfExtensionObject <em>List Of Extension Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfExtensionObject
	 * @generated
	 */
	public Adapter createListOfExtensionObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfFieldMetaData <em>List Of Field Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfFieldMetaData
	 * @generated
	 */
	public Adapter createListOfFieldMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfFieldTargetDataType <em>List Of Field Target Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfFieldTargetDataType
	 * @generated
	 */
	public Adapter createListOfFieldTargetDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfFloat <em>List Of Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfFloat
	 * @generated
	 */
	public Adapter createListOfFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfFrame <em>List Of Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfFrame
	 * @generated
	 */
	public Adapter createListOfFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfGenericAttributeValue <em>List Of Generic Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfGenericAttributeValue
	 * @generated
	 */
	public Adapter createListOfGenericAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfGuid <em>List Of Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfGuid
	 * @generated
	 */
	public Adapter createListOfGuidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfHistoryEventFieldList <em>List Of History Event Field List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfHistoryEventFieldList
	 * @generated
	 */
	public Adapter createListOfHistoryEventFieldListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfHistoryReadResult <em>List Of History Read Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfHistoryReadResult
	 * @generated
	 */
	public Adapter createListOfHistoryReadResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfHistoryReadValueId <em>List Of History Read Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfHistoryReadValueId
	 * @generated
	 */
	public Adapter createListOfHistoryReadValueIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfHistoryUpdateResult <em>List Of History Update Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfHistoryUpdateResult
	 * @generated
	 */
	public Adapter createListOfHistoryUpdateResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfIdentityCriteriaType <em>List Of Identity Criteria Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfIdentityCriteriaType
	 * @generated
	 */
	public Adapter createListOfIdentityCriteriaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfIdentityMappingRuleType <em>List Of Identity Mapping Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfIdentityMappingRuleType
	 * @generated
	 */
	public Adapter createListOfIdentityMappingRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfIdType <em>List Of Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfIdType
	 * @generated
	 */
	public Adapter createListOfIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfInt16 <em>List Of Int16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfInt16
	 * @generated
	 */
	public Adapter createListOfInt16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfInt32 <em>List Of Int32</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfInt32
	 * @generated
	 */
	public Adapter createListOfInt32Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfInt64 <em>List Of Int64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfInt64
	 * @generated
	 */
	public Adapter createListOfInt64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetMessageContentMask <em>List Of Json Data Set Message Content Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetMessageContentMask
	 * @generated
	 */
	public Adapter createListOfJsonDataSetMessageContentMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetReaderMessageDataType <em>List Of Json Data Set Reader Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetReaderMessageDataType
	 * @generated
	 */
	public Adapter createListOfJsonDataSetReaderMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetWriterMessageDataType <em>List Of Json Data Set Writer Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetWriterMessageDataType
	 * @generated
	 */
	public Adapter createListOfJsonDataSetWriterMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfJsonNetworkMessageContentMask <em>List Of Json Network Message Content Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfJsonNetworkMessageContentMask
	 * @generated
	 */
	public Adapter createListOfJsonNetworkMessageContentMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfJsonWriterGroupMessageDataType <em>List Of Json Writer Group Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfJsonWriterGroupMessageDataType
	 * @generated
	 */
	public Adapter createListOfJsonWriterGroupMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair <em>List Of Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair
	 * @generated
	 */
	public Adapter createListOfKeyValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfLocalizedText <em>List Of Localized Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfLocalizedText
	 * @generated
	 */
	public Adapter createListOfLocalizedTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfModelChangeStructureDataType <em>List Of Model Change Structure Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfModelChangeStructureDataType
	 * @generated
	 */
	public Adapter createListOfModelChangeStructureDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfModificationInfo <em>List Of Modification Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfModificationInfo
	 * @generated
	 */
	public Adapter createListOfModificationInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateRequest <em>List Of Monitored Item Create Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateRequest
	 * @generated
	 */
	public Adapter createListOfMonitoredItemCreateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateResult <em>List Of Monitored Item Create Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateResult
	 * @generated
	 */
	public Adapter createListOfMonitoredItemCreateResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyRequest <em>List Of Monitored Item Modify Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyRequest
	 * @generated
	 */
	public Adapter createListOfMonitoredItemModifyRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyResult <em>List Of Monitored Item Modify Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyResult
	 * @generated
	 */
	public Adapter createListOfMonitoredItemModifyResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemNotification <em>List Of Monitored Item Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemNotification
	 * @generated
	 */
	public Adapter createListOfMonitoredItemNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressDataType <em>List Of Network Address Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressDataType
	 * @generated
	 */
	public Adapter createListOfNetworkAddressDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressUrlDataType <em>List Of Network Address Url Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressUrlDataType
	 * @generated
	 */
	public Adapter createListOfNetworkAddressUrlDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfNetworkGroupDataType <em>List Of Network Group Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfNetworkGroupDataType
	 * @generated
	 */
	public Adapter createListOfNetworkGroupDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfNode <em>List Of Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfNode
	 * @generated
	 */
	public Adapter createListOfNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfNodeId <em>List Of Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfNodeId
	 * @generated
	 */
	public Adapter createListOfNodeIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfNodeReference <em>List Of Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfNodeReference
	 * @generated
	 */
	public Adapter createListOfNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfNodeTypeDescription <em>List Of Node Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfNodeTypeDescription
	 * @generated
	 */
	public Adapter createListOfNodeTypeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfOpenFileMode <em>List Of Open File Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfOpenFileMode
	 * @generated
	 */
	public Adapter createListOfOpenFileModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfOptionSet <em>List Of Option Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfOptionSet
	 * @generated
	 */
	public Adapter createListOfOptionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfOrientation <em>List Of Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfOrientation
	 * @generated
	 */
	public Adapter createListOfOrientationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfOverrideValueHandling <em>List Of Override Value Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfOverrideValueHandling
	 * @generated
	 */
	public Adapter createListOfOverrideValueHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfParsingResult <em>List Of Parsing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfParsingResult
	 * @generated
	 */
	public Adapter createListOfParsingResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfPublishedDataItemsDataType <em>List Of Published Data Items Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfPublishedDataItemsDataType
	 * @generated
	 */
	public Adapter createListOfPublishedDataItemsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetDataType <em>List Of Published Data Set Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetDataType
	 * @generated
	 */
	public Adapter createListOfPublishedDataSetDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetSourceDataType <em>List Of Published Data Set Source Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetSourceDataType
	 * @generated
	 */
	public Adapter createListOfPublishedDataSetSourceDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfPublishedEventsDataType <em>List Of Published Events Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfPublishedEventsDataType
	 * @generated
	 */
	public Adapter createListOfPublishedEventsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfPublishedVariableDataType <em>List Of Published Variable Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfPublishedVariableDataType
	 * @generated
	 */
	public Adapter createListOfPublishedVariableDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfPubSubConfigurationDataType <em>List Of Pub Sub Configuration Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfPubSubConfigurationDataType
	 * @generated
	 */
	public Adapter createListOfPubSubConfigurationDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfPubSubConnectionDataType <em>List Of Pub Sub Connection Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfPubSubConnectionDataType
	 * @generated
	 */
	public Adapter createListOfPubSubConnectionDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfPubSubDiagnosticsCounterClassification <em>List Of Pub Sub Diagnostics Counter Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfPubSubDiagnosticsCounterClassification
	 * @generated
	 */
	public Adapter createListOfPubSubDiagnosticsCounterClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfPubSubGroupDataType <em>List Of Pub Sub Group Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfPubSubGroupDataType
	 * @generated
	 */
	public Adapter createListOfPubSubGroupDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfPubSubState <em>List Of Pub Sub State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfPubSubState
	 * @generated
	 */
	public Adapter createListOfPubSubStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfQualifiedName <em>List Of Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfQualifiedName
	 * @generated
	 */
	public Adapter createListOfQualifiedNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfQueryDataDescription <em>List Of Query Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfQueryDataDescription
	 * @generated
	 */
	public Adapter createListOfQueryDataDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfQueryDataSet <em>List Of Query Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfQueryDataSet
	 * @generated
	 */
	public Adapter createListOfQueryDataSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfRationalNumber <em>List Of Rational Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfRationalNumber
	 * @generated
	 */
	public Adapter createListOfRationalNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfReaderGroupDataType <em>List Of Reader Group Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfReaderGroupDataType
	 * @generated
	 */
	public Adapter createListOfReaderGroupDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfReaderGroupMessageDataType <em>List Of Reader Group Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfReaderGroupMessageDataType
	 * @generated
	 */
	public Adapter createListOfReaderGroupMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfReaderGroupTransportDataType <em>List Of Reader Group Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfReaderGroupTransportDataType
	 * @generated
	 */
	public Adapter createListOfReaderGroupTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfReadValueId <em>List Of Read Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfReadValueId
	 * @generated
	 */
	public Adapter createListOfReadValueIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfRedundantServerDataType <em>List Of Redundant Server Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfRedundantServerDataType
	 * @generated
	 */
	public Adapter createListOfRedundantServerDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfReferenceDescription <em>List Of Reference Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfReferenceDescription
	 * @generated
	 */
	public Adapter createListOfReferenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfReferenceNode <em>List Of Reference Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfReferenceNode
	 * @generated
	 */
	public Adapter createListOfReferenceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfRegisteredServer <em>List Of Registered Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfRegisteredServer
	 * @generated
	 */
	public Adapter createListOfRegisteredServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfRelativePathElement <em>List Of Relative Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfRelativePathElement
	 * @generated
	 */
	public Adapter createListOfRelativePathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfRolePermissionType <em>List Of Role Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfRolePermissionType
	 * @generated
	 */
	public Adapter createListOfRolePermissionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSamplingIntervalDiagnosticsDataType <em>List Of Sampling Interval Diagnostics Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSamplingIntervalDiagnosticsDataType
	 * @generated
	 */
	public Adapter createListOfSamplingIntervalDiagnosticsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSByte <em>List Of SByte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSByte
	 * @generated
	 */
	public Adapter createListOfSByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSemanticChangeStructureDataType <em>List Of Semantic Change Structure Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSemanticChangeStructureDataType
	 * @generated
	 */
	public Adapter createListOfSemanticChangeStructureDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfServerOnNetwork <em>List Of Server On Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfServerOnNetwork
	 * @generated
	 */
	public Adapter createListOfServerOnNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSessionDiagnosticsDataType <em>List Of Session Diagnostics Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSessionDiagnosticsDataType
	 * @generated
	 */
	public Adapter createListOfSessionDiagnosticsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSessionSecurityDiagnosticsDataType <em>List Of Session Security Diagnostics Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSessionSecurityDiagnosticsDataType
	 * @generated
	 */
	public Adapter createListOfSessionSecurityDiagnosticsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSignedSoftwareCertificate <em>List Of Signed Software Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSignedSoftwareCertificate
	 * @generated
	 */
	public Adapter createListOfSignedSoftwareCertificateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSimpleAttributeOperand <em>List Of Simple Attribute Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSimpleAttributeOperand
	 * @generated
	 */
	public Adapter createListOfSimpleAttributeOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSimpleTypeDescription <em>List Of Simple Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSimpleTypeDescription
	 * @generated
	 */
	public Adapter createListOfSimpleTypeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfStatusCode <em>List Of Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfStatusCode
	 * @generated
	 */
	public Adapter createListOfStatusCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfStatusResult <em>List Of Status Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfStatusResult
	 * @generated
	 */
	public Adapter createListOfStatusResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfString <em>List Of String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfString
	 * @generated
	 */
	public Adapter createListOfStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfStructureDefinition <em>List Of Structure Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfStructureDefinition
	 * @generated
	 */
	public Adapter createListOfStructureDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfStructureDescription <em>List Of Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfStructureDescription
	 * @generated
	 */
	public Adapter createListOfStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfStructureField <em>List Of Structure Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfStructureField
	 * @generated
	 */
	public Adapter createListOfStructureFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetDataType <em>List Of Subscribed Data Set Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetDataType
	 * @generated
	 */
	public Adapter createListOfSubscribedDataSetDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetMirrorDataType <em>List Of Subscribed Data Set Mirror Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetMirrorDataType
	 * @generated
	 */
	public Adapter createListOfSubscribedDataSetMirrorDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSubscriptionAcknowledgement <em>List Of Subscription Acknowledgement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSubscriptionAcknowledgement
	 * @generated
	 */
	public Adapter createListOfSubscriptionAcknowledgementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfSubscriptionDiagnosticsDataType <em>List Of Subscription Diagnostics Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfSubscriptionDiagnosticsDataType
	 * @generated
	 */
	public Adapter createListOfSubscriptionDiagnosticsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfTargetVariablesDataType <em>List Of Target Variables Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfTargetVariablesDataType
	 * @generated
	 */
	public Adapter createListOfTargetVariablesDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfThreeDCartesianCoordinates <em>List Of Three DCartesian Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfThreeDCartesianCoordinates
	 * @generated
	 */
	public Adapter createListOfThreeDCartesianCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfThreeDFrame <em>List Of Three DFrame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfThreeDFrame
	 * @generated
	 */
	public Adapter createListOfThreeDFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfThreeDOrientation <em>List Of Three DOrientation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfThreeDOrientation
	 * @generated
	 */
	public Adapter createListOfThreeDOrientationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfThreeDVector <em>List Of Three DVector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfThreeDVector
	 * @generated
	 */
	public Adapter createListOfThreeDVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfTimeZoneDataType <em>List Of Time Zone Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfTimeZoneDataType
	 * @generated
	 */
	public Adapter createListOfTimeZoneDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfTransferResult <em>List Of Transfer Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfTransferResult
	 * @generated
	 */
	public Adapter createListOfTransferResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfTrustListDataType <em>List Of Trust List Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfTrustListDataType
	 * @generated
	 */
	public Adapter createListOfTrustListDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUABinaryFileDataType <em>List Of UA Binary File Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUABinaryFileDataType
	 * @generated
	 */
	public Adapter createListOfUABinaryFileDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetMessageContentMask <em>List Of Uadp Data Set Message Content Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetMessageContentMask
	 * @generated
	 */
	public Adapter createListOfUadpDataSetMessageContentMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetReaderMessageDataType <em>List Of Uadp Data Set Reader Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetReaderMessageDataType
	 * @generated
	 */
	public Adapter createListOfUadpDataSetReaderMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetWriterMessageDataType <em>List Of Uadp Data Set Writer Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetWriterMessageDataType
	 * @generated
	 */
	public Adapter createListOfUadpDataSetWriterMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUadpNetworkMessageContentMask <em>List Of Uadp Network Message Content Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUadpNetworkMessageContentMask
	 * @generated
	 */
	public Adapter createListOfUadpNetworkMessageContentMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUadpWriterGroupMessageDataType <em>List Of Uadp Writer Group Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUadpWriterGroupMessageDataType
	 * @generated
	 */
	public Adapter createListOfUadpWriterGroupMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUInt16 <em>List Of UInt16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUInt16
	 * @generated
	 */
	public Adapter createListOfUInt16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUInt32 <em>List Of UInt32</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUInt32
	 * @generated
	 */
	public Adapter createListOfUInt32Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUInt64 <em>List Of UInt64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUInt64
	 * @generated
	 */
	public Adapter createListOfUInt64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUnion <em>List Of Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUnion
	 * @generated
	 */
	public Adapter createListOfUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfUserTokenPolicy <em>List Of User Token Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfUserTokenPolicy
	 * @generated
	 */
	public Adapter createListOfUserTokenPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfVariant <em>List Of Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfVariant
	 * @generated
	 */
	public Adapter createListOfVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfVector <em>List Of Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfVector
	 * @generated
	 */
	public Adapter createListOfVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfWriterGroupDataType <em>List Of Writer Group Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfWriterGroupDataType
	 * @generated
	 */
	public Adapter createListOfWriterGroupDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfWriterGroupMessageDataType <em>List Of Writer Group Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfWriterGroupMessageDataType
	 * @generated
	 */
	public Adapter createListOfWriterGroupMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfWriterGroupTransportDataType <em>List Of Writer Group Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfWriterGroupTransportDataType
	 * @generated
	 */
	public Adapter createListOfWriterGroupTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfWriteValue <em>List Of Write Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfWriteValue
	 * @generated
	 */
	public Adapter createListOfWriteValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ListOfXmlElement <em>List Of Xml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ListOfXmlElement
	 * @generated
	 */
	public Adapter createListOfXmlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.LiteralOperand <em>Literal Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.LiteralOperand
	 * @generated
	 */
	public Adapter createLiteralOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.LocalizedText <em>Localized Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.LocalizedText
	 * @generated
	 */
	public Adapter createLocalizedTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration <em>Mdns Discovery Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration
	 * @generated
	 */
	public Adapter createMdnsDiscoveryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MethodAttributes <em>Method Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MethodAttributes
	 * @generated
	 */
	public Adapter createMethodAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MethodNode <em>Method Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MethodNode
	 * @generated
	 */
	public Adapter createMethodNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType <em>Model Change Structure Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType
	 * @generated
	 */
	public Adapter createModelChangeStructureDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ModificationInfo <em>Modification Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ModificationInfo
	 * @generated
	 */
	public Adapter createModificationInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest <em>Modify Monitored Items Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest
	 * @generated
	 */
	public Adapter createModifyMonitoredItemsRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsResponse <em>Modify Monitored Items Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsResponse
	 * @generated
	 */
	public Adapter createModifyMonitoredItemsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionRequest <em>Modify Subscription Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ModifySubscriptionRequest
	 * @generated
	 */
	public Adapter createModifySubscriptionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse <em>Modify Subscription Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse
	 * @generated
	 */
	public Adapter createModifySubscriptionResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest <em>Monitored Item Create Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest
	 * @generated
	 */
	public Adapter createMonitoredItemCreateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult <em>Monitored Item Create Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult
	 * @generated
	 */
	public Adapter createMonitoredItemCreateResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest <em>Monitored Item Modify Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest
	 * @generated
	 */
	public Adapter createMonitoredItemModifyRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyResult <em>Monitored Item Modify Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoredItemModifyResult
	 * @generated
	 */
	public Adapter createMonitoredItemModifyResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemNotification <em>Monitored Item Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoredItemNotification
	 * @generated
	 */
	public Adapter createMonitoredItemNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MonitoringFilter <em>Monitoring Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoringFilter
	 * @generated
	 */
	public Adapter createMonitoringFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MonitoringFilterResult <em>Monitoring Filter Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoringFilterResult
	 * @generated
	 */
	public Adapter createMonitoringFilterResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters <em>Monitoring Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoringParameters
	 * @generated
	 */
	public Adapter createMonitoringParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.NetworkAddressDataType <em>Network Address Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.NetworkAddressDataType
	 * @generated
	 */
	public Adapter createNetworkAddressDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType <em>Network Address Url Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType
	 * @generated
	 */
	public Adapter createNetworkAddressUrlDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.NetworkGroupDataType <em>Network Group Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.NetworkGroupDataType
	 * @generated
	 */
	public Adapter createNetworkGroupDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.NodeAttributes <em>Node Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.NodeAttributes
	 * @generated
	 */
	public Adapter createNodeAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.NodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.NodeId
	 * @generated
	 */
	public Adapter createNodeIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.NodeReference <em>Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.NodeReference
	 * @generated
	 */
	public Adapter createNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription <em>Node Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.NodeTypeDescription
	 * @generated
	 */
	public Adapter createNodeTypeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.NotificationData <em>Notification Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.NotificationData
	 * @generated
	 */
	public Adapter createNotificationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.NotificationMessage <em>Notification Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.NotificationMessage
	 * @generated
	 */
	public Adapter createNotificationMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ObjectAttributes <em>Object Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ObjectAttributes
	 * @generated
	 */
	public Adapter createObjectAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ObjectNode
	 * @generated
	 */
	public Adapter createObjectNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ObjectTypeAttributes <em>Object Type Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ObjectTypeAttributes
	 * @generated
	 */
	public Adapter createObjectTypeAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ObjectTypeNode <em>Object Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ObjectTypeNode
	 * @generated
	 */
	public Adapter createObjectTypeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest <em>Open Secure Channel Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest
	 * @generated
	 */
	public Adapter createOpenSecureChannelRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse <em>Open Secure Channel Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse
	 * @generated
	 */
	public Adapter createOpenSecureChannelResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.OptionSet <em>Option Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.OptionSet
	 * @generated
	 */
	public Adapter createOptionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.Orientation
	 * @generated
	 */
	public Adapter createOrientationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ParsingResult <em>Parsing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ParsingResult
	 * @generated
	 */
	public Adapter createParsingResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType <em>Program Diagnostic2 Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType
	 * @generated
	 */
	public Adapter createProgramDiagnostic2DataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ProgramDiagnosticDataType <em>Program Diagnostic Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ProgramDiagnosticDataType
	 * @generated
	 */
	public Adapter createProgramDiagnosticDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType <em>Published Data Items Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType
	 * @generated
	 */
	public Adapter createPublishedDataItemsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType <em>Published Data Set Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType
	 * @generated
	 */
	public Adapter createPublishedDataSetDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetSourceDataType <em>Published Data Set Source Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.PublishedDataSetSourceDataType
	 * @generated
	 */
	public Adapter createPublishedDataSetSourceDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType <em>Published Events Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.PublishedEventsDataType
	 * @generated
	 */
	public Adapter createPublishedEventsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType <em>Published Variable Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.PublishedVariableDataType
	 * @generated
	 */
	public Adapter createPublishedVariableDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.PublishRequest <em>Publish Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.PublishRequest
	 * @generated
	 */
	public Adapter createPublishRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.PublishResponse <em>Publish Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.PublishResponse
	 * @generated
	 */
	public Adapter createPublishResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType <em>Pub Sub Configuration Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType
	 * @generated
	 */
	public Adapter createPubSubConfigurationDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType <em>Pub Sub Connection Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType
	 * @generated
	 */
	public Adapter createPubSubConnectionDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType <em>Pub Sub Group Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.PubSubGroupDataType
	 * @generated
	 */
	public Adapter createPubSubGroupDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.QualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.QualifiedName
	 * @generated
	 */
	public Adapter createQualifiedNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.QueryDataDescription <em>Query Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.QueryDataDescription
	 * @generated
	 */
	public Adapter createQueryDataDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.QueryDataSet <em>Query Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.QueryDataSet
	 * @generated
	 */
	public Adapter createQueryDataSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.QueryFirstRequest <em>Query First Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.QueryFirstRequest
	 * @generated
	 */
	public Adapter createQueryFirstRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse <em>Query First Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.QueryFirstResponse
	 * @generated
	 */
	public Adapter createQueryFirstResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.QueryNextRequest <em>Query Next Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.QueryNextRequest
	 * @generated
	 */
	public Adapter createQueryNextRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse <em>Query Next Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.QueryNextResponse
	 * @generated
	 */
	public Adapter createQueryNextResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RationalNumber <em>Rational Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RationalNumber
	 * @generated
	 */
	public Adapter createRationalNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReadAnnotationDataDetails <em>Read Annotation Data Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReadAnnotationDataDetails
	 * @generated
	 */
	public Adapter createReadAnnotationDataDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails <em>Read At Time Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails
	 * @generated
	 */
	public Adapter createReadAtTimeDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType <em>Reader Group Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReaderGroupDataType
	 * @generated
	 */
	public Adapter createReaderGroupDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupMessageDataType <em>Reader Group Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReaderGroupMessageDataType
	 * @generated
	 */
	public Adapter createReaderGroupMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupTransportDataType <em>Reader Group Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReaderGroupTransportDataType
	 * @generated
	 */
	public Adapter createReaderGroupTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails <em>Read Event Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReadEventDetails
	 * @generated
	 */
	public Adapter createReadEventDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails <em>Read Processed Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReadProcessedDetails
	 * @generated
	 */
	public Adapter createReadProcessedDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails <em>Read Raw Modified Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails
	 * @generated
	 */
	public Adapter createReadRawModifiedDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReadRequest <em>Read Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReadRequest
	 * @generated
	 */
	public Adapter createReadRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReadResponse <em>Read Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReadResponse
	 * @generated
	 */
	public Adapter createReadResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReadValueId <em>Read Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReadValueId
	 * @generated
	 */
	public Adapter createReadValueIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType <em>Redundant Server Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RedundantServerDataType
	 * @generated
	 */
	public Adapter createRedundantServerDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription <em>Reference Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReferenceDescription
	 * @generated
	 */
	public Adapter createReferenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReferenceNode <em>Reference Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReferenceNode
	 * @generated
	 */
	public Adapter createReferenceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeAttributes <em>Reference Type Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReferenceTypeAttributes
	 * @generated
	 */
	public Adapter createReferenceTypeAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ReferenceTypeNode <em>Reference Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ReferenceTypeNode
	 * @generated
	 */
	public Adapter createReferenceTypeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer <em>Registered Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RegisteredServer
	 * @generated
	 */
	public Adapter createRegisteredServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesRequest <em>Register Nodes Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RegisterNodesRequest
	 * @generated
	 */
	public Adapter createRegisterNodesRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesResponse <em>Register Nodes Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RegisterNodesResponse
	 * @generated
	 */
	public Adapter createRegisterNodesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Request <em>Register Server2 Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RegisterServer2Request
	 * @generated
	 */
	public Adapter createRegisterServer2RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response <em>Register Server2 Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RegisterServer2Response
	 * @generated
	 */
	public Adapter createRegisterServer2ResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RegisterServerRequest <em>Register Server Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RegisterServerRequest
	 * @generated
	 */
	public Adapter createRegisterServerRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RegisterServerResponse <em>Register Server Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RegisterServerResponse
	 * @generated
	 */
	public Adapter createRegisterServerResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RelativePath
	 * @generated
	 */
	public Adapter createRelativePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RelativePathElement <em>Relative Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RelativePathElement
	 * @generated
	 */
	public Adapter createRelativePathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RepublishRequest <em>Republish Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RepublishRequest
	 * @generated
	 */
	public Adapter createRepublishRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RepublishResponse <em>Republish Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RepublishResponse
	 * @generated
	 */
	public Adapter createRepublishResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RequestHeader <em>Request Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RequestHeader
	 * @generated
	 */
	public Adapter createRequestHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader <em>Response Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ResponseHeader
	 * @generated
	 */
	public Adapter createResponseHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.RolePermissionType <em>Role Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.RolePermissionType
	 * @generated
	 */
	public Adapter createRolePermissionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType <em>Sampling Interval Diagnostics Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType
	 * @generated
	 */
	public Adapter createSamplingIntervalDiagnosticsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SemanticChangeStructureDataType <em>Semantic Change Structure Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SemanticChangeStructureDataType
	 * @generated
	 */
	public Adapter createSemanticChangeStructureDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType <em>Server Diagnostics Summary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType
	 * @generated
	 */
	public Adapter createServerDiagnosticsSummaryDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork <em>Server On Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ServerOnNetwork
	 * @generated
	 */
	public Adapter createServerOnNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ServerStatusDataType <em>Server Status Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ServerStatusDataType
	 * @generated
	 */
	public Adapter createServerStatusDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ServiceCounterDataType <em>Service Counter Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ServiceCounterDataType
	 * @generated
	 */
	public Adapter createServiceCounterDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ServiceFault <em>Service Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ServiceFault
	 * @generated
	 */
	public Adapter createServiceFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType <em>Session Diagnostics Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType
	 * @generated
	 */
	public Adapter createSessionDiagnosticsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType <em>Sessionless Invoke Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType
	 * @generated
	 */
	public Adapter createSessionlessInvokeRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType <em>Sessionless Invoke Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType
	 * @generated
	 */
	public Adapter createSessionlessInvokeResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType <em>Session Security Diagnostics Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType
	 * @generated
	 */
	public Adapter createSessionSecurityDiagnosticsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest <em>Set Monitoring Mode Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest
	 * @generated
	 */
	public Adapter createSetMonitoringModeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeResponse <em>Set Monitoring Mode Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SetMonitoringModeResponse
	 * @generated
	 */
	public Adapter createSetMonitoringModeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest <em>Set Publishing Mode Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest
	 * @generated
	 */
	public Adapter createSetPublishingModeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeResponse <em>Set Publishing Mode Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SetPublishingModeResponse
	 * @generated
	 */
	public Adapter createSetPublishingModeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest <em>Set Triggering Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SetTriggeringRequest
	 * @generated
	 */
	public Adapter createSetTriggeringRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse <em>Set Triggering Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SetTriggeringResponse
	 * @generated
	 */
	public Adapter createSetTriggeringResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SignatureData <em>Signature Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SignatureData
	 * @generated
	 */
	public Adapter createSignatureDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate <em>Signed Software Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate
	 * @generated
	 */
	public Adapter createSignedSoftwareCertificateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand <em>Simple Attribute Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand
	 * @generated
	 */
	public Adapter createSimpleAttributeOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SimpleTypeDescription <em>Simple Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SimpleTypeDescription
	 * @generated
	 */
	public Adapter createSimpleTypeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.StatusChangeNotification <em>Status Change Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.StatusChangeNotification
	 * @generated
	 */
	public Adapter createStatusChangeNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.StatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.StatusCode
	 * @generated
	 */
	public Adapter createStatusCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.StatusResult <em>Status Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.StatusResult
	 * @generated
	 */
	public Adapter createStatusResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition <em>Structure Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.StructureDefinition
	 * @generated
	 */
	public Adapter createStructureDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.StructureDescription <em>Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.StructureDescription
	 * @generated
	 */
	public Adapter createStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.StructureField <em>Structure Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.StructureField
	 * @generated
	 */
	public Adapter createStructureFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetDataType <em>Subscribed Data Set Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SubscribedDataSetDataType
	 * @generated
	 */
	public Adapter createSubscribedDataSetDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType <em>Subscribed Data Set Mirror Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType
	 * @generated
	 */
	public Adapter createSubscribedDataSetMirrorDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SubscriptionAcknowledgement <em>Subscription Acknowledgement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SubscriptionAcknowledgement
	 * @generated
	 */
	public Adapter createSubscriptionAcknowledgementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType <em>Subscription Diagnostics Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType
	 * @generated
	 */
	public Adapter createSubscriptionDiagnosticsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.TargetVariablesDataType <em>Target Variables Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.TargetVariablesDataType
	 * @generated
	 */
	public Adapter createTargetVariablesDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates <em>Three DCartesian Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates
	 * @generated
	 */
	public Adapter createThreeDCartesianCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ThreeDFrame <em>Three DFrame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ThreeDFrame
	 * @generated
	 */
	public Adapter createThreeDFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ThreeDOrientation <em>Three DOrientation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ThreeDOrientation
	 * @generated
	 */
	public Adapter createThreeDOrientationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ThreeDVector <em>Three DVector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ThreeDVector
	 * @generated
	 */
	public Adapter createThreeDVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType <em>Time Zone Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.TimeZoneDataType
	 * @generated
	 */
	public Adapter createTimeZoneDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.TransferResult <em>Transfer Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.TransferResult
	 * @generated
	 */
	public Adapter createTransferResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest <em>Transfer Subscriptions Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest
	 * @generated
	 */
	public Adapter createTransferSubscriptionsRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsResponse <em>Transfer Subscriptions Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.TransferSubscriptionsResponse
	 * @generated
	 */
	public Adapter createTransferSubscriptionsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest <em>Translate Browse Paths To Node Ids Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest
	 * @generated
	 */
	public Adapter createTranslateBrowsePathsToNodeIdsRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsResponse <em>Translate Browse Paths To Node Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsResponse
	 * @generated
	 */
	public Adapter createTranslateBrowsePathsToNodeIdsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType <em>Trust List Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.TrustListDataType
	 * @generated
	 */
	public Adapter createTrustListDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.TypeNode <em>Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.TypeNode
	 * @generated
	 */
	public Adapter createTypeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType <em>UA Binary File Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UABinaryFileDataType
	 * @generated
	 */
	public Adapter createUABinaryFileDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType <em>Uadp Data Set Reader Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType
	 * @generated
	 */
	public Adapter createUadpDataSetReaderMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType <em>Uadp Data Set Writer Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType
	 * @generated
	 */
	public Adapter createUadpDataSetWriterMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType <em>Uadp Writer Group Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType
	 * @generated
	 */
	public Adapter createUadpWriterGroupMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest <em>Unregister Nodes Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest
	 * @generated
	 */
	public Adapter createUnregisterNodesRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UnregisterNodesResponse <em>Unregister Nodes Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UnregisterNodesResponse
	 * @generated
	 */
	public Adapter createUnregisterNodesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UpdateDataDetails <em>Update Data Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UpdateDataDetails
	 * @generated
	 */
	public Adapter createUpdateDataDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails <em>Update Event Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UpdateEventDetails
	 * @generated
	 */
	public Adapter createUpdateEventDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UpdateStructureDataDetails <em>Update Structure Data Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UpdateStructureDataDetails
	 * @generated
	 */
	public Adapter createUpdateStructureDataDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UserIdentityToken <em>User Identity Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UserIdentityToken
	 * @generated
	 */
	public Adapter createUserIdentityTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken <em>User Name Identity Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UserNameIdentityToken
	 * @generated
	 */
	public Adapter createUserNameIdentityTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy <em>User Token Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.UserTokenPolicy
	 * @generated
	 */
	public Adapter createUserTokenPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.VariableAttributes <em>Variable Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.VariableAttributes
	 * @generated
	 */
	public Adapter createVariableAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.VariableNode <em>Variable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.VariableNode
	 * @generated
	 */
	public Adapter createVariableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.VariableTypeAttributes <em>Variable Type Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.VariableTypeAttributes
	 * @generated
	 */
	public Adapter createVariableTypeAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode <em>Variable Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.VariableTypeNode
	 * @generated
	 */
	public Adapter createVariableTypeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.Variant
	 * @generated
	 */
	public Adapter createVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.Vector
	 * @generated
	 */
	public Adapter createVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ViewAttributes <em>View Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ViewAttributes
	 * @generated
	 */
	public Adapter createViewAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ViewDescription <em>View Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ViewDescription
	 * @generated
	 */
	public Adapter createViewDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.ViewNode <em>View Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.ViewNode
	 * @generated
	 */
	public Adapter createViewNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.WriteRequest <em>Write Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.WriteRequest
	 * @generated
	 */
	public Adapter createWriteRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.WriteResponse <em>Write Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.WriteResponse
	 * @generated
	 */
	public Adapter createWriteResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType <em>Writer Group Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.WriterGroupDataType
	 * @generated
	 */
	public Adapter createWriterGroupDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.WriterGroupMessageDataType <em>Writer Group Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.WriterGroupMessageDataType
	 * @generated
	 */
	public Adapter createWriterGroupMessageDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.WriterGroupTransportDataType <em>Writer Group Transport Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.WriterGroupTransportDataType
	 * @generated
	 */
	public Adapter createWriterGroupTransportDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.WriteValue <em>Write Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.WriteValue
	 * @generated
	 */
	public Adapter createWriteValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.X509IdentityToken <em>X509 Identity Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.X509IdentityToken
	 * @generated
	 */
	public Adapter createX509IdentityTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.XmlElementType <em>Xml Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.XmlElementType
	 * @generated
	 */
	public Adapter createXmlElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opcfoundation.ua._2008._02.types.XVType <em>XV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opcfoundation.ua._2008._02.types.XVType
	 * @generated
	 */
	public Adapter createXVTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TypesAdapterFactory
