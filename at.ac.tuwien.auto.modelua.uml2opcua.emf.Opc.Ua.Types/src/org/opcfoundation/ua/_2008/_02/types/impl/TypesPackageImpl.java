/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "types.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activateSessionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activateSessionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addNodesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addNodesRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addNodesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addNodesResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addReferencesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addReferencesRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addReferencesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateFilterResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasNameDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousIdentityTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brokerConnectionTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brokerDataSetReaderTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brokerDataSetWriterTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brokerWriterGroupTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browseDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browseNextRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browseNextResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browsePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browsePathResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browsePathTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browseRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browseResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browseResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callMethodRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callMethodResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelSecurityTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeSecureChannelRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeSecureChannelResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeSessionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeSessionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationVersionDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFilterElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFilterElementResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFilterResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createMonitoredItemsRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createMonitoredItemsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createSessionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createSessionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createSubscriptionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createSubscriptionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataChangeFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataChangeNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datagramConnectionTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datagramWriterGroupTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetMetaDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetReaderDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetReaderMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetReaderTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetWriterDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetWriterMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetWriterTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeSchemaHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteAtTimeDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEventDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteMonitoredItemsRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteMonitoredItemsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteNodesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteNodesRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteNodesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteRawModifiedDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteReferencesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteReferencesRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteReferencesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteSubscriptionsRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteSubscriptionsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoveryConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleComplexNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointUrlListDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass euInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventFieldListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventFilterResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventNotificationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expandedNodeIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldMetaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldTargetDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findServersOnNetworkRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findServersOnNetworkResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findServersRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findServersResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getEndpointsRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getEndpointsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyEventFieldListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyModifiedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyReadDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyReadRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyReadResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyReadResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyReadValueIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyUpdateDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyUpdateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyUpdateResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyUpdateResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityMappingRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issuedIdentityTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonDataSetReaderMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonDataSetWriterMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonWriterGroupMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfAddNodesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfAddNodesResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfAddReferencesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfAliasNameDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfApplicationDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBrokerConnectionTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBrokerDataSetReaderTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBrokerDataSetWriterTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBrokerTransportQualityOfServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBrokerWriterGroupTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBrowseDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBrowsePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBrowsePathResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBrowsePathTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfBrowseResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfByteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfByteStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfCallMethodRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfCallMethodResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfCartesianCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfConfigurationVersionDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfConnectionTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfContentFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfContentFilterElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfContentFilterElementResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfCurrencyUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDatagramConnectionTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDatagramWriterGroupTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataSetFieldContentMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataSetMetaDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataSetOrderingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataSetReaderDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataSetReaderMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataSetReaderTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataSetWriterDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataSetWriterMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataSetWriterTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataTypeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataTypeSchemaHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDeleteNodesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDeleteReferencesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDiagnosticInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDiagnosticsLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfEndpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfEndpointDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfEndpointUrlListDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfEnumDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfEnumDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfEnumFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfEnumValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfEventFieldListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfExpandedNodeIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfExtensionObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfFieldMetaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfFieldTargetDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfGenericAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfGuidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfHistoryEventFieldListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfHistoryReadResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfHistoryReadValueIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfHistoryUpdateResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfIdentityCriteriaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfIdentityMappingRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfIdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfInt16EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfInt32EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfInt64EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfJsonDataSetMessageContentMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfJsonDataSetReaderMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfJsonDataSetWriterMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfJsonNetworkMessageContentMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfJsonWriterGroupMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfKeyValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfLocalizedTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfModelChangeStructureDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfModificationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfMonitoredItemCreateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfMonitoredItemCreateResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfMonitoredItemModifyRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfMonitoredItemModifyResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfMonitoredItemNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfNetworkAddressDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfNetworkAddressUrlDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfNetworkGroupDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfNodeIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfNodeTypeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfOpenFileModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfOptionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfOrientationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfOverrideValueHandlingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfParsingResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfPublishedDataItemsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfPublishedDataSetDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfPublishedDataSetSourceDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfPublishedEventsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfPublishedVariableDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfPubSubConfigurationDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfPubSubConnectionDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfPubSubDiagnosticsCounterClassificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfPubSubGroupDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfPubSubStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfQualifiedNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfQueryDataDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfQueryDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfRationalNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfReaderGroupDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfReaderGroupMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfReaderGroupTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfReadValueIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfRedundantServerDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfReferenceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfReferenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfRegisteredServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfRelativePathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfRolePermissionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSamplingIntervalDiagnosticsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSByteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSemanticChangeStructureDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfServerOnNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSessionDiagnosticsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSessionSecurityDiagnosticsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSignedSoftwareCertificateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSimpleAttributeOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSimpleTypeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfStatusCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfStatusResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfStructureDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfStructureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfStructureFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSubscribedDataSetDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSubscribedDataSetMirrorDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSubscriptionAcknowledgementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfSubscriptionDiagnosticsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfTargetVariablesDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfThreeDCartesianCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfThreeDFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfThreeDOrientationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfThreeDVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfTimeZoneDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfTransferResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfTrustListDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUABinaryFileDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUadpDataSetMessageContentMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUadpDataSetReaderMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUadpDataSetWriterMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUadpNetworkMessageContentMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUadpWriterGroupMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUInt16EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUInt32EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUInt64EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUnionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfUserTokenPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfVariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfWriterGroupDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfWriterGroupMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfWriterGroupTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfWriteValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfXmlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizedTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdnsDiscoveryConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelChangeStructureDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modificationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyMonitoredItemsRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyMonitoredItemsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifySubscriptionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifySubscriptionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoredItemCreateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoredItemCreateResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoredItemModifyRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoredItemModifyResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoredItemNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringFilterResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkAddressDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkAddressUrlDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkGroupDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeTypeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openSecureChannelRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openSecureChannelResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orientationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parsingResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programDiagnostic2DataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programDiagnosticDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishedDataItemsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishedDataSetDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishedDataSetSourceDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishedEventsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishedVariableDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pubSubConfigurationDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pubSubConnectionDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pubSubGroupDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryDataDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryFirstRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryFirstResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryNextRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryNextResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationalNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readAnnotationDataDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readAtTimeDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readerGroupDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readerGroupMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readerGroupTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readEventDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readProcessedDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readRawModifiedDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readValueIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redundantServerDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registeredServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerNodesRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerNodesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerServer2RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerServer2ResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerServerRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerServerResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativePathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass republishRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass republishResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolePermissionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass samplingIntervalDiagnosticsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticChangeStructureDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverDiagnosticsSummaryDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverOnNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverStatusDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCounterDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionDiagnosticsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionlessInvokeRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionlessInvokeResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionSecurityDiagnosticsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setMonitoringModeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setMonitoringModeResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setPublishingModeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setPublishingModeResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTriggeringRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTriggeringResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedSoftwareCertificateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAttributeOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusChangeNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribedDataSetDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribedDataSetMirrorDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionAcknowledgementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionDiagnosticsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetVariablesDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threeDCartesianCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threeDFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threeDOrientationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threeDVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeZoneDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferSubscriptionsRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferSubscriptionsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translateBrowsePathsToNodeIdsRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translateBrowsePathsToNodeIdsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustListDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaBinaryFileDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uadpDataSetReaderMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uadpDataSetWriterMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uadpWriterGroupMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unregisterNodesRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unregisterNodesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateDataDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateEventDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateStructureDataDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userIdentityTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userNameIdentityTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTokenPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTypeAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTypeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writerGroupDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writerGroupMessageDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writerGroupTransportDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x509IdentityTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xvTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum axisScaleEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum brokerTransportQualityOfServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum browseDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum browseResultMaskEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataChangeTriggerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSetOrderingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deadbandTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticsLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exceptionDeviationFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyUpdateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identityCriteriaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum idTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSecurityModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelChangeStructureVerbMaskEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monitoringModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeAttributesMaskEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum openFileModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overrideValueHandlingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum performUpdateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pubSubDiagnosticsCounterClassificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pubSubStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum redundancySupportEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityTokenRequestTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serverStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timestampsToReturnEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trustListMasksEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userTokenTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessLevelExTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessLevelExTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessLevelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessLevelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType applicationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attributeWriteMaskEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attributeWriteMaskObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType axisScaleEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType brokerTransportQualityOfServiceObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType browseDirectionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType browseResultMaskObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataChangeTriggerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataSetFieldContentMaskEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataSetFieldContentMaskObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataSetFieldFlagsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataSetFieldFlagsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataSetOrderingTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deadbandTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType diagnosticsLevelObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventNotifierTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventNotifierTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionDeviationFormatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType filterOperatorObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType historyUpdateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identityCriteriaTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonDataSetMessageContentMaskEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonDataSetMessageContentMaskObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonNetworkMessageContentMaskEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonNetworkMessageContentMaskObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageSecurityModeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modelChangeStructureVerbMaskObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType monitoringModeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeAttributesMaskObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeClassObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType openFileModeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType overrideValueHandlingObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType performUpdateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType permissionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType permissionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pubSubDiagnosticsCounterClassificationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pubSubStateObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType redundancySupportObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType securityTokenRequestTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serverStateObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType structureTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timestampsToReturnObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trustListMasksObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uadpDataSetMessageContentMaskEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uadpDataSetMessageContentMaskObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uadpNetworkMessageContentMaskEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uadpNetworkMessageContentMaskObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType userTokenTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TypesPackageImpl theTypesPackage = registeredTypesPackage instanceof TypesPackageImpl ? (TypesPackageImpl)registeredTypesPackage : new TypesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theTypesPackage.loadPackage();

		// Fix loaded packages
		theTypesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivateSessionRequest() {
		if (activateSessionRequestEClass == null) {
			activateSessionRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return activateSessionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateSessionRequest_RequestHeader() {
        return (EReference)getActivateSessionRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateSessionRequest_ClientSignature() {
        return (EReference)getActivateSessionRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateSessionRequest_ClientSoftwareCertificates() {
        return (EReference)getActivateSessionRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateSessionRequest_LocaleIds() {
        return (EReference)getActivateSessionRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateSessionRequest_UserIdentityToken() {
        return (EReference)getActivateSessionRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateSessionRequest_UserTokenSignature() {
        return (EReference)getActivateSessionRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivateSessionResponse() {
		if (activateSessionResponseEClass == null) {
			activateSessionResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return activateSessionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateSessionResponse_ResponseHeader() {
        return (EReference)getActivateSessionResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivateSessionResponse_ServerNonce() {
        return (EAttribute)getActivateSessionResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateSessionResponse_Results() {
        return (EReference)getActivateSessionResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateSessionResponse_DiagnosticInfos() {
        return (EReference)getActivateSessionResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddNodesItem() {
		if (addNodesItemEClass == null) {
			addNodesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return addNodesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesItem_ParentNodeId() {
        return (EReference)getAddNodesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesItem_ReferenceTypeId() {
        return (EReference)getAddNodesItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesItem_RequestedNewNodeId() {
        return (EReference)getAddNodesItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesItem_BrowseName() {
        return (EReference)getAddNodesItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddNodesItem_NodeClass() {
        return (EAttribute)getAddNodesItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesItem_NodeAttributes() {
        return (EReference)getAddNodesItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesItem_TypeDefinition() {
        return (EReference)getAddNodesItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddNodesRequest() {
		if (addNodesRequestEClass == null) {
			addNodesRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return addNodesRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesRequest_RequestHeader() {
        return (EReference)getAddNodesRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesRequest_NodesToAdd() {
        return (EReference)getAddNodesRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddNodesResponse() {
		if (addNodesResponseEClass == null) {
			addNodesResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return addNodesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesResponse_ResponseHeader() {
        return (EReference)getAddNodesResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesResponse_Results() {
        return (EReference)getAddNodesResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesResponse_DiagnosticInfos() {
        return (EReference)getAddNodesResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddNodesResult() {
		if (addNodesResultEClass == null) {
			addNodesResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return addNodesResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesResult_StatusCode() {
        return (EReference)getAddNodesResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddNodesResult_AddedNodeId() {
        return (EReference)getAddNodesResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddReferencesItem() {
		if (addReferencesItemEClass == null) {
			addReferencesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(10);
		}
		return addReferencesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddReferencesItem_SourceNodeId() {
        return (EReference)getAddReferencesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddReferencesItem_ReferenceTypeId() {
        return (EReference)getAddReferencesItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddReferencesItem_IsForward() {
        return (EAttribute)getAddReferencesItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddReferencesItem_TargetServerUri() {
        return (EAttribute)getAddReferencesItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddReferencesItem_TargetNodeId() {
        return (EReference)getAddReferencesItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddReferencesItem_TargetNodeClass() {
        return (EAttribute)getAddReferencesItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddReferencesRequest() {
		if (addReferencesRequestEClass == null) {
			addReferencesRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(11);
		}
		return addReferencesRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddReferencesRequest_RequestHeader() {
        return (EReference)getAddReferencesRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddReferencesRequest_ReferencesToAdd() {
        return (EReference)getAddReferencesRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddReferencesResponse() {
		if (addReferencesResponseEClass == null) {
			addReferencesResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(12);
		}
		return addReferencesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddReferencesResponse_ResponseHeader() {
        return (EReference)getAddReferencesResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddReferencesResponse_Results() {
        return (EReference)getAddReferencesResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddReferencesResponse_DiagnosticInfos() {
        return (EReference)getAddReferencesResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateConfiguration() {
		if (aggregateConfigurationEClass == null) {
			aggregateConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(13);
		}
		return aggregateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateConfiguration_UseServerCapabilitiesDefaults() {
        return (EAttribute)getAggregateConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateConfiguration_TreatUncertainAsBad() {
        return (EAttribute)getAggregateConfiguration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateConfiguration_PercentDataBad() {
        return (EAttribute)getAggregateConfiguration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateConfiguration_PercentDataGood() {
        return (EAttribute)getAggregateConfiguration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateConfiguration_UseSlopedExtrapolation() {
        return (EAttribute)getAggregateConfiguration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateFilter() {
		if (aggregateFilterEClass == null) {
			aggregateFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(14);
		}
		return aggregateFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateFilter_StartTime() {
        return (EAttribute)getAggregateFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateFilter_AggregateType() {
        return (EReference)getAggregateFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateFilter_ProcessingInterval() {
        return (EAttribute)getAggregateFilter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateFilter_AggregateConfiguration() {
        return (EReference)getAggregateFilter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateFilterResult() {
		if (aggregateFilterResultEClass == null) {
			aggregateFilterResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(15);
		}
		return aggregateFilterResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateFilterResult_RevisedStartTime() {
        return (EAttribute)getAggregateFilterResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateFilterResult_RevisedProcessingInterval() {
        return (EAttribute)getAggregateFilterResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateFilterResult_RevisedAggregateConfiguration() {
        return (EReference)getAggregateFilterResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasNameDataType() {
		if (aliasNameDataTypeEClass == null) {
			aliasNameDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(16);
		}
		return aliasNameDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasNameDataType_AliasName() {
        return (EReference)getAliasNameDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasNameDataType_ReferencedNodes() {
        return (EReference)getAliasNameDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		if (annotationEClass == null) {
			annotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(17);
		}
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Message() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_UserName() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_AnnotationTime() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousIdentityToken() {
		if (anonymousIdentityTokenEClass == null) {
			anonymousIdentityTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(18);
		}
		return anonymousIdentityTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationDescription() {
		if (applicationDescriptionEClass == null) {
			applicationDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(19);
		}
		return applicationDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDescription_ApplicationUri() {
        return (EAttribute)getApplicationDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDescription_ProductUri() {
        return (EAttribute)getApplicationDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationDescription_ApplicationName() {
        return (EReference)getApplicationDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDescription_ApplicationType() {
        return (EAttribute)getApplicationDescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDescription_GatewayServerUri() {
        return (EAttribute)getApplicationDescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDescription_DiscoveryProfileUri() {
        return (EAttribute)getApplicationDescription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationDescription_DiscoveryUrls() {
        return (EReference)getApplicationDescription().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		if (argumentEClass == null) {
			argumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(22);
		}
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_Name() {
        return (EAttribute)getArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_DataType() {
        return (EReference)getArgument().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_ValueRank() {
        return (EAttribute)getArgument().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ArrayDimensions() {
        return (EReference)getArgument().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_Description() {
        return (EReference)getArgument().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOperand() {
		if (attributeOperandEClass == null) {
			attributeOperandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(23);
		}
		return attributeOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeOperand_NodeId() {
        return (EReference)getAttributeOperand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOperand_Alias() {
        return (EAttribute)getAttributeOperand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeOperand_BrowsePath() {
        return (EReference)getAttributeOperand().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOperand_AttributeId() {
        return (EAttribute)getAttributeOperand().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOperand_IndexRange() {
        return (EAttribute)getAttributeOperand().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxisInformation() {
		if (axisInformationEClass == null) {
			axisInformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(26);
		}
		return axisInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxisInformation_EngineeringUnits() {
        return (EReference)getAxisInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxisInformation_EURange() {
        return (EReference)getAxisInformation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxisInformation_Title() {
        return (EReference)getAxisInformation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisInformation_AxisScaleType() {
        return (EAttribute)getAxisInformation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxisInformation_AxisSteps() {
        return (EReference)getAxisInformation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyType() {
		if (bodyTypeEClass == null) {
			bodyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(29);
		}
		return bodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBodyType_Any() {
        return (EAttribute)getBodyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrokerConnectionTransportDataType() {
		if (brokerConnectionTransportDataTypeEClass == null) {
			brokerConnectionTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(30);
		}
		return brokerConnectionTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerConnectionTransportDataType_ResourceUri() {
        return (EAttribute)getBrokerConnectionTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerConnectionTransportDataType_AuthenticationProfileUri() {
        return (EAttribute)getBrokerConnectionTransportDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrokerDataSetReaderTransportDataType() {
		if (brokerDataSetReaderTransportDataTypeEClass == null) {
			brokerDataSetReaderTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(31);
		}
		return brokerDataSetReaderTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetReaderTransportDataType_QueueName() {
        return (EAttribute)getBrokerDataSetReaderTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetReaderTransportDataType_ResourceUri() {
        return (EAttribute)getBrokerDataSetReaderTransportDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetReaderTransportDataType_AuthenticationProfileUri() {
        return (EAttribute)getBrokerDataSetReaderTransportDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetReaderTransportDataType_RequestedDeliveryGuarantee() {
        return (EAttribute)getBrokerDataSetReaderTransportDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetReaderTransportDataType_MetaDataQueueName() {
        return (EAttribute)getBrokerDataSetReaderTransportDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrokerDataSetWriterTransportDataType() {
		if (brokerDataSetWriterTransportDataTypeEClass == null) {
			brokerDataSetWriterTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(32);
		}
		return brokerDataSetWriterTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetWriterTransportDataType_QueueName() {
        return (EAttribute)getBrokerDataSetWriterTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetWriterTransportDataType_ResourceUri() {
        return (EAttribute)getBrokerDataSetWriterTransportDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetWriterTransportDataType_AuthenticationProfileUri() {
        return (EAttribute)getBrokerDataSetWriterTransportDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetWriterTransportDataType_RequestedDeliveryGuarantee() {
        return (EAttribute)getBrokerDataSetWriterTransportDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetWriterTransportDataType_MetaDataQueueName() {
        return (EAttribute)getBrokerDataSetWriterTransportDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerDataSetWriterTransportDataType_MetaDataUpdateTime() {
        return (EAttribute)getBrokerDataSetWriterTransportDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrokerWriterGroupTransportDataType() {
		if (brokerWriterGroupTransportDataTypeEClass == null) {
			brokerWriterGroupTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(35);
		}
		return brokerWriterGroupTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerWriterGroupTransportDataType_QueueName() {
        return (EAttribute)getBrokerWriterGroupTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerWriterGroupTransportDataType_ResourceUri() {
        return (EAttribute)getBrokerWriterGroupTransportDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerWriterGroupTransportDataType_AuthenticationProfileUri() {
        return (EAttribute)getBrokerWriterGroupTransportDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerWriterGroupTransportDataType_RequestedDeliveryGuarantee() {
        return (EAttribute)getBrokerWriterGroupTransportDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowseDescription() {
		if (browseDescriptionEClass == null) {
			browseDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(36);
		}
		return browseDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseDescription_NodeId() {
        return (EReference)getBrowseDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseDescription_BrowseDirection() {
        return (EAttribute)getBrowseDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseDescription_ReferenceTypeId() {
        return (EReference)getBrowseDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseDescription_IncludeSubtypes() {
        return (EAttribute)getBrowseDescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseDescription_NodeClassMask() {
        return (EAttribute)getBrowseDescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseDescription_ResultMask() {
        return (EAttribute)getBrowseDescription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowseNextRequest() {
		if (browseNextRequestEClass == null) {
			browseNextRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(39);
		}
		return browseNextRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseNextRequest_RequestHeader() {
        return (EReference)getBrowseNextRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseNextRequest_ReleaseContinuationPoints() {
        return (EAttribute)getBrowseNextRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseNextRequest_ContinuationPoints() {
        return (EReference)getBrowseNextRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowseNextResponse() {
		if (browseNextResponseEClass == null) {
			browseNextResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(40);
		}
		return browseNextResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseNextResponse_ResponseHeader() {
        return (EReference)getBrowseNextResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseNextResponse_Results() {
        return (EReference)getBrowseNextResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseNextResponse_DiagnosticInfos() {
        return (EReference)getBrowseNextResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowsePath() {
		if (browsePathEClass == null) {
			browsePathEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(41);
		}
		return browsePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowsePath_StartingNode() {
        return (EReference)getBrowsePath().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowsePath_RelativePath() {
        return (EReference)getBrowsePath().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowsePathResult() {
		if (browsePathResultEClass == null) {
			browsePathResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(42);
		}
		return browsePathResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowsePathResult_StatusCode() {
        return (EReference)getBrowsePathResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowsePathResult_Targets() {
        return (EReference)getBrowsePathResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowsePathTarget() {
		if (browsePathTargetEClass == null) {
			browsePathTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(43);
		}
		return browsePathTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowsePathTarget_TargetId() {
        return (EReference)getBrowsePathTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowsePathTarget_RemainingPathIndex() {
        return (EAttribute)getBrowsePathTarget().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowseRequest() {
		if (browseRequestEClass == null) {
			browseRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(44);
		}
		return browseRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseRequest_RequestHeader() {
        return (EReference)getBrowseRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseRequest_View() {
        return (EReference)getBrowseRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseRequest_RequestedMaxReferencesPerNode() {
        return (EAttribute)getBrowseRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseRequest_NodesToBrowse() {
        return (EReference)getBrowseRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowseResponse() {
		if (browseResponseEClass == null) {
			browseResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(45);
		}
		return browseResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseResponse_ResponseHeader() {
        return (EReference)getBrowseResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseResponse_Results() {
        return (EReference)getBrowseResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseResponse_DiagnosticInfos() {
        return (EReference)getBrowseResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowseResult() {
		if (browseResultEClass == null) {
			browseResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(46);
		}
		return browseResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseResult_StatusCode() {
        return (EReference)getBrowseResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseResult_ContinuationPoint() {
        return (EAttribute)getBrowseResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrowseResult_References() {
        return (EReference)getBrowseResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildInfo() {
		if (buildInfoEClass == null) {
			buildInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(49);
		}
		return buildInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildInfo_ProductUri() {
        return (EAttribute)getBuildInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildInfo_ManufacturerName() {
        return (EAttribute)getBuildInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildInfo_ProductName() {
        return (EAttribute)getBuildInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildInfo_SoftwareVersion() {
        return (EAttribute)getBuildInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildInfo_BuildNumber() {
        return (EAttribute)getBuildInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildInfo_BuildDate() {
        return (EAttribute)getBuildInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallMethodRequest() {
		if (callMethodRequestEClass == null) {
			callMethodRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(50);
		}
		return callMethodRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallMethodRequest_ObjectId() {
        return (EReference)getCallMethodRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallMethodRequest_MethodId() {
        return (EReference)getCallMethodRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallMethodRequest_InputArguments() {
        return (EReference)getCallMethodRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallMethodResult() {
		if (callMethodResultEClass == null) {
			callMethodResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(51);
		}
		return callMethodResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallMethodResult_StatusCode() {
        return (EReference)getCallMethodResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallMethodResult_InputArgumentResults() {
        return (EReference)getCallMethodResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallMethodResult_InputArgumentDiagnosticInfos() {
        return (EReference)getCallMethodResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallMethodResult_OutputArguments() {
        return (EReference)getCallMethodResult().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallRequest() {
		if (callRequestEClass == null) {
			callRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(52);
		}
		return callRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallRequest_RequestHeader() {
        return (EReference)getCallRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallRequest_MethodsToCall() {
        return (EReference)getCallRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallResponse() {
		if (callResponseEClass == null) {
			callResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(53);
		}
		return callResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallResponse_ResponseHeader() {
        return (EReference)getCallResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallResponse_Results() {
        return (EReference)getCallResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallResponse_DiagnosticInfos() {
        return (EReference)getCallResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCancelRequest() {
		if (cancelRequestEClass == null) {
			cancelRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(54);
		}
		return cancelRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCancelRequest_RequestHeader() {
        return (EReference)getCancelRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelRequest_RequestHandle() {
        return (EAttribute)getCancelRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCancelResponse() {
		if (cancelResponseEClass == null) {
			cancelResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(55);
		}
		return cancelResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCancelResponse_ResponseHeader() {
        return (EReference)getCancelResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelResponse_CancelCount() {
        return (EAttribute)getCancelResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinates() {
		if (cartesianCoordinatesEClass == null) {
			cartesianCoordinatesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(56);
		}
		return cartesianCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelSecurityToken() {
		if (channelSecurityTokenEClass == null) {
			channelSecurityTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(57);
		}
		return channelSecurityTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelSecurityToken_ChannelId() {
        return (EAttribute)getChannelSecurityToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelSecurityToken_TokenId() {
        return (EAttribute)getChannelSecurityToken().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelSecurityToken_CreatedAt() {
        return (EAttribute)getChannelSecurityToken().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelSecurityToken_RevisedLifetime() {
        return (EAttribute)getChannelSecurityToken().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseSecureChannelRequest() {
		if (closeSecureChannelRequestEClass == null) {
			closeSecureChannelRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(58);
		}
		return closeSecureChannelRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloseSecureChannelRequest_RequestHeader() {
        return (EReference)getCloseSecureChannelRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseSecureChannelResponse() {
		if (closeSecureChannelResponseEClass == null) {
			closeSecureChannelResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(59);
		}
		return closeSecureChannelResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloseSecureChannelResponse_ResponseHeader() {
        return (EReference)getCloseSecureChannelResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseSessionRequest() {
		if (closeSessionRequestEClass == null) {
			closeSessionRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(60);
		}
		return closeSessionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloseSessionRequest_RequestHeader() {
        return (EReference)getCloseSessionRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloseSessionRequest_DeleteSubscriptions() {
        return (EAttribute)getCloseSessionRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseSessionResponse() {
		if (closeSessionResponseEClass == null) {
			closeSessionResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(61);
		}
		return closeSessionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloseSessionResponse_ResponseHeader() {
        return (EReference)getCloseSessionResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexNumberType() {
		if (complexNumberTypeEClass == null) {
			complexNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(62);
		}
		return complexNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexNumberType_Real() {
        return (EAttribute)getComplexNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexNumberType_Imaginary() {
        return (EAttribute)getComplexNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationVersionDataType() {
		if (configurationVersionDataTypeEClass == null) {
			configurationVersionDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(63);
		}
		return configurationVersionDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationVersionDataType_MajorVersion() {
        return (EAttribute)getConfigurationVersionDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationVersionDataType_MinorVersion() {
        return (EAttribute)getConfigurationVersionDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionTransportDataType() {
		if (connectionTransportDataTypeEClass == null) {
			connectionTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(64);
		}
		return connectionTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentFilter() {
		if (contentFilterEClass == null) {
			contentFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(65);
		}
		return contentFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFilter_Elements() {
        return (EReference)getContentFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentFilterElement() {
		if (contentFilterElementEClass == null) {
			contentFilterElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(66);
		}
		return contentFilterElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentFilterElement_FilterOperator() {
        return (EAttribute)getContentFilterElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFilterElement_FilterOperands() {
        return (EReference)getContentFilterElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentFilterElementResult() {
		if (contentFilterElementResultEClass == null) {
			contentFilterElementResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(67);
		}
		return contentFilterElementResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFilterElementResult_StatusCode() {
        return (EReference)getContentFilterElementResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFilterElementResult_OperandStatusCodes() {
        return (EReference)getContentFilterElementResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFilterElementResult_OperandDiagnosticInfos() {
        return (EReference)getContentFilterElementResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentFilterResult() {
		if (contentFilterResultEClass == null) {
			contentFilterResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(68);
		}
		return contentFilterResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFilterResult_ElementResults() {
        return (EReference)getContentFilterResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFilterResult_ElementDiagnosticInfos() {
        return (EReference)getContentFilterResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateMonitoredItemsRequest() {
		if (createMonitoredItemsRequestEClass == null) {
			createMonitoredItemsRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(69);
		}
		return createMonitoredItemsRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateMonitoredItemsRequest_RequestHeader() {
        return (EReference)getCreateMonitoredItemsRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateMonitoredItemsRequest_SubscriptionId() {
        return (EAttribute)getCreateMonitoredItemsRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateMonitoredItemsRequest_TimestampsToReturn() {
        return (EAttribute)getCreateMonitoredItemsRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateMonitoredItemsRequest_ItemsToCreate() {
        return (EReference)getCreateMonitoredItemsRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateMonitoredItemsResponse() {
		if (createMonitoredItemsResponseEClass == null) {
			createMonitoredItemsResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(70);
		}
		return createMonitoredItemsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateMonitoredItemsResponse_ResponseHeader() {
        return (EReference)getCreateMonitoredItemsResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateMonitoredItemsResponse_Results() {
        return (EReference)getCreateMonitoredItemsResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateMonitoredItemsResponse_DiagnosticInfos() {
        return (EReference)getCreateMonitoredItemsResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateSessionRequest() {
		if (createSessionRequestEClass == null) {
			createSessionRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(71);
		}
		return createSessionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSessionRequest_RequestHeader() {
        return (EReference)getCreateSessionRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSessionRequest_ClientDescription() {
        return (EReference)getCreateSessionRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionRequest_ServerUri() {
        return (EAttribute)getCreateSessionRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionRequest_EndpointUrl() {
        return (EAttribute)getCreateSessionRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionRequest_SessionName() {
        return (EAttribute)getCreateSessionRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionRequest_ClientNonce() {
        return (EAttribute)getCreateSessionRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionRequest_ClientCertificate() {
        return (EAttribute)getCreateSessionRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionRequest_RequestedSessionTimeout() {
        return (EAttribute)getCreateSessionRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionRequest_MaxResponseMessageSize() {
        return (EAttribute)getCreateSessionRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateSessionResponse() {
		if (createSessionResponseEClass == null) {
			createSessionResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(72);
		}
		return createSessionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSessionResponse_ResponseHeader() {
        return (EReference)getCreateSessionResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSessionResponse_SessionId() {
        return (EReference)getCreateSessionResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSessionResponse_AuthenticationToken() {
        return (EReference)getCreateSessionResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionResponse_RevisedSessionTimeout() {
        return (EAttribute)getCreateSessionResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionResponse_ServerNonce() {
        return (EAttribute)getCreateSessionResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionResponse_ServerCertificate() {
        return (EAttribute)getCreateSessionResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSessionResponse_ServerEndpoints() {
        return (EReference)getCreateSessionResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSessionResponse_ServerSoftwareCertificates() {
        return (EReference)getCreateSessionResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSessionResponse_ServerSignature() {
        return (EReference)getCreateSessionResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSessionResponse_MaxRequestMessageSize() {
        return (EAttribute)getCreateSessionResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateSubscriptionRequest() {
		if (createSubscriptionRequestEClass == null) {
			createSubscriptionRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(73);
		}
		return createSubscriptionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSubscriptionRequest_RequestHeader() {
        return (EReference)getCreateSubscriptionRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubscriptionRequest_RequestedPublishingInterval() {
        return (EAttribute)getCreateSubscriptionRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubscriptionRequest_RequestedLifetimeCount() {
        return (EAttribute)getCreateSubscriptionRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubscriptionRequest_RequestedMaxKeepAliveCount() {
        return (EAttribute)getCreateSubscriptionRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubscriptionRequest_MaxNotificationsPerPublish() {
        return (EAttribute)getCreateSubscriptionRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubscriptionRequest_PublishingEnabled() {
        return (EAttribute)getCreateSubscriptionRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubscriptionRequest_Priority() {
        return (EAttribute)getCreateSubscriptionRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateSubscriptionResponse() {
		if (createSubscriptionResponseEClass == null) {
			createSubscriptionResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(74);
		}
		return createSubscriptionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSubscriptionResponse_ResponseHeader() {
        return (EReference)getCreateSubscriptionResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubscriptionResponse_SubscriptionId() {
        return (EAttribute)getCreateSubscriptionResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubscriptionResponse_RevisedPublishingInterval() {
        return (EAttribute)getCreateSubscriptionResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubscriptionResponse_RevisedLifetimeCount() {
        return (EAttribute)getCreateSubscriptionResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubscriptionResponse_RevisedMaxKeepAliveCount() {
        return (EAttribute)getCreateSubscriptionResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencyUnitType() {
		if (currencyUnitTypeEClass == null) {
			currencyUnitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(75);
		}
		return currencyUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyUnitType_NumericCode() {
        return (EAttribute)getCurrencyUnitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyUnitType_Exponent() {
        return (EAttribute)getCurrencyUnitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyUnitType_AlphabeticCode() {
        return (EAttribute)getCurrencyUnitType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyUnitType_Currency() {
        return (EReference)getCurrencyUnitType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataChangeFilter() {
		if (dataChangeFilterEClass == null) {
			dataChangeFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(76);
		}
		return dataChangeFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataChangeFilter_Trigger() {
        return (EAttribute)getDataChangeFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataChangeFilter_DeadbandType() {
        return (EAttribute)getDataChangeFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataChangeFilter_DeadbandValue() {
        return (EAttribute)getDataChangeFilter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataChangeNotification() {
		if (dataChangeNotificationEClass == null) {
			dataChangeNotificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(77);
		}
		return dataChangeNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataChangeNotification_MonitoredItems() {
        return (EReference)getDataChangeNotification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataChangeNotification_DiagnosticInfos() {
        return (EReference)getDataChangeNotification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatagramConnectionTransportDataType() {
		if (datagramConnectionTransportDataTypeEClass == null) {
			datagramConnectionTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(80);
		}
		return datagramConnectionTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatagramConnectionTransportDataType_DiscoveryAddress() {
        return (EReference)getDatagramConnectionTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatagramWriterGroupTransportDataType() {
		if (datagramWriterGroupTransportDataTypeEClass == null) {
			datagramWriterGroupTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(81);
		}
		return datagramWriterGroupTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatagramWriterGroupTransportDataType_MessageRepeatCount() {
        return (EAttribute)getDatagramWriterGroupTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatagramWriterGroupTransportDataType_MessageRepeatDelay() {
        return (EAttribute)getDatagramWriterGroupTransportDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetMetaDataType() {
		if (dataSetMetaDataTypeEClass == null) {
			dataSetMetaDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(86);
		}
		return dataSetMetaDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetMetaDataType_Name() {
        return (EAttribute)getDataSetMetaDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetMetaDataType_Description() {
        return (EReference)getDataSetMetaDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetMetaDataType_Fields() {
        return (EReference)getDataSetMetaDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetMetaDataType_DataSetClassId() {
        return (EReference)getDataSetMetaDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetMetaDataType_ConfigurationVersion() {
        return (EReference)getDataSetMetaDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetReaderDataType() {
		if (dataSetReaderDataTypeEClass == null) {
			dataSetReaderDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(89);
		}
		return dataSetReaderDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetReaderDataType_Name() {
        return (EAttribute)getDataSetReaderDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetReaderDataType_Enabled() {
        return (EAttribute)getDataSetReaderDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetReaderDataType_PublisherId() {
        return (EReference)getDataSetReaderDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetReaderDataType_WriterGroupId() {
        return (EAttribute)getDataSetReaderDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetReaderDataType_DataSetWriterId() {
        return (EAttribute)getDataSetReaderDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetReaderDataType_DataSetMetaData() {
        return (EReference)getDataSetReaderDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetReaderDataType_DataSetFieldContentMask() {
        return (EAttribute)getDataSetReaderDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetReaderDataType_MessageReceiveTimeout() {
        return (EAttribute)getDataSetReaderDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetReaderDataType_KeyFrameCount() {
        return (EAttribute)getDataSetReaderDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetReaderDataType_HeaderLayoutUri() {
        return (EAttribute)getDataSetReaderDataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetReaderDataType_SecurityMode() {
        return (EAttribute)getDataSetReaderDataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetReaderDataType_SecurityGroupId() {
        return (EAttribute)getDataSetReaderDataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetReaderDataType_SecurityKeyServices() {
        return (EReference)getDataSetReaderDataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetReaderDataType_DataSetReaderProperties() {
        return (EReference)getDataSetReaderDataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetReaderDataType_TransportSettings() {
        return (EReference)getDataSetReaderDataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetReaderDataType_MessageSettings() {
        return (EReference)getDataSetReaderDataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetReaderDataType_SubscribedDataSet() {
        return (EReference)getDataSetReaderDataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetReaderMessageDataType() {
		if (dataSetReaderMessageDataTypeEClass == null) {
			dataSetReaderMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(90);
		}
		return dataSetReaderMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetReaderTransportDataType() {
		if (dataSetReaderTransportDataTypeEClass == null) {
			dataSetReaderTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(91);
		}
		return dataSetReaderTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetWriterDataType() {
		if (dataSetWriterDataTypeEClass == null) {
			dataSetWriterDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(92);
		}
		return dataSetWriterDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetWriterDataType_Name() {
        return (EAttribute)getDataSetWriterDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetWriterDataType_Enabled() {
        return (EAttribute)getDataSetWriterDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetWriterDataType_DataSetWriterId() {
        return (EAttribute)getDataSetWriterDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetWriterDataType_DataSetFieldContentMask() {
        return (EAttribute)getDataSetWriterDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetWriterDataType_KeyFrameCount() {
        return (EAttribute)getDataSetWriterDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetWriterDataType_DataSetName() {
        return (EAttribute)getDataSetWriterDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetWriterDataType_DataSetWriterProperties() {
        return (EReference)getDataSetWriterDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetWriterDataType_TransportSettings() {
        return (EReference)getDataSetWriterDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetWriterDataType_MessageSettings() {
        return (EReference)getDataSetWriterDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetWriterMessageDataType() {
		if (dataSetWriterMessageDataTypeEClass == null) {
			dataSetWriterMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(93);
		}
		return dataSetWriterMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetWriterTransportDataType() {
		if (dataSetWriterTransportDataTypeEClass == null) {
			dataSetWriterTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(94);
		}
		return dataSetWriterTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeAttributes() {
		if (dataTypeAttributesEClass == null) {
			dataTypeAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(95);
		}
		return dataTypeAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeAttributes_IsAbstract() {
        return (EAttribute)getDataTypeAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeDefinition() {
		if (dataTypeDefinitionEClass == null) {
			dataTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(96);
		}
		return dataTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeDescription() {
		if (dataTypeDescriptionEClass == null) {
			dataTypeDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(97);
		}
		return dataTypeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeDescription_DataTypeId() {
        return (EReference)getDataTypeDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeDescription_Name() {
        return (EReference)getDataTypeDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeNode() {
		if (dataTypeNodeEClass == null) {
			dataTypeNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(98);
		}
		return dataTypeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeNode_IsAbstract() {
        return (EAttribute)getDataTypeNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeNode_DataTypeDefinition() {
        return (EReference)getDataTypeNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeSchemaHeader() {
		if (dataTypeSchemaHeaderEClass == null) {
			dataTypeSchemaHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(99);
		}
		return dataTypeSchemaHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeSchemaHeader_Namespaces() {
        return (EReference)getDataTypeSchemaHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeSchemaHeader_StructureDataTypes() {
        return (EReference)getDataTypeSchemaHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeSchemaHeader_EnumDataTypes() {
        return (EReference)getDataTypeSchemaHeader().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeSchemaHeader_SimpleDataTypes() {
        return (EReference)getDataTypeSchemaHeader().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataValue() {
		if (dataValueEClass == null) {
			dataValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(100);
		}
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataValue_Value() {
        return (EReference)getDataValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataValue_StatusCode() {
        return (EReference)getDataValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_SourceTimestamp() {
        return (EAttribute)getDataValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_SourcePicoseconds() {
        return (EAttribute)getDataValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_ServerTimestamp() {
        return (EAttribute)getDataValue().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_ServerPicoseconds() {
        return (EAttribute)getDataValue().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalDataType() {
		if (decimalDataTypeEClass == null) {
			decimalDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(103);
		}
		return decimalDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalDataType_Scale() {
        return (EAttribute)getDecimalDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalDataType_Value() {
        return (EAttribute)getDecimalDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteAtTimeDetails() {
		if (deleteAtTimeDetailsEClass == null) {
			deleteAtTimeDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(104);
		}
		return deleteAtTimeDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteAtTimeDetails_ReqTimes() {
        return (EReference)getDeleteAtTimeDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteEventDetails() {
		if (deleteEventDetailsEClass == null) {
			deleteEventDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(105);
		}
		return deleteEventDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteEventDetails_EventIds() {
        return (EReference)getDeleteEventDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteMonitoredItemsRequest() {
		if (deleteMonitoredItemsRequestEClass == null) {
			deleteMonitoredItemsRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(106);
		}
		return deleteMonitoredItemsRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteMonitoredItemsRequest_RequestHeader() {
        return (EReference)getDeleteMonitoredItemsRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteMonitoredItemsRequest_SubscriptionId() {
        return (EAttribute)getDeleteMonitoredItemsRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteMonitoredItemsRequest_MonitoredItemIds() {
        return (EReference)getDeleteMonitoredItemsRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteMonitoredItemsResponse() {
		if (deleteMonitoredItemsResponseEClass == null) {
			deleteMonitoredItemsResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(107);
		}
		return deleteMonitoredItemsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteMonitoredItemsResponse_ResponseHeader() {
        return (EReference)getDeleteMonitoredItemsResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteMonitoredItemsResponse_Results() {
        return (EReference)getDeleteMonitoredItemsResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteMonitoredItemsResponse_DiagnosticInfos() {
        return (EReference)getDeleteMonitoredItemsResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteNodesItem() {
		if (deleteNodesItemEClass == null) {
			deleteNodesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(108);
		}
		return deleteNodesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteNodesItem_NodeId() {
        return (EReference)getDeleteNodesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteNodesItem_DeleteTargetReferences() {
        return (EAttribute)getDeleteNodesItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteNodesRequest() {
		if (deleteNodesRequestEClass == null) {
			deleteNodesRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(109);
		}
		return deleteNodesRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteNodesRequest_RequestHeader() {
        return (EReference)getDeleteNodesRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteNodesRequest_NodesToDelete() {
        return (EReference)getDeleteNodesRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteNodesResponse() {
		if (deleteNodesResponseEClass == null) {
			deleteNodesResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(110);
		}
		return deleteNodesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteNodesResponse_ResponseHeader() {
        return (EReference)getDeleteNodesResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteNodesResponse_Results() {
        return (EReference)getDeleteNodesResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteNodesResponse_DiagnosticInfos() {
        return (EReference)getDeleteNodesResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteRawModifiedDetails() {
		if (deleteRawModifiedDetailsEClass == null) {
			deleteRawModifiedDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(111);
		}
		return deleteRawModifiedDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRawModifiedDetails_IsDeleteModified() {
        return (EAttribute)getDeleteRawModifiedDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRawModifiedDetails_StartTime() {
        return (EAttribute)getDeleteRawModifiedDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRawModifiedDetails_EndTime() {
        return (EAttribute)getDeleteRawModifiedDetails().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteReferencesItem() {
		if (deleteReferencesItemEClass == null) {
			deleteReferencesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(112);
		}
		return deleteReferencesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteReferencesItem_SourceNodeId() {
        return (EReference)getDeleteReferencesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteReferencesItem_ReferenceTypeId() {
        return (EReference)getDeleteReferencesItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteReferencesItem_IsForward() {
        return (EAttribute)getDeleteReferencesItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteReferencesItem_TargetNodeId() {
        return (EReference)getDeleteReferencesItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteReferencesItem_DeleteBidirectional() {
        return (EAttribute)getDeleteReferencesItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteReferencesRequest() {
		if (deleteReferencesRequestEClass == null) {
			deleteReferencesRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(113);
		}
		return deleteReferencesRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteReferencesRequest_RequestHeader() {
        return (EReference)getDeleteReferencesRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteReferencesRequest_ReferencesToDelete() {
        return (EReference)getDeleteReferencesRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteReferencesResponse() {
		if (deleteReferencesResponseEClass == null) {
			deleteReferencesResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(114);
		}
		return deleteReferencesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteReferencesResponse_ResponseHeader() {
        return (EReference)getDeleteReferencesResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteReferencesResponse_Results() {
        return (EReference)getDeleteReferencesResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteReferencesResponse_DiagnosticInfos() {
        return (EReference)getDeleteReferencesResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteSubscriptionsRequest() {
		if (deleteSubscriptionsRequestEClass == null) {
			deleteSubscriptionsRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(115);
		}
		return deleteSubscriptionsRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteSubscriptionsRequest_RequestHeader() {
        return (EReference)getDeleteSubscriptionsRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteSubscriptionsRequest_SubscriptionIds() {
        return (EReference)getDeleteSubscriptionsRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteSubscriptionsResponse() {
		if (deleteSubscriptionsResponseEClass == null) {
			deleteSubscriptionsResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(116);
		}
		return deleteSubscriptionsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteSubscriptionsResponse_ResponseHeader() {
        return (EReference)getDeleteSubscriptionsResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteSubscriptionsResponse_Results() {
        return (EReference)getDeleteSubscriptionsResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteSubscriptionsResponse_DiagnosticInfos() {
        return (EReference)getDeleteSubscriptionsResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticInfo() {
		if (diagnosticInfoEClass == null) {
			diagnosticInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(117);
		}
		return diagnosticInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticInfo_SymbolicId() {
        return (EAttribute)getDiagnosticInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticInfo_NamespaceUri() {
        return (EAttribute)getDiagnosticInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticInfo_Locale() {
        return (EAttribute)getDiagnosticInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticInfo_LocalizedText() {
        return (EAttribute)getDiagnosticInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticInfo_AdditionalInfo() {
        return (EAttribute)getDiagnosticInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticInfo_InnerStatusCode() {
        return (EReference)getDiagnosticInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticInfo_InnerDiagnosticInfo() {
        return (EReference)getDiagnosticInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscoveryConfiguration() {
		if (discoveryConfigurationEClass == null) {
			discoveryConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(120);
		}
		return discoveryConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(121);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AccessLevelExType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AccessLevelType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivateSessionRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivateSessionResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddNodesItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddNodesRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddNodesResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddNodesResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddReferencesItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddReferencesRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddReferencesResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AggregateConfiguration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AggregateFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AggregateFilterResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AliasNameDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Annotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AnonymousIdentityToken() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ApplicationDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ApplicationInstanceCertificate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ApplicationType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Argument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AttributeOperand() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AttributeWriteMask() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AudioDataType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AxisInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AxisScaleEnumeration() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BitFieldMaskDataType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Boolean() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrokerConnectionTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrokerDataSetReaderTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrokerDataSetWriterTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BrokerTransportQualityOfService() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrokerWriterGroupTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrowseDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BrowseDirection() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrowseNextRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrowseNextResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrowsePath() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrowsePathResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrowsePathTarget() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrowseRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrowseResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BrowseResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BrowseResultMask() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BuildInfo() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Byte() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ByteString() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CallMethodRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CallMethodResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CallRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CallResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CancelRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CancelResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CartesianCoordinates() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChannelSecurityToken() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CloseSecureChannelRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CloseSecureChannelResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CloseSessionRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CloseSessionResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ComplexNumberType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConfigurationVersionDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConnectionTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContentFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContentFilterElement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContentFilterElementResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContentFilterResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ContinuationPoint() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Counter() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreateMonitoredItemsRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreateMonitoredItemsResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreateSessionRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreateSessionResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreateSubscriptionRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreateSubscriptionResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CurrencyUnitType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataChangeFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataChangeNotification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataChangeTrigger() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DatagramConnectionTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DatagramWriterGroupTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataSetFieldContentMask() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataSetFieldFlags() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataSetMetaDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataSetOrderingType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataSetReaderDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataSetReaderMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataSetReaderTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataSetWriterDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataSetWriterMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataSetWriterTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataTypeAttributes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataTypeDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataTypeDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataTypeNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataTypeSchemaHeader() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Date() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DateString() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DateTime() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DeadbandType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecimalDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DecimalString() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteAtTimeDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteEventDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteMonitoredItemsRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteMonitoredItemsResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteNodesItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteNodesRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteNodesResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteRawModifiedDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteReferencesItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteReferencesRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteReferencesResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteSubscriptionsRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeleteSubscriptionsResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DiagnosticInfo() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DiagnosticsLevel() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DiscoveryConfiguration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Double() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DoubleComplexNumberType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Duration() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DurationString() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ElementOperand() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndpointConfiguration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndpointDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndpointType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndpointUrlListDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EnumDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EnumDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EnumField() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EnumValueType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EUInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EventFieldList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EventFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EventFilterResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EventNotificationList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EventNotifierType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExceptionDeviationFormat() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExpandedNodeId() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtensionObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FieldMetaData() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FieldTargetDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FilterOperand() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FilterOperator() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FindServersOnNetworkRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FindServersOnNetworkResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FindServersRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FindServersResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Float() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Frame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericAttributes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericAttributeValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GetEndpointsRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GetEndpointsResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Guid() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryData() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryEvent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryEventFieldList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryModifiedData() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryReadDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryReadRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryReadResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryReadResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryReadValueId() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryUpdateDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryUpdateRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryUpdateResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HistoryUpdateResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HistoryUpdateType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IdentityCriteriaType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentityMappingRuleType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IdType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImageBMP() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImageGIF() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImageJPG() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImagePNG() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Index() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Int16() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Int32() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Int64() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IntegerId() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvokeServiceRequest() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvokeServiceResponse() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IssuedIdentityToken() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_JsonDataSetMessageContentMask() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JsonDataSetReaderMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JsonDataSetWriterMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_JsonNetworkMessageContentMask() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JsonWriterGroupMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyValuePair() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfAddNodesItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfAddNodesResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfAddReferencesItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfAliasNameDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfApplicationDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfArgument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBoolean() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBrokerConnectionTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBrokerDataSetReaderTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBrokerDataSetWriterTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBrokerTransportQualityOfService() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBrokerWriterGroupTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBrowseDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBrowsePath() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBrowsePathResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBrowsePathTarget() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfBrowseResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfByte() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfByteString() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfCallMethodRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfCallMethodResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfCartesianCoordinates() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfConfigurationVersionDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfConnectionTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfContentFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfContentFilterElement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfContentFilterElementResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfCurrencyUnitType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDatagramConnectionTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDatagramWriterGroupTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataSetFieldContentMask() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataSetMetaDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataSetOrderingType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataSetReaderDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataSetReaderMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataSetReaderTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataSetWriterDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataSetWriterMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataSetWriterTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataTypeDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataTypeDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataTypeSchemaHeader() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDataValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDateTime() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDeleteNodesItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDeleteReferencesItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDiagnosticInfo() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDiagnosticsLevel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfDouble() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfEndpointConfiguration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfEndpointDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfEndpointType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(245);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfEndpointUrlListDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(246);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfEnumDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(247);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfEnumDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(248);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfEnumField() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(249);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfEnumValueType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(250);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfEventFieldList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(251);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfExpandedNodeId() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(252);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfExtensionObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(253);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfFieldMetaData() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(254);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfFieldTargetDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(255);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfFloat() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfFrame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(257);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfGenericAttributeValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(258);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfGuid() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(259);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfHistoryEventFieldList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(260);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfHistoryReadResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(261);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfHistoryReadValueId() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(262);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfHistoryUpdateResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(263);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfIdentityCriteriaType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(264);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfIdentityMappingRuleType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(265);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfIdType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(266);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfInt16() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(267);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfInt32() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(268);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfInt64() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(269);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfJsonDataSetMessageContentMask() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(270);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfJsonDataSetReaderMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(271);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfJsonDataSetWriterMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(272);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfJsonNetworkMessageContentMask() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(273);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfJsonWriterGroupMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(274);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfKeyValuePair() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(275);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfLocalizedText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(276);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfModelChangeStructureDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(277);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfModificationInfo() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(278);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfMonitoredItemCreateRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(279);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfMonitoredItemCreateResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(280);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfMonitoredItemModifyRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(281);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfMonitoredItemModifyResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(282);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfMonitoredItemNotification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(283);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfNetworkAddressDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(284);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfNetworkAddressUrlDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(285);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfNetworkGroupDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(286);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(287);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfNodeId() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(288);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfNodeReference() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(289);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfNodeTypeDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(290);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfOpenFileMode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(291);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfOptionSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(292);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfOrientation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(293);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfOverrideValueHandling() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(294);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfParsingResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(295);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfPublishedDataItemsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(296);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfPublishedDataSetDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(297);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfPublishedDataSetSourceDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(298);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfPublishedEventsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(299);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfPublishedVariableDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(300);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfPubSubConfigurationDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(301);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfPubSubConnectionDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(302);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfPubSubDiagnosticsCounterClassification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(303);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfPubSubGroupDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(304);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfPubSubState() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(305);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfQualifiedName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(306);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfQueryDataDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(307);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfQueryDataSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(308);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfRationalNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(309);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfReaderGroupDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(310);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfReaderGroupMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(311);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfReaderGroupTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(312);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfReadValueId() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(313);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfRedundantServerDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(314);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfReferenceDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(315);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfReferenceNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(316);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfRegisteredServer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(317);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfRelativePathElement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(318);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfRolePermissionType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(319);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSamplingIntervalDiagnosticsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(320);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSByte() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(321);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSemanticChangeStructureDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(322);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfServerOnNetwork() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(323);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSessionDiagnosticsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(324);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSessionSecurityDiagnosticsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(325);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSignedSoftwareCertificate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(326);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSimpleAttributeOperand() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(327);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSimpleTypeDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(328);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfStatusCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(329);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfStatusResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(330);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfString() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(331);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfStructureDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(332);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfStructureDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(333);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfStructureField() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(334);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSubscribedDataSetDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(335);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSubscribedDataSetMirrorDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(336);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSubscriptionAcknowledgement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(337);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfSubscriptionDiagnosticsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(338);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfTargetVariablesDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(339);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfThreeDCartesianCoordinates() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(340);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfThreeDFrame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(341);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfThreeDOrientation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(342);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfThreeDVector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(343);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfTimeZoneDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(344);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfTransferResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(345);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfTrustListDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(346);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUABinaryFileDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(347);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUadpDataSetMessageContentMask() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(348);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUadpDataSetReaderMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(349);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUadpDataSetWriterMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(350);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUadpNetworkMessageContentMask() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(351);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUadpWriterGroupMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(352);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUInt16() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(353);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUInt32() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(354);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUInt64() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(355);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUnion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(356);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfUserTokenPolicy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(357);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfVariant() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(358);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfVector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(359);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfWriterGroupDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(360);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfWriterGroupMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(361);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfWriterGroupTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(362);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfWriteValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(363);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListOfXmlElement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(364);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LiteralOperand() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(365);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LocaleId() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(366);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocalizedText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(367);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MdnsDiscoveryConfiguration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(368);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MessageSecurityMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(369);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MethodAttributes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(370);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MethodNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(371);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModelChangeStructureDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(372);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ModelChangeStructureVerbMask() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(373);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModificationInfo() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(374);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModifyMonitoredItemsRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(375);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModifyMonitoredItemsResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(376);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModifySubscriptionRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(377);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModifySubscriptionResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(378);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MonitoredItemCreateRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(379);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MonitoredItemCreateResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(380);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MonitoredItemModifyRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(381);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MonitoredItemModifyResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(382);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MonitoredItemNotification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(383);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MonitoringFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(384);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MonitoringFilterResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(385);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MonitoringMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(386);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MonitoringParameters() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(387);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NetworkAddressDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(388);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NetworkAddressUrlDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(389);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NetworkGroupDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(390);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Node() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(391);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NodeAttributes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(392);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NodeAttributesMask() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(393);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NodeClass() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(394);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NodeId() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(395);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NodeReference() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(396);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NodeTypeDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(397);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NormalizedString() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(398);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NotificationData() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(399);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NotificationMessage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(400);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NumericRange() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(401);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectAttributes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(402);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(403);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectTypeAttributes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(404);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectTypeNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(405);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OpenFileMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(406);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OpenSecureChannelRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(407);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OpenSecureChannelResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(408);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OptionSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(409);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Orientation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(410);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OverrideValueHandling() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(411);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ParsingResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(412);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PerformUpdateType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(413);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PermissionType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(414);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramDiagnostic2DataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(415);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramDiagnosticDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(416);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PublishedDataItemsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(417);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PublishedDataSetDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(418);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PublishedDataSetSourceDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(419);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PublishedEventsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(420);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PublishedVariableDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(421);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PublishRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(422);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PublishResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(423);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PubSubConfigurationDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(424);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PubSubConnectionDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(425);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PubSubDiagnosticsCounterClassification() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(426);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PubSubGroupDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(427);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PubSubState() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(428);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QualifiedName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(429);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueryDataDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(430);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueryDataSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(431);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueryFirstRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(432);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueryFirstResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(433);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueryNextRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(434);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueryNextResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(435);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Range() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(436);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RationalNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(437);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReadAnnotationDataDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(438);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReadAtTimeDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(439);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReaderGroupDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(440);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReaderGroupMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(441);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReaderGroupTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(442);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReadEventDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(443);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReadProcessedDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(444);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReadRawModifiedDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(445);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReadRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(446);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReadResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(447);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReadValueId() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(448);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RedundancySupport() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(449);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RedundantServerDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(450);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(451);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(452);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceTypeAttributes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(453);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceTypeNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(454);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegisteredServer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(455);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegisterNodesRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(456);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegisterNodesResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(457);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegisterServer2Request() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(458);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegisterServer2Response() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(459);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegisterServerRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(460);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegisterServerResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(461);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativePath() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(462);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativePathElement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(463);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RepublishRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(464);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RepublishResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(465);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestHeader() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(466);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResponseHeader() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(467);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RolePermissionType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(468);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RsaEncryptedSecret() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(469);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SamplingIntervalDiagnosticsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(470);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SByte() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(471);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SecurityTokenRequestType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(472);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SemanticChangeStructureDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(473);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServerDiagnosticsSummaryDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(474);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServerOnNetwork() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(475);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServerState() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(476);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServerStatusDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(477);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceCounterDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(478);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceFault() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(479);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SessionAuthenticationToken() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(480);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SessionDiagnosticsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(481);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SessionlessInvokeRequestType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(482);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SessionlessInvokeResponseType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(483);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SessionSecurityDiagnosticsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(484);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SetMonitoringModeRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(485);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SetMonitoringModeResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(486);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SetPublishingModeRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(487);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SetPublishingModeResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(488);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SetTriggeringRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(489);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SetTriggeringResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(490);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureData() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(491);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignedSoftwareCertificate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(492);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SimpleAttributeOperand() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(493);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SimpleTypeDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(494);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusChangeNotification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(495);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(496);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(497);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_String() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(498);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StructureDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(499);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StructureDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(500);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StructureField() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(501);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StructureType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(502);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubscribedDataSetDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(503);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubscribedDataSetMirrorDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(504);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubscriptionAcknowledgement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(505);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubscriptionDiagnosticsDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(506);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TargetVariablesDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(507);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ThreeDCartesianCoordinates() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(508);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ThreeDFrame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(509);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ThreeDOrientation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(510);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ThreeDVector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(511);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Time() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(512);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TimestampsToReturn() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(513);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TimeString() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(514);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeZoneDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(515);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransferResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(516);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransferSubscriptionsRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(517);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransferSubscriptionsResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(518);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TranslateBrowsePathsToNodeIdsRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(519);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TranslateBrowsePathsToNodeIdsResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(520);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TrustListDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(521);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TrustListMasks() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(522);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(523);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UABinaryFileDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(524);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UadpDataSetMessageContentMask() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(525);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UadpDataSetReaderMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(526);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UadpDataSetWriterMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(527);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UadpNetworkMessageContentMask() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(528);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UadpWriterGroupMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(529);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UInt16() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(530);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UInt32() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(531);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UInt64() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(532);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Union() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(533);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UnregisterNodesRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(534);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UnregisterNodesResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(535);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UpdateDataDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(536);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UpdateEventDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(537);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UpdateStructureDataDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(538);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserIdentityToken() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(539);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserNameIdentityToken() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(540);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserTokenPolicy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(541);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UserTokenType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(542);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UtcTime() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(543);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VariableAttributes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(544);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VariableNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(545);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VariableTypeAttributes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(546);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VariableTypeNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(547);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Variant() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(548);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Vector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(549);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VersionTime() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(550);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ViewAttributes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(551);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ViewDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(552);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ViewNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(553);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WriteRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(554);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WriteResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(555);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WriterGroupDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(556);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WriterGroupMessageDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(557);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WriterGroupTransportDataType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(558);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WriteValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(559);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_X509IdentityToken() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(560);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XVType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(561);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleComplexNumberType() {
		if (doubleComplexNumberTypeEClass == null) {
			doubleComplexNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(122);
		}
		return doubleComplexNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleComplexNumberType_Real() {
        return (EAttribute)getDoubleComplexNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleComplexNumberType_Imaginary() {
        return (EAttribute)getDoubleComplexNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementOperand() {
		if (elementOperandEClass == null) {
			elementOperandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(123);
		}
		return elementOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementOperand_Index() {
        return (EAttribute)getElementOperand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointConfiguration() {
		if (endpointConfigurationEClass == null) {
			endpointConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(124);
		}
		return endpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointConfiguration_OperationTimeout() {
        return (EAttribute)getEndpointConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointConfiguration_UseBinaryEncoding() {
        return (EAttribute)getEndpointConfiguration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointConfiguration_MaxStringLength() {
        return (EAttribute)getEndpointConfiguration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointConfiguration_MaxByteStringLength() {
        return (EAttribute)getEndpointConfiguration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointConfiguration_MaxArrayLength() {
        return (EAttribute)getEndpointConfiguration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointConfiguration_MaxMessageSize() {
        return (EAttribute)getEndpointConfiguration().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointConfiguration_MaxBufferSize() {
        return (EAttribute)getEndpointConfiguration().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointConfiguration_ChannelLifetime() {
        return (EAttribute)getEndpointConfiguration().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointConfiguration_SecurityTokenLifetime() {
        return (EAttribute)getEndpointConfiguration().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointDescription() {
		if (endpointDescriptionEClass == null) {
			endpointDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(125);
		}
		return endpointDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointDescription_EndpointUrl() {
        return (EAttribute)getEndpointDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointDescription_Server() {
        return (EReference)getEndpointDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointDescription_ServerCertificate() {
        return (EAttribute)getEndpointDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointDescription_SecurityMode() {
        return (EAttribute)getEndpointDescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointDescription_SecurityPolicyUri() {
        return (EAttribute)getEndpointDescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointDescription_UserIdentityTokens() {
        return (EReference)getEndpointDescription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointDescription_TransportProfileUri() {
        return (EAttribute)getEndpointDescription().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointDescription_SecurityLevel() {
        return (EAttribute)getEndpointDescription().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointType() {
		if (endpointTypeEClass == null) {
			endpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(126);
		}
		return endpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointType_EndpointUrl() {
        return (EAttribute)getEndpointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointType_SecurityMode() {
        return (EAttribute)getEndpointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointType_SecurityPolicyUri() {
        return (EAttribute)getEndpointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointType_TransportProfileUri() {
        return (EAttribute)getEndpointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointUrlListDataType() {
		if (endpointUrlListDataTypeEClass == null) {
			endpointUrlListDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(127);
		}
		return endpointUrlListDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointUrlListDataType_EndpointUrlList() {
        return (EReference)getEndpointUrlListDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumDefinition() {
		if (enumDefinitionEClass == null) {
			enumDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(128);
		}
		return enumDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumDefinition_Fields() {
        return (EReference)getEnumDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumDescription() {
		if (enumDescriptionEClass == null) {
			enumDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(129);
		}
		return enumDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumDescription_EnumDefinition() {
        return (EReference)getEnumDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumDescription_BuiltInType() {
        return (EAttribute)getEnumDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumField() {
		if (enumFieldEClass == null) {
			enumFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(130);
		}
		return enumFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumField_Name() {
        return (EAttribute)getEnumField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumValueType() {
		if (enumValueTypeEClass == null) {
			enumValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(131);
		}
		return enumValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumValueType_Value() {
        return (EAttribute)getEnumValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumValueType_DisplayName() {
        return (EReference)getEnumValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumValueType_Description() {
        return (EReference)getEnumValueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEUInformation() {
		if (euInformationEClass == null) {
			euInformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(132);
		}
		return euInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEUInformation_NamespaceUri() {
        return (EAttribute)getEUInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEUInformation_UnitId() {
        return (EAttribute)getEUInformation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEUInformation_DisplayName() {
        return (EReference)getEUInformation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEUInformation_Description() {
        return (EReference)getEUInformation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventFieldList() {
		if (eventFieldListEClass == null) {
			eventFieldListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(133);
		}
		return eventFieldListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventFieldList_ClientHandle() {
        return (EAttribute)getEventFieldList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventFieldList_EventFields() {
        return (EReference)getEventFieldList().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventFilter() {
		if (eventFilterEClass == null) {
			eventFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(134);
		}
		return eventFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventFilter_SelectClauses() {
        return (EReference)getEventFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventFilter_WhereClause() {
        return (EReference)getEventFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventFilterResult() {
		if (eventFilterResultEClass == null) {
			eventFilterResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(135);
		}
		return eventFilterResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventFilterResult_SelectClauseResults() {
        return (EReference)getEventFilterResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventFilterResult_SelectClauseDiagnosticInfos() {
        return (EReference)getEventFilterResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventFilterResult_WhereClauseResult() {
        return (EReference)getEventFilterResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventNotificationList() {
		if (eventNotificationListEClass == null) {
			eventNotificationListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(136);
		}
		return eventNotificationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventNotificationList_Events() {
        return (EReference)getEventNotificationList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpandedNodeId() {
		if (expandedNodeIdEClass == null) {
			expandedNodeIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(141);
		}
		return expandedNodeIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpandedNodeId_Identifier() {
        return (EAttribute)getExpandedNodeId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionObject() {
		if (extensionObjectEClass == null) {
			extensionObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(142);
		}
		return extensionObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionObject_TypeId() {
        return (EReference)getExtensionObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionObject_Body() {
        return (EReference)getExtensionObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldMetaData() {
		if (fieldMetaDataEClass == null) {
			fieldMetaDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(143);
		}
		return fieldMetaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMetaData_Name() {
        return (EAttribute)getFieldMetaData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldMetaData_Description() {
        return (EReference)getFieldMetaData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMetaData_FieldFlags() {
        return (EAttribute)getFieldMetaData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMetaData_BuiltInType() {
        return (EAttribute)getFieldMetaData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldMetaData_DataType() {
        return (EReference)getFieldMetaData().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMetaData_ValueRank() {
        return (EAttribute)getFieldMetaData().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldMetaData_ArrayDimensions() {
        return (EReference)getFieldMetaData().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMetaData_MaxStringLength() {
        return (EAttribute)getFieldMetaData().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldMetaData_DataSetFieldId() {
        return (EReference)getFieldMetaData().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldMetaData_Properties() {
        return (EReference)getFieldMetaData().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldTargetDataType() {
		if (fieldTargetDataTypeEClass == null) {
			fieldTargetDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(144);
		}
		return fieldTargetDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldTargetDataType_DataSetFieldId() {
        return (EReference)getFieldTargetDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldTargetDataType_ReceiverIndexRange() {
        return (EAttribute)getFieldTargetDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldTargetDataType_TargetNodeId() {
        return (EReference)getFieldTargetDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldTargetDataType_AttributeId() {
        return (EAttribute)getFieldTargetDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldTargetDataType_WriteIndexRange() {
        return (EAttribute)getFieldTargetDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldTargetDataType_OverrideValueHandling() {
        return (EAttribute)getFieldTargetDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldTargetDataType_OverrideValue() {
        return (EReference)getFieldTargetDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterOperand() {
		if (filterOperandEClass == null) {
			filterOperandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(145);
		}
		return filterOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindServersOnNetworkRequest() {
		if (findServersOnNetworkRequestEClass == null) {
			findServersOnNetworkRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(148);
		}
		return findServersOnNetworkRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindServersOnNetworkRequest_RequestHeader() {
        return (EReference)getFindServersOnNetworkRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFindServersOnNetworkRequest_StartingRecordId() {
        return (EAttribute)getFindServersOnNetworkRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFindServersOnNetworkRequest_MaxRecordsToReturn() {
        return (EAttribute)getFindServersOnNetworkRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindServersOnNetworkRequest_ServerCapabilityFilter() {
        return (EReference)getFindServersOnNetworkRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindServersOnNetworkResponse() {
		if (findServersOnNetworkResponseEClass == null) {
			findServersOnNetworkResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(149);
		}
		return findServersOnNetworkResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindServersOnNetworkResponse_ResponseHeader() {
        return (EReference)getFindServersOnNetworkResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFindServersOnNetworkResponse_LastCounterResetTime() {
        return (EAttribute)getFindServersOnNetworkResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindServersOnNetworkResponse_Servers() {
        return (EReference)getFindServersOnNetworkResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindServersRequest() {
		if (findServersRequestEClass == null) {
			findServersRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(150);
		}
		return findServersRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindServersRequest_RequestHeader() {
        return (EReference)getFindServersRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFindServersRequest_EndpointUrl() {
        return (EAttribute)getFindServersRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindServersRequest_LocaleIds() {
        return (EReference)getFindServersRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindServersRequest_ServerUris() {
        return (EReference)getFindServersRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindServersResponse() {
		if (findServersResponseEClass == null) {
			findServersResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(151);
		}
		return findServersResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindServersResponse_ResponseHeader() {
        return (EReference)getFindServersResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindServersResponse_Servers() {
        return (EReference)getFindServersResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrame() {
		if (frameEClass == null) {
			frameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(152);
		}
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericAttributes() {
		if (genericAttributesEClass == null) {
			genericAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(153);
		}
		return genericAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericAttributes_AttributeValues() {
        return (EReference)getGenericAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericAttributeValue() {
		if (genericAttributeValueEClass == null) {
			genericAttributeValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(154);
		}
		return genericAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericAttributeValue_AttributeId() {
        return (EAttribute)getGenericAttributeValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericAttributeValue_Value() {
        return (EReference)getGenericAttributeValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetEndpointsRequest() {
		if (getEndpointsRequestEClass == null) {
			getEndpointsRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(155);
		}
		return getEndpointsRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetEndpointsRequest_RequestHeader() {
        return (EReference)getGetEndpointsRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetEndpointsRequest_EndpointUrl() {
        return (EAttribute)getGetEndpointsRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetEndpointsRequest_LocaleIds() {
        return (EReference)getGetEndpointsRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetEndpointsRequest_ProfileUris() {
        return (EReference)getGetEndpointsRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetEndpointsResponse() {
		if (getEndpointsResponseEClass == null) {
			getEndpointsResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(156);
		}
		return getEndpointsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetEndpointsResponse_ResponseHeader() {
        return (EReference)getGetEndpointsResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetEndpointsResponse_Endpoints() {
        return (EReference)getGetEndpointsResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuid() {
		if (guidEClass == null) {
			guidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(157);
		}
		return guidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuid_String() {
        return (EAttribute)getGuid().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryData() {
		if (historyDataEClass == null) {
			historyDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(158);
		}
		return historyDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryData_DataValues() {
        return (EReference)getHistoryData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryEvent() {
		if (historyEventEClass == null) {
			historyEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(159);
		}
		return historyEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryEvent_Events() {
        return (EReference)getHistoryEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryEventFieldList() {
		if (historyEventFieldListEClass == null) {
			historyEventFieldListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(160);
		}
		return historyEventFieldListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryEventFieldList_EventFields() {
        return (EReference)getHistoryEventFieldList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryModifiedData() {
		if (historyModifiedDataEClass == null) {
			historyModifiedDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(161);
		}
		return historyModifiedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryModifiedData_ModificationInfos() {
        return (EReference)getHistoryModifiedData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryReadDetails() {
		if (historyReadDetailsEClass == null) {
			historyReadDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(162);
		}
		return historyReadDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryReadRequest() {
		if (historyReadRequestEClass == null) {
			historyReadRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(163);
		}
		return historyReadRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryReadRequest_RequestHeader() {
        return (EReference)getHistoryReadRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryReadRequest_HistoryReadDetails() {
        return (EReference)getHistoryReadRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryReadRequest_TimestampsToReturn() {
        return (EAttribute)getHistoryReadRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryReadRequest_ReleaseContinuationPoints() {
        return (EAttribute)getHistoryReadRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryReadRequest_NodesToRead() {
        return (EReference)getHistoryReadRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryReadResponse() {
		if (historyReadResponseEClass == null) {
			historyReadResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(164);
		}
		return historyReadResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryReadResponse_ResponseHeader() {
        return (EReference)getHistoryReadResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryReadResponse_Results() {
        return (EReference)getHistoryReadResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryReadResponse_DiagnosticInfos() {
        return (EReference)getHistoryReadResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryReadResult() {
		if (historyReadResultEClass == null) {
			historyReadResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(165);
		}
		return historyReadResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryReadResult_StatusCode() {
        return (EReference)getHistoryReadResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryReadResult_ContinuationPoint() {
        return (EAttribute)getHistoryReadResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryReadResult_HistoryData() {
        return (EReference)getHistoryReadResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryReadValueId() {
		if (historyReadValueIdEClass == null) {
			historyReadValueIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(166);
		}
		return historyReadValueIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryReadValueId_NodeId() {
        return (EReference)getHistoryReadValueId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryReadValueId_IndexRange() {
        return (EAttribute)getHistoryReadValueId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryReadValueId_DataEncoding() {
        return (EReference)getHistoryReadValueId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryReadValueId_ContinuationPoint() {
        return (EAttribute)getHistoryReadValueId().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryUpdateDetails() {
		if (historyUpdateDetailsEClass == null) {
			historyUpdateDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(167);
		}
		return historyUpdateDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryUpdateDetails_NodeId() {
        return (EReference)getHistoryUpdateDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryUpdateRequest() {
		if (historyUpdateRequestEClass == null) {
			historyUpdateRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(168);
		}
		return historyUpdateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryUpdateRequest_RequestHeader() {
        return (EReference)getHistoryUpdateRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryUpdateRequest_HistoryUpdateDetails() {
        return (EReference)getHistoryUpdateRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryUpdateResponse() {
		if (historyUpdateResponseEClass == null) {
			historyUpdateResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(169);
		}
		return historyUpdateResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryUpdateResponse_ResponseHeader() {
        return (EReference)getHistoryUpdateResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryUpdateResponse_Results() {
        return (EReference)getHistoryUpdateResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryUpdateResponse_DiagnosticInfos() {
        return (EReference)getHistoryUpdateResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryUpdateResult() {
		if (historyUpdateResultEClass == null) {
			historyUpdateResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(170);
		}
		return historyUpdateResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryUpdateResult_StatusCode() {
        return (EReference)getHistoryUpdateResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryUpdateResult_OperationResults() {
        return (EReference)getHistoryUpdateResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryUpdateResult_DiagnosticInfos() {
        return (EReference)getHistoryUpdateResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityMappingRuleType() {
		if (identityMappingRuleTypeEClass == null) {
			identityMappingRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(175);
		}
		return identityMappingRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityMappingRuleType_CriteriaType() {
        return (EAttribute)getIdentityMappingRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityMappingRuleType_Criteria() {
        return (EAttribute)getIdentityMappingRuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceNode() {
		if (instanceNodeEClass == null) {
			instanceNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(178);
		}
		return instanceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssuedIdentityToken() {
		if (issuedIdentityTokenEClass == null) {
			issuedIdentityTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(179);
		}
		return issuedIdentityTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssuedIdentityToken_TokenData() {
        return (EAttribute)getIssuedIdentityToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssuedIdentityToken_EncryptionAlgorithm() {
        return (EAttribute)getIssuedIdentityToken().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonDataSetReaderMessageDataType() {
		if (jsonDataSetReaderMessageDataTypeEClass == null) {
			jsonDataSetReaderMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(182);
		}
		return jsonDataSetReaderMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonDataSetReaderMessageDataType_NetworkMessageContentMask() {
        return (EAttribute)getJsonDataSetReaderMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonDataSetReaderMessageDataType_DataSetMessageContentMask() {
        return (EAttribute)getJsonDataSetReaderMessageDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonDataSetWriterMessageDataType() {
		if (jsonDataSetWriterMessageDataTypeEClass == null) {
			jsonDataSetWriterMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(183);
		}
		return jsonDataSetWriterMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonDataSetWriterMessageDataType_DataSetMessageContentMask() {
        return (EAttribute)getJsonDataSetWriterMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonWriterGroupMessageDataType() {
		if (jsonWriterGroupMessageDataTypeEClass == null) {
			jsonWriterGroupMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(186);
		}
		return jsonWriterGroupMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonWriterGroupMessageDataType_NetworkMessageContentMask() {
        return (EAttribute)getJsonWriterGroupMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValuePair() {
		if (keyValuePairEClass == null) {
			keyValuePairEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(187);
		}
		return keyValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValuePair_Key() {
        return (EReference)getKeyValuePair().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValuePair_Value() {
        return (EReference)getKeyValuePair().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfAddNodesItem() {
		if (listOfAddNodesItemEClass == null) {
			listOfAddNodesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(188);
		}
		return listOfAddNodesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfAddNodesItem_AddNodesItem() {
        return (EReference)getListOfAddNodesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfAddNodesResult() {
		if (listOfAddNodesResultEClass == null) {
			listOfAddNodesResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(189);
		}
		return listOfAddNodesResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfAddNodesResult_AddNodesResult() {
        return (EReference)getListOfAddNodesResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfAddReferencesItem() {
		if (listOfAddReferencesItemEClass == null) {
			listOfAddReferencesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(190);
		}
		return listOfAddReferencesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfAddReferencesItem_AddReferencesItem() {
        return (EReference)getListOfAddReferencesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfAliasNameDataType() {
		if (listOfAliasNameDataTypeEClass == null) {
			listOfAliasNameDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(191);
		}
		return listOfAliasNameDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfAliasNameDataType_AliasNameDataType() {
        return (EReference)getListOfAliasNameDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfApplicationDescription() {
		if (listOfApplicationDescriptionEClass == null) {
			listOfApplicationDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(192);
		}
		return listOfApplicationDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfApplicationDescription_ApplicationDescription() {
        return (EReference)getListOfApplicationDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfArgument() {
		if (listOfArgumentEClass == null) {
			listOfArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(193);
		}
		return listOfArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfArgument_Argument() {
        return (EReference)getListOfArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBoolean() {
		if (listOfBooleanEClass == null) {
			listOfBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(194);
		}
		return listOfBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfBoolean_Boolean() {
        return (EAttribute)getListOfBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBrokerConnectionTransportDataType() {
		if (listOfBrokerConnectionTransportDataTypeEClass == null) {
			listOfBrokerConnectionTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(195);
		}
		return listOfBrokerConnectionTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfBrokerConnectionTransportDataType_BrokerConnectionTransportDataType() {
        return (EReference)getListOfBrokerConnectionTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBrokerDataSetReaderTransportDataType() {
		if (listOfBrokerDataSetReaderTransportDataTypeEClass == null) {
			listOfBrokerDataSetReaderTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(196);
		}
		return listOfBrokerDataSetReaderTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfBrokerDataSetReaderTransportDataType_BrokerDataSetReaderTransportDataType() {
        return (EReference)getListOfBrokerDataSetReaderTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBrokerDataSetWriterTransportDataType() {
		if (listOfBrokerDataSetWriterTransportDataTypeEClass == null) {
			listOfBrokerDataSetWriterTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(197);
		}
		return listOfBrokerDataSetWriterTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfBrokerDataSetWriterTransportDataType_BrokerDataSetWriterTransportDataType() {
        return (EReference)getListOfBrokerDataSetWriterTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBrokerTransportQualityOfService() {
		if (listOfBrokerTransportQualityOfServiceEClass == null) {
			listOfBrokerTransportQualityOfServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(198);
		}
		return listOfBrokerTransportQualityOfServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfBrokerTransportQualityOfService_BrokerTransportQualityOfService() {
        return (EAttribute)getListOfBrokerTransportQualityOfService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBrokerWriterGroupTransportDataType() {
		if (listOfBrokerWriterGroupTransportDataTypeEClass == null) {
			listOfBrokerWriterGroupTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(199);
		}
		return listOfBrokerWriterGroupTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfBrokerWriterGroupTransportDataType_BrokerWriterGroupTransportDataType() {
        return (EReference)getListOfBrokerWriterGroupTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBrowseDescription() {
		if (listOfBrowseDescriptionEClass == null) {
			listOfBrowseDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(200);
		}
		return listOfBrowseDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfBrowseDescription_BrowseDescription() {
        return (EReference)getListOfBrowseDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBrowsePath() {
		if (listOfBrowsePathEClass == null) {
			listOfBrowsePathEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(201);
		}
		return listOfBrowsePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfBrowsePath_BrowsePath() {
        return (EReference)getListOfBrowsePath().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBrowsePathResult() {
		if (listOfBrowsePathResultEClass == null) {
			listOfBrowsePathResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(202);
		}
		return listOfBrowsePathResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfBrowsePathResult_BrowsePathResult() {
        return (EReference)getListOfBrowsePathResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBrowsePathTarget() {
		if (listOfBrowsePathTargetEClass == null) {
			listOfBrowsePathTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(203);
		}
		return listOfBrowsePathTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfBrowsePathTarget_BrowsePathTarget() {
        return (EReference)getListOfBrowsePathTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfBrowseResult() {
		if (listOfBrowseResultEClass == null) {
			listOfBrowseResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(204);
		}
		return listOfBrowseResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfBrowseResult_BrowseResult() {
        return (EReference)getListOfBrowseResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfByte() {
		if (listOfByteEClass == null) {
			listOfByteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(205);
		}
		return listOfByteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfByte_Byte() {
        return (EAttribute)getListOfByte().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfByteString() {
		if (listOfByteStringEClass == null) {
			listOfByteStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(206);
		}
		return listOfByteStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfByteString_ByteString() {
        return (EAttribute)getListOfByteString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfCallMethodRequest() {
		if (listOfCallMethodRequestEClass == null) {
			listOfCallMethodRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(207);
		}
		return listOfCallMethodRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfCallMethodRequest_CallMethodRequest() {
        return (EReference)getListOfCallMethodRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfCallMethodResult() {
		if (listOfCallMethodResultEClass == null) {
			listOfCallMethodResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(208);
		}
		return listOfCallMethodResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfCallMethodResult_CallMethodResult() {
        return (EReference)getListOfCallMethodResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfCartesianCoordinates() {
		if (listOfCartesianCoordinatesEClass == null) {
			listOfCartesianCoordinatesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(209);
		}
		return listOfCartesianCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfCartesianCoordinates_CartesianCoordinates() {
        return (EReference)getListOfCartesianCoordinates().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfConfigurationVersionDataType() {
		if (listOfConfigurationVersionDataTypeEClass == null) {
			listOfConfigurationVersionDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(210);
		}
		return listOfConfigurationVersionDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfConfigurationVersionDataType_ConfigurationVersionDataType() {
        return (EReference)getListOfConfigurationVersionDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfConnectionTransportDataType() {
		if (listOfConnectionTransportDataTypeEClass == null) {
			listOfConnectionTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(211);
		}
		return listOfConnectionTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfConnectionTransportDataType_ConnectionTransportDataType() {
        return (EReference)getListOfConnectionTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfContentFilter() {
		if (listOfContentFilterEClass == null) {
			listOfContentFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(212);
		}
		return listOfContentFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfContentFilter_ContentFilter() {
        return (EReference)getListOfContentFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfContentFilterElement() {
		if (listOfContentFilterElementEClass == null) {
			listOfContentFilterElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(213);
		}
		return listOfContentFilterElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfContentFilterElement_ContentFilterElement() {
        return (EReference)getListOfContentFilterElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfContentFilterElementResult() {
		if (listOfContentFilterElementResultEClass == null) {
			listOfContentFilterElementResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(214);
		}
		return listOfContentFilterElementResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfContentFilterElementResult_ContentFilterElementResult() {
        return (EReference)getListOfContentFilterElementResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfCurrencyUnitType() {
		if (listOfCurrencyUnitTypeEClass == null) {
			listOfCurrencyUnitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(215);
		}
		return listOfCurrencyUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfCurrencyUnitType_CurrencyUnitType() {
        return (EReference)getListOfCurrencyUnitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDatagramConnectionTransportDataType() {
		if (listOfDatagramConnectionTransportDataTypeEClass == null) {
			listOfDatagramConnectionTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(216);
		}
		return listOfDatagramConnectionTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDatagramConnectionTransportDataType_DatagramConnectionTransportDataType() {
        return (EReference)getListOfDatagramConnectionTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDatagramWriterGroupTransportDataType() {
		if (listOfDatagramWriterGroupTransportDataTypeEClass == null) {
			listOfDatagramWriterGroupTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(217);
		}
		return listOfDatagramWriterGroupTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDatagramWriterGroupTransportDataType_DatagramWriterGroupTransportDataType() {
        return (EReference)getListOfDatagramWriterGroupTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataSetFieldContentMask() {
		if (listOfDataSetFieldContentMaskEClass == null) {
			listOfDataSetFieldContentMaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(218);
		}
		return listOfDataSetFieldContentMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfDataSetFieldContentMask_DataSetFieldContentMask() {
        return (EAttribute)getListOfDataSetFieldContentMask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataSetMetaDataType() {
		if (listOfDataSetMetaDataTypeEClass == null) {
			listOfDataSetMetaDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(219);
		}
		return listOfDataSetMetaDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataSetMetaDataType_DataSetMetaDataType() {
        return (EReference)getListOfDataSetMetaDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataSetOrderingType() {
		if (listOfDataSetOrderingTypeEClass == null) {
			listOfDataSetOrderingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(220);
		}
		return listOfDataSetOrderingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfDataSetOrderingType_DataSetOrderingType() {
        return (EAttribute)getListOfDataSetOrderingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataSetReaderDataType() {
		if (listOfDataSetReaderDataTypeEClass == null) {
			listOfDataSetReaderDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(221);
		}
		return listOfDataSetReaderDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataSetReaderDataType_DataSetReaderDataType() {
        return (EReference)getListOfDataSetReaderDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataSetReaderMessageDataType() {
		if (listOfDataSetReaderMessageDataTypeEClass == null) {
			listOfDataSetReaderMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(222);
		}
		return listOfDataSetReaderMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataSetReaderMessageDataType_DataSetReaderMessageDataType() {
        return (EReference)getListOfDataSetReaderMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataSetReaderTransportDataType() {
		if (listOfDataSetReaderTransportDataTypeEClass == null) {
			listOfDataSetReaderTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(223);
		}
		return listOfDataSetReaderTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataSetReaderTransportDataType_DataSetReaderTransportDataType() {
        return (EReference)getListOfDataSetReaderTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataSetWriterDataType() {
		if (listOfDataSetWriterDataTypeEClass == null) {
			listOfDataSetWriterDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(224);
		}
		return listOfDataSetWriterDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataSetWriterDataType_DataSetWriterDataType() {
        return (EReference)getListOfDataSetWriterDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataSetWriterMessageDataType() {
		if (listOfDataSetWriterMessageDataTypeEClass == null) {
			listOfDataSetWriterMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(225);
		}
		return listOfDataSetWriterMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataSetWriterMessageDataType_DataSetWriterMessageDataType() {
        return (EReference)getListOfDataSetWriterMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataSetWriterTransportDataType() {
		if (listOfDataSetWriterTransportDataTypeEClass == null) {
			listOfDataSetWriterTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(226);
		}
		return listOfDataSetWriterTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataSetWriterTransportDataType_DataSetWriterTransportDataType() {
        return (EReference)getListOfDataSetWriterTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataTypeDefinition() {
		if (listOfDataTypeDefinitionEClass == null) {
			listOfDataTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(227);
		}
		return listOfDataTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataTypeDefinition_DataTypeDefinition() {
        return (EReference)getListOfDataTypeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataTypeDescription() {
		if (listOfDataTypeDescriptionEClass == null) {
			listOfDataTypeDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(228);
		}
		return listOfDataTypeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataTypeDescription_DataTypeDescription() {
        return (EReference)getListOfDataTypeDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataTypeSchemaHeader() {
		if (listOfDataTypeSchemaHeaderEClass == null) {
			listOfDataTypeSchemaHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(229);
		}
		return listOfDataTypeSchemaHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataTypeSchemaHeader_DataTypeSchemaHeader() {
        return (EReference)getListOfDataTypeSchemaHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDataValue() {
		if (listOfDataValueEClass == null) {
			listOfDataValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(230);
		}
		return listOfDataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDataValue_DataValue() {
        return (EReference)getListOfDataValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDateTime() {
		if (listOfDateTimeEClass == null) {
			listOfDateTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(231);
		}
		return listOfDateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfDateTime_DateTime() {
        return (EAttribute)getListOfDateTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDeleteNodesItem() {
		if (listOfDeleteNodesItemEClass == null) {
			listOfDeleteNodesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(232);
		}
		return listOfDeleteNodesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDeleteNodesItem_DeleteNodesItem() {
        return (EReference)getListOfDeleteNodesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDeleteReferencesItem() {
		if (listOfDeleteReferencesItemEClass == null) {
			listOfDeleteReferencesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(233);
		}
		return listOfDeleteReferencesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDeleteReferencesItem_DeleteReferencesItem() {
        return (EReference)getListOfDeleteReferencesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDiagnosticInfo() {
		if (listOfDiagnosticInfoEClass == null) {
			listOfDiagnosticInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(234);
		}
		return listOfDiagnosticInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDiagnosticInfo_DiagnosticInfo() {
        return (EReference)getListOfDiagnosticInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDiagnosticsLevel() {
		if (listOfDiagnosticsLevelEClass == null) {
			listOfDiagnosticsLevelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(235);
		}
		return listOfDiagnosticsLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfDiagnosticsLevel_DiagnosticsLevel() {
        return (EAttribute)getListOfDiagnosticsLevel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDouble() {
		if (listOfDoubleEClass == null) {
			listOfDoubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(236);
		}
		return listOfDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfDouble_Double() {
        return (EAttribute)getListOfDouble().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfEndpointConfiguration() {
		if (listOfEndpointConfigurationEClass == null) {
			listOfEndpointConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(237);
		}
		return listOfEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfEndpointConfiguration_EndpointConfiguration() {
        return (EReference)getListOfEndpointConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfEndpointDescription() {
		if (listOfEndpointDescriptionEClass == null) {
			listOfEndpointDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(238);
		}
		return listOfEndpointDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfEndpointDescription_EndpointDescription() {
        return (EReference)getListOfEndpointDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfEndpointType() {
		if (listOfEndpointTypeEClass == null) {
			listOfEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(239);
		}
		return listOfEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfEndpointType_EndpointType() {
        return (EReference)getListOfEndpointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfEndpointUrlListDataType() {
		if (listOfEndpointUrlListDataTypeEClass == null) {
			listOfEndpointUrlListDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(240);
		}
		return listOfEndpointUrlListDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfEndpointUrlListDataType_EndpointUrlListDataType() {
        return (EReference)getListOfEndpointUrlListDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfEnumDefinition() {
		if (listOfEnumDefinitionEClass == null) {
			listOfEnumDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(241);
		}
		return listOfEnumDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfEnumDefinition_EnumDefinition() {
        return (EReference)getListOfEnumDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfEnumDescription() {
		if (listOfEnumDescriptionEClass == null) {
			listOfEnumDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(242);
		}
		return listOfEnumDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfEnumDescription_EnumDescription() {
        return (EReference)getListOfEnumDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfEnumField() {
		if (listOfEnumFieldEClass == null) {
			listOfEnumFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(243);
		}
		return listOfEnumFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfEnumField_EnumField() {
        return (EReference)getListOfEnumField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfEnumValueType() {
		if (listOfEnumValueTypeEClass == null) {
			listOfEnumValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(244);
		}
		return listOfEnumValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfEnumValueType_EnumValueType() {
        return (EReference)getListOfEnumValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfEventFieldList() {
		if (listOfEventFieldListEClass == null) {
			listOfEventFieldListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(245);
		}
		return listOfEventFieldListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfEventFieldList_EventFieldList() {
        return (EReference)getListOfEventFieldList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfExpandedNodeId() {
		if (listOfExpandedNodeIdEClass == null) {
			listOfExpandedNodeIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(246);
		}
		return listOfExpandedNodeIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfExpandedNodeId_ExpandedNodeId() {
        return (EReference)getListOfExpandedNodeId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfExtensionObject() {
		if (listOfExtensionObjectEClass == null) {
			listOfExtensionObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(247);
		}
		return listOfExtensionObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfExtensionObject_ExtensionObject() {
        return (EReference)getListOfExtensionObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfFieldMetaData() {
		if (listOfFieldMetaDataEClass == null) {
			listOfFieldMetaDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(248);
		}
		return listOfFieldMetaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfFieldMetaData_FieldMetaData() {
        return (EReference)getListOfFieldMetaData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfFieldTargetDataType() {
		if (listOfFieldTargetDataTypeEClass == null) {
			listOfFieldTargetDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(249);
		}
		return listOfFieldTargetDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfFieldTargetDataType_FieldTargetDataType() {
        return (EReference)getListOfFieldTargetDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfFloat() {
		if (listOfFloatEClass == null) {
			listOfFloatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(250);
		}
		return listOfFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfFloat_Float() {
        return (EAttribute)getListOfFloat().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfFrame() {
		if (listOfFrameEClass == null) {
			listOfFrameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(251);
		}
		return listOfFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfFrame_Frame() {
        return (EReference)getListOfFrame().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfGenericAttributeValue() {
		if (listOfGenericAttributeValueEClass == null) {
			listOfGenericAttributeValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(252);
		}
		return listOfGenericAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfGenericAttributeValue_GenericAttributeValue() {
        return (EReference)getListOfGenericAttributeValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfGuid() {
		if (listOfGuidEClass == null) {
			listOfGuidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(253);
		}
		return listOfGuidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfGuid_Guid() {
        return (EReference)getListOfGuid().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfHistoryEventFieldList() {
		if (listOfHistoryEventFieldListEClass == null) {
			listOfHistoryEventFieldListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(254);
		}
		return listOfHistoryEventFieldListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfHistoryEventFieldList_HistoryEventFieldList() {
        return (EReference)getListOfHistoryEventFieldList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfHistoryReadResult() {
		if (listOfHistoryReadResultEClass == null) {
			listOfHistoryReadResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(255);
		}
		return listOfHistoryReadResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfHistoryReadResult_HistoryReadResult() {
        return (EReference)getListOfHistoryReadResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfHistoryReadValueId() {
		if (listOfHistoryReadValueIdEClass == null) {
			listOfHistoryReadValueIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(256);
		}
		return listOfHistoryReadValueIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfHistoryReadValueId_HistoryReadValueId() {
        return (EReference)getListOfHistoryReadValueId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfHistoryUpdateResult() {
		if (listOfHistoryUpdateResultEClass == null) {
			listOfHistoryUpdateResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(257);
		}
		return listOfHistoryUpdateResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfHistoryUpdateResult_HistoryUpdateResult() {
        return (EReference)getListOfHistoryUpdateResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfIdentityCriteriaType() {
		if (listOfIdentityCriteriaTypeEClass == null) {
			listOfIdentityCriteriaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(258);
		}
		return listOfIdentityCriteriaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfIdentityCriteriaType_IdentityCriteriaType() {
        return (EAttribute)getListOfIdentityCriteriaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfIdentityMappingRuleType() {
		if (listOfIdentityMappingRuleTypeEClass == null) {
			listOfIdentityMappingRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(259);
		}
		return listOfIdentityMappingRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfIdentityMappingRuleType_IdentityMappingRuleType() {
        return (EReference)getListOfIdentityMappingRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfIdType() {
		if (listOfIdTypeEClass == null) {
			listOfIdTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(260);
		}
		return listOfIdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfIdType_IdType() {
        return (EAttribute)getListOfIdType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfInt16() {
		if (listOfInt16EClass == null) {
			listOfInt16EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(261);
		}
		return listOfInt16EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfInt16_Int16() {
        return (EAttribute)getListOfInt16().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfInt32() {
		if (listOfInt32EClass == null) {
			listOfInt32EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(262);
		}
		return listOfInt32EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfInt32_Int32() {
        return (EAttribute)getListOfInt32().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfInt64() {
		if (listOfInt64EClass == null) {
			listOfInt64EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(263);
		}
		return listOfInt64EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfInt64_Int64() {
        return (EAttribute)getListOfInt64().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfJsonDataSetMessageContentMask() {
		if (listOfJsonDataSetMessageContentMaskEClass == null) {
			listOfJsonDataSetMessageContentMaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(264);
		}
		return listOfJsonDataSetMessageContentMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfJsonDataSetMessageContentMask_JsonDataSetMessageContentMask() {
        return (EAttribute)getListOfJsonDataSetMessageContentMask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfJsonDataSetReaderMessageDataType() {
		if (listOfJsonDataSetReaderMessageDataTypeEClass == null) {
			listOfJsonDataSetReaderMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(265);
		}
		return listOfJsonDataSetReaderMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfJsonDataSetReaderMessageDataType_JsonDataSetReaderMessageDataType() {
        return (EReference)getListOfJsonDataSetReaderMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfJsonDataSetWriterMessageDataType() {
		if (listOfJsonDataSetWriterMessageDataTypeEClass == null) {
			listOfJsonDataSetWriterMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(266);
		}
		return listOfJsonDataSetWriterMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfJsonDataSetWriterMessageDataType_JsonDataSetWriterMessageDataType() {
        return (EReference)getListOfJsonDataSetWriterMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfJsonNetworkMessageContentMask() {
		if (listOfJsonNetworkMessageContentMaskEClass == null) {
			listOfJsonNetworkMessageContentMaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(267);
		}
		return listOfJsonNetworkMessageContentMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfJsonNetworkMessageContentMask_JsonNetworkMessageContentMask() {
        return (EAttribute)getListOfJsonNetworkMessageContentMask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfJsonWriterGroupMessageDataType() {
		if (listOfJsonWriterGroupMessageDataTypeEClass == null) {
			listOfJsonWriterGroupMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(268);
		}
		return listOfJsonWriterGroupMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfJsonWriterGroupMessageDataType_JsonWriterGroupMessageDataType() {
        return (EReference)getListOfJsonWriterGroupMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfKeyValuePair() {
		if (listOfKeyValuePairEClass == null) {
			listOfKeyValuePairEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(269);
		}
		return listOfKeyValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfKeyValuePair_KeyValuePair() {
        return (EReference)getListOfKeyValuePair().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfLocalizedText() {
		if (listOfLocalizedTextEClass == null) {
			listOfLocalizedTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(270);
		}
		return listOfLocalizedTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfLocalizedText_LocalizedText() {
        return (EReference)getListOfLocalizedText().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfModelChangeStructureDataType() {
		if (listOfModelChangeStructureDataTypeEClass == null) {
			listOfModelChangeStructureDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(271);
		}
		return listOfModelChangeStructureDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfModelChangeStructureDataType_ModelChangeStructureDataType() {
        return (EReference)getListOfModelChangeStructureDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfModificationInfo() {
		if (listOfModificationInfoEClass == null) {
			listOfModificationInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(272);
		}
		return listOfModificationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfModificationInfo_ModificationInfo() {
        return (EReference)getListOfModificationInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfMonitoredItemCreateRequest() {
		if (listOfMonitoredItemCreateRequestEClass == null) {
			listOfMonitoredItemCreateRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(273);
		}
		return listOfMonitoredItemCreateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfMonitoredItemCreateRequest_MonitoredItemCreateRequest() {
        return (EReference)getListOfMonitoredItemCreateRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfMonitoredItemCreateResult() {
		if (listOfMonitoredItemCreateResultEClass == null) {
			listOfMonitoredItemCreateResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(274);
		}
		return listOfMonitoredItemCreateResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfMonitoredItemCreateResult_MonitoredItemCreateResult() {
        return (EReference)getListOfMonitoredItemCreateResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfMonitoredItemModifyRequest() {
		if (listOfMonitoredItemModifyRequestEClass == null) {
			listOfMonitoredItemModifyRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(275);
		}
		return listOfMonitoredItemModifyRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfMonitoredItemModifyRequest_MonitoredItemModifyRequest() {
        return (EReference)getListOfMonitoredItemModifyRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfMonitoredItemModifyResult() {
		if (listOfMonitoredItemModifyResultEClass == null) {
			listOfMonitoredItemModifyResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(276);
		}
		return listOfMonitoredItemModifyResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfMonitoredItemModifyResult_MonitoredItemModifyResult() {
        return (EReference)getListOfMonitoredItemModifyResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfMonitoredItemNotification() {
		if (listOfMonitoredItemNotificationEClass == null) {
			listOfMonitoredItemNotificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(277);
		}
		return listOfMonitoredItemNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfMonitoredItemNotification_MonitoredItemNotification() {
        return (EReference)getListOfMonitoredItemNotification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfNetworkAddressDataType() {
		if (listOfNetworkAddressDataTypeEClass == null) {
			listOfNetworkAddressDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(278);
		}
		return listOfNetworkAddressDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfNetworkAddressDataType_NetworkAddressDataType() {
        return (EReference)getListOfNetworkAddressDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfNetworkAddressUrlDataType() {
		if (listOfNetworkAddressUrlDataTypeEClass == null) {
			listOfNetworkAddressUrlDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(279);
		}
		return listOfNetworkAddressUrlDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfNetworkAddressUrlDataType_NetworkAddressUrlDataType() {
        return (EReference)getListOfNetworkAddressUrlDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfNetworkGroupDataType() {
		if (listOfNetworkGroupDataTypeEClass == null) {
			listOfNetworkGroupDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(280);
		}
		return listOfNetworkGroupDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfNetworkGroupDataType_NetworkGroupDataType() {
        return (EReference)getListOfNetworkGroupDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfNode() {
		if (listOfNodeEClass == null) {
			listOfNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(281);
		}
		return listOfNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfNode_Node() {
        return (EReference)getListOfNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfNodeId() {
		if (listOfNodeIdEClass == null) {
			listOfNodeIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(282);
		}
		return listOfNodeIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfNodeId_NodeId() {
        return (EReference)getListOfNodeId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfNodeReference() {
		if (listOfNodeReferenceEClass == null) {
			listOfNodeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(283);
		}
		return listOfNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfNodeReference_NodeReference() {
        return (EReference)getListOfNodeReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfNodeTypeDescription() {
		if (listOfNodeTypeDescriptionEClass == null) {
			listOfNodeTypeDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(284);
		}
		return listOfNodeTypeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfNodeTypeDescription_NodeTypeDescription() {
        return (EReference)getListOfNodeTypeDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfOpenFileMode() {
		if (listOfOpenFileModeEClass == null) {
			listOfOpenFileModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(285);
		}
		return listOfOpenFileModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfOpenFileMode_OpenFileMode() {
        return (EAttribute)getListOfOpenFileMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfOptionSet() {
		if (listOfOptionSetEClass == null) {
			listOfOptionSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(286);
		}
		return listOfOptionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfOptionSet_OptionSet() {
        return (EReference)getListOfOptionSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfOrientation() {
		if (listOfOrientationEClass == null) {
			listOfOrientationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(287);
		}
		return listOfOrientationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfOrientation_Orientation() {
        return (EReference)getListOfOrientation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfOverrideValueHandling() {
		if (listOfOverrideValueHandlingEClass == null) {
			listOfOverrideValueHandlingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(288);
		}
		return listOfOverrideValueHandlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfOverrideValueHandling_OverrideValueHandling() {
        return (EAttribute)getListOfOverrideValueHandling().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfParsingResult() {
		if (listOfParsingResultEClass == null) {
			listOfParsingResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(289);
		}
		return listOfParsingResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfParsingResult_ParsingResult() {
        return (EReference)getListOfParsingResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfPublishedDataItemsDataType() {
		if (listOfPublishedDataItemsDataTypeEClass == null) {
			listOfPublishedDataItemsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(290);
		}
		return listOfPublishedDataItemsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfPublishedDataItemsDataType_PublishedDataItemsDataType() {
        return (EReference)getListOfPublishedDataItemsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfPublishedDataSetDataType() {
		if (listOfPublishedDataSetDataTypeEClass == null) {
			listOfPublishedDataSetDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(291);
		}
		return listOfPublishedDataSetDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfPublishedDataSetDataType_PublishedDataSetDataType() {
        return (EReference)getListOfPublishedDataSetDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfPublishedDataSetSourceDataType() {
		if (listOfPublishedDataSetSourceDataTypeEClass == null) {
			listOfPublishedDataSetSourceDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(292);
		}
		return listOfPublishedDataSetSourceDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfPublishedDataSetSourceDataType_PublishedDataSetSourceDataType() {
        return (EReference)getListOfPublishedDataSetSourceDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfPublishedEventsDataType() {
		if (listOfPublishedEventsDataTypeEClass == null) {
			listOfPublishedEventsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(293);
		}
		return listOfPublishedEventsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfPublishedEventsDataType_PublishedEventsDataType() {
        return (EReference)getListOfPublishedEventsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfPublishedVariableDataType() {
		if (listOfPublishedVariableDataTypeEClass == null) {
			listOfPublishedVariableDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(294);
		}
		return listOfPublishedVariableDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfPublishedVariableDataType_PublishedVariableDataType() {
        return (EReference)getListOfPublishedVariableDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfPubSubConfigurationDataType() {
		if (listOfPubSubConfigurationDataTypeEClass == null) {
			listOfPubSubConfigurationDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(295);
		}
		return listOfPubSubConfigurationDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfPubSubConfigurationDataType_PubSubConfigurationDataType() {
        return (EReference)getListOfPubSubConfigurationDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfPubSubConnectionDataType() {
		if (listOfPubSubConnectionDataTypeEClass == null) {
			listOfPubSubConnectionDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(296);
		}
		return listOfPubSubConnectionDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfPubSubConnectionDataType_PubSubConnectionDataType() {
        return (EReference)getListOfPubSubConnectionDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfPubSubDiagnosticsCounterClassification() {
		if (listOfPubSubDiagnosticsCounterClassificationEClass == null) {
			listOfPubSubDiagnosticsCounterClassificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(297);
		}
		return listOfPubSubDiagnosticsCounterClassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfPubSubDiagnosticsCounterClassification_PubSubDiagnosticsCounterClassification() {
        return (EAttribute)getListOfPubSubDiagnosticsCounterClassification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfPubSubGroupDataType() {
		if (listOfPubSubGroupDataTypeEClass == null) {
			listOfPubSubGroupDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(298);
		}
		return listOfPubSubGroupDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfPubSubGroupDataType_PubSubGroupDataType() {
        return (EReference)getListOfPubSubGroupDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfPubSubState() {
		if (listOfPubSubStateEClass == null) {
			listOfPubSubStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(299);
		}
		return listOfPubSubStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfPubSubState_PubSubState() {
        return (EAttribute)getListOfPubSubState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfQualifiedName() {
		if (listOfQualifiedNameEClass == null) {
			listOfQualifiedNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(300);
		}
		return listOfQualifiedNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfQualifiedName_QualifiedName() {
        return (EReference)getListOfQualifiedName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfQueryDataDescription() {
		if (listOfQueryDataDescriptionEClass == null) {
			listOfQueryDataDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(301);
		}
		return listOfQueryDataDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfQueryDataDescription_QueryDataDescription() {
        return (EReference)getListOfQueryDataDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfQueryDataSet() {
		if (listOfQueryDataSetEClass == null) {
			listOfQueryDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(302);
		}
		return listOfQueryDataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfQueryDataSet_QueryDataSet() {
        return (EReference)getListOfQueryDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfRationalNumber() {
		if (listOfRationalNumberEClass == null) {
			listOfRationalNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(303);
		}
		return listOfRationalNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfRationalNumber_RationalNumber() {
        return (EReference)getListOfRationalNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfReaderGroupDataType() {
		if (listOfReaderGroupDataTypeEClass == null) {
			listOfReaderGroupDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(304);
		}
		return listOfReaderGroupDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfReaderGroupDataType_ReaderGroupDataType() {
        return (EReference)getListOfReaderGroupDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfReaderGroupMessageDataType() {
		if (listOfReaderGroupMessageDataTypeEClass == null) {
			listOfReaderGroupMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(305);
		}
		return listOfReaderGroupMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfReaderGroupMessageDataType_ReaderGroupMessageDataType() {
        return (EReference)getListOfReaderGroupMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfReaderGroupTransportDataType() {
		if (listOfReaderGroupTransportDataTypeEClass == null) {
			listOfReaderGroupTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(306);
		}
		return listOfReaderGroupTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfReaderGroupTransportDataType_ReaderGroupTransportDataType() {
        return (EReference)getListOfReaderGroupTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfReadValueId() {
		if (listOfReadValueIdEClass == null) {
			listOfReadValueIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(307);
		}
		return listOfReadValueIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfReadValueId_ReadValueId() {
        return (EReference)getListOfReadValueId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfRedundantServerDataType() {
		if (listOfRedundantServerDataTypeEClass == null) {
			listOfRedundantServerDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(308);
		}
		return listOfRedundantServerDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfRedundantServerDataType_RedundantServerDataType() {
        return (EReference)getListOfRedundantServerDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfReferenceDescription() {
		if (listOfReferenceDescriptionEClass == null) {
			listOfReferenceDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(309);
		}
		return listOfReferenceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfReferenceDescription_ReferenceDescription() {
        return (EReference)getListOfReferenceDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfReferenceNode() {
		if (listOfReferenceNodeEClass == null) {
			listOfReferenceNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(310);
		}
		return listOfReferenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfReferenceNode_ReferenceNode() {
        return (EReference)getListOfReferenceNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfRegisteredServer() {
		if (listOfRegisteredServerEClass == null) {
			listOfRegisteredServerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(311);
		}
		return listOfRegisteredServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfRegisteredServer_RegisteredServer() {
        return (EReference)getListOfRegisteredServer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfRelativePathElement() {
		if (listOfRelativePathElementEClass == null) {
			listOfRelativePathElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(312);
		}
		return listOfRelativePathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfRelativePathElement_RelativePathElement() {
        return (EReference)getListOfRelativePathElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfRolePermissionType() {
		if (listOfRolePermissionTypeEClass == null) {
			listOfRolePermissionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(313);
		}
		return listOfRolePermissionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfRolePermissionType_RolePermissionType() {
        return (EReference)getListOfRolePermissionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSamplingIntervalDiagnosticsDataType() {
		if (listOfSamplingIntervalDiagnosticsDataTypeEClass == null) {
			listOfSamplingIntervalDiagnosticsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(314);
		}
		return listOfSamplingIntervalDiagnosticsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSamplingIntervalDiagnosticsDataType_SamplingIntervalDiagnosticsDataType() {
        return (EReference)getListOfSamplingIntervalDiagnosticsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSByte() {
		if (listOfSByteEClass == null) {
			listOfSByteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(315);
		}
		return listOfSByteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfSByte_SByte() {
        return (EAttribute)getListOfSByte().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSemanticChangeStructureDataType() {
		if (listOfSemanticChangeStructureDataTypeEClass == null) {
			listOfSemanticChangeStructureDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(316);
		}
		return listOfSemanticChangeStructureDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSemanticChangeStructureDataType_SemanticChangeStructureDataType() {
        return (EReference)getListOfSemanticChangeStructureDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfServerOnNetwork() {
		if (listOfServerOnNetworkEClass == null) {
			listOfServerOnNetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(317);
		}
		return listOfServerOnNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfServerOnNetwork_ServerOnNetwork() {
        return (EReference)getListOfServerOnNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSessionDiagnosticsDataType() {
		if (listOfSessionDiagnosticsDataTypeEClass == null) {
			listOfSessionDiagnosticsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(318);
		}
		return listOfSessionDiagnosticsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSessionDiagnosticsDataType_SessionDiagnosticsDataType() {
        return (EReference)getListOfSessionDiagnosticsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSessionSecurityDiagnosticsDataType() {
		if (listOfSessionSecurityDiagnosticsDataTypeEClass == null) {
			listOfSessionSecurityDiagnosticsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(319);
		}
		return listOfSessionSecurityDiagnosticsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSessionSecurityDiagnosticsDataType_SessionSecurityDiagnosticsDataType() {
        return (EReference)getListOfSessionSecurityDiagnosticsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSignedSoftwareCertificate() {
		if (listOfSignedSoftwareCertificateEClass == null) {
			listOfSignedSoftwareCertificateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(320);
		}
		return listOfSignedSoftwareCertificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSignedSoftwareCertificate_SignedSoftwareCertificate() {
        return (EReference)getListOfSignedSoftwareCertificate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSimpleAttributeOperand() {
		if (listOfSimpleAttributeOperandEClass == null) {
			listOfSimpleAttributeOperandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(321);
		}
		return listOfSimpleAttributeOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSimpleAttributeOperand_SimpleAttributeOperand() {
        return (EReference)getListOfSimpleAttributeOperand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSimpleTypeDescription() {
		if (listOfSimpleTypeDescriptionEClass == null) {
			listOfSimpleTypeDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(322);
		}
		return listOfSimpleTypeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSimpleTypeDescription_SimpleTypeDescription() {
        return (EReference)getListOfSimpleTypeDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfStatusCode() {
		if (listOfStatusCodeEClass == null) {
			listOfStatusCodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(323);
		}
		return listOfStatusCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfStatusCode_StatusCode() {
        return (EReference)getListOfStatusCode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfStatusResult() {
		if (listOfStatusResultEClass == null) {
			listOfStatusResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(324);
		}
		return listOfStatusResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfStatusResult_StatusResult() {
        return (EReference)getListOfStatusResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfString() {
		if (listOfStringEClass == null) {
			listOfStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(325);
		}
		return listOfStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfString_String() {
        return (EAttribute)getListOfString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfStructureDefinition() {
		if (listOfStructureDefinitionEClass == null) {
			listOfStructureDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(326);
		}
		return listOfStructureDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfStructureDefinition_StructureDefinition() {
        return (EReference)getListOfStructureDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfStructureDescription() {
		if (listOfStructureDescriptionEClass == null) {
			listOfStructureDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(327);
		}
		return listOfStructureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfStructureDescription_StructureDescription() {
        return (EReference)getListOfStructureDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfStructureField() {
		if (listOfStructureFieldEClass == null) {
			listOfStructureFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(328);
		}
		return listOfStructureFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfStructureField_StructureField() {
        return (EReference)getListOfStructureField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSubscribedDataSetDataType() {
		if (listOfSubscribedDataSetDataTypeEClass == null) {
			listOfSubscribedDataSetDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(329);
		}
		return listOfSubscribedDataSetDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSubscribedDataSetDataType_SubscribedDataSetDataType() {
        return (EReference)getListOfSubscribedDataSetDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSubscribedDataSetMirrorDataType() {
		if (listOfSubscribedDataSetMirrorDataTypeEClass == null) {
			listOfSubscribedDataSetMirrorDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(330);
		}
		return listOfSubscribedDataSetMirrorDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSubscribedDataSetMirrorDataType_SubscribedDataSetMirrorDataType() {
        return (EReference)getListOfSubscribedDataSetMirrorDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSubscriptionAcknowledgement() {
		if (listOfSubscriptionAcknowledgementEClass == null) {
			listOfSubscriptionAcknowledgementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(331);
		}
		return listOfSubscriptionAcknowledgementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSubscriptionAcknowledgement_SubscriptionAcknowledgement() {
        return (EReference)getListOfSubscriptionAcknowledgement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfSubscriptionDiagnosticsDataType() {
		if (listOfSubscriptionDiagnosticsDataTypeEClass == null) {
			listOfSubscriptionDiagnosticsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(332);
		}
		return listOfSubscriptionDiagnosticsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfSubscriptionDiagnosticsDataType_SubscriptionDiagnosticsDataType() {
        return (EReference)getListOfSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfTargetVariablesDataType() {
		if (listOfTargetVariablesDataTypeEClass == null) {
			listOfTargetVariablesDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(333);
		}
		return listOfTargetVariablesDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfTargetVariablesDataType_TargetVariablesDataType() {
        return (EReference)getListOfTargetVariablesDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfThreeDCartesianCoordinates() {
		if (listOfThreeDCartesianCoordinatesEClass == null) {
			listOfThreeDCartesianCoordinatesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(334);
		}
		return listOfThreeDCartesianCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfThreeDCartesianCoordinates_ThreeDCartesianCoordinates() {
        return (EReference)getListOfThreeDCartesianCoordinates().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfThreeDFrame() {
		if (listOfThreeDFrameEClass == null) {
			listOfThreeDFrameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(335);
		}
		return listOfThreeDFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfThreeDFrame_ThreeDFrame() {
        return (EReference)getListOfThreeDFrame().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfThreeDOrientation() {
		if (listOfThreeDOrientationEClass == null) {
			listOfThreeDOrientationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(336);
		}
		return listOfThreeDOrientationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfThreeDOrientation_ThreeDOrientation() {
        return (EReference)getListOfThreeDOrientation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfThreeDVector() {
		if (listOfThreeDVectorEClass == null) {
			listOfThreeDVectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(337);
		}
		return listOfThreeDVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfThreeDVector_ThreeDVector() {
        return (EReference)getListOfThreeDVector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfTimeZoneDataType() {
		if (listOfTimeZoneDataTypeEClass == null) {
			listOfTimeZoneDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(338);
		}
		return listOfTimeZoneDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfTimeZoneDataType_TimeZoneDataType() {
        return (EReference)getListOfTimeZoneDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfTransferResult() {
		if (listOfTransferResultEClass == null) {
			listOfTransferResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(339);
		}
		return listOfTransferResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfTransferResult_TransferResult() {
        return (EReference)getListOfTransferResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfTrustListDataType() {
		if (listOfTrustListDataTypeEClass == null) {
			listOfTrustListDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(340);
		}
		return listOfTrustListDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfTrustListDataType_TrustListDataType() {
        return (EReference)getListOfTrustListDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUABinaryFileDataType() {
		if (listOfUABinaryFileDataTypeEClass == null) {
			listOfUABinaryFileDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(341);
		}
		return listOfUABinaryFileDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfUABinaryFileDataType_UABinaryFileDataType() {
        return (EReference)getListOfUABinaryFileDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUadpDataSetMessageContentMask() {
		if (listOfUadpDataSetMessageContentMaskEClass == null) {
			listOfUadpDataSetMessageContentMaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(342);
		}
		return listOfUadpDataSetMessageContentMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfUadpDataSetMessageContentMask_UadpDataSetMessageContentMask() {
        return (EAttribute)getListOfUadpDataSetMessageContentMask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUadpDataSetReaderMessageDataType() {
		if (listOfUadpDataSetReaderMessageDataTypeEClass == null) {
			listOfUadpDataSetReaderMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(343);
		}
		return listOfUadpDataSetReaderMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfUadpDataSetReaderMessageDataType_UadpDataSetReaderMessageDataType() {
        return (EReference)getListOfUadpDataSetReaderMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUadpDataSetWriterMessageDataType() {
		if (listOfUadpDataSetWriterMessageDataTypeEClass == null) {
			listOfUadpDataSetWriterMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(344);
		}
		return listOfUadpDataSetWriterMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfUadpDataSetWriterMessageDataType_UadpDataSetWriterMessageDataType() {
        return (EReference)getListOfUadpDataSetWriterMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUadpNetworkMessageContentMask() {
		if (listOfUadpNetworkMessageContentMaskEClass == null) {
			listOfUadpNetworkMessageContentMaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(345);
		}
		return listOfUadpNetworkMessageContentMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfUadpNetworkMessageContentMask_UadpNetworkMessageContentMask() {
        return (EAttribute)getListOfUadpNetworkMessageContentMask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUadpWriterGroupMessageDataType() {
		if (listOfUadpWriterGroupMessageDataTypeEClass == null) {
			listOfUadpWriterGroupMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(346);
		}
		return listOfUadpWriterGroupMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfUadpWriterGroupMessageDataType_UadpWriterGroupMessageDataType() {
        return (EReference)getListOfUadpWriterGroupMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUInt16() {
		if (listOfUInt16EClass == null) {
			listOfUInt16EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(347);
		}
		return listOfUInt16EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfUInt16_UInt16() {
        return (EAttribute)getListOfUInt16().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUInt32() {
		if (listOfUInt32EClass == null) {
			listOfUInt32EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(348);
		}
		return listOfUInt32EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfUInt32_UInt32() {
        return (EAttribute)getListOfUInt32().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUInt64() {
		if (listOfUInt64EClass == null) {
			listOfUInt64EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(349);
		}
		return listOfUInt64EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfUInt64_UInt64() {
        return (EAttribute)getListOfUInt64().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUnion() {
		if (listOfUnionEClass == null) {
			listOfUnionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(350);
		}
		return listOfUnionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfUnion_Union() {
        return (EReference)getListOfUnion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfUserTokenPolicy() {
		if (listOfUserTokenPolicyEClass == null) {
			listOfUserTokenPolicyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(351);
		}
		return listOfUserTokenPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfUserTokenPolicy_UserTokenPolicy() {
        return (EReference)getListOfUserTokenPolicy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfVariant() {
		if (listOfVariantEClass == null) {
			listOfVariantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(352);
		}
		return listOfVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfVariant_Variant() {
        return (EReference)getListOfVariant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfVector() {
		if (listOfVectorEClass == null) {
			listOfVectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(353);
		}
		return listOfVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfVector_Vector() {
        return (EReference)getListOfVector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfWriterGroupDataType() {
		if (listOfWriterGroupDataTypeEClass == null) {
			listOfWriterGroupDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(354);
		}
		return listOfWriterGroupDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfWriterGroupDataType_WriterGroupDataType() {
        return (EReference)getListOfWriterGroupDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfWriterGroupMessageDataType() {
		if (listOfWriterGroupMessageDataTypeEClass == null) {
			listOfWriterGroupMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(355);
		}
		return listOfWriterGroupMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfWriterGroupMessageDataType_WriterGroupMessageDataType() {
        return (EReference)getListOfWriterGroupMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfWriterGroupTransportDataType() {
		if (listOfWriterGroupTransportDataTypeEClass == null) {
			listOfWriterGroupTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(356);
		}
		return listOfWriterGroupTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfWriterGroupTransportDataType_WriterGroupTransportDataType() {
        return (EReference)getListOfWriterGroupTransportDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfWriteValue() {
		if (listOfWriteValueEClass == null) {
			listOfWriteValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(357);
		}
		return listOfWriteValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfWriteValue_WriteValue() {
        return (EReference)getListOfWriteValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfXmlElement() {
		if (listOfXmlElementEClass == null) {
			listOfXmlElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(358);
		}
		return listOfXmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfXmlElement_XmlElement() {
        return (EReference)getListOfXmlElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralOperand() {
		if (literalOperandEClass == null) {
			literalOperandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(359);
		}
		return literalOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralOperand_Value() {
        return (EReference)getLiteralOperand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalizedText() {
		if (localizedTextEClass == null) {
			localizedTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(360);
		}
		return localizedTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizedText_Locale() {
        return (EAttribute)getLocalizedText().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizedText_Text() {
        return (EAttribute)getLocalizedText().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMdnsDiscoveryConfiguration() {
		if (mdnsDiscoveryConfigurationEClass == null) {
			mdnsDiscoveryConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(361);
		}
		return mdnsDiscoveryConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMdnsDiscoveryConfiguration_MdnsServerName() {
        return (EAttribute)getMdnsDiscoveryConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMdnsDiscoveryConfiguration_ServerCapabilities() {
        return (EReference)getMdnsDiscoveryConfiguration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodAttributes() {
		if (methodAttributesEClass == null) {
			methodAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(364);
		}
		return methodAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodAttributes_Executable() {
        return (EAttribute)getMethodAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodAttributes_UserExecutable() {
        return (EAttribute)getMethodAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodNode() {
		if (methodNodeEClass == null) {
			methodNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(365);
		}
		return methodNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodNode_Executable() {
        return (EAttribute)getMethodNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodNode_UserExecutable() {
        return (EAttribute)getMethodNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelChangeStructureDataType() {
		if (modelChangeStructureDataTypeEClass == null) {
			modelChangeStructureDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(366);
		}
		return modelChangeStructureDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelChangeStructureDataType_Affected() {
        return (EReference)getModelChangeStructureDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelChangeStructureDataType_AffectedType() {
        return (EReference)getModelChangeStructureDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelChangeStructureDataType_Verb() {
        return (EAttribute)getModelChangeStructureDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModificationInfo() {
		if (modificationInfoEClass == null) {
			modificationInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(369);
		}
		return modificationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationInfo_ModificationTime() {
        return (EAttribute)getModificationInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationInfo_UpdateType() {
        return (EAttribute)getModificationInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationInfo_UserName() {
        return (EAttribute)getModificationInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyMonitoredItemsRequest() {
		if (modifyMonitoredItemsRequestEClass == null) {
			modifyMonitoredItemsRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(370);
		}
		return modifyMonitoredItemsRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyMonitoredItemsRequest_RequestHeader() {
        return (EReference)getModifyMonitoredItemsRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyMonitoredItemsRequest_SubscriptionId() {
        return (EAttribute)getModifyMonitoredItemsRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyMonitoredItemsRequest_TimestampsToReturn() {
        return (EAttribute)getModifyMonitoredItemsRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyMonitoredItemsRequest_ItemsToModify() {
        return (EReference)getModifyMonitoredItemsRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyMonitoredItemsResponse() {
		if (modifyMonitoredItemsResponseEClass == null) {
			modifyMonitoredItemsResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(371);
		}
		return modifyMonitoredItemsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyMonitoredItemsResponse_ResponseHeader() {
        return (EReference)getModifyMonitoredItemsResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyMonitoredItemsResponse_Results() {
        return (EReference)getModifyMonitoredItemsResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyMonitoredItemsResponse_DiagnosticInfos() {
        return (EReference)getModifyMonitoredItemsResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifySubscriptionRequest() {
		if (modifySubscriptionRequestEClass == null) {
			modifySubscriptionRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(372);
		}
		return modifySubscriptionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifySubscriptionRequest_RequestHeader() {
        return (EReference)getModifySubscriptionRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifySubscriptionRequest_SubscriptionId() {
        return (EAttribute)getModifySubscriptionRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifySubscriptionRequest_RequestedPublishingInterval() {
        return (EAttribute)getModifySubscriptionRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifySubscriptionRequest_RequestedLifetimeCount() {
        return (EAttribute)getModifySubscriptionRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifySubscriptionRequest_RequestedMaxKeepAliveCount() {
        return (EAttribute)getModifySubscriptionRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifySubscriptionRequest_MaxNotificationsPerPublish() {
        return (EAttribute)getModifySubscriptionRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifySubscriptionRequest_Priority() {
        return (EAttribute)getModifySubscriptionRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifySubscriptionResponse() {
		if (modifySubscriptionResponseEClass == null) {
			modifySubscriptionResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(373);
		}
		return modifySubscriptionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifySubscriptionResponse_ResponseHeader() {
        return (EReference)getModifySubscriptionResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifySubscriptionResponse_RevisedPublishingInterval() {
        return (EAttribute)getModifySubscriptionResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifySubscriptionResponse_RevisedLifetimeCount() {
        return (EAttribute)getModifySubscriptionResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifySubscriptionResponse_RevisedMaxKeepAliveCount() {
        return (EAttribute)getModifySubscriptionResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoredItemCreateRequest() {
		if (monitoredItemCreateRequestEClass == null) {
			monitoredItemCreateRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(374);
		}
		return monitoredItemCreateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredItemCreateRequest_ItemToMonitor() {
        return (EReference)getMonitoredItemCreateRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredItemCreateRequest_MonitoringMode() {
        return (EAttribute)getMonitoredItemCreateRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredItemCreateRequest_RequestedParameters() {
        return (EReference)getMonitoredItemCreateRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoredItemCreateResult() {
		if (monitoredItemCreateResultEClass == null) {
			monitoredItemCreateResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(375);
		}
		return monitoredItemCreateResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredItemCreateResult_StatusCode() {
        return (EReference)getMonitoredItemCreateResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredItemCreateResult_MonitoredItemId() {
        return (EAttribute)getMonitoredItemCreateResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredItemCreateResult_RevisedSamplingInterval() {
        return (EAttribute)getMonitoredItemCreateResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredItemCreateResult_RevisedQueueSize() {
        return (EAttribute)getMonitoredItemCreateResult().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredItemCreateResult_FilterResult() {
        return (EReference)getMonitoredItemCreateResult().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoredItemModifyRequest() {
		if (monitoredItemModifyRequestEClass == null) {
			monitoredItemModifyRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(376);
		}
		return monitoredItemModifyRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredItemModifyRequest_MonitoredItemId() {
        return (EAttribute)getMonitoredItemModifyRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredItemModifyRequest_RequestedParameters() {
        return (EReference)getMonitoredItemModifyRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoredItemModifyResult() {
		if (monitoredItemModifyResultEClass == null) {
			monitoredItemModifyResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(377);
		}
		return monitoredItemModifyResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredItemModifyResult_StatusCode() {
        return (EReference)getMonitoredItemModifyResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredItemModifyResult_RevisedSamplingInterval() {
        return (EAttribute)getMonitoredItemModifyResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredItemModifyResult_RevisedQueueSize() {
        return (EAttribute)getMonitoredItemModifyResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredItemModifyResult_FilterResult() {
        return (EReference)getMonitoredItemModifyResult().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoredItemNotification() {
		if (monitoredItemNotificationEClass == null) {
			monitoredItemNotificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(378);
		}
		return monitoredItemNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredItemNotification_ClientHandle() {
        return (EAttribute)getMonitoredItemNotification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredItemNotification_Value() {
        return (EReference)getMonitoredItemNotification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoringFilter() {
		if (monitoringFilterEClass == null) {
			monitoringFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(379);
		}
		return monitoringFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoringFilterResult() {
		if (monitoringFilterResultEClass == null) {
			monitoringFilterResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(380);
		}
		return monitoringFilterResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoringParameters() {
		if (monitoringParametersEClass == null) {
			monitoringParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(383);
		}
		return monitoringParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoringParameters_ClientHandle() {
        return (EAttribute)getMonitoringParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoringParameters_SamplingInterval() {
        return (EAttribute)getMonitoringParameters().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoringParameters_Filter() {
        return (EReference)getMonitoringParameters().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoringParameters_QueueSize() {
        return (EAttribute)getMonitoringParameters().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoringParameters_DiscardOldest() {
        return (EAttribute)getMonitoringParameters().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkAddressDataType() {
		if (networkAddressDataTypeEClass == null) {
			networkAddressDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(384);
		}
		return networkAddressDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkAddressDataType_NetworkInterface() {
        return (EAttribute)getNetworkAddressDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkAddressUrlDataType() {
		if (networkAddressUrlDataTypeEClass == null) {
			networkAddressUrlDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(385);
		}
		return networkAddressUrlDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkAddressUrlDataType_Url() {
        return (EAttribute)getNetworkAddressUrlDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkGroupDataType() {
		if (networkGroupDataTypeEClass == null) {
			networkGroupDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(386);
		}
		return networkGroupDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkGroupDataType_ServerUri() {
        return (EAttribute)getNetworkGroupDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkGroupDataType_NetworkPaths() {
        return (EReference)getNetworkGroupDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		if (nodeEClass == null) {
			nodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(387);
		}
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_NodeId() {
        return (EReference)getNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_NodeClass() {
        return (EAttribute)getNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_BrowseName() {
        return (EReference)getNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_DisplayName() {
        return (EReference)getNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Description() {
        return (EReference)getNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_WriteMask() {
        return (EAttribute)getNode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_UserWriteMask() {
        return (EAttribute)getNode().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_RolePermissions() {
        return (EReference)getNode().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_UserRolePermissions() {
        return (EReference)getNode().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_AccessRestrictions() {
        return (EAttribute)getNode().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_References() {
        return (EReference)getNode().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeAttributes() {
		if (nodeAttributesEClass == null) {
			nodeAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(388);
		}
		return nodeAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeAttributes_SpecifiedAttributes() {
        return (EAttribute)getNodeAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeAttributes_DisplayName() {
        return (EReference)getNodeAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeAttributes_Description() {
        return (EReference)getNodeAttributes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeAttributes_WriteMask() {
        return (EAttribute)getNodeAttributes().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeAttributes_UserWriteMask() {
        return (EAttribute)getNodeAttributes().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeId() {
		if (nodeIdEClass == null) {
			nodeIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(393);
		}
		return nodeIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeId_Identifier() {
        return (EAttribute)getNodeId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeReference() {
		if (nodeReferenceEClass == null) {
			nodeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(394);
		}
		return nodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeReference_NodeId() {
        return (EReference)getNodeReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeReference_ReferenceTypeId() {
        return (EReference)getNodeReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeReference_IsForward() {
        return (EAttribute)getNodeReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeReference_ReferencedNodeIds() {
        return (EReference)getNodeReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeTypeDescription() {
		if (nodeTypeDescriptionEClass == null) {
			nodeTypeDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(395);
		}
		return nodeTypeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeTypeDescription_TypeDefinitionNode() {
        return (EReference)getNodeTypeDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeTypeDescription_IncludeSubTypes() {
        return (EAttribute)getNodeTypeDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeTypeDescription_DataToReturn() {
        return (EReference)getNodeTypeDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationData() {
		if (notificationDataEClass == null) {
			notificationDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(396);
		}
		return notificationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationMessage() {
		if (notificationMessageEClass == null) {
			notificationMessageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(397);
		}
		return notificationMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationMessage_SequenceNumber() {
        return (EAttribute)getNotificationMessage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationMessage_PublishTime() {
        return (EAttribute)getNotificationMessage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationMessage_NotificationData() {
        return (EReference)getNotificationMessage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAttributes() {
		if (objectAttributesEClass == null) {
			objectAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(398);
		}
		return objectAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectAttributes_EventNotifier() {
        return (EAttribute)getObjectAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNode() {
		if (objectNodeEClass == null) {
			objectNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(399);
		}
		return objectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_EventNotifier() {
        return (EAttribute)getObjectNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeAttributes() {
		if (objectTypeAttributesEClass == null) {
			objectTypeAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(400);
		}
		return objectTypeAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeAttributes_IsAbstract() {
        return (EAttribute)getObjectTypeAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeNode() {
		if (objectTypeNodeEClass == null) {
			objectTypeNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(401);
		}
		return objectTypeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeNode_IsAbstract() {
        return (EAttribute)getObjectTypeNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenSecureChannelRequest() {
		if (openSecureChannelRequestEClass == null) {
			openSecureChannelRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(404);
		}
		return openSecureChannelRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenSecureChannelRequest_RequestHeader() {
        return (EReference)getOpenSecureChannelRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenSecureChannelRequest_ClientProtocolVersion() {
        return (EAttribute)getOpenSecureChannelRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenSecureChannelRequest_RequestType() {
        return (EAttribute)getOpenSecureChannelRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenSecureChannelRequest_SecurityMode() {
        return (EAttribute)getOpenSecureChannelRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenSecureChannelRequest_ClientNonce() {
        return (EAttribute)getOpenSecureChannelRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenSecureChannelRequest_RequestedLifetime() {
        return (EAttribute)getOpenSecureChannelRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenSecureChannelResponse() {
		if (openSecureChannelResponseEClass == null) {
			openSecureChannelResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(405);
		}
		return openSecureChannelResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenSecureChannelResponse_ResponseHeader() {
        return (EReference)getOpenSecureChannelResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenSecureChannelResponse_ServerProtocolVersion() {
        return (EAttribute)getOpenSecureChannelResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenSecureChannelResponse_SecurityToken() {
        return (EReference)getOpenSecureChannelResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenSecureChannelResponse_ServerNonce() {
        return (EAttribute)getOpenSecureChannelResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionSet() {
		if (optionSetEClass == null) {
			optionSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(406);
		}
		return optionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionSet_Value() {
        return (EAttribute)getOptionSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionSet_ValidBits() {
        return (EAttribute)getOptionSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrientation() {
		if (orientationEClass == null) {
			orientationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(407);
		}
		return orientationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParsingResult() {
		if (parsingResultEClass == null) {
			parsingResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(410);
		}
		return parsingResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParsingResult_StatusCode() {
        return (EReference)getParsingResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParsingResult_DataStatusCodes() {
        return (EReference)getParsingResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParsingResult_DataDiagnosticInfos() {
        return (EReference)getParsingResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramDiagnostic2DataType() {
		if (programDiagnostic2DataTypeEClass == null) {
			programDiagnostic2DataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(415);
		}
		return programDiagnostic2DataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnostic2DataType_CreateSessionId() {
        return (EReference)getProgramDiagnostic2DataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDiagnostic2DataType_CreateClientName() {
        return (EAttribute)getProgramDiagnostic2DataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDiagnostic2DataType_InvocationCreationTime() {
        return (EAttribute)getProgramDiagnostic2DataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDiagnostic2DataType_LastTransitionTime() {
        return (EAttribute)getProgramDiagnostic2DataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDiagnostic2DataType_LastMethodCall() {
        return (EAttribute)getProgramDiagnostic2DataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnostic2DataType_LastMethodSessionId() {
        return (EReference)getProgramDiagnostic2DataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnostic2DataType_LastMethodInputArguments() {
        return (EReference)getProgramDiagnostic2DataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnostic2DataType_LastMethodOutputArguments() {
        return (EReference)getProgramDiagnostic2DataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnostic2DataType_LastMethodInputValues() {
        return (EReference)getProgramDiagnostic2DataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnostic2DataType_LastMethodOutputValues() {
        return (EReference)getProgramDiagnostic2DataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDiagnostic2DataType_LastMethodCallTime() {
        return (EAttribute)getProgramDiagnostic2DataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnostic2DataType_LastMethodReturnStatus() {
        return (EReference)getProgramDiagnostic2DataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramDiagnosticDataType() {
		if (programDiagnosticDataTypeEClass == null) {
			programDiagnosticDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(416);
		}
		return programDiagnosticDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnosticDataType_CreateSessionId() {
        return (EReference)getProgramDiagnosticDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDiagnosticDataType_CreateClientName() {
        return (EAttribute)getProgramDiagnosticDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDiagnosticDataType_InvocationCreationTime() {
        return (EAttribute)getProgramDiagnosticDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDiagnosticDataType_LastTransitionTime() {
        return (EAttribute)getProgramDiagnosticDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDiagnosticDataType_LastMethodCall() {
        return (EAttribute)getProgramDiagnosticDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnosticDataType_LastMethodSessionId() {
        return (EReference)getProgramDiagnosticDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnosticDataType_LastMethodInputArguments() {
        return (EReference)getProgramDiagnosticDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnosticDataType_LastMethodOutputArguments() {
        return (EReference)getProgramDiagnosticDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDiagnosticDataType_LastMethodCallTime() {
        return (EAttribute)getProgramDiagnosticDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDiagnosticDataType_LastMethodReturnStatus() {
        return (EReference)getProgramDiagnosticDataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishedDataItemsDataType() {
		if (publishedDataItemsDataTypeEClass == null) {
			publishedDataItemsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(417);
		}
		return publishedDataItemsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedDataItemsDataType_PublishedData() {
        return (EReference)getPublishedDataItemsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishedDataSetDataType() {
		if (publishedDataSetDataTypeEClass == null) {
			publishedDataSetDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(418);
		}
		return publishedDataSetDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishedDataSetDataType_Name() {
        return (EAttribute)getPublishedDataSetDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedDataSetDataType_DataSetFolder() {
        return (EReference)getPublishedDataSetDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedDataSetDataType_DataSetMetaData() {
        return (EReference)getPublishedDataSetDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedDataSetDataType_ExtensionFields() {
        return (EReference)getPublishedDataSetDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedDataSetDataType_DataSetSource() {
        return (EReference)getPublishedDataSetDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishedDataSetSourceDataType() {
		if (publishedDataSetSourceDataTypeEClass == null) {
			publishedDataSetSourceDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(419);
		}
		return publishedDataSetSourceDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishedEventsDataType() {
		if (publishedEventsDataTypeEClass == null) {
			publishedEventsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(420);
		}
		return publishedEventsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedEventsDataType_EventNotifier() {
        return (EReference)getPublishedEventsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedEventsDataType_SelectedFields() {
        return (EReference)getPublishedEventsDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedEventsDataType_Filter() {
        return (EReference)getPublishedEventsDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishedVariableDataType() {
		if (publishedVariableDataTypeEClass == null) {
			publishedVariableDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(421);
		}
		return publishedVariableDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedVariableDataType_PublishedVariable() {
        return (EReference)getPublishedVariableDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishedVariableDataType_AttributeId() {
        return (EAttribute)getPublishedVariableDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishedVariableDataType_SamplingIntervalHint() {
        return (EAttribute)getPublishedVariableDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishedVariableDataType_DeadbandType() {
        return (EAttribute)getPublishedVariableDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishedVariableDataType_DeadbandValue() {
        return (EAttribute)getPublishedVariableDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishedVariableDataType_IndexRange() {
        return (EAttribute)getPublishedVariableDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedVariableDataType_SubstituteValue() {
        return (EReference)getPublishedVariableDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishedVariableDataType_MetaDataProperties() {
        return (EReference)getPublishedVariableDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishRequest() {
		if (publishRequestEClass == null) {
			publishRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(422);
		}
		return publishRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishRequest_RequestHeader() {
        return (EReference)getPublishRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishRequest_SubscriptionAcknowledgements() {
        return (EReference)getPublishRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishResponse() {
		if (publishResponseEClass == null) {
			publishResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(423);
		}
		return publishResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishResponse_ResponseHeader() {
        return (EReference)getPublishResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishResponse_SubscriptionId() {
        return (EAttribute)getPublishResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishResponse_AvailableSequenceNumbers() {
        return (EReference)getPublishResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishResponse_MoreNotifications() {
        return (EAttribute)getPublishResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishResponse_NotificationMessage() {
        return (EReference)getPublishResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishResponse_Results() {
        return (EReference)getPublishResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishResponse_DiagnosticInfos() {
        return (EReference)getPublishResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPubSubConfigurationDataType() {
		if (pubSubConfigurationDataTypeEClass == null) {
			pubSubConfigurationDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(424);
		}
		return pubSubConfigurationDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubSubConfigurationDataType_PublishedDataSets() {
        return (EReference)getPubSubConfigurationDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubSubConfigurationDataType_Connections() {
        return (EReference)getPubSubConfigurationDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPubSubConfigurationDataType_Enabled() {
        return (EAttribute)getPubSubConfigurationDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPubSubConnectionDataType() {
		if (pubSubConnectionDataTypeEClass == null) {
			pubSubConnectionDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(425);
		}
		return pubSubConnectionDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPubSubConnectionDataType_Name() {
        return (EAttribute)getPubSubConnectionDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPubSubConnectionDataType_Enabled() {
        return (EAttribute)getPubSubConnectionDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubSubConnectionDataType_PublisherId() {
        return (EReference)getPubSubConnectionDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPubSubConnectionDataType_TransportProfileUri() {
        return (EAttribute)getPubSubConnectionDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubSubConnectionDataType_Address() {
        return (EReference)getPubSubConnectionDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubSubConnectionDataType_ConnectionProperties() {
        return (EReference)getPubSubConnectionDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubSubConnectionDataType_TransportSettings() {
        return (EReference)getPubSubConnectionDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubSubConnectionDataType_WriterGroups() {
        return (EReference)getPubSubConnectionDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubSubConnectionDataType_ReaderGroups() {
        return (EReference)getPubSubConnectionDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPubSubGroupDataType() {
		if (pubSubGroupDataTypeEClass == null) {
			pubSubGroupDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(428);
		}
		return pubSubGroupDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPubSubGroupDataType_Name() {
        return (EAttribute)getPubSubGroupDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPubSubGroupDataType_Enabled() {
        return (EAttribute)getPubSubGroupDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPubSubGroupDataType_SecurityMode() {
        return (EAttribute)getPubSubGroupDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPubSubGroupDataType_SecurityGroupId() {
        return (EAttribute)getPubSubGroupDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubSubGroupDataType_SecurityKeyServices() {
        return (EReference)getPubSubGroupDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPubSubGroupDataType_MaxNetworkMessageSize() {
        return (EAttribute)getPubSubGroupDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubSubGroupDataType_GroupProperties() {
        return (EReference)getPubSubGroupDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedName() {
		if (qualifiedNameEClass == null) {
			qualifiedNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(431);
		}
		return qualifiedNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedName_NamespaceIndex() {
        return (EAttribute)getQualifiedName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedName_Name() {
        return (EAttribute)getQualifiedName().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryDataDescription() {
		if (queryDataDescriptionEClass == null) {
			queryDataDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(432);
		}
		return queryDataDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDataDescription_RelativePath() {
        return (EReference)getQueryDataDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryDataDescription_AttributeId() {
        return (EAttribute)getQueryDataDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryDataDescription_IndexRange() {
        return (EAttribute)getQueryDataDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryDataSet() {
		if (queryDataSetEClass == null) {
			queryDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(433);
		}
		return queryDataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDataSet_NodeId() {
        return (EReference)getQueryDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDataSet_TypeDefinitionNode() {
        return (EReference)getQueryDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDataSet_Values() {
        return (EReference)getQueryDataSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryFirstRequest() {
		if (queryFirstRequestEClass == null) {
			queryFirstRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(434);
		}
		return queryFirstRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryFirstRequest_RequestHeader() {
        return (EReference)getQueryFirstRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryFirstRequest_View() {
        return (EReference)getQueryFirstRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryFirstRequest_NodeTypes() {
        return (EReference)getQueryFirstRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryFirstRequest_Filter() {
        return (EReference)getQueryFirstRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFirstRequest_MaxDataSetsToReturn() {
        return (EAttribute)getQueryFirstRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFirstRequest_MaxReferencesToReturn() {
        return (EAttribute)getQueryFirstRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryFirstResponse() {
		if (queryFirstResponseEClass == null) {
			queryFirstResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(435);
		}
		return queryFirstResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryFirstResponse_ResponseHeader() {
        return (EReference)getQueryFirstResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryFirstResponse_QueryDataSets() {
        return (EReference)getQueryFirstResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFirstResponse_ContinuationPoint() {
        return (EAttribute)getQueryFirstResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryFirstResponse_ParsingResults() {
        return (EReference)getQueryFirstResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryFirstResponse_DiagnosticInfos() {
        return (EReference)getQueryFirstResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryFirstResponse_FilterResult() {
        return (EReference)getQueryFirstResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryNextRequest() {
		if (queryNextRequestEClass == null) {
			queryNextRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(436);
		}
		return queryNextRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryNextRequest_RequestHeader() {
        return (EReference)getQueryNextRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryNextRequest_ReleaseContinuationPoint() {
        return (EAttribute)getQueryNextRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryNextRequest_ContinuationPoint() {
        return (EAttribute)getQueryNextRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryNextResponse() {
		if (queryNextResponseEClass == null) {
			queryNextResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(437);
		}
		return queryNextResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryNextResponse_ResponseHeader() {
        return (EReference)getQueryNextResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryNextResponse_QueryDataSets() {
        return (EReference)getQueryNextResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryNextResponse_RevisedContinuationPoint() {
        return (EAttribute)getQueryNextResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRange() {
		if (rangeEClass == null) {
			rangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(438);
		}
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_Low() {
        return (EAttribute)getRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_High() {
        return (EAttribute)getRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationalNumber() {
		if (rationalNumberEClass == null) {
			rationalNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(439);
		}
		return rationalNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalNumber_Numerator() {
        return (EAttribute)getRationalNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalNumber_Denominator() {
        return (EAttribute)getRationalNumber().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadAnnotationDataDetails() {
		if (readAnnotationDataDetailsEClass == null) {
			readAnnotationDataDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(440);
		}
		return readAnnotationDataDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadAnnotationDataDetails_ReqTimes() {
        return (EReference)getReadAnnotationDataDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadAtTimeDetails() {
		if (readAtTimeDetailsEClass == null) {
			readAtTimeDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(441);
		}
		return readAtTimeDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadAtTimeDetails_ReqTimes() {
        return (EReference)getReadAtTimeDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadAtTimeDetails_UseSimpleBounds() {
        return (EAttribute)getReadAtTimeDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReaderGroupDataType() {
		if (readerGroupDataTypeEClass == null) {
			readerGroupDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(442);
		}
		return readerGroupDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReaderGroupDataType_TransportSettings() {
        return (EReference)getReaderGroupDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReaderGroupDataType_MessageSettings() {
        return (EReference)getReaderGroupDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReaderGroupDataType_DataSetReaders() {
        return (EReference)getReaderGroupDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReaderGroupMessageDataType() {
		if (readerGroupMessageDataTypeEClass == null) {
			readerGroupMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(443);
		}
		return readerGroupMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReaderGroupTransportDataType() {
		if (readerGroupTransportDataTypeEClass == null) {
			readerGroupTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(444);
		}
		return readerGroupTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadEventDetails() {
		if (readEventDetailsEClass == null) {
			readEventDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(445);
		}
		return readEventDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadEventDetails_NumValuesPerNode() {
        return (EAttribute)getReadEventDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadEventDetails_StartTime() {
        return (EAttribute)getReadEventDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadEventDetails_EndTime() {
        return (EAttribute)getReadEventDetails().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadEventDetails_Filter() {
        return (EReference)getReadEventDetails().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadProcessedDetails() {
		if (readProcessedDetailsEClass == null) {
			readProcessedDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(446);
		}
		return readProcessedDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadProcessedDetails_StartTime() {
        return (EAttribute)getReadProcessedDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadProcessedDetails_EndTime() {
        return (EAttribute)getReadProcessedDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadProcessedDetails_ProcessingInterval() {
        return (EAttribute)getReadProcessedDetails().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadProcessedDetails_AggregateType() {
        return (EReference)getReadProcessedDetails().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadProcessedDetails_AggregateConfiguration() {
        return (EReference)getReadProcessedDetails().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadRawModifiedDetails() {
		if (readRawModifiedDetailsEClass == null) {
			readRawModifiedDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(447);
		}
		return readRawModifiedDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadRawModifiedDetails_IsReadModified() {
        return (EAttribute)getReadRawModifiedDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadRawModifiedDetails_StartTime() {
        return (EAttribute)getReadRawModifiedDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadRawModifiedDetails_EndTime() {
        return (EAttribute)getReadRawModifiedDetails().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadRawModifiedDetails_NumValuesPerNode() {
        return (EAttribute)getReadRawModifiedDetails().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadRawModifiedDetails_ReturnBounds() {
        return (EAttribute)getReadRawModifiedDetails().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadRequest() {
		if (readRequestEClass == null) {
			readRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(448);
		}
		return readRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadRequest_RequestHeader() {
        return (EReference)getReadRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadRequest_MaxAge() {
        return (EAttribute)getReadRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadRequest_TimestampsToReturn() {
        return (EAttribute)getReadRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadRequest_NodesToRead() {
        return (EReference)getReadRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadResponse() {
		if (readResponseEClass == null) {
			readResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(449);
		}
		return readResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadResponse_ResponseHeader() {
        return (EReference)getReadResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadResponse_Results() {
        return (EReference)getReadResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadResponse_DiagnosticInfos() {
        return (EReference)getReadResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadValueId() {
		if (readValueIdEClass == null) {
			readValueIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(450);
		}
		return readValueIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadValueId_NodeId() {
        return (EReference)getReadValueId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadValueId_AttributeId() {
        return (EAttribute)getReadValueId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadValueId_IndexRange() {
        return (EAttribute)getReadValueId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadValueId_DataEncoding() {
        return (EReference)getReadValueId().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedundantServerDataType() {
		if (redundantServerDataTypeEClass == null) {
			redundantServerDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(453);
		}
		return redundantServerDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedundantServerDataType_ServerId() {
        return (EAttribute)getRedundantServerDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedundantServerDataType_ServiceLevel() {
        return (EAttribute)getRedundantServerDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedundantServerDataType_ServerState() {
        return (EAttribute)getRedundantServerDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceDescription() {
		if (referenceDescriptionEClass == null) {
			referenceDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(454);
		}
		return referenceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDescription_ReferenceTypeId() {
        return (EReference)getReferenceDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_IsForward() {
        return (EAttribute)getReferenceDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDescription_NodeId() {
        return (EReference)getReferenceDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDescription_BrowseName() {
        return (EReference)getReferenceDescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDescription_DisplayName() {
        return (EReference)getReferenceDescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_NodeClass() {
        return (EAttribute)getReferenceDescription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDescription_TypeDefinition() {
        return (EReference)getReferenceDescription().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceNode() {
		if (referenceNodeEClass == null) {
			referenceNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(455);
		}
		return referenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceNode_ReferenceTypeId() {
        return (EReference)getReferenceNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceNode_IsInverse() {
        return (EAttribute)getReferenceNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceNode_TargetId() {
        return (EReference)getReferenceNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceTypeAttributes() {
		if (referenceTypeAttributesEClass == null) {
			referenceTypeAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(456);
		}
		return referenceTypeAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceTypeAttributes_IsAbstract() {
        return (EAttribute)getReferenceTypeAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceTypeAttributes_Symmetric() {
        return (EAttribute)getReferenceTypeAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceTypeAttributes_InverseName() {
        return (EReference)getReferenceTypeAttributes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceTypeNode() {
		if (referenceTypeNodeEClass == null) {
			referenceTypeNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(457);
		}
		return referenceTypeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceTypeNode_IsAbstract() {
        return (EAttribute)getReferenceTypeNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceTypeNode_Symmetric() {
        return (EAttribute)getReferenceTypeNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceTypeNode_InverseName() {
        return (EReference)getReferenceTypeNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisteredServer() {
		if (registeredServerEClass == null) {
			registeredServerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(458);
		}
		return registeredServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredServer_ServerUri() {
        return (EAttribute)getRegisteredServer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredServer_ProductUri() {
        return (EAttribute)getRegisteredServer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisteredServer_ServerNames() {
        return (EReference)getRegisteredServer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredServer_ServerType() {
        return (EAttribute)getRegisteredServer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredServer_GatewayServerUri() {
        return (EAttribute)getRegisteredServer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisteredServer_DiscoveryUrls() {
        return (EReference)getRegisteredServer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredServer_SemaphoreFilePath() {
        return (EAttribute)getRegisteredServer().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredServer_IsOnline() {
        return (EAttribute)getRegisteredServer().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterNodesRequest() {
		if (registerNodesRequestEClass == null) {
			registerNodesRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(459);
		}
		return registerNodesRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterNodesRequest_RequestHeader() {
        return (EReference)getRegisterNodesRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterNodesRequest_NodesToRegister() {
        return (EReference)getRegisterNodesRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterNodesResponse() {
		if (registerNodesResponseEClass == null) {
			registerNodesResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(460);
		}
		return registerNodesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterNodesResponse_ResponseHeader() {
        return (EReference)getRegisterNodesResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterNodesResponse_RegisteredNodeIds() {
        return (EReference)getRegisterNodesResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterServer2Request() {
		if (registerServer2RequestEClass == null) {
			registerServer2RequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(461);
		}
		return registerServer2RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterServer2Request_RequestHeader() {
        return (EReference)getRegisterServer2Request().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterServer2Request_Server() {
        return (EReference)getRegisterServer2Request().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterServer2Request_DiscoveryConfiguration() {
        return (EReference)getRegisterServer2Request().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterServer2Response() {
		if (registerServer2ResponseEClass == null) {
			registerServer2ResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(462);
		}
		return registerServer2ResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterServer2Response_ResponseHeader() {
        return (EReference)getRegisterServer2Response().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterServer2Response_ConfigurationResults() {
        return (EReference)getRegisterServer2Response().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterServer2Response_DiagnosticInfos() {
        return (EReference)getRegisterServer2Response().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterServerRequest() {
		if (registerServerRequestEClass == null) {
			registerServerRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(463);
		}
		return registerServerRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterServerRequest_RequestHeader() {
        return (EReference)getRegisterServerRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterServerRequest_Server() {
        return (EReference)getRegisterServerRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterServerResponse() {
		if (registerServerResponseEClass == null) {
			registerServerResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(464);
		}
		return registerServerResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterServerResponse_ResponseHeader() {
        return (EReference)getRegisterServerResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativePath() {
		if (relativePathEClass == null) {
			relativePathEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(465);
		}
		return relativePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativePath_Elements() {
        return (EReference)getRelativePath().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativePathElement() {
		if (relativePathElementEClass == null) {
			relativePathElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(466);
		}
		return relativePathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativePathElement_ReferenceTypeId() {
        return (EReference)getRelativePathElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativePathElement_IsInverse() {
        return (EAttribute)getRelativePathElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativePathElement_IncludeSubtypes() {
        return (EAttribute)getRelativePathElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativePathElement_TargetName() {
        return (EReference)getRelativePathElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepublishRequest() {
		if (republishRequestEClass == null) {
			republishRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(467);
		}
		return republishRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepublishRequest_RequestHeader() {
        return (EReference)getRepublishRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepublishRequest_SubscriptionId() {
        return (EAttribute)getRepublishRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepublishRequest_RetransmitSequenceNumber() {
        return (EAttribute)getRepublishRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepublishResponse() {
		if (republishResponseEClass == null) {
			republishResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(468);
		}
		return republishResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepublishResponse_ResponseHeader() {
        return (EReference)getRepublishResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepublishResponse_NotificationMessage() {
        return (EReference)getRepublishResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestHeader() {
		if (requestHeaderEClass == null) {
			requestHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(469);
		}
		return requestHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestHeader_AuthenticationToken() {
        return (EReference)getRequestHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestHeader_Timestamp() {
        return (EAttribute)getRequestHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestHeader_RequestHandle() {
        return (EAttribute)getRequestHeader().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestHeader_ReturnDiagnostics() {
        return (EAttribute)getRequestHeader().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestHeader_AuditEntryId() {
        return (EAttribute)getRequestHeader().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestHeader_TimeoutHint() {
        return (EAttribute)getRequestHeader().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestHeader_AdditionalHeader() {
        return (EReference)getRequestHeader().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseHeader() {
		if (responseHeaderEClass == null) {
			responseHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(470);
		}
		return responseHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseHeader_Timestamp() {
        return (EAttribute)getResponseHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseHeader_RequestHandle() {
        return (EAttribute)getResponseHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeader_ServiceResult() {
        return (EReference)getResponseHeader().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeader_ServiceDiagnostics() {
        return (EReference)getResponseHeader().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeader_StringTable() {
        return (EReference)getResponseHeader().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeader_AdditionalHeader() {
        return (EReference)getResponseHeader().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolePermissionType() {
		if (rolePermissionTypeEClass == null) {
			rolePermissionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(471);
		}
		return rolePermissionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePermissionType_RoleId() {
        return (EReference)getRolePermissionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRolePermissionType_Permissions() {
        return (EAttribute)getRolePermissionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSamplingIntervalDiagnosticsDataType() {
		if (samplingIntervalDiagnosticsDataTypeEClass == null) {
			samplingIntervalDiagnosticsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(472);
		}
		return samplingIntervalDiagnosticsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSamplingIntervalDiagnosticsDataType_SamplingInterval() {
        return (EAttribute)getSamplingIntervalDiagnosticsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSamplingIntervalDiagnosticsDataType_MonitoredItemCount() {
        return (EAttribute)getSamplingIntervalDiagnosticsDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSamplingIntervalDiagnosticsDataType_MaxMonitoredItemCount() {
        return (EAttribute)getSamplingIntervalDiagnosticsDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSamplingIntervalDiagnosticsDataType_DisabledMonitoredItemCount() {
        return (EAttribute)getSamplingIntervalDiagnosticsDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticChangeStructureDataType() {
		if (semanticChangeStructureDataTypeEClass == null) {
			semanticChangeStructureDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(475);
		}
		return semanticChangeStructureDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticChangeStructureDataType_Affected() {
        return (EReference)getSemanticChangeStructureDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticChangeStructureDataType_AffectedType() {
        return (EReference)getSemanticChangeStructureDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerDiagnosticsSummaryDataType() {
		if (serverDiagnosticsSummaryDataTypeEClass == null) {
			serverDiagnosticsSummaryDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(476);
		}
		return serverDiagnosticsSummaryDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_ServerViewCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_CurrentSessionCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_CumulatedSessionCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_SecurityRejectedSessionCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_RejectedSessionCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_SessionTimeoutCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_SessionAbortCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_CurrentSubscriptionCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_CumulatedSubscriptionCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_PublishingIntervalCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_SecurityRejectedRequestsCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerDiagnosticsSummaryDataType_RejectedRequestsCount() {
        return (EAttribute)getServerDiagnosticsSummaryDataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerOnNetwork() {
		if (serverOnNetworkEClass == null) {
			serverOnNetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(477);
		}
		return serverOnNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerOnNetwork_RecordId() {
        return (EAttribute)getServerOnNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerOnNetwork_ServerName() {
        return (EAttribute)getServerOnNetwork().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerOnNetwork_DiscoveryUrl() {
        return (EAttribute)getServerOnNetwork().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerOnNetwork_ServerCapabilities() {
        return (EReference)getServerOnNetwork().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerStatusDataType() {
		if (serverStatusDataTypeEClass == null) {
			serverStatusDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(480);
		}
		return serverStatusDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerStatusDataType_StartTime() {
        return (EAttribute)getServerStatusDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerStatusDataType_CurrentTime() {
        return (EAttribute)getServerStatusDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerStatusDataType_State() {
        return (EAttribute)getServerStatusDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerStatusDataType_BuildInfo() {
        return (EReference)getServerStatusDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerStatusDataType_SecondsTillShutdown() {
        return (EAttribute)getServerStatusDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerStatusDataType_ShutdownReason() {
        return (EReference)getServerStatusDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCounterDataType() {
		if (serviceCounterDataTypeEClass == null) {
			serviceCounterDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(481);
		}
		return serviceCounterDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCounterDataType_TotalCount() {
        return (EAttribute)getServiceCounterDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCounterDataType_ErrorCount() {
        return (EAttribute)getServiceCounterDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFault() {
		if (serviceFaultEClass == null) {
			serviceFaultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(482);
		}
		return serviceFaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFault_ResponseHeader() {
        return (EReference)getServiceFault().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionDiagnosticsDataType() {
		if (sessionDiagnosticsDataTypeEClass == null) {
			sessionDiagnosticsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(483);
		}
		return sessionDiagnosticsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_SessionId() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_SessionName() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_ClientDescription() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_ServerUri() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_EndpointUrl() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_LocaleIds() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_ActualSessionTimeout() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_MaxResponseMessageSize() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_ClientConnectionTime() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_ClientLastContactTime() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_CurrentSubscriptionsCount() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_CurrentMonitoredItemsCount() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_CurrentPublishRequestsInQueue() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_TotalRequestCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionDiagnosticsDataType_UnauthorizedRequestCount() {
        return (EAttribute)getSessionDiagnosticsDataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_ReadCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_HistoryReadCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_WriteCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_HistoryUpdateCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_CallCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_CreateMonitoredItemsCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_ModifyMonitoredItemsCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_SetMonitoringModeCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_SetTriggeringCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_DeleteMonitoredItemsCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_CreateSubscriptionCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_ModifySubscriptionCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_SetPublishingModeCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_PublishCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_RepublishCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_TransferSubscriptionsCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_DeleteSubscriptionsCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_AddNodesCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_AddReferencesCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_DeleteNodesCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_DeleteReferencesCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_BrowseCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_BrowseNextCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_TranslateBrowsePathsToNodeIdsCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_QueryFirstCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_QueryNextCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_RegisterNodesCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionDiagnosticsDataType_UnregisterNodesCount() {
        return (EReference)getSessionDiagnosticsDataType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionlessInvokeRequestType() {
		if (sessionlessInvokeRequestTypeEClass == null) {
			sessionlessInvokeRequestTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(484);
		}
		return sessionlessInvokeRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionlessInvokeRequestType_UrisVersion() {
        return (EReference)getSessionlessInvokeRequestType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionlessInvokeRequestType_NamespaceUris() {
        return (EReference)getSessionlessInvokeRequestType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionlessInvokeRequestType_ServerUris() {
        return (EReference)getSessionlessInvokeRequestType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionlessInvokeRequestType_LocaleIds() {
        return (EReference)getSessionlessInvokeRequestType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionlessInvokeRequestType_ServiceId() {
        return (EAttribute)getSessionlessInvokeRequestType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionlessInvokeResponseType() {
		if (sessionlessInvokeResponseTypeEClass == null) {
			sessionlessInvokeResponseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(485);
		}
		return sessionlessInvokeResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionlessInvokeResponseType_NamespaceUris() {
        return (EReference)getSessionlessInvokeResponseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionlessInvokeResponseType_ServerUris() {
        return (EReference)getSessionlessInvokeResponseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionlessInvokeResponseType_ServiceId() {
        return (EAttribute)getSessionlessInvokeResponseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionSecurityDiagnosticsDataType() {
		if (sessionSecurityDiagnosticsDataTypeEClass == null) {
			sessionSecurityDiagnosticsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(486);
		}
		return sessionSecurityDiagnosticsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionSecurityDiagnosticsDataType_SessionId() {
        return (EReference)getSessionSecurityDiagnosticsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionSecurityDiagnosticsDataType_ClientUserIdOfSession() {
        return (EAttribute)getSessionSecurityDiagnosticsDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionSecurityDiagnosticsDataType_ClientUserIdHistory() {
        return (EReference)getSessionSecurityDiagnosticsDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionSecurityDiagnosticsDataType_AuthenticationMechanism() {
        return (EAttribute)getSessionSecurityDiagnosticsDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionSecurityDiagnosticsDataType_Encoding() {
        return (EAttribute)getSessionSecurityDiagnosticsDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionSecurityDiagnosticsDataType_TransportProtocol() {
        return (EAttribute)getSessionSecurityDiagnosticsDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionSecurityDiagnosticsDataType_SecurityMode() {
        return (EAttribute)getSessionSecurityDiagnosticsDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionSecurityDiagnosticsDataType_SecurityPolicyUri() {
        return (EAttribute)getSessionSecurityDiagnosticsDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionSecurityDiagnosticsDataType_ClientCertificate() {
        return (EAttribute)getSessionSecurityDiagnosticsDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetMonitoringModeRequest() {
		if (setMonitoringModeRequestEClass == null) {
			setMonitoringModeRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(487);
		}
		return setMonitoringModeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetMonitoringModeRequest_RequestHeader() {
        return (EReference)getSetMonitoringModeRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetMonitoringModeRequest_SubscriptionId() {
        return (EAttribute)getSetMonitoringModeRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetMonitoringModeRequest_MonitoringMode() {
        return (EAttribute)getSetMonitoringModeRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetMonitoringModeRequest_MonitoredItemIds() {
        return (EReference)getSetMonitoringModeRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetMonitoringModeResponse() {
		if (setMonitoringModeResponseEClass == null) {
			setMonitoringModeResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(488);
		}
		return setMonitoringModeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetMonitoringModeResponse_ResponseHeader() {
        return (EReference)getSetMonitoringModeResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetMonitoringModeResponse_Results() {
        return (EReference)getSetMonitoringModeResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetMonitoringModeResponse_DiagnosticInfos() {
        return (EReference)getSetMonitoringModeResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetPublishingModeRequest() {
		if (setPublishingModeRequestEClass == null) {
			setPublishingModeRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(489);
		}
		return setPublishingModeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetPublishingModeRequest_RequestHeader() {
        return (EReference)getSetPublishingModeRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetPublishingModeRequest_PublishingEnabled() {
        return (EAttribute)getSetPublishingModeRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetPublishingModeRequest_SubscriptionIds() {
        return (EReference)getSetPublishingModeRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetPublishingModeResponse() {
		if (setPublishingModeResponseEClass == null) {
			setPublishingModeResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(490);
		}
		return setPublishingModeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetPublishingModeResponse_ResponseHeader() {
        return (EReference)getSetPublishingModeResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetPublishingModeResponse_Results() {
        return (EReference)getSetPublishingModeResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetPublishingModeResponse_DiagnosticInfos() {
        return (EReference)getSetPublishingModeResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTriggeringRequest() {
		if (setTriggeringRequestEClass == null) {
			setTriggeringRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(491);
		}
		return setTriggeringRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTriggeringRequest_RequestHeader() {
        return (EReference)getSetTriggeringRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetTriggeringRequest_SubscriptionId() {
        return (EAttribute)getSetTriggeringRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetTriggeringRequest_TriggeringItemId() {
        return (EAttribute)getSetTriggeringRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTriggeringRequest_LinksToAdd() {
        return (EReference)getSetTriggeringRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTriggeringRequest_LinksToRemove() {
        return (EReference)getSetTriggeringRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTriggeringResponse() {
		if (setTriggeringResponseEClass == null) {
			setTriggeringResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(492);
		}
		return setTriggeringResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTriggeringResponse_ResponseHeader() {
        return (EReference)getSetTriggeringResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTriggeringResponse_AddResults() {
        return (EReference)getSetTriggeringResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTriggeringResponse_AddDiagnosticInfos() {
        return (EReference)getSetTriggeringResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTriggeringResponse_RemoveResults() {
        return (EReference)getSetTriggeringResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTriggeringResponse_RemoveDiagnosticInfos() {
        return (EReference)getSetTriggeringResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureData() {
		if (signatureDataEClass == null) {
			signatureDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(493);
		}
		return signatureDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureData_Algorithm() {
        return (EAttribute)getSignatureData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureData_Signature() {
        return (EAttribute)getSignatureData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignedSoftwareCertificate() {
		if (signedSoftwareCertificateEClass == null) {
			signedSoftwareCertificateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(494);
		}
		return signedSoftwareCertificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignedSoftwareCertificate_CertificateData() {
        return (EAttribute)getSignedSoftwareCertificate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignedSoftwareCertificate_Signature() {
        return (EAttribute)getSignedSoftwareCertificate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAttributeOperand() {
		if (simpleAttributeOperandEClass == null) {
			simpleAttributeOperandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(495);
		}
		return simpleAttributeOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleAttributeOperand_TypeDefinitionId() {
        return (EReference)getSimpleAttributeOperand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleAttributeOperand_BrowsePath() {
        return (EReference)getSimpleAttributeOperand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAttributeOperand_AttributeId() {
        return (EAttribute)getSimpleAttributeOperand().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAttributeOperand_IndexRange() {
        return (EAttribute)getSimpleAttributeOperand().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTypeDescription() {
		if (simpleTypeDescriptionEClass == null) {
			simpleTypeDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(496);
		}
		return simpleTypeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTypeDescription_BaseDataType() {
        return (EReference)getSimpleTypeDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeDescription_BuiltInType() {
        return (EAttribute)getSimpleTypeDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusChangeNotification() {
		if (statusChangeNotificationEClass == null) {
			statusChangeNotificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(497);
		}
		return statusChangeNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusChangeNotification_Status() {
        return (EReference)getStatusChangeNotification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusChangeNotification_DiagnosticInfo() {
        return (EReference)getStatusChangeNotification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusCode() {
		if (statusCodeEClass == null) {
			statusCodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(498);
		}
		return statusCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusCode_Code() {
        return (EAttribute)getStatusCode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusResult() {
		if (statusResultEClass == null) {
			statusResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(499);
		}
		return statusResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusResult_StatusCode() {
        return (EReference)getStatusResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusResult_DiagnosticInfo() {
        return (EReference)getStatusResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinition() {
		if (structureDefinitionEClass == null) {
			structureDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(500);
		}
		return structureDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_DefaultEncodingId() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_BaseDataType() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureDefinition_StructureType() {
        return (EAttribute)getStructureDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Fields() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDescription() {
		if (structureDescriptionEClass == null) {
			structureDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(501);
		}
		return structureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDescription_StructureDefinition() {
        return (EReference)getStructureDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureField() {
		if (structureFieldEClass == null) {
			structureFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(502);
		}
		return structureFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureField_Name() {
        return (EAttribute)getStructureField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureField_Description() {
        return (EReference)getStructureField().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureField_DataType() {
        return (EReference)getStructureField().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureField_ValueRank() {
        return (EAttribute)getStructureField().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureField_ArrayDimensions() {
        return (EReference)getStructureField().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureField_MaxStringLength() {
        return (EAttribute)getStructureField().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureField_IsOptional() {
        return (EAttribute)getStructureField().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscribedDataSetDataType() {
		if (subscribedDataSetDataTypeEClass == null) {
			subscribedDataSetDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(505);
		}
		return subscribedDataSetDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscribedDataSetMirrorDataType() {
		if (subscribedDataSetMirrorDataTypeEClass == null) {
			subscribedDataSetMirrorDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(506);
		}
		return subscribedDataSetMirrorDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribedDataSetMirrorDataType_ParentNodeName() {
        return (EAttribute)getSubscribedDataSetMirrorDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscribedDataSetMirrorDataType_RolePermissions() {
        return (EReference)getSubscribedDataSetMirrorDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriptionAcknowledgement() {
		if (subscriptionAcknowledgementEClass == null) {
			subscriptionAcknowledgementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(507);
		}
		return subscriptionAcknowledgementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionAcknowledgement_SubscriptionId() {
        return (EAttribute)getSubscriptionAcknowledgement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionAcknowledgement_SequenceNumber() {
        return (EAttribute)getSubscriptionAcknowledgement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriptionDiagnosticsDataType() {
		if (subscriptionDiagnosticsDataTypeEClass == null) {
			subscriptionDiagnosticsDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(508);
		}
		return subscriptionDiagnosticsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionDiagnosticsDataType_SessionId() {
        return (EReference)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_SubscriptionId() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_Priority() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_PublishingInterval() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_MaxKeepAliveCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_MaxLifetimeCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_MaxNotificationsPerPublish() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_PublishingEnabled() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_ModifyCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_EnableCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_DisableCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_RepublishRequestCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_RepublishMessageRequestCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_RepublishMessageCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_TransferRequestCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_TransferredToAltClientCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_TransferredToSameClientCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_PublishRequestCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_DataChangeNotificationsCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_EventNotificationsCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_NotificationsCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_LatePublishRequestCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_CurrentKeepAliveCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_CurrentLifetimeCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_UnacknowledgedMessageCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_DiscardedMessageCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_MonitoredItemCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_DisabledMonitoredItemCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_MonitoringQueueOverflowCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_NextSequenceNumber() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionDiagnosticsDataType_EventQueueOverFlowCount() {
        return (EAttribute)getSubscriptionDiagnosticsDataType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetVariablesDataType() {
		if (targetVariablesDataTypeEClass == null) {
			targetVariablesDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(509);
		}
		return targetVariablesDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetVariablesDataType_TargetVariables() {
        return (EReference)getTargetVariablesDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreeDCartesianCoordinates() {
		if (threeDCartesianCoordinatesEClass == null) {
			threeDCartesianCoordinatesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(510);
		}
		return threeDCartesianCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDCartesianCoordinates_X() {
        return (EAttribute)getThreeDCartesianCoordinates().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDCartesianCoordinates_Y() {
        return (EAttribute)getThreeDCartesianCoordinates().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDCartesianCoordinates_Z() {
        return (EAttribute)getThreeDCartesianCoordinates().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreeDFrame() {
		if (threeDFrameEClass == null) {
			threeDFrameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(511);
		}
		return threeDFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreeDFrame_CartesianCoordinates() {
        return (EReference)getThreeDFrame().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreeDFrame_Orientation() {
        return (EReference)getThreeDFrame().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreeDOrientation() {
		if (threeDOrientationEClass == null) {
			threeDOrientationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(512);
		}
		return threeDOrientationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDOrientation_A() {
        return (EAttribute)getThreeDOrientation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDOrientation_B() {
        return (EAttribute)getThreeDOrientation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDOrientation_C() {
        return (EAttribute)getThreeDOrientation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreeDVector() {
		if (threeDVectorEClass == null) {
			threeDVectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(513);
		}
		return threeDVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDVector_X() {
        return (EAttribute)getThreeDVector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDVector_Y() {
        return (EAttribute)getThreeDVector().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDVector_Z() {
        return (EAttribute)getThreeDVector().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeZoneDataType() {
		if (timeZoneDataTypeEClass == null) {
			timeZoneDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(516);
		}
		return timeZoneDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeZoneDataType_Offset() {
        return (EAttribute)getTimeZoneDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeZoneDataType_DaylightSavingInOffset() {
        return (EAttribute)getTimeZoneDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferResult() {
		if (transferResultEClass == null) {
			transferResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(517);
		}
		return transferResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferResult_StatusCode() {
        return (EReference)getTransferResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferResult_AvailableSequenceNumbers() {
        return (EReference)getTransferResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferSubscriptionsRequest() {
		if (transferSubscriptionsRequestEClass == null) {
			transferSubscriptionsRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(518);
		}
		return transferSubscriptionsRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferSubscriptionsRequest_RequestHeader() {
        return (EReference)getTransferSubscriptionsRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferSubscriptionsRequest_SubscriptionIds() {
        return (EReference)getTransferSubscriptionsRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransferSubscriptionsRequest_SendInitialValues() {
        return (EAttribute)getTransferSubscriptionsRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferSubscriptionsResponse() {
		if (transferSubscriptionsResponseEClass == null) {
			transferSubscriptionsResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(519);
		}
		return transferSubscriptionsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferSubscriptionsResponse_ResponseHeader() {
        return (EReference)getTransferSubscriptionsResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferSubscriptionsResponse_Results() {
        return (EReference)getTransferSubscriptionsResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferSubscriptionsResponse_DiagnosticInfos() {
        return (EReference)getTransferSubscriptionsResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslateBrowsePathsToNodeIdsRequest() {
		if (translateBrowsePathsToNodeIdsRequestEClass == null) {
			translateBrowsePathsToNodeIdsRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(520);
		}
		return translateBrowsePathsToNodeIdsRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslateBrowsePathsToNodeIdsRequest_RequestHeader() {
        return (EReference)getTranslateBrowsePathsToNodeIdsRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslateBrowsePathsToNodeIdsRequest_BrowsePaths() {
        return (EReference)getTranslateBrowsePathsToNodeIdsRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslateBrowsePathsToNodeIdsResponse() {
		if (translateBrowsePathsToNodeIdsResponseEClass == null) {
			translateBrowsePathsToNodeIdsResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(521);
		}
		return translateBrowsePathsToNodeIdsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslateBrowsePathsToNodeIdsResponse_ResponseHeader() {
        return (EReference)getTranslateBrowsePathsToNodeIdsResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslateBrowsePathsToNodeIdsResponse_Results() {
        return (EReference)getTranslateBrowsePathsToNodeIdsResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslateBrowsePathsToNodeIdsResponse_DiagnosticInfos() {
        return (EReference)getTranslateBrowsePathsToNodeIdsResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustListDataType() {
		if (trustListDataTypeEClass == null) {
			trustListDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(522);
		}
		return trustListDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrustListDataType_SpecifiedLists() {
        return (EAttribute)getTrustListDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustListDataType_TrustedCertificates() {
        return (EReference)getTrustListDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustListDataType_TrustedCrls() {
        return (EReference)getTrustListDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustListDataType_IssuerCertificates() {
        return (EReference)getTrustListDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustListDataType_IssuerCrls() {
        return (EReference)getTrustListDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeNode() {
		if (typeNodeEClass == null) {
			typeNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(525);
		}
		return typeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUABinaryFileDataType() {
		if (uaBinaryFileDataTypeEClass == null) {
			uaBinaryFileDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(526);
		}
		return uaBinaryFileDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUABinaryFileDataType_SchemaLocation() {
        return (EAttribute)getUABinaryFileDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUABinaryFileDataType_FileHeader() {
        return (EReference)getUABinaryFileDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUABinaryFileDataType_Body() {
        return (EReference)getUABinaryFileDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUadpDataSetReaderMessageDataType() {
		if (uadpDataSetReaderMessageDataTypeEClass == null) {
			uadpDataSetReaderMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(529);
		}
		return uadpDataSetReaderMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetReaderMessageDataType_GroupVersion() {
        return (EAttribute)getUadpDataSetReaderMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetReaderMessageDataType_NetworkMessageNumber() {
        return (EAttribute)getUadpDataSetReaderMessageDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetReaderMessageDataType_DataSetOffset() {
        return (EAttribute)getUadpDataSetReaderMessageDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUadpDataSetReaderMessageDataType_DataSetClassId() {
        return (EReference)getUadpDataSetReaderMessageDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetReaderMessageDataType_NetworkMessageContentMask() {
        return (EAttribute)getUadpDataSetReaderMessageDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetReaderMessageDataType_DataSetMessageContentMask() {
        return (EAttribute)getUadpDataSetReaderMessageDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetReaderMessageDataType_PublishingInterval() {
        return (EAttribute)getUadpDataSetReaderMessageDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetReaderMessageDataType_ReceiveOffset() {
        return (EAttribute)getUadpDataSetReaderMessageDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetReaderMessageDataType_ProcessingOffset() {
        return (EAttribute)getUadpDataSetReaderMessageDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUadpDataSetWriterMessageDataType() {
		if (uadpDataSetWriterMessageDataTypeEClass == null) {
			uadpDataSetWriterMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(530);
		}
		return uadpDataSetWriterMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetWriterMessageDataType_DataSetMessageContentMask() {
        return (EAttribute)getUadpDataSetWriterMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetWriterMessageDataType_ConfiguredSize() {
        return (EAttribute)getUadpDataSetWriterMessageDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetWriterMessageDataType_NetworkMessageNumber() {
        return (EAttribute)getUadpDataSetWriterMessageDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpDataSetWriterMessageDataType_DataSetOffset() {
        return (EAttribute)getUadpDataSetWriterMessageDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUadpWriterGroupMessageDataType() {
		if (uadpWriterGroupMessageDataTypeEClass == null) {
			uadpWriterGroupMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(533);
		}
		return uadpWriterGroupMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpWriterGroupMessageDataType_GroupVersion() {
        return (EAttribute)getUadpWriterGroupMessageDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpWriterGroupMessageDataType_DataSetOrdering() {
        return (EAttribute)getUadpWriterGroupMessageDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpWriterGroupMessageDataType_NetworkMessageContentMask() {
        return (EAttribute)getUadpWriterGroupMessageDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUadpWriterGroupMessageDataType_SamplingOffset() {
        return (EAttribute)getUadpWriterGroupMessageDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUadpWriterGroupMessageDataType_PublishingOffset() {
        return (EReference)getUadpWriterGroupMessageDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnion() {
		if (unionEClass == null) {
			unionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(534);
		}
		return unionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnregisterNodesRequest() {
		if (unregisterNodesRequestEClass == null) {
			unregisterNodesRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(535);
		}
		return unregisterNodesRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnregisterNodesRequest_RequestHeader() {
        return (EReference)getUnregisterNodesRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnregisterNodesRequest_NodesToUnregister() {
        return (EReference)getUnregisterNodesRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnregisterNodesResponse() {
		if (unregisterNodesResponseEClass == null) {
			unregisterNodesResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(536);
		}
		return unregisterNodesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnregisterNodesResponse_ResponseHeader() {
        return (EReference)getUnregisterNodesResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateDataDetails() {
		if (updateDataDetailsEClass == null) {
			updateDataDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(537);
		}
		return updateDataDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateDataDetails_PerformInsertReplace() {
        return (EAttribute)getUpdateDataDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateDataDetails_UpdateValues() {
        return (EReference)getUpdateDataDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateEventDetails() {
		if (updateEventDetailsEClass == null) {
			updateEventDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(538);
		}
		return updateEventDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateEventDetails_PerformInsertReplace() {
        return (EAttribute)getUpdateEventDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateEventDetails_Filter() {
        return (EReference)getUpdateEventDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateEventDetails_EventData() {
        return (EReference)getUpdateEventDetails().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateStructureDataDetails() {
		if (updateStructureDataDetailsEClass == null) {
			updateStructureDataDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(539);
		}
		return updateStructureDataDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateStructureDataDetails_PerformInsertReplace() {
        return (EAttribute)getUpdateStructureDataDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateStructureDataDetails_UpdateValues() {
        return (EReference)getUpdateStructureDataDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserIdentityToken() {
		if (userIdentityTokenEClass == null) {
			userIdentityTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(540);
		}
		return userIdentityTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIdentityToken_PolicyId() {
        return (EAttribute)getUserIdentityToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserNameIdentityToken() {
		if (userNameIdentityTokenEClass == null) {
			userNameIdentityTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(541);
		}
		return userNameIdentityTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserNameIdentityToken_UserName() {
        return (EAttribute)getUserNameIdentityToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserNameIdentityToken_Password() {
        return (EAttribute)getUserNameIdentityToken().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserNameIdentityToken_EncryptionAlgorithm() {
        return (EAttribute)getUserNameIdentityToken().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTokenPolicy() {
		if (userTokenPolicyEClass == null) {
			userTokenPolicyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(542);
		}
		return userTokenPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserTokenPolicy_PolicyId() {
        return (EAttribute)getUserTokenPolicy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserTokenPolicy_TokenType() {
        return (EAttribute)getUserTokenPolicy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserTokenPolicy_IssuedTokenType() {
        return (EAttribute)getUserTokenPolicy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserTokenPolicy_IssuerEndpointUrl() {
        return (EAttribute)getUserTokenPolicy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserTokenPolicy_SecurityPolicyUri() {
        return (EAttribute)getUserTokenPolicy().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		if (valueTypeEClass == null) {
			valueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(545);
		}
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Any() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAttributes() {
		if (variableAttributesEClass == null) {
			variableAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(546);
		}
		return variableAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAttributes_Value() {
        return (EReference)getVariableAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAttributes_DataType() {
        return (EReference)getVariableAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAttributes_ValueRank() {
        return (EAttribute)getVariableAttributes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAttributes_ArrayDimensions() {
        return (EReference)getVariableAttributes().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAttributes_AccessLevel() {
        return (EAttribute)getVariableAttributes().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAttributes_UserAccessLevel() {
        return (EAttribute)getVariableAttributes().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAttributes_MinimumSamplingInterval() {
        return (EAttribute)getVariableAttributes().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAttributes_Historizing() {
        return (EAttribute)getVariableAttributes().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableNode() {
		if (variableNodeEClass == null) {
			variableNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(547);
		}
		return variableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableNode_Value() {
        return (EReference)getVariableNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableNode_DataType() {
        return (EReference)getVariableNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableNode_ValueRank() {
        return (EAttribute)getVariableNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableNode_ArrayDimensions() {
        return (EReference)getVariableNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableNode_AccessLevel() {
        return (EAttribute)getVariableNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableNode_UserAccessLevel() {
        return (EAttribute)getVariableNode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableNode_MinimumSamplingInterval() {
        return (EAttribute)getVariableNode().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableNode_Historizing() {
        return (EAttribute)getVariableNode().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableNode_AccessLevelEx() {
        return (EAttribute)getVariableNode().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableTypeAttributes() {
		if (variableTypeAttributesEClass == null) {
			variableTypeAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(548);
		}
		return variableTypeAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableTypeAttributes_Value() {
        return (EReference)getVariableTypeAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableTypeAttributes_DataType() {
        return (EReference)getVariableTypeAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableTypeAttributes_ValueRank() {
        return (EAttribute)getVariableTypeAttributes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableTypeAttributes_ArrayDimensions() {
        return (EReference)getVariableTypeAttributes().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableTypeAttributes_IsAbstract() {
        return (EAttribute)getVariableTypeAttributes().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableTypeNode() {
		if (variableTypeNodeEClass == null) {
			variableTypeNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(549);
		}
		return variableTypeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableTypeNode_Value() {
        return (EReference)getVariableTypeNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableTypeNode_DataType() {
        return (EReference)getVariableTypeNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableTypeNode_ValueRank() {
        return (EAttribute)getVariableTypeNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableTypeNode_ArrayDimensions() {
        return (EReference)getVariableTypeNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableTypeNode_IsAbstract() {
        return (EAttribute)getVariableTypeNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariant() {
		if (variantEClass == null) {
			variantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(550);
		}
		return variantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariant_Value() {
        return (EReference)getVariant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector() {
		if (vectorEClass == null) {
			vectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(551);
		}
		return vectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewAttributes() {
		if (viewAttributesEClass == null) {
			viewAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(552);
		}
		return viewAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewAttributes_ContainsNoLoops() {
        return (EAttribute)getViewAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewAttributes_EventNotifier() {
        return (EAttribute)getViewAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewDescription() {
		if (viewDescriptionEClass == null) {
			viewDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(553);
		}
		return viewDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewDescription_ViewId() {
        return (EReference)getViewDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewDescription_Timestamp() {
        return (EAttribute)getViewDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewDescription_ViewVersion() {
        return (EAttribute)getViewDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewNode() {
		if (viewNodeEClass == null) {
			viewNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(554);
		}
		return viewNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewNode_ContainsNoLoops() {
        return (EAttribute)getViewNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewNode_EventNotifier() {
        return (EAttribute)getViewNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteRequest() {
		if (writeRequestEClass == null) {
			writeRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(555);
		}
		return writeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteRequest_RequestHeader() {
        return (EReference)getWriteRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteRequest_NodesToWrite() {
        return (EReference)getWriteRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteResponse() {
		if (writeResponseEClass == null) {
			writeResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(556);
		}
		return writeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteResponse_ResponseHeader() {
        return (EReference)getWriteResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteResponse_Results() {
        return (EReference)getWriteResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteResponse_DiagnosticInfos() {
        return (EReference)getWriteResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriterGroupDataType() {
		if (writerGroupDataTypeEClass == null) {
			writerGroupDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(557);
		}
		return writerGroupDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriterGroupDataType_WriterGroupId() {
        return (EAttribute)getWriterGroupDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriterGroupDataType_PublishingInterval() {
        return (EAttribute)getWriterGroupDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriterGroupDataType_KeepAliveTime() {
        return (EAttribute)getWriterGroupDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriterGroupDataType_Priority() {
        return (EAttribute)getWriterGroupDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriterGroupDataType_LocaleIds() {
        return (EReference)getWriterGroupDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriterGroupDataType_HeaderLayoutUri() {
        return (EAttribute)getWriterGroupDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriterGroupDataType_TransportSettings() {
        return (EReference)getWriterGroupDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriterGroupDataType_MessageSettings() {
        return (EReference)getWriterGroupDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriterGroupDataType_DataSetWriters() {
        return (EReference)getWriterGroupDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriterGroupMessageDataType() {
		if (writerGroupMessageDataTypeEClass == null) {
			writerGroupMessageDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(558);
		}
		return writerGroupMessageDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriterGroupTransportDataType() {
		if (writerGroupTransportDataTypeEClass == null) {
			writerGroupTransportDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(559);
		}
		return writerGroupTransportDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteValue() {
		if (writeValueEClass == null) {
			writeValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(560);
		}
		return writeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteValue_NodeId() {
        return (EReference)getWriteValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteValue_AttributeId() {
        return (EAttribute)getWriteValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteValue_IndexRange() {
        return (EAttribute)getWriteValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteValue_Value() {
        return (EReference)getWriteValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX509IdentityToken() {
		if (x509IdentityTokenEClass == null) {
			x509IdentityTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(561);
		}
		return x509IdentityTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509IdentityToken_CertificateData() {
        return (EAttribute)getX509IdentityToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlElementType() {
		if (xmlElementTypeEClass == null) {
			xmlElementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(562);
		}
		return xmlElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmlElementType_Any() {
        return (EAttribute)getXmlElementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXVType() {
		if (xvTypeEClass == null) {
			xvTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(563);
		}
		return xvTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXVType_X() {
        return (EAttribute)getXVType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXVType_Value() {
        return (EAttribute)getXVType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApplicationType() {
		if (applicationTypeEEnum == null) {
			applicationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(20);
		}
		return applicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAxisScaleEnumeration() {
		if (axisScaleEnumerationEEnum == null) {
			axisScaleEnumerationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(27);
		}
		return axisScaleEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBrokerTransportQualityOfService() {
		if (brokerTransportQualityOfServiceEEnum == null) {
			brokerTransportQualityOfServiceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(33);
		}
		return brokerTransportQualityOfServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBrowseDirection() {
		if (browseDirectionEEnum == null) {
			browseDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(37);
		}
		return browseDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBrowseResultMask() {
		if (browseResultMaskEEnum == null) {
			browseResultMaskEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(47);
		}
		return browseResultMaskEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataChangeTrigger() {
		if (dataChangeTriggerEEnum == null) {
			dataChangeTriggerEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(78);
		}
		return dataChangeTriggerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSetOrderingType() {
		if (dataSetOrderingTypeEEnum == null) {
			dataSetOrderingTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(87);
		}
		return dataSetOrderingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeadbandType() {
		if (deadbandTypeEEnum == null) {
			deadbandTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(101);
		}
		return deadbandTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticsLevel() {
		if (diagnosticsLevelEEnum == null) {
			diagnosticsLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(118);
		}
		return diagnosticsLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExceptionDeviationFormat() {
		if (exceptionDeviationFormatEEnum == null) {
			exceptionDeviationFormatEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(139);
		}
		return exceptionDeviationFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterOperator() {
		if (filterOperatorEEnum == null) {
			filterOperatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(146);
		}
		return filterOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHistoryUpdateType() {
		if (historyUpdateTypeEEnum == null) {
			historyUpdateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(171);
		}
		return historyUpdateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdentityCriteriaType() {
		if (identityCriteriaTypeEEnum == null) {
			identityCriteriaTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(173);
		}
		return identityCriteriaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdType() {
		if (idTypeEEnum == null) {
			idTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(176);
		}
		return idTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSecurityMode() {
		if (messageSecurityModeEEnum == null) {
			messageSecurityModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(362);
		}
		return messageSecurityModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelChangeStructureVerbMask() {
		if (modelChangeStructureVerbMaskEEnum == null) {
			modelChangeStructureVerbMaskEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(367);
		}
		return modelChangeStructureVerbMaskEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonitoringMode() {
		if (monitoringModeEEnum == null) {
			monitoringModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(381);
		}
		return monitoringModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeAttributesMask() {
		if (nodeAttributesMaskEEnum == null) {
			nodeAttributesMaskEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(389);
		}
		return nodeAttributesMaskEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeClass() {
		if (nodeClassEEnum == null) {
			nodeClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(391);
		}
		return nodeClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOpenFileMode() {
		if (openFileModeEEnum == null) {
			openFileModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(402);
		}
		return openFileModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOverrideValueHandling() {
		if (overrideValueHandlingEEnum == null) {
			overrideValueHandlingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(408);
		}
		return overrideValueHandlingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPerformUpdateType() {
		if (performUpdateTypeEEnum == null) {
			performUpdateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(411);
		}
		return performUpdateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPubSubDiagnosticsCounterClassification() {
		if (pubSubDiagnosticsCounterClassificationEEnum == null) {
			pubSubDiagnosticsCounterClassificationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(426);
		}
		return pubSubDiagnosticsCounterClassificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPubSubState() {
		if (pubSubStateEEnum == null) {
			pubSubStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(429);
		}
		return pubSubStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRedundancySupport() {
		if (redundancySupportEEnum == null) {
			redundancySupportEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(451);
		}
		return redundancySupportEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityTokenRequestType() {
		if (securityTokenRequestTypeEEnum == null) {
			securityTokenRequestTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(473);
		}
		return securityTokenRequestTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServerState() {
		if (serverStateEEnum == null) {
			serverStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(478);
		}
		return serverStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureType() {
		if (structureTypeEEnum == null) {
			structureTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(503);
		}
		return structureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimestampsToReturn() {
		if (timestampsToReturnEEnum == null) {
			timestampsToReturnEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(514);
		}
		return timestampsToReturnEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTrustListMasks() {
		if (trustListMasksEEnum == null) {
			trustListMasksEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(523);
		}
		return trustListMasksEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserTokenType() {
		if (userTokenTypeEEnum == null) {
			userTokenTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(543);
		}
		return userTokenTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccessLevelExType() {
		if (accessLevelExTypeEDataType == null) {
			accessLevelExTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return accessLevelExTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccessLevelExTypeObject() {
		if (accessLevelExTypeObjectEDataType == null) {
			accessLevelExTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return accessLevelExTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccessLevelType() {
		if (accessLevelTypeEDataType == null) {
			accessLevelTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return accessLevelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccessLevelTypeObject() {
		if (accessLevelTypeObjectEDataType == null) {
			accessLevelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return accessLevelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApplicationTypeObject() {
		if (applicationTypeObjectEDataType == null) {
			applicationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(21);
		}
		return applicationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAttributeWriteMask() {
		if (attributeWriteMaskEDataType == null) {
			attributeWriteMaskEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(24);
		}
		return attributeWriteMaskEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAttributeWriteMaskObject() {
		if (attributeWriteMaskObjectEDataType == null) {
			attributeWriteMaskObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(25);
		}
		return attributeWriteMaskObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAxisScaleEnumerationObject() {
		if (axisScaleEnumerationObjectEDataType == null) {
			axisScaleEnumerationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(28);
		}
		return axisScaleEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBrokerTransportQualityOfServiceObject() {
		if (brokerTransportQualityOfServiceObjectEDataType == null) {
			brokerTransportQualityOfServiceObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(34);
		}
		return brokerTransportQualityOfServiceObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBrowseDirectionObject() {
		if (browseDirectionObjectEDataType == null) {
			browseDirectionObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(38);
		}
		return browseDirectionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBrowseResultMaskObject() {
		if (browseResultMaskObjectEDataType == null) {
			browseResultMaskObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(48);
		}
		return browseResultMaskObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataChangeTriggerObject() {
		if (dataChangeTriggerObjectEDataType == null) {
			dataChangeTriggerObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(79);
		}
		return dataChangeTriggerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataSetFieldContentMask() {
		if (dataSetFieldContentMaskEDataType == null) {
			dataSetFieldContentMaskEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(82);
		}
		return dataSetFieldContentMaskEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataSetFieldContentMaskObject() {
		if (dataSetFieldContentMaskObjectEDataType == null) {
			dataSetFieldContentMaskObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(83);
		}
		return dataSetFieldContentMaskObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataSetFieldFlags() {
		if (dataSetFieldFlagsEDataType == null) {
			dataSetFieldFlagsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(84);
		}
		return dataSetFieldFlagsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataSetFieldFlagsObject() {
		if (dataSetFieldFlagsObjectEDataType == null) {
			dataSetFieldFlagsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(85);
		}
		return dataSetFieldFlagsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataSetOrderingTypeObject() {
		if (dataSetOrderingTypeObjectEDataType == null) {
			dataSetOrderingTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(88);
		}
		return dataSetOrderingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeadbandTypeObject() {
		if (deadbandTypeObjectEDataType == null) {
			deadbandTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(102);
		}
		return deadbandTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDiagnosticsLevelObject() {
		if (diagnosticsLevelObjectEDataType == null) {
			diagnosticsLevelObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(119);
		}
		return diagnosticsLevelObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventNotifierType() {
		if (eventNotifierTypeEDataType == null) {
			eventNotifierTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(137);
		}
		return eventNotifierTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventNotifierTypeObject() {
		if (eventNotifierTypeObjectEDataType == null) {
			eventNotifierTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(138);
		}
		return eventNotifierTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExceptionDeviationFormatObject() {
		if (exceptionDeviationFormatObjectEDataType == null) {
			exceptionDeviationFormatObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(140);
		}
		return exceptionDeviationFormatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFilterOperatorObject() {
		if (filterOperatorObjectEDataType == null) {
			filterOperatorObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(147);
		}
		return filterOperatorObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHistoryUpdateTypeObject() {
		if (historyUpdateTypeObjectEDataType == null) {
			historyUpdateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(172);
		}
		return historyUpdateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentityCriteriaTypeObject() {
		if (identityCriteriaTypeObjectEDataType == null) {
			identityCriteriaTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(174);
		}
		return identityCriteriaTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdTypeObject() {
		if (idTypeObjectEDataType == null) {
			idTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(177);
		}
		return idTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJsonDataSetMessageContentMask() {
		if (jsonDataSetMessageContentMaskEDataType == null) {
			jsonDataSetMessageContentMaskEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(180);
		}
		return jsonDataSetMessageContentMaskEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJsonDataSetMessageContentMaskObject() {
		if (jsonDataSetMessageContentMaskObjectEDataType == null) {
			jsonDataSetMessageContentMaskObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(181);
		}
		return jsonDataSetMessageContentMaskObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJsonNetworkMessageContentMask() {
		if (jsonNetworkMessageContentMaskEDataType == null) {
			jsonNetworkMessageContentMaskEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(184);
		}
		return jsonNetworkMessageContentMaskEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJsonNetworkMessageContentMaskObject() {
		if (jsonNetworkMessageContentMaskObjectEDataType == null) {
			jsonNetworkMessageContentMaskObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(185);
		}
		return jsonNetworkMessageContentMaskObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageSecurityModeObject() {
		if (messageSecurityModeObjectEDataType == null) {
			messageSecurityModeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(363);
		}
		return messageSecurityModeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModelChangeStructureVerbMaskObject() {
		if (modelChangeStructureVerbMaskObjectEDataType == null) {
			modelChangeStructureVerbMaskObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(368);
		}
		return modelChangeStructureVerbMaskObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMonitoringModeObject() {
		if (monitoringModeObjectEDataType == null) {
			monitoringModeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(382);
		}
		return monitoringModeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNodeAttributesMaskObject() {
		if (nodeAttributesMaskObjectEDataType == null) {
			nodeAttributesMaskObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(390);
		}
		return nodeAttributesMaskObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNodeClassObject() {
		if (nodeClassObjectEDataType == null) {
			nodeClassObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(392);
		}
		return nodeClassObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpenFileModeObject() {
		if (openFileModeObjectEDataType == null) {
			openFileModeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(403);
		}
		return openFileModeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOverrideValueHandlingObject() {
		if (overrideValueHandlingObjectEDataType == null) {
			overrideValueHandlingObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(409);
		}
		return overrideValueHandlingObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPerformUpdateTypeObject() {
		if (performUpdateTypeObjectEDataType == null) {
			performUpdateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(412);
		}
		return performUpdateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPermissionType() {
		if (permissionTypeEDataType == null) {
			permissionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(413);
		}
		return permissionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPermissionTypeObject() {
		if (permissionTypeObjectEDataType == null) {
			permissionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(414);
		}
		return permissionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPubSubDiagnosticsCounterClassificationObject() {
		if (pubSubDiagnosticsCounterClassificationObjectEDataType == null) {
			pubSubDiagnosticsCounterClassificationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(427);
		}
		return pubSubDiagnosticsCounterClassificationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPubSubStateObject() {
		if (pubSubStateObjectEDataType == null) {
			pubSubStateObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(430);
		}
		return pubSubStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRedundancySupportObject() {
		if (redundancySupportObjectEDataType == null) {
			redundancySupportObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(452);
		}
		return redundancySupportObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSecurityTokenRequestTypeObject() {
		if (securityTokenRequestTypeObjectEDataType == null) {
			securityTokenRequestTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(474);
		}
		return securityTokenRequestTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServerStateObject() {
		if (serverStateObjectEDataType == null) {
			serverStateObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(479);
		}
		return serverStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStructureTypeObject() {
		if (structureTypeObjectEDataType == null) {
			structureTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(504);
		}
		return structureTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimestampsToReturnObject() {
		if (timestampsToReturnObjectEDataType == null) {
			timestampsToReturnObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(515);
		}
		return timestampsToReturnObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrustListMasksObject() {
		if (trustListMasksObjectEDataType == null) {
			trustListMasksObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(524);
		}
		return trustListMasksObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUadpDataSetMessageContentMask() {
		if (uadpDataSetMessageContentMaskEDataType == null) {
			uadpDataSetMessageContentMaskEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(527);
		}
		return uadpDataSetMessageContentMaskEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUadpDataSetMessageContentMaskObject() {
		if (uadpDataSetMessageContentMaskObjectEDataType == null) {
			uadpDataSetMessageContentMaskObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(528);
		}
		return uadpDataSetMessageContentMaskObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUadpNetworkMessageContentMask() {
		if (uadpNetworkMessageContentMaskEDataType == null) {
			uadpNetworkMessageContentMaskEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(531);
		}
		return uadpNetworkMessageContentMaskEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUadpNetworkMessageContentMaskObject() {
		if (uadpNetworkMessageContentMaskObjectEDataType == null) {
			uadpNetworkMessageContentMaskObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(532);
		}
		return uadpNetworkMessageContentMaskObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUserTokenTypeObject() {
		if (userTokenTypeObjectEDataType == null) {
			userTokenTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI).getEClassifiers().get(544);
		}
		return userTokenTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.opcfoundation.ua._2008._02.types." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //TypesPackageImpl
