/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2008._02.types.ActivateSessionRequest;
import org.opcfoundation.ua._2008._02.types.ActivateSessionResponse;
import org.opcfoundation.ua._2008._02.types.AddNodesItem;
import org.opcfoundation.ua._2008._02.types.AddNodesRequest;
import org.opcfoundation.ua._2008._02.types.AddNodesResponse;
import org.opcfoundation.ua._2008._02.types.AddNodesResult;
import org.opcfoundation.ua._2008._02.types.AddReferencesItem;
import org.opcfoundation.ua._2008._02.types.AddReferencesRequest;
import org.opcfoundation.ua._2008._02.types.AddReferencesResponse;
import org.opcfoundation.ua._2008._02.types.AggregateConfiguration;
import org.opcfoundation.ua._2008._02.types.AggregateFilter;
import org.opcfoundation.ua._2008._02.types.AggregateFilterResult;
import org.opcfoundation.ua._2008._02.types.AliasNameDataType;
import org.opcfoundation.ua._2008._02.types.Annotation;
import org.opcfoundation.ua._2008._02.types.AnonymousIdentityToken;
import org.opcfoundation.ua._2008._02.types.ApplicationDescription;
import org.opcfoundation.ua._2008._02.types.ApplicationType;
import org.opcfoundation.ua._2008._02.types.Argument;
import org.opcfoundation.ua._2008._02.types.AttributeOperand;
import org.opcfoundation.ua._2008._02.types.AxisInformation;
import org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration;
import org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.BrokerDataSetReaderTransportDataType;
import org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType;
import org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService;
import org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.BrowseDescription;
import org.opcfoundation.ua._2008._02.types.BrowseDirection;
import org.opcfoundation.ua._2008._02.types.BrowseNextRequest;
import org.opcfoundation.ua._2008._02.types.BrowseNextResponse;
import org.opcfoundation.ua._2008._02.types.BrowsePath;
import org.opcfoundation.ua._2008._02.types.BrowsePathResult;
import org.opcfoundation.ua._2008._02.types.BrowsePathTarget;
import org.opcfoundation.ua._2008._02.types.BrowseRequest;
import org.opcfoundation.ua._2008._02.types.BrowseResponse;
import org.opcfoundation.ua._2008._02.types.BrowseResult;
import org.opcfoundation.ua._2008._02.types.BrowseResultMask;
import org.opcfoundation.ua._2008._02.types.BuildInfo;
import org.opcfoundation.ua._2008._02.types.CallMethodRequest;
import org.opcfoundation.ua._2008._02.types.CallMethodResult;
import org.opcfoundation.ua._2008._02.types.CallRequest;
import org.opcfoundation.ua._2008._02.types.CallResponse;
import org.opcfoundation.ua._2008._02.types.CancelRequest;
import org.opcfoundation.ua._2008._02.types.CancelResponse;
import org.opcfoundation.ua._2008._02.types.CartesianCoordinates;
import org.opcfoundation.ua._2008._02.types.ChannelSecurityToken;
import org.opcfoundation.ua._2008._02.types.CloseSecureChannelRequest;
import org.opcfoundation.ua._2008._02.types.CloseSecureChannelResponse;
import org.opcfoundation.ua._2008._02.types.CloseSessionRequest;
import org.opcfoundation.ua._2008._02.types.CloseSessionResponse;
import org.opcfoundation.ua._2008._02.types.ComplexNumberType;
import org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType;
import org.opcfoundation.ua._2008._02.types.ConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.ContentFilter;
import org.opcfoundation.ua._2008._02.types.ContentFilterElement;
import org.opcfoundation.ua._2008._02.types.ContentFilterElementResult;
import org.opcfoundation.ua._2008._02.types.ContentFilterResult;
import org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsRequest;
import org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsResponse;
import org.opcfoundation.ua._2008._02.types.CreateSessionRequest;
import org.opcfoundation.ua._2008._02.types.CreateSessionResponse;
import org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest;
import org.opcfoundation.ua._2008._02.types.CreateSubscriptionResponse;
import org.opcfoundation.ua._2008._02.types.CurrencyUnitType;
import org.opcfoundation.ua._2008._02.types.DataChangeFilter;
import org.opcfoundation.ua._2008._02.types.DataChangeNotification;
import org.opcfoundation.ua._2008._02.types.DataChangeTrigger;
import org.opcfoundation.ua._2008._02.types.DataSetMetaDataType;
import org.opcfoundation.ua._2008._02.types.DataSetOrderingType;
import org.opcfoundation.ua._2008._02.types.DataSetReaderDataType;
import org.opcfoundation.ua._2008._02.types.DataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.DataSetReaderTransportDataType;
import org.opcfoundation.ua._2008._02.types.DataSetWriterDataType;
import org.opcfoundation.ua._2008._02.types.DataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.DataSetWriterTransportDataType;
import org.opcfoundation.ua._2008._02.types.DataTypeAttributes;
import org.opcfoundation.ua._2008._02.types.DataTypeDefinition;
import org.opcfoundation.ua._2008._02.types.DataTypeDescription;
import org.opcfoundation.ua._2008._02.types.DataTypeNode;
import org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader;
import org.opcfoundation.ua._2008._02.types.DataValue;
import org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.DeadbandType;
import org.opcfoundation.ua._2008._02.types.DecimalDataType;
import org.opcfoundation.ua._2008._02.types.DeleteAtTimeDetails;
import org.opcfoundation.ua._2008._02.types.DeleteEventDetails;
import org.opcfoundation.ua._2008._02.types.DeleteMonitoredItemsRequest;
import org.opcfoundation.ua._2008._02.types.DeleteMonitoredItemsResponse;
import org.opcfoundation.ua._2008._02.types.DeleteNodesItem;
import org.opcfoundation.ua._2008._02.types.DeleteNodesRequest;
import org.opcfoundation.ua._2008._02.types.DeleteNodesResponse;
import org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails;
import org.opcfoundation.ua._2008._02.types.DeleteReferencesItem;
import org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest;
import org.opcfoundation.ua._2008._02.types.DeleteReferencesResponse;
import org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest;
import org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsResponse;
import org.opcfoundation.ua._2008._02.types.DiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.DiagnosticsLevel;
import org.opcfoundation.ua._2008._02.types.DiscoveryConfiguration;
import org.opcfoundation.ua._2008._02.types.DocumentRoot;
import org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType;
import org.opcfoundation.ua._2008._02.types.EUInformation;
import org.opcfoundation.ua._2008._02.types.ElementOperand;
import org.opcfoundation.ua._2008._02.types.EndpointConfiguration;
import org.opcfoundation.ua._2008._02.types.EndpointDescription;
import org.opcfoundation.ua._2008._02.types.EndpointType;
import org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType;
import org.opcfoundation.ua._2008._02.types.EnumDefinition;
import org.opcfoundation.ua._2008._02.types.EnumDescription;
import org.opcfoundation.ua._2008._02.types.EnumField;
import org.opcfoundation.ua._2008._02.types.EnumValueType;
import org.opcfoundation.ua._2008._02.types.EventFieldList;
import org.opcfoundation.ua._2008._02.types.EventFilter;
import org.opcfoundation.ua._2008._02.types.EventFilterResult;
import org.opcfoundation.ua._2008._02.types.EventNotificationList;
import org.opcfoundation.ua._2008._02.types.ExceptionDeviationFormat;
import org.opcfoundation.ua._2008._02.types.ExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.FieldMetaData;
import org.opcfoundation.ua._2008._02.types.FieldTargetDataType;
import org.opcfoundation.ua._2008._02.types.FilterOperand;
import org.opcfoundation.ua._2008._02.types.FilterOperator;
import org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest;
import org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse;
import org.opcfoundation.ua._2008._02.types.FindServersRequest;
import org.opcfoundation.ua._2008._02.types.FindServersResponse;
import org.opcfoundation.ua._2008._02.types.Frame;
import org.opcfoundation.ua._2008._02.types.GenericAttributeValue;
import org.opcfoundation.ua._2008._02.types.GenericAttributes;
import org.opcfoundation.ua._2008._02.types.GetEndpointsRequest;
import org.opcfoundation.ua._2008._02.types.GetEndpointsResponse;
import org.opcfoundation.ua._2008._02.types.Guid;
import org.opcfoundation.ua._2008._02.types.HistoryData;
import org.opcfoundation.ua._2008._02.types.HistoryEvent;
import org.opcfoundation.ua._2008._02.types.HistoryEventFieldList;
import org.opcfoundation.ua._2008._02.types.HistoryModifiedData;
import org.opcfoundation.ua._2008._02.types.HistoryReadDetails;
import org.opcfoundation.ua._2008._02.types.HistoryReadRequest;
import org.opcfoundation.ua._2008._02.types.HistoryReadResponse;
import org.opcfoundation.ua._2008._02.types.HistoryReadResult;
import org.opcfoundation.ua._2008._02.types.HistoryReadValueId;
import org.opcfoundation.ua._2008._02.types.HistoryUpdateDetails;
import org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest;
import org.opcfoundation.ua._2008._02.types.HistoryUpdateResponse;
import org.opcfoundation.ua._2008._02.types.HistoryUpdateResult;
import org.opcfoundation.ua._2008._02.types.HistoryUpdateType;
import org.opcfoundation.ua._2008._02.types.IdType;
import org.opcfoundation.ua._2008._02.types.IdentityCriteriaType;
import org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType;
import org.opcfoundation.ua._2008._02.types.InstanceNode;
import org.opcfoundation.ua._2008._02.types.IssuedIdentityToken;
import org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.KeyValuePair;
import org.opcfoundation.ua._2008._02.types.ListOfAddNodesItem;
import org.opcfoundation.ua._2008._02.types.ListOfAddNodesResult;
import org.opcfoundation.ua._2008._02.types.ListOfAddReferencesItem;
import org.opcfoundation.ua._2008._02.types.ListOfAliasNameDataType;
import org.opcfoundation.ua._2008._02.types.ListOfApplicationDescription;
import org.opcfoundation.ua._2008._02.types.ListOfArgument;
import org.opcfoundation.ua._2008._02.types.ListOfBoolean;
import org.opcfoundation.ua._2008._02.types.ListOfBrokerConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetReaderTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetWriterTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfBrokerTransportQualityOfService;
import org.opcfoundation.ua._2008._02.types.ListOfBrokerWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfBrowseDescription;
import org.opcfoundation.ua._2008._02.types.ListOfBrowsePath;
import org.opcfoundation.ua._2008._02.types.ListOfBrowsePathResult;
import org.opcfoundation.ua._2008._02.types.ListOfBrowsePathTarget;
import org.opcfoundation.ua._2008._02.types.ListOfBrowseResult;
import org.opcfoundation.ua._2008._02.types.ListOfByte;
import org.opcfoundation.ua._2008._02.types.ListOfByteString;
import org.opcfoundation.ua._2008._02.types.ListOfCallMethodRequest;
import org.opcfoundation.ua._2008._02.types.ListOfCallMethodResult;
import org.opcfoundation.ua._2008._02.types.ListOfCartesianCoordinates;
import org.opcfoundation.ua._2008._02.types.ListOfConfigurationVersionDataType;
import org.opcfoundation.ua._2008._02.types.ListOfConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfContentFilter;
import org.opcfoundation.ua._2008._02.types.ListOfContentFilterElement;
import org.opcfoundation.ua._2008._02.types.ListOfContentFilterElementResult;
import org.opcfoundation.ua._2008._02.types.ListOfCurrencyUnitType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetFieldContentMask;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetMetaDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetOrderingType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataTypeDefinition;
import org.opcfoundation.ua._2008._02.types.ListOfDataTypeDescription;
import org.opcfoundation.ua._2008._02.types.ListOfDataTypeSchemaHeader;
import org.opcfoundation.ua._2008._02.types.ListOfDataValue;
import org.opcfoundation.ua._2008._02.types.ListOfDatagramConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDatagramWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDateTime;
import org.opcfoundation.ua._2008._02.types.ListOfDeleteNodesItem;
import org.opcfoundation.ua._2008._02.types.ListOfDeleteReferencesItem;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticsLevel;
import org.opcfoundation.ua._2008._02.types.ListOfDouble;
import org.opcfoundation.ua._2008._02.types.ListOfEndpointConfiguration;
import org.opcfoundation.ua._2008._02.types.ListOfEndpointDescription;
import org.opcfoundation.ua._2008._02.types.ListOfEndpointType;
import org.opcfoundation.ua._2008._02.types.ListOfEndpointUrlListDataType;
import org.opcfoundation.ua._2008._02.types.ListOfEnumDefinition;
import org.opcfoundation.ua._2008._02.types.ListOfEnumDescription;
import org.opcfoundation.ua._2008._02.types.ListOfEnumField;
import org.opcfoundation.ua._2008._02.types.ListOfEnumValueType;
import org.opcfoundation.ua._2008._02.types.ListOfEventFieldList;
import org.opcfoundation.ua._2008._02.types.ListOfExpandedNodeId;
import org.opcfoundation.ua._2008._02.types.ListOfExtensionObject;
import org.opcfoundation.ua._2008._02.types.ListOfFieldMetaData;
import org.opcfoundation.ua._2008._02.types.ListOfFieldTargetDataType;
import org.opcfoundation.ua._2008._02.types.ListOfFloat;
import org.opcfoundation.ua._2008._02.types.ListOfFrame;
import org.opcfoundation.ua._2008._02.types.ListOfGenericAttributeValue;
import org.opcfoundation.ua._2008._02.types.ListOfGuid;
import org.opcfoundation.ua._2008._02.types.ListOfHistoryEventFieldList;
import org.opcfoundation.ua._2008._02.types.ListOfHistoryReadResult;
import org.opcfoundation.ua._2008._02.types.ListOfHistoryReadValueId;
import org.opcfoundation.ua._2008._02.types.ListOfHistoryUpdateResult;
import org.opcfoundation.ua._2008._02.types.ListOfIdType;
import org.opcfoundation.ua._2008._02.types.ListOfIdentityCriteriaType;
import org.opcfoundation.ua._2008._02.types.ListOfIdentityMappingRuleType;
import org.opcfoundation.ua._2008._02.types.ListOfInt16;
import org.opcfoundation.ua._2008._02.types.ListOfInt32;
import org.opcfoundation.ua._2008._02.types.ListOfInt64;
import org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetMessageContentMask;
import org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfJsonNetworkMessageContentMask;
import org.opcfoundation.ua._2008._02.types.ListOfJsonWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair;
import org.opcfoundation.ua._2008._02.types.ListOfLocalizedText;
import org.opcfoundation.ua._2008._02.types.ListOfModelChangeStructureDataType;
import org.opcfoundation.ua._2008._02.types.ListOfModificationInfo;
import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateRequest;
import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateResult;
import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyRequest;
import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyResult;
import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemNotification;
import org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressDataType;
import org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressUrlDataType;
import org.opcfoundation.ua._2008._02.types.ListOfNetworkGroupDataType;
import org.opcfoundation.ua._2008._02.types.ListOfNode;
import org.opcfoundation.ua._2008._02.types.ListOfNodeId;
import org.opcfoundation.ua._2008._02.types.ListOfNodeReference;
import org.opcfoundation.ua._2008._02.types.ListOfNodeTypeDescription;
import org.opcfoundation.ua._2008._02.types.ListOfOpenFileMode;
import org.opcfoundation.ua._2008._02.types.ListOfOptionSet;
import org.opcfoundation.ua._2008._02.types.ListOfOrientation;
import org.opcfoundation.ua._2008._02.types.ListOfOverrideValueHandling;
import org.opcfoundation.ua._2008._02.types.ListOfParsingResult;
import org.opcfoundation.ua._2008._02.types.ListOfPubSubConfigurationDataType;
import org.opcfoundation.ua._2008._02.types.ListOfPubSubConnectionDataType;
import org.opcfoundation.ua._2008._02.types.ListOfPubSubDiagnosticsCounterClassification;
import org.opcfoundation.ua._2008._02.types.ListOfPubSubGroupDataType;
import org.opcfoundation.ua._2008._02.types.ListOfPubSubState;
import org.opcfoundation.ua._2008._02.types.ListOfPublishedDataItemsDataType;
import org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetDataType;
import org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetSourceDataType;
import org.opcfoundation.ua._2008._02.types.ListOfPublishedEventsDataType;
import org.opcfoundation.ua._2008._02.types.ListOfPublishedVariableDataType;
import org.opcfoundation.ua._2008._02.types.ListOfQualifiedName;
import org.opcfoundation.ua._2008._02.types.ListOfQueryDataDescription;
import org.opcfoundation.ua._2008._02.types.ListOfQueryDataSet;
import org.opcfoundation.ua._2008._02.types.ListOfRationalNumber;
import org.opcfoundation.ua._2008._02.types.ListOfReadValueId;
import org.opcfoundation.ua._2008._02.types.ListOfReaderGroupDataType;
import org.opcfoundation.ua._2008._02.types.ListOfReaderGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfReaderGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfRedundantServerDataType;
import org.opcfoundation.ua._2008._02.types.ListOfReferenceDescription;
import org.opcfoundation.ua._2008._02.types.ListOfReferenceNode;
import org.opcfoundation.ua._2008._02.types.ListOfRegisteredServer;
import org.opcfoundation.ua._2008._02.types.ListOfRelativePathElement;
import org.opcfoundation.ua._2008._02.types.ListOfRolePermissionType;
import org.opcfoundation.ua._2008._02.types.ListOfSByte;
import org.opcfoundation.ua._2008._02.types.ListOfSamplingIntervalDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.ListOfSemanticChangeStructureDataType;
import org.opcfoundation.ua._2008._02.types.ListOfServerOnNetwork;
import org.opcfoundation.ua._2008._02.types.ListOfSessionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.ListOfSessionSecurityDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.ListOfSignedSoftwareCertificate;
import org.opcfoundation.ua._2008._02.types.ListOfSimpleAttributeOperand;
import org.opcfoundation.ua._2008._02.types.ListOfSimpleTypeDescription;
import org.opcfoundation.ua._2008._02.types.ListOfStatusCode;
import org.opcfoundation.ua._2008._02.types.ListOfStatusResult;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.ListOfStructureDefinition;
import org.opcfoundation.ua._2008._02.types.ListOfStructureDescription;
import org.opcfoundation.ua._2008._02.types.ListOfStructureField;
import org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetDataType;
import org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetMirrorDataType;
import org.opcfoundation.ua._2008._02.types.ListOfSubscriptionAcknowledgement;
import org.opcfoundation.ua._2008._02.types.ListOfSubscriptionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.ListOfTargetVariablesDataType;
import org.opcfoundation.ua._2008._02.types.ListOfThreeDCartesianCoordinates;
import org.opcfoundation.ua._2008._02.types.ListOfThreeDFrame;
import org.opcfoundation.ua._2008._02.types.ListOfThreeDOrientation;
import org.opcfoundation.ua._2008._02.types.ListOfThreeDVector;
import org.opcfoundation.ua._2008._02.types.ListOfTimeZoneDataType;
import org.opcfoundation.ua._2008._02.types.ListOfTransferResult;
import org.opcfoundation.ua._2008._02.types.ListOfTrustListDataType;
import org.opcfoundation.ua._2008._02.types.ListOfUABinaryFileDataType;
import org.opcfoundation.ua._2008._02.types.ListOfUInt16;
import org.opcfoundation.ua._2008._02.types.ListOfUInt32;
import org.opcfoundation.ua._2008._02.types.ListOfUInt64;
import org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetMessageContentMask;
import org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfUadpNetworkMessageContentMask;
import org.opcfoundation.ua._2008._02.types.ListOfUadpWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfUnion;
import org.opcfoundation.ua._2008._02.types.ListOfUserTokenPolicy;
import org.opcfoundation.ua._2008._02.types.ListOfVariant;
import org.opcfoundation.ua._2008._02.types.ListOfVector;
import org.opcfoundation.ua._2008._02.types.ListOfWriteValue;
import org.opcfoundation.ua._2008._02.types.ListOfWriterGroupDataType;
import org.opcfoundation.ua._2008._02.types.ListOfWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfXmlElement;
import org.opcfoundation.ua._2008._02.types.LiteralOperand;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration;
import org.opcfoundation.ua._2008._02.types.MessageSecurityMode;
import org.opcfoundation.ua._2008._02.types.MethodAttributes;
import org.opcfoundation.ua._2008._02.types.MethodNode;
import org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType;
import org.opcfoundation.ua._2008._02.types.ModelChangeStructureVerbMask;
import org.opcfoundation.ua._2008._02.types.ModificationInfo;
import org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest;
import org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsResponse;
import org.opcfoundation.ua._2008._02.types.ModifySubscriptionRequest;
import org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse;
import org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest;
import org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult;
import org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest;
import org.opcfoundation.ua._2008._02.types.MonitoredItemModifyResult;
import org.opcfoundation.ua._2008._02.types.MonitoredItemNotification;
import org.opcfoundation.ua._2008._02.types.MonitoringFilter;
import org.opcfoundation.ua._2008._02.types.MonitoringFilterResult;
import org.opcfoundation.ua._2008._02.types.MonitoringMode;
import org.opcfoundation.ua._2008._02.types.MonitoringParameters;
import org.opcfoundation.ua._2008._02.types.NetworkAddressDataType;
import org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType;
import org.opcfoundation.ua._2008._02.types.NetworkGroupDataType;
import org.opcfoundation.ua._2008._02.types.Node;
import org.opcfoundation.ua._2008._02.types.NodeAttributes;
import org.opcfoundation.ua._2008._02.types.NodeAttributesMask;
import org.opcfoundation.ua._2008._02.types.NodeClass;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.NodeReference;
import org.opcfoundation.ua._2008._02.types.NodeTypeDescription;
import org.opcfoundation.ua._2008._02.types.NotificationData;
import org.opcfoundation.ua._2008._02.types.NotificationMessage;
import org.opcfoundation.ua._2008._02.types.ObjectAttributes;
import org.opcfoundation.ua._2008._02.types.ObjectNode;
import org.opcfoundation.ua._2008._02.types.ObjectTypeAttributes;
import org.opcfoundation.ua._2008._02.types.ObjectTypeNode;
import org.opcfoundation.ua._2008._02.types.OpenFileMode;
import org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest;
import org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse;
import org.opcfoundation.ua._2008._02.types.OptionSet;
import org.opcfoundation.ua._2008._02.types.Orientation;
import org.opcfoundation.ua._2008._02.types.OverrideValueHandling;
import org.opcfoundation.ua._2008._02.types.ParsingResult;
import org.opcfoundation.ua._2008._02.types.PerformUpdateType;
import org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType;
import org.opcfoundation.ua._2008._02.types.ProgramDiagnosticDataType;
import org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType;
import org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType;
import org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification;
import org.opcfoundation.ua._2008._02.types.PubSubGroupDataType;
import org.opcfoundation.ua._2008._02.types.PubSubState;
import org.opcfoundation.ua._2008._02.types.PublishRequest;
import org.opcfoundation.ua._2008._02.types.PublishResponse;
import org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType;
import org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType;
import org.opcfoundation.ua._2008._02.types.PublishedDataSetSourceDataType;
import org.opcfoundation.ua._2008._02.types.PublishedEventsDataType;
import org.opcfoundation.ua._2008._02.types.PublishedVariableDataType;
import org.opcfoundation.ua._2008._02.types.QualifiedName;
import org.opcfoundation.ua._2008._02.types.QueryDataDescription;
import org.opcfoundation.ua._2008._02.types.QueryDataSet;
import org.opcfoundation.ua._2008._02.types.QueryFirstRequest;
import org.opcfoundation.ua._2008._02.types.QueryFirstResponse;
import org.opcfoundation.ua._2008._02.types.QueryNextRequest;
import org.opcfoundation.ua._2008._02.types.QueryNextResponse;
import org.opcfoundation.ua._2008._02.types.Range;
import org.opcfoundation.ua._2008._02.types.RationalNumber;
import org.opcfoundation.ua._2008._02.types.ReadAnnotationDataDetails;
import org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails;
import org.opcfoundation.ua._2008._02.types.ReadEventDetails;
import org.opcfoundation.ua._2008._02.types.ReadProcessedDetails;
import org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails;
import org.opcfoundation.ua._2008._02.types.ReadRequest;
import org.opcfoundation.ua._2008._02.types.ReadResponse;
import org.opcfoundation.ua._2008._02.types.ReadValueId;
import org.opcfoundation.ua._2008._02.types.ReaderGroupDataType;
import org.opcfoundation.ua._2008._02.types.ReaderGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.ReaderGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.RedundancySupport;
import org.opcfoundation.ua._2008._02.types.RedundantServerDataType;
import org.opcfoundation.ua._2008._02.types.ReferenceDescription;
import org.opcfoundation.ua._2008._02.types.ReferenceNode;
import org.opcfoundation.ua._2008._02.types.ReferenceTypeAttributes;
import org.opcfoundation.ua._2008._02.types.ReferenceTypeNode;
import org.opcfoundation.ua._2008._02.types.RegisterNodesRequest;
import org.opcfoundation.ua._2008._02.types.RegisterNodesResponse;
import org.opcfoundation.ua._2008._02.types.RegisterServer2Request;
import org.opcfoundation.ua._2008._02.types.RegisterServer2Response;
import org.opcfoundation.ua._2008._02.types.RegisterServerRequest;
import org.opcfoundation.ua._2008._02.types.RegisterServerResponse;
import org.opcfoundation.ua._2008._02.types.RegisteredServer;
import org.opcfoundation.ua._2008._02.types.RelativePath;
import org.opcfoundation.ua._2008._02.types.RelativePathElement;
import org.opcfoundation.ua._2008._02.types.RepublishRequest;
import org.opcfoundation.ua._2008._02.types.RepublishResponse;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.RolePermissionType;
import org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType;
import org.opcfoundation.ua._2008._02.types.SemanticChangeStructureDataType;
import org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType;
import org.opcfoundation.ua._2008._02.types.ServerOnNetwork;
import org.opcfoundation.ua._2008._02.types.ServerState;
import org.opcfoundation.ua._2008._02.types.ServerStatusDataType;
import org.opcfoundation.ua._2008._02.types.ServiceCounterDataType;
import org.opcfoundation.ua._2008._02.types.ServiceFault;
import org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType;
import org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType;
import org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest;
import org.opcfoundation.ua._2008._02.types.SetMonitoringModeResponse;
import org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest;
import org.opcfoundation.ua._2008._02.types.SetPublishingModeResponse;
import org.opcfoundation.ua._2008._02.types.SetTriggeringRequest;
import org.opcfoundation.ua._2008._02.types.SetTriggeringResponse;
import org.opcfoundation.ua._2008._02.types.SignatureData;
import org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate;
import org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand;
import org.opcfoundation.ua._2008._02.types.SimpleTypeDescription;
import org.opcfoundation.ua._2008._02.types.StatusChangeNotification;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.StatusResult;
import org.opcfoundation.ua._2008._02.types.StructureDefinition;
import org.opcfoundation.ua._2008._02.types.StructureDescription;
import org.opcfoundation.ua._2008._02.types.StructureField;
import org.opcfoundation.ua._2008._02.types.StructureType;
import org.opcfoundation.ua._2008._02.types.SubscribedDataSetDataType;
import org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType;
import org.opcfoundation.ua._2008._02.types.SubscriptionAcknowledgement;
import org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TargetVariablesDataType;
import org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates;
import org.opcfoundation.ua._2008._02.types.ThreeDFrame;
import org.opcfoundation.ua._2008._02.types.ThreeDOrientation;
import org.opcfoundation.ua._2008._02.types.ThreeDVector;
import org.opcfoundation.ua._2008._02.types.TimeZoneDataType;
import org.opcfoundation.ua._2008._02.types.TimestampsToReturn;
import org.opcfoundation.ua._2008._02.types.TransferResult;
import org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest;
import org.opcfoundation.ua._2008._02.types.TransferSubscriptionsResponse;
import org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest;
import org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsResponse;
import org.opcfoundation.ua._2008._02.types.TrustListDataType;
import org.opcfoundation.ua._2008._02.types.TrustListMasks;
import org.opcfoundation.ua._2008._02.types.TypeNode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UABinaryFileDataType;
import org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.Union;
import org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest;
import org.opcfoundation.ua._2008._02.types.UnregisterNodesResponse;
import org.opcfoundation.ua._2008._02.types.UpdateDataDetails;
import org.opcfoundation.ua._2008._02.types.UpdateEventDetails;
import org.opcfoundation.ua._2008._02.types.UpdateStructureDataDetails;
import org.opcfoundation.ua._2008._02.types.UserIdentityToken;
import org.opcfoundation.ua._2008._02.types.UserNameIdentityToken;
import org.opcfoundation.ua._2008._02.types.UserTokenPolicy;
import org.opcfoundation.ua._2008._02.types.UserTokenType;
import org.opcfoundation.ua._2008._02.types.VariableAttributes;
import org.opcfoundation.ua._2008._02.types.VariableNode;
import org.opcfoundation.ua._2008._02.types.VariableTypeAttributes;
import org.opcfoundation.ua._2008._02.types.VariableTypeNode;
import org.opcfoundation.ua._2008._02.types.Variant;
import org.opcfoundation.ua._2008._02.types.Vector;
import org.opcfoundation.ua._2008._02.types.ViewAttributes;
import org.opcfoundation.ua._2008._02.types.ViewDescription;
import org.opcfoundation.ua._2008._02.types.ViewNode;
import org.opcfoundation.ua._2008._02.types.WriteRequest;
import org.opcfoundation.ua._2008._02.types.WriteResponse;
import org.opcfoundation.ua._2008._02.types.WriteValue;
import org.opcfoundation.ua._2008._02.types.WriterGroupDataType;
import org.opcfoundation.ua._2008._02.types.WriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.WriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.X509IdentityToken;
import org.opcfoundation.ua._2008._02.types.XVType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAccessLevelExType <em>Access Level Ex Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAccessLevelType <em>Access Level Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getActivateSessionRequest <em>Activate Session Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getActivateSessionResponse <em>Activate Session Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAddNodesItem <em>Add Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAddNodesRequest <em>Add Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAddNodesResponse <em>Add Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAddNodesResult <em>Add Nodes Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAddReferencesItem <em>Add References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAddReferencesRequest <em>Add References Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAddReferencesResponse <em>Add References Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAggregateConfiguration <em>Aggregate Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAggregateFilter <em>Aggregate Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAggregateFilterResult <em>Aggregate Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAliasNameDataType <em>Alias Name Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAnonymousIdentityToken <em>Anonymous Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getApplicationDescription <em>Application Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getApplicationInstanceCertificate <em>Application Instance Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAttributeOperand <em>Attribute Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAttributeWriteMask <em>Attribute Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAudioDataType <em>Audio Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAxisInformation <em>Axis Information</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getAxisScaleEnumeration <em>Axis Scale Enumeration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBitFieldMaskDataType <em>Bit Field Mask Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrokerConnectionTransportDataType <em>Broker Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrokerDataSetReaderTransportDataType <em>Broker Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrokerDataSetWriterTransportDataType <em>Broker Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrokerTransportQualityOfService <em>Broker Transport Quality Of Service</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrokerWriterGroupTransportDataType <em>Broker Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowseDescription <em>Browse Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowseDirection <em>Browse Direction</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowseNextRequest <em>Browse Next Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowseNextResponse <em>Browse Next Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowsePath <em>Browse Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowsePathResult <em>Browse Path Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowsePathTarget <em>Browse Path Target</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowseRequest <em>Browse Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowseResponse <em>Browse Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowseResult <em>Browse Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBrowseResultMask <em>Browse Result Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getBuildInfo <em>Build Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getByte <em>Byte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getByteString <em>Byte String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCallMethodRequest <em>Call Method Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCallMethodResult <em>Call Method Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCallRequest <em>Call Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCallResponse <em>Call Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCancelRequest <em>Cancel Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCancelResponse <em>Cancel Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCartesianCoordinates <em>Cartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getChannelSecurityToken <em>Channel Security Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCloseSecureChannelRequest <em>Close Secure Channel Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCloseSecureChannelResponse <em>Close Secure Channel Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCloseSessionRequest <em>Close Session Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCloseSessionResponse <em>Close Session Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getComplexNumberType <em>Complex Number Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getConfigurationVersionDataType <em>Configuration Version Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getConnectionTransportDataType <em>Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getContentFilter <em>Content Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getContentFilterElement <em>Content Filter Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getContentFilterElementResult <em>Content Filter Element Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getContentFilterResult <em>Content Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getContinuationPoint <em>Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCreateMonitoredItemsRequest <em>Create Monitored Items Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCreateMonitoredItemsResponse <em>Create Monitored Items Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCreateSessionRequest <em>Create Session Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCreateSessionResponse <em>Create Session Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCreateSubscriptionRequest <em>Create Subscription Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCreateSubscriptionResponse <em>Create Subscription Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getCurrencyUnitType <em>Currency Unit Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataChangeFilter <em>Data Change Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataChangeNotification <em>Data Change Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataChangeTrigger <em>Data Change Trigger</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDatagramConnectionTransportDataType <em>Datagram Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDatagramWriterGroupTransportDataType <em>Datagram Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataSetFieldFlags <em>Data Set Field Flags</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataSetMetaDataType <em>Data Set Meta Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataSetOrderingType <em>Data Set Ordering Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataSetReaderDataType <em>Data Set Reader Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataSetReaderMessageDataType <em>Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataSetReaderTransportDataType <em>Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataSetWriterDataType <em>Data Set Writer Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataSetWriterMessageDataType <em>Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataSetWriterTransportDataType <em>Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataTypeAttributes <em>Data Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataTypeDefinition <em>Data Type Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataTypeDescription <em>Data Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataTypeNode <em>Data Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataTypeSchemaHeader <em>Data Type Schema Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDataValue <em>Data Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDateString <em>Date String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeadbandType <em>Deadband Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDecimalDataType <em>Decimal Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDecimalString <em>Decimal String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteAtTimeDetails <em>Delete At Time Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteEventDetails <em>Delete Event Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteMonitoredItemsRequest <em>Delete Monitored Items Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteMonitoredItemsResponse <em>Delete Monitored Items Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteNodesItem <em>Delete Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteNodesRequest <em>Delete Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteNodesResponse <em>Delete Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteRawModifiedDetails <em>Delete Raw Modified Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteReferencesItem <em>Delete References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteReferencesRequest <em>Delete References Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteReferencesResponse <em>Delete References Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteSubscriptionsRequest <em>Delete Subscriptions Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDeleteSubscriptionsResponse <em>Delete Subscriptions Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDiagnosticInfo <em>Diagnostic Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDiagnosticsLevel <em>Diagnostics Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDiscoveryConfiguration <em>Discovery Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDouble <em>Double</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDoubleComplexNumberType <em>Double Complex Number Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getDurationString <em>Duration String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getElementOperand <em>Element Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEndpointConfiguration <em>Endpoint Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEndpointDescription <em>Endpoint Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEndpointType <em>Endpoint Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEndpointUrlListDataType <em>Endpoint Url List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEnumDefinition <em>Enum Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEnumDescription <em>Enum Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEnumField <em>Enum Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEnumValueType <em>Enum Value Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEUInformation <em>EU Information</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEventFieldList <em>Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEventFilter <em>Event Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEventFilterResult <em>Event Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEventNotificationList <em>Event Notification List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getEventNotifierType <em>Event Notifier Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getExceptionDeviationFormat <em>Exception Deviation Format</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getExpandedNodeId <em>Expanded Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getExtensionObject <em>Extension Object</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getFieldMetaData <em>Field Meta Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getFieldTargetDataType <em>Field Target Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getFilterOperand <em>Filter Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getFilterOperator <em>Filter Operator</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getFindServersOnNetworkRequest <em>Find Servers On Network Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getFindServersOnNetworkResponse <em>Find Servers On Network Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getFindServersRequest <em>Find Servers Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getFindServersResponse <em>Find Servers Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getGenericAttributes <em>Generic Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getGenericAttributeValue <em>Generic Attribute Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getGetEndpointsRequest <em>Get Endpoints Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getGetEndpointsResponse <em>Get Endpoints Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryData <em>History Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryEvent <em>History Event</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryEventFieldList <em>History Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryModifiedData <em>History Modified Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryReadDetails <em>History Read Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryReadRequest <em>History Read Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryReadResponse <em>History Read Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryReadResult <em>History Read Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryReadValueId <em>History Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryUpdateDetails <em>History Update Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryUpdateRequest <em>History Update Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryUpdateResponse <em>History Update Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryUpdateResult <em>History Update Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getHistoryUpdateType <em>History Update Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getIdentityCriteriaType <em>Identity Criteria Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getIdentityMappingRuleType <em>Identity Mapping Rule Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getImageBMP <em>Image BMP</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getImageGIF <em>Image GIF</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getImageJPG <em>Image JPG</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getImagePNG <em>Image PNG</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getInstanceNode <em>Instance Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getInt16 <em>Int16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getInt32 <em>Int32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getInt64 <em>Int64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getIntegerId <em>Integer Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getInvokeServiceRequest <em>Invoke Service Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getInvokeServiceResponse <em>Invoke Service Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getIssuedIdentityToken <em>Issued Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getJsonDataSetMessageContentMask <em>Json Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getJsonDataSetReaderMessageDataType <em>Json Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getJsonDataSetWriterMessageDataType <em>Json Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getJsonNetworkMessageContentMask <em>Json Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getJsonWriterGroupMessageDataType <em>Json Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getKeyValuePair <em>Key Value Pair</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfAddNodesItem <em>List Of Add Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfAddNodesResult <em>List Of Add Nodes Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfAddReferencesItem <em>List Of Add References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfAliasNameDataType <em>List Of Alias Name Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfApplicationDescription <em>List Of Application Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfArgument <em>List Of Argument</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBoolean <em>List Of Boolean</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBrokerConnectionTransportDataType <em>List Of Broker Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBrokerDataSetReaderTransportDataType <em>List Of Broker Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBrokerDataSetWriterTransportDataType <em>List Of Broker Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBrokerTransportQualityOfService <em>List Of Broker Transport Quality Of Service</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBrokerWriterGroupTransportDataType <em>List Of Broker Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBrowseDescription <em>List Of Browse Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBrowsePath <em>List Of Browse Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBrowsePathResult <em>List Of Browse Path Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBrowsePathTarget <em>List Of Browse Path Target</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfBrowseResult <em>List Of Browse Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfByte <em>List Of Byte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfByteString <em>List Of Byte String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfCallMethodRequest <em>List Of Call Method Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfCallMethodResult <em>List Of Call Method Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfCartesianCoordinates <em>List Of Cartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfConfigurationVersionDataType <em>List Of Configuration Version Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfConnectionTransportDataType <em>List Of Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfContentFilter <em>List Of Content Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfContentFilterElement <em>List Of Content Filter Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfContentFilterElementResult <em>List Of Content Filter Element Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfCurrencyUnitType <em>List Of Currency Unit Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDatagramConnectionTransportDataType <em>List Of Datagram Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDatagramWriterGroupTransportDataType <em>List Of Datagram Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataSetFieldContentMask <em>List Of Data Set Field Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataSetMetaDataType <em>List Of Data Set Meta Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataSetOrderingType <em>List Of Data Set Ordering Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataSetReaderDataType <em>List Of Data Set Reader Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataSetReaderMessageDataType <em>List Of Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataSetReaderTransportDataType <em>List Of Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataSetWriterDataType <em>List Of Data Set Writer Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataSetWriterMessageDataType <em>List Of Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataSetWriterTransportDataType <em>List Of Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataTypeDefinition <em>List Of Data Type Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataTypeDescription <em>List Of Data Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataTypeSchemaHeader <em>List Of Data Type Schema Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDataValue <em>List Of Data Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDateTime <em>List Of Date Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDeleteNodesItem <em>List Of Delete Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDeleteReferencesItem <em>List Of Delete References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDiagnosticInfo <em>List Of Diagnostic Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDiagnosticsLevel <em>List Of Diagnostics Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfDouble <em>List Of Double</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfEndpointConfiguration <em>List Of Endpoint Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfEndpointDescription <em>List Of Endpoint Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfEndpointType <em>List Of Endpoint Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfEndpointUrlListDataType <em>List Of Endpoint Url List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfEnumDefinition <em>List Of Enum Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfEnumDescription <em>List Of Enum Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfEnumField <em>List Of Enum Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfEnumValueType <em>List Of Enum Value Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfEventFieldList <em>List Of Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfExpandedNodeId <em>List Of Expanded Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfExtensionObject <em>List Of Extension Object</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfFieldMetaData <em>List Of Field Meta Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfFieldTargetDataType <em>List Of Field Target Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfFloat <em>List Of Float</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfFrame <em>List Of Frame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfGenericAttributeValue <em>List Of Generic Attribute Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfGuid <em>List Of Guid</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfHistoryEventFieldList <em>List Of History Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfHistoryReadResult <em>List Of History Read Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfHistoryReadValueId <em>List Of History Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfHistoryUpdateResult <em>List Of History Update Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfIdentityCriteriaType <em>List Of Identity Criteria Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfIdentityMappingRuleType <em>List Of Identity Mapping Rule Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfIdType <em>List Of Id Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfInt16 <em>List Of Int16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfInt32 <em>List Of Int32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfInt64 <em>List Of Int64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfJsonDataSetMessageContentMask <em>List Of Json Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfJsonDataSetReaderMessageDataType <em>List Of Json Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfJsonDataSetWriterMessageDataType <em>List Of Json Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfJsonNetworkMessageContentMask <em>List Of Json Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfJsonWriterGroupMessageDataType <em>List Of Json Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfKeyValuePair <em>List Of Key Value Pair</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfLocalizedText <em>List Of Localized Text</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfModelChangeStructureDataType <em>List Of Model Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfModificationInfo <em>List Of Modification Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfMonitoredItemCreateRequest <em>List Of Monitored Item Create Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfMonitoredItemCreateResult <em>List Of Monitored Item Create Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfMonitoredItemModifyRequest <em>List Of Monitored Item Modify Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfMonitoredItemModifyResult <em>List Of Monitored Item Modify Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfMonitoredItemNotification <em>List Of Monitored Item Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfNetworkAddressDataType <em>List Of Network Address Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfNetworkAddressUrlDataType <em>List Of Network Address Url Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfNetworkGroupDataType <em>List Of Network Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfNode <em>List Of Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfNodeId <em>List Of Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfNodeReference <em>List Of Node Reference</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfNodeTypeDescription <em>List Of Node Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfOpenFileMode <em>List Of Open File Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfOptionSet <em>List Of Option Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfOrientation <em>List Of Orientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfOverrideValueHandling <em>List Of Override Value Handling</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfParsingResult <em>List Of Parsing Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfPublishedDataItemsDataType <em>List Of Published Data Items Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfPublishedDataSetDataType <em>List Of Published Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfPublishedDataSetSourceDataType <em>List Of Published Data Set Source Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfPublishedEventsDataType <em>List Of Published Events Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfPublishedVariableDataType <em>List Of Published Variable Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfPubSubConfigurationDataType <em>List Of Pub Sub Configuration Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfPubSubConnectionDataType <em>List Of Pub Sub Connection Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfPubSubDiagnosticsCounterClassification <em>List Of Pub Sub Diagnostics Counter Classification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfPubSubGroupDataType <em>List Of Pub Sub Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfPubSubState <em>List Of Pub Sub State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfQualifiedName <em>List Of Qualified Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfQueryDataDescription <em>List Of Query Data Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfQueryDataSet <em>List Of Query Data Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfRationalNumber <em>List Of Rational Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfReaderGroupDataType <em>List Of Reader Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfReaderGroupMessageDataType <em>List Of Reader Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfReaderGroupTransportDataType <em>List Of Reader Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfReadValueId <em>List Of Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfRedundantServerDataType <em>List Of Redundant Server Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfReferenceDescription <em>List Of Reference Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfReferenceNode <em>List Of Reference Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfRegisteredServer <em>List Of Registered Server</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfRelativePathElement <em>List Of Relative Path Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfRolePermissionType <em>List Of Role Permission Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSamplingIntervalDiagnosticsDataType <em>List Of Sampling Interval Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSByte <em>List Of SByte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSemanticChangeStructureDataType <em>List Of Semantic Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfServerOnNetwork <em>List Of Server On Network</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSessionDiagnosticsDataType <em>List Of Session Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSessionSecurityDiagnosticsDataType <em>List Of Session Security Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSignedSoftwareCertificate <em>List Of Signed Software Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSimpleAttributeOperand <em>List Of Simple Attribute Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSimpleTypeDescription <em>List Of Simple Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfStatusCode <em>List Of Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfStatusResult <em>List Of Status Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfString <em>List Of String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfStructureDefinition <em>List Of Structure Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfStructureDescription <em>List Of Structure Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfStructureField <em>List Of Structure Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSubscribedDataSetDataType <em>List Of Subscribed Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSubscribedDataSetMirrorDataType <em>List Of Subscribed Data Set Mirror Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSubscriptionAcknowledgement <em>List Of Subscription Acknowledgement</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfSubscriptionDiagnosticsDataType <em>List Of Subscription Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfTargetVariablesDataType <em>List Of Target Variables Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfThreeDCartesianCoordinates <em>List Of Three DCartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfThreeDFrame <em>List Of Three DFrame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfThreeDOrientation <em>List Of Three DOrientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfThreeDVector <em>List Of Three DVector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfTimeZoneDataType <em>List Of Time Zone Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfTransferResult <em>List Of Transfer Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfTrustListDataType <em>List Of Trust List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUABinaryFileDataType <em>List Of UA Binary File Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUadpDataSetMessageContentMask <em>List Of Uadp Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUadpDataSetReaderMessageDataType <em>List Of Uadp Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUadpDataSetWriterMessageDataType <em>List Of Uadp Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUadpNetworkMessageContentMask <em>List Of Uadp Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUadpWriterGroupMessageDataType <em>List Of Uadp Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUInt16 <em>List Of UInt16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUInt32 <em>List Of UInt32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUInt64 <em>List Of UInt64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUnion <em>List Of Union</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfUserTokenPolicy <em>List Of User Token Policy</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfVariant <em>List Of Variant</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfVector <em>List Of Vector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfWriterGroupDataType <em>List Of Writer Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfWriterGroupMessageDataType <em>List Of Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfWriterGroupTransportDataType <em>List Of Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfWriteValue <em>List Of Write Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getListOfXmlElement <em>List Of Xml Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getLiteralOperand <em>Literal Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getLocaleId <em>Locale Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getLocalizedText <em>Localized Text</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMdnsDiscoveryConfiguration <em>Mdns Discovery Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMessageSecurityMode <em>Message Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMethodAttributes <em>Method Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMethodNode <em>Method Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getModelChangeStructureDataType <em>Model Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getModelChangeStructureVerbMask <em>Model Change Structure Verb Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getModificationInfo <em>Modification Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getModifyMonitoredItemsRequest <em>Modify Monitored Items Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getModifyMonitoredItemsResponse <em>Modify Monitored Items Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getModifySubscriptionRequest <em>Modify Subscription Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getModifySubscriptionResponse <em>Modify Subscription Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMonitoredItemCreateRequest <em>Monitored Item Create Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMonitoredItemCreateResult <em>Monitored Item Create Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMonitoredItemModifyRequest <em>Monitored Item Modify Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMonitoredItemModifyResult <em>Monitored Item Modify Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMonitoredItemNotification <em>Monitored Item Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMonitoringFilter <em>Monitoring Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMonitoringFilterResult <em>Monitoring Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMonitoringMode <em>Monitoring Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getMonitoringParameters <em>Monitoring Parameters</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNetworkAddressDataType <em>Network Address Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNetworkAddressUrlDataType <em>Network Address Url Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNetworkGroupDataType <em>Network Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNodeAttributes <em>Node Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNodeAttributesMask <em>Node Attributes Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNodeClass <em>Node Class</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNodeReference <em>Node Reference</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNodeTypeDescription <em>Node Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNormalizedString <em>Normalized String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNotificationData <em>Notification Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNotificationMessage <em>Notification Message</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getNumericRange <em>Numeric Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getObjectAttributes <em>Object Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getObjectNode <em>Object Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getObjectTypeAttributes <em>Object Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getObjectTypeNode <em>Object Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getOpenFileMode <em>Open File Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getOpenSecureChannelRequest <em>Open Secure Channel Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getOpenSecureChannelResponse <em>Open Secure Channel Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getOptionSet <em>Option Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getOverrideValueHandling <em>Override Value Handling</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getParsingResult <em>Parsing Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPerformUpdateType <em>Perform Update Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPermissionType <em>Permission Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getProgramDiagnostic2DataType <em>Program Diagnostic2 Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getProgramDiagnosticDataType <em>Program Diagnostic Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPublishedDataItemsDataType <em>Published Data Items Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPublishedDataSetDataType <em>Published Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPublishedDataSetSourceDataType <em>Published Data Set Source Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPublishedEventsDataType <em>Published Events Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPublishedVariableDataType <em>Published Variable Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPublishRequest <em>Publish Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPublishResponse <em>Publish Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPubSubConfigurationDataType <em>Pub Sub Configuration Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPubSubConnectionDataType <em>Pub Sub Connection Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPubSubDiagnosticsCounterClassification <em>Pub Sub Diagnostics Counter Classification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPubSubGroupDataType <em>Pub Sub Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getPubSubState <em>Pub Sub State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getQueryDataDescription <em>Query Data Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getQueryDataSet <em>Query Data Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getQueryFirstRequest <em>Query First Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getQueryFirstResponse <em>Query First Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getQueryNextRequest <em>Query Next Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getQueryNextResponse <em>Query Next Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRationalNumber <em>Rational Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReadAnnotationDataDetails <em>Read Annotation Data Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReadAtTimeDetails <em>Read At Time Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReaderGroupDataType <em>Reader Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReaderGroupMessageDataType <em>Reader Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReaderGroupTransportDataType <em>Reader Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReadEventDetails <em>Read Event Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReadProcessedDetails <em>Read Processed Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReadRawModifiedDetails <em>Read Raw Modified Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReadRequest <em>Read Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReadResponse <em>Read Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReadValueId <em>Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRedundancySupport <em>Redundancy Support</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRedundantServerDataType <em>Redundant Server Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReferenceDescription <em>Reference Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReferenceNode <em>Reference Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReferenceTypeAttributes <em>Reference Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getReferenceTypeNode <em>Reference Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRegisteredServer <em>Registered Server</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRegisterNodesRequest <em>Register Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRegisterNodesResponse <em>Register Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRegisterServer2Request <em>Register Server2 Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRegisterServer2Response <em>Register Server2 Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRegisterServerRequest <em>Register Server Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRegisterServerResponse <em>Register Server Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRelativePathElement <em>Relative Path Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRepublishRequest <em>Republish Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRepublishResponse <em>Republish Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRolePermissionType <em>Role Permission Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getRsaEncryptedSecret <em>Rsa Encrypted Secret</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSamplingIntervalDiagnosticsDataType <em>Sampling Interval Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSByte <em>SByte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSecurityTokenRequestType <em>Security Token Request Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSemanticChangeStructureDataType <em>Semantic Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getServerDiagnosticsSummaryDataType <em>Server Diagnostics Summary Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getServerOnNetwork <em>Server On Network</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getServerState <em>Server State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getServerStatusDataType <em>Server Status Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getServiceCounterDataType <em>Service Counter Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getServiceFault <em>Service Fault</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSessionAuthenticationToken <em>Session Authentication Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSessionDiagnosticsDataType <em>Session Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSessionlessInvokeRequestType <em>Sessionless Invoke Request Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSessionlessInvokeResponseType <em>Sessionless Invoke Response Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSessionSecurityDiagnosticsDataType <em>Session Security Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSetMonitoringModeRequest <em>Set Monitoring Mode Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSetMonitoringModeResponse <em>Set Monitoring Mode Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSetPublishingModeRequest <em>Set Publishing Mode Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSetPublishingModeResponse <em>Set Publishing Mode Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSetTriggeringRequest <em>Set Triggering Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSetTriggeringResponse <em>Set Triggering Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSignatureData <em>Signature Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSignedSoftwareCertificate <em>Signed Software Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSimpleAttributeOperand <em>Simple Attribute Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSimpleTypeDescription <em>Simple Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getStatusChangeNotification <em>Status Change Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getStatusResult <em>Status Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getString <em>String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getStructureDescription <em>Structure Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getStructureField <em>Structure Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSubscribedDataSetDataType <em>Subscribed Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSubscribedDataSetMirrorDataType <em>Subscribed Data Set Mirror Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSubscriptionAcknowledgement <em>Subscription Acknowledgement</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getSubscriptionDiagnosticsDataType <em>Subscription Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTargetVariablesDataType <em>Target Variables Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getThreeDCartesianCoordinates <em>Three DCartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getThreeDFrame <em>Three DFrame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getThreeDOrientation <em>Three DOrientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getThreeDVector <em>Three DVector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTimestampsToReturn <em>Timestamps To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTimeString <em>Time String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTimeZoneDataType <em>Time Zone Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTransferResult <em>Transfer Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTransferSubscriptionsRequest <em>Transfer Subscriptions Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTransferSubscriptionsResponse <em>Transfer Subscriptions Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTranslateBrowsePathsToNodeIdsRequest <em>Translate Browse Paths To Node Ids Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTranslateBrowsePathsToNodeIdsResponse <em>Translate Browse Paths To Node Ids Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTrustListDataType <em>Trust List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTrustListMasks <em>Trust List Masks</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getTypeNode <em>Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUABinaryFileDataType <em>UA Binary File Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUadpDataSetMessageContentMask <em>Uadp Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUadpDataSetReaderMessageDataType <em>Uadp Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUadpDataSetWriterMessageDataType <em>Uadp Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUadpNetworkMessageContentMask <em>Uadp Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUadpWriterGroupMessageDataType <em>Uadp Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUInt16 <em>UInt16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUInt32 <em>UInt32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUInt64 <em>UInt64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUnregisterNodesRequest <em>Unregister Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUnregisterNodesResponse <em>Unregister Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUpdateDataDetails <em>Update Data Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUpdateEventDetails <em>Update Event Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUpdateStructureDataDetails <em>Update Structure Data Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUserIdentityToken <em>User Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUserNameIdentityToken <em>User Name Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUserTokenPolicy <em>User Token Policy</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUserTokenType <em>User Token Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getUtcTime <em>Utc Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getVariableAttributes <em>Variable Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getVariableNode <em>Variable Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getVariableTypeAttributes <em>Variable Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getVariableTypeNode <em>Variable Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getVersionTime <em>Version Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getViewAttributes <em>View Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getViewDescription <em>View Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getViewNode <em>View Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getWriteRequest <em>Write Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getWriteResponse <em>Write Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getWriterGroupDataType <em>Writer Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getWriterGroupMessageDataType <em>Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getWriterGroupTransportDataType <em>Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getWriteValue <em>Write Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getX509IdentityToken <em>X509 Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DocumentRootImpl#getXVType <em>XV Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAccessLevelExType() <em>Access Level Ex Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevelExType()
	 * @generated
	 * @ordered
	 */
	protected static final long ACCESS_LEVEL_EX_TYPE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getAccessLevelType() <em>Access Level Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevelType()
	 * @generated
	 * @ordered
	 */
	protected static final short ACCESS_LEVEL_TYPE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getApplicationInstanceCertificate() <em>Application Instance Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationInstanceCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] APPLICATION_INSTANCE_CERTIFICATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationType APPLICATION_TYPE_EDEFAULT = ApplicationType.SERVER0;

	/**
	 * The default value of the '{@link #getAttributeWriteMask() <em>Attribute Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeWriteMask()
	 * @generated
	 * @ordered
	 */
	protected static final long ATTRIBUTE_WRITE_MASK_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getAudioDataType() <em>Audio Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioDataType()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] AUDIO_DATA_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAxisScaleEnumeration() <em>Axis Scale Enumeration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisScaleEnumeration()
	 * @generated
	 * @ordered
	 */
	protected static final AxisScaleEnumeration AXIS_SCALE_ENUMERATION_EDEFAULT = AxisScaleEnumeration.LINEAR0;

	/**
	 * The default value of the '{@link #getBitFieldMaskDataType() <em>Bit Field Mask Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitFieldMaskDataType()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIT_FIELD_MASK_DATA_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOOLEAN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBrokerTransportQualityOfService() <em>Broker Transport Quality Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerTransportQualityOfService()
	 * @generated
	 * @ordered
	 */
	protected static final BrokerTransportQualityOfService BROKER_TRANSPORT_QUALITY_OF_SERVICE_EDEFAULT = BrokerTransportQualityOfService.NOT_SPECIFIED0;

	/**
	 * The default value of the '{@link #getBrowseDirection() <em>Browse Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowseDirection()
	 * @generated
	 * @ordered
	 */
	protected static final BrowseDirection BROWSE_DIRECTION_EDEFAULT = BrowseDirection.FORWARD0;

	/**
	 * The default value of the '{@link #getBrowseResultMask() <em>Browse Result Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowseResultMask()
	 * @generated
	 * @ordered
	 */
	protected static final BrowseResultMask BROWSE_RESULT_MASK_EDEFAULT = BrowseResultMask.NONE0;

	/**
	 * The default value of the '{@link #getByte() <em>Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByte()
	 * @generated
	 * @ordered
	 */
	protected static final Short BYTE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getByteString() <em>Byte String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteString()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BYTE_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContinuationPoint() <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuationPoint()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CONTINUATION_POINT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected static final long COUNTER_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getDataChangeTrigger() <em>Data Change Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataChangeTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final DataChangeTrigger DATA_CHANGE_TRIGGER_EDEFAULT = DataChangeTrigger.STATUS0;

	/**
	 * The default value of the '{@link #getDataSetFieldContentMask() <em>Data Set Field Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetFieldContentMask()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_SET_FIELD_CONTENT_MASK_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getDataSetFieldFlags() <em>Data Set Field Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetFieldFlags()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_SET_FIELD_FLAGS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDataSetOrderingType() <em>Data Set Ordering Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetOrderingType()
	 * @generated
	 * @ordered
	 */
	protected static final DataSetOrderingType DATA_SET_ORDERING_TYPE_EDEFAULT = DataSetOrderingType.UNDEFINED0;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDateString() <em>Date String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateString()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDeadbandType() <em>Deadband Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadbandType()
	 * @generated
	 * @ordered
	 */
	protected static final DeadbandType DEADBAND_TYPE_EDEFAULT = DeadbandType.NONE0;

	/**
	 * The default value of the '{@link #getDecimalString() <em>Decimal String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalString()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIMAL_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDiagnosticsLevel() <em>Diagnostics Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticsLevel()
	 * @generated
	 * @ordered
	 */
	protected static final DiagnosticsLevel DIAGNOSTICS_LEVEL_EDEFAULT = DiagnosticsLevel.BASIC0;

	/**
	 * The default value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected static final Double DOUBLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getDurationString() <em>Duration String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationString()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEventNotifierType() <em>Event Notifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventNotifierType()
	 * @generated
	 * @ordered
	 */
	protected static final short EVENT_NOTIFIER_TYPE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getExceptionDeviationFormat() <em>Exception Deviation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionDeviationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final ExceptionDeviationFormat EXCEPTION_DEVIATION_FORMAT_EDEFAULT = ExceptionDeviationFormat.ABSOLUTE_VALUE0;

	/**
	 * The default value of the '{@link #getFilterOperator() <em>Filter Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOperator()
	 * @generated
	 * @ordered
	 */
	protected static final FilterOperator FILTER_OPERATOR_EDEFAULT = FilterOperator.EQUALS0;

	/**
	 * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected static final Float FLOAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHistoryUpdateType() <em>History Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryUpdateType()
	 * @generated
	 * @ordered
	 */
	protected static final HistoryUpdateType HISTORY_UPDATE_TYPE_EDEFAULT = HistoryUpdateType.INSERT1;

	/**
	 * The default value of the '{@link #getIdentityCriteriaType() <em>Identity Criteria Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityCriteriaType()
	 * @generated
	 * @ordered
	 */
	protected static final IdentityCriteriaType IDENTITY_CRITERIA_TYPE_EDEFAULT = IdentityCriteriaType.USER_NAME1;

	/**
	 * The default value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdType()
	 * @generated
	 * @ordered
	 */
	protected static final IdType ID_TYPE_EDEFAULT = IdType.NUMERIC0;

	/**
	 * The default value of the '{@link #getImageBMP() <em>Image BMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageBMP()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] IMAGE_BMP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImageGIF() <em>Image GIF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageGIF()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] IMAGE_GIF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImageJPG() <em>Image JPG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageJPG()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] IMAGE_JPG_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImagePNG() <em>Image PNG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePNG()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] IMAGE_PNG_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final long INDEX_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getInt16() <em>Int16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt16()
	 * @generated
	 * @ordered
	 */
	protected static final Short INT16_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInt32() <em>Int32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt32()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INT32_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInt64() <em>Int64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt64()
	 * @generated
	 * @ordered
	 */
	protected static final Long INT64_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIntegerId() <em>Integer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerId()
	 * @generated
	 * @ordered
	 */
	protected static final long INTEGER_ID_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getInvokeServiceRequest() <em>Invoke Service Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokeServiceRequest()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] INVOKE_SERVICE_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInvokeServiceResponse() <em>Invoke Service Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokeServiceResponse()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] INVOKE_SERVICE_RESPONSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getJsonDataSetMessageContentMask() <em>Json Data Set Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonDataSetMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected static final long JSON_DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getJsonNetworkMessageContentMask() <em>Json Network Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonNetworkMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected static final long JSON_NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getLocaleId() <em>Locale Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMessageSecurityMode() <em>Message Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSecurityMode()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSecurityMode MESSAGE_SECURITY_MODE_EDEFAULT = MessageSecurityMode.INVALID0;

	/**
	 * The default value of the '{@link #getModelChangeStructureVerbMask() <em>Model Change Structure Verb Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelChangeStructureVerbMask()
	 * @generated
	 * @ordered
	 */
	protected static final ModelChangeStructureVerbMask MODEL_CHANGE_STRUCTURE_VERB_MASK_EDEFAULT = ModelChangeStructureVerbMask.NODE_ADDED1;

	/**
	 * The default value of the '{@link #getMonitoringMode() <em>Monitoring Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringMode()
	 * @generated
	 * @ordered
	 */
	protected static final MonitoringMode MONITORING_MODE_EDEFAULT = MonitoringMode.DISABLED0;

	/**
	 * The default value of the '{@link #getNodeAttributesMask() <em>Node Attributes Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeAttributesMask()
	 * @generated
	 * @ordered
	 */
	protected static final NodeAttributesMask NODE_ATTRIBUTES_MASK_EDEFAULT = NodeAttributesMask.NONE0;

	/**
	 * The default value of the '{@link #getNodeClass() <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeClass()
	 * @generated
	 * @ordered
	 */
	protected static final NodeClass NODE_CLASS_EDEFAULT = NodeClass.UNSPECIFIED0;

	/**
	 * The default value of the '{@link #getNormalizedString() <em>Normalized String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizedString()
	 * @generated
	 * @ordered
	 */
	protected static final String NORMALIZED_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNumericRange() <em>Numeric Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericRange()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERIC_RANGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOpenFileMode() <em>Open File Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenFileMode()
	 * @generated
	 * @ordered
	 */
	protected static final OpenFileMode OPEN_FILE_MODE_EDEFAULT = OpenFileMode.READ1;

	/**
	 * The default value of the '{@link #getOverrideValueHandling() <em>Override Value Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideValueHandling()
	 * @generated
	 * @ordered
	 */
	protected static final OverrideValueHandling OVERRIDE_VALUE_HANDLING_EDEFAULT = OverrideValueHandling.DISABLED0;

	/**
	 * The default value of the '{@link #getPerformUpdateType() <em>Perform Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformUpdateType()
	 * @generated
	 * @ordered
	 */
	protected static final PerformUpdateType PERFORM_UPDATE_TYPE_EDEFAULT = PerformUpdateType.INSERT1;

	/**
	 * The default value of the '{@link #getPermissionType() <em>Permission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionType()
	 * @generated
	 * @ordered
	 */
	protected static final long PERMISSION_TYPE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getPubSubDiagnosticsCounterClassification() <em>Pub Sub Diagnostics Counter Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubSubDiagnosticsCounterClassification()
	 * @generated
	 * @ordered
	 */
	protected static final PubSubDiagnosticsCounterClassification PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION_EDEFAULT = PubSubDiagnosticsCounterClassification.INFORMATION0;

	/**
	 * The default value of the '{@link #getPubSubState() <em>Pub Sub State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubSubState()
	 * @generated
	 * @ordered
	 */
	protected static final PubSubState PUB_SUB_STATE_EDEFAULT = PubSubState.DISABLED0;

	/**
	 * The default value of the '{@link #getRedundancySupport() <em>Redundancy Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedundancySupport()
	 * @generated
	 * @ordered
	 */
	protected static final RedundancySupport REDUNDANCY_SUPPORT_EDEFAULT = RedundancySupport.NONE0;

	/**
	 * The default value of the '{@link #getSByte() <em>SByte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSByte()
	 * @generated
	 * @ordered
	 */
	protected static final Byte SBYTE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSecurityTokenRequestType() <em>Security Token Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityTokenRequestType()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityTokenRequestType SECURITY_TOKEN_REQUEST_TYPE_EDEFAULT = SecurityTokenRequestType.ISSUE0;

	/**
	 * The default value of the '{@link #getServerState() <em>Server State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerState()
	 * @generated
	 * @ordered
	 */
	protected static final ServerState SERVER_STATE_EDEFAULT = ServerState.RUNNING0;

	/**
	 * The default value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStructureType() <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected static final StructureType STRUCTURE_TYPE_EDEFAULT = StructureType.STRUCTURE0;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTimestampsToReturn() <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampsToReturn()
	 * @generated
	 * @ordered
	 */
	protected static final TimestampsToReturn TIMESTAMPS_TO_RETURN_EDEFAULT = TimestampsToReturn.SOURCE0;

	/**
	 * The default value of the '{@link #getTimeString() <em>Time String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeString()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTrustListMasks() <em>Trust List Masks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustListMasks()
	 * @generated
	 * @ordered
	 */
	protected static final TrustListMasks TRUST_LIST_MASKS_EDEFAULT = TrustListMasks.NONE0;

	/**
	 * The default value of the '{@link #getUadpDataSetMessageContentMask() <em>Uadp Data Set Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUadpDataSetMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected static final long UADP_DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getUadpNetworkMessageContentMask() <em>Uadp Network Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUadpNetworkMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected static final long UADP_NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getUInt16() <em>UInt16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUInt16()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UINT16_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUInt32() <em>UInt32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUInt32()
	 * @generated
	 * @ordered
	 */
	protected static final Long UINT32_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUInt64() <em>UInt64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUInt64()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UINT64_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUserTokenType() <em>User Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTokenType()
	 * @generated
	 * @ordered
	 */
	protected static final UserTokenType USER_TOKEN_TYPE_EDEFAULT = UserTokenType.ANONYMOUS0;

	/**
	 * The default value of the '{@link #getUtcTime() <em>Utc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtcTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar UTC_TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersionTime() <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTime()
	 * @generated
	 * @ordered
	 */
	protected static final long VERSION_TIME_EDEFAULT = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TypesPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAccessLevelExType() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AccessLevelExType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLevelExType(long newAccessLevelExType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AccessLevelExType(), newAccessLevelExType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getAccessLevelType() {
		return (Short)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AccessLevelType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLevelType(short newAccessLevelType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AccessLevelType(), newAccessLevelType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateSessionRequest getActivateSessionRequest() {
		return (ActivateSessionRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivateSessionRequest(ActivateSessionRequest newActivateSessionRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionRequest(), newActivateSessionRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivateSessionRequest(ActivateSessionRequest newActivateSessionRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionRequest(), newActivateSessionRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateSessionResponse getActivateSessionResponse() {
		return (ActivateSessionResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivateSessionResponse(ActivateSessionResponse newActivateSessionResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionResponse(), newActivateSessionResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivateSessionResponse(ActivateSessionResponse newActivateSessionResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionResponse(), newActivateSessionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNodesItem getAddNodesItem() {
		return (AddNodesItem)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddNodesItem(AddNodesItem newAddNodesItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesItem(), newAddNodesItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddNodesItem(AddNodesItem newAddNodesItem) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesItem(), newAddNodesItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNodesRequest getAddNodesRequest() {
		return (AddNodesRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddNodesRequest(AddNodesRequest newAddNodesRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesRequest(), newAddNodesRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddNodesRequest(AddNodesRequest newAddNodesRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesRequest(), newAddNodesRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNodesResponse getAddNodesResponse() {
		return (AddNodesResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddNodesResponse(AddNodesResponse newAddNodesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResponse(), newAddNodesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddNodesResponse(AddNodesResponse newAddNodesResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResponse(), newAddNodesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNodesResult getAddNodesResult() {
		return (AddNodesResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddNodesResult(AddNodesResult newAddNodesResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResult(), newAddNodesResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddNodesResult(AddNodesResult newAddNodesResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResult(), newAddNodesResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddReferencesItem getAddReferencesItem() {
		return (AddReferencesItem)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddReferencesItem(AddReferencesItem newAddReferencesItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesItem(), newAddReferencesItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddReferencesItem(AddReferencesItem newAddReferencesItem) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesItem(), newAddReferencesItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddReferencesRequest getAddReferencesRequest() {
		return (AddReferencesRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddReferencesRequest(AddReferencesRequest newAddReferencesRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesRequest(), newAddReferencesRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddReferencesRequest(AddReferencesRequest newAddReferencesRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesRequest(), newAddReferencesRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddReferencesResponse getAddReferencesResponse() {
		return (AddReferencesResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddReferencesResponse(AddReferencesResponse newAddReferencesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesResponse(), newAddReferencesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddReferencesResponse(AddReferencesResponse newAddReferencesResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesResponse(), newAddReferencesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateConfiguration getAggregateConfiguration() {
		return (AggregateConfiguration)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AggregateConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateConfiguration(AggregateConfiguration newAggregateConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AggregateConfiguration(), newAggregateConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateConfiguration(AggregateConfiguration newAggregateConfiguration) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AggregateConfiguration(), newAggregateConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateFilter getAggregateFilter() {
		return (AggregateFilter)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateFilter(AggregateFilter newAggregateFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilter(), newAggregateFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateFilter(AggregateFilter newAggregateFilter) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilter(), newAggregateFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateFilterResult getAggregateFilterResult() {
		return (AggregateFilterResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilterResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateFilterResult(AggregateFilterResult newAggregateFilterResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilterResult(), newAggregateFilterResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateFilterResult(AggregateFilterResult newAggregateFilterResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilterResult(), newAggregateFilterResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasNameDataType getAliasNameDataType() {
		return (AliasNameDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AliasNameDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliasNameDataType(AliasNameDataType newAliasNameDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AliasNameDataType(), newAliasNameDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasNameDataType(AliasNameDataType newAliasNameDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AliasNameDataType(), newAliasNameDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotation() {
		return (Annotation)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Annotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_Annotation(), newAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Annotation(), newAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIdentityToken getAnonymousIdentityToken() {
		return (AnonymousIdentityToken)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AnonymousIdentityToken(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousIdentityToken(AnonymousIdentityToken newAnonymousIdentityToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AnonymousIdentityToken(), newAnonymousIdentityToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousIdentityToken(AnonymousIdentityToken newAnonymousIdentityToken) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AnonymousIdentityToken(), newAnonymousIdentityToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDescription getApplicationDescription() {
		return (ApplicationDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationDescription(ApplicationDescription newApplicationDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationDescription(), newApplicationDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationDescription(ApplicationDescription newApplicationDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationDescription(), newApplicationDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getApplicationInstanceCertificate() {
		return (byte[])getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationInstanceCertificate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationInstanceCertificate(byte[] newApplicationInstanceCertificate) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationInstanceCertificate(), newApplicationInstanceCertificate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType getApplicationType() {
		return (ApplicationType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationType(ApplicationType newApplicationType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationType(), newApplicationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getArgument() {
		return (Argument)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Argument(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument(Argument newArgument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_Argument(), newArgument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(Argument newArgument) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Argument(), newArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOperand getAttributeOperand() {
		return (AttributeOperand)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AttributeOperand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeOperand(AttributeOperand newAttributeOperand, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AttributeOperand(), newAttributeOperand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeOperand(AttributeOperand newAttributeOperand) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AttributeOperand(), newAttributeOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAttributeWriteMask() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AttributeWriteMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeWriteMask(long newAttributeWriteMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AttributeWriteMask(), newAttributeWriteMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getAudioDataType() {
		return (byte[])getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AudioDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioDataType(byte[] newAudioDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AudioDataType(), newAudioDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisInformation getAxisInformation() {
		return (AxisInformation)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AxisInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisInformation(AxisInformation newAxisInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_AxisInformation(), newAxisInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisInformation(AxisInformation newAxisInformation) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AxisInformation(), newAxisInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisScaleEnumeration getAxisScaleEnumeration() {
		return (AxisScaleEnumeration)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_AxisScaleEnumeration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisScaleEnumeration(AxisScaleEnumeration newAxisScaleEnumeration) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_AxisScaleEnumeration(), newAxisScaleEnumeration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBitFieldMaskDataType() {
		return (BigInteger)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BitFieldMaskDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitFieldMaskDataType(BigInteger newBitFieldMaskDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BitFieldMaskDataType(), newBitFieldMaskDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBoolean() {
		return (Boolean)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Boolean(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean(Boolean newBoolean) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Boolean(), newBoolean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerConnectionTransportDataType getBrokerConnectionTransportDataType() {
		return (BrokerConnectionTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrokerConnectionTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrokerConnectionTransportDataType(BrokerConnectionTransportDataType newBrokerConnectionTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrokerConnectionTransportDataType(), newBrokerConnectionTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrokerConnectionTransportDataType(BrokerConnectionTransportDataType newBrokerConnectionTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrokerConnectionTransportDataType(), newBrokerConnectionTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerDataSetReaderTransportDataType getBrokerDataSetReaderTransportDataType() {
		return (BrokerDataSetReaderTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetReaderTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrokerDataSetReaderTransportDataType(BrokerDataSetReaderTransportDataType newBrokerDataSetReaderTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetReaderTransportDataType(), newBrokerDataSetReaderTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrokerDataSetReaderTransportDataType(BrokerDataSetReaderTransportDataType newBrokerDataSetReaderTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetReaderTransportDataType(), newBrokerDataSetReaderTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerDataSetWriterTransportDataType getBrokerDataSetWriterTransportDataType() {
		return (BrokerDataSetWriterTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetWriterTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrokerDataSetWriterTransportDataType(BrokerDataSetWriterTransportDataType newBrokerDataSetWriterTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetWriterTransportDataType(), newBrokerDataSetWriterTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrokerDataSetWriterTransportDataType(BrokerDataSetWriterTransportDataType newBrokerDataSetWriterTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetWriterTransportDataType(), newBrokerDataSetWriterTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerTransportQualityOfService getBrokerTransportQualityOfService() {
		return (BrokerTransportQualityOfService)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrokerTransportQualityOfService(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrokerTransportQualityOfService(BrokerTransportQualityOfService newBrokerTransportQualityOfService) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrokerTransportQualityOfService(), newBrokerTransportQualityOfService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerWriterGroupTransportDataType getBrokerWriterGroupTransportDataType() {
		return (BrokerWriterGroupTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrokerWriterGroupTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrokerWriterGroupTransportDataType(BrokerWriterGroupTransportDataType newBrokerWriterGroupTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrokerWriterGroupTransportDataType(), newBrokerWriterGroupTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrokerWriterGroupTransportDataType(BrokerWriterGroupTransportDataType newBrokerWriterGroupTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrokerWriterGroupTransportDataType(), newBrokerWriterGroupTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseDescription getBrowseDescription() {
		return (BrowseDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowseDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowseDescription(BrowseDescription newBrowseDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrowseDescription(), newBrowseDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseDescription(BrowseDescription newBrowseDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowseDescription(), newBrowseDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseDirection getBrowseDirection() {
		return (BrowseDirection)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowseDirection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseDirection(BrowseDirection newBrowseDirection) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowseDirection(), newBrowseDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseNextRequest getBrowseNextRequest() {
		return (BrowseNextRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowseNextRequest(BrowseNextRequest newBrowseNextRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextRequest(), newBrowseNextRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseNextRequest(BrowseNextRequest newBrowseNextRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextRequest(), newBrowseNextRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseNextResponse getBrowseNextResponse() {
		return (BrowseNextResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowseNextResponse(BrowseNextResponse newBrowseNextResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextResponse(), newBrowseNextResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseNextResponse(BrowseNextResponse newBrowseNextResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextResponse(), newBrowseNextResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowsePath getBrowsePath() {
		return (BrowsePath)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowsePath(BrowsePath newBrowsePath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePath(), newBrowsePath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowsePath(BrowsePath newBrowsePath) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePath(), newBrowsePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowsePathResult getBrowsePathResult() {
		return (BrowsePathResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowsePathResult(BrowsePathResult newBrowsePathResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathResult(), newBrowsePathResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowsePathResult(BrowsePathResult newBrowsePathResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathResult(), newBrowsePathResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowsePathTarget getBrowsePathTarget() {
		return (BrowsePathTarget)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathTarget(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowsePathTarget(BrowsePathTarget newBrowsePathTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathTarget(), newBrowsePathTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowsePathTarget(BrowsePathTarget newBrowsePathTarget) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathTarget(), newBrowsePathTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseRequest getBrowseRequest() {
		return (BrowseRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowseRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowseRequest(BrowseRequest newBrowseRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrowseRequest(), newBrowseRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseRequest(BrowseRequest newBrowseRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowseRequest(), newBrowseRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseResponse getBrowseResponse() {
		return (BrowseResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowseResponse(BrowseResponse newBrowseResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResponse(), newBrowseResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseResponse(BrowseResponse newBrowseResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResponse(), newBrowseResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseResult getBrowseResult() {
		return (BrowseResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowseResult(BrowseResult newBrowseResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResult(), newBrowseResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseResult(BrowseResult newBrowseResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResult(), newBrowseResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseResultMask getBrowseResultMask() {
		return (BrowseResultMask)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResultMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseResultMask(BrowseResultMask newBrowseResultMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResultMask(), newBrowseResultMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildInfo getBuildInfo() {
		return (BuildInfo)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_BuildInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildInfo(BuildInfo newBuildInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_BuildInfo(), newBuildInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildInfo(BuildInfo newBuildInfo) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_BuildInfo(), newBuildInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getByte() {
		return (Short)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Byte(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByte(Short newByte) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Byte(), newByte);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getByteString() {
		return (byte[])getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ByteString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteString(byte[] newByteString) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ByteString(), newByteString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallMethodRequest getCallMethodRequest() {
		return (CallMethodRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallMethodRequest(CallMethodRequest newCallMethodRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodRequest(), newCallMethodRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallMethodRequest(CallMethodRequest newCallMethodRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodRequest(), newCallMethodRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallMethodResult getCallMethodResult() {
		return (CallMethodResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallMethodResult(CallMethodResult newCallMethodResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodResult(), newCallMethodResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallMethodResult(CallMethodResult newCallMethodResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodResult(), newCallMethodResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallRequest getCallRequest() {
		return (CallRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CallRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallRequest(CallRequest newCallRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CallRequest(), newCallRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallRequest(CallRequest newCallRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CallRequest(), newCallRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallResponse getCallResponse() {
		return (CallResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CallResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallResponse(CallResponse newCallResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CallResponse(), newCallResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallResponse(CallResponse newCallResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CallResponse(), newCallResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelRequest getCancelRequest() {
		return (CancelRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CancelRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelRequest(CancelRequest newCancelRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CancelRequest(), newCancelRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelRequest(CancelRequest newCancelRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CancelRequest(), newCancelRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelResponse getCancelResponse() {
		return (CancelResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CancelResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelResponse(CancelResponse newCancelResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CancelResponse(), newCancelResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelResponse(CancelResponse newCancelResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CancelResponse(), newCancelResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinates getCartesianCoordinates() {
		return (CartesianCoordinates)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CartesianCoordinates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCoordinates(CartesianCoordinates newCartesianCoordinates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CartesianCoordinates(), newCartesianCoordinates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartesianCoordinates(CartesianCoordinates newCartesianCoordinates) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CartesianCoordinates(), newCartesianCoordinates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelSecurityToken getChannelSecurityToken() {
		return (ChannelSecurityToken)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ChannelSecurityToken(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelSecurityToken(ChannelSecurityToken newChannelSecurityToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ChannelSecurityToken(), newChannelSecurityToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelSecurityToken(ChannelSecurityToken newChannelSecurityToken) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ChannelSecurityToken(), newChannelSecurityToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseSecureChannelRequest getCloseSecureChannelRequest() {
		return (CloseSecureChannelRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloseSecureChannelRequest(CloseSecureChannelRequest newCloseSecureChannelRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelRequest(), newCloseSecureChannelRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseSecureChannelRequest(CloseSecureChannelRequest newCloseSecureChannelRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelRequest(), newCloseSecureChannelRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseSecureChannelResponse getCloseSecureChannelResponse() {
		return (CloseSecureChannelResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloseSecureChannelResponse(CloseSecureChannelResponse newCloseSecureChannelResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelResponse(), newCloseSecureChannelResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseSecureChannelResponse(CloseSecureChannelResponse newCloseSecureChannelResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelResponse(), newCloseSecureChannelResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseSessionRequest getCloseSessionRequest() {
		return (CloseSessionRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloseSessionRequest(CloseSessionRequest newCloseSessionRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionRequest(), newCloseSessionRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseSessionRequest(CloseSessionRequest newCloseSessionRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionRequest(), newCloseSessionRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseSessionResponse getCloseSessionResponse() {
		return (CloseSessionResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloseSessionResponse(CloseSessionResponse newCloseSessionResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionResponse(), newCloseSessionResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseSessionResponse(CloseSessionResponse newCloseSessionResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionResponse(), newCloseSessionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexNumberType getComplexNumberType() {
		return (ComplexNumberType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ComplexNumberType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexNumberType(ComplexNumberType newComplexNumberType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ComplexNumberType(), newComplexNumberType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexNumberType(ComplexNumberType newComplexNumberType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ComplexNumberType(), newComplexNumberType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationVersionDataType getConfigurationVersionDataType() {
		return (ConfigurationVersionDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ConfigurationVersionDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationVersionDataType(ConfigurationVersionDataType newConfigurationVersionDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ConfigurationVersionDataType(), newConfigurationVersionDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationVersionDataType(ConfigurationVersionDataType newConfigurationVersionDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ConfigurationVersionDataType(), newConfigurationVersionDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTransportDataType getConnectionTransportDataType() {
		return (ConnectionTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionTransportDataType(ConnectionTransportDataType newConnectionTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType(), newConnectionTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionTransportDataType(ConnectionTransportDataType newConnectionTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType(), newConnectionTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilter getContentFilter() {
		return (ContentFilter)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentFilter(ContentFilter newContentFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilter(), newContentFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentFilter(ContentFilter newContentFilter) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilter(), newContentFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilterElement getContentFilterElement() {
		return (ContentFilterElement)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentFilterElement(ContentFilterElement newContentFilterElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElement(), newContentFilterElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentFilterElement(ContentFilterElement newContentFilterElement) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElement(), newContentFilterElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilterElementResult getContentFilterElementResult() {
		return (ContentFilterElementResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElementResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentFilterElementResult(ContentFilterElementResult newContentFilterElementResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElementResult(), newContentFilterElementResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentFilterElementResult(ContentFilterElementResult newContentFilterElementResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElementResult(), newContentFilterElementResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilterResult getContentFilterResult() {
		return (ContentFilterResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentFilterResult(ContentFilterResult newContentFilterResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterResult(), newContentFilterResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentFilterResult(ContentFilterResult newContentFilterResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterResult(), newContentFilterResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getContinuationPoint() {
		return (byte[])getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ContinuationPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuationPoint(byte[] newContinuationPoint) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ContinuationPoint(), newContinuationPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCounter() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Counter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(long newCounter) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Counter(), newCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateMonitoredItemsRequest getCreateMonitoredItemsRequest() {
		return (CreateMonitoredItemsRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateMonitoredItemsRequest(CreateMonitoredItemsRequest newCreateMonitoredItemsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsRequest(), newCreateMonitoredItemsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateMonitoredItemsRequest(CreateMonitoredItemsRequest newCreateMonitoredItemsRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsRequest(), newCreateMonitoredItemsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateMonitoredItemsResponse getCreateMonitoredItemsResponse() {
		return (CreateMonitoredItemsResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateMonitoredItemsResponse(CreateMonitoredItemsResponse newCreateMonitoredItemsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsResponse(), newCreateMonitoredItemsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateMonitoredItemsResponse(CreateMonitoredItemsResponse newCreateMonitoredItemsResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsResponse(), newCreateMonitoredItemsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSessionRequest getCreateSessionRequest() {
		return (CreateSessionRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateSessionRequest(CreateSessionRequest newCreateSessionRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionRequest(), newCreateSessionRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateSessionRequest(CreateSessionRequest newCreateSessionRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionRequest(), newCreateSessionRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSessionResponse getCreateSessionResponse() {
		return (CreateSessionResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateSessionResponse(CreateSessionResponse newCreateSessionResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionResponse(), newCreateSessionResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateSessionResponse(CreateSessionResponse newCreateSessionResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionResponse(), newCreateSessionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSubscriptionRequest getCreateSubscriptionRequest() {
		return (CreateSubscriptionRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateSubscriptionRequest(CreateSubscriptionRequest newCreateSubscriptionRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionRequest(), newCreateSubscriptionRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateSubscriptionRequest(CreateSubscriptionRequest newCreateSubscriptionRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionRequest(), newCreateSubscriptionRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSubscriptionResponse getCreateSubscriptionResponse() {
		return (CreateSubscriptionResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateSubscriptionResponse(CreateSubscriptionResponse newCreateSubscriptionResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionResponse(), newCreateSubscriptionResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateSubscriptionResponse(CreateSubscriptionResponse newCreateSubscriptionResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionResponse(), newCreateSubscriptionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyUnitType getCurrencyUnitType() {
		return (CurrencyUnitType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_CurrencyUnitType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrencyUnitType(CurrencyUnitType newCurrencyUnitType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_CurrencyUnitType(), newCurrencyUnitType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyUnitType(CurrencyUnitType newCurrencyUnitType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_CurrencyUnitType(), newCurrencyUnitType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataChangeFilter getDataChangeFilter() {
		return (DataChangeFilter)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataChangeFilter(DataChangeFilter newDataChangeFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeFilter(), newDataChangeFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataChangeFilter(DataChangeFilter newDataChangeFilter) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeFilter(), newDataChangeFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataChangeNotification getDataChangeNotification() {
		return (DataChangeNotification)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeNotification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataChangeNotification(DataChangeNotification newDataChangeNotification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeNotification(), newDataChangeNotification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataChangeNotification(DataChangeNotification newDataChangeNotification) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeNotification(), newDataChangeNotification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataChangeTrigger getDataChangeTrigger() {
		return (DataChangeTrigger)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeTrigger(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataChangeTrigger(DataChangeTrigger newDataChangeTrigger) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeTrigger(), newDataChangeTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagramConnectionTransportDataType getDatagramConnectionTransportDataType() {
		return (DatagramConnectionTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DatagramConnectionTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatagramConnectionTransportDataType(DatagramConnectionTransportDataType newDatagramConnectionTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DatagramConnectionTransportDataType(), newDatagramConnectionTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatagramConnectionTransportDataType(DatagramConnectionTransportDataType newDatagramConnectionTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DatagramConnectionTransportDataType(), newDatagramConnectionTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagramWriterGroupTransportDataType getDatagramWriterGroupTransportDataType() {
		return (DatagramWriterGroupTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DatagramWriterGroupTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatagramWriterGroupTransportDataType(DatagramWriterGroupTransportDataType newDatagramWriterGroupTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DatagramWriterGroupTransportDataType(), newDatagramWriterGroupTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatagramWriterGroupTransportDataType(DatagramWriterGroupTransportDataType newDatagramWriterGroupTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DatagramWriterGroupTransportDataType(), newDatagramWriterGroupTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDataSetFieldContentMask() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataSetFieldContentMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetFieldContentMask(long newDataSetFieldContentMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataSetFieldContentMask(), newDataSetFieldContentMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataSetFieldFlags() {
		return (Integer)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataSetFieldFlags(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetFieldFlags(int newDataSetFieldFlags) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataSetFieldFlags(), newDataSetFieldFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetMetaDataType getDataSetMetaDataType() {
		return (DataSetMetaDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataSetMetaDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetMetaDataType(DataSetMetaDataType newDataSetMetaDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataSetMetaDataType(), newDataSetMetaDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetMetaDataType(DataSetMetaDataType newDataSetMetaDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataSetMetaDataType(), newDataSetMetaDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetOrderingType getDataSetOrderingType() {
		return (DataSetOrderingType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataSetOrderingType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetOrderingType(DataSetOrderingType newDataSetOrderingType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataSetOrderingType(), newDataSetOrderingType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetReaderDataType getDataSetReaderDataType() {
		return (DataSetReaderDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetReaderDataType(DataSetReaderDataType newDataSetReaderDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderDataType(), newDataSetReaderDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetReaderDataType(DataSetReaderDataType newDataSetReaderDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderDataType(), newDataSetReaderDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetReaderMessageDataType getDataSetReaderMessageDataType() {
		return (DataSetReaderMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetReaderMessageDataType(DataSetReaderMessageDataType newDataSetReaderMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType(), newDataSetReaderMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetReaderMessageDataType(DataSetReaderMessageDataType newDataSetReaderMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType(), newDataSetReaderMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetReaderTransportDataType getDataSetReaderTransportDataType() {
		return (DataSetReaderTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetReaderTransportDataType(DataSetReaderTransportDataType newDataSetReaderTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderTransportDataType(), newDataSetReaderTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetReaderTransportDataType(DataSetReaderTransportDataType newDataSetReaderTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderTransportDataType(), newDataSetReaderTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetWriterDataType getDataSetWriterDataType() {
		return (DataSetWriterDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetWriterDataType(DataSetWriterDataType newDataSetWriterDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterDataType(), newDataSetWriterDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetWriterDataType(DataSetWriterDataType newDataSetWriterDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterDataType(), newDataSetWriterDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetWriterMessageDataType getDataSetWriterMessageDataType() {
		return (DataSetWriterMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetWriterMessageDataType(DataSetWriterMessageDataType newDataSetWriterMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType(), newDataSetWriterMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetWriterMessageDataType(DataSetWriterMessageDataType newDataSetWriterMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType(), newDataSetWriterMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetWriterTransportDataType getDataSetWriterTransportDataType() {
		return (DataSetWriterTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetWriterTransportDataType(DataSetWriterTransportDataType newDataSetWriterTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterTransportDataType(), newDataSetWriterTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetWriterTransportDataType(DataSetWriterTransportDataType newDataSetWriterTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterTransportDataType(), newDataSetWriterTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeAttributes getDataTypeAttributes() {
		return (DataTypeAttributes)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeAttributes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeAttributes(DataTypeAttributes newDataTypeAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeAttributes(), newDataTypeAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeAttributes(DataTypeAttributes newDataTypeAttributes) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeAttributes(), newDataTypeAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDefinition getDataTypeDefinition() {
		return (DataTypeDefinition)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeDefinition(DataTypeDefinition newDataTypeDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition(), newDataTypeDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeDefinition(DataTypeDefinition newDataTypeDefinition) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition(), newDataTypeDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDescription getDataTypeDescription() {
		return (DataTypeDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeDescription(DataTypeDescription newDataTypeDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(), newDataTypeDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeDescription(DataTypeDescription newDataTypeDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(), newDataTypeDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeNode getDataTypeNode() {
		return (DataTypeNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeNode(DataTypeNode newDataTypeNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeNode(), newDataTypeNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeNode(DataTypeNode newDataTypeNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeNode(), newDataTypeNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeSchemaHeader getDataTypeSchemaHeader() {
		return (DataTypeSchemaHeader)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypeSchemaHeader(DataTypeSchemaHeader newDataTypeSchemaHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader(), newDataTypeSchemaHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeSchemaHeader(DataTypeSchemaHeader newDataTypeSchemaHeader) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader(), newDataTypeSchemaHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getDataValue() {
		return (DataValue)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DataValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataValue(DataValue newDataValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DataValue(), newDataValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValue(DataValue newDataValue) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DataValue(), newDataValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDate() {
		return (XMLGregorianCalendar)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Date(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(XMLGregorianCalendar newDate) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Date(), newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateString() {
		return (String)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DateString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateString(String newDateString) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DateString(), newDateString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateTime() {
		return (XMLGregorianCalendar)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DateTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(XMLGregorianCalendar newDateTime) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DateTime(), newDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadbandType getDeadbandType() {
		return (DeadbandType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeadbandType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadbandType(DeadbandType newDeadbandType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeadbandType(), newDeadbandType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalDataType getDecimalDataType() {
		return (DecimalDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DecimalDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecimalDataType(DecimalDataType newDecimalDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DecimalDataType(), newDecimalDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalDataType(DecimalDataType newDecimalDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DecimalDataType(), newDecimalDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecimalString() {
		return (String)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DecimalString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalString(String newDecimalString) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DecimalString(), newDecimalString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteAtTimeDetails getDeleteAtTimeDetails() {
		return (DeleteAtTimeDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteAtTimeDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteAtTimeDetails(DeleteAtTimeDetails newDeleteAtTimeDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteAtTimeDetails(), newDeleteAtTimeDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteAtTimeDetails(DeleteAtTimeDetails newDeleteAtTimeDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteAtTimeDetails(), newDeleteAtTimeDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteEventDetails getDeleteEventDetails() {
		return (DeleteEventDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteEventDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteEventDetails(DeleteEventDetails newDeleteEventDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteEventDetails(), newDeleteEventDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteEventDetails(DeleteEventDetails newDeleteEventDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteEventDetails(), newDeleteEventDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteMonitoredItemsRequest getDeleteMonitoredItemsRequest() {
		return (DeleteMonitoredItemsRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteMonitoredItemsRequest(DeleteMonitoredItemsRequest newDeleteMonitoredItemsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsRequest(), newDeleteMonitoredItemsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteMonitoredItemsRequest(DeleteMonitoredItemsRequest newDeleteMonitoredItemsRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsRequest(), newDeleteMonitoredItemsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteMonitoredItemsResponse getDeleteMonitoredItemsResponse() {
		return (DeleteMonitoredItemsResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteMonitoredItemsResponse(DeleteMonitoredItemsResponse newDeleteMonitoredItemsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsResponse(), newDeleteMonitoredItemsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteMonitoredItemsResponse(DeleteMonitoredItemsResponse newDeleteMonitoredItemsResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsResponse(), newDeleteMonitoredItemsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteNodesItem getDeleteNodesItem() {
		return (DeleteNodesItem)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteNodesItem(DeleteNodesItem newDeleteNodesItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesItem(), newDeleteNodesItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteNodesItem(DeleteNodesItem newDeleteNodesItem) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesItem(), newDeleteNodesItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteNodesRequest getDeleteNodesRequest() {
		return (DeleteNodesRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteNodesRequest(DeleteNodesRequest newDeleteNodesRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesRequest(), newDeleteNodesRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteNodesRequest(DeleteNodesRequest newDeleteNodesRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesRequest(), newDeleteNodesRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteNodesResponse getDeleteNodesResponse() {
		return (DeleteNodesResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteNodesResponse(DeleteNodesResponse newDeleteNodesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesResponse(), newDeleteNodesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteNodesResponse(DeleteNodesResponse newDeleteNodesResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesResponse(), newDeleteNodesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteRawModifiedDetails getDeleteRawModifiedDetails() {
		return (DeleteRawModifiedDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteRawModifiedDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteRawModifiedDetails(DeleteRawModifiedDetails newDeleteRawModifiedDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteRawModifiedDetails(), newDeleteRawModifiedDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteRawModifiedDetails(DeleteRawModifiedDetails newDeleteRawModifiedDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteRawModifiedDetails(), newDeleteRawModifiedDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteReferencesItem getDeleteReferencesItem() {
		return (DeleteReferencesItem)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteReferencesItem(DeleteReferencesItem newDeleteReferencesItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesItem(), newDeleteReferencesItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteReferencesItem(DeleteReferencesItem newDeleteReferencesItem) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesItem(), newDeleteReferencesItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteReferencesRequest getDeleteReferencesRequest() {
		return (DeleteReferencesRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteReferencesRequest(DeleteReferencesRequest newDeleteReferencesRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesRequest(), newDeleteReferencesRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteReferencesRequest(DeleteReferencesRequest newDeleteReferencesRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesRequest(), newDeleteReferencesRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteReferencesResponse getDeleteReferencesResponse() {
		return (DeleteReferencesResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteReferencesResponse(DeleteReferencesResponse newDeleteReferencesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesResponse(), newDeleteReferencesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteReferencesResponse(DeleteReferencesResponse newDeleteReferencesResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesResponse(), newDeleteReferencesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteSubscriptionsRequest getDeleteSubscriptionsRequest() {
		return (DeleteSubscriptionsRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteSubscriptionsRequest(DeleteSubscriptionsRequest newDeleteSubscriptionsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsRequest(), newDeleteSubscriptionsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteSubscriptionsRequest(DeleteSubscriptionsRequest newDeleteSubscriptionsRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsRequest(), newDeleteSubscriptionsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteSubscriptionsResponse getDeleteSubscriptionsResponse() {
		return (DeleteSubscriptionsResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteSubscriptionsResponse(DeleteSubscriptionsResponse newDeleteSubscriptionsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsResponse(), newDeleteSubscriptionsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteSubscriptionsResponse(DeleteSubscriptionsResponse newDeleteSubscriptionsResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsResponse(), newDeleteSubscriptionsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticInfo getDiagnosticInfo() {
		return (DiagnosticInfo)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DiagnosticInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticInfo(DiagnosticInfo newDiagnosticInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DiagnosticInfo(), newDiagnosticInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticInfo(DiagnosticInfo newDiagnosticInfo) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DiagnosticInfo(), newDiagnosticInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticsLevel getDiagnosticsLevel() {
		return (DiagnosticsLevel)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DiagnosticsLevel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticsLevel(DiagnosticsLevel newDiagnosticsLevel) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DiagnosticsLevel(), newDiagnosticsLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryConfiguration getDiscoveryConfiguration() {
		return (DiscoveryConfiguration)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DiscoveryConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscoveryConfiguration(DiscoveryConfiguration newDiscoveryConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DiscoveryConfiguration(), newDiscoveryConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryConfiguration(DiscoveryConfiguration newDiscoveryConfiguration) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DiscoveryConfiguration(), newDiscoveryConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDouble() {
		return (Double)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Double(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble(Double newDouble) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Double(), newDouble);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleComplexNumberType getDoubleComplexNumberType() {
		return (DoubleComplexNumberType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DoubleComplexNumberType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoubleComplexNumberType(DoubleComplexNumberType newDoubleComplexNumberType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_DoubleComplexNumberType(), newDoubleComplexNumberType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleComplexNumberType(DoubleComplexNumberType newDoubleComplexNumberType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DoubleComplexNumberType(), newDoubleComplexNumberType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return (Double)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Duration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Duration(), newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDurationString() {
		return (String)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_DurationString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationString(String newDurationString) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_DurationString(), newDurationString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementOperand getElementOperand() {
		return (ElementOperand)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ElementOperand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementOperand(ElementOperand newElementOperand, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ElementOperand(), newElementOperand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementOperand(ElementOperand newElementOperand) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ElementOperand(), newElementOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointConfiguration getEndpointConfiguration() {
		return (EndpointConfiguration)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EndpointConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointConfiguration(EndpointConfiguration newEndpointConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EndpointConfiguration(), newEndpointConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointConfiguration(EndpointConfiguration newEndpointConfiguration) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EndpointConfiguration(), newEndpointConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointDescription getEndpointDescription() {
		return (EndpointDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EndpointDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointDescription(EndpointDescription newEndpointDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EndpointDescription(), newEndpointDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointDescription(EndpointDescription newEndpointDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EndpointDescription(), newEndpointDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointType getEndpointType() {
		return (EndpointType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EndpointType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointType(EndpointType newEndpointType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EndpointType(), newEndpointType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointType(EndpointType newEndpointType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EndpointType(), newEndpointType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointUrlListDataType getEndpointUrlListDataType() {
		return (EndpointUrlListDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EndpointUrlListDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointUrlListDataType(EndpointUrlListDataType newEndpointUrlListDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EndpointUrlListDataType(), newEndpointUrlListDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointUrlListDataType(EndpointUrlListDataType newEndpointUrlListDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EndpointUrlListDataType(), newEndpointUrlListDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDefinition getEnumDefinition() {
		return (EnumDefinition)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EnumDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumDefinition(EnumDefinition newEnumDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EnumDefinition(), newEnumDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumDefinition(EnumDefinition newEnumDefinition) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EnumDefinition(), newEnumDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDescription getEnumDescription() {
		return (EnumDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EnumDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumDescription(EnumDescription newEnumDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EnumDescription(), newEnumDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumDescription(EnumDescription newEnumDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EnumDescription(), newEnumDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumField getEnumField() {
		return (EnumField)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EnumField(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumField(EnumField newEnumField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EnumField(), newEnumField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumField(EnumField newEnumField) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EnumField(), newEnumField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValueType getEnumValueType() {
		return (EnumValueType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EnumValueType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumValueType(EnumValueType newEnumValueType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EnumValueType(), newEnumValueType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumValueType(EnumValueType newEnumValueType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EnumValueType(), newEnumValueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EUInformation getEUInformation() {
		return (EUInformation)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EUInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEUInformation(EUInformation newEUInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EUInformation(), newEUInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEUInformation(EUInformation newEUInformation) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EUInformation(), newEUInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFieldList getEventFieldList() {
		return (EventFieldList)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EventFieldList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventFieldList(EventFieldList newEventFieldList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EventFieldList(), newEventFieldList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventFieldList(EventFieldList newEventFieldList) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EventFieldList(), newEventFieldList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFilter getEventFilter() {
		return (EventFilter)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EventFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventFilter(EventFilter newEventFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EventFilter(), newEventFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventFilter(EventFilter newEventFilter) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EventFilter(), newEventFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFilterResult getEventFilterResult() {
		return (EventFilterResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EventFilterResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventFilterResult(EventFilterResult newEventFilterResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EventFilterResult(), newEventFilterResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventFilterResult(EventFilterResult newEventFilterResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EventFilterResult(), newEventFilterResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventNotificationList getEventNotificationList() {
		return (EventNotificationList)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EventNotificationList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventNotificationList(EventNotificationList newEventNotificationList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_EventNotificationList(), newEventNotificationList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventNotificationList(EventNotificationList newEventNotificationList) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EventNotificationList(), newEventNotificationList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getEventNotifierType() {
		return (Short)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_EventNotifierType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventNotifierType(short newEventNotifierType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_EventNotifierType(), newEventNotifierType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionDeviationFormat getExceptionDeviationFormat() {
		return (ExceptionDeviationFormat)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ExceptionDeviationFormat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionDeviationFormat(ExceptionDeviationFormat newExceptionDeviationFormat) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ExceptionDeviationFormat(), newExceptionDeviationFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedNodeId getExpandedNodeId() {
		return (ExpandedNodeId)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ExpandedNodeId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpandedNodeId(ExpandedNodeId newExpandedNodeId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ExpandedNodeId(), newExpandedNodeId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandedNodeId(ExpandedNodeId newExpandedNodeId) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ExpandedNodeId(), newExpandedNodeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getExtensionObject() {
		return (ExtensionObject)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ExtensionObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionObject(ExtensionObject newExtensionObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ExtensionObject(), newExtensionObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionObject(ExtensionObject newExtensionObject) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ExtensionObject(), newExtensionObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldMetaData getFieldMetaData() {
		return (FieldMetaData)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_FieldMetaData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldMetaData(FieldMetaData newFieldMetaData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_FieldMetaData(), newFieldMetaData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldMetaData(FieldMetaData newFieldMetaData) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_FieldMetaData(), newFieldMetaData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldTargetDataType getFieldTargetDataType() {
		return (FieldTargetDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_FieldTargetDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldTargetDataType(FieldTargetDataType newFieldTargetDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_FieldTargetDataType(), newFieldTargetDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldTargetDataType(FieldTargetDataType newFieldTargetDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_FieldTargetDataType(), newFieldTargetDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperand getFilterOperand() {
		return (FilterOperand)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterOperand(FilterOperand newFilterOperand, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(), newFilterOperand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOperand(FilterOperand newFilterOperand) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(), newFilterOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperator getFilterOperator() {
		return (FilterOperator)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOperator(FilterOperator newFilterOperator) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperator(), newFilterOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindServersOnNetworkRequest getFindServersOnNetworkRequest() {
		return (FindServersOnNetworkRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFindServersOnNetworkRequest(FindServersOnNetworkRequest newFindServersOnNetworkRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkRequest(), newFindServersOnNetworkRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindServersOnNetworkRequest(FindServersOnNetworkRequest newFindServersOnNetworkRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkRequest(), newFindServersOnNetworkRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindServersOnNetworkResponse getFindServersOnNetworkResponse() {
		return (FindServersOnNetworkResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFindServersOnNetworkResponse(FindServersOnNetworkResponse newFindServersOnNetworkResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkResponse(), newFindServersOnNetworkResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindServersOnNetworkResponse(FindServersOnNetworkResponse newFindServersOnNetworkResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkResponse(), newFindServersOnNetworkResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindServersRequest getFindServersRequest() {
		return (FindServersRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_FindServersRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFindServersRequest(FindServersRequest newFindServersRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_FindServersRequest(), newFindServersRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindServersRequest(FindServersRequest newFindServersRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_FindServersRequest(), newFindServersRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindServersResponse getFindServersResponse() {
		return (FindServersResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_FindServersResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFindServersResponse(FindServersResponse newFindServersResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_FindServersResponse(), newFindServersResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindServersResponse(FindServersResponse newFindServersResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_FindServersResponse(), newFindServersResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getFloat() {
		return (Float)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Float(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat(Float newFloat) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Float(), newFloat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getFrame() {
		return (Frame)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Frame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(Frame newFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_Frame(), newFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(Frame newFrame) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Frame(), newFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAttributes getGenericAttributes() {
		return (GenericAttributes)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericAttributes(GenericAttributes newGenericAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributes(), newGenericAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericAttributes(GenericAttributes newGenericAttributes) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributes(), newGenericAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAttributeValue getGenericAttributeValue() {
		return (GenericAttributeValue)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributeValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericAttributeValue(GenericAttributeValue newGenericAttributeValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributeValue(), newGenericAttributeValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericAttributeValue(GenericAttributeValue newGenericAttributeValue) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributeValue(), newGenericAttributeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetEndpointsRequest getGetEndpointsRequest() {
		return (GetEndpointsRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetEndpointsRequest(GetEndpointsRequest newGetEndpointsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsRequest(), newGetEndpointsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetEndpointsRequest(GetEndpointsRequest newGetEndpointsRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsRequest(), newGetEndpointsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetEndpointsResponse getGetEndpointsResponse() {
		return (GetEndpointsResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetEndpointsResponse(GetEndpointsResponse newGetEndpointsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsResponse(), newGetEndpointsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetEndpointsResponse(GetEndpointsResponse newGetEndpointsResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsResponse(), newGetEndpointsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guid getGuid() {
		return (Guid)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Guid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuid(Guid newGuid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_Guid(), newGuid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuid(Guid newGuid) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Guid(), newGuid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryData getHistoryData() {
		return (HistoryData)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryData(HistoryData newHistoryData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryData(), newHistoryData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryData(HistoryData newHistoryData) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryData(), newHistoryData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryEvent getHistoryEvent() {
		return (HistoryEvent)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryEvent(HistoryEvent newHistoryEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEvent(), newHistoryEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryEvent(HistoryEvent newHistoryEvent) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEvent(), newHistoryEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryEventFieldList getHistoryEventFieldList() {
		return (HistoryEventFieldList)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEventFieldList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryEventFieldList(HistoryEventFieldList newHistoryEventFieldList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEventFieldList(), newHistoryEventFieldList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryEventFieldList(HistoryEventFieldList newHistoryEventFieldList) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEventFieldList(), newHistoryEventFieldList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryModifiedData getHistoryModifiedData() {
		return (HistoryModifiedData)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryModifiedData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryModifiedData(HistoryModifiedData newHistoryModifiedData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryModifiedData(), newHistoryModifiedData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryModifiedData(HistoryModifiedData newHistoryModifiedData) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryModifiedData(), newHistoryModifiedData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryReadDetails getHistoryReadDetails() {
		return (HistoryReadDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryReadDetails(HistoryReadDetails newHistoryReadDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(), newHistoryReadDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryReadDetails(HistoryReadDetails newHistoryReadDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(), newHistoryReadDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryReadRequest getHistoryReadRequest() {
		return (HistoryReadRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryReadRequest(HistoryReadRequest newHistoryReadRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadRequest(), newHistoryReadRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryReadRequest(HistoryReadRequest newHistoryReadRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadRequest(), newHistoryReadRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryReadResponse getHistoryReadResponse() {
		return (HistoryReadResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryReadResponse(HistoryReadResponse newHistoryReadResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResponse(), newHistoryReadResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryReadResponse(HistoryReadResponse newHistoryReadResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResponse(), newHistoryReadResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryReadResult getHistoryReadResult() {
		return (HistoryReadResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryReadResult(HistoryReadResult newHistoryReadResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResult(), newHistoryReadResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryReadResult(HistoryReadResult newHistoryReadResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResult(), newHistoryReadResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryReadValueId getHistoryReadValueId() {
		return (HistoryReadValueId)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadValueId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryReadValueId(HistoryReadValueId newHistoryReadValueId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadValueId(), newHistoryReadValueId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryReadValueId(HistoryReadValueId newHistoryReadValueId) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadValueId(), newHistoryReadValueId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateDetails getHistoryUpdateDetails() {
		return (HistoryUpdateDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryUpdateDetails(HistoryUpdateDetails newHistoryUpdateDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(), newHistoryUpdateDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryUpdateDetails(HistoryUpdateDetails newHistoryUpdateDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(), newHistoryUpdateDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateRequest getHistoryUpdateRequest() {
		return (HistoryUpdateRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryUpdateRequest(HistoryUpdateRequest newHistoryUpdateRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateRequest(), newHistoryUpdateRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryUpdateRequest(HistoryUpdateRequest newHistoryUpdateRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateRequest(), newHistoryUpdateRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateResponse getHistoryUpdateResponse() {
		return (HistoryUpdateResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryUpdateResponse(HistoryUpdateResponse newHistoryUpdateResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResponse(), newHistoryUpdateResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryUpdateResponse(HistoryUpdateResponse newHistoryUpdateResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResponse(), newHistoryUpdateResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateResult getHistoryUpdateResult() {
		return (HistoryUpdateResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryUpdateResult(HistoryUpdateResult newHistoryUpdateResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResult(), newHistoryUpdateResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryUpdateResult(HistoryUpdateResult newHistoryUpdateResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResult(), newHistoryUpdateResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateType getHistoryUpdateType() {
		return (HistoryUpdateType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryUpdateType(HistoryUpdateType newHistoryUpdateType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateType(), newHistoryUpdateType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityCriteriaType getIdentityCriteriaType() {
		return (IdentityCriteriaType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_IdentityCriteriaType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentityCriteriaType(IdentityCriteriaType newIdentityCriteriaType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_IdentityCriteriaType(), newIdentityCriteriaType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityMappingRuleType getIdentityMappingRuleType() {
		return (IdentityMappingRuleType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_IdentityMappingRuleType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentityMappingRuleType(IdentityMappingRuleType newIdentityMappingRuleType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_IdentityMappingRuleType(), newIdentityMappingRuleType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentityMappingRuleType(IdentityMappingRuleType newIdentityMappingRuleType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_IdentityMappingRuleType(), newIdentityMappingRuleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdType getIdType() {
		return (IdType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_IdType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdType(IdType newIdType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_IdType(), newIdType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getImageBMP() {
		return (byte[])getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ImageBMP(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageBMP(byte[] newImageBMP) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ImageBMP(), newImageBMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getImageGIF() {
		return (byte[])getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ImageGIF(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageGIF(byte[] newImageGIF) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ImageGIF(), newImageGIF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getImageJPG() {
		return (byte[])getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ImageJPG(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageJPG(byte[] newImageJPG) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ImageJPG(), newImageJPG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getImagePNG() {
		return (byte[])getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ImagePNG(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePNG(byte[] newImagePNG) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ImagePNG(), newImagePNG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIndex() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Index(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(long newIndex) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Index(), newIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceNode getInstanceNode() {
		return (InstanceNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceNode(InstanceNode newInstanceNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(), newInstanceNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceNode(InstanceNode newInstanceNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(), newInstanceNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getInt16() {
		return (Short)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Int16(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt16(Short newInt16) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Int16(), newInt16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInt32() {
		return (Integer)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Int32(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt32(Integer newInt32) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Int32(), newInt32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getInt64() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Int64(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt64(Long newInt64) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Int64(), newInt64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIntegerId() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_IntegerId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerId(long newIntegerId) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_IntegerId(), newIntegerId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getInvokeServiceRequest() {
		return (byte[])getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_InvokeServiceRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokeServiceRequest(byte[] newInvokeServiceRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_InvokeServiceRequest(), newInvokeServiceRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getInvokeServiceResponse() {
		return (byte[])getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_InvokeServiceResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokeServiceResponse(byte[] newInvokeServiceResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_InvokeServiceResponse(), newInvokeServiceResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuedIdentityToken getIssuedIdentityToken() {
		return (IssuedIdentityToken)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_IssuedIdentityToken(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuedIdentityToken(IssuedIdentityToken newIssuedIdentityToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_IssuedIdentityToken(), newIssuedIdentityToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuedIdentityToken(IssuedIdentityToken newIssuedIdentityToken) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_IssuedIdentityToken(), newIssuedIdentityToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getJsonDataSetMessageContentMask() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetMessageContentMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonDataSetMessageContentMask(long newJsonDataSetMessageContentMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetMessageContentMask(), newJsonDataSetMessageContentMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDataSetReaderMessageDataType getJsonDataSetReaderMessageDataType() {
		return (JsonDataSetReaderMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetReaderMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJsonDataSetReaderMessageDataType(JsonDataSetReaderMessageDataType newJsonDataSetReaderMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetReaderMessageDataType(), newJsonDataSetReaderMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonDataSetReaderMessageDataType(JsonDataSetReaderMessageDataType newJsonDataSetReaderMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetReaderMessageDataType(), newJsonDataSetReaderMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDataSetWriterMessageDataType getJsonDataSetWriterMessageDataType() {
		return (JsonDataSetWriterMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetWriterMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJsonDataSetWriterMessageDataType(JsonDataSetWriterMessageDataType newJsonDataSetWriterMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetWriterMessageDataType(), newJsonDataSetWriterMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonDataSetWriterMessageDataType(JsonDataSetWriterMessageDataType newJsonDataSetWriterMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetWriterMessageDataType(), newJsonDataSetWriterMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getJsonNetworkMessageContentMask() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_JsonNetworkMessageContentMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonNetworkMessageContentMask(long newJsonNetworkMessageContentMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_JsonNetworkMessageContentMask(), newJsonNetworkMessageContentMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonWriterGroupMessageDataType getJsonWriterGroupMessageDataType() {
		return (JsonWriterGroupMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_JsonWriterGroupMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJsonWriterGroupMessageDataType(JsonWriterGroupMessageDataType newJsonWriterGroupMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_JsonWriterGroupMessageDataType(), newJsonWriterGroupMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonWriterGroupMessageDataType(JsonWriterGroupMessageDataType newJsonWriterGroupMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_JsonWriterGroupMessageDataType(), newJsonWriterGroupMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValuePair getKeyValuePair() {
		return (KeyValuePair)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_KeyValuePair(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyValuePair(KeyValuePair newKeyValuePair, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_KeyValuePair(), newKeyValuePair, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyValuePair(KeyValuePair newKeyValuePair) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_KeyValuePair(), newKeyValuePair);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfAddNodesItem getListOfAddNodesItem() {
		return (ListOfAddNodesItem)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfAddNodesItem(ListOfAddNodesItem newListOfAddNodesItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesItem(), newListOfAddNodesItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfAddNodesItem(ListOfAddNodesItem newListOfAddNodesItem) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesItem(), newListOfAddNodesItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfAddNodesResult getListOfAddNodesResult() {
		return (ListOfAddNodesResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfAddNodesResult(ListOfAddNodesResult newListOfAddNodesResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesResult(), newListOfAddNodesResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfAddNodesResult(ListOfAddNodesResult newListOfAddNodesResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesResult(), newListOfAddNodesResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfAddReferencesItem getListOfAddReferencesItem() {
		return (ListOfAddReferencesItem)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddReferencesItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfAddReferencesItem(ListOfAddReferencesItem newListOfAddReferencesItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddReferencesItem(), newListOfAddReferencesItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfAddReferencesItem(ListOfAddReferencesItem newListOfAddReferencesItem) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddReferencesItem(), newListOfAddReferencesItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfAliasNameDataType getListOfAliasNameDataType() {
		return (ListOfAliasNameDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAliasNameDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfAliasNameDataType(ListOfAliasNameDataType newListOfAliasNameDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAliasNameDataType(), newListOfAliasNameDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfAliasNameDataType(ListOfAliasNameDataType newListOfAliasNameDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAliasNameDataType(), newListOfAliasNameDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfApplicationDescription getListOfApplicationDescription() {
		return (ListOfApplicationDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfApplicationDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfApplicationDescription(ListOfApplicationDescription newListOfApplicationDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfApplicationDescription(), newListOfApplicationDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfApplicationDescription(ListOfApplicationDescription newListOfApplicationDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfApplicationDescription(), newListOfApplicationDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfArgument getListOfArgument() {
		return (ListOfArgument)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfArgument(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfArgument(ListOfArgument newListOfArgument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfArgument(), newListOfArgument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfArgument(ListOfArgument newListOfArgument) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfArgument(), newListOfArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBoolean getListOfBoolean() {
		return (ListOfBoolean)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBoolean(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBoolean(ListOfBoolean newListOfBoolean, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBoolean(), newListOfBoolean, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBoolean(ListOfBoolean newListOfBoolean) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBoolean(), newListOfBoolean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrokerConnectionTransportDataType getListOfBrokerConnectionTransportDataType() {
		return (ListOfBrokerConnectionTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerConnectionTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBrokerConnectionTransportDataType(ListOfBrokerConnectionTransportDataType newListOfBrokerConnectionTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerConnectionTransportDataType(), newListOfBrokerConnectionTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBrokerConnectionTransportDataType(ListOfBrokerConnectionTransportDataType newListOfBrokerConnectionTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerConnectionTransportDataType(), newListOfBrokerConnectionTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrokerDataSetReaderTransportDataType getListOfBrokerDataSetReaderTransportDataType() {
		return (ListOfBrokerDataSetReaderTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetReaderTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBrokerDataSetReaderTransportDataType(ListOfBrokerDataSetReaderTransportDataType newListOfBrokerDataSetReaderTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetReaderTransportDataType(), newListOfBrokerDataSetReaderTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBrokerDataSetReaderTransportDataType(ListOfBrokerDataSetReaderTransportDataType newListOfBrokerDataSetReaderTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetReaderTransportDataType(), newListOfBrokerDataSetReaderTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrokerDataSetWriterTransportDataType getListOfBrokerDataSetWriterTransportDataType() {
		return (ListOfBrokerDataSetWriterTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetWriterTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBrokerDataSetWriterTransportDataType(ListOfBrokerDataSetWriterTransportDataType newListOfBrokerDataSetWriterTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetWriterTransportDataType(), newListOfBrokerDataSetWriterTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBrokerDataSetWriterTransportDataType(ListOfBrokerDataSetWriterTransportDataType newListOfBrokerDataSetWriterTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetWriterTransportDataType(), newListOfBrokerDataSetWriterTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrokerTransportQualityOfService getListOfBrokerTransportQualityOfService() {
		return (ListOfBrokerTransportQualityOfService)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerTransportQualityOfService(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBrokerTransportQualityOfService(ListOfBrokerTransportQualityOfService newListOfBrokerTransportQualityOfService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerTransportQualityOfService(), newListOfBrokerTransportQualityOfService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBrokerTransportQualityOfService(ListOfBrokerTransportQualityOfService newListOfBrokerTransportQualityOfService) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerTransportQualityOfService(), newListOfBrokerTransportQualityOfService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrokerWriterGroupTransportDataType getListOfBrokerWriterGroupTransportDataType() {
		return (ListOfBrokerWriterGroupTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerWriterGroupTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBrokerWriterGroupTransportDataType(ListOfBrokerWriterGroupTransportDataType newListOfBrokerWriterGroupTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerWriterGroupTransportDataType(), newListOfBrokerWriterGroupTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBrokerWriterGroupTransportDataType(ListOfBrokerWriterGroupTransportDataType newListOfBrokerWriterGroupTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerWriterGroupTransportDataType(), newListOfBrokerWriterGroupTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowseDescription getListOfBrowseDescription() {
		return (ListOfBrowseDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBrowseDescription(ListOfBrowseDescription newListOfBrowseDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseDescription(), newListOfBrowseDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBrowseDescription(ListOfBrowseDescription newListOfBrowseDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseDescription(), newListOfBrowseDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowsePath getListOfBrowsePath() {
		return (ListOfBrowsePath)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBrowsePath(ListOfBrowsePath newListOfBrowsePath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePath(), newListOfBrowsePath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBrowsePath(ListOfBrowsePath newListOfBrowsePath) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePath(), newListOfBrowsePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowsePathResult getListOfBrowsePathResult() {
		return (ListOfBrowsePathResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBrowsePathResult(ListOfBrowsePathResult newListOfBrowsePathResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathResult(), newListOfBrowsePathResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBrowsePathResult(ListOfBrowsePathResult newListOfBrowsePathResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathResult(), newListOfBrowsePathResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowsePathTarget getListOfBrowsePathTarget() {
		return (ListOfBrowsePathTarget)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathTarget(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBrowsePathTarget(ListOfBrowsePathTarget newListOfBrowsePathTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathTarget(), newListOfBrowsePathTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBrowsePathTarget(ListOfBrowsePathTarget newListOfBrowsePathTarget) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathTarget(), newListOfBrowsePathTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowseResult getListOfBrowseResult() {
		return (ListOfBrowseResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfBrowseResult(ListOfBrowseResult newListOfBrowseResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseResult(), newListOfBrowseResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfBrowseResult(ListOfBrowseResult newListOfBrowseResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseResult(), newListOfBrowseResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfByte getListOfByte() {
		return (ListOfByte)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByte(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfByte(ListOfByte newListOfByte, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByte(), newListOfByte, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfByte(ListOfByte newListOfByte) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByte(), newListOfByte);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfByteString getListOfByteString() {
		return (ListOfByteString)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByteString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfByteString(ListOfByteString newListOfByteString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByteString(), newListOfByteString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfByteString(ListOfByteString newListOfByteString) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByteString(), newListOfByteString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfCallMethodRequest getListOfCallMethodRequest() {
		return (ListOfCallMethodRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfCallMethodRequest(ListOfCallMethodRequest newListOfCallMethodRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodRequest(), newListOfCallMethodRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfCallMethodRequest(ListOfCallMethodRequest newListOfCallMethodRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodRequest(), newListOfCallMethodRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfCallMethodResult getListOfCallMethodResult() {
		return (ListOfCallMethodResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfCallMethodResult(ListOfCallMethodResult newListOfCallMethodResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodResult(), newListOfCallMethodResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfCallMethodResult(ListOfCallMethodResult newListOfCallMethodResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodResult(), newListOfCallMethodResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfCartesianCoordinates getListOfCartesianCoordinates() {
		return (ListOfCartesianCoordinates)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCartesianCoordinates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfCartesianCoordinates(ListOfCartesianCoordinates newListOfCartesianCoordinates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCartesianCoordinates(), newListOfCartesianCoordinates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfCartesianCoordinates(ListOfCartesianCoordinates newListOfCartesianCoordinates) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCartesianCoordinates(), newListOfCartesianCoordinates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfConfigurationVersionDataType getListOfConfigurationVersionDataType() {
		return (ListOfConfigurationVersionDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConfigurationVersionDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfConfigurationVersionDataType(ListOfConfigurationVersionDataType newListOfConfigurationVersionDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConfigurationVersionDataType(), newListOfConfigurationVersionDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfConfigurationVersionDataType(ListOfConfigurationVersionDataType newListOfConfigurationVersionDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConfigurationVersionDataType(), newListOfConfigurationVersionDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfConnectionTransportDataType getListOfConnectionTransportDataType() {
		return (ListOfConnectionTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConnectionTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfConnectionTransportDataType(ListOfConnectionTransportDataType newListOfConnectionTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConnectionTransportDataType(), newListOfConnectionTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfConnectionTransportDataType(ListOfConnectionTransportDataType newListOfConnectionTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConnectionTransportDataType(), newListOfConnectionTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfContentFilter getListOfContentFilter() {
		return (ListOfContentFilter)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfContentFilter(ListOfContentFilter newListOfContentFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilter(), newListOfContentFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfContentFilter(ListOfContentFilter newListOfContentFilter) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilter(), newListOfContentFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfContentFilterElement getListOfContentFilterElement() {
		return (ListOfContentFilterElement)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfContentFilterElement(ListOfContentFilterElement newListOfContentFilterElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElement(), newListOfContentFilterElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfContentFilterElement(ListOfContentFilterElement newListOfContentFilterElement) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElement(), newListOfContentFilterElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfContentFilterElementResult getListOfContentFilterElementResult() {
		return (ListOfContentFilterElementResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElementResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfContentFilterElementResult(ListOfContentFilterElementResult newListOfContentFilterElementResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElementResult(), newListOfContentFilterElementResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfContentFilterElementResult(ListOfContentFilterElementResult newListOfContentFilterElementResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElementResult(), newListOfContentFilterElementResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfCurrencyUnitType getListOfCurrencyUnitType() {
		return (ListOfCurrencyUnitType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCurrencyUnitType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfCurrencyUnitType(ListOfCurrencyUnitType newListOfCurrencyUnitType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCurrencyUnitType(), newListOfCurrencyUnitType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfCurrencyUnitType(ListOfCurrencyUnitType newListOfCurrencyUnitType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCurrencyUnitType(), newListOfCurrencyUnitType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDatagramConnectionTransportDataType getListOfDatagramConnectionTransportDataType() {
		return (ListOfDatagramConnectionTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramConnectionTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDatagramConnectionTransportDataType(ListOfDatagramConnectionTransportDataType newListOfDatagramConnectionTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramConnectionTransportDataType(), newListOfDatagramConnectionTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDatagramConnectionTransportDataType(ListOfDatagramConnectionTransportDataType newListOfDatagramConnectionTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramConnectionTransportDataType(), newListOfDatagramConnectionTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDatagramWriterGroupTransportDataType getListOfDatagramWriterGroupTransportDataType() {
		return (ListOfDatagramWriterGroupTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramWriterGroupTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDatagramWriterGroupTransportDataType(ListOfDatagramWriterGroupTransportDataType newListOfDatagramWriterGroupTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramWriterGroupTransportDataType(), newListOfDatagramWriterGroupTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDatagramWriterGroupTransportDataType(ListOfDatagramWriterGroupTransportDataType newListOfDatagramWriterGroupTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramWriterGroupTransportDataType(), newListOfDatagramWriterGroupTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetFieldContentMask getListOfDataSetFieldContentMask() {
		return (ListOfDataSetFieldContentMask)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetFieldContentMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataSetFieldContentMask(ListOfDataSetFieldContentMask newListOfDataSetFieldContentMask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetFieldContentMask(), newListOfDataSetFieldContentMask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataSetFieldContentMask(ListOfDataSetFieldContentMask newListOfDataSetFieldContentMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetFieldContentMask(), newListOfDataSetFieldContentMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetMetaDataType getListOfDataSetMetaDataType() {
		return (ListOfDataSetMetaDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetMetaDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataSetMetaDataType(ListOfDataSetMetaDataType newListOfDataSetMetaDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetMetaDataType(), newListOfDataSetMetaDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataSetMetaDataType(ListOfDataSetMetaDataType newListOfDataSetMetaDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetMetaDataType(), newListOfDataSetMetaDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetOrderingType getListOfDataSetOrderingType() {
		return (ListOfDataSetOrderingType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetOrderingType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataSetOrderingType(ListOfDataSetOrderingType newListOfDataSetOrderingType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetOrderingType(), newListOfDataSetOrderingType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataSetOrderingType(ListOfDataSetOrderingType newListOfDataSetOrderingType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetOrderingType(), newListOfDataSetOrderingType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetReaderDataType getListOfDataSetReaderDataType() {
		return (ListOfDataSetReaderDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataSetReaderDataType(ListOfDataSetReaderDataType newListOfDataSetReaderDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderDataType(), newListOfDataSetReaderDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataSetReaderDataType(ListOfDataSetReaderDataType newListOfDataSetReaderDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderDataType(), newListOfDataSetReaderDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetReaderMessageDataType getListOfDataSetReaderMessageDataType() {
		return (ListOfDataSetReaderMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataSetReaderMessageDataType(ListOfDataSetReaderMessageDataType newListOfDataSetReaderMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderMessageDataType(), newListOfDataSetReaderMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataSetReaderMessageDataType(ListOfDataSetReaderMessageDataType newListOfDataSetReaderMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderMessageDataType(), newListOfDataSetReaderMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetReaderTransportDataType getListOfDataSetReaderTransportDataType() {
		return (ListOfDataSetReaderTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataSetReaderTransportDataType(ListOfDataSetReaderTransportDataType newListOfDataSetReaderTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderTransportDataType(), newListOfDataSetReaderTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataSetReaderTransportDataType(ListOfDataSetReaderTransportDataType newListOfDataSetReaderTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderTransportDataType(), newListOfDataSetReaderTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetWriterDataType getListOfDataSetWriterDataType() {
		return (ListOfDataSetWriterDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataSetWriterDataType(ListOfDataSetWriterDataType newListOfDataSetWriterDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterDataType(), newListOfDataSetWriterDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataSetWriterDataType(ListOfDataSetWriterDataType newListOfDataSetWriterDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterDataType(), newListOfDataSetWriterDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetWriterMessageDataType getListOfDataSetWriterMessageDataType() {
		return (ListOfDataSetWriterMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataSetWriterMessageDataType(ListOfDataSetWriterMessageDataType newListOfDataSetWriterMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterMessageDataType(), newListOfDataSetWriterMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataSetWriterMessageDataType(ListOfDataSetWriterMessageDataType newListOfDataSetWriterMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterMessageDataType(), newListOfDataSetWriterMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetWriterTransportDataType getListOfDataSetWriterTransportDataType() {
		return (ListOfDataSetWriterTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataSetWriterTransportDataType(ListOfDataSetWriterTransportDataType newListOfDataSetWriterTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterTransportDataType(), newListOfDataSetWriterTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataSetWriterTransportDataType(ListOfDataSetWriterTransportDataType newListOfDataSetWriterTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterTransportDataType(), newListOfDataSetWriterTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataTypeDefinition getListOfDataTypeDefinition() {
		return (ListOfDataTypeDefinition)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataTypeDefinition(ListOfDataTypeDefinition newListOfDataTypeDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDefinition(), newListOfDataTypeDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataTypeDefinition(ListOfDataTypeDefinition newListOfDataTypeDefinition) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDefinition(), newListOfDataTypeDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataTypeDescription getListOfDataTypeDescription() {
		return (ListOfDataTypeDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataTypeDescription(ListOfDataTypeDescription newListOfDataTypeDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDescription(), newListOfDataTypeDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataTypeDescription(ListOfDataTypeDescription newListOfDataTypeDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDescription(), newListOfDataTypeDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataTypeSchemaHeader getListOfDataTypeSchemaHeader() {
		return (ListOfDataTypeSchemaHeader)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeSchemaHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataTypeSchemaHeader(ListOfDataTypeSchemaHeader newListOfDataTypeSchemaHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeSchemaHeader(), newListOfDataTypeSchemaHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataTypeSchemaHeader(ListOfDataTypeSchemaHeader newListOfDataTypeSchemaHeader) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeSchemaHeader(), newListOfDataTypeSchemaHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataValue getListOfDataValue() {
		return (ListOfDataValue)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataValue(ListOfDataValue newListOfDataValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataValue(), newListOfDataValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataValue(ListOfDataValue newListOfDataValue) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataValue(), newListOfDataValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDateTime getListOfDateTime() {
		return (ListOfDateTime)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDateTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDateTime(ListOfDateTime newListOfDateTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDateTime(), newListOfDateTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDateTime(ListOfDateTime newListOfDateTime) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDateTime(), newListOfDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDeleteNodesItem getListOfDeleteNodesItem() {
		return (ListOfDeleteNodesItem)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteNodesItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDeleteNodesItem(ListOfDeleteNodesItem newListOfDeleteNodesItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteNodesItem(), newListOfDeleteNodesItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDeleteNodesItem(ListOfDeleteNodesItem newListOfDeleteNodesItem) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteNodesItem(), newListOfDeleteNodesItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDeleteReferencesItem getListOfDeleteReferencesItem() {
		return (ListOfDeleteReferencesItem)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteReferencesItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDeleteReferencesItem(ListOfDeleteReferencesItem newListOfDeleteReferencesItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteReferencesItem(), newListOfDeleteReferencesItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDeleteReferencesItem(ListOfDeleteReferencesItem newListOfDeleteReferencesItem) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteReferencesItem(), newListOfDeleteReferencesItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getListOfDiagnosticInfo() {
		return (ListOfDiagnosticInfo)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDiagnosticInfo(ListOfDiagnosticInfo newListOfDiagnosticInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticInfo(), newListOfDiagnosticInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDiagnosticInfo(ListOfDiagnosticInfo newListOfDiagnosticInfo) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticInfo(), newListOfDiagnosticInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticsLevel getListOfDiagnosticsLevel() {
		return (ListOfDiagnosticsLevel)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticsLevel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDiagnosticsLevel(ListOfDiagnosticsLevel newListOfDiagnosticsLevel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticsLevel(), newListOfDiagnosticsLevel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDiagnosticsLevel(ListOfDiagnosticsLevel newListOfDiagnosticsLevel) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticsLevel(), newListOfDiagnosticsLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDouble getListOfDouble() {
		return (ListOfDouble)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDouble(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDouble(ListOfDouble newListOfDouble, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDouble(), newListOfDouble, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDouble(ListOfDouble newListOfDouble) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDouble(), newListOfDouble);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEndpointConfiguration getListOfEndpointConfiguration() {
		return (ListOfEndpointConfiguration)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfEndpointConfiguration(ListOfEndpointConfiguration newListOfEndpointConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointConfiguration(), newListOfEndpointConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfEndpointConfiguration(ListOfEndpointConfiguration newListOfEndpointConfiguration) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointConfiguration(), newListOfEndpointConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEndpointDescription getListOfEndpointDescription() {
		return (ListOfEndpointDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfEndpointDescription(ListOfEndpointDescription newListOfEndpointDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointDescription(), newListOfEndpointDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfEndpointDescription(ListOfEndpointDescription newListOfEndpointDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointDescription(), newListOfEndpointDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEndpointType getListOfEndpointType() {
		return (ListOfEndpointType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfEndpointType(ListOfEndpointType newListOfEndpointType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointType(), newListOfEndpointType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfEndpointType(ListOfEndpointType newListOfEndpointType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointType(), newListOfEndpointType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEndpointUrlListDataType getListOfEndpointUrlListDataType() {
		return (ListOfEndpointUrlListDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointUrlListDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfEndpointUrlListDataType(ListOfEndpointUrlListDataType newListOfEndpointUrlListDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointUrlListDataType(), newListOfEndpointUrlListDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfEndpointUrlListDataType(ListOfEndpointUrlListDataType newListOfEndpointUrlListDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointUrlListDataType(), newListOfEndpointUrlListDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEnumDefinition getListOfEnumDefinition() {
		return (ListOfEnumDefinition)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfEnumDefinition(ListOfEnumDefinition newListOfEnumDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDefinition(), newListOfEnumDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfEnumDefinition(ListOfEnumDefinition newListOfEnumDefinition) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDefinition(), newListOfEnumDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEnumDescription getListOfEnumDescription() {
		return (ListOfEnumDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfEnumDescription(ListOfEnumDescription newListOfEnumDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDescription(), newListOfEnumDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfEnumDescription(ListOfEnumDescription newListOfEnumDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDescription(), newListOfEnumDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEnumField getListOfEnumField() {
		return (ListOfEnumField)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumField(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfEnumField(ListOfEnumField newListOfEnumField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumField(), newListOfEnumField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfEnumField(ListOfEnumField newListOfEnumField) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumField(), newListOfEnumField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEnumValueType getListOfEnumValueType() {
		return (ListOfEnumValueType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumValueType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfEnumValueType(ListOfEnumValueType newListOfEnumValueType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumValueType(), newListOfEnumValueType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfEnumValueType(ListOfEnumValueType newListOfEnumValueType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumValueType(), newListOfEnumValueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEventFieldList getListOfEventFieldList() {
		return (ListOfEventFieldList)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEventFieldList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfEventFieldList(ListOfEventFieldList newListOfEventFieldList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEventFieldList(), newListOfEventFieldList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfEventFieldList(ListOfEventFieldList newListOfEventFieldList) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEventFieldList(), newListOfEventFieldList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfExpandedNodeId getListOfExpandedNodeId() {
		return (ListOfExpandedNodeId)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExpandedNodeId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfExpandedNodeId(ListOfExpandedNodeId newListOfExpandedNodeId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExpandedNodeId(), newListOfExpandedNodeId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfExpandedNodeId(ListOfExpandedNodeId newListOfExpandedNodeId) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExpandedNodeId(), newListOfExpandedNodeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfExtensionObject getListOfExtensionObject() {
		return (ListOfExtensionObject)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExtensionObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfExtensionObject(ListOfExtensionObject newListOfExtensionObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExtensionObject(), newListOfExtensionObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfExtensionObject(ListOfExtensionObject newListOfExtensionObject) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExtensionObject(), newListOfExtensionObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfFieldMetaData getListOfFieldMetaData() {
		return (ListOfFieldMetaData)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldMetaData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfFieldMetaData(ListOfFieldMetaData newListOfFieldMetaData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldMetaData(), newListOfFieldMetaData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfFieldMetaData(ListOfFieldMetaData newListOfFieldMetaData) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldMetaData(), newListOfFieldMetaData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfFieldTargetDataType getListOfFieldTargetDataType() {
		return (ListOfFieldTargetDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldTargetDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfFieldTargetDataType(ListOfFieldTargetDataType newListOfFieldTargetDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldTargetDataType(), newListOfFieldTargetDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfFieldTargetDataType(ListOfFieldTargetDataType newListOfFieldTargetDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldTargetDataType(), newListOfFieldTargetDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfFloat getListOfFloat() {
		return (ListOfFloat)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFloat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfFloat(ListOfFloat newListOfFloat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFloat(), newListOfFloat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfFloat(ListOfFloat newListOfFloat) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFloat(), newListOfFloat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfFrame getListOfFrame() {
		return (ListOfFrame)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfFrame(ListOfFrame newListOfFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFrame(), newListOfFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfFrame(ListOfFrame newListOfFrame) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFrame(), newListOfFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfGenericAttributeValue getListOfGenericAttributeValue() {
		return (ListOfGenericAttributeValue)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGenericAttributeValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfGenericAttributeValue(ListOfGenericAttributeValue newListOfGenericAttributeValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGenericAttributeValue(), newListOfGenericAttributeValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfGenericAttributeValue(ListOfGenericAttributeValue newListOfGenericAttributeValue) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGenericAttributeValue(), newListOfGenericAttributeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfGuid getListOfGuid() {
		return (ListOfGuid)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGuid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfGuid(ListOfGuid newListOfGuid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGuid(), newListOfGuid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfGuid(ListOfGuid newListOfGuid) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGuid(), newListOfGuid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfHistoryEventFieldList getListOfHistoryEventFieldList() {
		return (ListOfHistoryEventFieldList)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryEventFieldList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfHistoryEventFieldList(ListOfHistoryEventFieldList newListOfHistoryEventFieldList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryEventFieldList(), newListOfHistoryEventFieldList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfHistoryEventFieldList(ListOfHistoryEventFieldList newListOfHistoryEventFieldList) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryEventFieldList(), newListOfHistoryEventFieldList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfHistoryReadResult getListOfHistoryReadResult() {
		return (ListOfHistoryReadResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfHistoryReadResult(ListOfHistoryReadResult newListOfHistoryReadResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadResult(), newListOfHistoryReadResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfHistoryReadResult(ListOfHistoryReadResult newListOfHistoryReadResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadResult(), newListOfHistoryReadResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfHistoryReadValueId getListOfHistoryReadValueId() {
		return (ListOfHistoryReadValueId)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadValueId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfHistoryReadValueId(ListOfHistoryReadValueId newListOfHistoryReadValueId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadValueId(), newListOfHistoryReadValueId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfHistoryReadValueId(ListOfHistoryReadValueId newListOfHistoryReadValueId) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadValueId(), newListOfHistoryReadValueId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfHistoryUpdateResult getListOfHistoryUpdateResult() {
		return (ListOfHistoryUpdateResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryUpdateResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfHistoryUpdateResult(ListOfHistoryUpdateResult newListOfHistoryUpdateResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryUpdateResult(), newListOfHistoryUpdateResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfHistoryUpdateResult(ListOfHistoryUpdateResult newListOfHistoryUpdateResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryUpdateResult(), newListOfHistoryUpdateResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfIdentityCriteriaType getListOfIdentityCriteriaType() {
		return (ListOfIdentityCriteriaType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityCriteriaType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfIdentityCriteriaType(ListOfIdentityCriteriaType newListOfIdentityCriteriaType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityCriteriaType(), newListOfIdentityCriteriaType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfIdentityCriteriaType(ListOfIdentityCriteriaType newListOfIdentityCriteriaType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityCriteriaType(), newListOfIdentityCriteriaType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfIdentityMappingRuleType getListOfIdentityMappingRuleType() {
		return (ListOfIdentityMappingRuleType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityMappingRuleType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfIdentityMappingRuleType(ListOfIdentityMappingRuleType newListOfIdentityMappingRuleType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityMappingRuleType(), newListOfIdentityMappingRuleType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfIdentityMappingRuleType(ListOfIdentityMappingRuleType newListOfIdentityMappingRuleType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityMappingRuleType(), newListOfIdentityMappingRuleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfIdType getListOfIdType() {
		return (ListOfIdType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfIdType(ListOfIdType newListOfIdType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdType(), newListOfIdType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfIdType(ListOfIdType newListOfIdType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdType(), newListOfIdType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfInt16 getListOfInt16() {
		return (ListOfInt16)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt16(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfInt16(ListOfInt16 newListOfInt16, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt16(), newListOfInt16, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfInt16(ListOfInt16 newListOfInt16) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt16(), newListOfInt16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfInt32 getListOfInt32() {
		return (ListOfInt32)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt32(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfInt32(ListOfInt32 newListOfInt32, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt32(), newListOfInt32, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfInt32(ListOfInt32 newListOfInt32) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt32(), newListOfInt32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfInt64 getListOfInt64() {
		return (ListOfInt64)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt64(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfInt64(ListOfInt64 newListOfInt64, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt64(), newListOfInt64, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfInt64(ListOfInt64 newListOfInt64) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt64(), newListOfInt64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfJsonDataSetMessageContentMask getListOfJsonDataSetMessageContentMask() {
		return (ListOfJsonDataSetMessageContentMask)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetMessageContentMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfJsonDataSetMessageContentMask(ListOfJsonDataSetMessageContentMask newListOfJsonDataSetMessageContentMask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetMessageContentMask(), newListOfJsonDataSetMessageContentMask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfJsonDataSetMessageContentMask(ListOfJsonDataSetMessageContentMask newListOfJsonDataSetMessageContentMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetMessageContentMask(), newListOfJsonDataSetMessageContentMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfJsonDataSetReaderMessageDataType getListOfJsonDataSetReaderMessageDataType() {
		return (ListOfJsonDataSetReaderMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetReaderMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfJsonDataSetReaderMessageDataType(ListOfJsonDataSetReaderMessageDataType newListOfJsonDataSetReaderMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetReaderMessageDataType(), newListOfJsonDataSetReaderMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfJsonDataSetReaderMessageDataType(ListOfJsonDataSetReaderMessageDataType newListOfJsonDataSetReaderMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetReaderMessageDataType(), newListOfJsonDataSetReaderMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfJsonDataSetWriterMessageDataType getListOfJsonDataSetWriterMessageDataType() {
		return (ListOfJsonDataSetWriterMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetWriterMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfJsonDataSetWriterMessageDataType(ListOfJsonDataSetWriterMessageDataType newListOfJsonDataSetWriterMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetWriterMessageDataType(), newListOfJsonDataSetWriterMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfJsonDataSetWriterMessageDataType(ListOfJsonDataSetWriterMessageDataType newListOfJsonDataSetWriterMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetWriterMessageDataType(), newListOfJsonDataSetWriterMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfJsonNetworkMessageContentMask getListOfJsonNetworkMessageContentMask() {
		return (ListOfJsonNetworkMessageContentMask)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonNetworkMessageContentMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfJsonNetworkMessageContentMask(ListOfJsonNetworkMessageContentMask newListOfJsonNetworkMessageContentMask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonNetworkMessageContentMask(), newListOfJsonNetworkMessageContentMask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfJsonNetworkMessageContentMask(ListOfJsonNetworkMessageContentMask newListOfJsonNetworkMessageContentMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonNetworkMessageContentMask(), newListOfJsonNetworkMessageContentMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfJsonWriterGroupMessageDataType getListOfJsonWriterGroupMessageDataType() {
		return (ListOfJsonWriterGroupMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonWriterGroupMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfJsonWriterGroupMessageDataType(ListOfJsonWriterGroupMessageDataType newListOfJsonWriterGroupMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonWriterGroupMessageDataType(), newListOfJsonWriterGroupMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfJsonWriterGroupMessageDataType(ListOfJsonWriterGroupMessageDataType newListOfJsonWriterGroupMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonWriterGroupMessageDataType(), newListOfJsonWriterGroupMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfKeyValuePair getListOfKeyValuePair() {
		return (ListOfKeyValuePair)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfKeyValuePair(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfKeyValuePair(ListOfKeyValuePair newListOfKeyValuePair, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfKeyValuePair(), newListOfKeyValuePair, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfKeyValuePair(ListOfKeyValuePair newListOfKeyValuePair) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfKeyValuePair(), newListOfKeyValuePair);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfLocalizedText getListOfLocalizedText() {
		return (ListOfLocalizedText)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfLocalizedText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfLocalizedText(ListOfLocalizedText newListOfLocalizedText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfLocalizedText(), newListOfLocalizedText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfLocalizedText(ListOfLocalizedText newListOfLocalizedText) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfLocalizedText(), newListOfLocalizedText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfModelChangeStructureDataType getListOfModelChangeStructureDataType() {
		return (ListOfModelChangeStructureDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModelChangeStructureDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfModelChangeStructureDataType(ListOfModelChangeStructureDataType newListOfModelChangeStructureDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModelChangeStructureDataType(), newListOfModelChangeStructureDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfModelChangeStructureDataType(ListOfModelChangeStructureDataType newListOfModelChangeStructureDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModelChangeStructureDataType(), newListOfModelChangeStructureDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfModificationInfo getListOfModificationInfo() {
		return (ListOfModificationInfo)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModificationInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfModificationInfo(ListOfModificationInfo newListOfModificationInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModificationInfo(), newListOfModificationInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfModificationInfo(ListOfModificationInfo newListOfModificationInfo) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModificationInfo(), newListOfModificationInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemCreateRequest getListOfMonitoredItemCreateRequest() {
		return (ListOfMonitoredItemCreateRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfMonitoredItemCreateRequest(ListOfMonitoredItemCreateRequest newListOfMonitoredItemCreateRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateRequest(), newListOfMonitoredItemCreateRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfMonitoredItemCreateRequest(ListOfMonitoredItemCreateRequest newListOfMonitoredItemCreateRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateRequest(), newListOfMonitoredItemCreateRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemCreateResult getListOfMonitoredItemCreateResult() {
		return (ListOfMonitoredItemCreateResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfMonitoredItemCreateResult(ListOfMonitoredItemCreateResult newListOfMonitoredItemCreateResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateResult(), newListOfMonitoredItemCreateResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfMonitoredItemCreateResult(ListOfMonitoredItemCreateResult newListOfMonitoredItemCreateResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateResult(), newListOfMonitoredItemCreateResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemModifyRequest getListOfMonitoredItemModifyRequest() {
		return (ListOfMonitoredItemModifyRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfMonitoredItemModifyRequest(ListOfMonitoredItemModifyRequest newListOfMonitoredItemModifyRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyRequest(), newListOfMonitoredItemModifyRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfMonitoredItemModifyRequest(ListOfMonitoredItemModifyRequest newListOfMonitoredItemModifyRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyRequest(), newListOfMonitoredItemModifyRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemModifyResult getListOfMonitoredItemModifyResult() {
		return (ListOfMonitoredItemModifyResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfMonitoredItemModifyResult(ListOfMonitoredItemModifyResult newListOfMonitoredItemModifyResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyResult(), newListOfMonitoredItemModifyResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfMonitoredItemModifyResult(ListOfMonitoredItemModifyResult newListOfMonitoredItemModifyResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyResult(), newListOfMonitoredItemModifyResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemNotification getListOfMonitoredItemNotification() {
		return (ListOfMonitoredItemNotification)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemNotification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfMonitoredItemNotification(ListOfMonitoredItemNotification newListOfMonitoredItemNotification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemNotification(), newListOfMonitoredItemNotification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfMonitoredItemNotification(ListOfMonitoredItemNotification newListOfMonitoredItemNotification) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemNotification(), newListOfMonitoredItemNotification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNetworkAddressDataType getListOfNetworkAddressDataType() {
		return (ListOfNetworkAddressDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfNetworkAddressDataType(ListOfNetworkAddressDataType newListOfNetworkAddressDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressDataType(), newListOfNetworkAddressDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfNetworkAddressDataType(ListOfNetworkAddressDataType newListOfNetworkAddressDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressDataType(), newListOfNetworkAddressDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNetworkAddressUrlDataType getListOfNetworkAddressUrlDataType() {
		return (ListOfNetworkAddressUrlDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressUrlDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfNetworkAddressUrlDataType(ListOfNetworkAddressUrlDataType newListOfNetworkAddressUrlDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressUrlDataType(), newListOfNetworkAddressUrlDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfNetworkAddressUrlDataType(ListOfNetworkAddressUrlDataType newListOfNetworkAddressUrlDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressUrlDataType(), newListOfNetworkAddressUrlDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNetworkGroupDataType getListOfNetworkGroupDataType() {
		return (ListOfNetworkGroupDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkGroupDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfNetworkGroupDataType(ListOfNetworkGroupDataType newListOfNetworkGroupDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkGroupDataType(), newListOfNetworkGroupDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfNetworkGroupDataType(ListOfNetworkGroupDataType newListOfNetworkGroupDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkGroupDataType(), newListOfNetworkGroupDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNode getListOfNode() {
		return (ListOfNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfNode(ListOfNode newListOfNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNode(), newListOfNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfNode(ListOfNode newListOfNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNode(), newListOfNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNodeId getListOfNodeId() {
		return (ListOfNodeId)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfNodeId(ListOfNodeId newListOfNodeId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeId(), newListOfNodeId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfNodeId(ListOfNodeId newListOfNodeId) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeId(), newListOfNodeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNodeReference getListOfNodeReference() {
		return (ListOfNodeReference)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfNodeReference(ListOfNodeReference newListOfNodeReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeReference(), newListOfNodeReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfNodeReference(ListOfNodeReference newListOfNodeReference) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeReference(), newListOfNodeReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNodeTypeDescription getListOfNodeTypeDescription() {
		return (ListOfNodeTypeDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeTypeDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfNodeTypeDescription(ListOfNodeTypeDescription newListOfNodeTypeDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeTypeDescription(), newListOfNodeTypeDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfNodeTypeDescription(ListOfNodeTypeDescription newListOfNodeTypeDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeTypeDescription(), newListOfNodeTypeDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfOpenFileMode getListOfOpenFileMode() {
		return (ListOfOpenFileMode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOpenFileMode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfOpenFileMode(ListOfOpenFileMode newListOfOpenFileMode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOpenFileMode(), newListOfOpenFileMode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfOpenFileMode(ListOfOpenFileMode newListOfOpenFileMode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOpenFileMode(), newListOfOpenFileMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfOptionSet getListOfOptionSet() {
		return (ListOfOptionSet)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOptionSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfOptionSet(ListOfOptionSet newListOfOptionSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOptionSet(), newListOfOptionSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfOptionSet(ListOfOptionSet newListOfOptionSet) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOptionSet(), newListOfOptionSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfOrientation getListOfOrientation() {
		return (ListOfOrientation)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOrientation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfOrientation(ListOfOrientation newListOfOrientation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOrientation(), newListOfOrientation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfOrientation(ListOfOrientation newListOfOrientation) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOrientation(), newListOfOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfOverrideValueHandling getListOfOverrideValueHandling() {
		return (ListOfOverrideValueHandling)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOverrideValueHandling(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfOverrideValueHandling(ListOfOverrideValueHandling newListOfOverrideValueHandling, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOverrideValueHandling(), newListOfOverrideValueHandling, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfOverrideValueHandling(ListOfOverrideValueHandling newListOfOverrideValueHandling) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOverrideValueHandling(), newListOfOverrideValueHandling);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfParsingResult getListOfParsingResult() {
		return (ListOfParsingResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfParsingResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfParsingResult(ListOfParsingResult newListOfParsingResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfParsingResult(), newListOfParsingResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfParsingResult(ListOfParsingResult newListOfParsingResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfParsingResult(), newListOfParsingResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedDataItemsDataType getListOfPublishedDataItemsDataType() {
		return (ListOfPublishedDataItemsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataItemsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfPublishedDataItemsDataType(ListOfPublishedDataItemsDataType newListOfPublishedDataItemsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataItemsDataType(), newListOfPublishedDataItemsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfPublishedDataItemsDataType(ListOfPublishedDataItemsDataType newListOfPublishedDataItemsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataItemsDataType(), newListOfPublishedDataItemsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedDataSetDataType getListOfPublishedDataSetDataType() {
		return (ListOfPublishedDataSetDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfPublishedDataSetDataType(ListOfPublishedDataSetDataType newListOfPublishedDataSetDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetDataType(), newListOfPublishedDataSetDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfPublishedDataSetDataType(ListOfPublishedDataSetDataType newListOfPublishedDataSetDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetDataType(), newListOfPublishedDataSetDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedDataSetSourceDataType getListOfPublishedDataSetSourceDataType() {
		return (ListOfPublishedDataSetSourceDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetSourceDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfPublishedDataSetSourceDataType(ListOfPublishedDataSetSourceDataType newListOfPublishedDataSetSourceDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetSourceDataType(), newListOfPublishedDataSetSourceDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfPublishedDataSetSourceDataType(ListOfPublishedDataSetSourceDataType newListOfPublishedDataSetSourceDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetSourceDataType(), newListOfPublishedDataSetSourceDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedEventsDataType getListOfPublishedEventsDataType() {
		return (ListOfPublishedEventsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedEventsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfPublishedEventsDataType(ListOfPublishedEventsDataType newListOfPublishedEventsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedEventsDataType(), newListOfPublishedEventsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfPublishedEventsDataType(ListOfPublishedEventsDataType newListOfPublishedEventsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedEventsDataType(), newListOfPublishedEventsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedVariableDataType getListOfPublishedVariableDataType() {
		return (ListOfPublishedVariableDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedVariableDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfPublishedVariableDataType(ListOfPublishedVariableDataType newListOfPublishedVariableDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedVariableDataType(), newListOfPublishedVariableDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfPublishedVariableDataType(ListOfPublishedVariableDataType newListOfPublishedVariableDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedVariableDataType(), newListOfPublishedVariableDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubConfigurationDataType getListOfPubSubConfigurationDataType() {
		return (ListOfPubSubConfigurationDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConfigurationDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfPubSubConfigurationDataType(ListOfPubSubConfigurationDataType newListOfPubSubConfigurationDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConfigurationDataType(), newListOfPubSubConfigurationDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfPubSubConfigurationDataType(ListOfPubSubConfigurationDataType newListOfPubSubConfigurationDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConfigurationDataType(), newListOfPubSubConfigurationDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubConnectionDataType getListOfPubSubConnectionDataType() {
		return (ListOfPubSubConnectionDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConnectionDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfPubSubConnectionDataType(ListOfPubSubConnectionDataType newListOfPubSubConnectionDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConnectionDataType(), newListOfPubSubConnectionDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfPubSubConnectionDataType(ListOfPubSubConnectionDataType newListOfPubSubConnectionDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConnectionDataType(), newListOfPubSubConnectionDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubDiagnosticsCounterClassification getListOfPubSubDiagnosticsCounterClassification() {
		return (ListOfPubSubDiagnosticsCounterClassification)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubDiagnosticsCounterClassification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfPubSubDiagnosticsCounterClassification(ListOfPubSubDiagnosticsCounterClassification newListOfPubSubDiagnosticsCounterClassification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubDiagnosticsCounterClassification(), newListOfPubSubDiagnosticsCounterClassification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfPubSubDiagnosticsCounterClassification(ListOfPubSubDiagnosticsCounterClassification newListOfPubSubDiagnosticsCounterClassification) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubDiagnosticsCounterClassification(), newListOfPubSubDiagnosticsCounterClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubGroupDataType getListOfPubSubGroupDataType() {
		return (ListOfPubSubGroupDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubGroupDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfPubSubGroupDataType(ListOfPubSubGroupDataType newListOfPubSubGroupDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubGroupDataType(), newListOfPubSubGroupDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfPubSubGroupDataType(ListOfPubSubGroupDataType newListOfPubSubGroupDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubGroupDataType(), newListOfPubSubGroupDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubState getListOfPubSubState() {
		return (ListOfPubSubState)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubState(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfPubSubState(ListOfPubSubState newListOfPubSubState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubState(), newListOfPubSubState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfPubSubState(ListOfPubSubState newListOfPubSubState) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubState(), newListOfPubSubState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfQualifiedName getListOfQualifiedName() {
		return (ListOfQualifiedName)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQualifiedName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfQualifiedName(ListOfQualifiedName newListOfQualifiedName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQualifiedName(), newListOfQualifiedName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfQualifiedName(ListOfQualifiedName newListOfQualifiedName) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQualifiedName(), newListOfQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfQueryDataDescription getListOfQueryDataDescription() {
		return (ListOfQueryDataDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfQueryDataDescription(ListOfQueryDataDescription newListOfQueryDataDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataDescription(), newListOfQueryDataDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfQueryDataDescription(ListOfQueryDataDescription newListOfQueryDataDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataDescription(), newListOfQueryDataDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfQueryDataSet getListOfQueryDataSet() {
		return (ListOfQueryDataSet)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfQueryDataSet(ListOfQueryDataSet newListOfQueryDataSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataSet(), newListOfQueryDataSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfQueryDataSet(ListOfQueryDataSet newListOfQueryDataSet) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataSet(), newListOfQueryDataSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRationalNumber getListOfRationalNumber() {
		return (ListOfRationalNumber)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRationalNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfRationalNumber(ListOfRationalNumber newListOfRationalNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRationalNumber(), newListOfRationalNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfRationalNumber(ListOfRationalNumber newListOfRationalNumber) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRationalNumber(), newListOfRationalNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReaderGroupDataType getListOfReaderGroupDataType() {
		return (ListOfReaderGroupDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfReaderGroupDataType(ListOfReaderGroupDataType newListOfReaderGroupDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupDataType(), newListOfReaderGroupDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfReaderGroupDataType(ListOfReaderGroupDataType newListOfReaderGroupDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupDataType(), newListOfReaderGroupDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReaderGroupMessageDataType getListOfReaderGroupMessageDataType() {
		return (ListOfReaderGroupMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfReaderGroupMessageDataType(ListOfReaderGroupMessageDataType newListOfReaderGroupMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupMessageDataType(), newListOfReaderGroupMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfReaderGroupMessageDataType(ListOfReaderGroupMessageDataType newListOfReaderGroupMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupMessageDataType(), newListOfReaderGroupMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReaderGroupTransportDataType getListOfReaderGroupTransportDataType() {
		return (ListOfReaderGroupTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfReaderGroupTransportDataType(ListOfReaderGroupTransportDataType newListOfReaderGroupTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupTransportDataType(), newListOfReaderGroupTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfReaderGroupTransportDataType(ListOfReaderGroupTransportDataType newListOfReaderGroupTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupTransportDataType(), newListOfReaderGroupTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReadValueId getListOfReadValueId() {
		return (ListOfReadValueId)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReadValueId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfReadValueId(ListOfReadValueId newListOfReadValueId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReadValueId(), newListOfReadValueId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfReadValueId(ListOfReadValueId newListOfReadValueId) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReadValueId(), newListOfReadValueId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRedundantServerDataType getListOfRedundantServerDataType() {
		return (ListOfRedundantServerDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRedundantServerDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfRedundantServerDataType(ListOfRedundantServerDataType newListOfRedundantServerDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRedundantServerDataType(), newListOfRedundantServerDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfRedundantServerDataType(ListOfRedundantServerDataType newListOfRedundantServerDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRedundantServerDataType(), newListOfRedundantServerDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReferenceDescription getListOfReferenceDescription() {
		return (ListOfReferenceDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfReferenceDescription(ListOfReferenceDescription newListOfReferenceDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceDescription(), newListOfReferenceDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfReferenceDescription(ListOfReferenceDescription newListOfReferenceDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceDescription(), newListOfReferenceDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReferenceNode getListOfReferenceNode() {
		return (ListOfReferenceNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfReferenceNode(ListOfReferenceNode newListOfReferenceNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceNode(), newListOfReferenceNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfReferenceNode(ListOfReferenceNode newListOfReferenceNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceNode(), newListOfReferenceNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRegisteredServer getListOfRegisteredServer() {
		return (ListOfRegisteredServer)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRegisteredServer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfRegisteredServer(ListOfRegisteredServer newListOfRegisteredServer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRegisteredServer(), newListOfRegisteredServer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfRegisteredServer(ListOfRegisteredServer newListOfRegisteredServer) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRegisteredServer(), newListOfRegisteredServer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRelativePathElement getListOfRelativePathElement() {
		return (ListOfRelativePathElement)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRelativePathElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfRelativePathElement(ListOfRelativePathElement newListOfRelativePathElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRelativePathElement(), newListOfRelativePathElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfRelativePathElement(ListOfRelativePathElement newListOfRelativePathElement) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRelativePathElement(), newListOfRelativePathElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRolePermissionType getListOfRolePermissionType() {
		return (ListOfRolePermissionType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRolePermissionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfRolePermissionType(ListOfRolePermissionType newListOfRolePermissionType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRolePermissionType(), newListOfRolePermissionType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfRolePermissionType(ListOfRolePermissionType newListOfRolePermissionType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRolePermissionType(), newListOfRolePermissionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSamplingIntervalDiagnosticsDataType getListOfSamplingIntervalDiagnosticsDataType() {
		return (ListOfSamplingIntervalDiagnosticsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSamplingIntervalDiagnosticsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSamplingIntervalDiagnosticsDataType(ListOfSamplingIntervalDiagnosticsDataType newListOfSamplingIntervalDiagnosticsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSamplingIntervalDiagnosticsDataType(), newListOfSamplingIntervalDiagnosticsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSamplingIntervalDiagnosticsDataType(ListOfSamplingIntervalDiagnosticsDataType newListOfSamplingIntervalDiagnosticsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSamplingIntervalDiagnosticsDataType(), newListOfSamplingIntervalDiagnosticsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSByte getListOfSByte() {
		return (ListOfSByte)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSByte(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSByte(ListOfSByte newListOfSByte, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSByte(), newListOfSByte, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSByte(ListOfSByte newListOfSByte) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSByte(), newListOfSByte);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSemanticChangeStructureDataType getListOfSemanticChangeStructureDataType() {
		return (ListOfSemanticChangeStructureDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSemanticChangeStructureDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSemanticChangeStructureDataType(ListOfSemanticChangeStructureDataType newListOfSemanticChangeStructureDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSemanticChangeStructureDataType(), newListOfSemanticChangeStructureDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSemanticChangeStructureDataType(ListOfSemanticChangeStructureDataType newListOfSemanticChangeStructureDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSemanticChangeStructureDataType(), newListOfSemanticChangeStructureDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfServerOnNetwork getListOfServerOnNetwork() {
		return (ListOfServerOnNetwork)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfServerOnNetwork(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfServerOnNetwork(ListOfServerOnNetwork newListOfServerOnNetwork, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfServerOnNetwork(), newListOfServerOnNetwork, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfServerOnNetwork(ListOfServerOnNetwork newListOfServerOnNetwork) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfServerOnNetwork(), newListOfServerOnNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSessionDiagnosticsDataType getListOfSessionDiagnosticsDataType() {
		return (ListOfSessionDiagnosticsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionDiagnosticsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSessionDiagnosticsDataType(ListOfSessionDiagnosticsDataType newListOfSessionDiagnosticsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionDiagnosticsDataType(), newListOfSessionDiagnosticsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSessionDiagnosticsDataType(ListOfSessionDiagnosticsDataType newListOfSessionDiagnosticsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionDiagnosticsDataType(), newListOfSessionDiagnosticsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSessionSecurityDiagnosticsDataType getListOfSessionSecurityDiagnosticsDataType() {
		return (ListOfSessionSecurityDiagnosticsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionSecurityDiagnosticsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSessionSecurityDiagnosticsDataType(ListOfSessionSecurityDiagnosticsDataType newListOfSessionSecurityDiagnosticsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionSecurityDiagnosticsDataType(), newListOfSessionSecurityDiagnosticsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSessionSecurityDiagnosticsDataType(ListOfSessionSecurityDiagnosticsDataType newListOfSessionSecurityDiagnosticsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionSecurityDiagnosticsDataType(), newListOfSessionSecurityDiagnosticsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSignedSoftwareCertificate getListOfSignedSoftwareCertificate() {
		return (ListOfSignedSoftwareCertificate)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSignedSoftwareCertificate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSignedSoftwareCertificate(ListOfSignedSoftwareCertificate newListOfSignedSoftwareCertificate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSignedSoftwareCertificate(), newListOfSignedSoftwareCertificate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSignedSoftwareCertificate(ListOfSignedSoftwareCertificate newListOfSignedSoftwareCertificate) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSignedSoftwareCertificate(), newListOfSignedSoftwareCertificate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSimpleAttributeOperand getListOfSimpleAttributeOperand() {
		return (ListOfSimpleAttributeOperand)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleAttributeOperand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSimpleAttributeOperand(ListOfSimpleAttributeOperand newListOfSimpleAttributeOperand, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleAttributeOperand(), newListOfSimpleAttributeOperand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSimpleAttributeOperand(ListOfSimpleAttributeOperand newListOfSimpleAttributeOperand) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleAttributeOperand(), newListOfSimpleAttributeOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSimpleTypeDescription getListOfSimpleTypeDescription() {
		return (ListOfSimpleTypeDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleTypeDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSimpleTypeDescription(ListOfSimpleTypeDescription newListOfSimpleTypeDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleTypeDescription(), newListOfSimpleTypeDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSimpleTypeDescription(ListOfSimpleTypeDescription newListOfSimpleTypeDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleTypeDescription(), newListOfSimpleTypeDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusCode getListOfStatusCode() {
		return (ListOfStatusCode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfStatusCode(ListOfStatusCode newListOfStatusCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusCode(), newListOfStatusCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfStatusCode(ListOfStatusCode newListOfStatusCode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusCode(), newListOfStatusCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusResult getListOfStatusResult() {
		return (ListOfStatusResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfStatusResult(ListOfStatusResult newListOfStatusResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusResult(), newListOfStatusResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfStatusResult(ListOfStatusResult newListOfStatusResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusResult(), newListOfStatusResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getListOfString() {
		return (ListOfString)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfString(ListOfString newListOfString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfString(), newListOfString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfString(ListOfString newListOfString) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfString(), newListOfString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStructureDefinition getListOfStructureDefinition() {
		return (ListOfStructureDefinition)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfStructureDefinition(ListOfStructureDefinition newListOfStructureDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDefinition(), newListOfStructureDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfStructureDefinition(ListOfStructureDefinition newListOfStructureDefinition) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDefinition(), newListOfStructureDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStructureDescription getListOfStructureDescription() {
		return (ListOfStructureDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfStructureDescription(ListOfStructureDescription newListOfStructureDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDescription(), newListOfStructureDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfStructureDescription(ListOfStructureDescription newListOfStructureDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDescription(), newListOfStructureDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStructureField getListOfStructureField() {
		return (ListOfStructureField)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureField(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfStructureField(ListOfStructureField newListOfStructureField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureField(), newListOfStructureField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfStructureField(ListOfStructureField newListOfStructureField) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureField(), newListOfStructureField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSubscribedDataSetDataType getListOfSubscribedDataSetDataType() {
		return (ListOfSubscribedDataSetDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSubscribedDataSetDataType(ListOfSubscribedDataSetDataType newListOfSubscribedDataSetDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetDataType(), newListOfSubscribedDataSetDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSubscribedDataSetDataType(ListOfSubscribedDataSetDataType newListOfSubscribedDataSetDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetDataType(), newListOfSubscribedDataSetDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSubscribedDataSetMirrorDataType getListOfSubscribedDataSetMirrorDataType() {
		return (ListOfSubscribedDataSetMirrorDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetMirrorDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSubscribedDataSetMirrorDataType(ListOfSubscribedDataSetMirrorDataType newListOfSubscribedDataSetMirrorDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetMirrorDataType(), newListOfSubscribedDataSetMirrorDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSubscribedDataSetMirrorDataType(ListOfSubscribedDataSetMirrorDataType newListOfSubscribedDataSetMirrorDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetMirrorDataType(), newListOfSubscribedDataSetMirrorDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSubscriptionAcknowledgement getListOfSubscriptionAcknowledgement() {
		return (ListOfSubscriptionAcknowledgement)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionAcknowledgement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSubscriptionAcknowledgement(ListOfSubscriptionAcknowledgement newListOfSubscriptionAcknowledgement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionAcknowledgement(), newListOfSubscriptionAcknowledgement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSubscriptionAcknowledgement(ListOfSubscriptionAcknowledgement newListOfSubscriptionAcknowledgement) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionAcknowledgement(), newListOfSubscriptionAcknowledgement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSubscriptionDiagnosticsDataType getListOfSubscriptionDiagnosticsDataType() {
		return (ListOfSubscriptionDiagnosticsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionDiagnosticsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSubscriptionDiagnosticsDataType(ListOfSubscriptionDiagnosticsDataType newListOfSubscriptionDiagnosticsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionDiagnosticsDataType(), newListOfSubscriptionDiagnosticsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSubscriptionDiagnosticsDataType(ListOfSubscriptionDiagnosticsDataType newListOfSubscriptionDiagnosticsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionDiagnosticsDataType(), newListOfSubscriptionDiagnosticsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfTargetVariablesDataType getListOfTargetVariablesDataType() {
		return (ListOfTargetVariablesDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTargetVariablesDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfTargetVariablesDataType(ListOfTargetVariablesDataType newListOfTargetVariablesDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTargetVariablesDataType(), newListOfTargetVariablesDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfTargetVariablesDataType(ListOfTargetVariablesDataType newListOfTargetVariablesDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTargetVariablesDataType(), newListOfTargetVariablesDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfThreeDCartesianCoordinates getListOfThreeDCartesianCoordinates() {
		return (ListOfThreeDCartesianCoordinates)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDCartesianCoordinates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfThreeDCartesianCoordinates(ListOfThreeDCartesianCoordinates newListOfThreeDCartesianCoordinates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDCartesianCoordinates(), newListOfThreeDCartesianCoordinates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfThreeDCartesianCoordinates(ListOfThreeDCartesianCoordinates newListOfThreeDCartesianCoordinates) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDCartesianCoordinates(), newListOfThreeDCartesianCoordinates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfThreeDFrame getListOfThreeDFrame() {
		return (ListOfThreeDFrame)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfThreeDFrame(ListOfThreeDFrame newListOfThreeDFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDFrame(), newListOfThreeDFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfThreeDFrame(ListOfThreeDFrame newListOfThreeDFrame) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDFrame(), newListOfThreeDFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfThreeDOrientation getListOfThreeDOrientation() {
		return (ListOfThreeDOrientation)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDOrientation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfThreeDOrientation(ListOfThreeDOrientation newListOfThreeDOrientation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDOrientation(), newListOfThreeDOrientation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfThreeDOrientation(ListOfThreeDOrientation newListOfThreeDOrientation) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDOrientation(), newListOfThreeDOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfThreeDVector getListOfThreeDVector() {
		return (ListOfThreeDVector)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDVector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfThreeDVector(ListOfThreeDVector newListOfThreeDVector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDVector(), newListOfThreeDVector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfThreeDVector(ListOfThreeDVector newListOfThreeDVector) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDVector(), newListOfThreeDVector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfTimeZoneDataType getListOfTimeZoneDataType() {
		return (ListOfTimeZoneDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTimeZoneDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfTimeZoneDataType(ListOfTimeZoneDataType newListOfTimeZoneDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTimeZoneDataType(), newListOfTimeZoneDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfTimeZoneDataType(ListOfTimeZoneDataType newListOfTimeZoneDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTimeZoneDataType(), newListOfTimeZoneDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfTransferResult getListOfTransferResult() {
		return (ListOfTransferResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTransferResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfTransferResult(ListOfTransferResult newListOfTransferResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTransferResult(), newListOfTransferResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfTransferResult(ListOfTransferResult newListOfTransferResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTransferResult(), newListOfTransferResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfTrustListDataType getListOfTrustListDataType() {
		return (ListOfTrustListDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTrustListDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfTrustListDataType(ListOfTrustListDataType newListOfTrustListDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTrustListDataType(), newListOfTrustListDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfTrustListDataType(ListOfTrustListDataType newListOfTrustListDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTrustListDataType(), newListOfTrustListDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUABinaryFileDataType getListOfUABinaryFileDataType() {
		return (ListOfUABinaryFileDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUABinaryFileDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUABinaryFileDataType(ListOfUABinaryFileDataType newListOfUABinaryFileDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUABinaryFileDataType(), newListOfUABinaryFileDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUABinaryFileDataType(ListOfUABinaryFileDataType newListOfUABinaryFileDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUABinaryFileDataType(), newListOfUABinaryFileDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUadpDataSetMessageContentMask getListOfUadpDataSetMessageContentMask() {
		return (ListOfUadpDataSetMessageContentMask)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetMessageContentMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUadpDataSetMessageContentMask(ListOfUadpDataSetMessageContentMask newListOfUadpDataSetMessageContentMask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetMessageContentMask(), newListOfUadpDataSetMessageContentMask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUadpDataSetMessageContentMask(ListOfUadpDataSetMessageContentMask newListOfUadpDataSetMessageContentMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetMessageContentMask(), newListOfUadpDataSetMessageContentMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUadpDataSetReaderMessageDataType getListOfUadpDataSetReaderMessageDataType() {
		return (ListOfUadpDataSetReaderMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetReaderMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUadpDataSetReaderMessageDataType(ListOfUadpDataSetReaderMessageDataType newListOfUadpDataSetReaderMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetReaderMessageDataType(), newListOfUadpDataSetReaderMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUadpDataSetReaderMessageDataType(ListOfUadpDataSetReaderMessageDataType newListOfUadpDataSetReaderMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetReaderMessageDataType(), newListOfUadpDataSetReaderMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUadpDataSetWriterMessageDataType getListOfUadpDataSetWriterMessageDataType() {
		return (ListOfUadpDataSetWriterMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetWriterMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUadpDataSetWriterMessageDataType(ListOfUadpDataSetWriterMessageDataType newListOfUadpDataSetWriterMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetWriterMessageDataType(), newListOfUadpDataSetWriterMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUadpDataSetWriterMessageDataType(ListOfUadpDataSetWriterMessageDataType newListOfUadpDataSetWriterMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetWriterMessageDataType(), newListOfUadpDataSetWriterMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUadpNetworkMessageContentMask getListOfUadpNetworkMessageContentMask() {
		return (ListOfUadpNetworkMessageContentMask)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpNetworkMessageContentMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUadpNetworkMessageContentMask(ListOfUadpNetworkMessageContentMask newListOfUadpNetworkMessageContentMask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpNetworkMessageContentMask(), newListOfUadpNetworkMessageContentMask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUadpNetworkMessageContentMask(ListOfUadpNetworkMessageContentMask newListOfUadpNetworkMessageContentMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpNetworkMessageContentMask(), newListOfUadpNetworkMessageContentMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUadpWriterGroupMessageDataType getListOfUadpWriterGroupMessageDataType() {
		return (ListOfUadpWriterGroupMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpWriterGroupMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUadpWriterGroupMessageDataType(ListOfUadpWriterGroupMessageDataType newListOfUadpWriterGroupMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpWriterGroupMessageDataType(), newListOfUadpWriterGroupMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUadpWriterGroupMessageDataType(ListOfUadpWriterGroupMessageDataType newListOfUadpWriterGroupMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpWriterGroupMessageDataType(), newListOfUadpWriterGroupMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt16 getListOfUInt16() {
		return (ListOfUInt16)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt16(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUInt16(ListOfUInt16 newListOfUInt16, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt16(), newListOfUInt16, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUInt16(ListOfUInt16 newListOfUInt16) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt16(), newListOfUInt16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt32 getListOfUInt32() {
		return (ListOfUInt32)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt32(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUInt32(ListOfUInt32 newListOfUInt32, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt32(), newListOfUInt32, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUInt32(ListOfUInt32 newListOfUInt32) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt32(), newListOfUInt32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt64 getListOfUInt64() {
		return (ListOfUInt64)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt64(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUInt64(ListOfUInt64 newListOfUInt64, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt64(), newListOfUInt64, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUInt64(ListOfUInt64 newListOfUInt64) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt64(), newListOfUInt64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUnion getListOfUnion() {
		return (ListOfUnion)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUnion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUnion(ListOfUnion newListOfUnion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUnion(), newListOfUnion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUnion(ListOfUnion newListOfUnion) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUnion(), newListOfUnion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUserTokenPolicy getListOfUserTokenPolicy() {
		return (ListOfUserTokenPolicy)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUserTokenPolicy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfUserTokenPolicy(ListOfUserTokenPolicy newListOfUserTokenPolicy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUserTokenPolicy(), newListOfUserTokenPolicy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfUserTokenPolicy(ListOfUserTokenPolicy newListOfUserTokenPolicy) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUserTokenPolicy(), newListOfUserTokenPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfVariant getListOfVariant() {
		return (ListOfVariant)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVariant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfVariant(ListOfVariant newListOfVariant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVariant(), newListOfVariant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfVariant(ListOfVariant newListOfVariant) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVariant(), newListOfVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfVector getListOfVector() {
		return (ListOfVector)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfVector(ListOfVector newListOfVector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVector(), newListOfVector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfVector(ListOfVector newListOfVector) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVector(), newListOfVector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfWriterGroupDataType getListOfWriterGroupDataType() {
		return (ListOfWriterGroupDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfWriterGroupDataType(ListOfWriterGroupDataType newListOfWriterGroupDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupDataType(), newListOfWriterGroupDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfWriterGroupDataType(ListOfWriterGroupDataType newListOfWriterGroupDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupDataType(), newListOfWriterGroupDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfWriterGroupMessageDataType getListOfWriterGroupMessageDataType() {
		return (ListOfWriterGroupMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfWriterGroupMessageDataType(ListOfWriterGroupMessageDataType newListOfWriterGroupMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupMessageDataType(), newListOfWriterGroupMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfWriterGroupMessageDataType(ListOfWriterGroupMessageDataType newListOfWriterGroupMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupMessageDataType(), newListOfWriterGroupMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfWriterGroupTransportDataType getListOfWriterGroupTransportDataType() {
		return (ListOfWriterGroupTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfWriterGroupTransportDataType(ListOfWriterGroupTransportDataType newListOfWriterGroupTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupTransportDataType(), newListOfWriterGroupTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfWriterGroupTransportDataType(ListOfWriterGroupTransportDataType newListOfWriterGroupTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupTransportDataType(), newListOfWriterGroupTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfWriteValue getListOfWriteValue() {
		return (ListOfWriteValue)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriteValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfWriteValue(ListOfWriteValue newListOfWriteValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriteValue(), newListOfWriteValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfWriteValue(ListOfWriteValue newListOfWriteValue) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriteValue(), newListOfWriteValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfXmlElement getListOfXmlElement() {
		return (ListOfXmlElement)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ListOfXmlElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfXmlElement(ListOfXmlElement newListOfXmlElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ListOfXmlElement(), newListOfXmlElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfXmlElement(ListOfXmlElement newListOfXmlElement) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ListOfXmlElement(), newListOfXmlElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralOperand getLiteralOperand() {
		return (LiteralOperand)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_LiteralOperand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteralOperand(LiteralOperand newLiteralOperand, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_LiteralOperand(), newLiteralOperand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralOperand(LiteralOperand newLiteralOperand) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_LiteralOperand(), newLiteralOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocaleId() {
		return (String)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_LocaleId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocaleId(String newLocaleId) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_LocaleId(), newLocaleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedText getLocalizedText() {
		return (LocalizedText)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_LocalizedText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalizedText(LocalizedText newLocalizedText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_LocalizedText(), newLocalizedText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizedText(LocalizedText newLocalizedText) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_LocalizedText(), newLocalizedText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdnsDiscoveryConfiguration getMdnsDiscoveryConfiguration() {
		return (MdnsDiscoveryConfiguration)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MdnsDiscoveryConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMdnsDiscoveryConfiguration(MdnsDiscoveryConfiguration newMdnsDiscoveryConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MdnsDiscoveryConfiguration(), newMdnsDiscoveryConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdnsDiscoveryConfiguration(MdnsDiscoveryConfiguration newMdnsDiscoveryConfiguration) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MdnsDiscoveryConfiguration(), newMdnsDiscoveryConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSecurityMode getMessageSecurityMode() {
		return (MessageSecurityMode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MessageSecurityMode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSecurityMode(MessageSecurityMode newMessageSecurityMode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MessageSecurityMode(), newMessageSecurityMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodAttributes getMethodAttributes() {
		return (MethodAttributes)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MethodAttributes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodAttributes(MethodAttributes newMethodAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MethodAttributes(), newMethodAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodAttributes(MethodAttributes newMethodAttributes) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MethodAttributes(), newMethodAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodNode getMethodNode() {
		return (MethodNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MethodNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodNode(MethodNode newMethodNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MethodNode(), newMethodNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodNode(MethodNode newMethodNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MethodNode(), newMethodNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelChangeStructureDataType getModelChangeStructureDataType() {
		return (ModelChangeStructureDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ModelChangeStructureDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelChangeStructureDataType(ModelChangeStructureDataType newModelChangeStructureDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ModelChangeStructureDataType(), newModelChangeStructureDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelChangeStructureDataType(ModelChangeStructureDataType newModelChangeStructureDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ModelChangeStructureDataType(), newModelChangeStructureDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelChangeStructureVerbMask getModelChangeStructureVerbMask() {
		return (ModelChangeStructureVerbMask)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ModelChangeStructureVerbMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelChangeStructureVerbMask(ModelChangeStructureVerbMask newModelChangeStructureVerbMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ModelChangeStructureVerbMask(), newModelChangeStructureVerbMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationInfo getModificationInfo() {
		return (ModificationInfo)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ModificationInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModificationInfo(ModificationInfo newModificationInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ModificationInfo(), newModificationInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationInfo(ModificationInfo newModificationInfo) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ModificationInfo(), newModificationInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyMonitoredItemsRequest getModifyMonitoredItemsRequest() {
		return (ModifyMonitoredItemsRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifyMonitoredItemsRequest(ModifyMonitoredItemsRequest newModifyMonitoredItemsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsRequest(), newModifyMonitoredItemsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifyMonitoredItemsRequest(ModifyMonitoredItemsRequest newModifyMonitoredItemsRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsRequest(), newModifyMonitoredItemsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyMonitoredItemsResponse getModifyMonitoredItemsResponse() {
		return (ModifyMonitoredItemsResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifyMonitoredItemsResponse(ModifyMonitoredItemsResponse newModifyMonitoredItemsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsResponse(), newModifyMonitoredItemsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifyMonitoredItemsResponse(ModifyMonitoredItemsResponse newModifyMonitoredItemsResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsResponse(), newModifyMonitoredItemsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySubscriptionRequest getModifySubscriptionRequest() {
		return (ModifySubscriptionRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifySubscriptionRequest(ModifySubscriptionRequest newModifySubscriptionRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionRequest(), newModifySubscriptionRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifySubscriptionRequest(ModifySubscriptionRequest newModifySubscriptionRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionRequest(), newModifySubscriptionRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySubscriptionResponse getModifySubscriptionResponse() {
		return (ModifySubscriptionResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifySubscriptionResponse(ModifySubscriptionResponse newModifySubscriptionResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionResponse(), newModifySubscriptionResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifySubscriptionResponse(ModifySubscriptionResponse newModifySubscriptionResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionResponse(), newModifySubscriptionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredItemCreateRequest getMonitoredItemCreateRequest() {
		return (MonitoredItemCreateRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoredItemCreateRequest(MonitoredItemCreateRequest newMonitoredItemCreateRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateRequest(), newMonitoredItemCreateRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredItemCreateRequest(MonitoredItemCreateRequest newMonitoredItemCreateRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateRequest(), newMonitoredItemCreateRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredItemCreateResult getMonitoredItemCreateResult() {
		return (MonitoredItemCreateResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoredItemCreateResult(MonitoredItemCreateResult newMonitoredItemCreateResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateResult(), newMonitoredItemCreateResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredItemCreateResult(MonitoredItemCreateResult newMonitoredItemCreateResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateResult(), newMonitoredItemCreateResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredItemModifyRequest getMonitoredItemModifyRequest() {
		return (MonitoredItemModifyRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoredItemModifyRequest(MonitoredItemModifyRequest newMonitoredItemModifyRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyRequest(), newMonitoredItemModifyRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredItemModifyRequest(MonitoredItemModifyRequest newMonitoredItemModifyRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyRequest(), newMonitoredItemModifyRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredItemModifyResult getMonitoredItemModifyResult() {
		return (MonitoredItemModifyResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoredItemModifyResult(MonitoredItemModifyResult newMonitoredItemModifyResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyResult(), newMonitoredItemModifyResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredItemModifyResult(MonitoredItemModifyResult newMonitoredItemModifyResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyResult(), newMonitoredItemModifyResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredItemNotification getMonitoredItemNotification() {
		return (MonitoredItemNotification)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemNotification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoredItemNotification(MonitoredItemNotification newMonitoredItemNotification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemNotification(), newMonitoredItemNotification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredItemNotification(MonitoredItemNotification newMonitoredItemNotification) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemNotification(), newMonitoredItemNotification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringFilter getMonitoringFilter() {
		return (MonitoringFilter)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoringFilter(MonitoringFilter newMonitoringFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(), newMonitoringFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringFilter(MonitoringFilter newMonitoringFilter) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(), newMonitoringFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringFilterResult getMonitoringFilterResult() {
		return (MonitoringFilterResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoringFilterResult(MonitoringFilterResult newMonitoringFilterResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult(), newMonitoringFilterResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringFilterResult(MonitoringFilterResult newMonitoringFilterResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult(), newMonitoringFilterResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringMode getMonitoringMode() {
		return (MonitoringMode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringMode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringMode(MonitoringMode newMonitoringMode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringMode(), newMonitoringMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringParameters getMonitoringParameters() {
		return (MonitoringParameters)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringParameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoringParameters(MonitoringParameters newMonitoringParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringParameters(), newMonitoringParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringParameters(MonitoringParameters newMonitoringParameters) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringParameters(), newMonitoringParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkAddressDataType getNetworkAddressDataType() {
		return (NetworkAddressDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkAddressDataType(NetworkAddressDataType newNetworkAddressDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressDataType(), newNetworkAddressDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkAddressDataType(NetworkAddressDataType newNetworkAddressDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressDataType(), newNetworkAddressDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkAddressUrlDataType getNetworkAddressUrlDataType() {
		return (NetworkAddressUrlDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressUrlDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkAddressUrlDataType(NetworkAddressUrlDataType newNetworkAddressUrlDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressUrlDataType(), newNetworkAddressUrlDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkAddressUrlDataType(NetworkAddressUrlDataType newNetworkAddressUrlDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressUrlDataType(), newNetworkAddressUrlDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkGroupDataType getNetworkGroupDataType() {
		return (NetworkGroupDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NetworkGroupDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkGroupDataType(NetworkGroupDataType newNetworkGroupDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_NetworkGroupDataType(), newNetworkGroupDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkGroupDataType(NetworkGroupDataType newNetworkGroupDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NetworkGroupDataType(), newNetworkGroupDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		return (Node)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Node(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_Node(), newNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Node(), newNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAttributes getNodeAttributes() {
		return (NodeAttributes)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeAttributes(NodeAttributes newNodeAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(), newNodeAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeAttributes(NodeAttributes newNodeAttributes) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(), newNodeAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAttributesMask getNodeAttributesMask() {
		return (NodeAttributesMask)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributesMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeAttributesMask(NodeAttributesMask newNodeAttributesMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributesMask(), newNodeAttributesMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeClass getNodeClass() {
		return (NodeClass)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NodeClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeClass(NodeClass newNodeClass) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NodeClass(), newNodeClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getNodeId() {
		return (NodeId)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NodeId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeId(NodeId newNodeId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_NodeId(), newNodeId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(NodeId newNodeId) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NodeId(), newNodeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeReference getNodeReference() {
		return (NodeReference)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NodeReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeReference(NodeReference newNodeReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_NodeReference(), newNodeReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeReference(NodeReference newNodeReference) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NodeReference(), newNodeReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeDescription getNodeTypeDescription() {
		return (NodeTypeDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NodeTypeDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeTypeDescription(NodeTypeDescription newNodeTypeDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_NodeTypeDescription(), newNodeTypeDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeTypeDescription(NodeTypeDescription newNodeTypeDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NodeTypeDescription(), newNodeTypeDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNormalizedString() {
		return (String)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NormalizedString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalizedString(String newNormalizedString) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NormalizedString(), newNormalizedString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationData getNotificationData() {
		return (NotificationData)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationData(NotificationData newNotificationData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(), newNotificationData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationData(NotificationData newNotificationData) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(), newNotificationData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationMessage getNotificationMessage() {
		return (NotificationMessage)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NotificationMessage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationMessage(NotificationMessage newNotificationMessage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_NotificationMessage(), newNotificationMessage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationMessage(NotificationMessage newNotificationMessage) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NotificationMessage(), newNotificationMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumericRange() {
		return (String)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_NumericRange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumericRange(String newNumericRange) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_NumericRange(), newNumericRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAttributes getObjectAttributes() {
		return (ObjectAttributes)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ObjectAttributes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectAttributes(ObjectAttributes newObjectAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ObjectAttributes(), newObjectAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectAttributes(ObjectAttributes newObjectAttributes) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ObjectAttributes(), newObjectAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode getObjectNode() {
		return (ObjectNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ObjectNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectNode(ObjectNode newObjectNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ObjectNode(), newObjectNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectNode(ObjectNode newObjectNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ObjectNode(), newObjectNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeAttributes getObjectTypeAttributes() {
		return (ObjectTypeAttributes)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeAttributes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectTypeAttributes(ObjectTypeAttributes newObjectTypeAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeAttributes(), newObjectTypeAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectTypeAttributes(ObjectTypeAttributes newObjectTypeAttributes) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeAttributes(), newObjectTypeAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeNode getObjectTypeNode() {
		return (ObjectTypeNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectTypeNode(ObjectTypeNode newObjectTypeNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeNode(), newObjectTypeNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectTypeNode(ObjectTypeNode newObjectTypeNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeNode(), newObjectTypeNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenFileMode getOpenFileMode() {
		return (OpenFileMode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_OpenFileMode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenFileMode(OpenFileMode newOpenFileMode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_OpenFileMode(), newOpenFileMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenSecureChannelRequest getOpenSecureChannelRequest() {
		return (OpenSecureChannelRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenSecureChannelRequest(OpenSecureChannelRequest newOpenSecureChannelRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelRequest(), newOpenSecureChannelRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenSecureChannelRequest(OpenSecureChannelRequest newOpenSecureChannelRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelRequest(), newOpenSecureChannelRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenSecureChannelResponse getOpenSecureChannelResponse() {
		return (OpenSecureChannelResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenSecureChannelResponse(OpenSecureChannelResponse newOpenSecureChannelResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelResponse(), newOpenSecureChannelResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenSecureChannelResponse(OpenSecureChannelResponse newOpenSecureChannelResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelResponse(), newOpenSecureChannelResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionSet getOptionSet() {
		return (OptionSet)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_OptionSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionSet(OptionSet newOptionSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_OptionSet(), newOptionSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionSet(OptionSet newOptionSet) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_OptionSet(), newOptionSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getOrientation() {
		return (Orientation)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Orientation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(Orientation newOrientation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_Orientation(), newOrientation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Orientation newOrientation) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Orientation(), newOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverrideValueHandling getOverrideValueHandling() {
		return (OverrideValueHandling)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_OverrideValueHandling(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrideValueHandling(OverrideValueHandling newOverrideValueHandling) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_OverrideValueHandling(), newOverrideValueHandling);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingResult getParsingResult() {
		return (ParsingResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ParsingResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParsingResult(ParsingResult newParsingResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ParsingResult(), newParsingResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParsingResult(ParsingResult newParsingResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ParsingResult(), newParsingResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformUpdateType getPerformUpdateType() {
		return (PerformUpdateType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PerformUpdateType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformUpdateType(PerformUpdateType newPerformUpdateType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PerformUpdateType(), newPerformUpdateType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPermissionType() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PermissionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermissionType(long newPermissionType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PermissionType(), newPermissionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDiagnostic2DataType getProgramDiagnostic2DataType() {
		return (ProgramDiagnostic2DataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnostic2DataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramDiagnostic2DataType(ProgramDiagnostic2DataType newProgramDiagnostic2DataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnostic2DataType(), newProgramDiagnostic2DataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramDiagnostic2DataType(ProgramDiagnostic2DataType newProgramDiagnostic2DataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnostic2DataType(), newProgramDiagnostic2DataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDiagnosticDataType getProgramDiagnosticDataType() {
		return (ProgramDiagnosticDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnosticDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramDiagnosticDataType(ProgramDiagnosticDataType newProgramDiagnosticDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnosticDataType(), newProgramDiagnosticDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramDiagnosticDataType(ProgramDiagnosticDataType newProgramDiagnosticDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnosticDataType(), newProgramDiagnosticDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedDataItemsDataType getPublishedDataItemsDataType() {
		return (PublishedDataItemsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataItemsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishedDataItemsDataType(PublishedDataItemsDataType newPublishedDataItemsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataItemsDataType(), newPublishedDataItemsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedDataItemsDataType(PublishedDataItemsDataType newPublishedDataItemsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataItemsDataType(), newPublishedDataItemsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedDataSetDataType getPublishedDataSetDataType() {
		return (PublishedDataSetDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishedDataSetDataType(PublishedDataSetDataType newPublishedDataSetDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetDataType(), newPublishedDataSetDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedDataSetDataType(PublishedDataSetDataType newPublishedDataSetDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetDataType(), newPublishedDataSetDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedDataSetSourceDataType getPublishedDataSetSourceDataType() {
		return (PublishedDataSetSourceDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishedDataSetSourceDataType(PublishedDataSetSourceDataType newPublishedDataSetSourceDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType(), newPublishedDataSetSourceDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedDataSetSourceDataType(PublishedDataSetSourceDataType newPublishedDataSetSourceDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType(), newPublishedDataSetSourceDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedEventsDataType getPublishedEventsDataType() {
		return (PublishedEventsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PublishedEventsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishedEventsDataType(PublishedEventsDataType newPublishedEventsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_PublishedEventsDataType(), newPublishedEventsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedEventsDataType(PublishedEventsDataType newPublishedEventsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PublishedEventsDataType(), newPublishedEventsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedVariableDataType getPublishedVariableDataType() {
		return (PublishedVariableDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PublishedVariableDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishedVariableDataType(PublishedVariableDataType newPublishedVariableDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_PublishedVariableDataType(), newPublishedVariableDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedVariableDataType(PublishedVariableDataType newPublishedVariableDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PublishedVariableDataType(), newPublishedVariableDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishRequest getPublishRequest() {
		return (PublishRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PublishRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishRequest(PublishRequest newPublishRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_PublishRequest(), newPublishRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishRequest(PublishRequest newPublishRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PublishRequest(), newPublishRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishResponse getPublishResponse() {
		return (PublishResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PublishResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishResponse(PublishResponse newPublishResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_PublishResponse(), newPublishResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishResponse(PublishResponse newPublishResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PublishResponse(), newPublishResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubConfigurationDataType getPubSubConfigurationDataType() {
		return (PubSubConfigurationDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConfigurationDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubSubConfigurationDataType(PubSubConfigurationDataType newPubSubConfigurationDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConfigurationDataType(), newPubSubConfigurationDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubSubConfigurationDataType(PubSubConfigurationDataType newPubSubConfigurationDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConfigurationDataType(), newPubSubConfigurationDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubConnectionDataType getPubSubConnectionDataType() {
		return (PubSubConnectionDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConnectionDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubSubConnectionDataType(PubSubConnectionDataType newPubSubConnectionDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConnectionDataType(), newPubSubConnectionDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubSubConnectionDataType(PubSubConnectionDataType newPubSubConnectionDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConnectionDataType(), newPubSubConnectionDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubDiagnosticsCounterClassification getPubSubDiagnosticsCounterClassification() {
		return (PubSubDiagnosticsCounterClassification)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PubSubDiagnosticsCounterClassification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubSubDiagnosticsCounterClassification(PubSubDiagnosticsCounterClassification newPubSubDiagnosticsCounterClassification) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PubSubDiagnosticsCounterClassification(), newPubSubDiagnosticsCounterClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubGroupDataType getPubSubGroupDataType() {
		return (PubSubGroupDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubSubGroupDataType(PubSubGroupDataType newPubSubGroupDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType(), newPubSubGroupDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubSubGroupDataType(PubSubGroupDataType newPubSubGroupDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType(), newPubSubGroupDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubState getPubSubState() {
		return (PubSubState)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_PubSubState(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubSubState(PubSubState newPubSubState) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_PubSubState(), newPubSubState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName getQualifiedName() {
		return (QualifiedName)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_QualifiedName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifiedName(QualifiedName newQualifiedName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_QualifiedName(), newQualifiedName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(QualifiedName newQualifiedName) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_QualifiedName(), newQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDataDescription getQueryDataDescription() {
		return (QueryDataDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryDataDescription(QueryDataDescription newQueryDataDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataDescription(), newQueryDataDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryDataDescription(QueryDataDescription newQueryDataDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataDescription(), newQueryDataDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDataSet getQueryDataSet() {
		return (QueryDataSet)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryDataSet(QueryDataSet newQueryDataSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataSet(), newQueryDataSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryDataSet(QueryDataSet newQueryDataSet) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataSet(), newQueryDataSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFirstRequest getQueryFirstRequest() {
		return (QueryFirstRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryFirstRequest(QueryFirstRequest newQueryFirstRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstRequest(), newQueryFirstRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryFirstRequest(QueryFirstRequest newQueryFirstRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstRequest(), newQueryFirstRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFirstResponse getQueryFirstResponse() {
		return (QueryFirstResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryFirstResponse(QueryFirstResponse newQueryFirstResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstResponse(), newQueryFirstResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryFirstResponse(QueryFirstResponse newQueryFirstResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstResponse(), newQueryFirstResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNextRequest getQueryNextRequest() {
		return (QueryNextRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryNextRequest(QueryNextRequest newQueryNextRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextRequest(), newQueryNextRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryNextRequest(QueryNextRequest newQueryNextRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextRequest(), newQueryNextRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNextResponse getQueryNextResponse() {
		return (QueryNextResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryNextResponse(QueryNextResponse newQueryNextResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextResponse(), newQueryNextResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryNextResponse(QueryNextResponse newQueryNextResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextResponse(), newQueryNextResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRange() {
		return (Range)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Range(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_Range(), newRange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Range newRange) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Range(), newRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalNumber getRationalNumber() {
		return (RationalNumber)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RationalNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationalNumber(RationalNumber newRationalNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RationalNumber(), newRationalNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationalNumber(RationalNumber newRationalNumber) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RationalNumber(), newRationalNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadAnnotationDataDetails getReadAnnotationDataDetails() {
		return (ReadAnnotationDataDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReadAnnotationDataDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadAnnotationDataDetails(ReadAnnotationDataDetails newReadAnnotationDataDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReadAnnotationDataDetails(), newReadAnnotationDataDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadAnnotationDataDetails(ReadAnnotationDataDetails newReadAnnotationDataDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReadAnnotationDataDetails(), newReadAnnotationDataDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadAtTimeDetails getReadAtTimeDetails() {
		return (ReadAtTimeDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReadAtTimeDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadAtTimeDetails(ReadAtTimeDetails newReadAtTimeDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReadAtTimeDetails(), newReadAtTimeDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadAtTimeDetails(ReadAtTimeDetails newReadAtTimeDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReadAtTimeDetails(), newReadAtTimeDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReaderGroupDataType getReaderGroupDataType() {
		return (ReaderGroupDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReaderGroupDataType(ReaderGroupDataType newReaderGroupDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupDataType(), newReaderGroupDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReaderGroupDataType(ReaderGroupDataType newReaderGroupDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupDataType(), newReaderGroupDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReaderGroupMessageDataType getReaderGroupMessageDataType() {
		return (ReaderGroupMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReaderGroupMessageDataType(ReaderGroupMessageDataType newReaderGroupMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupMessageDataType(), newReaderGroupMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReaderGroupMessageDataType(ReaderGroupMessageDataType newReaderGroupMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupMessageDataType(), newReaderGroupMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReaderGroupTransportDataType getReaderGroupTransportDataType() {
		return (ReaderGroupTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReaderGroupTransportDataType(ReaderGroupTransportDataType newReaderGroupTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupTransportDataType(), newReaderGroupTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReaderGroupTransportDataType(ReaderGroupTransportDataType newReaderGroupTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupTransportDataType(), newReaderGroupTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadEventDetails getReadEventDetails() {
		return (ReadEventDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReadEventDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadEventDetails(ReadEventDetails newReadEventDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReadEventDetails(), newReadEventDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadEventDetails(ReadEventDetails newReadEventDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReadEventDetails(), newReadEventDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadProcessedDetails getReadProcessedDetails() {
		return (ReadProcessedDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReadProcessedDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadProcessedDetails(ReadProcessedDetails newReadProcessedDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReadProcessedDetails(), newReadProcessedDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadProcessedDetails(ReadProcessedDetails newReadProcessedDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReadProcessedDetails(), newReadProcessedDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadRawModifiedDetails getReadRawModifiedDetails() {
		return (ReadRawModifiedDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReadRawModifiedDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadRawModifiedDetails(ReadRawModifiedDetails newReadRawModifiedDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReadRawModifiedDetails(), newReadRawModifiedDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadRawModifiedDetails(ReadRawModifiedDetails newReadRawModifiedDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReadRawModifiedDetails(), newReadRawModifiedDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadRequest getReadRequest() {
		return (ReadRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReadRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadRequest(ReadRequest newReadRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReadRequest(), newReadRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadRequest(ReadRequest newReadRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReadRequest(), newReadRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadResponse getReadResponse() {
		return (ReadResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReadResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadResponse(ReadResponse newReadResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReadResponse(), newReadResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadResponse(ReadResponse newReadResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReadResponse(), newReadResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadValueId getReadValueId() {
		return (ReadValueId)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReadValueId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadValueId(ReadValueId newReadValueId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReadValueId(), newReadValueId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadValueId(ReadValueId newReadValueId) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReadValueId(), newReadValueId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancySupport getRedundancySupport() {
		return (RedundancySupport)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RedundancySupport(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedundancySupport(RedundancySupport newRedundancySupport) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RedundancySupport(), newRedundancySupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundantServerDataType getRedundantServerDataType() {
		return (RedundantServerDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RedundantServerDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedundantServerDataType(RedundantServerDataType newRedundantServerDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RedundantServerDataType(), newRedundantServerDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedundantServerDataType(RedundantServerDataType newRedundantServerDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RedundantServerDataType(), newRedundantServerDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceDescription getReferenceDescription() {
		return (ReferenceDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceDescription(ReferenceDescription newReferenceDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceDescription(), newReferenceDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDescription(ReferenceDescription newReferenceDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceDescription(), newReferenceDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceNode getReferenceNode() {
		return (ReferenceNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceNode(ReferenceNode newReferenceNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceNode(), newReferenceNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceNode(ReferenceNode newReferenceNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceNode(), newReferenceNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTypeAttributes getReferenceTypeAttributes() {
		return (ReferenceTypeAttributes)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeAttributes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceTypeAttributes(ReferenceTypeAttributes newReferenceTypeAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeAttributes(), newReferenceTypeAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceTypeAttributes(ReferenceTypeAttributes newReferenceTypeAttributes) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeAttributes(), newReferenceTypeAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTypeNode getReferenceTypeNode() {
		return (ReferenceTypeNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceTypeNode(ReferenceTypeNode newReferenceTypeNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeNode(), newReferenceTypeNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceTypeNode(ReferenceTypeNode newReferenceTypeNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeNode(), newReferenceTypeNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredServer getRegisteredServer() {
		return (RegisteredServer)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RegisteredServer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisteredServer(RegisteredServer newRegisteredServer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RegisteredServer(), newRegisteredServer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredServer(RegisteredServer newRegisteredServer) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RegisteredServer(), newRegisteredServer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterNodesRequest getRegisterNodesRequest() {
		return (RegisterNodesRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterNodesRequest(RegisterNodesRequest newRegisterNodesRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesRequest(), newRegisterNodesRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterNodesRequest(RegisterNodesRequest newRegisterNodesRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesRequest(), newRegisterNodesRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterNodesResponse getRegisterNodesResponse() {
		return (RegisterNodesResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterNodesResponse(RegisterNodesResponse newRegisterNodesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesResponse(), newRegisterNodesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterNodesResponse(RegisterNodesResponse newRegisterNodesResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesResponse(), newRegisterNodesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterServer2Request getRegisterServer2Request() {
		return (RegisterServer2Request)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Request(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterServer2Request(RegisterServer2Request newRegisterServer2Request, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Request(), newRegisterServer2Request, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterServer2Request(RegisterServer2Request newRegisterServer2Request) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Request(), newRegisterServer2Request);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterServer2Response getRegisterServer2Response() {
		return (RegisterServer2Response)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Response(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterServer2Response(RegisterServer2Response newRegisterServer2Response, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Response(), newRegisterServer2Response, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterServer2Response(RegisterServer2Response newRegisterServer2Response) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Response(), newRegisterServer2Response);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterServerRequest getRegisterServerRequest() {
		return (RegisterServerRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterServerRequest(RegisterServerRequest newRegisterServerRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerRequest(), newRegisterServerRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterServerRequest(RegisterServerRequest newRegisterServerRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerRequest(), newRegisterServerRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterServerResponse getRegisterServerResponse() {
		return (RegisterServerResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterServerResponse(RegisterServerResponse newRegisterServerResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerResponse(), newRegisterServerResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterServerResponse(RegisterServerResponse newRegisterServerResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerResponse(), newRegisterServerResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePath getRelativePath() {
		return (RelativePath)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RelativePath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativePath(RelativePath newRelativePath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RelativePath(), newRelativePath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePath(RelativePath newRelativePath) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RelativePath(), newRelativePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePathElement getRelativePathElement() {
		return (RelativePathElement)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RelativePathElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativePathElement(RelativePathElement newRelativePathElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RelativePathElement(), newRelativePathElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePathElement(RelativePathElement newRelativePathElement) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RelativePathElement(), newRelativePathElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepublishRequest getRepublishRequest() {
		return (RepublishRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RepublishRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepublishRequest(RepublishRequest newRepublishRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RepublishRequest(), newRepublishRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepublishRequest(RepublishRequest newRepublishRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RepublishRequest(), newRepublishRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepublishResponse getRepublishResponse() {
		return (RepublishResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RepublishResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepublishResponse(RepublishResponse newRepublishResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RepublishResponse(), newRepublishResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepublishResponse(RepublishResponse newRepublishResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RepublishResponse(), newRepublishResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestHeader getRequestHeader() {
		return (RequestHeader)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RequestHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestHeader(RequestHeader newRequestHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RequestHeader(), newRequestHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestHeader(RequestHeader newRequestHeader) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RequestHeader(), newRequestHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseHeader getResponseHeader() {
		return (ResponseHeader)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ResponseHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseHeader(ResponseHeader newResponseHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ResponseHeader(), newResponseHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseHeader(ResponseHeader newResponseHeader) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ResponseHeader(), newResponseHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePermissionType getRolePermissionType() {
		return (RolePermissionType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RolePermissionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolePermissionType(RolePermissionType newRolePermissionType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RolePermissionType(), newRolePermissionType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolePermissionType(RolePermissionType newRolePermissionType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RolePermissionType(), newRolePermissionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getRsaEncryptedSecret() {
		return (Variant)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_RsaEncryptedSecret(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRsaEncryptedSecret(Variant newRsaEncryptedSecret, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_RsaEncryptedSecret(), newRsaEncryptedSecret, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRsaEncryptedSecret(Variant newRsaEncryptedSecret) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_RsaEncryptedSecret(), newRsaEncryptedSecret);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingIntervalDiagnosticsDataType getSamplingIntervalDiagnosticsDataType() {
		return (SamplingIntervalDiagnosticsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SamplingIntervalDiagnosticsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSamplingIntervalDiagnosticsDataType(SamplingIntervalDiagnosticsDataType newSamplingIntervalDiagnosticsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SamplingIntervalDiagnosticsDataType(), newSamplingIntervalDiagnosticsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingIntervalDiagnosticsDataType(SamplingIntervalDiagnosticsDataType newSamplingIntervalDiagnosticsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SamplingIntervalDiagnosticsDataType(), newSamplingIntervalDiagnosticsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte getSByte() {
		return (Byte)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SByte(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSByte(Byte newSByte) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SByte(), newSByte);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTokenRequestType getSecurityTokenRequestType() {
		return (SecurityTokenRequestType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SecurityTokenRequestType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityTokenRequestType(SecurityTokenRequestType newSecurityTokenRequestType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SecurityTokenRequestType(), newSecurityTokenRequestType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticChangeStructureDataType getSemanticChangeStructureDataType() {
		return (SemanticChangeStructureDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SemanticChangeStructureDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemanticChangeStructureDataType(SemanticChangeStructureDataType newSemanticChangeStructureDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SemanticChangeStructureDataType(), newSemanticChangeStructureDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticChangeStructureDataType(SemanticChangeStructureDataType newSemanticChangeStructureDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SemanticChangeStructureDataType(), newSemanticChangeStructureDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerDiagnosticsSummaryDataType getServerDiagnosticsSummaryDataType() {
		return (ServerDiagnosticsSummaryDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ServerDiagnosticsSummaryDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerDiagnosticsSummaryDataType(ServerDiagnosticsSummaryDataType newServerDiagnosticsSummaryDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ServerDiagnosticsSummaryDataType(), newServerDiagnosticsSummaryDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerDiagnosticsSummaryDataType(ServerDiagnosticsSummaryDataType newServerDiagnosticsSummaryDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ServerDiagnosticsSummaryDataType(), newServerDiagnosticsSummaryDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerOnNetwork getServerOnNetwork() {
		return (ServerOnNetwork)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ServerOnNetwork(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerOnNetwork(ServerOnNetwork newServerOnNetwork, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ServerOnNetwork(), newServerOnNetwork, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerOnNetwork(ServerOnNetwork newServerOnNetwork) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ServerOnNetwork(), newServerOnNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerState getServerState() {
		return (ServerState)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ServerState(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerState(ServerState newServerState) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ServerState(), newServerState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerStatusDataType getServerStatusDataType() {
		return (ServerStatusDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ServerStatusDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerStatusDataType(ServerStatusDataType newServerStatusDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ServerStatusDataType(), newServerStatusDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerStatusDataType(ServerStatusDataType newServerStatusDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ServerStatusDataType(), newServerStatusDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getServiceCounterDataType() {
		return (ServiceCounterDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ServiceCounterDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCounterDataType(ServiceCounterDataType newServiceCounterDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ServiceCounterDataType(), newServiceCounterDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCounterDataType(ServiceCounterDataType newServiceCounterDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ServiceCounterDataType(), newServiceCounterDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFault getServiceFault() {
		return (ServiceFault)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ServiceFault(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceFault(ServiceFault newServiceFault, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ServiceFault(), newServiceFault, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceFault(ServiceFault newServiceFault) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ServiceFault(), newServiceFault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getSessionAuthenticationToken() {
		return (NodeId)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SessionAuthenticationToken(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionAuthenticationToken(NodeId newSessionAuthenticationToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SessionAuthenticationToken(), newSessionAuthenticationToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionAuthenticationToken(NodeId newSessionAuthenticationToken) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SessionAuthenticationToken(), newSessionAuthenticationToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionDiagnosticsDataType getSessionDiagnosticsDataType() {
		return (SessionDiagnosticsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SessionDiagnosticsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionDiagnosticsDataType(SessionDiagnosticsDataType newSessionDiagnosticsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SessionDiagnosticsDataType(), newSessionDiagnosticsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionDiagnosticsDataType(SessionDiagnosticsDataType newSessionDiagnosticsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SessionDiagnosticsDataType(), newSessionDiagnosticsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionlessInvokeRequestType getSessionlessInvokeRequestType() {
		return (SessionlessInvokeRequestType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeRequestType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionlessInvokeRequestType(SessionlessInvokeRequestType newSessionlessInvokeRequestType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeRequestType(), newSessionlessInvokeRequestType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionlessInvokeRequestType(SessionlessInvokeRequestType newSessionlessInvokeRequestType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeRequestType(), newSessionlessInvokeRequestType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionlessInvokeResponseType getSessionlessInvokeResponseType() {
		return (SessionlessInvokeResponseType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeResponseType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionlessInvokeResponseType(SessionlessInvokeResponseType newSessionlessInvokeResponseType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeResponseType(), newSessionlessInvokeResponseType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionlessInvokeResponseType(SessionlessInvokeResponseType newSessionlessInvokeResponseType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeResponseType(), newSessionlessInvokeResponseType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionSecurityDiagnosticsDataType getSessionSecurityDiagnosticsDataType() {
		return (SessionSecurityDiagnosticsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SessionSecurityDiagnosticsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionSecurityDiagnosticsDataType(SessionSecurityDiagnosticsDataType newSessionSecurityDiagnosticsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SessionSecurityDiagnosticsDataType(), newSessionSecurityDiagnosticsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionSecurityDiagnosticsDataType(SessionSecurityDiagnosticsDataType newSessionSecurityDiagnosticsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SessionSecurityDiagnosticsDataType(), newSessionSecurityDiagnosticsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetMonitoringModeRequest getSetMonitoringModeRequest() {
		return (SetMonitoringModeRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetMonitoringModeRequest(SetMonitoringModeRequest newSetMonitoringModeRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeRequest(), newSetMonitoringModeRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetMonitoringModeRequest(SetMonitoringModeRequest newSetMonitoringModeRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeRequest(), newSetMonitoringModeRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetMonitoringModeResponse getSetMonitoringModeResponse() {
		return (SetMonitoringModeResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetMonitoringModeResponse(SetMonitoringModeResponse newSetMonitoringModeResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeResponse(), newSetMonitoringModeResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetMonitoringModeResponse(SetMonitoringModeResponse newSetMonitoringModeResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeResponse(), newSetMonitoringModeResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPublishingModeRequest getSetPublishingModeRequest() {
		return (SetPublishingModeRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetPublishingModeRequest(SetPublishingModeRequest newSetPublishingModeRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeRequest(), newSetPublishingModeRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetPublishingModeRequest(SetPublishingModeRequest newSetPublishingModeRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeRequest(), newSetPublishingModeRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPublishingModeResponse getSetPublishingModeResponse() {
		return (SetPublishingModeResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetPublishingModeResponse(SetPublishingModeResponse newSetPublishingModeResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeResponse(), newSetPublishingModeResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetPublishingModeResponse(SetPublishingModeResponse newSetPublishingModeResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeResponse(), newSetPublishingModeResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTriggeringRequest getSetTriggeringRequest() {
		return (SetTriggeringRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetTriggeringRequest(SetTriggeringRequest newSetTriggeringRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringRequest(), newSetTriggeringRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetTriggeringRequest(SetTriggeringRequest newSetTriggeringRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringRequest(), newSetTriggeringRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTriggeringResponse getSetTriggeringResponse() {
		return (SetTriggeringResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetTriggeringResponse(SetTriggeringResponse newSetTriggeringResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringResponse(), newSetTriggeringResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetTriggeringResponse(SetTriggeringResponse newSetTriggeringResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringResponse(), newSetTriggeringResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureData getSignatureData() {
		return (SignatureData)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SignatureData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureData(SignatureData newSignatureData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SignatureData(), newSignatureData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureData(SignatureData newSignatureData) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SignatureData(), newSignatureData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedSoftwareCertificate getSignedSoftwareCertificate() {
		return (SignedSoftwareCertificate)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SignedSoftwareCertificate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignedSoftwareCertificate(SignedSoftwareCertificate newSignedSoftwareCertificate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SignedSoftwareCertificate(), newSignedSoftwareCertificate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedSoftwareCertificate(SignedSoftwareCertificate newSignedSoftwareCertificate) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SignedSoftwareCertificate(), newSignedSoftwareCertificate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttributeOperand getSimpleAttributeOperand() {
		return (SimpleAttributeOperand)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SimpleAttributeOperand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleAttributeOperand(SimpleAttributeOperand newSimpleAttributeOperand, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SimpleAttributeOperand(), newSimpleAttributeOperand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleAttributeOperand(SimpleAttributeOperand newSimpleAttributeOperand) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SimpleAttributeOperand(), newSimpleAttributeOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeDescription getSimpleTypeDescription() {
		return (SimpleTypeDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SimpleTypeDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleTypeDescription(SimpleTypeDescription newSimpleTypeDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SimpleTypeDescription(), newSimpleTypeDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleTypeDescription(SimpleTypeDescription newSimpleTypeDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SimpleTypeDescription(), newSimpleTypeDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusChangeNotification getStatusChangeNotification() {
		return (StatusChangeNotification)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_StatusChangeNotification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusChangeNotification(StatusChangeNotification newStatusChangeNotification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_StatusChangeNotification(), newStatusChangeNotification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusChangeNotification(StatusChangeNotification newStatusChangeNotification) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_StatusChangeNotification(), newStatusChangeNotification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode getStatusCode() {
		return (StatusCode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_StatusCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusCode(StatusCode newStatusCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_StatusCode(), newStatusCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusCode(StatusCode newStatusCode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_StatusCode(), newStatusCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusResult getStatusResult() {
		return (StatusResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_StatusResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusResult(StatusResult newStatusResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_StatusResult(), newStatusResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusResult(StatusResult newStatusResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_StatusResult(), newStatusResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString() {
		return (String)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_String(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(String newString) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_String(), newString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getStructureDefinition() {
		return (StructureDefinition)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_StructureDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureDefinition(StructureDefinition newStructureDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_StructureDefinition(), newStructureDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureDefinition(StructureDefinition newStructureDefinition) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_StructureDefinition(), newStructureDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDescription getStructureDescription() {
		return (StructureDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_StructureDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureDescription(StructureDescription newStructureDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_StructureDescription(), newStructureDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureDescription(StructureDescription newStructureDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_StructureDescription(), newStructureDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureField getStructureField() {
		return (StructureField)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_StructureField(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureField(StructureField newStructureField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_StructureField(), newStructureField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureField(StructureField newStructureField) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_StructureField(), newStructureField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureType getStructureType() {
		return (StructureType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_StructureType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureType(StructureType newStructureType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_StructureType(), newStructureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribedDataSetDataType getSubscribedDataSetDataType() {
		return (SubscribedDataSetDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribedDataSetDataType(SubscribedDataSetDataType newSubscribedDataSetDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType(), newSubscribedDataSetDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribedDataSetDataType(SubscribedDataSetDataType newSubscribedDataSetDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType(), newSubscribedDataSetDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribedDataSetMirrorDataType getSubscribedDataSetMirrorDataType() {
		return (SubscribedDataSetMirrorDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetMirrorDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribedDataSetMirrorDataType(SubscribedDataSetMirrorDataType newSubscribedDataSetMirrorDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetMirrorDataType(), newSubscribedDataSetMirrorDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribedDataSetMirrorDataType(SubscribedDataSetMirrorDataType newSubscribedDataSetMirrorDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetMirrorDataType(), newSubscribedDataSetMirrorDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionAcknowledgement getSubscriptionAcknowledgement() {
		return (SubscriptionAcknowledgement)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionAcknowledgement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionAcknowledgement(SubscriptionAcknowledgement newSubscriptionAcknowledgement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionAcknowledgement(), newSubscriptionAcknowledgement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionAcknowledgement(SubscriptionAcknowledgement newSubscriptionAcknowledgement) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionAcknowledgement(), newSubscriptionAcknowledgement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionDiagnosticsDataType getSubscriptionDiagnosticsDataType() {
		return (SubscriptionDiagnosticsDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionDiagnosticsDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionDiagnosticsDataType(SubscriptionDiagnosticsDataType newSubscriptionDiagnosticsDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionDiagnosticsDataType(), newSubscriptionDiagnosticsDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionDiagnosticsDataType(SubscriptionDiagnosticsDataType newSubscriptionDiagnosticsDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionDiagnosticsDataType(), newSubscriptionDiagnosticsDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetVariablesDataType getTargetVariablesDataType() {
		return (TargetVariablesDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TargetVariablesDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetVariablesDataType(TargetVariablesDataType newTargetVariablesDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_TargetVariablesDataType(), newTargetVariablesDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVariablesDataType(TargetVariablesDataType newTargetVariablesDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TargetVariablesDataType(), newTargetVariablesDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDCartesianCoordinates getThreeDCartesianCoordinates() {
		return (ThreeDCartesianCoordinates)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDCartesianCoordinates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreeDCartesianCoordinates(ThreeDCartesianCoordinates newThreeDCartesianCoordinates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDCartesianCoordinates(), newThreeDCartesianCoordinates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreeDCartesianCoordinates(ThreeDCartesianCoordinates newThreeDCartesianCoordinates) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDCartesianCoordinates(), newThreeDCartesianCoordinates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDFrame getThreeDFrame() {
		return (ThreeDFrame)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreeDFrame(ThreeDFrame newThreeDFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDFrame(), newThreeDFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreeDFrame(ThreeDFrame newThreeDFrame) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDFrame(), newThreeDFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDOrientation getThreeDOrientation() {
		return (ThreeDOrientation)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDOrientation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreeDOrientation(ThreeDOrientation newThreeDOrientation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDOrientation(), newThreeDOrientation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreeDOrientation(ThreeDOrientation newThreeDOrientation) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDOrientation(), newThreeDOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDVector getThreeDVector() {
		return (ThreeDVector)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDVector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreeDVector(ThreeDVector newThreeDVector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDVector(), newThreeDVector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreeDVector(ThreeDVector newThreeDVector) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDVector(), newThreeDVector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return (String)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Time(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Time(), newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampsToReturn getTimestampsToReturn() {
		return (TimestampsToReturn)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TimestampsToReturn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestampsToReturn(TimestampsToReturn newTimestampsToReturn) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TimestampsToReturn(), newTimestampsToReturn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeString() {
		return (String)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TimeString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeString(String newTimeString) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TimeString(), newTimeString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeZoneDataType getTimeZoneDataType() {
		return (TimeZoneDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TimeZoneDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeZoneDataType(TimeZoneDataType newTimeZoneDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_TimeZoneDataType(), newTimeZoneDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeZoneDataType(TimeZoneDataType newTimeZoneDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TimeZoneDataType(), newTimeZoneDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferResult getTransferResult() {
		return (TransferResult)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TransferResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferResult(TransferResult newTransferResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_TransferResult(), newTransferResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferResult(TransferResult newTransferResult) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TransferResult(), newTransferResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferSubscriptionsRequest getTransferSubscriptionsRequest() {
		return (TransferSubscriptionsRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferSubscriptionsRequest(TransferSubscriptionsRequest newTransferSubscriptionsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsRequest(), newTransferSubscriptionsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferSubscriptionsRequest(TransferSubscriptionsRequest newTransferSubscriptionsRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsRequest(), newTransferSubscriptionsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferSubscriptionsResponse getTransferSubscriptionsResponse() {
		return (TransferSubscriptionsResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferSubscriptionsResponse(TransferSubscriptionsResponse newTransferSubscriptionsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsResponse(), newTransferSubscriptionsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferSubscriptionsResponse(TransferSubscriptionsResponse newTransferSubscriptionsResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsResponse(), newTransferSubscriptionsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateBrowsePathsToNodeIdsRequest getTranslateBrowsePathsToNodeIdsRequest() {
		return (TranslateBrowsePathsToNodeIdsRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslateBrowsePathsToNodeIdsRequest(TranslateBrowsePathsToNodeIdsRequest newTranslateBrowsePathsToNodeIdsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsRequest(), newTranslateBrowsePathsToNodeIdsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslateBrowsePathsToNodeIdsRequest(TranslateBrowsePathsToNodeIdsRequest newTranslateBrowsePathsToNodeIdsRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsRequest(), newTranslateBrowsePathsToNodeIdsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateBrowsePathsToNodeIdsResponse getTranslateBrowsePathsToNodeIdsResponse() {
		return (TranslateBrowsePathsToNodeIdsResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslateBrowsePathsToNodeIdsResponse(TranslateBrowsePathsToNodeIdsResponse newTranslateBrowsePathsToNodeIdsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsResponse(), newTranslateBrowsePathsToNodeIdsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslateBrowsePathsToNodeIdsResponse(TranslateBrowsePathsToNodeIdsResponse newTranslateBrowsePathsToNodeIdsResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsResponse(), newTranslateBrowsePathsToNodeIdsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustListDataType getTrustListDataType() {
		return (TrustListDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TrustListDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrustListDataType(TrustListDataType newTrustListDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_TrustListDataType(), newTrustListDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustListDataType(TrustListDataType newTrustListDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TrustListDataType(), newTrustListDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustListMasks getTrustListMasks() {
		return (TrustListMasks)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TrustListMasks(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustListMasks(TrustListMasks newTrustListMasks) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TrustListMasks(), newTrustListMasks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNode getTypeNode() {
		return (TypeNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeNode(TypeNode newTypeNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(), newTypeNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeNode(TypeNode newTypeNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(), newTypeNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UABinaryFileDataType getUABinaryFileDataType() {
		return (UABinaryFileDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UABinaryFileDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUABinaryFileDataType(UABinaryFileDataType newUABinaryFileDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UABinaryFileDataType(), newUABinaryFileDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUABinaryFileDataType(UABinaryFileDataType newUABinaryFileDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UABinaryFileDataType(), newUABinaryFileDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUadpDataSetMessageContentMask() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetMessageContentMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUadpDataSetMessageContentMask(long newUadpDataSetMessageContentMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetMessageContentMask(), newUadpDataSetMessageContentMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UadpDataSetReaderMessageDataType getUadpDataSetReaderMessageDataType() {
		return (UadpDataSetReaderMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetReaderMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUadpDataSetReaderMessageDataType(UadpDataSetReaderMessageDataType newUadpDataSetReaderMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetReaderMessageDataType(), newUadpDataSetReaderMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUadpDataSetReaderMessageDataType(UadpDataSetReaderMessageDataType newUadpDataSetReaderMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetReaderMessageDataType(), newUadpDataSetReaderMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UadpDataSetWriterMessageDataType getUadpDataSetWriterMessageDataType() {
		return (UadpDataSetWriterMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetWriterMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUadpDataSetWriterMessageDataType(UadpDataSetWriterMessageDataType newUadpDataSetWriterMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetWriterMessageDataType(), newUadpDataSetWriterMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUadpDataSetWriterMessageDataType(UadpDataSetWriterMessageDataType newUadpDataSetWriterMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetWriterMessageDataType(), newUadpDataSetWriterMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUadpNetworkMessageContentMask() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UadpNetworkMessageContentMask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUadpNetworkMessageContentMask(long newUadpNetworkMessageContentMask) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UadpNetworkMessageContentMask(), newUadpNetworkMessageContentMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UadpWriterGroupMessageDataType getUadpWriterGroupMessageDataType() {
		return (UadpWriterGroupMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UadpWriterGroupMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUadpWriterGroupMessageDataType(UadpWriterGroupMessageDataType newUadpWriterGroupMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UadpWriterGroupMessageDataType(), newUadpWriterGroupMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUadpWriterGroupMessageDataType(UadpWriterGroupMessageDataType newUadpWriterGroupMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UadpWriterGroupMessageDataType(), newUadpWriterGroupMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUInt16() {
		return (Integer)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UInt16(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUInt16(Integer newUInt16) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UInt16(), newUInt16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getUInt32() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UInt32(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUInt32(Long newUInt32) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UInt32(), newUInt32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUInt64() {
		return (BigInteger)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UInt64(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUInt64(BigInteger newUInt64) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UInt64(), newUInt64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union getUnion() {
		return (Union)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Union(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnion(Union newUnion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_Union(), newUnion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnion(Union newUnion) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Union(), newUnion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnregisterNodesRequest getUnregisterNodesRequest() {
		return (UnregisterNodesRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnregisterNodesRequest(UnregisterNodesRequest newUnregisterNodesRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesRequest(), newUnregisterNodesRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnregisterNodesRequest(UnregisterNodesRequest newUnregisterNodesRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesRequest(), newUnregisterNodesRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnregisterNodesResponse getUnregisterNodesResponse() {
		return (UnregisterNodesResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnregisterNodesResponse(UnregisterNodesResponse newUnregisterNodesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesResponse(), newUnregisterNodesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnregisterNodesResponse(UnregisterNodesResponse newUnregisterNodesResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesResponse(), newUnregisterNodesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateDataDetails getUpdateDataDetails() {
		return (UpdateDataDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UpdateDataDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateDataDetails(UpdateDataDetails newUpdateDataDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UpdateDataDetails(), newUpdateDataDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateDataDetails(UpdateDataDetails newUpdateDataDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UpdateDataDetails(), newUpdateDataDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateEventDetails getUpdateEventDetails() {
		return (UpdateEventDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UpdateEventDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateEventDetails(UpdateEventDetails newUpdateEventDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UpdateEventDetails(), newUpdateEventDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateEventDetails(UpdateEventDetails newUpdateEventDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UpdateEventDetails(), newUpdateEventDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateStructureDataDetails getUpdateStructureDataDetails() {
		return (UpdateStructureDataDetails)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UpdateStructureDataDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateStructureDataDetails(UpdateStructureDataDetails newUpdateStructureDataDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UpdateStructureDataDetails(), newUpdateStructureDataDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateStructureDataDetails(UpdateStructureDataDetails newUpdateStructureDataDetails) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UpdateStructureDataDetails(), newUpdateStructureDataDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIdentityToken getUserIdentityToken() {
		return (UserIdentityToken)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIdentityToken(UserIdentityToken newUserIdentityToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(), newUserIdentityToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIdentityToken(UserIdentityToken newUserIdentityToken) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(), newUserIdentityToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserNameIdentityToken getUserNameIdentityToken() {
		return (UserNameIdentityToken)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UserNameIdentityToken(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserNameIdentityToken(UserNameIdentityToken newUserNameIdentityToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UserNameIdentityToken(), newUserNameIdentityToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserNameIdentityToken(UserNameIdentityToken newUserNameIdentityToken) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UserNameIdentityToken(), newUserNameIdentityToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTokenPolicy getUserTokenPolicy() {
		return (UserTokenPolicy)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UserTokenPolicy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserTokenPolicy(UserTokenPolicy newUserTokenPolicy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_UserTokenPolicy(), newUserTokenPolicy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTokenPolicy(UserTokenPolicy newUserTokenPolicy) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UserTokenPolicy(), newUserTokenPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTokenType getUserTokenType() {
		return (UserTokenType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UserTokenType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTokenType(UserTokenType newUserTokenType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UserTokenType(), newUserTokenType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getUtcTime() {
		return (XMLGregorianCalendar)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_UtcTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtcTime(XMLGregorianCalendar newUtcTime) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_UtcTime(), newUtcTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAttributes getVariableAttributes() {
		return (VariableAttributes)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_VariableAttributes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableAttributes(VariableAttributes newVariableAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_VariableAttributes(), newVariableAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableAttributes(VariableAttributes newVariableAttributes) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_VariableAttributes(), newVariableAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableNode getVariableNode() {
		return (VariableNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_VariableNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableNode(VariableNode newVariableNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_VariableNode(), newVariableNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableNode(VariableNode newVariableNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_VariableNode(), newVariableNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTypeAttributes getVariableTypeAttributes() {
		return (VariableTypeAttributes)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeAttributes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableTypeAttributes(VariableTypeAttributes newVariableTypeAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeAttributes(), newVariableTypeAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableTypeAttributes(VariableTypeAttributes newVariableTypeAttributes) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeAttributes(), newVariableTypeAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTypeNode getVariableTypeNode() {
		return (VariableTypeNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableTypeNode(VariableTypeNode newVariableTypeNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeNode(), newVariableTypeNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableTypeNode(VariableTypeNode newVariableTypeNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeNode(), newVariableTypeNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getVariant() {
		return (Variant)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Variant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariant(Variant newVariant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_Variant(), newVariant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(Variant newVariant) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Variant(), newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector getVector() {
		return (Vector)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_Vector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVector(Vector newVector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_Vector(), newVector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVector(Vector newVector) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_Vector(), newVector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVersionTime() {
		return (Long)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_VersionTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionTime(long newVersionTime) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_VersionTime(), newVersionTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewAttributes getViewAttributes() {
		return (ViewAttributes)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ViewAttributes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewAttributes(ViewAttributes newViewAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ViewAttributes(), newViewAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewAttributes(ViewAttributes newViewAttributes) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ViewAttributes(), newViewAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewDescription getViewDescription() {
		return (ViewDescription)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ViewDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewDescription(ViewDescription newViewDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ViewDescription(), newViewDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewDescription(ViewDescription newViewDescription) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ViewDescription(), newViewDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewNode getViewNode() {
		return (ViewNode)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_ViewNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewNode(ViewNode newViewNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_ViewNode(), newViewNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewNode(ViewNode newViewNode) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_ViewNode(), newViewNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteRequest getWriteRequest() {
		return (WriteRequest)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_WriteRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteRequest(WriteRequest newWriteRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_WriteRequest(), newWriteRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteRequest(WriteRequest newWriteRequest) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_WriteRequest(), newWriteRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteResponse getWriteResponse() {
		return (WriteResponse)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_WriteResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteResponse(WriteResponse newWriteResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_WriteResponse(), newWriteResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteResponse(WriteResponse newWriteResponse) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_WriteResponse(), newWriteResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriterGroupDataType getWriterGroupDataType() {
		return (WriterGroupDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriterGroupDataType(WriterGroupDataType newWriterGroupDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupDataType(), newWriterGroupDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriterGroupDataType(WriterGroupDataType newWriterGroupDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupDataType(), newWriterGroupDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriterGroupMessageDataType getWriterGroupMessageDataType() {
		return (WriterGroupMessageDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriterGroupMessageDataType(WriterGroupMessageDataType newWriterGroupMessageDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType(), newWriterGroupMessageDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriterGroupMessageDataType(WriterGroupMessageDataType newWriterGroupMessageDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType(), newWriterGroupMessageDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriterGroupTransportDataType getWriterGroupTransportDataType() {
		return (WriterGroupTransportDataType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriterGroupTransportDataType(WriterGroupTransportDataType newWriterGroupTransportDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType(), newWriterGroupTransportDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriterGroupTransportDataType(WriterGroupTransportDataType newWriterGroupTransportDataType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType(), newWriterGroupTransportDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteValue getWriteValue() {
		return (WriteValue)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_WriteValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteValue(WriteValue newWriteValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_WriteValue(), newWriteValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteValue(WriteValue newWriteValue) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_WriteValue(), newWriteValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509IdentityToken getX509IdentityToken() {
		return (X509IdentityToken)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_X509IdentityToken(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX509IdentityToken(X509IdentityToken newX509IdentityToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_X509IdentityToken(), newX509IdentityToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX509IdentityToken(X509IdentityToken newX509IdentityToken) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_X509IdentityToken(), newX509IdentityToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XVType getXVType() {
		return (XVType)getMixed().get(TypesPackage.eINSTANCE.getDocumentRoot_XVType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXVType(XVType newXVType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.eINSTANCE.getDocumentRoot_XVType(), newXVType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXVType(XVType newXVType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.eINSTANCE.getDocumentRoot_XVType(), newXVType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_REQUEST:
				return basicSetActivateSessionRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_RESPONSE:
				return basicSetActivateSessionResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_ITEM:
				return basicSetAddNodesItem(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_REQUEST:
				return basicSetAddNodesRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESPONSE:
				return basicSetAddNodesResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESULT:
				return basicSetAddNodesResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_ITEM:
				return basicSetAddReferencesItem(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_REQUEST:
				return basicSetAddReferencesRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_RESPONSE:
				return basicSetAddReferencesResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_CONFIGURATION:
				return basicSetAggregateConfiguration(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER:
				return basicSetAggregateFilter(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER_RESULT:
				return basicSetAggregateFilterResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ALIAS_NAME_DATA_TYPE:
				return basicSetAliasNameDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ANONYMOUS_IDENTITY_TOKEN:
				return basicSetAnonymousIdentityToken(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_DESCRIPTION:
				return basicSetApplicationDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ARGUMENT:
				return basicSetArgument(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_OPERAND:
				return basicSetAttributeOperand(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__AXIS_INFORMATION:
				return basicSetAxisInformation(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				return basicSetBrokerConnectionTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return basicSetBrokerDataSetReaderTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return basicSetBrokerDataSetWriterTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return basicSetBrokerWriterGroupTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DESCRIPTION:
				return basicSetBrowseDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_REQUEST:
				return basicSetBrowseNextRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_RESPONSE:
				return basicSetBrowseNextResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH:
				return basicSetBrowsePath(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_RESULT:
				return basicSetBrowsePathResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_TARGET:
				return basicSetBrowsePathTarget(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROWSE_REQUEST:
				return basicSetBrowseRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESPONSE:
				return basicSetBrowseResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT:
				return basicSetBrowseResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__BUILD_INFO:
				return basicSetBuildInfo(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_REQUEST:
				return basicSetCallMethodRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_RESULT:
				return basicSetCallMethodResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CALL_REQUEST:
				return basicSetCallRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CALL_RESPONSE:
				return basicSetCallResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CANCEL_REQUEST:
				return basicSetCancelRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CANCEL_RESPONSE:
				return basicSetCancelResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CARTESIAN_COORDINATES:
				return basicSetCartesianCoordinates(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CHANNEL_SECURITY_TOKEN:
				return basicSetChannelSecurityToken(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_REQUEST:
				return basicSetCloseSecureChannelRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_RESPONSE:
				return basicSetCloseSecureChannelResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_REQUEST:
				return basicSetCloseSessionRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_RESPONSE:
				return basicSetCloseSessionResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__COMPLEX_NUMBER_TYPE:
				return basicSetComplexNumberType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CONFIGURATION_VERSION_DATA_TYPE:
				return basicSetConfigurationVersionDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CONNECTION_TRANSPORT_DATA_TYPE:
				return basicSetConnectionTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER:
				return basicSetContentFilter(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT:
				return basicSetContentFilterElement(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT_RESULT:
				return basicSetContentFilterElementResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_RESULT:
				return basicSetContentFilterResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_REQUEST:
				return basicSetCreateMonitoredItemsRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_RESPONSE:
				return basicSetCreateMonitoredItemsResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_REQUEST:
				return basicSetCreateSessionRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_RESPONSE:
				return basicSetCreateSessionResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_REQUEST:
				return basicSetCreateSubscriptionRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_RESPONSE:
				return basicSetCreateSubscriptionResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__CURRENCY_UNIT_TYPE:
				return basicSetCurrencyUnitType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_FILTER:
				return basicSetDataChangeFilter(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_NOTIFICATION:
				return basicSetDataChangeNotification(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				return basicSetDatagramConnectionTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return basicSetDatagramWriterGroupTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_META_DATA_TYPE:
				return basicSetDataSetMetaDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_DATA_TYPE:
				return basicSetDataSetReaderDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_MESSAGE_DATA_TYPE:
				return basicSetDataSetReaderMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return basicSetDataSetReaderTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_DATA_TYPE:
				return basicSetDataSetWriterDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return basicSetDataSetWriterMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return basicSetDataSetWriterTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_ATTRIBUTES:
				return basicSetDataTypeAttributes(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DEFINITION:
				return basicSetDataTypeDefinition(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DESCRIPTION:
				return basicSetDataTypeDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_NODE:
				return basicSetDataTypeNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_SCHEMA_HEADER:
				return basicSetDataTypeSchemaHeader(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DATA_VALUE:
				return basicSetDataValue(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_DATA_TYPE:
				return basicSetDecimalDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_AT_TIME_DETAILS:
				return basicSetDeleteAtTimeDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_EVENT_DETAILS:
				return basicSetDeleteEventDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_REQUEST:
				return basicSetDeleteMonitoredItemsRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_RESPONSE:
				return basicSetDeleteMonitoredItemsResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_ITEM:
				return basicSetDeleteNodesItem(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_REQUEST:
				return basicSetDeleteNodesRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_RESPONSE:
				return basicSetDeleteNodesResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_RAW_MODIFIED_DETAILS:
				return basicSetDeleteRawModifiedDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_ITEM:
				return basicSetDeleteReferencesItem(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_REQUEST:
				return basicSetDeleteReferencesRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_RESPONSE:
				return basicSetDeleteReferencesResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_REQUEST:
				return basicSetDeleteSubscriptionsRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_RESPONSE:
				return basicSetDeleteSubscriptionsResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTIC_INFO:
				return basicSetDiagnosticInfo(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DISCOVERY_CONFIGURATION:
				return basicSetDiscoveryConfiguration(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__DOUBLE_COMPLEX_NUMBER_TYPE:
				return basicSetDoubleComplexNumberType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ELEMENT_OPERAND:
				return basicSetElementOperand(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_CONFIGURATION:
				return basicSetEndpointConfiguration(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_DESCRIPTION:
				return basicSetEndpointDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_TYPE:
				return basicSetEndpointType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_URL_LIST_DATA_TYPE:
				return basicSetEndpointUrlListDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ENUM_DEFINITION:
				return basicSetEnumDefinition(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ENUM_DESCRIPTION:
				return basicSetEnumDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ENUM_FIELD:
				return basicSetEnumField(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ENUM_VALUE_TYPE:
				return basicSetEnumValueType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__EU_INFORMATION:
				return basicSetEUInformation(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__EVENT_FIELD_LIST:
				return basicSetEventFieldList(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER:
				return basicSetEventFilter(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER_RESULT:
				return basicSetEventFilterResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFICATION_LIST:
				return basicSetEventNotificationList(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__EXPANDED_NODE_ID:
				return basicSetExpandedNodeId(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__EXTENSION_OBJECT:
				return basicSetExtensionObject(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__FIELD_META_DATA:
				return basicSetFieldMetaData(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__FIELD_TARGET_DATA_TYPE:
				return basicSetFieldTargetDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERAND:
				return basicSetFilterOperand(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_REQUEST:
				return basicSetFindServersOnNetworkRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_RESPONSE:
				return basicSetFindServersOnNetworkResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_REQUEST:
				return basicSetFindServersRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_RESPONSE:
				return basicSetFindServersResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__FRAME:
				return basicSetFrame(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTES:
				return basicSetGenericAttributes(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTE_VALUE:
				return basicSetGenericAttributeValue(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_REQUEST:
				return basicSetGetEndpointsRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_RESPONSE:
				return basicSetGetEndpointsResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__GUID:
				return basicSetGuid(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_DATA:
				return basicSetHistoryData(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT:
				return basicSetHistoryEvent(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT_FIELD_LIST:
				return basicSetHistoryEventFieldList(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_MODIFIED_DATA:
				return basicSetHistoryModifiedData(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_DETAILS:
				return basicSetHistoryReadDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_REQUEST:
				return basicSetHistoryReadRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESPONSE:
				return basicSetHistoryReadResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESULT:
				return basicSetHistoryReadResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_VALUE_ID:
				return basicSetHistoryReadValueId(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_DETAILS:
				return basicSetHistoryUpdateDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_REQUEST:
				return basicSetHistoryUpdateRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESPONSE:
				return basicSetHistoryUpdateResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESULT:
				return basicSetHistoryUpdateResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_MAPPING_RULE_TYPE:
				return basicSetIdentityMappingRuleType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__INSTANCE_NODE:
				return basicSetInstanceNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ISSUED_IDENTITY_TOKEN:
				return basicSetIssuedIdentityToken(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return basicSetJsonDataSetReaderMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return basicSetJsonDataSetWriterMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return basicSetJsonWriterGroupMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__KEY_VALUE_PAIR:
				return basicSetKeyValuePair(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_ITEM:
				return basicSetListOfAddNodesItem(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_RESULT:
				return basicSetListOfAddNodesResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_REFERENCES_ITEM:
				return basicSetListOfAddReferencesItem(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ALIAS_NAME_DATA_TYPE:
				return basicSetListOfAliasNameDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_APPLICATION_DESCRIPTION:
				return basicSetListOfApplicationDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ARGUMENT:
				return basicSetListOfArgument(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BOOLEAN:
				return basicSetListOfBoolean(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				return basicSetListOfBrokerConnectionTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return basicSetListOfBrokerDataSetReaderTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return basicSetListOfBrokerDataSetWriterTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				return basicSetListOfBrokerTransportQualityOfService(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return basicSetListOfBrokerWriterGroupTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_DESCRIPTION:
				return basicSetListOfBrowseDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH:
				return basicSetListOfBrowsePath(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_RESULT:
				return basicSetListOfBrowsePathResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_TARGET:
				return basicSetListOfBrowsePathTarget(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_RESULT:
				return basicSetListOfBrowseResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE:
				return basicSetListOfByte(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE_STRING:
				return basicSetListOfByteString(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_REQUEST:
				return basicSetListOfCallMethodRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_RESULT:
				return basicSetListOfCallMethodResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CARTESIAN_COORDINATES:
				return basicSetListOfCartesianCoordinates(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONFIGURATION_VERSION_DATA_TYPE:
				return basicSetListOfConfigurationVersionDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE:
				return basicSetListOfConnectionTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER:
				return basicSetListOfContentFilter(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT:
				return basicSetListOfContentFilterElement(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT_RESULT:
				return basicSetListOfContentFilterElementResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CURRENCY_UNIT_TYPE:
				return basicSetListOfCurrencyUnitType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				return basicSetListOfDatagramConnectionTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return basicSetListOfDatagramWriterGroupTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_FIELD_CONTENT_MASK:
				return basicSetListOfDataSetFieldContentMask(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_META_DATA_TYPE:
				return basicSetListOfDataSetMetaDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_ORDERING_TYPE:
				return basicSetListOfDataSetOrderingType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_DATA_TYPE:
				return basicSetListOfDataSetReaderDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return basicSetListOfDataSetReaderMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return basicSetListOfDataSetReaderTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_DATA_TYPE:
				return basicSetListOfDataSetWriterDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return basicSetListOfDataSetWriterMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return basicSetListOfDataSetWriterTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DEFINITION:
				return basicSetListOfDataTypeDefinition(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DESCRIPTION:
				return basicSetListOfDataTypeDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_SCHEMA_HEADER:
				return basicSetListOfDataTypeSchemaHeader(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_VALUE:
				return basicSetListOfDataValue(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATE_TIME:
				return basicSetListOfDateTime(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_NODES_ITEM:
				return basicSetListOfDeleteNodesItem(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_REFERENCES_ITEM:
				return basicSetListOfDeleteReferencesItem(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTIC_INFO:
				return basicSetListOfDiagnosticInfo(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTICS_LEVEL:
				return basicSetListOfDiagnosticsLevel(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DOUBLE:
				return basicSetListOfDouble(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_CONFIGURATION:
				return basicSetListOfEndpointConfiguration(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_DESCRIPTION:
				return basicSetListOfEndpointDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_TYPE:
				return basicSetListOfEndpointType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE:
				return basicSetListOfEndpointUrlListDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DEFINITION:
				return basicSetListOfEnumDefinition(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DESCRIPTION:
				return basicSetListOfEnumDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_FIELD:
				return basicSetListOfEnumField(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_VALUE_TYPE:
				return basicSetListOfEnumValueType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EVENT_FIELD_LIST:
				return basicSetListOfEventFieldList(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXPANDED_NODE_ID:
				return basicSetListOfExpandedNodeId(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXTENSION_OBJECT:
				return basicSetListOfExtensionObject(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_META_DATA:
				return basicSetListOfFieldMetaData(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_TARGET_DATA_TYPE:
				return basicSetListOfFieldTargetDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FLOAT:
				return basicSetListOfFloat(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FRAME:
				return basicSetListOfFrame(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GENERIC_ATTRIBUTE_VALUE:
				return basicSetListOfGenericAttributeValue(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GUID:
				return basicSetListOfGuid(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_EVENT_FIELD_LIST:
				return basicSetListOfHistoryEventFieldList(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_RESULT:
				return basicSetListOfHistoryReadResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_VALUE_ID:
				return basicSetListOfHistoryReadValueId(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_UPDATE_RESULT:
				return basicSetListOfHistoryUpdateResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_CRITERIA_TYPE:
				return basicSetListOfIdentityCriteriaType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_MAPPING_RULE_TYPE:
				return basicSetListOfIdentityMappingRuleType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ID_TYPE:
				return basicSetListOfIdType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT16:
				return basicSetListOfInt16(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT32:
				return basicSetListOfInt32(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT64:
				return basicSetListOfInt64(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				return basicSetListOfJsonDataSetMessageContentMask(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return basicSetListOfJsonDataSetReaderMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return basicSetListOfJsonDataSetWriterMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK:
				return basicSetListOfJsonNetworkMessageContentMask(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return basicSetListOfJsonWriterGroupMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_KEY_VALUE_PAIR:
				return basicSetListOfKeyValuePair(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_LOCALIZED_TEXT:
				return basicSetListOfLocalizedText(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODEL_CHANGE_STRUCTURE_DATA_TYPE:
				return basicSetListOfModelChangeStructureDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODIFICATION_INFO:
				return basicSetListOfModificationInfo(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_REQUEST:
				return basicSetListOfMonitoredItemCreateRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_RESULT:
				return basicSetListOfMonitoredItemCreateResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_REQUEST:
				return basicSetListOfMonitoredItemModifyRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_RESULT:
				return basicSetListOfMonitoredItemModifyResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_NOTIFICATION:
				return basicSetListOfMonitoredItemNotification(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_DATA_TYPE:
				return basicSetListOfNetworkAddressDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE:
				return basicSetListOfNetworkAddressUrlDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_GROUP_DATA_TYPE:
				return basicSetListOfNetworkGroupDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE:
				return basicSetListOfNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_ID:
				return basicSetListOfNodeId(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_REFERENCE:
				return basicSetListOfNodeReference(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_TYPE_DESCRIPTION:
				return basicSetListOfNodeTypeDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPEN_FILE_MODE:
				return basicSetListOfOpenFileMode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPTION_SET:
				return basicSetListOfOptionSet(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ORIENTATION:
				return basicSetListOfOrientation(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OVERRIDE_VALUE_HANDLING:
				return basicSetListOfOverrideValueHandling(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PARSING_RESULT:
				return basicSetListOfParsingResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE:
				return basicSetListOfPublishedDataItemsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE:
				return basicSetListOfPublishedDataSetDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				return basicSetListOfPublishedDataSetSourceDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_EVENTS_DATA_TYPE:
				return basicSetListOfPublishedEventsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_VARIABLE_DATA_TYPE:
				return basicSetListOfPublishedVariableDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE:
				return basicSetListOfPubSubConfigurationDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE:
				return basicSetListOfPubSubConnectionDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				return basicSetListOfPubSubDiagnosticsCounterClassification(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_GROUP_DATA_TYPE:
				return basicSetListOfPubSubGroupDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_STATE:
				return basicSetListOfPubSubState(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUALIFIED_NAME:
				return basicSetListOfQualifiedName(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_DESCRIPTION:
				return basicSetListOfQueryDataDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_SET:
				return basicSetListOfQueryDataSet(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RATIONAL_NUMBER:
				return basicSetListOfRationalNumber(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_DATA_TYPE:
				return basicSetListOfReaderGroupDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE:
				return basicSetListOfReaderGroupMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE:
				return basicSetListOfReaderGroupTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READ_VALUE_ID:
				return basicSetListOfReadValueId(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REDUNDANT_SERVER_DATA_TYPE:
				return basicSetListOfRedundantServerDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_DESCRIPTION:
				return basicSetListOfReferenceDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_NODE:
				return basicSetListOfReferenceNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REGISTERED_SERVER:
				return basicSetListOfRegisteredServer(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RELATIVE_PATH_ELEMENT:
				return basicSetListOfRelativePathElement(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ROLE_PERMISSION_TYPE:
				return basicSetListOfRolePermissionType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				return basicSetListOfSamplingIntervalDiagnosticsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SBYTE:
				return basicSetListOfSByte(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				return basicSetListOfSemanticChangeStructureDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SERVER_ON_NETWORK:
				return basicSetListOfServerOnNetwork(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE:
				return basicSetListOfSessionDiagnosticsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				return basicSetListOfSessionSecurityDiagnosticsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIGNED_SOFTWARE_CERTIFICATE:
				return basicSetListOfSignedSoftwareCertificate(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_ATTRIBUTE_OPERAND:
				return basicSetListOfSimpleAttributeOperand(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_TYPE_DESCRIPTION:
				return basicSetListOfSimpleTypeDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_CODE:
				return basicSetListOfStatusCode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_RESULT:
				return basicSetListOfStatusResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRING:
				return basicSetListOfString(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DEFINITION:
				return basicSetListOfStructureDefinition(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DESCRIPTION:
				return basicSetListOfStructureDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_FIELD:
				return basicSetListOfStructureField(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE:
				return basicSetListOfSubscribedDataSetDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				return basicSetListOfSubscribedDataSetMirrorDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT:
				return basicSetListOfSubscriptionAcknowledgement(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				return basicSetListOfSubscriptionDiagnosticsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TARGET_VARIABLES_DATA_TYPE:
				return basicSetListOfTargetVariablesDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DCARTESIAN_COORDINATES:
				return basicSetListOfThreeDCartesianCoordinates(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DFRAME:
				return basicSetListOfThreeDFrame(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DORIENTATION:
				return basicSetListOfThreeDOrientation(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DVECTOR:
				return basicSetListOfThreeDVector(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TIME_ZONE_DATA_TYPE:
				return basicSetListOfTimeZoneDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRANSFER_RESULT:
				return basicSetListOfTransferResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRUST_LIST_DATA_TYPE:
				return basicSetListOfTrustListDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UA_BINARY_FILE_DATA_TYPE:
				return basicSetListOfUABinaryFileDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				return basicSetListOfUadpDataSetMessageContentMask(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return basicSetListOfUadpDataSetReaderMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return basicSetListOfUadpDataSetWriterMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK:
				return basicSetListOfUadpNetworkMessageContentMask(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return basicSetListOfUadpWriterGroupMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT16:
				return basicSetListOfUInt16(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT32:
				return basicSetListOfUInt32(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT64:
				return basicSetListOfUInt64(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UNION:
				return basicSetListOfUnion(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_USER_TOKEN_POLICY:
				return basicSetListOfUserTokenPolicy(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VARIANT:
				return basicSetListOfVariant(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VECTOR:
				return basicSetListOfVector(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_DATA_TYPE:
				return basicSetListOfWriterGroupDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return basicSetListOfWriterGroupMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return basicSetListOfWriterGroupTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITE_VALUE:
				return basicSetListOfWriteValue(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_XML_ELEMENT:
				return basicSetListOfXmlElement(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LITERAL_OPERAND:
				return basicSetLiteralOperand(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__LOCALIZED_TEXT:
				return basicSetLocalizedText(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MDNS_DISCOVERY_CONFIGURATION:
				return basicSetMdnsDiscoveryConfiguration(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__METHOD_ATTRIBUTES:
				return basicSetMethodAttributes(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__METHOD_NODE:
				return basicSetMethodNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_DATA_TYPE:
				return basicSetModelChangeStructureDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MODIFICATION_INFO:
				return basicSetModificationInfo(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_REQUEST:
				return basicSetModifyMonitoredItemsRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_RESPONSE:
				return basicSetModifyMonitoredItemsResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_REQUEST:
				return basicSetModifySubscriptionRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_RESPONSE:
				return basicSetModifySubscriptionResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_REQUEST:
				return basicSetMonitoredItemCreateRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_RESULT:
				return basicSetMonitoredItemCreateResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_REQUEST:
				return basicSetMonitoredItemModifyRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_RESULT:
				return basicSetMonitoredItemModifyResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_NOTIFICATION:
				return basicSetMonitoredItemNotification(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER:
				return basicSetMonitoringFilter(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER_RESULT:
				return basicSetMonitoringFilterResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MONITORING_PARAMETERS:
				return basicSetMonitoringParameters(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_DATA_TYPE:
				return basicSetNetworkAddressDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_URL_DATA_TYPE:
				return basicSetNetworkAddressUrlDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__NETWORK_GROUP_DATA_TYPE:
				return basicSetNetworkGroupDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__NODE:
				return basicSetNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES:
				return basicSetNodeAttributes(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__NODE_ID:
				return basicSetNodeId(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__NODE_REFERENCE:
				return basicSetNodeReference(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__NODE_TYPE_DESCRIPTION:
				return basicSetNodeTypeDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_DATA:
				return basicSetNotificationData(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_MESSAGE:
				return basicSetNotificationMessage(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__OBJECT_ATTRIBUTES:
				return basicSetObjectAttributes(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__OBJECT_NODE:
				return basicSetObjectNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_ATTRIBUTES:
				return basicSetObjectTypeAttributes(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_NODE:
				return basicSetObjectTypeNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_REQUEST:
				return basicSetOpenSecureChannelRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_RESPONSE:
				return basicSetOpenSecureChannelResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__OPTION_SET:
				return basicSetOptionSet(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PARSING_RESULT:
				return basicSetParsingResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC2_DATA_TYPE:
				return basicSetProgramDiagnostic2DataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC_DATA_TYPE:
				return basicSetProgramDiagnosticDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_ITEMS_DATA_TYPE:
				return basicSetPublishedDataItemsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_DATA_TYPE:
				return basicSetPublishedDataSetDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				return basicSetPublishedDataSetSourceDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_EVENTS_DATA_TYPE:
				return basicSetPublishedEventsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_VARIABLE_DATA_TYPE:
				return basicSetPublishedVariableDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_REQUEST:
				return basicSetPublishRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_RESPONSE:
				return basicSetPublishResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONFIGURATION_DATA_TYPE:
				return basicSetPubSubConfigurationDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONNECTION_DATA_TYPE:
				return basicSetPubSubConnectionDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_GROUP_DATA_TYPE:
				return basicSetPubSubGroupDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__QUALIFIED_NAME:
				return basicSetQualifiedName(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_DESCRIPTION:
				return basicSetQueryDataDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_SET:
				return basicSetQueryDataSet(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_REQUEST:
				return basicSetQueryFirstRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_RESPONSE:
				return basicSetQueryFirstResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_REQUEST:
				return basicSetQueryNextRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_RESPONSE:
				return basicSetQueryNextResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__RANGE:
				return basicSetRange(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__RATIONAL_NUMBER:
				return basicSetRationalNumber(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READ_ANNOTATION_DATA_DETAILS:
				return basicSetReadAnnotationDataDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READ_AT_TIME_DETAILS:
				return basicSetReadAtTimeDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_DATA_TYPE:
				return basicSetReaderGroupDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_MESSAGE_DATA_TYPE:
				return basicSetReaderGroupMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_TRANSPORT_DATA_TYPE:
				return basicSetReaderGroupTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READ_EVENT_DETAILS:
				return basicSetReadEventDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READ_PROCESSED_DETAILS:
				return basicSetReadProcessedDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READ_RAW_MODIFIED_DETAILS:
				return basicSetReadRawModifiedDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READ_REQUEST:
				return basicSetReadRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READ_RESPONSE:
				return basicSetReadResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__READ_VALUE_ID:
				return basicSetReadValueId(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REDUNDANT_SERVER_DATA_TYPE:
				return basicSetRedundantServerDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_DESCRIPTION:
				return basicSetReferenceDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_NODE:
				return basicSetReferenceNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_ATTRIBUTES:
				return basicSetReferenceTypeAttributes(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_NODE:
				return basicSetReferenceTypeNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REGISTERED_SERVER:
				return basicSetRegisteredServer(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_REQUEST:
				return basicSetRegisterNodesRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_RESPONSE:
				return basicSetRegisterNodesResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_REQUEST:
				return basicSetRegisterServer2Request(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_RESPONSE:
				return basicSetRegisterServer2Response(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_REQUEST:
				return basicSetRegisterServerRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_RESPONSE:
				return basicSetRegisterServerResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH:
				return basicSetRelativePath(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH_ELEMENT:
				return basicSetRelativePathElement(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_REQUEST:
				return basicSetRepublishRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_RESPONSE:
				return basicSetRepublishResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__REQUEST_HEADER:
				return basicSetRequestHeader(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
				return basicSetResponseHeader(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__ROLE_PERMISSION_TYPE:
				return basicSetRolePermissionType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__RSA_ENCRYPTED_SECRET:
				return basicSetRsaEncryptedSecret(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				return basicSetSamplingIntervalDiagnosticsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				return basicSetSemanticChangeStructureDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE:
				return basicSetServerDiagnosticsSummaryDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SERVER_ON_NETWORK:
				return basicSetServerOnNetwork(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATUS_DATA_TYPE:
				return basicSetServerStatusDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SERVICE_COUNTER_DATA_TYPE:
				return basicSetServiceCounterDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SERVICE_FAULT:
				return basicSetServiceFault(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SESSION_AUTHENTICATION_TOKEN:
				return basicSetSessionAuthenticationToken(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SESSION_DIAGNOSTICS_DATA_TYPE:
				return basicSetSessionDiagnosticsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_REQUEST_TYPE:
				return basicSetSessionlessInvokeRequestType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_RESPONSE_TYPE:
				return basicSetSessionlessInvokeResponseType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				return basicSetSessionSecurityDiagnosticsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_REQUEST:
				return basicSetSetMonitoringModeRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_RESPONSE:
				return basicSetSetMonitoringModeResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_REQUEST:
				return basicSetSetPublishingModeRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_RESPONSE:
				return basicSetSetPublishingModeResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_REQUEST:
				return basicSetSetTriggeringRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_RESPONSE:
				return basicSetSetTriggeringResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SIGNATURE_DATA:
				return basicSetSignatureData(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SIGNED_SOFTWARE_CERTIFICATE:
				return basicSetSignedSoftwareCertificate(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_ATTRIBUTE_OPERAND:
				return basicSetSimpleAttributeOperand(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_TYPE_DESCRIPTION:
				return basicSetSimpleTypeDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__STATUS_CHANGE_NOTIFICATION:
				return basicSetStatusChangeNotification(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__STATUS_RESULT:
				return basicSetStatusResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				return basicSetStructureDefinition(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DESCRIPTION:
				return basicSetStructureDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_FIELD:
				return basicSetStructureField(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_DATA_TYPE:
				return basicSetSubscribedDataSetDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				return basicSetSubscribedDataSetMirrorDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_ACKNOWLEDGEMENT:
				return basicSetSubscriptionAcknowledgement(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				return basicSetSubscriptionDiagnosticsDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__TARGET_VARIABLES_DATA_TYPE:
				return basicSetTargetVariablesDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__THREE_DCARTESIAN_COORDINATES:
				return basicSetThreeDCartesianCoordinates(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__THREE_DFRAME:
				return basicSetThreeDFrame(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__THREE_DORIENTATION:
				return basicSetThreeDOrientation(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__THREE_DVECTOR:
				return basicSetThreeDVector(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__TIME_ZONE_DATA_TYPE:
				return basicSetTimeZoneDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_RESULT:
				return basicSetTransferResult(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_REQUEST:
				return basicSetTransferSubscriptionsRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_RESPONSE:
				return basicSetTransferSubscriptionsResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST:
				return basicSetTranslateBrowsePathsToNodeIdsRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_RESPONSE:
				return basicSetTranslateBrowsePathsToNodeIdsResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_DATA_TYPE:
				return basicSetTrustListDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__TYPE_NODE:
				return basicSetTypeNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__UA_BINARY_FILE_DATA_TYPE:
				return basicSetUABinaryFileDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return basicSetUadpDataSetReaderMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return basicSetUadpDataSetWriterMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return basicSetUadpWriterGroupMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__UNION:
				return basicSetUnion(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_REQUEST:
				return basicSetUnregisterNodesRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_RESPONSE:
				return basicSetUnregisterNodesResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__UPDATE_DATA_DETAILS:
				return basicSetUpdateDataDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__UPDATE_EVENT_DETAILS:
				return basicSetUpdateEventDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__UPDATE_STRUCTURE_DATA_DETAILS:
				return basicSetUpdateStructureDataDetails(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__USER_IDENTITY_TOKEN:
				return basicSetUserIdentityToken(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__USER_NAME_IDENTITY_TOKEN:
				return basicSetUserNameIdentityToken(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_POLICY:
				return basicSetUserTokenPolicy(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_ATTRIBUTES:
				return basicSetVariableAttributes(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_NODE:
				return basicSetVariableNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_ATTRIBUTES:
				return basicSetVariableTypeAttributes(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_NODE:
				return basicSetVariableTypeNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__VARIANT:
				return basicSetVariant(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__VECTOR:
				return basicSetVector(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__VIEW_ATTRIBUTES:
				return basicSetViewAttributes(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__VIEW_DESCRIPTION:
				return basicSetViewDescription(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__VIEW_NODE:
				return basicSetViewNode(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__WRITE_REQUEST:
				return basicSetWriteRequest(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__WRITE_RESPONSE:
				return basicSetWriteResponse(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_DATA_TYPE:
				return basicSetWriterGroupDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_MESSAGE_DATA_TYPE:
				return basicSetWriterGroupMessageDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return basicSetWriterGroupTransportDataType(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__WRITE_VALUE:
				return basicSetWriteValue(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__X509_IDENTITY_TOKEN:
				return basicSetX509IdentityToken(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__XV_TYPE:
				return basicSetXVType(null, msgs);
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
			case TypesPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case TypesPackage.DOCUMENT_ROOT__ACCESS_LEVEL_EX_TYPE:
				return getAccessLevelExType();
			case TypesPackage.DOCUMENT_ROOT__ACCESS_LEVEL_TYPE:
				return getAccessLevelType();
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_REQUEST:
				return getActivateSessionRequest();
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_RESPONSE:
				return getActivateSessionResponse();
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_ITEM:
				return getAddNodesItem();
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_REQUEST:
				return getAddNodesRequest();
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESPONSE:
				return getAddNodesResponse();
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESULT:
				return getAddNodesResult();
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_ITEM:
				return getAddReferencesItem();
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_REQUEST:
				return getAddReferencesRequest();
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_RESPONSE:
				return getAddReferencesResponse();
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_CONFIGURATION:
				return getAggregateConfiguration();
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER:
				return getAggregateFilter();
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER_RESULT:
				return getAggregateFilterResult();
			case TypesPackage.DOCUMENT_ROOT__ALIAS_NAME_DATA_TYPE:
				return getAliasNameDataType();
			case TypesPackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation();
			case TypesPackage.DOCUMENT_ROOT__ANONYMOUS_IDENTITY_TOKEN:
				return getAnonymousIdentityToken();
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_DESCRIPTION:
				return getApplicationDescription();
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_INSTANCE_CERTIFICATE:
				return getApplicationInstanceCertificate();
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_TYPE:
				return getApplicationType();
			case TypesPackage.DOCUMENT_ROOT__ARGUMENT:
				return getArgument();
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_OPERAND:
				return getAttributeOperand();
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_WRITE_MASK:
				return getAttributeWriteMask();
			case TypesPackage.DOCUMENT_ROOT__AUDIO_DATA_TYPE:
				return getAudioDataType();
			case TypesPackage.DOCUMENT_ROOT__AXIS_INFORMATION:
				return getAxisInformation();
			case TypesPackage.DOCUMENT_ROOT__AXIS_SCALE_ENUMERATION:
				return getAxisScaleEnumeration();
			case TypesPackage.DOCUMENT_ROOT__BIT_FIELD_MASK_DATA_TYPE:
				return getBitFieldMaskDataType();
			case TypesPackage.DOCUMENT_ROOT__BOOLEAN:
				return getBoolean();
			case TypesPackage.DOCUMENT_ROOT__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				return getBrokerConnectionTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return getBrokerDataSetReaderTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return getBrokerDataSetWriterTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				return getBrokerTransportQualityOfService();
			case TypesPackage.DOCUMENT_ROOT__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getBrokerWriterGroupTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DESCRIPTION:
				return getBrowseDescription();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DIRECTION:
				return getBrowseDirection();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_REQUEST:
				return getBrowseNextRequest();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_RESPONSE:
				return getBrowseNextResponse();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH:
				return getBrowsePath();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_RESULT:
				return getBrowsePathResult();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_TARGET:
				return getBrowsePathTarget();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_REQUEST:
				return getBrowseRequest();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESPONSE:
				return getBrowseResponse();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT:
				return getBrowseResult();
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT_MASK:
				return getBrowseResultMask();
			case TypesPackage.DOCUMENT_ROOT__BUILD_INFO:
				return getBuildInfo();
			case TypesPackage.DOCUMENT_ROOT__BYTE:
				return getByte();
			case TypesPackage.DOCUMENT_ROOT__BYTE_STRING:
				return getByteString();
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_REQUEST:
				return getCallMethodRequest();
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_RESULT:
				return getCallMethodResult();
			case TypesPackage.DOCUMENT_ROOT__CALL_REQUEST:
				return getCallRequest();
			case TypesPackage.DOCUMENT_ROOT__CALL_RESPONSE:
				return getCallResponse();
			case TypesPackage.DOCUMENT_ROOT__CANCEL_REQUEST:
				return getCancelRequest();
			case TypesPackage.DOCUMENT_ROOT__CANCEL_RESPONSE:
				return getCancelResponse();
			case TypesPackage.DOCUMENT_ROOT__CARTESIAN_COORDINATES:
				return getCartesianCoordinates();
			case TypesPackage.DOCUMENT_ROOT__CHANNEL_SECURITY_TOKEN:
				return getChannelSecurityToken();
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_REQUEST:
				return getCloseSecureChannelRequest();
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_RESPONSE:
				return getCloseSecureChannelResponse();
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_REQUEST:
				return getCloseSessionRequest();
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_RESPONSE:
				return getCloseSessionResponse();
			case TypesPackage.DOCUMENT_ROOT__COMPLEX_NUMBER_TYPE:
				return getComplexNumberType();
			case TypesPackage.DOCUMENT_ROOT__CONFIGURATION_VERSION_DATA_TYPE:
				return getConfigurationVersionDataType();
			case TypesPackage.DOCUMENT_ROOT__CONNECTION_TRANSPORT_DATA_TYPE:
				return getConnectionTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER:
				return getContentFilter();
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT:
				return getContentFilterElement();
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT_RESULT:
				return getContentFilterElementResult();
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_RESULT:
				return getContentFilterResult();
			case TypesPackage.DOCUMENT_ROOT__CONTINUATION_POINT:
				return getContinuationPoint();
			case TypesPackage.DOCUMENT_ROOT__COUNTER:
				return getCounter();
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_REQUEST:
				return getCreateMonitoredItemsRequest();
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_RESPONSE:
				return getCreateMonitoredItemsResponse();
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_REQUEST:
				return getCreateSessionRequest();
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_RESPONSE:
				return getCreateSessionResponse();
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_REQUEST:
				return getCreateSubscriptionRequest();
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_RESPONSE:
				return getCreateSubscriptionResponse();
			case TypesPackage.DOCUMENT_ROOT__CURRENCY_UNIT_TYPE:
				return getCurrencyUnitType();
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_FILTER:
				return getDataChangeFilter();
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_NOTIFICATION:
				return getDataChangeNotification();
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_TRIGGER:
				return getDataChangeTrigger();
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				return getDatagramConnectionTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getDatagramWriterGroupTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_FIELD_CONTENT_MASK:
				return getDataSetFieldContentMask();
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_FIELD_FLAGS:
				return getDataSetFieldFlags();
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_META_DATA_TYPE:
				return getDataSetMetaDataType();
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_ORDERING_TYPE:
				return getDataSetOrderingType();
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_DATA_TYPE:
				return getDataSetReaderDataType();
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getDataSetReaderMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return getDataSetReaderTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_DATA_TYPE:
				return getDataSetWriterDataType();
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getDataSetWriterMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return getDataSetWriterTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_ATTRIBUTES:
				return getDataTypeAttributes();
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DEFINITION:
				return getDataTypeDefinition();
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DESCRIPTION:
				return getDataTypeDescription();
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_NODE:
				return getDataTypeNode();
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_SCHEMA_HEADER:
				return getDataTypeSchemaHeader();
			case TypesPackage.DOCUMENT_ROOT__DATA_VALUE:
				return getDataValue();
			case TypesPackage.DOCUMENT_ROOT__DATE:
				return getDate();
			case TypesPackage.DOCUMENT_ROOT__DATE_STRING:
				return getDateString();
			case TypesPackage.DOCUMENT_ROOT__DATE_TIME:
				return getDateTime();
			case TypesPackage.DOCUMENT_ROOT__DEADBAND_TYPE:
				return getDeadbandType();
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_DATA_TYPE:
				return getDecimalDataType();
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_STRING:
				return getDecimalString();
			case TypesPackage.DOCUMENT_ROOT__DELETE_AT_TIME_DETAILS:
				return getDeleteAtTimeDetails();
			case TypesPackage.DOCUMENT_ROOT__DELETE_EVENT_DETAILS:
				return getDeleteEventDetails();
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_REQUEST:
				return getDeleteMonitoredItemsRequest();
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_RESPONSE:
				return getDeleteMonitoredItemsResponse();
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_ITEM:
				return getDeleteNodesItem();
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_REQUEST:
				return getDeleteNodesRequest();
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_RESPONSE:
				return getDeleteNodesResponse();
			case TypesPackage.DOCUMENT_ROOT__DELETE_RAW_MODIFIED_DETAILS:
				return getDeleteRawModifiedDetails();
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_ITEM:
				return getDeleteReferencesItem();
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_REQUEST:
				return getDeleteReferencesRequest();
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_RESPONSE:
				return getDeleteReferencesResponse();
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_REQUEST:
				return getDeleteSubscriptionsRequest();
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_RESPONSE:
				return getDeleteSubscriptionsResponse();
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTIC_INFO:
				return getDiagnosticInfo();
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTICS_LEVEL:
				return getDiagnosticsLevel();
			case TypesPackage.DOCUMENT_ROOT__DISCOVERY_CONFIGURATION:
				return getDiscoveryConfiguration();
			case TypesPackage.DOCUMENT_ROOT__DOUBLE:
				return getDouble();
			case TypesPackage.DOCUMENT_ROOT__DOUBLE_COMPLEX_NUMBER_TYPE:
				return getDoubleComplexNumberType();
			case TypesPackage.DOCUMENT_ROOT__DURATION:
				return getDuration();
			case TypesPackage.DOCUMENT_ROOT__DURATION_STRING:
				return getDurationString();
			case TypesPackage.DOCUMENT_ROOT__ELEMENT_OPERAND:
				return getElementOperand();
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_CONFIGURATION:
				return getEndpointConfiguration();
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_DESCRIPTION:
				return getEndpointDescription();
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_TYPE:
				return getEndpointType();
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_URL_LIST_DATA_TYPE:
				return getEndpointUrlListDataType();
			case TypesPackage.DOCUMENT_ROOT__ENUM_DEFINITION:
				return getEnumDefinition();
			case TypesPackage.DOCUMENT_ROOT__ENUM_DESCRIPTION:
				return getEnumDescription();
			case TypesPackage.DOCUMENT_ROOT__ENUM_FIELD:
				return getEnumField();
			case TypesPackage.DOCUMENT_ROOT__ENUM_VALUE_TYPE:
				return getEnumValueType();
			case TypesPackage.DOCUMENT_ROOT__EU_INFORMATION:
				return getEUInformation();
			case TypesPackage.DOCUMENT_ROOT__EVENT_FIELD_LIST:
				return getEventFieldList();
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER:
				return getEventFilter();
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER_RESULT:
				return getEventFilterResult();
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFICATION_LIST:
				return getEventNotificationList();
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFIER_TYPE:
				return getEventNotifierType();
			case TypesPackage.DOCUMENT_ROOT__EXCEPTION_DEVIATION_FORMAT:
				return getExceptionDeviationFormat();
			case TypesPackage.DOCUMENT_ROOT__EXPANDED_NODE_ID:
				return getExpandedNodeId();
			case TypesPackage.DOCUMENT_ROOT__EXTENSION_OBJECT:
				return getExtensionObject();
			case TypesPackage.DOCUMENT_ROOT__FIELD_META_DATA:
				return getFieldMetaData();
			case TypesPackage.DOCUMENT_ROOT__FIELD_TARGET_DATA_TYPE:
				return getFieldTargetDataType();
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERAND:
				return getFilterOperand();
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERATOR:
				return getFilterOperator();
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_REQUEST:
				return getFindServersOnNetworkRequest();
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_RESPONSE:
				return getFindServersOnNetworkResponse();
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_REQUEST:
				return getFindServersRequest();
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_RESPONSE:
				return getFindServersResponse();
			case TypesPackage.DOCUMENT_ROOT__FLOAT:
				return getFloat();
			case TypesPackage.DOCUMENT_ROOT__FRAME:
				return getFrame();
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTES:
				return getGenericAttributes();
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTE_VALUE:
				return getGenericAttributeValue();
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_REQUEST:
				return getGetEndpointsRequest();
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_RESPONSE:
				return getGetEndpointsResponse();
			case TypesPackage.DOCUMENT_ROOT__GUID:
				return getGuid();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_DATA:
				return getHistoryData();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT:
				return getHistoryEvent();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT_FIELD_LIST:
				return getHistoryEventFieldList();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_MODIFIED_DATA:
				return getHistoryModifiedData();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_DETAILS:
				return getHistoryReadDetails();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_REQUEST:
				return getHistoryReadRequest();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESPONSE:
				return getHistoryReadResponse();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESULT:
				return getHistoryReadResult();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_VALUE_ID:
				return getHistoryReadValueId();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_DETAILS:
				return getHistoryUpdateDetails();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_REQUEST:
				return getHistoryUpdateRequest();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESPONSE:
				return getHistoryUpdateResponse();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESULT:
				return getHistoryUpdateResult();
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_TYPE:
				return getHistoryUpdateType();
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_CRITERIA_TYPE:
				return getIdentityCriteriaType();
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_MAPPING_RULE_TYPE:
				return getIdentityMappingRuleType();
			case TypesPackage.DOCUMENT_ROOT__ID_TYPE:
				return getIdType();
			case TypesPackage.DOCUMENT_ROOT__IMAGE_BMP:
				return getImageBMP();
			case TypesPackage.DOCUMENT_ROOT__IMAGE_GIF:
				return getImageGIF();
			case TypesPackage.DOCUMENT_ROOT__IMAGE_JPG:
				return getImageJPG();
			case TypesPackage.DOCUMENT_ROOT__IMAGE_PNG:
				return getImagePNG();
			case TypesPackage.DOCUMENT_ROOT__INDEX:
				return getIndex();
			case TypesPackage.DOCUMENT_ROOT__INSTANCE_NODE:
				return getInstanceNode();
			case TypesPackage.DOCUMENT_ROOT__INT16:
				return getInt16();
			case TypesPackage.DOCUMENT_ROOT__INT32:
				return getInt32();
			case TypesPackage.DOCUMENT_ROOT__INT64:
				return getInt64();
			case TypesPackage.DOCUMENT_ROOT__INTEGER_ID:
				return getIntegerId();
			case TypesPackage.DOCUMENT_ROOT__INVOKE_SERVICE_REQUEST:
				return getInvokeServiceRequest();
			case TypesPackage.DOCUMENT_ROOT__INVOKE_SERVICE_RESPONSE:
				return getInvokeServiceResponse();
			case TypesPackage.DOCUMENT_ROOT__ISSUED_IDENTITY_TOKEN:
				return getIssuedIdentityToken();
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				return getJsonDataSetMessageContentMask();
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getJsonDataSetReaderMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getJsonDataSetWriterMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__JSON_NETWORK_MESSAGE_CONTENT_MASK:
				return getJsonNetworkMessageContentMask();
			case TypesPackage.DOCUMENT_ROOT__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getJsonWriterGroupMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__KEY_VALUE_PAIR:
				return getKeyValuePair();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_ITEM:
				return getListOfAddNodesItem();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_RESULT:
				return getListOfAddNodesResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_REFERENCES_ITEM:
				return getListOfAddReferencesItem();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ALIAS_NAME_DATA_TYPE:
				return getListOfAliasNameDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_APPLICATION_DESCRIPTION:
				return getListOfApplicationDescription();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ARGUMENT:
				return getListOfArgument();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BOOLEAN:
				return getListOfBoolean();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				return getListOfBrokerConnectionTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return getListOfBrokerDataSetReaderTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return getListOfBrokerDataSetWriterTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				return getListOfBrokerTransportQualityOfService();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getListOfBrokerWriterGroupTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_DESCRIPTION:
				return getListOfBrowseDescription();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH:
				return getListOfBrowsePath();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_RESULT:
				return getListOfBrowsePathResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_TARGET:
				return getListOfBrowsePathTarget();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_RESULT:
				return getListOfBrowseResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE:
				return getListOfByte();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE_STRING:
				return getListOfByteString();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_REQUEST:
				return getListOfCallMethodRequest();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_RESULT:
				return getListOfCallMethodResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CARTESIAN_COORDINATES:
				return getListOfCartesianCoordinates();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONFIGURATION_VERSION_DATA_TYPE:
				return getListOfConfigurationVersionDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE:
				return getListOfConnectionTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER:
				return getListOfContentFilter();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT:
				return getListOfContentFilterElement();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT_RESULT:
				return getListOfContentFilterElementResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CURRENCY_UNIT_TYPE:
				return getListOfCurrencyUnitType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				return getListOfDatagramConnectionTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getListOfDatagramWriterGroupTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_FIELD_CONTENT_MASK:
				return getListOfDataSetFieldContentMask();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_META_DATA_TYPE:
				return getListOfDataSetMetaDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_ORDERING_TYPE:
				return getListOfDataSetOrderingType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_DATA_TYPE:
				return getListOfDataSetReaderDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getListOfDataSetReaderMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return getListOfDataSetReaderTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_DATA_TYPE:
				return getListOfDataSetWriterDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getListOfDataSetWriterMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return getListOfDataSetWriterTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DEFINITION:
				return getListOfDataTypeDefinition();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DESCRIPTION:
				return getListOfDataTypeDescription();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_SCHEMA_HEADER:
				return getListOfDataTypeSchemaHeader();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_VALUE:
				return getListOfDataValue();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATE_TIME:
				return getListOfDateTime();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_NODES_ITEM:
				return getListOfDeleteNodesItem();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_REFERENCES_ITEM:
				return getListOfDeleteReferencesItem();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTIC_INFO:
				return getListOfDiagnosticInfo();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTICS_LEVEL:
				return getListOfDiagnosticsLevel();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DOUBLE:
				return getListOfDouble();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_CONFIGURATION:
				return getListOfEndpointConfiguration();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_DESCRIPTION:
				return getListOfEndpointDescription();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_TYPE:
				return getListOfEndpointType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE:
				return getListOfEndpointUrlListDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DEFINITION:
				return getListOfEnumDefinition();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DESCRIPTION:
				return getListOfEnumDescription();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_FIELD:
				return getListOfEnumField();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_VALUE_TYPE:
				return getListOfEnumValueType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EVENT_FIELD_LIST:
				return getListOfEventFieldList();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXPANDED_NODE_ID:
				return getListOfExpandedNodeId();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXTENSION_OBJECT:
				return getListOfExtensionObject();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_META_DATA:
				return getListOfFieldMetaData();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_TARGET_DATA_TYPE:
				return getListOfFieldTargetDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FLOAT:
				return getListOfFloat();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FRAME:
				return getListOfFrame();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GENERIC_ATTRIBUTE_VALUE:
				return getListOfGenericAttributeValue();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GUID:
				return getListOfGuid();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_EVENT_FIELD_LIST:
				return getListOfHistoryEventFieldList();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_RESULT:
				return getListOfHistoryReadResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_VALUE_ID:
				return getListOfHistoryReadValueId();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_UPDATE_RESULT:
				return getListOfHistoryUpdateResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_CRITERIA_TYPE:
				return getListOfIdentityCriteriaType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_MAPPING_RULE_TYPE:
				return getListOfIdentityMappingRuleType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ID_TYPE:
				return getListOfIdType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT16:
				return getListOfInt16();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT32:
				return getListOfInt32();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT64:
				return getListOfInt64();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				return getListOfJsonDataSetMessageContentMask();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getListOfJsonDataSetReaderMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getListOfJsonDataSetWriterMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK:
				return getListOfJsonNetworkMessageContentMask();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getListOfJsonWriterGroupMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_KEY_VALUE_PAIR:
				return getListOfKeyValuePair();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_LOCALIZED_TEXT:
				return getListOfLocalizedText();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODEL_CHANGE_STRUCTURE_DATA_TYPE:
				return getListOfModelChangeStructureDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODIFICATION_INFO:
				return getListOfModificationInfo();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_REQUEST:
				return getListOfMonitoredItemCreateRequest();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_RESULT:
				return getListOfMonitoredItemCreateResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_REQUEST:
				return getListOfMonitoredItemModifyRequest();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_RESULT:
				return getListOfMonitoredItemModifyResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_NOTIFICATION:
				return getListOfMonitoredItemNotification();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_DATA_TYPE:
				return getListOfNetworkAddressDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE:
				return getListOfNetworkAddressUrlDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_GROUP_DATA_TYPE:
				return getListOfNetworkGroupDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE:
				return getListOfNode();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_ID:
				return getListOfNodeId();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_REFERENCE:
				return getListOfNodeReference();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_TYPE_DESCRIPTION:
				return getListOfNodeTypeDescription();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPEN_FILE_MODE:
				return getListOfOpenFileMode();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPTION_SET:
				return getListOfOptionSet();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ORIENTATION:
				return getListOfOrientation();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OVERRIDE_VALUE_HANDLING:
				return getListOfOverrideValueHandling();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PARSING_RESULT:
				return getListOfParsingResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE:
				return getListOfPublishedDataItemsDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE:
				return getListOfPublishedDataSetDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				return getListOfPublishedDataSetSourceDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_EVENTS_DATA_TYPE:
				return getListOfPublishedEventsDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_VARIABLE_DATA_TYPE:
				return getListOfPublishedVariableDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE:
				return getListOfPubSubConfigurationDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE:
				return getListOfPubSubConnectionDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				return getListOfPubSubDiagnosticsCounterClassification();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_GROUP_DATA_TYPE:
				return getListOfPubSubGroupDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_STATE:
				return getListOfPubSubState();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUALIFIED_NAME:
				return getListOfQualifiedName();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_DESCRIPTION:
				return getListOfQueryDataDescription();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_SET:
				return getListOfQueryDataSet();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RATIONAL_NUMBER:
				return getListOfRationalNumber();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_DATA_TYPE:
				return getListOfReaderGroupDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE:
				return getListOfReaderGroupMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE:
				return getListOfReaderGroupTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READ_VALUE_ID:
				return getListOfReadValueId();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REDUNDANT_SERVER_DATA_TYPE:
				return getListOfRedundantServerDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_DESCRIPTION:
				return getListOfReferenceDescription();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_NODE:
				return getListOfReferenceNode();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REGISTERED_SERVER:
				return getListOfRegisteredServer();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RELATIVE_PATH_ELEMENT:
				return getListOfRelativePathElement();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ROLE_PERMISSION_TYPE:
				return getListOfRolePermissionType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				return getListOfSamplingIntervalDiagnosticsDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SBYTE:
				return getListOfSByte();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				return getListOfSemanticChangeStructureDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SERVER_ON_NETWORK:
				return getListOfServerOnNetwork();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE:
				return getListOfSessionDiagnosticsDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				return getListOfSessionSecurityDiagnosticsDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIGNED_SOFTWARE_CERTIFICATE:
				return getListOfSignedSoftwareCertificate();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_ATTRIBUTE_OPERAND:
				return getListOfSimpleAttributeOperand();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_TYPE_DESCRIPTION:
				return getListOfSimpleTypeDescription();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_CODE:
				return getListOfStatusCode();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_RESULT:
				return getListOfStatusResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRING:
				return getListOfString();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DEFINITION:
				return getListOfStructureDefinition();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DESCRIPTION:
				return getListOfStructureDescription();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_FIELD:
				return getListOfStructureField();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE:
				return getListOfSubscribedDataSetDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				return getListOfSubscribedDataSetMirrorDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT:
				return getListOfSubscriptionAcknowledgement();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				return getListOfSubscriptionDiagnosticsDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TARGET_VARIABLES_DATA_TYPE:
				return getListOfTargetVariablesDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DCARTESIAN_COORDINATES:
				return getListOfThreeDCartesianCoordinates();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DFRAME:
				return getListOfThreeDFrame();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DORIENTATION:
				return getListOfThreeDOrientation();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DVECTOR:
				return getListOfThreeDVector();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TIME_ZONE_DATA_TYPE:
				return getListOfTimeZoneDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRANSFER_RESULT:
				return getListOfTransferResult();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRUST_LIST_DATA_TYPE:
				return getListOfTrustListDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UA_BINARY_FILE_DATA_TYPE:
				return getListOfUABinaryFileDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				return getListOfUadpDataSetMessageContentMask();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getListOfUadpDataSetReaderMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getListOfUadpDataSetWriterMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK:
				return getListOfUadpNetworkMessageContentMask();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getListOfUadpWriterGroupMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT16:
				return getListOfUInt16();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT32:
				return getListOfUInt32();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT64:
				return getListOfUInt64();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UNION:
				return getListOfUnion();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_USER_TOKEN_POLICY:
				return getListOfUserTokenPolicy();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VARIANT:
				return getListOfVariant();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VECTOR:
				return getListOfVector();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_DATA_TYPE:
				return getListOfWriterGroupDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getListOfWriterGroupMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getListOfWriterGroupTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITE_VALUE:
				return getListOfWriteValue();
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_XML_ELEMENT:
				return getListOfXmlElement();
			case TypesPackage.DOCUMENT_ROOT__LITERAL_OPERAND:
				return getLiteralOperand();
			case TypesPackage.DOCUMENT_ROOT__LOCALE_ID:
				return getLocaleId();
			case TypesPackage.DOCUMENT_ROOT__LOCALIZED_TEXT:
				return getLocalizedText();
			case TypesPackage.DOCUMENT_ROOT__MDNS_DISCOVERY_CONFIGURATION:
				return getMdnsDiscoveryConfiguration();
			case TypesPackage.DOCUMENT_ROOT__MESSAGE_SECURITY_MODE:
				return getMessageSecurityMode();
			case TypesPackage.DOCUMENT_ROOT__METHOD_ATTRIBUTES:
				return getMethodAttributes();
			case TypesPackage.DOCUMENT_ROOT__METHOD_NODE:
				return getMethodNode();
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_DATA_TYPE:
				return getModelChangeStructureDataType();
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_VERB_MASK:
				return getModelChangeStructureVerbMask();
			case TypesPackage.DOCUMENT_ROOT__MODIFICATION_INFO:
				return getModificationInfo();
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_REQUEST:
				return getModifyMonitoredItemsRequest();
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_RESPONSE:
				return getModifyMonitoredItemsResponse();
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_REQUEST:
				return getModifySubscriptionRequest();
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_RESPONSE:
				return getModifySubscriptionResponse();
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_REQUEST:
				return getMonitoredItemCreateRequest();
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_RESULT:
				return getMonitoredItemCreateResult();
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_REQUEST:
				return getMonitoredItemModifyRequest();
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_RESULT:
				return getMonitoredItemModifyResult();
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_NOTIFICATION:
				return getMonitoredItemNotification();
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER:
				return getMonitoringFilter();
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER_RESULT:
				return getMonitoringFilterResult();
			case TypesPackage.DOCUMENT_ROOT__MONITORING_MODE:
				return getMonitoringMode();
			case TypesPackage.DOCUMENT_ROOT__MONITORING_PARAMETERS:
				return getMonitoringParameters();
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_DATA_TYPE:
				return getNetworkAddressDataType();
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_URL_DATA_TYPE:
				return getNetworkAddressUrlDataType();
			case TypesPackage.DOCUMENT_ROOT__NETWORK_GROUP_DATA_TYPE:
				return getNetworkGroupDataType();
			case TypesPackage.DOCUMENT_ROOT__NODE:
				return getNode();
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES:
				return getNodeAttributes();
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES_MASK:
				return getNodeAttributesMask();
			case TypesPackage.DOCUMENT_ROOT__NODE_CLASS:
				return getNodeClass();
			case TypesPackage.DOCUMENT_ROOT__NODE_ID:
				return getNodeId();
			case TypesPackage.DOCUMENT_ROOT__NODE_REFERENCE:
				return getNodeReference();
			case TypesPackage.DOCUMENT_ROOT__NODE_TYPE_DESCRIPTION:
				return getNodeTypeDescription();
			case TypesPackage.DOCUMENT_ROOT__NORMALIZED_STRING:
				return getNormalizedString();
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_DATA:
				return getNotificationData();
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_MESSAGE:
				return getNotificationMessage();
			case TypesPackage.DOCUMENT_ROOT__NUMERIC_RANGE:
				return getNumericRange();
			case TypesPackage.DOCUMENT_ROOT__OBJECT_ATTRIBUTES:
				return getObjectAttributes();
			case TypesPackage.DOCUMENT_ROOT__OBJECT_NODE:
				return getObjectNode();
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_ATTRIBUTES:
				return getObjectTypeAttributes();
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_NODE:
				return getObjectTypeNode();
			case TypesPackage.DOCUMENT_ROOT__OPEN_FILE_MODE:
				return getOpenFileMode();
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_REQUEST:
				return getOpenSecureChannelRequest();
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_RESPONSE:
				return getOpenSecureChannelResponse();
			case TypesPackage.DOCUMENT_ROOT__OPTION_SET:
				return getOptionSet();
			case TypesPackage.DOCUMENT_ROOT__ORIENTATION:
				return getOrientation();
			case TypesPackage.DOCUMENT_ROOT__OVERRIDE_VALUE_HANDLING:
				return getOverrideValueHandling();
			case TypesPackage.DOCUMENT_ROOT__PARSING_RESULT:
				return getParsingResult();
			case TypesPackage.DOCUMENT_ROOT__PERFORM_UPDATE_TYPE:
				return getPerformUpdateType();
			case TypesPackage.DOCUMENT_ROOT__PERMISSION_TYPE:
				return getPermissionType();
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC2_DATA_TYPE:
				return getProgramDiagnostic2DataType();
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC_DATA_TYPE:
				return getProgramDiagnosticDataType();
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_ITEMS_DATA_TYPE:
				return getPublishedDataItemsDataType();
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_DATA_TYPE:
				return getPublishedDataSetDataType();
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				return getPublishedDataSetSourceDataType();
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_EVENTS_DATA_TYPE:
				return getPublishedEventsDataType();
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_VARIABLE_DATA_TYPE:
				return getPublishedVariableDataType();
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_REQUEST:
				return getPublishRequest();
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_RESPONSE:
				return getPublishResponse();
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONFIGURATION_DATA_TYPE:
				return getPubSubConfigurationDataType();
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONNECTION_DATA_TYPE:
				return getPubSubConnectionDataType();
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				return getPubSubDiagnosticsCounterClassification();
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_GROUP_DATA_TYPE:
				return getPubSubGroupDataType();
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_STATE:
				return getPubSubState();
			case TypesPackage.DOCUMENT_ROOT__QUALIFIED_NAME:
				return getQualifiedName();
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_DESCRIPTION:
				return getQueryDataDescription();
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_SET:
				return getQueryDataSet();
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_REQUEST:
				return getQueryFirstRequest();
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_RESPONSE:
				return getQueryFirstResponse();
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_REQUEST:
				return getQueryNextRequest();
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_RESPONSE:
				return getQueryNextResponse();
			case TypesPackage.DOCUMENT_ROOT__RANGE:
				return getRange();
			case TypesPackage.DOCUMENT_ROOT__RATIONAL_NUMBER:
				return getRationalNumber();
			case TypesPackage.DOCUMENT_ROOT__READ_ANNOTATION_DATA_DETAILS:
				return getReadAnnotationDataDetails();
			case TypesPackage.DOCUMENT_ROOT__READ_AT_TIME_DETAILS:
				return getReadAtTimeDetails();
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_DATA_TYPE:
				return getReaderGroupDataType();
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_MESSAGE_DATA_TYPE:
				return getReaderGroupMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_TRANSPORT_DATA_TYPE:
				return getReaderGroupTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__READ_EVENT_DETAILS:
				return getReadEventDetails();
			case TypesPackage.DOCUMENT_ROOT__READ_PROCESSED_DETAILS:
				return getReadProcessedDetails();
			case TypesPackage.DOCUMENT_ROOT__READ_RAW_MODIFIED_DETAILS:
				return getReadRawModifiedDetails();
			case TypesPackage.DOCUMENT_ROOT__READ_REQUEST:
				return getReadRequest();
			case TypesPackage.DOCUMENT_ROOT__READ_RESPONSE:
				return getReadResponse();
			case TypesPackage.DOCUMENT_ROOT__READ_VALUE_ID:
				return getReadValueId();
			case TypesPackage.DOCUMENT_ROOT__REDUNDANCY_SUPPORT:
				return getRedundancySupport();
			case TypesPackage.DOCUMENT_ROOT__REDUNDANT_SERVER_DATA_TYPE:
				return getRedundantServerDataType();
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_DESCRIPTION:
				return getReferenceDescription();
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_NODE:
				return getReferenceNode();
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_ATTRIBUTES:
				return getReferenceTypeAttributes();
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_NODE:
				return getReferenceTypeNode();
			case TypesPackage.DOCUMENT_ROOT__REGISTERED_SERVER:
				return getRegisteredServer();
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_REQUEST:
				return getRegisterNodesRequest();
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_RESPONSE:
				return getRegisterNodesResponse();
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_REQUEST:
				return getRegisterServer2Request();
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_RESPONSE:
				return getRegisterServer2Response();
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_REQUEST:
				return getRegisterServerRequest();
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_RESPONSE:
				return getRegisterServerResponse();
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH:
				return getRelativePath();
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH_ELEMENT:
				return getRelativePathElement();
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_REQUEST:
				return getRepublishRequest();
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_RESPONSE:
				return getRepublishResponse();
			case TypesPackage.DOCUMENT_ROOT__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.DOCUMENT_ROOT__ROLE_PERMISSION_TYPE:
				return getRolePermissionType();
			case TypesPackage.DOCUMENT_ROOT__RSA_ENCRYPTED_SECRET:
				return getRsaEncryptedSecret();
			case TypesPackage.DOCUMENT_ROOT__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				return getSamplingIntervalDiagnosticsDataType();
			case TypesPackage.DOCUMENT_ROOT__SBYTE:
				return getSByte();
			case TypesPackage.DOCUMENT_ROOT__SECURITY_TOKEN_REQUEST_TYPE:
				return getSecurityTokenRequestType();
			case TypesPackage.DOCUMENT_ROOT__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				return getSemanticChangeStructureDataType();
			case TypesPackage.DOCUMENT_ROOT__SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE:
				return getServerDiagnosticsSummaryDataType();
			case TypesPackage.DOCUMENT_ROOT__SERVER_ON_NETWORK:
				return getServerOnNetwork();
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATE:
				return getServerState();
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATUS_DATA_TYPE:
				return getServerStatusDataType();
			case TypesPackage.DOCUMENT_ROOT__SERVICE_COUNTER_DATA_TYPE:
				return getServiceCounterDataType();
			case TypesPackage.DOCUMENT_ROOT__SERVICE_FAULT:
				return getServiceFault();
			case TypesPackage.DOCUMENT_ROOT__SESSION_AUTHENTICATION_TOKEN:
				return getSessionAuthenticationToken();
			case TypesPackage.DOCUMENT_ROOT__SESSION_DIAGNOSTICS_DATA_TYPE:
				return getSessionDiagnosticsDataType();
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_REQUEST_TYPE:
				return getSessionlessInvokeRequestType();
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_RESPONSE_TYPE:
				return getSessionlessInvokeResponseType();
			case TypesPackage.DOCUMENT_ROOT__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				return getSessionSecurityDiagnosticsDataType();
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_REQUEST:
				return getSetMonitoringModeRequest();
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_RESPONSE:
				return getSetMonitoringModeResponse();
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_REQUEST:
				return getSetPublishingModeRequest();
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_RESPONSE:
				return getSetPublishingModeResponse();
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_REQUEST:
				return getSetTriggeringRequest();
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_RESPONSE:
				return getSetTriggeringResponse();
			case TypesPackage.DOCUMENT_ROOT__SIGNATURE_DATA:
				return getSignatureData();
			case TypesPackage.DOCUMENT_ROOT__SIGNED_SOFTWARE_CERTIFICATE:
				return getSignedSoftwareCertificate();
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_ATTRIBUTE_OPERAND:
				return getSimpleAttributeOperand();
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_TYPE_DESCRIPTION:
				return getSimpleTypeDescription();
			case TypesPackage.DOCUMENT_ROOT__STATUS_CHANGE_NOTIFICATION:
				return getStatusChangeNotification();
			case TypesPackage.DOCUMENT_ROOT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.DOCUMENT_ROOT__STATUS_RESULT:
				return getStatusResult();
			case TypesPackage.DOCUMENT_ROOT__STRING:
				return getString();
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				return getStructureDefinition();
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DESCRIPTION:
				return getStructureDescription();
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_FIELD:
				return getStructureField();
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_TYPE:
				return getStructureType();
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_DATA_TYPE:
				return getSubscribedDataSetDataType();
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				return getSubscribedDataSetMirrorDataType();
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_ACKNOWLEDGEMENT:
				return getSubscriptionAcknowledgement();
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				return getSubscriptionDiagnosticsDataType();
			case TypesPackage.DOCUMENT_ROOT__TARGET_VARIABLES_DATA_TYPE:
				return getTargetVariablesDataType();
			case TypesPackage.DOCUMENT_ROOT__THREE_DCARTESIAN_COORDINATES:
				return getThreeDCartesianCoordinates();
			case TypesPackage.DOCUMENT_ROOT__THREE_DFRAME:
				return getThreeDFrame();
			case TypesPackage.DOCUMENT_ROOT__THREE_DORIENTATION:
				return getThreeDOrientation();
			case TypesPackage.DOCUMENT_ROOT__THREE_DVECTOR:
				return getThreeDVector();
			case TypesPackage.DOCUMENT_ROOT__TIME:
				return getTime();
			case TypesPackage.DOCUMENT_ROOT__TIMESTAMPS_TO_RETURN:
				return getTimestampsToReturn();
			case TypesPackage.DOCUMENT_ROOT__TIME_STRING:
				return getTimeString();
			case TypesPackage.DOCUMENT_ROOT__TIME_ZONE_DATA_TYPE:
				return getTimeZoneDataType();
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_RESULT:
				return getTransferResult();
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_REQUEST:
				return getTransferSubscriptionsRequest();
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_RESPONSE:
				return getTransferSubscriptionsResponse();
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST:
				return getTranslateBrowsePathsToNodeIdsRequest();
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_RESPONSE:
				return getTranslateBrowsePathsToNodeIdsResponse();
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_DATA_TYPE:
				return getTrustListDataType();
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_MASKS:
				return getTrustListMasks();
			case TypesPackage.DOCUMENT_ROOT__TYPE_NODE:
				return getTypeNode();
			case TypesPackage.DOCUMENT_ROOT__UA_BINARY_FILE_DATA_TYPE:
				return getUABinaryFileDataType();
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				return getUadpDataSetMessageContentMask();
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getUadpDataSetReaderMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getUadpDataSetWriterMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__UADP_NETWORK_MESSAGE_CONTENT_MASK:
				return getUadpNetworkMessageContentMask();
			case TypesPackage.DOCUMENT_ROOT__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getUadpWriterGroupMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__UINT16:
				return getUInt16();
			case TypesPackage.DOCUMENT_ROOT__UINT32:
				return getUInt32();
			case TypesPackage.DOCUMENT_ROOT__UINT64:
				return getUInt64();
			case TypesPackage.DOCUMENT_ROOT__UNION:
				return getUnion();
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_REQUEST:
				return getUnregisterNodesRequest();
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_RESPONSE:
				return getUnregisterNodesResponse();
			case TypesPackage.DOCUMENT_ROOT__UPDATE_DATA_DETAILS:
				return getUpdateDataDetails();
			case TypesPackage.DOCUMENT_ROOT__UPDATE_EVENT_DETAILS:
				return getUpdateEventDetails();
			case TypesPackage.DOCUMENT_ROOT__UPDATE_STRUCTURE_DATA_DETAILS:
				return getUpdateStructureDataDetails();
			case TypesPackage.DOCUMENT_ROOT__USER_IDENTITY_TOKEN:
				return getUserIdentityToken();
			case TypesPackage.DOCUMENT_ROOT__USER_NAME_IDENTITY_TOKEN:
				return getUserNameIdentityToken();
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_POLICY:
				return getUserTokenPolicy();
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_TYPE:
				return getUserTokenType();
			case TypesPackage.DOCUMENT_ROOT__UTC_TIME:
				return getUtcTime();
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_ATTRIBUTES:
				return getVariableAttributes();
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_NODE:
				return getVariableNode();
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_ATTRIBUTES:
				return getVariableTypeAttributes();
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_NODE:
				return getVariableTypeNode();
			case TypesPackage.DOCUMENT_ROOT__VARIANT:
				return getVariant();
			case TypesPackage.DOCUMENT_ROOT__VECTOR:
				return getVector();
			case TypesPackage.DOCUMENT_ROOT__VERSION_TIME:
				return getVersionTime();
			case TypesPackage.DOCUMENT_ROOT__VIEW_ATTRIBUTES:
				return getViewAttributes();
			case TypesPackage.DOCUMENT_ROOT__VIEW_DESCRIPTION:
				return getViewDescription();
			case TypesPackage.DOCUMENT_ROOT__VIEW_NODE:
				return getViewNode();
			case TypesPackage.DOCUMENT_ROOT__WRITE_REQUEST:
				return getWriteRequest();
			case TypesPackage.DOCUMENT_ROOT__WRITE_RESPONSE:
				return getWriteResponse();
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_DATA_TYPE:
				return getWriterGroupDataType();
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getWriterGroupMessageDataType();
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getWriterGroupTransportDataType();
			case TypesPackage.DOCUMENT_ROOT__WRITE_VALUE:
				return getWriteValue();
			case TypesPackage.DOCUMENT_ROOT__X509_IDENTITY_TOKEN:
				return getX509IdentityToken();
			case TypesPackage.DOCUMENT_ROOT__XV_TYPE:
				return getXVType();
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
			case TypesPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ACCESS_LEVEL_EX_TYPE:
				setAccessLevelExType((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ACCESS_LEVEL_TYPE:
				setAccessLevelType((Short)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_REQUEST:
				setActivateSessionRequest((ActivateSessionRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_RESPONSE:
				setActivateSessionResponse((ActivateSessionResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_ITEM:
				setAddNodesItem((AddNodesItem)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_REQUEST:
				setAddNodesRequest((AddNodesRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESPONSE:
				setAddNodesResponse((AddNodesResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESULT:
				setAddNodesResult((AddNodesResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_ITEM:
				setAddReferencesItem((AddReferencesItem)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_REQUEST:
				setAddReferencesRequest((AddReferencesRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_RESPONSE:
				setAddReferencesResponse((AddReferencesResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_CONFIGURATION:
				setAggregateConfiguration((AggregateConfiguration)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER:
				setAggregateFilter((AggregateFilter)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER_RESULT:
				setAggregateFilterResult((AggregateFilterResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ALIAS_NAME_DATA_TYPE:
				setAliasNameDataType((AliasNameDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ANONYMOUS_IDENTITY_TOKEN:
				setAnonymousIdentityToken((AnonymousIdentityToken)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_DESCRIPTION:
				setApplicationDescription((ApplicationDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_INSTANCE_CERTIFICATE:
				setApplicationInstanceCertificate((byte[])newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_TYPE:
				setApplicationType((ApplicationType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ARGUMENT:
				setArgument((Argument)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_OPERAND:
				setAttributeOperand((AttributeOperand)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_WRITE_MASK:
				setAttributeWriteMask((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__AUDIO_DATA_TYPE:
				setAudioDataType((byte[])newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__AXIS_INFORMATION:
				setAxisInformation((AxisInformation)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__AXIS_SCALE_ENUMERATION:
				setAxisScaleEnumeration((AxisScaleEnumeration)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BIT_FIELD_MASK_DATA_TYPE:
				setBitFieldMaskDataType((BigInteger)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BOOLEAN:
				setBoolean((Boolean)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				setBrokerConnectionTransportDataType((BrokerConnectionTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				setBrokerDataSetReaderTransportDataType((BrokerDataSetReaderTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				setBrokerDataSetWriterTransportDataType((BrokerDataSetWriterTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				setBrokerTransportQualityOfService((BrokerTransportQualityOfService)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setBrokerWriterGroupTransportDataType((BrokerWriterGroupTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DESCRIPTION:
				setBrowseDescription((BrowseDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DIRECTION:
				setBrowseDirection((BrowseDirection)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_REQUEST:
				setBrowseNextRequest((BrowseNextRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_RESPONSE:
				setBrowseNextResponse((BrowseNextResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH:
				setBrowsePath((BrowsePath)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_RESULT:
				setBrowsePathResult((BrowsePathResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_TARGET:
				setBrowsePathTarget((BrowsePathTarget)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_REQUEST:
				setBrowseRequest((BrowseRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESPONSE:
				setBrowseResponse((BrowseResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT:
				setBrowseResult((BrowseResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT_MASK:
				setBrowseResultMask((BrowseResultMask)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BUILD_INFO:
				setBuildInfo((BuildInfo)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BYTE:
				setByte((Short)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__BYTE_STRING:
				setByteString((byte[])newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_REQUEST:
				setCallMethodRequest((CallMethodRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_RESULT:
				setCallMethodResult((CallMethodResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CALL_REQUEST:
				setCallRequest((CallRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CALL_RESPONSE:
				setCallResponse((CallResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CANCEL_REQUEST:
				setCancelRequest((CancelRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CANCEL_RESPONSE:
				setCancelResponse((CancelResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CARTESIAN_COORDINATES:
				setCartesianCoordinates((CartesianCoordinates)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CHANNEL_SECURITY_TOKEN:
				setChannelSecurityToken((ChannelSecurityToken)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_REQUEST:
				setCloseSecureChannelRequest((CloseSecureChannelRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_RESPONSE:
				setCloseSecureChannelResponse((CloseSecureChannelResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_REQUEST:
				setCloseSessionRequest((CloseSessionRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_RESPONSE:
				setCloseSessionResponse((CloseSessionResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__COMPLEX_NUMBER_TYPE:
				setComplexNumberType((ComplexNumberType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONFIGURATION_VERSION_DATA_TYPE:
				setConfigurationVersionDataType((ConfigurationVersionDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONNECTION_TRANSPORT_DATA_TYPE:
				setConnectionTransportDataType((ConnectionTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER:
				setContentFilter((ContentFilter)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT:
				setContentFilterElement((ContentFilterElement)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT_RESULT:
				setContentFilterElementResult((ContentFilterElementResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_RESULT:
				setContentFilterResult((ContentFilterResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONTINUATION_POINT:
				setContinuationPoint((byte[])newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__COUNTER:
				setCounter((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_REQUEST:
				setCreateMonitoredItemsRequest((CreateMonitoredItemsRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_RESPONSE:
				setCreateMonitoredItemsResponse((CreateMonitoredItemsResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_REQUEST:
				setCreateSessionRequest((CreateSessionRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_RESPONSE:
				setCreateSessionResponse((CreateSessionResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_REQUEST:
				setCreateSubscriptionRequest((CreateSubscriptionRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_RESPONSE:
				setCreateSubscriptionResponse((CreateSubscriptionResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CURRENCY_UNIT_TYPE:
				setCurrencyUnitType((CurrencyUnitType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_FILTER:
				setDataChangeFilter((DataChangeFilter)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_NOTIFICATION:
				setDataChangeNotification((DataChangeNotification)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_TRIGGER:
				setDataChangeTrigger((DataChangeTrigger)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				setDatagramConnectionTransportDataType((DatagramConnectionTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setDatagramWriterGroupTransportDataType((DatagramWriterGroupTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_FIELD_CONTENT_MASK:
				setDataSetFieldContentMask((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_FIELD_FLAGS:
				setDataSetFieldFlags((Integer)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_META_DATA_TYPE:
				setDataSetMetaDataType((DataSetMetaDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_ORDERING_TYPE:
				setDataSetOrderingType((DataSetOrderingType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_DATA_TYPE:
				setDataSetReaderDataType((DataSetReaderDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_MESSAGE_DATA_TYPE:
				setDataSetReaderMessageDataType((DataSetReaderMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_TRANSPORT_DATA_TYPE:
				setDataSetReaderTransportDataType((DataSetReaderTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_DATA_TYPE:
				setDataSetWriterDataType((DataSetWriterDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setDataSetWriterMessageDataType((DataSetWriterMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				setDataSetWriterTransportDataType((DataSetWriterTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_ATTRIBUTES:
				setDataTypeAttributes((DataTypeAttributes)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DEFINITION:
				setDataTypeDefinition((DataTypeDefinition)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DESCRIPTION:
				setDataTypeDescription((DataTypeDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_NODE:
				setDataTypeNode((DataTypeNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_SCHEMA_HEADER:
				setDataTypeSchemaHeader((DataTypeSchemaHeader)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_VALUE:
				setDataValue((DataValue)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATE:
				setDate((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATE_STRING:
				setDateString((String)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATE_TIME:
				setDateTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DEADBAND_TYPE:
				setDeadbandType((DeadbandType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_DATA_TYPE:
				setDecimalDataType((DecimalDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_STRING:
				setDecimalString((String)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_AT_TIME_DETAILS:
				setDeleteAtTimeDetails((DeleteAtTimeDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_EVENT_DETAILS:
				setDeleteEventDetails((DeleteEventDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_REQUEST:
				setDeleteMonitoredItemsRequest((DeleteMonitoredItemsRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_RESPONSE:
				setDeleteMonitoredItemsResponse((DeleteMonitoredItemsResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_ITEM:
				setDeleteNodesItem((DeleteNodesItem)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_REQUEST:
				setDeleteNodesRequest((DeleteNodesRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_RESPONSE:
				setDeleteNodesResponse((DeleteNodesResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_RAW_MODIFIED_DETAILS:
				setDeleteRawModifiedDetails((DeleteRawModifiedDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_ITEM:
				setDeleteReferencesItem((DeleteReferencesItem)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_REQUEST:
				setDeleteReferencesRequest((DeleteReferencesRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_RESPONSE:
				setDeleteReferencesResponse((DeleteReferencesResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_REQUEST:
				setDeleteSubscriptionsRequest((DeleteSubscriptionsRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_RESPONSE:
				setDeleteSubscriptionsResponse((DeleteSubscriptionsResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTIC_INFO:
				setDiagnosticInfo((DiagnosticInfo)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTICS_LEVEL:
				setDiagnosticsLevel((DiagnosticsLevel)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DISCOVERY_CONFIGURATION:
				setDiscoveryConfiguration((DiscoveryConfiguration)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DOUBLE:
				setDouble((Double)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DOUBLE_COMPLEX_NUMBER_TYPE:
				setDoubleComplexNumberType((DoubleComplexNumberType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DURATION:
				setDuration((Double)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__DURATION_STRING:
				setDurationString((String)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ELEMENT_OPERAND:
				setElementOperand((ElementOperand)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_CONFIGURATION:
				setEndpointConfiguration((EndpointConfiguration)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_DESCRIPTION:
				setEndpointDescription((EndpointDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_TYPE:
				setEndpointType((EndpointType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_URL_LIST_DATA_TYPE:
				setEndpointUrlListDataType((EndpointUrlListDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENUM_DEFINITION:
				setEnumDefinition((EnumDefinition)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENUM_DESCRIPTION:
				setEnumDescription((EnumDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENUM_FIELD:
				setEnumField((EnumField)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENUM_VALUE_TYPE:
				setEnumValueType((EnumValueType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__EU_INFORMATION:
				setEUInformation((EUInformation)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__EVENT_FIELD_LIST:
				setEventFieldList((EventFieldList)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER:
				setEventFilter((EventFilter)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER_RESULT:
				setEventFilterResult((EventFilterResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFICATION_LIST:
				setEventNotificationList((EventNotificationList)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFIER_TYPE:
				setEventNotifierType((Short)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__EXCEPTION_DEVIATION_FORMAT:
				setExceptionDeviationFormat((ExceptionDeviationFormat)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__EXPANDED_NODE_ID:
				setExpandedNodeId((ExpandedNodeId)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__EXTENSION_OBJECT:
				setExtensionObject((ExtensionObject)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIELD_META_DATA:
				setFieldMetaData((FieldMetaData)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIELD_TARGET_DATA_TYPE:
				setFieldTargetDataType((FieldTargetDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERAND:
				setFilterOperand((FilterOperand)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERATOR:
				setFilterOperator((FilterOperator)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_REQUEST:
				setFindServersOnNetworkRequest((FindServersOnNetworkRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_RESPONSE:
				setFindServersOnNetworkResponse((FindServersOnNetworkResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_REQUEST:
				setFindServersRequest((FindServersRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_RESPONSE:
				setFindServersResponse((FindServersResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FLOAT:
				setFloat((Float)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FRAME:
				setFrame((Frame)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTES:
				setGenericAttributes((GenericAttributes)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTE_VALUE:
				setGenericAttributeValue((GenericAttributeValue)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_REQUEST:
				setGetEndpointsRequest((GetEndpointsRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_RESPONSE:
				setGetEndpointsResponse((GetEndpointsResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__GUID:
				setGuid((Guid)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_DATA:
				setHistoryData((HistoryData)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT:
				setHistoryEvent((HistoryEvent)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT_FIELD_LIST:
				setHistoryEventFieldList((HistoryEventFieldList)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_MODIFIED_DATA:
				setHistoryModifiedData((HistoryModifiedData)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_DETAILS:
				setHistoryReadDetails((HistoryReadDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_REQUEST:
				setHistoryReadRequest((HistoryReadRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESPONSE:
				setHistoryReadResponse((HistoryReadResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESULT:
				setHistoryReadResult((HistoryReadResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_VALUE_ID:
				setHistoryReadValueId((HistoryReadValueId)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_DETAILS:
				setHistoryUpdateDetails((HistoryUpdateDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_REQUEST:
				setHistoryUpdateRequest((HistoryUpdateRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESPONSE:
				setHistoryUpdateResponse((HistoryUpdateResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESULT:
				setHistoryUpdateResult((HistoryUpdateResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_TYPE:
				setHistoryUpdateType((HistoryUpdateType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_CRITERIA_TYPE:
				setIdentityCriteriaType((IdentityCriteriaType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_MAPPING_RULE_TYPE:
				setIdentityMappingRuleType((IdentityMappingRuleType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ID_TYPE:
				setIdType((IdType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__IMAGE_BMP:
				setImageBMP((byte[])newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__IMAGE_GIF:
				setImageGIF((byte[])newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__IMAGE_JPG:
				setImageJPG((byte[])newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__IMAGE_PNG:
				setImagePNG((byte[])newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__INDEX:
				setIndex((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__INSTANCE_NODE:
				setInstanceNode((InstanceNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__INT16:
				setInt16((Short)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__INT32:
				setInt32((Integer)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__INT64:
				setInt64((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__INTEGER_ID:
				setIntegerId((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__INVOKE_SERVICE_REQUEST:
				setInvokeServiceRequest((byte[])newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__INVOKE_SERVICE_RESPONSE:
				setInvokeServiceResponse((byte[])newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ISSUED_IDENTITY_TOKEN:
				setIssuedIdentityToken((IssuedIdentityToken)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				setJsonDataSetMessageContentMask((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				setJsonDataSetReaderMessageDataType((JsonDataSetReaderMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setJsonDataSetWriterMessageDataType((JsonDataSetWriterMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__JSON_NETWORK_MESSAGE_CONTENT_MASK:
				setJsonNetworkMessageContentMask((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				setJsonWriterGroupMessageDataType((JsonWriterGroupMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__KEY_VALUE_PAIR:
				setKeyValuePair((KeyValuePair)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_ITEM:
				setListOfAddNodesItem((ListOfAddNodesItem)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_RESULT:
				setListOfAddNodesResult((ListOfAddNodesResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_REFERENCES_ITEM:
				setListOfAddReferencesItem((ListOfAddReferencesItem)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ALIAS_NAME_DATA_TYPE:
				setListOfAliasNameDataType((ListOfAliasNameDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_APPLICATION_DESCRIPTION:
				setListOfApplicationDescription((ListOfApplicationDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ARGUMENT:
				setListOfArgument((ListOfArgument)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BOOLEAN:
				setListOfBoolean((ListOfBoolean)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				setListOfBrokerConnectionTransportDataType((ListOfBrokerConnectionTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				setListOfBrokerDataSetReaderTransportDataType((ListOfBrokerDataSetReaderTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				setListOfBrokerDataSetWriterTransportDataType((ListOfBrokerDataSetWriterTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				setListOfBrokerTransportQualityOfService((ListOfBrokerTransportQualityOfService)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setListOfBrokerWriterGroupTransportDataType((ListOfBrokerWriterGroupTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_DESCRIPTION:
				setListOfBrowseDescription((ListOfBrowseDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH:
				setListOfBrowsePath((ListOfBrowsePath)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_RESULT:
				setListOfBrowsePathResult((ListOfBrowsePathResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_TARGET:
				setListOfBrowsePathTarget((ListOfBrowsePathTarget)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_RESULT:
				setListOfBrowseResult((ListOfBrowseResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE:
				setListOfByte((ListOfByte)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE_STRING:
				setListOfByteString((ListOfByteString)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_REQUEST:
				setListOfCallMethodRequest((ListOfCallMethodRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_RESULT:
				setListOfCallMethodResult((ListOfCallMethodResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CARTESIAN_COORDINATES:
				setListOfCartesianCoordinates((ListOfCartesianCoordinates)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONFIGURATION_VERSION_DATA_TYPE:
				setListOfConfigurationVersionDataType((ListOfConfigurationVersionDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE:
				setListOfConnectionTransportDataType((ListOfConnectionTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER:
				setListOfContentFilter((ListOfContentFilter)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT:
				setListOfContentFilterElement((ListOfContentFilterElement)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT_RESULT:
				setListOfContentFilterElementResult((ListOfContentFilterElementResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CURRENCY_UNIT_TYPE:
				setListOfCurrencyUnitType((ListOfCurrencyUnitType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				setListOfDatagramConnectionTransportDataType((ListOfDatagramConnectionTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setListOfDatagramWriterGroupTransportDataType((ListOfDatagramWriterGroupTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_FIELD_CONTENT_MASK:
				setListOfDataSetFieldContentMask((ListOfDataSetFieldContentMask)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_META_DATA_TYPE:
				setListOfDataSetMetaDataType((ListOfDataSetMetaDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_ORDERING_TYPE:
				setListOfDataSetOrderingType((ListOfDataSetOrderingType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_DATA_TYPE:
				setListOfDataSetReaderDataType((ListOfDataSetReaderDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE:
				setListOfDataSetReaderMessageDataType((ListOfDataSetReaderMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				setListOfDataSetReaderTransportDataType((ListOfDataSetReaderTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_DATA_TYPE:
				setListOfDataSetWriterDataType((ListOfDataSetWriterDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setListOfDataSetWriterMessageDataType((ListOfDataSetWriterMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				setListOfDataSetWriterTransportDataType((ListOfDataSetWriterTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DEFINITION:
				setListOfDataTypeDefinition((ListOfDataTypeDefinition)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DESCRIPTION:
				setListOfDataTypeDescription((ListOfDataTypeDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_SCHEMA_HEADER:
				setListOfDataTypeSchemaHeader((ListOfDataTypeSchemaHeader)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_VALUE:
				setListOfDataValue((ListOfDataValue)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATE_TIME:
				setListOfDateTime((ListOfDateTime)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_NODES_ITEM:
				setListOfDeleteNodesItem((ListOfDeleteNodesItem)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_REFERENCES_ITEM:
				setListOfDeleteReferencesItem((ListOfDeleteReferencesItem)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTIC_INFO:
				setListOfDiagnosticInfo((ListOfDiagnosticInfo)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTICS_LEVEL:
				setListOfDiagnosticsLevel((ListOfDiagnosticsLevel)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DOUBLE:
				setListOfDouble((ListOfDouble)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_CONFIGURATION:
				setListOfEndpointConfiguration((ListOfEndpointConfiguration)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_DESCRIPTION:
				setListOfEndpointDescription((ListOfEndpointDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_TYPE:
				setListOfEndpointType((ListOfEndpointType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE:
				setListOfEndpointUrlListDataType((ListOfEndpointUrlListDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DEFINITION:
				setListOfEnumDefinition((ListOfEnumDefinition)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DESCRIPTION:
				setListOfEnumDescription((ListOfEnumDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_FIELD:
				setListOfEnumField((ListOfEnumField)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_VALUE_TYPE:
				setListOfEnumValueType((ListOfEnumValueType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EVENT_FIELD_LIST:
				setListOfEventFieldList((ListOfEventFieldList)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXPANDED_NODE_ID:
				setListOfExpandedNodeId((ListOfExpandedNodeId)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXTENSION_OBJECT:
				setListOfExtensionObject((ListOfExtensionObject)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_META_DATA:
				setListOfFieldMetaData((ListOfFieldMetaData)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_TARGET_DATA_TYPE:
				setListOfFieldTargetDataType((ListOfFieldTargetDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FLOAT:
				setListOfFloat((ListOfFloat)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FRAME:
				setListOfFrame((ListOfFrame)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GENERIC_ATTRIBUTE_VALUE:
				setListOfGenericAttributeValue((ListOfGenericAttributeValue)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GUID:
				setListOfGuid((ListOfGuid)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_EVENT_FIELD_LIST:
				setListOfHistoryEventFieldList((ListOfHistoryEventFieldList)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_RESULT:
				setListOfHistoryReadResult((ListOfHistoryReadResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_VALUE_ID:
				setListOfHistoryReadValueId((ListOfHistoryReadValueId)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_UPDATE_RESULT:
				setListOfHistoryUpdateResult((ListOfHistoryUpdateResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_CRITERIA_TYPE:
				setListOfIdentityCriteriaType((ListOfIdentityCriteriaType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_MAPPING_RULE_TYPE:
				setListOfIdentityMappingRuleType((ListOfIdentityMappingRuleType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ID_TYPE:
				setListOfIdType((ListOfIdType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT16:
				setListOfInt16((ListOfInt16)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT32:
				setListOfInt32((ListOfInt32)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT64:
				setListOfInt64((ListOfInt64)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				setListOfJsonDataSetMessageContentMask((ListOfJsonDataSetMessageContentMask)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				setListOfJsonDataSetReaderMessageDataType((ListOfJsonDataSetReaderMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setListOfJsonDataSetWriterMessageDataType((ListOfJsonDataSetWriterMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK:
				setListOfJsonNetworkMessageContentMask((ListOfJsonNetworkMessageContentMask)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				setListOfJsonWriterGroupMessageDataType((ListOfJsonWriterGroupMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_KEY_VALUE_PAIR:
				setListOfKeyValuePair((ListOfKeyValuePair)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_LOCALIZED_TEXT:
				setListOfLocalizedText((ListOfLocalizedText)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODEL_CHANGE_STRUCTURE_DATA_TYPE:
				setListOfModelChangeStructureDataType((ListOfModelChangeStructureDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODIFICATION_INFO:
				setListOfModificationInfo((ListOfModificationInfo)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_REQUEST:
				setListOfMonitoredItemCreateRequest((ListOfMonitoredItemCreateRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_RESULT:
				setListOfMonitoredItemCreateResult((ListOfMonitoredItemCreateResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_REQUEST:
				setListOfMonitoredItemModifyRequest((ListOfMonitoredItemModifyRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_RESULT:
				setListOfMonitoredItemModifyResult((ListOfMonitoredItemModifyResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_NOTIFICATION:
				setListOfMonitoredItemNotification((ListOfMonitoredItemNotification)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_DATA_TYPE:
				setListOfNetworkAddressDataType((ListOfNetworkAddressDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE:
				setListOfNetworkAddressUrlDataType((ListOfNetworkAddressUrlDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_GROUP_DATA_TYPE:
				setListOfNetworkGroupDataType((ListOfNetworkGroupDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE:
				setListOfNode((ListOfNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_ID:
				setListOfNodeId((ListOfNodeId)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_REFERENCE:
				setListOfNodeReference((ListOfNodeReference)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_TYPE_DESCRIPTION:
				setListOfNodeTypeDescription((ListOfNodeTypeDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPEN_FILE_MODE:
				setListOfOpenFileMode((ListOfOpenFileMode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPTION_SET:
				setListOfOptionSet((ListOfOptionSet)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ORIENTATION:
				setListOfOrientation((ListOfOrientation)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OVERRIDE_VALUE_HANDLING:
				setListOfOverrideValueHandling((ListOfOverrideValueHandling)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PARSING_RESULT:
				setListOfParsingResult((ListOfParsingResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE:
				setListOfPublishedDataItemsDataType((ListOfPublishedDataItemsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE:
				setListOfPublishedDataSetDataType((ListOfPublishedDataSetDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				setListOfPublishedDataSetSourceDataType((ListOfPublishedDataSetSourceDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_EVENTS_DATA_TYPE:
				setListOfPublishedEventsDataType((ListOfPublishedEventsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_VARIABLE_DATA_TYPE:
				setListOfPublishedVariableDataType((ListOfPublishedVariableDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE:
				setListOfPubSubConfigurationDataType((ListOfPubSubConfigurationDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE:
				setListOfPubSubConnectionDataType((ListOfPubSubConnectionDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				setListOfPubSubDiagnosticsCounterClassification((ListOfPubSubDiagnosticsCounterClassification)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_GROUP_DATA_TYPE:
				setListOfPubSubGroupDataType((ListOfPubSubGroupDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_STATE:
				setListOfPubSubState((ListOfPubSubState)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUALIFIED_NAME:
				setListOfQualifiedName((ListOfQualifiedName)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_DESCRIPTION:
				setListOfQueryDataDescription((ListOfQueryDataDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_SET:
				setListOfQueryDataSet((ListOfQueryDataSet)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RATIONAL_NUMBER:
				setListOfRationalNumber((ListOfRationalNumber)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_DATA_TYPE:
				setListOfReaderGroupDataType((ListOfReaderGroupDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE:
				setListOfReaderGroupMessageDataType((ListOfReaderGroupMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE:
				setListOfReaderGroupTransportDataType((ListOfReaderGroupTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READ_VALUE_ID:
				setListOfReadValueId((ListOfReadValueId)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REDUNDANT_SERVER_DATA_TYPE:
				setListOfRedundantServerDataType((ListOfRedundantServerDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_DESCRIPTION:
				setListOfReferenceDescription((ListOfReferenceDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_NODE:
				setListOfReferenceNode((ListOfReferenceNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REGISTERED_SERVER:
				setListOfRegisteredServer((ListOfRegisteredServer)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RELATIVE_PATH_ELEMENT:
				setListOfRelativePathElement((ListOfRelativePathElement)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ROLE_PERMISSION_TYPE:
				setListOfRolePermissionType((ListOfRolePermissionType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				setListOfSamplingIntervalDiagnosticsDataType((ListOfSamplingIntervalDiagnosticsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SBYTE:
				setListOfSByte((ListOfSByte)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				setListOfSemanticChangeStructureDataType((ListOfSemanticChangeStructureDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SERVER_ON_NETWORK:
				setListOfServerOnNetwork((ListOfServerOnNetwork)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE:
				setListOfSessionDiagnosticsDataType((ListOfSessionDiagnosticsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				setListOfSessionSecurityDiagnosticsDataType((ListOfSessionSecurityDiagnosticsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIGNED_SOFTWARE_CERTIFICATE:
				setListOfSignedSoftwareCertificate((ListOfSignedSoftwareCertificate)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_ATTRIBUTE_OPERAND:
				setListOfSimpleAttributeOperand((ListOfSimpleAttributeOperand)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_TYPE_DESCRIPTION:
				setListOfSimpleTypeDescription((ListOfSimpleTypeDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_CODE:
				setListOfStatusCode((ListOfStatusCode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_RESULT:
				setListOfStatusResult((ListOfStatusResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRING:
				setListOfString((ListOfString)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DEFINITION:
				setListOfStructureDefinition((ListOfStructureDefinition)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DESCRIPTION:
				setListOfStructureDescription((ListOfStructureDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_FIELD:
				setListOfStructureField((ListOfStructureField)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE:
				setListOfSubscribedDataSetDataType((ListOfSubscribedDataSetDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				setListOfSubscribedDataSetMirrorDataType((ListOfSubscribedDataSetMirrorDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT:
				setListOfSubscriptionAcknowledgement((ListOfSubscriptionAcknowledgement)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				setListOfSubscriptionDiagnosticsDataType((ListOfSubscriptionDiagnosticsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TARGET_VARIABLES_DATA_TYPE:
				setListOfTargetVariablesDataType((ListOfTargetVariablesDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DCARTESIAN_COORDINATES:
				setListOfThreeDCartesianCoordinates((ListOfThreeDCartesianCoordinates)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DFRAME:
				setListOfThreeDFrame((ListOfThreeDFrame)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DORIENTATION:
				setListOfThreeDOrientation((ListOfThreeDOrientation)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DVECTOR:
				setListOfThreeDVector((ListOfThreeDVector)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TIME_ZONE_DATA_TYPE:
				setListOfTimeZoneDataType((ListOfTimeZoneDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRANSFER_RESULT:
				setListOfTransferResult((ListOfTransferResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRUST_LIST_DATA_TYPE:
				setListOfTrustListDataType((ListOfTrustListDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UA_BINARY_FILE_DATA_TYPE:
				setListOfUABinaryFileDataType((ListOfUABinaryFileDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				setListOfUadpDataSetMessageContentMask((ListOfUadpDataSetMessageContentMask)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				setListOfUadpDataSetReaderMessageDataType((ListOfUadpDataSetReaderMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setListOfUadpDataSetWriterMessageDataType((ListOfUadpDataSetWriterMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK:
				setListOfUadpNetworkMessageContentMask((ListOfUadpNetworkMessageContentMask)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				setListOfUadpWriterGroupMessageDataType((ListOfUadpWriterGroupMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT16:
				setListOfUInt16((ListOfUInt16)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT32:
				setListOfUInt32((ListOfUInt32)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT64:
				setListOfUInt64((ListOfUInt64)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UNION:
				setListOfUnion((ListOfUnion)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_USER_TOKEN_POLICY:
				setListOfUserTokenPolicy((ListOfUserTokenPolicy)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VARIANT:
				setListOfVariant((ListOfVariant)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VECTOR:
				setListOfVector((ListOfVector)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_DATA_TYPE:
				setListOfWriterGroupDataType((ListOfWriterGroupDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE:
				setListOfWriterGroupMessageDataType((ListOfWriterGroupMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setListOfWriterGroupTransportDataType((ListOfWriterGroupTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITE_VALUE:
				setListOfWriteValue((ListOfWriteValue)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_XML_ELEMENT:
				setListOfXmlElement((ListOfXmlElement)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LITERAL_OPERAND:
				setLiteralOperand((LiteralOperand)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LOCALE_ID:
				setLocaleId((String)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__LOCALIZED_TEXT:
				setLocalizedText((LocalizedText)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MDNS_DISCOVERY_CONFIGURATION:
				setMdnsDiscoveryConfiguration((MdnsDiscoveryConfiguration)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MESSAGE_SECURITY_MODE:
				setMessageSecurityMode((MessageSecurityMode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__METHOD_ATTRIBUTES:
				setMethodAttributes((MethodAttributes)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__METHOD_NODE:
				setMethodNode((MethodNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_DATA_TYPE:
				setModelChangeStructureDataType((ModelChangeStructureDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_VERB_MASK:
				setModelChangeStructureVerbMask((ModelChangeStructureVerbMask)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODIFICATION_INFO:
				setModificationInfo((ModificationInfo)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_REQUEST:
				setModifyMonitoredItemsRequest((ModifyMonitoredItemsRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_RESPONSE:
				setModifyMonitoredItemsResponse((ModifyMonitoredItemsResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_REQUEST:
				setModifySubscriptionRequest((ModifySubscriptionRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_RESPONSE:
				setModifySubscriptionResponse((ModifySubscriptionResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_REQUEST:
				setMonitoredItemCreateRequest((MonitoredItemCreateRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_RESULT:
				setMonitoredItemCreateResult((MonitoredItemCreateResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_REQUEST:
				setMonitoredItemModifyRequest((MonitoredItemModifyRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_RESULT:
				setMonitoredItemModifyResult((MonitoredItemModifyResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_NOTIFICATION:
				setMonitoredItemNotification((MonitoredItemNotification)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER:
				setMonitoringFilter((MonitoringFilter)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER_RESULT:
				setMonitoringFilterResult((MonitoringFilterResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_MODE:
				setMonitoringMode((MonitoringMode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_PARAMETERS:
				setMonitoringParameters((MonitoringParameters)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_DATA_TYPE:
				setNetworkAddressDataType((NetworkAddressDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_URL_DATA_TYPE:
				setNetworkAddressUrlDataType((NetworkAddressUrlDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NETWORK_GROUP_DATA_TYPE:
				setNetworkGroupDataType((NetworkGroupDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE:
				setNode((Node)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES:
				setNodeAttributes((NodeAttributes)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES_MASK:
				setNodeAttributesMask((NodeAttributesMask)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_CLASS:
				setNodeClass((NodeClass)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_ID:
				setNodeId((NodeId)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_REFERENCE:
				setNodeReference((NodeReference)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_TYPE_DESCRIPTION:
				setNodeTypeDescription((NodeTypeDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NORMALIZED_STRING:
				setNormalizedString((String)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_DATA:
				setNotificationData((NotificationData)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_MESSAGE:
				setNotificationMessage((NotificationMessage)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__NUMERIC_RANGE:
				setNumericRange((String)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_ATTRIBUTES:
				setObjectAttributes((ObjectAttributes)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_NODE:
				setObjectNode((ObjectNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_ATTRIBUTES:
				setObjectTypeAttributes((ObjectTypeAttributes)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_NODE:
				setObjectTypeNode((ObjectTypeNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_FILE_MODE:
				setOpenFileMode((OpenFileMode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_REQUEST:
				setOpenSecureChannelRequest((OpenSecureChannelRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_RESPONSE:
				setOpenSecureChannelResponse((OpenSecureChannelResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPTION_SET:
				setOptionSet((OptionSet)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ORIENTATION:
				setOrientation((Orientation)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OVERRIDE_VALUE_HANDLING:
				setOverrideValueHandling((OverrideValueHandling)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PARSING_RESULT:
				setParsingResult((ParsingResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PERFORM_UPDATE_TYPE:
				setPerformUpdateType((PerformUpdateType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PERMISSION_TYPE:
				setPermissionType((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC2_DATA_TYPE:
				setProgramDiagnostic2DataType((ProgramDiagnostic2DataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC_DATA_TYPE:
				setProgramDiagnosticDataType((ProgramDiagnosticDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_ITEMS_DATA_TYPE:
				setPublishedDataItemsDataType((PublishedDataItemsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_DATA_TYPE:
				setPublishedDataSetDataType((PublishedDataSetDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				setPublishedDataSetSourceDataType((PublishedDataSetSourceDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_EVENTS_DATA_TYPE:
				setPublishedEventsDataType((PublishedEventsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_VARIABLE_DATA_TYPE:
				setPublishedVariableDataType((PublishedVariableDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_REQUEST:
				setPublishRequest((PublishRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_RESPONSE:
				setPublishResponse((PublishResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONFIGURATION_DATA_TYPE:
				setPubSubConfigurationDataType((PubSubConfigurationDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONNECTION_DATA_TYPE:
				setPubSubConnectionDataType((PubSubConnectionDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				setPubSubDiagnosticsCounterClassification((PubSubDiagnosticsCounterClassification)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_GROUP_DATA_TYPE:
				setPubSubGroupDataType((PubSubGroupDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_STATE:
				setPubSubState((PubSubState)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUALIFIED_NAME:
				setQualifiedName((QualifiedName)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_DESCRIPTION:
				setQueryDataDescription((QueryDataDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_SET:
				setQueryDataSet((QueryDataSet)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_REQUEST:
				setQueryFirstRequest((QueryFirstRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_RESPONSE:
				setQueryFirstResponse((QueryFirstResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_REQUEST:
				setQueryNextRequest((QueryNextRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_RESPONSE:
				setQueryNextResponse((QueryNextResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__RANGE:
				setRange((Range)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__RATIONAL_NUMBER:
				setRationalNumber((RationalNumber)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_ANNOTATION_DATA_DETAILS:
				setReadAnnotationDataDetails((ReadAnnotationDataDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_AT_TIME_DETAILS:
				setReadAtTimeDetails((ReadAtTimeDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_DATA_TYPE:
				setReaderGroupDataType((ReaderGroupDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_MESSAGE_DATA_TYPE:
				setReaderGroupMessageDataType((ReaderGroupMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_TRANSPORT_DATA_TYPE:
				setReaderGroupTransportDataType((ReaderGroupTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_EVENT_DETAILS:
				setReadEventDetails((ReadEventDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_PROCESSED_DETAILS:
				setReadProcessedDetails((ReadProcessedDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_RAW_MODIFIED_DETAILS:
				setReadRawModifiedDetails((ReadRawModifiedDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_REQUEST:
				setReadRequest((ReadRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_RESPONSE:
				setReadResponse((ReadResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_VALUE_ID:
				setReadValueId((ReadValueId)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REDUNDANCY_SUPPORT:
				setRedundancySupport((RedundancySupport)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REDUNDANT_SERVER_DATA_TYPE:
				setRedundantServerDataType((RedundantServerDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_DESCRIPTION:
				setReferenceDescription((ReferenceDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_NODE:
				setReferenceNode((ReferenceNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_ATTRIBUTES:
				setReferenceTypeAttributes((ReferenceTypeAttributes)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_NODE:
				setReferenceTypeNode((ReferenceTypeNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTERED_SERVER:
				setRegisteredServer((RegisteredServer)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_REQUEST:
				setRegisterNodesRequest((RegisterNodesRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_RESPONSE:
				setRegisterNodesResponse((RegisterNodesResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_REQUEST:
				setRegisterServer2Request((RegisterServer2Request)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_RESPONSE:
				setRegisterServer2Response((RegisterServer2Response)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_REQUEST:
				setRegisterServerRequest((RegisterServerRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_RESPONSE:
				setRegisterServerResponse((RegisterServerResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH:
				setRelativePath((RelativePath)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH_ELEMENT:
				setRelativePathElement((RelativePathElement)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_REQUEST:
				setRepublishRequest((RepublishRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_RESPONSE:
				setRepublishResponse((RepublishResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__ROLE_PERMISSION_TYPE:
				setRolePermissionType((RolePermissionType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__RSA_ENCRYPTED_SECRET:
				setRsaEncryptedSecret((Variant)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				setSamplingIntervalDiagnosticsDataType((SamplingIntervalDiagnosticsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SBYTE:
				setSByte((Byte)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SECURITY_TOKEN_REQUEST_TYPE:
				setSecurityTokenRequestType((SecurityTokenRequestType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				setSemanticChangeStructureDataType((SemanticChangeStructureDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE:
				setServerDiagnosticsSummaryDataType((ServerDiagnosticsSummaryDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVER_ON_NETWORK:
				setServerOnNetwork((ServerOnNetwork)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATE:
				setServerState((ServerState)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATUS_DATA_TYPE:
				setServerStatusDataType((ServerStatusDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVICE_COUNTER_DATA_TYPE:
				setServiceCounterDataType((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVICE_FAULT:
				setServiceFault((ServiceFault)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SESSION_AUTHENTICATION_TOKEN:
				setSessionAuthenticationToken((NodeId)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SESSION_DIAGNOSTICS_DATA_TYPE:
				setSessionDiagnosticsDataType((SessionDiagnosticsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_REQUEST_TYPE:
				setSessionlessInvokeRequestType((SessionlessInvokeRequestType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_RESPONSE_TYPE:
				setSessionlessInvokeResponseType((SessionlessInvokeResponseType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				setSessionSecurityDiagnosticsDataType((SessionSecurityDiagnosticsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_REQUEST:
				setSetMonitoringModeRequest((SetMonitoringModeRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_RESPONSE:
				setSetMonitoringModeResponse((SetMonitoringModeResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_REQUEST:
				setSetPublishingModeRequest((SetPublishingModeRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_RESPONSE:
				setSetPublishingModeResponse((SetPublishingModeResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_REQUEST:
				setSetTriggeringRequest((SetTriggeringRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_RESPONSE:
				setSetTriggeringResponse((SetTriggeringResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SIGNATURE_DATA:
				setSignatureData((SignatureData)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SIGNED_SOFTWARE_CERTIFICATE:
				setSignedSoftwareCertificate((SignedSoftwareCertificate)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_ATTRIBUTE_OPERAND:
				setSimpleAttributeOperand((SimpleAttributeOperand)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_TYPE_DESCRIPTION:
				setSimpleTypeDescription((SimpleTypeDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__STATUS_CHANGE_NOTIFICATION:
				setStatusChangeNotification((StatusChangeNotification)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__STATUS_RESULT:
				setStatusResult((StatusResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__STRING:
				setString((String)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DESCRIPTION:
				setStructureDescription((StructureDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_FIELD:
				setStructureField((StructureField)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_TYPE:
				setStructureType((StructureType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_DATA_TYPE:
				setSubscribedDataSetDataType((SubscribedDataSetDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				setSubscribedDataSetMirrorDataType((SubscribedDataSetMirrorDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_ACKNOWLEDGEMENT:
				setSubscriptionAcknowledgement((SubscriptionAcknowledgement)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				setSubscriptionDiagnosticsDataType((SubscriptionDiagnosticsDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TARGET_VARIABLES_DATA_TYPE:
				setTargetVariablesDataType((TargetVariablesDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__THREE_DCARTESIAN_COORDINATES:
				setThreeDCartesianCoordinates((ThreeDCartesianCoordinates)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__THREE_DFRAME:
				setThreeDFrame((ThreeDFrame)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__THREE_DORIENTATION:
				setThreeDOrientation((ThreeDOrientation)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__THREE_DVECTOR:
				setThreeDVector((ThreeDVector)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TIME:
				setTime((String)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TIMESTAMPS_TO_RETURN:
				setTimestampsToReturn((TimestampsToReturn)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TIME_STRING:
				setTimeString((String)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TIME_ZONE_DATA_TYPE:
				setTimeZoneDataType((TimeZoneDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_RESULT:
				setTransferResult((TransferResult)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_REQUEST:
				setTransferSubscriptionsRequest((TransferSubscriptionsRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_RESPONSE:
				setTransferSubscriptionsResponse((TransferSubscriptionsResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST:
				setTranslateBrowsePathsToNodeIdsRequest((TranslateBrowsePathsToNodeIdsRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_RESPONSE:
				setTranslateBrowsePathsToNodeIdsResponse((TranslateBrowsePathsToNodeIdsResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_DATA_TYPE:
				setTrustListDataType((TrustListDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_MASKS:
				setTrustListMasks((TrustListMasks)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__TYPE_NODE:
				setTypeNode((TypeNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UA_BINARY_FILE_DATA_TYPE:
				setUABinaryFileDataType((UABinaryFileDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				setUadpDataSetMessageContentMask((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				setUadpDataSetReaderMessageDataType((UadpDataSetReaderMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setUadpDataSetWriterMessageDataType((UadpDataSetWriterMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UADP_NETWORK_MESSAGE_CONTENT_MASK:
				setUadpNetworkMessageContentMask((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				setUadpWriterGroupMessageDataType((UadpWriterGroupMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UINT16:
				setUInt16((Integer)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UINT32:
				setUInt32((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UINT64:
				setUInt64((BigInteger)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UNION:
				setUnion((Union)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_REQUEST:
				setUnregisterNodesRequest((UnregisterNodesRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_RESPONSE:
				setUnregisterNodesResponse((UnregisterNodesResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UPDATE_DATA_DETAILS:
				setUpdateDataDetails((UpdateDataDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UPDATE_EVENT_DETAILS:
				setUpdateEventDetails((UpdateEventDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UPDATE_STRUCTURE_DATA_DETAILS:
				setUpdateStructureDataDetails((UpdateStructureDataDetails)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__USER_IDENTITY_TOKEN:
				setUserIdentityToken((UserIdentityToken)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__USER_NAME_IDENTITY_TOKEN:
				setUserNameIdentityToken((UserNameIdentityToken)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_POLICY:
				setUserTokenPolicy((UserTokenPolicy)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_TYPE:
				setUserTokenType((UserTokenType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__UTC_TIME:
				setUtcTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_ATTRIBUTES:
				setVariableAttributes((VariableAttributes)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_NODE:
				setVariableNode((VariableNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_ATTRIBUTES:
				setVariableTypeAttributes((VariableTypeAttributes)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_NODE:
				setVariableTypeNode((VariableTypeNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VARIANT:
				setVariant((Variant)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VECTOR:
				setVector((Vector)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VERSION_TIME:
				setVersionTime((Long)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VIEW_ATTRIBUTES:
				setViewAttributes((ViewAttributes)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VIEW_DESCRIPTION:
				setViewDescription((ViewDescription)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VIEW_NODE:
				setViewNode((ViewNode)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITE_REQUEST:
				setWriteRequest((WriteRequest)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITE_RESPONSE:
				setWriteResponse((WriteResponse)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_DATA_TYPE:
				setWriterGroupDataType((WriterGroupDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_MESSAGE_DATA_TYPE:
				setWriterGroupMessageDataType((WriterGroupMessageDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setWriterGroupTransportDataType((WriterGroupTransportDataType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITE_VALUE:
				setWriteValue((WriteValue)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__X509_IDENTITY_TOKEN:
				setX509IdentityToken((X509IdentityToken)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__XV_TYPE:
				setXVType((XVType)newValue);
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
			case TypesPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case TypesPackage.DOCUMENT_ROOT__ACCESS_LEVEL_EX_TYPE:
				setAccessLevelExType(ACCESS_LEVEL_EX_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__ACCESS_LEVEL_TYPE:
				setAccessLevelType(ACCESS_LEVEL_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_REQUEST:
				setActivateSessionRequest((ActivateSessionRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_RESPONSE:
				setActivateSessionResponse((ActivateSessionResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_ITEM:
				setAddNodesItem((AddNodesItem)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_REQUEST:
				setAddNodesRequest((AddNodesRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESPONSE:
				setAddNodesResponse((AddNodesResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESULT:
				setAddNodesResult((AddNodesResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_ITEM:
				setAddReferencesItem((AddReferencesItem)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_REQUEST:
				setAddReferencesRequest((AddReferencesRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_RESPONSE:
				setAddReferencesResponse((AddReferencesResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_CONFIGURATION:
				setAggregateConfiguration((AggregateConfiguration)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER:
				setAggregateFilter((AggregateFilter)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER_RESULT:
				setAggregateFilterResult((AggregateFilterResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ALIAS_NAME_DATA_TYPE:
				setAliasNameDataType((AliasNameDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ANONYMOUS_IDENTITY_TOKEN:
				setAnonymousIdentityToken((AnonymousIdentityToken)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_DESCRIPTION:
				setApplicationDescription((ApplicationDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_INSTANCE_CERTIFICATE:
				setApplicationInstanceCertificate(APPLICATION_INSTANCE_CERTIFICATE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_TYPE:
				setApplicationType(APPLICATION_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__ARGUMENT:
				setArgument((Argument)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_OPERAND:
				setAttributeOperand((AttributeOperand)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_WRITE_MASK:
				setAttributeWriteMask(ATTRIBUTE_WRITE_MASK_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__AUDIO_DATA_TYPE:
				setAudioDataType(AUDIO_DATA_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__AXIS_INFORMATION:
				setAxisInformation((AxisInformation)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__AXIS_SCALE_ENUMERATION:
				setAxisScaleEnumeration(AXIS_SCALE_ENUMERATION_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__BIT_FIELD_MASK_DATA_TYPE:
				setBitFieldMaskDataType(BIT_FIELD_MASK_DATA_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__BOOLEAN:
				setBoolean(BOOLEAN_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				setBrokerConnectionTransportDataType((BrokerConnectionTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				setBrokerDataSetReaderTransportDataType((BrokerDataSetReaderTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				setBrokerDataSetWriterTransportDataType((BrokerDataSetWriterTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				setBrokerTransportQualityOfService(BROKER_TRANSPORT_QUALITY_OF_SERVICE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setBrokerWriterGroupTransportDataType((BrokerWriterGroupTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DESCRIPTION:
				setBrowseDescription((BrowseDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DIRECTION:
				setBrowseDirection(BROWSE_DIRECTION_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_REQUEST:
				setBrowseNextRequest((BrowseNextRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_RESPONSE:
				setBrowseNextResponse((BrowseNextResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH:
				setBrowsePath((BrowsePath)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_RESULT:
				setBrowsePathResult((BrowsePathResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_TARGET:
				setBrowsePathTarget((BrowsePathTarget)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_REQUEST:
				setBrowseRequest((BrowseRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESPONSE:
				setBrowseResponse((BrowseResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT:
				setBrowseResult((BrowseResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT_MASK:
				setBrowseResultMask(BROWSE_RESULT_MASK_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__BUILD_INFO:
				setBuildInfo((BuildInfo)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__BYTE:
				setByte(BYTE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__BYTE_STRING:
				setByteString(BYTE_STRING_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_REQUEST:
				setCallMethodRequest((CallMethodRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_RESULT:
				setCallMethodResult((CallMethodResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CALL_REQUEST:
				setCallRequest((CallRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CALL_RESPONSE:
				setCallResponse((CallResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CANCEL_REQUEST:
				setCancelRequest((CancelRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CANCEL_RESPONSE:
				setCancelResponse((CancelResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CARTESIAN_COORDINATES:
				setCartesianCoordinates((CartesianCoordinates)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CHANNEL_SECURITY_TOKEN:
				setChannelSecurityToken((ChannelSecurityToken)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_REQUEST:
				setCloseSecureChannelRequest((CloseSecureChannelRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_RESPONSE:
				setCloseSecureChannelResponse((CloseSecureChannelResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_REQUEST:
				setCloseSessionRequest((CloseSessionRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_RESPONSE:
				setCloseSessionResponse((CloseSessionResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__COMPLEX_NUMBER_TYPE:
				setComplexNumberType((ComplexNumberType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONFIGURATION_VERSION_DATA_TYPE:
				setConfigurationVersionDataType((ConfigurationVersionDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONNECTION_TRANSPORT_DATA_TYPE:
				setConnectionTransportDataType((ConnectionTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER:
				setContentFilter((ContentFilter)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT:
				setContentFilterElement((ContentFilterElement)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT_RESULT:
				setContentFilterElementResult((ContentFilterElementResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_RESULT:
				setContentFilterResult((ContentFilterResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CONTINUATION_POINT:
				setContinuationPoint(CONTINUATION_POINT_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__COUNTER:
				setCounter(COUNTER_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_REQUEST:
				setCreateMonitoredItemsRequest((CreateMonitoredItemsRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_RESPONSE:
				setCreateMonitoredItemsResponse((CreateMonitoredItemsResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_REQUEST:
				setCreateSessionRequest((CreateSessionRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_RESPONSE:
				setCreateSessionResponse((CreateSessionResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_REQUEST:
				setCreateSubscriptionRequest((CreateSubscriptionRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_RESPONSE:
				setCreateSubscriptionResponse((CreateSubscriptionResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__CURRENCY_UNIT_TYPE:
				setCurrencyUnitType((CurrencyUnitType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_FILTER:
				setDataChangeFilter((DataChangeFilter)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_NOTIFICATION:
				setDataChangeNotification((DataChangeNotification)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_TRIGGER:
				setDataChangeTrigger(DATA_CHANGE_TRIGGER_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				setDatagramConnectionTransportDataType((DatagramConnectionTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setDatagramWriterGroupTransportDataType((DatagramWriterGroupTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_FIELD_CONTENT_MASK:
				setDataSetFieldContentMask(DATA_SET_FIELD_CONTENT_MASK_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_FIELD_FLAGS:
				setDataSetFieldFlags(DATA_SET_FIELD_FLAGS_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_META_DATA_TYPE:
				setDataSetMetaDataType((DataSetMetaDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_ORDERING_TYPE:
				setDataSetOrderingType(DATA_SET_ORDERING_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_DATA_TYPE:
				setDataSetReaderDataType((DataSetReaderDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_MESSAGE_DATA_TYPE:
				setDataSetReaderMessageDataType((DataSetReaderMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_TRANSPORT_DATA_TYPE:
				setDataSetReaderTransportDataType((DataSetReaderTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_DATA_TYPE:
				setDataSetWriterDataType((DataSetWriterDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setDataSetWriterMessageDataType((DataSetWriterMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				setDataSetWriterTransportDataType((DataSetWriterTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_ATTRIBUTES:
				setDataTypeAttributes((DataTypeAttributes)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DEFINITION:
				setDataTypeDefinition((DataTypeDefinition)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DESCRIPTION:
				setDataTypeDescription((DataTypeDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_NODE:
				setDataTypeNode((DataTypeNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_SCHEMA_HEADER:
				setDataTypeSchemaHeader((DataTypeSchemaHeader)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATA_VALUE:
				setDataValue((DataValue)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATE_STRING:
				setDateString(DATE_STRING_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DEADBAND_TYPE:
				setDeadbandType(DEADBAND_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_DATA_TYPE:
				setDecimalDataType((DecimalDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_STRING:
				setDecimalString(DECIMAL_STRING_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_AT_TIME_DETAILS:
				setDeleteAtTimeDetails((DeleteAtTimeDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_EVENT_DETAILS:
				setDeleteEventDetails((DeleteEventDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_REQUEST:
				setDeleteMonitoredItemsRequest((DeleteMonitoredItemsRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_RESPONSE:
				setDeleteMonitoredItemsResponse((DeleteMonitoredItemsResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_ITEM:
				setDeleteNodesItem((DeleteNodesItem)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_REQUEST:
				setDeleteNodesRequest((DeleteNodesRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_RESPONSE:
				setDeleteNodesResponse((DeleteNodesResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_RAW_MODIFIED_DETAILS:
				setDeleteRawModifiedDetails((DeleteRawModifiedDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_ITEM:
				setDeleteReferencesItem((DeleteReferencesItem)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_REQUEST:
				setDeleteReferencesRequest((DeleteReferencesRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_RESPONSE:
				setDeleteReferencesResponse((DeleteReferencesResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_REQUEST:
				setDeleteSubscriptionsRequest((DeleteSubscriptionsRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_RESPONSE:
				setDeleteSubscriptionsResponse((DeleteSubscriptionsResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTIC_INFO:
				setDiagnosticInfo((DiagnosticInfo)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTICS_LEVEL:
				setDiagnosticsLevel(DIAGNOSTICS_LEVEL_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DISCOVERY_CONFIGURATION:
				setDiscoveryConfiguration((DiscoveryConfiguration)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DOUBLE:
				setDouble(DOUBLE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DOUBLE_COMPLEX_NUMBER_TYPE:
				setDoubleComplexNumberType((DoubleComplexNumberType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__DURATION_STRING:
				setDurationString(DURATION_STRING_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__ELEMENT_OPERAND:
				setElementOperand((ElementOperand)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_CONFIGURATION:
				setEndpointConfiguration((EndpointConfiguration)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_DESCRIPTION:
				setEndpointDescription((EndpointDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_TYPE:
				setEndpointType((EndpointType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_URL_LIST_DATA_TYPE:
				setEndpointUrlListDataType((EndpointUrlListDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENUM_DEFINITION:
				setEnumDefinition((EnumDefinition)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENUM_DESCRIPTION:
				setEnumDescription((EnumDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENUM_FIELD:
				setEnumField((EnumField)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ENUM_VALUE_TYPE:
				setEnumValueType((EnumValueType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__EU_INFORMATION:
				setEUInformation((EUInformation)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__EVENT_FIELD_LIST:
				setEventFieldList((EventFieldList)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER:
				setEventFilter((EventFilter)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER_RESULT:
				setEventFilterResult((EventFilterResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFICATION_LIST:
				setEventNotificationList((EventNotificationList)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFIER_TYPE:
				setEventNotifierType(EVENT_NOTIFIER_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__EXCEPTION_DEVIATION_FORMAT:
				setExceptionDeviationFormat(EXCEPTION_DEVIATION_FORMAT_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__EXPANDED_NODE_ID:
				setExpandedNodeId((ExpandedNodeId)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__EXTENSION_OBJECT:
				setExtensionObject((ExtensionObject)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIELD_META_DATA:
				setFieldMetaData((FieldMetaData)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIELD_TARGET_DATA_TYPE:
				setFieldTargetDataType((FieldTargetDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERAND:
				setFilterOperand((FilterOperand)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERATOR:
				setFilterOperator(FILTER_OPERATOR_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_REQUEST:
				setFindServersOnNetworkRequest((FindServersOnNetworkRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_RESPONSE:
				setFindServersOnNetworkResponse((FindServersOnNetworkResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_REQUEST:
				setFindServersRequest((FindServersRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_RESPONSE:
				setFindServersResponse((FindServersResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__FLOAT:
				setFloat(FLOAT_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__FRAME:
				setFrame((Frame)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTES:
				setGenericAttributes((GenericAttributes)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTE_VALUE:
				setGenericAttributeValue((GenericAttributeValue)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_REQUEST:
				setGetEndpointsRequest((GetEndpointsRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_RESPONSE:
				setGetEndpointsResponse((GetEndpointsResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__GUID:
				setGuid((Guid)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_DATA:
				setHistoryData((HistoryData)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT:
				setHistoryEvent((HistoryEvent)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT_FIELD_LIST:
				setHistoryEventFieldList((HistoryEventFieldList)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_MODIFIED_DATA:
				setHistoryModifiedData((HistoryModifiedData)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_DETAILS:
				setHistoryReadDetails((HistoryReadDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_REQUEST:
				setHistoryReadRequest((HistoryReadRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESPONSE:
				setHistoryReadResponse((HistoryReadResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESULT:
				setHistoryReadResult((HistoryReadResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_VALUE_ID:
				setHistoryReadValueId((HistoryReadValueId)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_DETAILS:
				setHistoryUpdateDetails((HistoryUpdateDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_REQUEST:
				setHistoryUpdateRequest((HistoryUpdateRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESPONSE:
				setHistoryUpdateResponse((HistoryUpdateResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESULT:
				setHistoryUpdateResult((HistoryUpdateResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_TYPE:
				setHistoryUpdateType(HISTORY_UPDATE_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_CRITERIA_TYPE:
				setIdentityCriteriaType(IDENTITY_CRITERIA_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_MAPPING_RULE_TYPE:
				setIdentityMappingRuleType((IdentityMappingRuleType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ID_TYPE:
				setIdType(ID_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__IMAGE_BMP:
				setImageBMP(IMAGE_BMP_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__IMAGE_GIF:
				setImageGIF(IMAGE_GIF_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__IMAGE_JPG:
				setImageJPG(IMAGE_JPG_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__IMAGE_PNG:
				setImagePNG(IMAGE_PNG_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__INSTANCE_NODE:
				setInstanceNode((InstanceNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__INT16:
				setInt16(INT16_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__INT32:
				setInt32(INT32_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__INT64:
				setInt64(INT64_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__INTEGER_ID:
				setIntegerId(INTEGER_ID_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__INVOKE_SERVICE_REQUEST:
				setInvokeServiceRequest(INVOKE_SERVICE_REQUEST_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__INVOKE_SERVICE_RESPONSE:
				setInvokeServiceResponse(INVOKE_SERVICE_RESPONSE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__ISSUED_IDENTITY_TOKEN:
				setIssuedIdentityToken((IssuedIdentityToken)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				setJsonDataSetMessageContentMask(JSON_DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				setJsonDataSetReaderMessageDataType((JsonDataSetReaderMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setJsonDataSetWriterMessageDataType((JsonDataSetWriterMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__JSON_NETWORK_MESSAGE_CONTENT_MASK:
				setJsonNetworkMessageContentMask(JSON_NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				setJsonWriterGroupMessageDataType((JsonWriterGroupMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__KEY_VALUE_PAIR:
				setKeyValuePair((KeyValuePair)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_ITEM:
				setListOfAddNodesItem((ListOfAddNodesItem)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_RESULT:
				setListOfAddNodesResult((ListOfAddNodesResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_REFERENCES_ITEM:
				setListOfAddReferencesItem((ListOfAddReferencesItem)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ALIAS_NAME_DATA_TYPE:
				setListOfAliasNameDataType((ListOfAliasNameDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_APPLICATION_DESCRIPTION:
				setListOfApplicationDescription((ListOfApplicationDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ARGUMENT:
				setListOfArgument((ListOfArgument)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BOOLEAN:
				setListOfBoolean((ListOfBoolean)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				setListOfBrokerConnectionTransportDataType((ListOfBrokerConnectionTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				setListOfBrokerDataSetReaderTransportDataType((ListOfBrokerDataSetReaderTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				setListOfBrokerDataSetWriterTransportDataType((ListOfBrokerDataSetWriterTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				setListOfBrokerTransportQualityOfService((ListOfBrokerTransportQualityOfService)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setListOfBrokerWriterGroupTransportDataType((ListOfBrokerWriterGroupTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_DESCRIPTION:
				setListOfBrowseDescription((ListOfBrowseDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH:
				setListOfBrowsePath((ListOfBrowsePath)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_RESULT:
				setListOfBrowsePathResult((ListOfBrowsePathResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_TARGET:
				setListOfBrowsePathTarget((ListOfBrowsePathTarget)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_RESULT:
				setListOfBrowseResult((ListOfBrowseResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE:
				setListOfByte((ListOfByte)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE_STRING:
				setListOfByteString((ListOfByteString)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_REQUEST:
				setListOfCallMethodRequest((ListOfCallMethodRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_RESULT:
				setListOfCallMethodResult((ListOfCallMethodResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CARTESIAN_COORDINATES:
				setListOfCartesianCoordinates((ListOfCartesianCoordinates)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONFIGURATION_VERSION_DATA_TYPE:
				setListOfConfigurationVersionDataType((ListOfConfigurationVersionDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE:
				setListOfConnectionTransportDataType((ListOfConnectionTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER:
				setListOfContentFilter((ListOfContentFilter)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT:
				setListOfContentFilterElement((ListOfContentFilterElement)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT_RESULT:
				setListOfContentFilterElementResult((ListOfContentFilterElementResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CURRENCY_UNIT_TYPE:
				setListOfCurrencyUnitType((ListOfCurrencyUnitType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				setListOfDatagramConnectionTransportDataType((ListOfDatagramConnectionTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setListOfDatagramWriterGroupTransportDataType((ListOfDatagramWriterGroupTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_FIELD_CONTENT_MASK:
				setListOfDataSetFieldContentMask((ListOfDataSetFieldContentMask)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_META_DATA_TYPE:
				setListOfDataSetMetaDataType((ListOfDataSetMetaDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_ORDERING_TYPE:
				setListOfDataSetOrderingType((ListOfDataSetOrderingType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_DATA_TYPE:
				setListOfDataSetReaderDataType((ListOfDataSetReaderDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE:
				setListOfDataSetReaderMessageDataType((ListOfDataSetReaderMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				setListOfDataSetReaderTransportDataType((ListOfDataSetReaderTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_DATA_TYPE:
				setListOfDataSetWriterDataType((ListOfDataSetWriterDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setListOfDataSetWriterMessageDataType((ListOfDataSetWriterMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				setListOfDataSetWriterTransportDataType((ListOfDataSetWriterTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DEFINITION:
				setListOfDataTypeDefinition((ListOfDataTypeDefinition)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DESCRIPTION:
				setListOfDataTypeDescription((ListOfDataTypeDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_SCHEMA_HEADER:
				setListOfDataTypeSchemaHeader((ListOfDataTypeSchemaHeader)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_VALUE:
				setListOfDataValue((ListOfDataValue)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATE_TIME:
				setListOfDateTime((ListOfDateTime)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_NODES_ITEM:
				setListOfDeleteNodesItem((ListOfDeleteNodesItem)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_REFERENCES_ITEM:
				setListOfDeleteReferencesItem((ListOfDeleteReferencesItem)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTIC_INFO:
				setListOfDiagnosticInfo((ListOfDiagnosticInfo)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTICS_LEVEL:
				setListOfDiagnosticsLevel((ListOfDiagnosticsLevel)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DOUBLE:
				setListOfDouble((ListOfDouble)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_CONFIGURATION:
				setListOfEndpointConfiguration((ListOfEndpointConfiguration)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_DESCRIPTION:
				setListOfEndpointDescription((ListOfEndpointDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_TYPE:
				setListOfEndpointType((ListOfEndpointType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE:
				setListOfEndpointUrlListDataType((ListOfEndpointUrlListDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DEFINITION:
				setListOfEnumDefinition((ListOfEnumDefinition)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DESCRIPTION:
				setListOfEnumDescription((ListOfEnumDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_FIELD:
				setListOfEnumField((ListOfEnumField)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_VALUE_TYPE:
				setListOfEnumValueType((ListOfEnumValueType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EVENT_FIELD_LIST:
				setListOfEventFieldList((ListOfEventFieldList)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXPANDED_NODE_ID:
				setListOfExpandedNodeId((ListOfExpandedNodeId)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXTENSION_OBJECT:
				setListOfExtensionObject((ListOfExtensionObject)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_META_DATA:
				setListOfFieldMetaData((ListOfFieldMetaData)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_TARGET_DATA_TYPE:
				setListOfFieldTargetDataType((ListOfFieldTargetDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FLOAT:
				setListOfFloat((ListOfFloat)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FRAME:
				setListOfFrame((ListOfFrame)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GENERIC_ATTRIBUTE_VALUE:
				setListOfGenericAttributeValue((ListOfGenericAttributeValue)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GUID:
				setListOfGuid((ListOfGuid)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_EVENT_FIELD_LIST:
				setListOfHistoryEventFieldList((ListOfHistoryEventFieldList)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_RESULT:
				setListOfHistoryReadResult((ListOfHistoryReadResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_VALUE_ID:
				setListOfHistoryReadValueId((ListOfHistoryReadValueId)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_UPDATE_RESULT:
				setListOfHistoryUpdateResult((ListOfHistoryUpdateResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_CRITERIA_TYPE:
				setListOfIdentityCriteriaType((ListOfIdentityCriteriaType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_MAPPING_RULE_TYPE:
				setListOfIdentityMappingRuleType((ListOfIdentityMappingRuleType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ID_TYPE:
				setListOfIdType((ListOfIdType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT16:
				setListOfInt16((ListOfInt16)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT32:
				setListOfInt32((ListOfInt32)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT64:
				setListOfInt64((ListOfInt64)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				setListOfJsonDataSetMessageContentMask((ListOfJsonDataSetMessageContentMask)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				setListOfJsonDataSetReaderMessageDataType((ListOfJsonDataSetReaderMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setListOfJsonDataSetWriterMessageDataType((ListOfJsonDataSetWriterMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK:
				setListOfJsonNetworkMessageContentMask((ListOfJsonNetworkMessageContentMask)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				setListOfJsonWriterGroupMessageDataType((ListOfJsonWriterGroupMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_KEY_VALUE_PAIR:
				setListOfKeyValuePair((ListOfKeyValuePair)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_LOCALIZED_TEXT:
				setListOfLocalizedText((ListOfLocalizedText)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODEL_CHANGE_STRUCTURE_DATA_TYPE:
				setListOfModelChangeStructureDataType((ListOfModelChangeStructureDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODIFICATION_INFO:
				setListOfModificationInfo((ListOfModificationInfo)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_REQUEST:
				setListOfMonitoredItemCreateRequest((ListOfMonitoredItemCreateRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_RESULT:
				setListOfMonitoredItemCreateResult((ListOfMonitoredItemCreateResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_REQUEST:
				setListOfMonitoredItemModifyRequest((ListOfMonitoredItemModifyRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_RESULT:
				setListOfMonitoredItemModifyResult((ListOfMonitoredItemModifyResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_NOTIFICATION:
				setListOfMonitoredItemNotification((ListOfMonitoredItemNotification)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_DATA_TYPE:
				setListOfNetworkAddressDataType((ListOfNetworkAddressDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE:
				setListOfNetworkAddressUrlDataType((ListOfNetworkAddressUrlDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_GROUP_DATA_TYPE:
				setListOfNetworkGroupDataType((ListOfNetworkGroupDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE:
				setListOfNode((ListOfNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_ID:
				setListOfNodeId((ListOfNodeId)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_REFERENCE:
				setListOfNodeReference((ListOfNodeReference)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_TYPE_DESCRIPTION:
				setListOfNodeTypeDescription((ListOfNodeTypeDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPEN_FILE_MODE:
				setListOfOpenFileMode((ListOfOpenFileMode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPTION_SET:
				setListOfOptionSet((ListOfOptionSet)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ORIENTATION:
				setListOfOrientation((ListOfOrientation)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OVERRIDE_VALUE_HANDLING:
				setListOfOverrideValueHandling((ListOfOverrideValueHandling)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PARSING_RESULT:
				setListOfParsingResult((ListOfParsingResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE:
				setListOfPublishedDataItemsDataType((ListOfPublishedDataItemsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE:
				setListOfPublishedDataSetDataType((ListOfPublishedDataSetDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				setListOfPublishedDataSetSourceDataType((ListOfPublishedDataSetSourceDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_EVENTS_DATA_TYPE:
				setListOfPublishedEventsDataType((ListOfPublishedEventsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_VARIABLE_DATA_TYPE:
				setListOfPublishedVariableDataType((ListOfPublishedVariableDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE:
				setListOfPubSubConfigurationDataType((ListOfPubSubConfigurationDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE:
				setListOfPubSubConnectionDataType((ListOfPubSubConnectionDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				setListOfPubSubDiagnosticsCounterClassification((ListOfPubSubDiagnosticsCounterClassification)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_GROUP_DATA_TYPE:
				setListOfPubSubGroupDataType((ListOfPubSubGroupDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_STATE:
				setListOfPubSubState((ListOfPubSubState)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUALIFIED_NAME:
				setListOfQualifiedName((ListOfQualifiedName)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_DESCRIPTION:
				setListOfQueryDataDescription((ListOfQueryDataDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_SET:
				setListOfQueryDataSet((ListOfQueryDataSet)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RATIONAL_NUMBER:
				setListOfRationalNumber((ListOfRationalNumber)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_DATA_TYPE:
				setListOfReaderGroupDataType((ListOfReaderGroupDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE:
				setListOfReaderGroupMessageDataType((ListOfReaderGroupMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE:
				setListOfReaderGroupTransportDataType((ListOfReaderGroupTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READ_VALUE_ID:
				setListOfReadValueId((ListOfReadValueId)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REDUNDANT_SERVER_DATA_TYPE:
				setListOfRedundantServerDataType((ListOfRedundantServerDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_DESCRIPTION:
				setListOfReferenceDescription((ListOfReferenceDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_NODE:
				setListOfReferenceNode((ListOfReferenceNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REGISTERED_SERVER:
				setListOfRegisteredServer((ListOfRegisteredServer)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RELATIVE_PATH_ELEMENT:
				setListOfRelativePathElement((ListOfRelativePathElement)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ROLE_PERMISSION_TYPE:
				setListOfRolePermissionType((ListOfRolePermissionType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				setListOfSamplingIntervalDiagnosticsDataType((ListOfSamplingIntervalDiagnosticsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SBYTE:
				setListOfSByte((ListOfSByte)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				setListOfSemanticChangeStructureDataType((ListOfSemanticChangeStructureDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SERVER_ON_NETWORK:
				setListOfServerOnNetwork((ListOfServerOnNetwork)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE:
				setListOfSessionDiagnosticsDataType((ListOfSessionDiagnosticsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				setListOfSessionSecurityDiagnosticsDataType((ListOfSessionSecurityDiagnosticsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIGNED_SOFTWARE_CERTIFICATE:
				setListOfSignedSoftwareCertificate((ListOfSignedSoftwareCertificate)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_ATTRIBUTE_OPERAND:
				setListOfSimpleAttributeOperand((ListOfSimpleAttributeOperand)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_TYPE_DESCRIPTION:
				setListOfSimpleTypeDescription((ListOfSimpleTypeDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_CODE:
				setListOfStatusCode((ListOfStatusCode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_RESULT:
				setListOfStatusResult((ListOfStatusResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRING:
				setListOfString((ListOfString)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DEFINITION:
				setListOfStructureDefinition((ListOfStructureDefinition)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DESCRIPTION:
				setListOfStructureDescription((ListOfStructureDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_FIELD:
				setListOfStructureField((ListOfStructureField)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE:
				setListOfSubscribedDataSetDataType((ListOfSubscribedDataSetDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				setListOfSubscribedDataSetMirrorDataType((ListOfSubscribedDataSetMirrorDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT:
				setListOfSubscriptionAcknowledgement((ListOfSubscriptionAcknowledgement)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				setListOfSubscriptionDiagnosticsDataType((ListOfSubscriptionDiagnosticsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TARGET_VARIABLES_DATA_TYPE:
				setListOfTargetVariablesDataType((ListOfTargetVariablesDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DCARTESIAN_COORDINATES:
				setListOfThreeDCartesianCoordinates((ListOfThreeDCartesianCoordinates)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DFRAME:
				setListOfThreeDFrame((ListOfThreeDFrame)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DORIENTATION:
				setListOfThreeDOrientation((ListOfThreeDOrientation)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DVECTOR:
				setListOfThreeDVector((ListOfThreeDVector)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TIME_ZONE_DATA_TYPE:
				setListOfTimeZoneDataType((ListOfTimeZoneDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRANSFER_RESULT:
				setListOfTransferResult((ListOfTransferResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRUST_LIST_DATA_TYPE:
				setListOfTrustListDataType((ListOfTrustListDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UA_BINARY_FILE_DATA_TYPE:
				setListOfUABinaryFileDataType((ListOfUABinaryFileDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				setListOfUadpDataSetMessageContentMask((ListOfUadpDataSetMessageContentMask)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				setListOfUadpDataSetReaderMessageDataType((ListOfUadpDataSetReaderMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setListOfUadpDataSetWriterMessageDataType((ListOfUadpDataSetWriterMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK:
				setListOfUadpNetworkMessageContentMask((ListOfUadpNetworkMessageContentMask)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				setListOfUadpWriterGroupMessageDataType((ListOfUadpWriterGroupMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT16:
				setListOfUInt16((ListOfUInt16)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT32:
				setListOfUInt32((ListOfUInt32)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT64:
				setListOfUInt64((ListOfUInt64)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UNION:
				setListOfUnion((ListOfUnion)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_USER_TOKEN_POLICY:
				setListOfUserTokenPolicy((ListOfUserTokenPolicy)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VARIANT:
				setListOfVariant((ListOfVariant)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VECTOR:
				setListOfVector((ListOfVector)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_DATA_TYPE:
				setListOfWriterGroupDataType((ListOfWriterGroupDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE:
				setListOfWriterGroupMessageDataType((ListOfWriterGroupMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setListOfWriterGroupTransportDataType((ListOfWriterGroupTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITE_VALUE:
				setListOfWriteValue((ListOfWriteValue)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_XML_ELEMENT:
				setListOfXmlElement((ListOfXmlElement)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LITERAL_OPERAND:
				setLiteralOperand((LiteralOperand)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__LOCALE_ID:
				setLocaleId(LOCALE_ID_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__LOCALIZED_TEXT:
				setLocalizedText((LocalizedText)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MDNS_DISCOVERY_CONFIGURATION:
				setMdnsDiscoveryConfiguration((MdnsDiscoveryConfiguration)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MESSAGE_SECURITY_MODE:
				setMessageSecurityMode(MESSAGE_SECURITY_MODE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__METHOD_ATTRIBUTES:
				setMethodAttributes((MethodAttributes)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__METHOD_NODE:
				setMethodNode((MethodNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_DATA_TYPE:
				setModelChangeStructureDataType((ModelChangeStructureDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_VERB_MASK:
				setModelChangeStructureVerbMask(MODEL_CHANGE_STRUCTURE_VERB_MASK_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODIFICATION_INFO:
				setModificationInfo((ModificationInfo)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_REQUEST:
				setModifyMonitoredItemsRequest((ModifyMonitoredItemsRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_RESPONSE:
				setModifyMonitoredItemsResponse((ModifyMonitoredItemsResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_REQUEST:
				setModifySubscriptionRequest((ModifySubscriptionRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_RESPONSE:
				setModifySubscriptionResponse((ModifySubscriptionResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_REQUEST:
				setMonitoredItemCreateRequest((MonitoredItemCreateRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_RESULT:
				setMonitoredItemCreateResult((MonitoredItemCreateResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_REQUEST:
				setMonitoredItemModifyRequest((MonitoredItemModifyRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_RESULT:
				setMonitoredItemModifyResult((MonitoredItemModifyResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_NOTIFICATION:
				setMonitoredItemNotification((MonitoredItemNotification)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER:
				setMonitoringFilter((MonitoringFilter)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER_RESULT:
				setMonitoringFilterResult((MonitoringFilterResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_MODE:
				setMonitoringMode(MONITORING_MODE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_PARAMETERS:
				setMonitoringParameters((MonitoringParameters)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_DATA_TYPE:
				setNetworkAddressDataType((NetworkAddressDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_URL_DATA_TYPE:
				setNetworkAddressUrlDataType((NetworkAddressUrlDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NETWORK_GROUP_DATA_TYPE:
				setNetworkGroupDataType((NetworkGroupDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE:
				setNode((Node)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES:
				setNodeAttributes((NodeAttributes)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES_MASK:
				setNodeAttributesMask(NODE_ATTRIBUTES_MASK_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_CLASS:
				setNodeClass(NODE_CLASS_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_ID:
				setNodeId((NodeId)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_REFERENCE:
				setNodeReference((NodeReference)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NODE_TYPE_DESCRIPTION:
				setNodeTypeDescription((NodeTypeDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NORMALIZED_STRING:
				setNormalizedString(NORMALIZED_STRING_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_DATA:
				setNotificationData((NotificationData)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_MESSAGE:
				setNotificationMessage((NotificationMessage)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__NUMERIC_RANGE:
				setNumericRange(NUMERIC_RANGE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_ATTRIBUTES:
				setObjectAttributes((ObjectAttributes)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_NODE:
				setObjectNode((ObjectNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_ATTRIBUTES:
				setObjectTypeAttributes((ObjectTypeAttributes)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_NODE:
				setObjectTypeNode((ObjectTypeNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_FILE_MODE:
				setOpenFileMode(OPEN_FILE_MODE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_REQUEST:
				setOpenSecureChannelRequest((OpenSecureChannelRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_RESPONSE:
				setOpenSecureChannelResponse((OpenSecureChannelResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPTION_SET:
				setOptionSet((OptionSet)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ORIENTATION:
				setOrientation((Orientation)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__OVERRIDE_VALUE_HANDLING:
				setOverrideValueHandling(OVERRIDE_VALUE_HANDLING_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__PARSING_RESULT:
				setParsingResult((ParsingResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PERFORM_UPDATE_TYPE:
				setPerformUpdateType(PERFORM_UPDATE_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__PERMISSION_TYPE:
				setPermissionType(PERMISSION_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC2_DATA_TYPE:
				setProgramDiagnostic2DataType((ProgramDiagnostic2DataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC_DATA_TYPE:
				setProgramDiagnosticDataType((ProgramDiagnosticDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_ITEMS_DATA_TYPE:
				setPublishedDataItemsDataType((PublishedDataItemsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_DATA_TYPE:
				setPublishedDataSetDataType((PublishedDataSetDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				setPublishedDataSetSourceDataType((PublishedDataSetSourceDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_EVENTS_DATA_TYPE:
				setPublishedEventsDataType((PublishedEventsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_VARIABLE_DATA_TYPE:
				setPublishedVariableDataType((PublishedVariableDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_REQUEST:
				setPublishRequest((PublishRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_RESPONSE:
				setPublishResponse((PublishResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONFIGURATION_DATA_TYPE:
				setPubSubConfigurationDataType((PubSubConfigurationDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONNECTION_DATA_TYPE:
				setPubSubConnectionDataType((PubSubConnectionDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				setPubSubDiagnosticsCounterClassification(PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_GROUP_DATA_TYPE:
				setPubSubGroupDataType((PubSubGroupDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_STATE:
				setPubSubState(PUB_SUB_STATE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUALIFIED_NAME:
				setQualifiedName((QualifiedName)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_DESCRIPTION:
				setQueryDataDescription((QueryDataDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_SET:
				setQueryDataSet((QueryDataSet)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_REQUEST:
				setQueryFirstRequest((QueryFirstRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_RESPONSE:
				setQueryFirstResponse((QueryFirstResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_REQUEST:
				setQueryNextRequest((QueryNextRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_RESPONSE:
				setQueryNextResponse((QueryNextResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__RANGE:
				setRange((Range)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__RATIONAL_NUMBER:
				setRationalNumber((RationalNumber)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_ANNOTATION_DATA_DETAILS:
				setReadAnnotationDataDetails((ReadAnnotationDataDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_AT_TIME_DETAILS:
				setReadAtTimeDetails((ReadAtTimeDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_DATA_TYPE:
				setReaderGroupDataType((ReaderGroupDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_MESSAGE_DATA_TYPE:
				setReaderGroupMessageDataType((ReaderGroupMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_TRANSPORT_DATA_TYPE:
				setReaderGroupTransportDataType((ReaderGroupTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_EVENT_DETAILS:
				setReadEventDetails((ReadEventDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_PROCESSED_DETAILS:
				setReadProcessedDetails((ReadProcessedDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_RAW_MODIFIED_DETAILS:
				setReadRawModifiedDetails((ReadRawModifiedDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_REQUEST:
				setReadRequest((ReadRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_RESPONSE:
				setReadResponse((ReadResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__READ_VALUE_ID:
				setReadValueId((ReadValueId)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REDUNDANCY_SUPPORT:
				setRedundancySupport(REDUNDANCY_SUPPORT_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__REDUNDANT_SERVER_DATA_TYPE:
				setRedundantServerDataType((RedundantServerDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_DESCRIPTION:
				setReferenceDescription((ReferenceDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_NODE:
				setReferenceNode((ReferenceNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_ATTRIBUTES:
				setReferenceTypeAttributes((ReferenceTypeAttributes)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_NODE:
				setReferenceTypeNode((ReferenceTypeNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTERED_SERVER:
				setRegisteredServer((RegisteredServer)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_REQUEST:
				setRegisterNodesRequest((RegisterNodesRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_RESPONSE:
				setRegisterNodesResponse((RegisterNodesResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_REQUEST:
				setRegisterServer2Request((RegisterServer2Request)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_RESPONSE:
				setRegisterServer2Response((RegisterServer2Response)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_REQUEST:
				setRegisterServerRequest((RegisterServerRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_RESPONSE:
				setRegisterServerResponse((RegisterServerResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH:
				setRelativePath((RelativePath)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH_ELEMENT:
				setRelativePathElement((RelativePathElement)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_REQUEST:
				setRepublishRequest((RepublishRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_RESPONSE:
				setRepublishResponse((RepublishResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__REQUEST_HEADER:
				setRequestHeader((RequestHeader)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__ROLE_PERMISSION_TYPE:
				setRolePermissionType((RolePermissionType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__RSA_ENCRYPTED_SECRET:
				setRsaEncryptedSecret((Variant)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				setSamplingIntervalDiagnosticsDataType((SamplingIntervalDiagnosticsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SBYTE:
				setSByte(SBYTE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__SECURITY_TOKEN_REQUEST_TYPE:
				setSecurityTokenRequestType(SECURITY_TOKEN_REQUEST_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				setSemanticChangeStructureDataType((SemanticChangeStructureDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE:
				setServerDiagnosticsSummaryDataType((ServerDiagnosticsSummaryDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVER_ON_NETWORK:
				setServerOnNetwork((ServerOnNetwork)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATE:
				setServerState(SERVER_STATE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATUS_DATA_TYPE:
				setServerStatusDataType((ServerStatusDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVICE_COUNTER_DATA_TYPE:
				setServiceCounterDataType((ServiceCounterDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SERVICE_FAULT:
				setServiceFault((ServiceFault)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SESSION_AUTHENTICATION_TOKEN:
				setSessionAuthenticationToken((NodeId)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SESSION_DIAGNOSTICS_DATA_TYPE:
				setSessionDiagnosticsDataType((SessionDiagnosticsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_REQUEST_TYPE:
				setSessionlessInvokeRequestType((SessionlessInvokeRequestType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_RESPONSE_TYPE:
				setSessionlessInvokeResponseType((SessionlessInvokeResponseType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				setSessionSecurityDiagnosticsDataType((SessionSecurityDiagnosticsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_REQUEST:
				setSetMonitoringModeRequest((SetMonitoringModeRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_RESPONSE:
				setSetMonitoringModeResponse((SetMonitoringModeResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_REQUEST:
				setSetPublishingModeRequest((SetPublishingModeRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_RESPONSE:
				setSetPublishingModeResponse((SetPublishingModeResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_REQUEST:
				setSetTriggeringRequest((SetTriggeringRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_RESPONSE:
				setSetTriggeringResponse((SetTriggeringResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SIGNATURE_DATA:
				setSignatureData((SignatureData)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SIGNED_SOFTWARE_CERTIFICATE:
				setSignedSoftwareCertificate((SignedSoftwareCertificate)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_ATTRIBUTE_OPERAND:
				setSimpleAttributeOperand((SimpleAttributeOperand)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_TYPE_DESCRIPTION:
				setSimpleTypeDescription((SimpleTypeDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__STATUS_CHANGE_NOTIFICATION:
				setStatusChangeNotification((StatusChangeNotification)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__STATUS_RESULT:
				setStatusResult((StatusResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__STRING:
				setString(STRING_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DESCRIPTION:
				setStructureDescription((StructureDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_FIELD:
				setStructureField((StructureField)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_TYPE:
				setStructureType(STRUCTURE_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_DATA_TYPE:
				setSubscribedDataSetDataType((SubscribedDataSetDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				setSubscribedDataSetMirrorDataType((SubscribedDataSetMirrorDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_ACKNOWLEDGEMENT:
				setSubscriptionAcknowledgement((SubscriptionAcknowledgement)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				setSubscriptionDiagnosticsDataType((SubscriptionDiagnosticsDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__TARGET_VARIABLES_DATA_TYPE:
				setTargetVariablesDataType((TargetVariablesDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__THREE_DCARTESIAN_COORDINATES:
				setThreeDCartesianCoordinates((ThreeDCartesianCoordinates)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__THREE_DFRAME:
				setThreeDFrame((ThreeDFrame)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__THREE_DORIENTATION:
				setThreeDOrientation((ThreeDOrientation)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__THREE_DVECTOR:
				setThreeDVector((ThreeDVector)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__TIMESTAMPS_TO_RETURN:
				setTimestampsToReturn(TIMESTAMPS_TO_RETURN_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__TIME_STRING:
				setTimeString(TIME_STRING_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__TIME_ZONE_DATA_TYPE:
				setTimeZoneDataType((TimeZoneDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_RESULT:
				setTransferResult((TransferResult)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_REQUEST:
				setTransferSubscriptionsRequest((TransferSubscriptionsRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_RESPONSE:
				setTransferSubscriptionsResponse((TransferSubscriptionsResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST:
				setTranslateBrowsePathsToNodeIdsRequest((TranslateBrowsePathsToNodeIdsRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_RESPONSE:
				setTranslateBrowsePathsToNodeIdsResponse((TranslateBrowsePathsToNodeIdsResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_DATA_TYPE:
				setTrustListDataType((TrustListDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_MASKS:
				setTrustListMasks(TRUST_LIST_MASKS_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__TYPE_NODE:
				setTypeNode((TypeNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__UA_BINARY_FILE_DATA_TYPE:
				setUABinaryFileDataType((UABinaryFileDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				setUadpDataSetMessageContentMask(UADP_DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				setUadpDataSetReaderMessageDataType((UadpDataSetReaderMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				setUadpDataSetWriterMessageDataType((UadpDataSetWriterMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__UADP_NETWORK_MESSAGE_CONTENT_MASK:
				setUadpNetworkMessageContentMask(UADP_NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				setUadpWriterGroupMessageDataType((UadpWriterGroupMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__UINT16:
				setUInt16(UINT16_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__UINT32:
				setUInt32(UINT32_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__UINT64:
				setUInt64(UINT64_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__UNION:
				setUnion((Union)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_REQUEST:
				setUnregisterNodesRequest((UnregisterNodesRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_RESPONSE:
				setUnregisterNodesResponse((UnregisterNodesResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__UPDATE_DATA_DETAILS:
				setUpdateDataDetails((UpdateDataDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__UPDATE_EVENT_DETAILS:
				setUpdateEventDetails((UpdateEventDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__UPDATE_STRUCTURE_DATA_DETAILS:
				setUpdateStructureDataDetails((UpdateStructureDataDetails)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__USER_IDENTITY_TOKEN:
				setUserIdentityToken((UserIdentityToken)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__USER_NAME_IDENTITY_TOKEN:
				setUserNameIdentityToken((UserNameIdentityToken)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_POLICY:
				setUserTokenPolicy((UserTokenPolicy)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_TYPE:
				setUserTokenType(USER_TOKEN_TYPE_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__UTC_TIME:
				setUtcTime(UTC_TIME_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_ATTRIBUTES:
				setVariableAttributes((VariableAttributes)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_NODE:
				setVariableNode((VariableNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_ATTRIBUTES:
				setVariableTypeAttributes((VariableTypeAttributes)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_NODE:
				setVariableTypeNode((VariableTypeNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__VARIANT:
				setVariant((Variant)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__VECTOR:
				setVector((Vector)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__VERSION_TIME:
				setVersionTime(VERSION_TIME_EDEFAULT);
				return;
			case TypesPackage.DOCUMENT_ROOT__VIEW_ATTRIBUTES:
				setViewAttributes((ViewAttributes)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__VIEW_DESCRIPTION:
				setViewDescription((ViewDescription)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__VIEW_NODE:
				setViewNode((ViewNode)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITE_REQUEST:
				setWriteRequest((WriteRequest)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITE_RESPONSE:
				setWriteResponse((WriteResponse)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_DATA_TYPE:
				setWriterGroupDataType((WriterGroupDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_MESSAGE_DATA_TYPE:
				setWriterGroupMessageDataType((WriterGroupMessageDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_TRANSPORT_DATA_TYPE:
				setWriterGroupTransportDataType((WriterGroupTransportDataType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__WRITE_VALUE:
				setWriteValue((WriteValue)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__X509_IDENTITY_TOKEN:
				setX509IdentityToken((X509IdentityToken)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__XV_TYPE:
				setXVType((XVType)null);
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
			case TypesPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case TypesPackage.DOCUMENT_ROOT__ACCESS_LEVEL_EX_TYPE:
				return getAccessLevelExType() != ACCESS_LEVEL_EX_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__ACCESS_LEVEL_TYPE:
				return getAccessLevelType() != ACCESS_LEVEL_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_REQUEST:
				return getActivateSessionRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_RESPONSE:
				return getActivateSessionResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_ITEM:
				return getAddNodesItem() != null;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_REQUEST:
				return getAddNodesRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESPONSE:
				return getAddNodesResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESULT:
				return getAddNodesResult() != null;
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_ITEM:
				return getAddReferencesItem() != null;
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_REQUEST:
				return getAddReferencesRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_RESPONSE:
				return getAddReferencesResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_CONFIGURATION:
				return getAggregateConfiguration() != null;
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER:
				return getAggregateFilter() != null;
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER_RESULT:
				return getAggregateFilterResult() != null;
			case TypesPackage.DOCUMENT_ROOT__ALIAS_NAME_DATA_TYPE:
				return getAliasNameDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation() != null;
			case TypesPackage.DOCUMENT_ROOT__ANONYMOUS_IDENTITY_TOKEN:
				return getAnonymousIdentityToken() != null;
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_DESCRIPTION:
				return getApplicationDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_INSTANCE_CERTIFICATE:
				return APPLICATION_INSTANCE_CERTIFICATE_EDEFAULT == null ? getApplicationInstanceCertificate() != null : !APPLICATION_INSTANCE_CERTIFICATE_EDEFAULT.equals(getApplicationInstanceCertificate());
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_TYPE:
				return getApplicationType() != APPLICATION_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__ARGUMENT:
				return getArgument() != null;
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_OPERAND:
				return getAttributeOperand() != null;
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_WRITE_MASK:
				return getAttributeWriteMask() != ATTRIBUTE_WRITE_MASK_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__AUDIO_DATA_TYPE:
				return AUDIO_DATA_TYPE_EDEFAULT == null ? getAudioDataType() != null : !AUDIO_DATA_TYPE_EDEFAULT.equals(getAudioDataType());
			case TypesPackage.DOCUMENT_ROOT__AXIS_INFORMATION:
				return getAxisInformation() != null;
			case TypesPackage.DOCUMENT_ROOT__AXIS_SCALE_ENUMERATION:
				return getAxisScaleEnumeration() != AXIS_SCALE_ENUMERATION_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__BIT_FIELD_MASK_DATA_TYPE:
				return BIT_FIELD_MASK_DATA_TYPE_EDEFAULT == null ? getBitFieldMaskDataType() != null : !BIT_FIELD_MASK_DATA_TYPE_EDEFAULT.equals(getBitFieldMaskDataType());
			case TypesPackage.DOCUMENT_ROOT__BOOLEAN:
				return BOOLEAN_EDEFAULT == null ? getBoolean() != null : !BOOLEAN_EDEFAULT.equals(getBoolean());
			case TypesPackage.DOCUMENT_ROOT__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				return getBrokerConnectionTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return getBrokerDataSetReaderTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return getBrokerDataSetWriterTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				return getBrokerTransportQualityOfService() != BROKER_TRANSPORT_QUALITY_OF_SERVICE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getBrokerWriterGroupTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DESCRIPTION:
				return getBrowseDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DIRECTION:
				return getBrowseDirection() != BROWSE_DIRECTION_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_REQUEST:
				return getBrowseNextRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_RESPONSE:
				return getBrowseNextResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH:
				return getBrowsePath() != null;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_RESULT:
				return getBrowsePathResult() != null;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_TARGET:
				return getBrowsePathTarget() != null;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_REQUEST:
				return getBrowseRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESPONSE:
				return getBrowseResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT:
				return getBrowseResult() != null;
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT_MASK:
				return getBrowseResultMask() != BROWSE_RESULT_MASK_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__BUILD_INFO:
				return getBuildInfo() != null;
			case TypesPackage.DOCUMENT_ROOT__BYTE:
				return BYTE_EDEFAULT == null ? getByte() != null : !BYTE_EDEFAULT.equals(getByte());
			case TypesPackage.DOCUMENT_ROOT__BYTE_STRING:
				return BYTE_STRING_EDEFAULT == null ? getByteString() != null : !BYTE_STRING_EDEFAULT.equals(getByteString());
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_REQUEST:
				return getCallMethodRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_RESULT:
				return getCallMethodResult() != null;
			case TypesPackage.DOCUMENT_ROOT__CALL_REQUEST:
				return getCallRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__CALL_RESPONSE:
				return getCallResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__CANCEL_REQUEST:
				return getCancelRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__CANCEL_RESPONSE:
				return getCancelResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__CARTESIAN_COORDINATES:
				return getCartesianCoordinates() != null;
			case TypesPackage.DOCUMENT_ROOT__CHANNEL_SECURITY_TOKEN:
				return getChannelSecurityToken() != null;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_REQUEST:
				return getCloseSecureChannelRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_RESPONSE:
				return getCloseSecureChannelResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_REQUEST:
				return getCloseSessionRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_RESPONSE:
				return getCloseSessionResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__COMPLEX_NUMBER_TYPE:
				return getComplexNumberType() != null;
			case TypesPackage.DOCUMENT_ROOT__CONFIGURATION_VERSION_DATA_TYPE:
				return getConfigurationVersionDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__CONNECTION_TRANSPORT_DATA_TYPE:
				return getConnectionTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER:
				return getContentFilter() != null;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT:
				return getContentFilterElement() != null;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT_RESULT:
				return getContentFilterElementResult() != null;
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_RESULT:
				return getContentFilterResult() != null;
			case TypesPackage.DOCUMENT_ROOT__CONTINUATION_POINT:
				return CONTINUATION_POINT_EDEFAULT == null ? getContinuationPoint() != null : !CONTINUATION_POINT_EDEFAULT.equals(getContinuationPoint());
			case TypesPackage.DOCUMENT_ROOT__COUNTER:
				return getCounter() != COUNTER_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_REQUEST:
				return getCreateMonitoredItemsRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_RESPONSE:
				return getCreateMonitoredItemsResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_REQUEST:
				return getCreateSessionRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_RESPONSE:
				return getCreateSessionResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_REQUEST:
				return getCreateSubscriptionRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_RESPONSE:
				return getCreateSubscriptionResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__CURRENCY_UNIT_TYPE:
				return getCurrencyUnitType() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_FILTER:
				return getDataChangeFilter() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_NOTIFICATION:
				return getDataChangeNotification() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_TRIGGER:
				return getDataChangeTrigger() != DATA_CHANGE_TRIGGER_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				return getDatagramConnectionTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getDatagramWriterGroupTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_FIELD_CONTENT_MASK:
				return getDataSetFieldContentMask() != DATA_SET_FIELD_CONTENT_MASK_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_FIELD_FLAGS:
				return getDataSetFieldFlags() != DATA_SET_FIELD_FLAGS_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_META_DATA_TYPE:
				return getDataSetMetaDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_ORDERING_TYPE:
				return getDataSetOrderingType() != DATA_SET_ORDERING_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_DATA_TYPE:
				return getDataSetReaderDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getDataSetReaderMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return getDataSetReaderTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_DATA_TYPE:
				return getDataSetWriterDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getDataSetWriterMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return getDataSetWriterTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_ATTRIBUTES:
				return getDataTypeAttributes() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DEFINITION:
				return getDataTypeDefinition() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DESCRIPTION:
				return getDataTypeDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_NODE:
				return getDataTypeNode() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_SCHEMA_HEADER:
				return getDataTypeSchemaHeader() != null;
			case TypesPackage.DOCUMENT_ROOT__DATA_VALUE:
				return getDataValue() != null;
			case TypesPackage.DOCUMENT_ROOT__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case TypesPackage.DOCUMENT_ROOT__DATE_STRING:
				return DATE_STRING_EDEFAULT == null ? getDateString() != null : !DATE_STRING_EDEFAULT.equals(getDateString());
			case TypesPackage.DOCUMENT_ROOT__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? getDateTime() != null : !DATE_TIME_EDEFAULT.equals(getDateTime());
			case TypesPackage.DOCUMENT_ROOT__DEADBAND_TYPE:
				return getDeadbandType() != DEADBAND_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_DATA_TYPE:
				return getDecimalDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_STRING:
				return DECIMAL_STRING_EDEFAULT == null ? getDecimalString() != null : !DECIMAL_STRING_EDEFAULT.equals(getDecimalString());
			case TypesPackage.DOCUMENT_ROOT__DELETE_AT_TIME_DETAILS:
				return getDeleteAtTimeDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_EVENT_DETAILS:
				return getDeleteEventDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_REQUEST:
				return getDeleteMonitoredItemsRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_RESPONSE:
				return getDeleteMonitoredItemsResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_ITEM:
				return getDeleteNodesItem() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_REQUEST:
				return getDeleteNodesRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_RESPONSE:
				return getDeleteNodesResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_RAW_MODIFIED_DETAILS:
				return getDeleteRawModifiedDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_ITEM:
				return getDeleteReferencesItem() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_REQUEST:
				return getDeleteReferencesRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_RESPONSE:
				return getDeleteReferencesResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_REQUEST:
				return getDeleteSubscriptionsRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_RESPONSE:
				return getDeleteSubscriptionsResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTIC_INFO:
				return getDiagnosticInfo() != null;
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTICS_LEVEL:
				return getDiagnosticsLevel() != DIAGNOSTICS_LEVEL_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__DISCOVERY_CONFIGURATION:
				return getDiscoveryConfiguration() != null;
			case TypesPackage.DOCUMENT_ROOT__DOUBLE:
				return DOUBLE_EDEFAULT == null ? getDouble() != null : !DOUBLE_EDEFAULT.equals(getDouble());
			case TypesPackage.DOCUMENT_ROOT__DOUBLE_COMPLEX_NUMBER_TYPE:
				return getDoubleComplexNumberType() != null;
			case TypesPackage.DOCUMENT_ROOT__DURATION:
				return getDuration() != DURATION_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__DURATION_STRING:
				return DURATION_STRING_EDEFAULT == null ? getDurationString() != null : !DURATION_STRING_EDEFAULT.equals(getDurationString());
			case TypesPackage.DOCUMENT_ROOT__ELEMENT_OPERAND:
				return getElementOperand() != null;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_CONFIGURATION:
				return getEndpointConfiguration() != null;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_DESCRIPTION:
				return getEndpointDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_TYPE:
				return getEndpointType() != null;
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_URL_LIST_DATA_TYPE:
				return getEndpointUrlListDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__ENUM_DEFINITION:
				return getEnumDefinition() != null;
			case TypesPackage.DOCUMENT_ROOT__ENUM_DESCRIPTION:
				return getEnumDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__ENUM_FIELD:
				return getEnumField() != null;
			case TypesPackage.DOCUMENT_ROOT__ENUM_VALUE_TYPE:
				return getEnumValueType() != null;
			case TypesPackage.DOCUMENT_ROOT__EU_INFORMATION:
				return getEUInformation() != null;
			case TypesPackage.DOCUMENT_ROOT__EVENT_FIELD_LIST:
				return getEventFieldList() != null;
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER:
				return getEventFilter() != null;
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER_RESULT:
				return getEventFilterResult() != null;
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFICATION_LIST:
				return getEventNotificationList() != null;
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFIER_TYPE:
				return getEventNotifierType() != EVENT_NOTIFIER_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__EXCEPTION_DEVIATION_FORMAT:
				return getExceptionDeviationFormat() != EXCEPTION_DEVIATION_FORMAT_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__EXPANDED_NODE_ID:
				return getExpandedNodeId() != null;
			case TypesPackage.DOCUMENT_ROOT__EXTENSION_OBJECT:
				return getExtensionObject() != null;
			case TypesPackage.DOCUMENT_ROOT__FIELD_META_DATA:
				return getFieldMetaData() != null;
			case TypesPackage.DOCUMENT_ROOT__FIELD_TARGET_DATA_TYPE:
				return getFieldTargetDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERAND:
				return getFilterOperand() != null;
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERATOR:
				return getFilterOperator() != FILTER_OPERATOR_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_REQUEST:
				return getFindServersOnNetworkRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_RESPONSE:
				return getFindServersOnNetworkResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_REQUEST:
				return getFindServersRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_RESPONSE:
				return getFindServersResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__FLOAT:
				return FLOAT_EDEFAULT == null ? getFloat() != null : !FLOAT_EDEFAULT.equals(getFloat());
			case TypesPackage.DOCUMENT_ROOT__FRAME:
				return getFrame() != null;
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTES:
				return getGenericAttributes() != null;
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTE_VALUE:
				return getGenericAttributeValue() != null;
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_REQUEST:
				return getGetEndpointsRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_RESPONSE:
				return getGetEndpointsResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__GUID:
				return getGuid() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_DATA:
				return getHistoryData() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT:
				return getHistoryEvent() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT_FIELD_LIST:
				return getHistoryEventFieldList() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_MODIFIED_DATA:
				return getHistoryModifiedData() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_DETAILS:
				return getHistoryReadDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_REQUEST:
				return getHistoryReadRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESPONSE:
				return getHistoryReadResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESULT:
				return getHistoryReadResult() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_VALUE_ID:
				return getHistoryReadValueId() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_DETAILS:
				return getHistoryUpdateDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_REQUEST:
				return getHistoryUpdateRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESPONSE:
				return getHistoryUpdateResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESULT:
				return getHistoryUpdateResult() != null;
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_TYPE:
				return getHistoryUpdateType() != HISTORY_UPDATE_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_CRITERIA_TYPE:
				return getIdentityCriteriaType() != IDENTITY_CRITERIA_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_MAPPING_RULE_TYPE:
				return getIdentityMappingRuleType() != null;
			case TypesPackage.DOCUMENT_ROOT__ID_TYPE:
				return getIdType() != ID_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__IMAGE_BMP:
				return IMAGE_BMP_EDEFAULT == null ? getImageBMP() != null : !IMAGE_BMP_EDEFAULT.equals(getImageBMP());
			case TypesPackage.DOCUMENT_ROOT__IMAGE_GIF:
				return IMAGE_GIF_EDEFAULT == null ? getImageGIF() != null : !IMAGE_GIF_EDEFAULT.equals(getImageGIF());
			case TypesPackage.DOCUMENT_ROOT__IMAGE_JPG:
				return IMAGE_JPG_EDEFAULT == null ? getImageJPG() != null : !IMAGE_JPG_EDEFAULT.equals(getImageJPG());
			case TypesPackage.DOCUMENT_ROOT__IMAGE_PNG:
				return IMAGE_PNG_EDEFAULT == null ? getImagePNG() != null : !IMAGE_PNG_EDEFAULT.equals(getImagePNG());
			case TypesPackage.DOCUMENT_ROOT__INDEX:
				return getIndex() != INDEX_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__INSTANCE_NODE:
				return getInstanceNode() != null;
			case TypesPackage.DOCUMENT_ROOT__INT16:
				return INT16_EDEFAULT == null ? getInt16() != null : !INT16_EDEFAULT.equals(getInt16());
			case TypesPackage.DOCUMENT_ROOT__INT32:
				return INT32_EDEFAULT == null ? getInt32() != null : !INT32_EDEFAULT.equals(getInt32());
			case TypesPackage.DOCUMENT_ROOT__INT64:
				return INT64_EDEFAULT == null ? getInt64() != null : !INT64_EDEFAULT.equals(getInt64());
			case TypesPackage.DOCUMENT_ROOT__INTEGER_ID:
				return getIntegerId() != INTEGER_ID_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__INVOKE_SERVICE_REQUEST:
				return INVOKE_SERVICE_REQUEST_EDEFAULT == null ? getInvokeServiceRequest() != null : !INVOKE_SERVICE_REQUEST_EDEFAULT.equals(getInvokeServiceRequest());
			case TypesPackage.DOCUMENT_ROOT__INVOKE_SERVICE_RESPONSE:
				return INVOKE_SERVICE_RESPONSE_EDEFAULT == null ? getInvokeServiceResponse() != null : !INVOKE_SERVICE_RESPONSE_EDEFAULT.equals(getInvokeServiceResponse());
			case TypesPackage.DOCUMENT_ROOT__ISSUED_IDENTITY_TOKEN:
				return getIssuedIdentityToken() != null;
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				return getJsonDataSetMessageContentMask() != JSON_DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getJsonDataSetReaderMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getJsonDataSetWriterMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__JSON_NETWORK_MESSAGE_CONTENT_MASK:
				return getJsonNetworkMessageContentMask() != JSON_NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getJsonWriterGroupMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__KEY_VALUE_PAIR:
				return getKeyValuePair() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_ITEM:
				return getListOfAddNodesItem() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_RESULT:
				return getListOfAddNodesResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_REFERENCES_ITEM:
				return getListOfAddReferencesItem() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ALIAS_NAME_DATA_TYPE:
				return getListOfAliasNameDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_APPLICATION_DESCRIPTION:
				return getListOfApplicationDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ARGUMENT:
				return getListOfArgument() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BOOLEAN:
				return getListOfBoolean() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				return getListOfBrokerConnectionTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return getListOfBrokerDataSetReaderTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return getListOfBrokerDataSetWriterTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				return getListOfBrokerTransportQualityOfService() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getListOfBrokerWriterGroupTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_DESCRIPTION:
				return getListOfBrowseDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH:
				return getListOfBrowsePath() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_RESULT:
				return getListOfBrowsePathResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_TARGET:
				return getListOfBrowsePathTarget() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_RESULT:
				return getListOfBrowseResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE:
				return getListOfByte() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE_STRING:
				return getListOfByteString() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_REQUEST:
				return getListOfCallMethodRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_RESULT:
				return getListOfCallMethodResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CARTESIAN_COORDINATES:
				return getListOfCartesianCoordinates() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONFIGURATION_VERSION_DATA_TYPE:
				return getListOfConfigurationVersionDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE:
				return getListOfConnectionTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER:
				return getListOfContentFilter() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT:
				return getListOfContentFilterElement() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT_RESULT:
				return getListOfContentFilterElementResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CURRENCY_UNIT_TYPE:
				return getListOfCurrencyUnitType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				return getListOfDatagramConnectionTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getListOfDatagramWriterGroupTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_FIELD_CONTENT_MASK:
				return getListOfDataSetFieldContentMask() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_META_DATA_TYPE:
				return getListOfDataSetMetaDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_ORDERING_TYPE:
				return getListOfDataSetOrderingType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_DATA_TYPE:
				return getListOfDataSetReaderDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getListOfDataSetReaderMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return getListOfDataSetReaderTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_DATA_TYPE:
				return getListOfDataSetWriterDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getListOfDataSetWriterMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return getListOfDataSetWriterTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DEFINITION:
				return getListOfDataTypeDefinition() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DESCRIPTION:
				return getListOfDataTypeDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_SCHEMA_HEADER:
				return getListOfDataTypeSchemaHeader() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_VALUE:
				return getListOfDataValue() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATE_TIME:
				return getListOfDateTime() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_NODES_ITEM:
				return getListOfDeleteNodesItem() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_REFERENCES_ITEM:
				return getListOfDeleteReferencesItem() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTIC_INFO:
				return getListOfDiagnosticInfo() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTICS_LEVEL:
				return getListOfDiagnosticsLevel() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DOUBLE:
				return getListOfDouble() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_CONFIGURATION:
				return getListOfEndpointConfiguration() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_DESCRIPTION:
				return getListOfEndpointDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_TYPE:
				return getListOfEndpointType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE:
				return getListOfEndpointUrlListDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DEFINITION:
				return getListOfEnumDefinition() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DESCRIPTION:
				return getListOfEnumDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_FIELD:
				return getListOfEnumField() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_VALUE_TYPE:
				return getListOfEnumValueType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EVENT_FIELD_LIST:
				return getListOfEventFieldList() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXPANDED_NODE_ID:
				return getListOfExpandedNodeId() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXTENSION_OBJECT:
				return getListOfExtensionObject() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_META_DATA:
				return getListOfFieldMetaData() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_TARGET_DATA_TYPE:
				return getListOfFieldTargetDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FLOAT:
				return getListOfFloat() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FRAME:
				return getListOfFrame() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GENERIC_ATTRIBUTE_VALUE:
				return getListOfGenericAttributeValue() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GUID:
				return getListOfGuid() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_EVENT_FIELD_LIST:
				return getListOfHistoryEventFieldList() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_RESULT:
				return getListOfHistoryReadResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_VALUE_ID:
				return getListOfHistoryReadValueId() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_UPDATE_RESULT:
				return getListOfHistoryUpdateResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_CRITERIA_TYPE:
				return getListOfIdentityCriteriaType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_MAPPING_RULE_TYPE:
				return getListOfIdentityMappingRuleType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ID_TYPE:
				return getListOfIdType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT16:
				return getListOfInt16() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT32:
				return getListOfInt32() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT64:
				return getListOfInt64() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				return getListOfJsonDataSetMessageContentMask() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getListOfJsonDataSetReaderMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getListOfJsonDataSetWriterMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK:
				return getListOfJsonNetworkMessageContentMask() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getListOfJsonWriterGroupMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_KEY_VALUE_PAIR:
				return getListOfKeyValuePair() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_LOCALIZED_TEXT:
				return getListOfLocalizedText() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODEL_CHANGE_STRUCTURE_DATA_TYPE:
				return getListOfModelChangeStructureDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODIFICATION_INFO:
				return getListOfModificationInfo() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_REQUEST:
				return getListOfMonitoredItemCreateRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_RESULT:
				return getListOfMonitoredItemCreateResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_REQUEST:
				return getListOfMonitoredItemModifyRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_RESULT:
				return getListOfMonitoredItemModifyResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_NOTIFICATION:
				return getListOfMonitoredItemNotification() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_DATA_TYPE:
				return getListOfNetworkAddressDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE:
				return getListOfNetworkAddressUrlDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_GROUP_DATA_TYPE:
				return getListOfNetworkGroupDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE:
				return getListOfNode() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_ID:
				return getListOfNodeId() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_REFERENCE:
				return getListOfNodeReference() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_TYPE_DESCRIPTION:
				return getListOfNodeTypeDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPEN_FILE_MODE:
				return getListOfOpenFileMode() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPTION_SET:
				return getListOfOptionSet() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ORIENTATION:
				return getListOfOrientation() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OVERRIDE_VALUE_HANDLING:
				return getListOfOverrideValueHandling() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PARSING_RESULT:
				return getListOfParsingResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE:
				return getListOfPublishedDataItemsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE:
				return getListOfPublishedDataSetDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				return getListOfPublishedDataSetSourceDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_EVENTS_DATA_TYPE:
				return getListOfPublishedEventsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_VARIABLE_DATA_TYPE:
				return getListOfPublishedVariableDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE:
				return getListOfPubSubConfigurationDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE:
				return getListOfPubSubConnectionDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				return getListOfPubSubDiagnosticsCounterClassification() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_GROUP_DATA_TYPE:
				return getListOfPubSubGroupDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_STATE:
				return getListOfPubSubState() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUALIFIED_NAME:
				return getListOfQualifiedName() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_DESCRIPTION:
				return getListOfQueryDataDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_SET:
				return getListOfQueryDataSet() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RATIONAL_NUMBER:
				return getListOfRationalNumber() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_DATA_TYPE:
				return getListOfReaderGroupDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE:
				return getListOfReaderGroupMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE:
				return getListOfReaderGroupTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READ_VALUE_ID:
				return getListOfReadValueId() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REDUNDANT_SERVER_DATA_TYPE:
				return getListOfRedundantServerDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_DESCRIPTION:
				return getListOfReferenceDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_NODE:
				return getListOfReferenceNode() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REGISTERED_SERVER:
				return getListOfRegisteredServer() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RELATIVE_PATH_ELEMENT:
				return getListOfRelativePathElement() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ROLE_PERMISSION_TYPE:
				return getListOfRolePermissionType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				return getListOfSamplingIntervalDiagnosticsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SBYTE:
				return getListOfSByte() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				return getListOfSemanticChangeStructureDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SERVER_ON_NETWORK:
				return getListOfServerOnNetwork() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE:
				return getListOfSessionDiagnosticsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				return getListOfSessionSecurityDiagnosticsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIGNED_SOFTWARE_CERTIFICATE:
				return getListOfSignedSoftwareCertificate() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_ATTRIBUTE_OPERAND:
				return getListOfSimpleAttributeOperand() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_TYPE_DESCRIPTION:
				return getListOfSimpleTypeDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_CODE:
				return getListOfStatusCode() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_RESULT:
				return getListOfStatusResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRING:
				return getListOfString() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DEFINITION:
				return getListOfStructureDefinition() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DESCRIPTION:
				return getListOfStructureDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_FIELD:
				return getListOfStructureField() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE:
				return getListOfSubscribedDataSetDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				return getListOfSubscribedDataSetMirrorDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT:
				return getListOfSubscriptionAcknowledgement() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				return getListOfSubscriptionDiagnosticsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TARGET_VARIABLES_DATA_TYPE:
				return getListOfTargetVariablesDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DCARTESIAN_COORDINATES:
				return getListOfThreeDCartesianCoordinates() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DFRAME:
				return getListOfThreeDFrame() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DORIENTATION:
				return getListOfThreeDOrientation() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DVECTOR:
				return getListOfThreeDVector() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TIME_ZONE_DATA_TYPE:
				return getListOfTimeZoneDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRANSFER_RESULT:
				return getListOfTransferResult() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRUST_LIST_DATA_TYPE:
				return getListOfTrustListDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UA_BINARY_FILE_DATA_TYPE:
				return getListOfUABinaryFileDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				return getListOfUadpDataSetMessageContentMask() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getListOfUadpDataSetReaderMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getListOfUadpDataSetWriterMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK:
				return getListOfUadpNetworkMessageContentMask() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getListOfUadpWriterGroupMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT16:
				return getListOfUInt16() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT32:
				return getListOfUInt32() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT64:
				return getListOfUInt64() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UNION:
				return getListOfUnion() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_USER_TOKEN_POLICY:
				return getListOfUserTokenPolicy() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VARIANT:
				return getListOfVariant() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VECTOR:
				return getListOfVector() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_DATA_TYPE:
				return getListOfWriterGroupDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getListOfWriterGroupMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getListOfWriterGroupTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITE_VALUE:
				return getListOfWriteValue() != null;
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_XML_ELEMENT:
				return getListOfXmlElement() != null;
			case TypesPackage.DOCUMENT_ROOT__LITERAL_OPERAND:
				return getLiteralOperand() != null;
			case TypesPackage.DOCUMENT_ROOT__LOCALE_ID:
				return LOCALE_ID_EDEFAULT == null ? getLocaleId() != null : !LOCALE_ID_EDEFAULT.equals(getLocaleId());
			case TypesPackage.DOCUMENT_ROOT__LOCALIZED_TEXT:
				return getLocalizedText() != null;
			case TypesPackage.DOCUMENT_ROOT__MDNS_DISCOVERY_CONFIGURATION:
				return getMdnsDiscoveryConfiguration() != null;
			case TypesPackage.DOCUMENT_ROOT__MESSAGE_SECURITY_MODE:
				return getMessageSecurityMode() != MESSAGE_SECURITY_MODE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__METHOD_ATTRIBUTES:
				return getMethodAttributes() != null;
			case TypesPackage.DOCUMENT_ROOT__METHOD_NODE:
				return getMethodNode() != null;
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_DATA_TYPE:
				return getModelChangeStructureDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_VERB_MASK:
				return getModelChangeStructureVerbMask() != MODEL_CHANGE_STRUCTURE_VERB_MASK_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__MODIFICATION_INFO:
				return getModificationInfo() != null;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_REQUEST:
				return getModifyMonitoredItemsRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_RESPONSE:
				return getModifyMonitoredItemsResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_REQUEST:
				return getModifySubscriptionRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_RESPONSE:
				return getModifySubscriptionResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_REQUEST:
				return getMonitoredItemCreateRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_RESULT:
				return getMonitoredItemCreateResult() != null;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_REQUEST:
				return getMonitoredItemModifyRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_RESULT:
				return getMonitoredItemModifyResult() != null;
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_NOTIFICATION:
				return getMonitoredItemNotification() != null;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER:
				return getMonitoringFilter() != null;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER_RESULT:
				return getMonitoringFilterResult() != null;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_MODE:
				return getMonitoringMode() != MONITORING_MODE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__MONITORING_PARAMETERS:
				return getMonitoringParameters() != null;
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_DATA_TYPE:
				return getNetworkAddressDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_URL_DATA_TYPE:
				return getNetworkAddressUrlDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__NETWORK_GROUP_DATA_TYPE:
				return getNetworkGroupDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__NODE:
				return getNode() != null;
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES:
				return getNodeAttributes() != null;
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES_MASK:
				return getNodeAttributesMask() != NODE_ATTRIBUTES_MASK_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__NODE_CLASS:
				return getNodeClass() != NODE_CLASS_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__NODE_ID:
				return getNodeId() != null;
			case TypesPackage.DOCUMENT_ROOT__NODE_REFERENCE:
				return getNodeReference() != null;
			case TypesPackage.DOCUMENT_ROOT__NODE_TYPE_DESCRIPTION:
				return getNodeTypeDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__NORMALIZED_STRING:
				return NORMALIZED_STRING_EDEFAULT == null ? getNormalizedString() != null : !NORMALIZED_STRING_EDEFAULT.equals(getNormalizedString());
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_DATA:
				return getNotificationData() != null;
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_MESSAGE:
				return getNotificationMessage() != null;
			case TypesPackage.DOCUMENT_ROOT__NUMERIC_RANGE:
				return NUMERIC_RANGE_EDEFAULT == null ? getNumericRange() != null : !NUMERIC_RANGE_EDEFAULT.equals(getNumericRange());
			case TypesPackage.DOCUMENT_ROOT__OBJECT_ATTRIBUTES:
				return getObjectAttributes() != null;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_NODE:
				return getObjectNode() != null;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_ATTRIBUTES:
				return getObjectTypeAttributes() != null;
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_NODE:
				return getObjectTypeNode() != null;
			case TypesPackage.DOCUMENT_ROOT__OPEN_FILE_MODE:
				return getOpenFileMode() != OPEN_FILE_MODE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_REQUEST:
				return getOpenSecureChannelRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_RESPONSE:
				return getOpenSecureChannelResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__OPTION_SET:
				return getOptionSet() != null;
			case TypesPackage.DOCUMENT_ROOT__ORIENTATION:
				return getOrientation() != null;
			case TypesPackage.DOCUMENT_ROOT__OVERRIDE_VALUE_HANDLING:
				return getOverrideValueHandling() != OVERRIDE_VALUE_HANDLING_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__PARSING_RESULT:
				return getParsingResult() != null;
			case TypesPackage.DOCUMENT_ROOT__PERFORM_UPDATE_TYPE:
				return getPerformUpdateType() != PERFORM_UPDATE_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__PERMISSION_TYPE:
				return getPermissionType() != PERMISSION_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC2_DATA_TYPE:
				return getProgramDiagnostic2DataType() != null;
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC_DATA_TYPE:
				return getProgramDiagnosticDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_ITEMS_DATA_TYPE:
				return getPublishedDataItemsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_DATA_TYPE:
				return getPublishedDataSetDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				return getPublishedDataSetSourceDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_EVENTS_DATA_TYPE:
				return getPublishedEventsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_VARIABLE_DATA_TYPE:
				return getPublishedVariableDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_REQUEST:
				return getPublishRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_RESPONSE:
				return getPublishResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONFIGURATION_DATA_TYPE:
				return getPubSubConfigurationDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONNECTION_DATA_TYPE:
				return getPubSubConnectionDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				return getPubSubDiagnosticsCounterClassification() != PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_GROUP_DATA_TYPE:
				return getPubSubGroupDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_STATE:
				return getPubSubState() != PUB_SUB_STATE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__QUALIFIED_NAME:
				return getQualifiedName() != null;
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_DESCRIPTION:
				return getQueryDataDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_SET:
				return getQueryDataSet() != null;
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_REQUEST:
				return getQueryFirstRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_RESPONSE:
				return getQueryFirstResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_REQUEST:
				return getQueryNextRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_RESPONSE:
				return getQueryNextResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__RANGE:
				return getRange() != null;
			case TypesPackage.DOCUMENT_ROOT__RATIONAL_NUMBER:
				return getRationalNumber() != null;
			case TypesPackage.DOCUMENT_ROOT__READ_ANNOTATION_DATA_DETAILS:
				return getReadAnnotationDataDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__READ_AT_TIME_DETAILS:
				return getReadAtTimeDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_DATA_TYPE:
				return getReaderGroupDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_MESSAGE_DATA_TYPE:
				return getReaderGroupMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_TRANSPORT_DATA_TYPE:
				return getReaderGroupTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__READ_EVENT_DETAILS:
				return getReadEventDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__READ_PROCESSED_DETAILS:
				return getReadProcessedDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__READ_RAW_MODIFIED_DETAILS:
				return getReadRawModifiedDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__READ_REQUEST:
				return getReadRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__READ_RESPONSE:
				return getReadResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__READ_VALUE_ID:
				return getReadValueId() != null;
			case TypesPackage.DOCUMENT_ROOT__REDUNDANCY_SUPPORT:
				return getRedundancySupport() != REDUNDANCY_SUPPORT_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__REDUNDANT_SERVER_DATA_TYPE:
				return getRedundantServerDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_DESCRIPTION:
				return getReferenceDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_NODE:
				return getReferenceNode() != null;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_ATTRIBUTES:
				return getReferenceTypeAttributes() != null;
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_NODE:
				return getReferenceTypeNode() != null;
			case TypesPackage.DOCUMENT_ROOT__REGISTERED_SERVER:
				return getRegisteredServer() != null;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_REQUEST:
				return getRegisterNodesRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_RESPONSE:
				return getRegisterNodesResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_REQUEST:
				return getRegisterServer2Request() != null;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_RESPONSE:
				return getRegisterServer2Response() != null;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_REQUEST:
				return getRegisterServerRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_RESPONSE:
				return getRegisterServerResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH:
				return getRelativePath() != null;
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH_ELEMENT:
				return getRelativePathElement() != null;
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_REQUEST:
				return getRepublishRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_RESPONSE:
				return getRepublishResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__REQUEST_HEADER:
				return getRequestHeader() != null;
			case TypesPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
				return getResponseHeader() != null;
			case TypesPackage.DOCUMENT_ROOT__ROLE_PERMISSION_TYPE:
				return getRolePermissionType() != null;
			case TypesPackage.DOCUMENT_ROOT__RSA_ENCRYPTED_SECRET:
				return getRsaEncryptedSecret() != null;
			case TypesPackage.DOCUMENT_ROOT__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
				return getSamplingIntervalDiagnosticsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__SBYTE:
				return SBYTE_EDEFAULT == null ? getSByte() != null : !SBYTE_EDEFAULT.equals(getSByte());
			case TypesPackage.DOCUMENT_ROOT__SECURITY_TOKEN_REQUEST_TYPE:
				return getSecurityTokenRequestType() != SECURITY_TOKEN_REQUEST_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				return getSemanticChangeStructureDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE:
				return getServerDiagnosticsSummaryDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__SERVER_ON_NETWORK:
				return getServerOnNetwork() != null;
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATE:
				return getServerState() != SERVER_STATE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATUS_DATA_TYPE:
				return getServerStatusDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__SERVICE_COUNTER_DATA_TYPE:
				return getServiceCounterDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__SERVICE_FAULT:
				return getServiceFault() != null;
			case TypesPackage.DOCUMENT_ROOT__SESSION_AUTHENTICATION_TOKEN:
				return getSessionAuthenticationToken() != null;
			case TypesPackage.DOCUMENT_ROOT__SESSION_DIAGNOSTICS_DATA_TYPE:
				return getSessionDiagnosticsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_REQUEST_TYPE:
				return getSessionlessInvokeRequestType() != null;
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_RESPONSE_TYPE:
				return getSessionlessInvokeResponseType() != null;
			case TypesPackage.DOCUMENT_ROOT__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
				return getSessionSecurityDiagnosticsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_REQUEST:
				return getSetMonitoringModeRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_RESPONSE:
				return getSetMonitoringModeResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_REQUEST:
				return getSetPublishingModeRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_RESPONSE:
				return getSetPublishingModeResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_REQUEST:
				return getSetTriggeringRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_RESPONSE:
				return getSetTriggeringResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__SIGNATURE_DATA:
				return getSignatureData() != null;
			case TypesPackage.DOCUMENT_ROOT__SIGNED_SOFTWARE_CERTIFICATE:
				return getSignedSoftwareCertificate() != null;
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_ATTRIBUTE_OPERAND:
				return getSimpleAttributeOperand() != null;
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_TYPE_DESCRIPTION:
				return getSimpleTypeDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__STATUS_CHANGE_NOTIFICATION:
				return getStatusChangeNotification() != null;
			case TypesPackage.DOCUMENT_ROOT__STATUS_CODE:
				return getStatusCode() != null;
			case TypesPackage.DOCUMENT_ROOT__STATUS_RESULT:
				return getStatusResult() != null;
			case TypesPackage.DOCUMENT_ROOT__STRING:
				return STRING_EDEFAULT == null ? getString() != null : !STRING_EDEFAULT.equals(getString());
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				return getStructureDefinition() != null;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DESCRIPTION:
				return getStructureDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_FIELD:
				return getStructureField() != null;
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_TYPE:
				return getStructureType() != STRUCTURE_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_DATA_TYPE:
				return getSubscribedDataSetDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				return getSubscribedDataSetMirrorDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_ACKNOWLEDGEMENT:
				return getSubscriptionAcknowledgement() != null;
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				return getSubscriptionDiagnosticsDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__TARGET_VARIABLES_DATA_TYPE:
				return getTargetVariablesDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__THREE_DCARTESIAN_COORDINATES:
				return getThreeDCartesianCoordinates() != null;
			case TypesPackage.DOCUMENT_ROOT__THREE_DFRAME:
				return getThreeDFrame() != null;
			case TypesPackage.DOCUMENT_ROOT__THREE_DORIENTATION:
				return getThreeDOrientation() != null;
			case TypesPackage.DOCUMENT_ROOT__THREE_DVECTOR:
				return getThreeDVector() != null;
			case TypesPackage.DOCUMENT_ROOT__TIME:
				return TIME_EDEFAULT == null ? getTime() != null : !TIME_EDEFAULT.equals(getTime());
			case TypesPackage.DOCUMENT_ROOT__TIMESTAMPS_TO_RETURN:
				return getTimestampsToReturn() != TIMESTAMPS_TO_RETURN_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__TIME_STRING:
				return TIME_STRING_EDEFAULT == null ? getTimeString() != null : !TIME_STRING_EDEFAULT.equals(getTimeString());
			case TypesPackage.DOCUMENT_ROOT__TIME_ZONE_DATA_TYPE:
				return getTimeZoneDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_RESULT:
				return getTransferResult() != null;
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_REQUEST:
				return getTransferSubscriptionsRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_RESPONSE:
				return getTransferSubscriptionsResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST:
				return getTranslateBrowsePathsToNodeIdsRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_RESPONSE:
				return getTranslateBrowsePathsToNodeIdsResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_DATA_TYPE:
				return getTrustListDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_MASKS:
				return getTrustListMasks() != TRUST_LIST_MASKS_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__TYPE_NODE:
				return getTypeNode() != null;
			case TypesPackage.DOCUMENT_ROOT__UA_BINARY_FILE_DATA_TYPE:
				return getUABinaryFileDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				return getUadpDataSetMessageContentMask() != UADP_DATA_SET_MESSAGE_CONTENT_MASK_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getUadpDataSetReaderMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getUadpDataSetWriterMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__UADP_NETWORK_MESSAGE_CONTENT_MASK:
				return getUadpNetworkMessageContentMask() != UADP_NETWORK_MESSAGE_CONTENT_MASK_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getUadpWriterGroupMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__UINT16:
				return UINT16_EDEFAULT == null ? getUInt16() != null : !UINT16_EDEFAULT.equals(getUInt16());
			case TypesPackage.DOCUMENT_ROOT__UINT32:
				return UINT32_EDEFAULT == null ? getUInt32() != null : !UINT32_EDEFAULT.equals(getUInt32());
			case TypesPackage.DOCUMENT_ROOT__UINT64:
				return UINT64_EDEFAULT == null ? getUInt64() != null : !UINT64_EDEFAULT.equals(getUInt64());
			case TypesPackage.DOCUMENT_ROOT__UNION:
				return getUnion() != null;
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_REQUEST:
				return getUnregisterNodesRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_RESPONSE:
				return getUnregisterNodesResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__UPDATE_DATA_DETAILS:
				return getUpdateDataDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__UPDATE_EVENT_DETAILS:
				return getUpdateEventDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__UPDATE_STRUCTURE_DATA_DETAILS:
				return getUpdateStructureDataDetails() != null;
			case TypesPackage.DOCUMENT_ROOT__USER_IDENTITY_TOKEN:
				return getUserIdentityToken() != null;
			case TypesPackage.DOCUMENT_ROOT__USER_NAME_IDENTITY_TOKEN:
				return getUserNameIdentityToken() != null;
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_POLICY:
				return getUserTokenPolicy() != null;
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_TYPE:
				return getUserTokenType() != USER_TOKEN_TYPE_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__UTC_TIME:
				return UTC_TIME_EDEFAULT == null ? getUtcTime() != null : !UTC_TIME_EDEFAULT.equals(getUtcTime());
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_ATTRIBUTES:
				return getVariableAttributes() != null;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_NODE:
				return getVariableNode() != null;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_ATTRIBUTES:
				return getVariableTypeAttributes() != null;
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_NODE:
				return getVariableTypeNode() != null;
			case TypesPackage.DOCUMENT_ROOT__VARIANT:
				return getVariant() != null;
			case TypesPackage.DOCUMENT_ROOT__VECTOR:
				return getVector() != null;
			case TypesPackage.DOCUMENT_ROOT__VERSION_TIME:
				return getVersionTime() != VERSION_TIME_EDEFAULT;
			case TypesPackage.DOCUMENT_ROOT__VIEW_ATTRIBUTES:
				return getViewAttributes() != null;
			case TypesPackage.DOCUMENT_ROOT__VIEW_DESCRIPTION:
				return getViewDescription() != null;
			case TypesPackage.DOCUMENT_ROOT__VIEW_NODE:
				return getViewNode() != null;
			case TypesPackage.DOCUMENT_ROOT__WRITE_REQUEST:
				return getWriteRequest() != null;
			case TypesPackage.DOCUMENT_ROOT__WRITE_RESPONSE:
				return getWriteResponse() != null;
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_DATA_TYPE:
				return getWriterGroupDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getWriterGroupMessageDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getWriterGroupTransportDataType() != null;
			case TypesPackage.DOCUMENT_ROOT__WRITE_VALUE:
				return getWriteValue() != null;
			case TypesPackage.DOCUMENT_ROOT__X509_IDENTITY_TOKEN:
				return getX509IdentityToken() != null;
			case TypesPackage.DOCUMENT_ROOT__XV_TYPE:
				return getXVType() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
