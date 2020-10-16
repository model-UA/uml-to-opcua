/**
 */
package org.opcfoundation.ua._2008._02.types.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.opcfoundation.ua._2008._02.types.DocumentRoot;
import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAccessLevelExTypePropertyDescriptor(object);
			addAccessLevelTypePropertyDescriptor(object);
			addApplicationInstanceCertificatePropertyDescriptor(object);
			addApplicationTypePropertyDescriptor(object);
			addAttributeWriteMaskPropertyDescriptor(object);
			addAudioDataTypePropertyDescriptor(object);
			addAxisScaleEnumerationPropertyDescriptor(object);
			addBitFieldMaskDataTypePropertyDescriptor(object);
			addBooleanPropertyDescriptor(object);
			addBrokerTransportQualityOfServicePropertyDescriptor(object);
			addBrowseDirectionPropertyDescriptor(object);
			addBrowseResultMaskPropertyDescriptor(object);
			addBytePropertyDescriptor(object);
			addByteStringPropertyDescriptor(object);
			addContinuationPointPropertyDescriptor(object);
			addCounterPropertyDescriptor(object);
			addDataChangeTriggerPropertyDescriptor(object);
			addDataSetFieldContentMaskPropertyDescriptor(object);
			addDataSetFieldFlagsPropertyDescriptor(object);
			addDataSetOrderingTypePropertyDescriptor(object);
			addDatePropertyDescriptor(object);
			addDateStringPropertyDescriptor(object);
			addDateTimePropertyDescriptor(object);
			addDeadbandTypePropertyDescriptor(object);
			addDecimalStringPropertyDescriptor(object);
			addDiagnosticsLevelPropertyDescriptor(object);
			addDoublePropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addDurationStringPropertyDescriptor(object);
			addEventNotifierTypePropertyDescriptor(object);
			addExceptionDeviationFormatPropertyDescriptor(object);
			addFilterOperatorPropertyDescriptor(object);
			addFloatPropertyDescriptor(object);
			addHistoryUpdateTypePropertyDescriptor(object);
			addIdentityCriteriaTypePropertyDescriptor(object);
			addIdTypePropertyDescriptor(object);
			addImageBMPPropertyDescriptor(object);
			addImageGIFPropertyDescriptor(object);
			addImageJPGPropertyDescriptor(object);
			addImagePNGPropertyDescriptor(object);
			addIndexPropertyDescriptor(object);
			addInt16PropertyDescriptor(object);
			addInt32PropertyDescriptor(object);
			addInt64PropertyDescriptor(object);
			addIntegerIdPropertyDescriptor(object);
			addInvokeServiceRequestPropertyDescriptor(object);
			addInvokeServiceResponsePropertyDescriptor(object);
			addJsonDataSetMessageContentMaskPropertyDescriptor(object);
			addJsonNetworkMessageContentMaskPropertyDescriptor(object);
			addLocaleIdPropertyDescriptor(object);
			addMessageSecurityModePropertyDescriptor(object);
			addModelChangeStructureVerbMaskPropertyDescriptor(object);
			addMonitoringModePropertyDescriptor(object);
			addNodeAttributesMaskPropertyDescriptor(object);
			addNodeClassPropertyDescriptor(object);
			addNormalizedStringPropertyDescriptor(object);
			addNumericRangePropertyDescriptor(object);
			addOpenFileModePropertyDescriptor(object);
			addOverrideValueHandlingPropertyDescriptor(object);
			addPerformUpdateTypePropertyDescriptor(object);
			addPermissionTypePropertyDescriptor(object);
			addPubSubDiagnosticsCounterClassificationPropertyDescriptor(object);
			addPubSubStatePropertyDescriptor(object);
			addRedundancySupportPropertyDescriptor(object);
			addSBytePropertyDescriptor(object);
			addSecurityTokenRequestTypePropertyDescriptor(object);
			addServerStatePropertyDescriptor(object);
			addStringPropertyDescriptor(object);
			addStructureTypePropertyDescriptor(object);
			addTimePropertyDescriptor(object);
			addTimestampsToReturnPropertyDescriptor(object);
			addTimeStringPropertyDescriptor(object);
			addTrustListMasksPropertyDescriptor(object);
			addUadpDataSetMessageContentMaskPropertyDescriptor(object);
			addUadpNetworkMessageContentMaskPropertyDescriptor(object);
			addUInt16PropertyDescriptor(object);
			addUInt32PropertyDescriptor(object);
			addUInt64PropertyDescriptor(object);
			addUserTokenTypePropertyDescriptor(object);
			addUtcTimePropertyDescriptor(object);
			addVersionTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Access Level Ex Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessLevelExTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_accessLevelExType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_accessLevelExType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_AccessLevelExType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Level Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessLevelTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_accessLevelType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_accessLevelType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_AccessLevelType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Application Instance Certificate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationInstanceCertificatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_applicationInstanceCertificate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_applicationInstanceCertificate_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ApplicationInstanceCertificate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Application Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_applicationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_applicationType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ApplicationType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute Write Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeWriteMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_attributeWriteMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_attributeWriteMask_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_AttributeWriteMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Audio Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAudioDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_audioDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_audioDataType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_AudioDataType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Axis Scale Enumeration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAxisScaleEnumerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_axisScaleEnumeration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_axisScaleEnumeration_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_AxisScaleEnumeration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bit Field Mask Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBitFieldMaskDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_bitFieldMaskDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_bitFieldMaskDataType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_BitFieldMaskDataType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boolean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBooleanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_boolean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_boolean_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Boolean(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Broker Transport Quality Of Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrokerTransportQualityOfServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_brokerTransportQualityOfService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_brokerTransportQualityOfService_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_BrokerTransportQualityOfService(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Browse Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrowseDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_browseDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_browseDirection_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_BrowseDirection(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Browse Result Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrowseResultMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_browseResultMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_browseResultMask_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_BrowseResultMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Byte feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBytePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_byte_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_byte_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Byte(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Byte String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addByteStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_byteString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_byteString_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ByteString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Continuation Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContinuationPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_continuationPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_continuationPoint_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ContinuationPoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_counter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_counter_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Counter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Change Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataChangeTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataChangeTrigger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataChangeTrigger_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_DataChangeTrigger(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Set Field Content Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSetFieldContentMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataSetFieldContentMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataSetFieldContentMask_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_DataSetFieldContentMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Set Field Flags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSetFieldFlagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataSetFieldFlags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataSetFieldFlags_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_DataSetFieldFlags(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Set Ordering Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSetOrderingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataSetOrderingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataSetOrderingType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_DataSetOrderingType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_date_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Date(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dateString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dateString_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_DateString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dateTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dateTime_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_DateTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadband Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadbandTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_deadbandType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_deadbandType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_DeadbandType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decimal String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecimalStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_decimalString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_decimalString_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_DecimalString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagnostics Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagnosticsLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_diagnosticsLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_diagnosticsLevel_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_DiagnosticsLevel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Double feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoublePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_double_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_double_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Double(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_duration_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Duration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_durationString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_durationString_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_DurationString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Notifier Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventNotifierTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_eventNotifierType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_eventNotifierType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_EventNotifierType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exception Deviation Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExceptionDeviationFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_exceptionDeviationFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_exceptionDeviationFormat_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ExceptionDeviationFormat(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filter Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilterOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_filterOperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_filterOperator_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_FilterOperator(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Float feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFloatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_float_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_float_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Float(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the History Update Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistoryUpdateTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_historyUpdateType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_historyUpdateType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identity Criteria Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentityCriteriaTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_identityCriteriaType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_identityCriteriaType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_IdentityCriteriaType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_idType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_idType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_IdType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image BMP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageBMPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_imageBMP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_imageBMP_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ImageBMP(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image GIF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageGIFPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_imageGIF_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_imageGIF_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ImageGIF(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image JPG feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageJPGPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_imageJPG_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_imageJPG_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ImageJPG(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image PNG feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImagePNGPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_imagePNG_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_imagePNG_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ImagePNG(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_index_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_index_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Index(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Int16 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInt16PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_int16_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_int16_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Int16(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Int32 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInt32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_int32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_int32_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Int32(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Int64 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInt64PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_int64_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_int64_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Int64(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Integer Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntegerIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_integerId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_integerId_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_IntegerId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invoke Service Request feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvokeServiceRequestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_invokeServiceRequest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_invokeServiceRequest_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_InvokeServiceRequest(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invoke Service Response feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvokeServiceResponsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_invokeServiceResponse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_invokeServiceResponse_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_InvokeServiceResponse(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Json Data Set Message Content Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJsonDataSetMessageContentMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_jsonDataSetMessageContentMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_jsonDataSetMessageContentMask_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetMessageContentMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Json Network Message Content Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJsonNetworkMessageContentMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_jsonNetworkMessageContentMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_jsonNetworkMessageContentMask_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_JsonNetworkMessageContentMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Locale Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocaleIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_localeId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_localeId_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_LocaleId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Security Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageSecurityModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_messageSecurityMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_messageSecurityMode_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_MessageSecurityMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model Change Structure Verb Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelChangeStructureVerbMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_modelChangeStructureVerbMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_modelChangeStructureVerbMask_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ModelChangeStructureVerbMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitoring Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoringModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_monitoringMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_monitoringMode_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_MonitoringMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Attributes Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeAttributesMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_nodeAttributesMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_nodeAttributesMask_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributesMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_nodeClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_nodeClass_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_NodeClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Normalized String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNormalizedStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_normalizedString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_normalizedString_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_NormalizedString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Numeric Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumericRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_numericRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_numericRange_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_NumericRange(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Open File Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpenFileModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_openFileMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_openFileMode_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_OpenFileMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Override Value Handling feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverrideValueHandlingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_overrideValueHandling_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_overrideValueHandling_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_OverrideValueHandling(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perform Update Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformUpdateTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_performUpdateType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_performUpdateType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_PerformUpdateType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Permission Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPermissionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_permissionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_permissionType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_PermissionType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pub Sub Diagnostics Counter Classification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPubSubDiagnosticsCounterClassificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_pubSubDiagnosticsCounterClassification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_pubSubDiagnosticsCounterClassification_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_PubSubDiagnosticsCounterClassification(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pub Sub State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPubSubStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_pubSubState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_pubSubState_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_PubSubState(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redundancy Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedundancySupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_redundancySupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_redundancySupport_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_RedundancySupport(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SByte feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSBytePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_sByte_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_sByte_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_SByte(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Token Request Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityTokenRequestTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_securityTokenRequestType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_securityTokenRequestType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_SecurityTokenRequestType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_serverState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_serverState_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_ServerState(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_string_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_string_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_String(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Structure Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStructureTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_structureType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_structureType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_StructureType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_time_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_Time(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamps To Return feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampsToReturnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_timestampsToReturn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_timestampsToReturn_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_TimestampsToReturn(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_timeString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_timeString_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_TimeString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trust List Masks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrustListMasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_trustListMasks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_trustListMasks_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_TrustListMasks(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uadp Data Set Message Content Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUadpDataSetMessageContentMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_uadpDataSetMessageContentMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_uadpDataSetMessageContentMask_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetMessageContentMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uadp Network Message Content Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUadpNetworkMessageContentMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_uadpNetworkMessageContentMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_uadpNetworkMessageContentMask_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_UadpNetworkMessageContentMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the UInt16 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUInt16PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_uInt16_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_uInt16_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_UInt16(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the UInt32 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUInt32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_uInt32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_uInt32_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_UInt32(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the UInt64 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUInt64PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_uInt64_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_uInt64_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_UInt64(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Token Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserTokenTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_userTokenType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_userTokenType_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_UserTokenType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Utc Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUtcTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_utcTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_utcTime_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_UtcTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_versionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_versionTime_feature", "_UI_DocumentRoot_type"),
				 TypesPackage.eINSTANCE.getDocumentRoot_VersionTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesItem());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesItem());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AggregateConfiguration());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilter());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilterResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AliasNameDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_Annotation());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AnonymousIdentityToken());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_Argument());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AttributeOperand());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_AxisInformation());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrokerConnectionTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetReaderTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetWriterTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrokerWriterGroupTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrowseDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePath());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathTarget());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrowseRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_BuildInfo());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CallRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CallResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CancelRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CancelResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CartesianCoordinates());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ChannelSecurityToken());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ComplexNumberType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ConfigurationVersionDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilter());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElement());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElementResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_CurrencyUnitType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeFilter());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeNotification());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DatagramConnectionTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DatagramWriterGroupTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataSetMetaDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeAttributes());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DataValue());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DecimalDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteAtTimeDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteEventDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesItem());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteRawModifiedDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesItem());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DiagnosticInfo());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DiscoveryConfiguration());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_DoubleComplexNumberType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ElementOperand());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EndpointConfiguration());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EndpointDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EndpointType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EndpointUrlListDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EnumDefinition());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EnumDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EnumField());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EnumValueType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EUInformation());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EventFieldList());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EventFilter());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EventFilterResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_EventNotificationList());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ExpandedNodeId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ExtensionObject());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_FieldMetaData());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_FieldTargetDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_FindServersRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_FindServersResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_Frame());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributes());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributeValue());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_Guid());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryData());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEvent());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEventFieldList());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryModifiedData());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadValueId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_IdentityMappingRuleType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_IssuedIdentityToken());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetReaderMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetWriterMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_JsonWriterGroupMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_KeyValuePair());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesItem());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddReferencesItem());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAliasNameDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfApplicationDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfArgument());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBoolean());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerConnectionTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetReaderTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetWriterTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerTransportQualityOfService());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerWriterGroupTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePath());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathTarget());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByte());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByteString());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCartesianCoordinates());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConfigurationVersionDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConnectionTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilter());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElement());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElementResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCurrencyUnitType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramConnectionTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramWriterGroupTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetFieldContentMask());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetMetaDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetOrderingType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDefinition());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeSchemaHeader());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataValue());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDateTime());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteNodesItem());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteReferencesItem());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticInfo());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticsLevel());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDouble());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointConfiguration());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointUrlListDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDefinition());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumField());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumValueType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEventFieldList());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExpandedNodeId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExtensionObject());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldMetaData());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldTargetDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFloat());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFrame());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGenericAttributeValue());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGuid());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryEventFieldList());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadValueId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryUpdateResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityCriteriaType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityMappingRuleType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt16());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt32());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt64());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetMessageContentMask());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetReaderMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetWriterMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonNetworkMessageContentMask());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonWriterGroupMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfKeyValuePair());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfLocalizedText());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModelChangeStructureDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModificationInfo());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemNotification());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressUrlDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkGroupDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeReference());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeTypeDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOpenFileMode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOptionSet());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOrientation());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOverrideValueHandling());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfParsingResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataItemsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetSourceDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedEventsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedVariableDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConfigurationDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConnectionDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubDiagnosticsCounterClassification());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubGroupDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubState());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQualifiedName());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataSet());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRationalNumber());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReadValueId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRedundantServerDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRegisteredServer());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRelativePathElement());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRolePermissionType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSamplingIntervalDiagnosticsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSByte());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSemanticChangeStructureDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfServerOnNetwork());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionDiagnosticsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionSecurityDiagnosticsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSignedSoftwareCertificate());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleAttributeOperand());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleTypeDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusCode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfString());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDefinition());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureField());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetMirrorDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionAcknowledgement());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionDiagnosticsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTargetVariablesDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDCartesianCoordinates());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDFrame());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDOrientation());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDVector());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTimeZoneDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTransferResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTrustListDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUABinaryFileDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetMessageContentMask());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetReaderMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetWriterMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpNetworkMessageContentMask());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpWriterGroupMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt16());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt32());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt64());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUnion());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUserTokenPolicy());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVariant());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVector());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriteValue());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ListOfXmlElement());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_LiteralOperand());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_LocalizedText());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MdnsDiscoveryConfiguration());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MethodAttributes());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MethodNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ModelChangeStructureDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ModificationInfo());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemNotification());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringParameters());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressUrlDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_NetworkGroupDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_Node());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_NodeId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_NodeReference());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_NodeTypeDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_NotificationMessage());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ObjectAttributes());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ObjectNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeAttributes());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_OptionSet());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_Orientation());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ParsingResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnostic2DataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnosticDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataItemsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_PublishedEventsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_PublishedVariableDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_PublishRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_PublishResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConfigurationDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConnectionDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_QualifiedName());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataSet());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_Range());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RationalNumber());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReadAnnotationDataDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReadAtTimeDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReadEventDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReadProcessedDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReadRawModifiedDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReadRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReadResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReadValueId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RedundantServerDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeAttributes());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RegisteredServer());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Request());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Response());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RelativePath());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RelativePathElement());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RepublishRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RepublishResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RequestHeader());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ResponseHeader());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RolePermissionType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_RsaEncryptedSecret());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SamplingIntervalDiagnosticsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SemanticChangeStructureDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ServerDiagnosticsSummaryDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ServerOnNetwork());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ServerStatusDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ServiceCounterDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ServiceFault());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SessionAuthenticationToken());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SessionDiagnosticsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeRequestType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeResponseType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SessionSecurityDiagnosticsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SignatureData());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SignedSoftwareCertificate());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SimpleAttributeOperand());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SimpleTypeDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_StatusChangeNotification());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_StatusCode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_StatusResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_StructureDefinition());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_StructureDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_StructureField());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetMirrorDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionAcknowledgement());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionDiagnosticsDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_TargetVariablesDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDCartesianCoordinates());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDFrame());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDOrientation());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDVector());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_TimeZoneDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_TransferResult());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_TrustListDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UABinaryFileDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetReaderMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetWriterMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UadpWriterGroupMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_Union());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UpdateDataDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UpdateEventDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UpdateStructureDataDetails());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UserNameIdentityToken());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_UserTokenPolicy());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_VariableAttributes());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_VariableNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeAttributes());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_Variant());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_Vector());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ViewAttributes());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ViewDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_ViewNode());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_WriteRequest());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_WriteResponse());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_WriteValue());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_X509IdentityToken());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDocumentRoot_XVType());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DocumentRoot documentRoot = (DocumentRoot)object;
		return getString("_UI_DocumentRoot_type") + " " + documentRoot.getAccessLevelExType();
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case TypesPackage.DOCUMENT_ROOT__ACCESS_LEVEL_EX_TYPE:
			case TypesPackage.DOCUMENT_ROOT__ACCESS_LEVEL_TYPE:
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_INSTANCE_CERTIFICATE:
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_TYPE:
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_WRITE_MASK:
			case TypesPackage.DOCUMENT_ROOT__AUDIO_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__AXIS_SCALE_ENUMERATION:
			case TypesPackage.DOCUMENT_ROOT__BIT_FIELD_MASK_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__BOOLEAN:
			case TypesPackage.DOCUMENT_ROOT__BROKER_TRANSPORT_QUALITY_OF_SERVICE:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DIRECTION:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT_MASK:
			case TypesPackage.DOCUMENT_ROOT__BYTE:
			case TypesPackage.DOCUMENT_ROOT__BYTE_STRING:
			case TypesPackage.DOCUMENT_ROOT__CONTINUATION_POINT:
			case TypesPackage.DOCUMENT_ROOT__COUNTER:
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_TRIGGER:
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_FIELD_CONTENT_MASK:
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_FIELD_FLAGS:
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_ORDERING_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATE:
			case TypesPackage.DOCUMENT_ROOT__DATE_STRING:
			case TypesPackage.DOCUMENT_ROOT__DATE_TIME:
			case TypesPackage.DOCUMENT_ROOT__DEADBAND_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_STRING:
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTICS_LEVEL:
			case TypesPackage.DOCUMENT_ROOT__DOUBLE:
			case TypesPackage.DOCUMENT_ROOT__DURATION:
			case TypesPackage.DOCUMENT_ROOT__DURATION_STRING:
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFIER_TYPE:
			case TypesPackage.DOCUMENT_ROOT__EXCEPTION_DEVIATION_FORMAT:
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERATOR:
			case TypesPackage.DOCUMENT_ROOT__FLOAT:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_TYPE:
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_CRITERIA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__ID_TYPE:
			case TypesPackage.DOCUMENT_ROOT__IMAGE_BMP:
			case TypesPackage.DOCUMENT_ROOT__IMAGE_GIF:
			case TypesPackage.DOCUMENT_ROOT__IMAGE_JPG:
			case TypesPackage.DOCUMENT_ROOT__IMAGE_PNG:
			case TypesPackage.DOCUMENT_ROOT__INDEX:
			case TypesPackage.DOCUMENT_ROOT__INT16:
			case TypesPackage.DOCUMENT_ROOT__INT32:
			case TypesPackage.DOCUMENT_ROOT__INT64:
			case TypesPackage.DOCUMENT_ROOT__INTEGER_ID:
			case TypesPackage.DOCUMENT_ROOT__INVOKE_SERVICE_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__INVOKE_SERVICE_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_MESSAGE_CONTENT_MASK:
			case TypesPackage.DOCUMENT_ROOT__JSON_NETWORK_MESSAGE_CONTENT_MASK:
			case TypesPackage.DOCUMENT_ROOT__LOCALE_ID:
			case TypesPackage.DOCUMENT_ROOT__MESSAGE_SECURITY_MODE:
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_VERB_MASK:
			case TypesPackage.DOCUMENT_ROOT__MONITORING_MODE:
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES_MASK:
			case TypesPackage.DOCUMENT_ROOT__NODE_CLASS:
			case TypesPackage.DOCUMENT_ROOT__NORMALIZED_STRING:
			case TypesPackage.DOCUMENT_ROOT__NUMERIC_RANGE:
			case TypesPackage.DOCUMENT_ROOT__OPEN_FILE_MODE:
			case TypesPackage.DOCUMENT_ROOT__OVERRIDE_VALUE_HANDLING:
			case TypesPackage.DOCUMENT_ROOT__PERFORM_UPDATE_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PERMISSION_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_STATE:
			case TypesPackage.DOCUMENT_ROOT__REDUNDANCY_SUPPORT:
			case TypesPackage.DOCUMENT_ROOT__SBYTE:
			case TypesPackage.DOCUMENT_ROOT__SECURITY_TOKEN_REQUEST_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATE:
			case TypesPackage.DOCUMENT_ROOT__STRING:
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_TYPE:
			case TypesPackage.DOCUMENT_ROOT__TIME:
			case TypesPackage.DOCUMENT_ROOT__TIMESTAMPS_TO_RETURN:
			case TypesPackage.DOCUMENT_ROOT__TIME_STRING:
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_MASKS:
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_MESSAGE_CONTENT_MASK:
			case TypesPackage.DOCUMENT_ROOT__UADP_NETWORK_MESSAGE_CONTENT_MASK:
			case TypesPackage.DOCUMENT_ROOT__UINT16:
			case TypesPackage.DOCUMENT_ROOT__UINT32:
			case TypesPackage.DOCUMENT_ROOT__UINT64:
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_TYPE:
			case TypesPackage.DOCUMENT_ROOT__UTC_TIME:
			case TypesPackage.DOCUMENT_ROOT__VERSION_TIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__ACTIVATE_SESSION_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_ITEM:
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__ADD_NODES_RESULT:
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_ITEM:
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__ADD_REFERENCES_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_CONFIGURATION:
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER:
			case TypesPackage.DOCUMENT_ROOT__AGGREGATE_FILTER_RESULT:
			case TypesPackage.DOCUMENT_ROOT__ALIAS_NAME_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__ANNOTATION:
			case TypesPackage.DOCUMENT_ROOT__ANONYMOUS_IDENTITY_TOKEN:
			case TypesPackage.DOCUMENT_ROOT__APPLICATION_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__ARGUMENT:
			case TypesPackage.DOCUMENT_ROOT__ATTRIBUTE_OPERAND:
			case TypesPackage.DOCUMENT_ROOT__AXIS_INFORMATION:
			case TypesPackage.DOCUMENT_ROOT__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_NEXT_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_RESULT:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_PATH_TARGET:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__BROWSE_RESULT:
			case TypesPackage.DOCUMENT_ROOT__BUILD_INFO:
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__CALL_METHOD_RESULT:
			case TypesPackage.DOCUMENT_ROOT__CALL_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__CALL_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__CANCEL_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__CANCEL_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__CARTESIAN_COORDINATES:
			case TypesPackage.DOCUMENT_ROOT__CHANNEL_SECURITY_TOKEN:
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SECURE_CHANNEL_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__CLOSE_SESSION_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__COMPLEX_NUMBER_TYPE:
			case TypesPackage.DOCUMENT_ROOT__CONFIGURATION_VERSION_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__CONNECTION_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER:
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT:
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_ELEMENT_RESULT:
			case TypesPackage.DOCUMENT_ROOT__CONTENT_FILTER_RESULT:
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__CREATE_MONITORED_ITEMS_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__CREATE_SESSION_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__CREATE_SUBSCRIPTION_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__CURRENCY_UNIT_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_FILTER:
			case TypesPackage.DOCUMENT_ROOT__DATA_CHANGE_NOTIFICATION:
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_META_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_READER_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_ATTRIBUTES:
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DEFINITION:
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_NODE:
			case TypesPackage.DOCUMENT_ROOT__DATA_TYPE_SCHEMA_HEADER:
			case TypesPackage.DOCUMENT_ROOT__DATA_VALUE:
			case TypesPackage.DOCUMENT_ROOT__DECIMAL_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__DELETE_AT_TIME_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__DELETE_EVENT_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__DELETE_MONITORED_ITEMS_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_ITEM:
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__DELETE_NODES_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__DELETE_RAW_MODIFIED_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_ITEM:
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__DELETE_REFERENCES_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__DELETE_SUBSCRIPTIONS_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__DIAGNOSTIC_INFO:
			case TypesPackage.DOCUMENT_ROOT__DISCOVERY_CONFIGURATION:
			case TypesPackage.DOCUMENT_ROOT__DOUBLE_COMPLEX_NUMBER_TYPE:
			case TypesPackage.DOCUMENT_ROOT__ELEMENT_OPERAND:
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_CONFIGURATION:
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_TYPE:
			case TypesPackage.DOCUMENT_ROOT__ENDPOINT_URL_LIST_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__ENUM_DEFINITION:
			case TypesPackage.DOCUMENT_ROOT__ENUM_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__ENUM_FIELD:
			case TypesPackage.DOCUMENT_ROOT__ENUM_VALUE_TYPE:
			case TypesPackage.DOCUMENT_ROOT__EU_INFORMATION:
			case TypesPackage.DOCUMENT_ROOT__EVENT_FIELD_LIST:
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER:
			case TypesPackage.DOCUMENT_ROOT__EVENT_FILTER_RESULT:
			case TypesPackage.DOCUMENT_ROOT__EVENT_NOTIFICATION_LIST:
			case TypesPackage.DOCUMENT_ROOT__EXPANDED_NODE_ID:
			case TypesPackage.DOCUMENT_ROOT__EXTENSION_OBJECT:
			case TypesPackage.DOCUMENT_ROOT__FIELD_META_DATA:
			case TypesPackage.DOCUMENT_ROOT__FIELD_TARGET_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__FILTER_OPERAND:
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_ON_NETWORK_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__FIND_SERVERS_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__FRAME:
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTES:
			case TypesPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTE_VALUE:
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__GET_ENDPOINTS_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__GUID:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_DATA:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_EVENT_FIELD_LIST:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_MODIFIED_DATA:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_RESULT:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_READ_VALUE_ID:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__HISTORY_UPDATE_RESULT:
			case TypesPackage.DOCUMENT_ROOT__IDENTITY_MAPPING_RULE_TYPE:
			case TypesPackage.DOCUMENT_ROOT__INSTANCE_NODE:
			case TypesPackage.DOCUMENT_ROOT__ISSUED_IDENTITY_TOKEN:
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__KEY_VALUE_PAIR:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_ITEM:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_NODES_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ADD_REFERENCES_ITEM:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ALIAS_NAME_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_APPLICATION_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ARGUMENT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BOOLEAN:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_PATH_TARGET:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BROWSE_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_BYTE_STRING:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CALL_METHOD_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CARTESIAN_COORDINATES:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONFIGURATION_VERSION_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CONTENT_FILTER_ELEMENT_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_CURRENCY_UNIT_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_FIELD_CONTENT_MASK:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_META_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_ORDERING_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DEFINITION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_TYPE_SCHEMA_HEADER:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATA_VALUE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DATE_TIME:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_NODES_ITEM:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DELETE_REFERENCES_ITEM:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTIC_INFO:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DIAGNOSTICS_LEVEL:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_DOUBLE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_CONFIGURATION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DEFINITION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_FIELD:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ENUM_VALUE_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EVENT_FIELD_LIST:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXPANDED_NODE_ID:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_EXTENSION_OBJECT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_META_DATA:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FIELD_TARGET_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FLOAT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_FRAME:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GENERIC_ATTRIBUTE_VALUE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_GUID:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_EVENT_FIELD_LIST:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_READ_VALUE_ID:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_HISTORY_UPDATE_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_CRITERIA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_IDENTITY_MAPPING_RULE_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ID_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT16:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT32:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_INT64:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_KEY_VALUE_PAIR:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_LOCALIZED_TEXT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODEL_CHANGE_STRUCTURE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MODIFICATION_INFO:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_CREATE_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_MODIFY_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_MONITORED_ITEM_NOTIFICATION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NETWORK_GROUP_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_ID:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_REFERENCE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_NODE_TYPE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPEN_FILE_MODE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OPTION_SET:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ORIENTATION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_OVERRIDE_VALUE_HANDLING:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PARSING_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_EVENTS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUBLISHED_VARIABLE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_GROUP_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_PUB_SUB_STATE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUALIFIED_NAME:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_QUERY_DATA_SET:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RATIONAL_NUMBER:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_READ_VALUE_ID:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REDUNDANT_SERVER_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REFERENCE_NODE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_REGISTERED_SERVER:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_RELATIVE_PATH_ELEMENT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_ROLE_PERMISSION_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SBYTE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SERVER_ON_NETWORK:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIGNED_SOFTWARE_CERTIFICATE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_ATTRIBUTE_OPERAND:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SIMPLE_TYPE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_CODE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STATUS_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRING:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DEFINITION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_STRUCTURE_FIELD:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TARGET_VARIABLES_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DCARTESIAN_COORDINATES:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DFRAME:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DORIENTATION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_THREE_DVECTOR:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TIME_ZONE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRANSFER_RESULT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_TRUST_LIST_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UA_BINARY_FILE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_MESSAGE_CONTENT_MASK:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT16:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT32:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UINT64:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_UNION:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_USER_TOKEN_POLICY:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VARIANT:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_VECTOR:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_WRITE_VALUE:
			case TypesPackage.DOCUMENT_ROOT__LIST_OF_XML_ELEMENT:
			case TypesPackage.DOCUMENT_ROOT__LITERAL_OPERAND:
			case TypesPackage.DOCUMENT_ROOT__LOCALIZED_TEXT:
			case TypesPackage.DOCUMENT_ROOT__MDNS_DISCOVERY_CONFIGURATION:
			case TypesPackage.DOCUMENT_ROOT__METHOD_ATTRIBUTES:
			case TypesPackage.DOCUMENT_ROOT__METHOD_NODE:
			case TypesPackage.DOCUMENT_ROOT__MODEL_CHANGE_STRUCTURE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__MODIFICATION_INFO:
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__MODIFY_MONITORED_ITEMS_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__MODIFY_SUBSCRIPTION_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_CREATE_RESULT:
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_MODIFY_RESULT:
			case TypesPackage.DOCUMENT_ROOT__MONITORED_ITEM_NOTIFICATION:
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER:
			case TypesPackage.DOCUMENT_ROOT__MONITORING_FILTER_RESULT:
			case TypesPackage.DOCUMENT_ROOT__MONITORING_PARAMETERS:
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__NETWORK_ADDRESS_URL_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__NETWORK_GROUP_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__NODE:
			case TypesPackage.DOCUMENT_ROOT__NODE_ATTRIBUTES:
			case TypesPackage.DOCUMENT_ROOT__NODE_ID:
			case TypesPackage.DOCUMENT_ROOT__NODE_REFERENCE:
			case TypesPackage.DOCUMENT_ROOT__NODE_TYPE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_DATA:
			case TypesPackage.DOCUMENT_ROOT__NOTIFICATION_MESSAGE:
			case TypesPackage.DOCUMENT_ROOT__OBJECT_ATTRIBUTES:
			case TypesPackage.DOCUMENT_ROOT__OBJECT_NODE:
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_ATTRIBUTES:
			case TypesPackage.DOCUMENT_ROOT__OBJECT_TYPE_NODE:
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__OPEN_SECURE_CHANNEL_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__OPTION_SET:
			case TypesPackage.DOCUMENT_ROOT__ORIENTATION:
			case TypesPackage.DOCUMENT_ROOT__PARSING_RESULT:
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC2_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PROGRAM_DIAGNOSTIC_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_ITEMS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_EVENTS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PUBLISHED_VARIABLE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__PUBLISH_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONFIGURATION_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_CONNECTION_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__PUB_SUB_GROUP_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__QUALIFIED_NAME:
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__QUERY_DATA_SET:
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__QUERY_FIRST_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__QUERY_NEXT_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__RANGE:
			case TypesPackage.DOCUMENT_ROOT__RATIONAL_NUMBER:
			case TypesPackage.DOCUMENT_ROOT__READ_ANNOTATION_DATA_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__READ_AT_TIME_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__READER_GROUP_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__READ_EVENT_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__READ_PROCESSED_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__READ_RAW_MODIFIED_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__READ_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__READ_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__READ_VALUE_ID:
			case TypesPackage.DOCUMENT_ROOT__REDUNDANT_SERVER_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_NODE:
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_ATTRIBUTES:
			case TypesPackage.DOCUMENT_ROOT__REFERENCE_TYPE_NODE:
			case TypesPackage.DOCUMENT_ROOT__REGISTERED_SERVER:
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__REGISTER_NODES_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER2_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__REGISTER_SERVER_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH:
			case TypesPackage.DOCUMENT_ROOT__RELATIVE_PATH_ELEMENT:
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__REPUBLISH_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__REQUEST_HEADER:
			case TypesPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
			case TypesPackage.DOCUMENT_ROOT__ROLE_PERMISSION_TYPE:
			case TypesPackage.DOCUMENT_ROOT__RSA_ENCRYPTED_SECRET:
			case TypesPackage.DOCUMENT_ROOT__SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SERVER_ON_NETWORK:
			case TypesPackage.DOCUMENT_ROOT__SERVER_STATUS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SERVICE_COUNTER_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SERVICE_FAULT:
			case TypesPackage.DOCUMENT_ROOT__SESSION_AUTHENTICATION_TOKEN:
			case TypesPackage.DOCUMENT_ROOT__SESSION_DIAGNOSTICS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_REQUEST_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SESSIONLESS_INVOKE_RESPONSE_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__SET_MONITORING_MODE_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__SET_PUBLISHING_MODE_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__SET_TRIGGERING_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__SIGNATURE_DATA:
			case TypesPackage.DOCUMENT_ROOT__SIGNED_SOFTWARE_CERTIFICATE:
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_ATTRIBUTE_OPERAND:
			case TypesPackage.DOCUMENT_ROOT__SIMPLE_TYPE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__STATUS_CHANGE_NOTIFICATION:
			case TypesPackage.DOCUMENT_ROOT__STATUS_CODE:
			case TypesPackage.DOCUMENT_ROOT__STATUS_RESULT:
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__STRUCTURE_FIELD:
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_ACKNOWLEDGEMENT:
			case TypesPackage.DOCUMENT_ROOT__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__TARGET_VARIABLES_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__THREE_DCARTESIAN_COORDINATES:
			case TypesPackage.DOCUMENT_ROOT__THREE_DFRAME:
			case TypesPackage.DOCUMENT_ROOT__THREE_DORIENTATION:
			case TypesPackage.DOCUMENT_ROOT__THREE_DVECTOR:
			case TypesPackage.DOCUMENT_ROOT__TIME_ZONE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_RESULT:
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__TRANSFER_SUBSCRIPTIONS_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__TRUST_LIST_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__TYPE_NODE:
			case TypesPackage.DOCUMENT_ROOT__UA_BINARY_FILE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_READER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__UADP_WRITER_GROUP_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__UNION:
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__UNREGISTER_NODES_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__UPDATE_DATA_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__UPDATE_EVENT_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__UPDATE_STRUCTURE_DATA_DETAILS:
			case TypesPackage.DOCUMENT_ROOT__USER_IDENTITY_TOKEN:
			case TypesPackage.DOCUMENT_ROOT__USER_NAME_IDENTITY_TOKEN:
			case TypesPackage.DOCUMENT_ROOT__USER_TOKEN_POLICY:
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_ATTRIBUTES:
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_NODE:
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_ATTRIBUTES:
			case TypesPackage.DOCUMENT_ROOT__VARIABLE_TYPE_NODE:
			case TypesPackage.DOCUMENT_ROOT__VARIANT:
			case TypesPackage.DOCUMENT_ROOT__VECTOR:
			case TypesPackage.DOCUMENT_ROOT__VIEW_ATTRIBUTES:
			case TypesPackage.DOCUMENT_ROOT__VIEW_DESCRIPTION:
			case TypesPackage.DOCUMENT_ROOT__VIEW_NODE:
			case TypesPackage.DOCUMENT_ROOT__WRITE_REQUEST:
			case TypesPackage.DOCUMENT_ROOT__WRITE_RESPONSE:
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_MESSAGE_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__WRITER_GROUP_TRANSPORT_DATA_TYPE:
			case TypesPackage.DOCUMENT_ROOT__WRITE_VALUE:
			case TypesPackage.DOCUMENT_ROOT__X509_IDENTITY_TOKEN:
			case TypesPackage.DOCUMENT_ROOT__XV_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionRequest(),
				 TypesFactory.eINSTANCE.createActivateSessionRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionResponse(),
				 TypesFactory.eINSTANCE.createActivateSessionResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesItem(),
				 TypesFactory.eINSTANCE.createAddNodesItem()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesRequest(),
				 TypesFactory.eINSTANCE.createAddNodesRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResponse(),
				 TypesFactory.eINSTANCE.createAddNodesResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResult(),
				 TypesFactory.eINSTANCE.createAddNodesResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesItem(),
				 TypesFactory.eINSTANCE.createAddReferencesItem()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesRequest(),
				 TypesFactory.eINSTANCE.createAddReferencesRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesResponse(),
				 TypesFactory.eINSTANCE.createAddReferencesResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AggregateConfiguration(),
				 TypesFactory.eINSTANCE.createAggregateConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilter(),
				 TypesFactory.eINSTANCE.createAggregateFilter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilterResult(),
				 TypesFactory.eINSTANCE.createAggregateFilterResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AliasNameDataType(),
				 TypesFactory.eINSTANCE.createAliasNameDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Annotation(),
				 TypesFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AnonymousIdentityToken(),
				 TypesFactory.eINSTANCE.createAnonymousIdentityToken()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationDescription(),
				 TypesFactory.eINSTANCE.createApplicationDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Argument(),
				 TypesFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AttributeOperand(),
				 TypesFactory.eINSTANCE.createAttributeOperand()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_AxisInformation(),
				 TypesFactory.eINSTANCE.createAxisInformation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrokerConnectionTransportDataType(),
				 TypesFactory.eINSTANCE.createBrokerConnectionTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetReaderTransportDataType(),
				 TypesFactory.eINSTANCE.createBrokerDataSetReaderTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetWriterTransportDataType(),
				 TypesFactory.eINSTANCE.createBrokerDataSetWriterTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrokerWriterGroupTransportDataType(),
				 TypesFactory.eINSTANCE.createBrokerWriterGroupTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrowseDescription(),
				 TypesFactory.eINSTANCE.createBrowseDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextRequest(),
				 TypesFactory.eINSTANCE.createBrowseNextRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextResponse(),
				 TypesFactory.eINSTANCE.createBrowseNextResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePath(),
				 TypesFactory.eINSTANCE.createBrowsePath()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathResult(),
				 TypesFactory.eINSTANCE.createBrowsePathResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathTarget(),
				 TypesFactory.eINSTANCE.createBrowsePathTarget()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrowseRequest(),
				 TypesFactory.eINSTANCE.createBrowseRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResponse(),
				 TypesFactory.eINSTANCE.createBrowseResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResult(),
				 TypesFactory.eINSTANCE.createBrowseResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_BuildInfo(),
				 TypesFactory.eINSTANCE.createBuildInfo()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodRequest(),
				 TypesFactory.eINSTANCE.createCallMethodRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodResult(),
				 TypesFactory.eINSTANCE.createCallMethodResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CallRequest(),
				 TypesFactory.eINSTANCE.createCallRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CallResponse(),
				 TypesFactory.eINSTANCE.createCallResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CancelRequest(),
				 TypesFactory.eINSTANCE.createCancelRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CancelResponse(),
				 TypesFactory.eINSTANCE.createCancelResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CartesianCoordinates(),
				 TypesFactory.eINSTANCE.createCartesianCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CartesianCoordinates(),
				 TypesFactory.eINSTANCE.createThreeDCartesianCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ChannelSecurityToken(),
				 TypesFactory.eINSTANCE.createChannelSecurityToken()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelRequest(),
				 TypesFactory.eINSTANCE.createCloseSecureChannelRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelResponse(),
				 TypesFactory.eINSTANCE.createCloseSecureChannelResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionRequest(),
				 TypesFactory.eINSTANCE.createCloseSessionRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionResponse(),
				 TypesFactory.eINSTANCE.createCloseSessionResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ComplexNumberType(),
				 TypesFactory.eINSTANCE.createComplexNumberType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ConfigurationVersionDataType(),
				 TypesFactory.eINSTANCE.createConfigurationVersionDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType(),
				 TypesFactory.eINSTANCE.createConnectionTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType(),
				 TypesFactory.eINSTANCE.createBrokerConnectionTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType(),
				 TypesFactory.eINSTANCE.createDatagramConnectionTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilter(),
				 TypesFactory.eINSTANCE.createContentFilter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElement(),
				 TypesFactory.eINSTANCE.createContentFilterElement()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElementResult(),
				 TypesFactory.eINSTANCE.createContentFilterElementResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterResult(),
				 TypesFactory.eINSTANCE.createContentFilterResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsRequest(),
				 TypesFactory.eINSTANCE.createCreateMonitoredItemsRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsResponse(),
				 TypesFactory.eINSTANCE.createCreateMonitoredItemsResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionRequest(),
				 TypesFactory.eINSTANCE.createCreateSessionRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionResponse(),
				 TypesFactory.eINSTANCE.createCreateSessionResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionRequest(),
				 TypesFactory.eINSTANCE.createCreateSubscriptionRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionResponse(),
				 TypesFactory.eINSTANCE.createCreateSubscriptionResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_CurrencyUnitType(),
				 TypesFactory.eINSTANCE.createCurrencyUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeFilter(),
				 TypesFactory.eINSTANCE.createDataChangeFilter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeNotification(),
				 TypesFactory.eINSTANCE.createDataChangeNotification()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DatagramConnectionTransportDataType(),
				 TypesFactory.eINSTANCE.createDatagramConnectionTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DatagramWriterGroupTransportDataType(),
				 TypesFactory.eINSTANCE.createDatagramWriterGroupTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetMetaDataType(),
				 TypesFactory.eINSTANCE.createDataSetMetaDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderDataType(),
				 TypesFactory.eINSTANCE.createDataSetReaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType(),
				 TypesFactory.eINSTANCE.createDataSetReaderMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType(),
				 TypesFactory.eINSTANCE.createJsonDataSetReaderMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType(),
				 TypesFactory.eINSTANCE.createUadpDataSetReaderMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderTransportDataType(),
				 TypesFactory.eINSTANCE.createDataSetReaderTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderTransportDataType(),
				 TypesFactory.eINSTANCE.createBrokerDataSetReaderTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterDataType(),
				 TypesFactory.eINSTANCE.createDataSetWriterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType(),
				 TypesFactory.eINSTANCE.createDataSetWriterMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType(),
				 TypesFactory.eINSTANCE.createJsonDataSetWriterMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType(),
				 TypesFactory.eINSTANCE.createUadpDataSetWriterMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterTransportDataType(),
				 TypesFactory.eINSTANCE.createDataSetWriterTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterTransportDataType(),
				 TypesFactory.eINSTANCE.createBrokerDataSetWriterTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeAttributes(),
				 TypesFactory.eINSTANCE.createDataTypeAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition(),
				 TypesFactory.eINSTANCE.createDataTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition(),
				 TypesFactory.eINSTANCE.createEnumDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition(),
				 TypesFactory.eINSTANCE.createStructureDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(),
				 TypesFactory.eINSTANCE.createDataTypeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(),
				 TypesFactory.eINSTANCE.createEnumDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(),
				 TypesFactory.eINSTANCE.createSimpleTypeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(),
				 TypesFactory.eINSTANCE.createStructureDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeNode(),
				 TypesFactory.eINSTANCE.createDataTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader(),
				 TypesFactory.eINSTANCE.createDataTypeSchemaHeader()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader(),
				 TypesFactory.eINSTANCE.createDataSetMetaDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader(),
				 TypesFactory.eINSTANCE.createUABinaryFileDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DataValue(),
				 TypesFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DecimalDataType(),
				 TypesFactory.eINSTANCE.createDecimalDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteAtTimeDetails(),
				 TypesFactory.eINSTANCE.createDeleteAtTimeDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteEventDetails(),
				 TypesFactory.eINSTANCE.createDeleteEventDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsRequest(),
				 TypesFactory.eINSTANCE.createDeleteMonitoredItemsRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsResponse(),
				 TypesFactory.eINSTANCE.createDeleteMonitoredItemsResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesItem(),
				 TypesFactory.eINSTANCE.createDeleteNodesItem()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesRequest(),
				 TypesFactory.eINSTANCE.createDeleteNodesRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesResponse(),
				 TypesFactory.eINSTANCE.createDeleteNodesResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteRawModifiedDetails(),
				 TypesFactory.eINSTANCE.createDeleteRawModifiedDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesItem(),
				 TypesFactory.eINSTANCE.createDeleteReferencesItem()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesRequest(),
				 TypesFactory.eINSTANCE.createDeleteReferencesRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesResponse(),
				 TypesFactory.eINSTANCE.createDeleteReferencesResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsRequest(),
				 TypesFactory.eINSTANCE.createDeleteSubscriptionsRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsResponse(),
				 TypesFactory.eINSTANCE.createDeleteSubscriptionsResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DiagnosticInfo(),
				 TypesFactory.eINSTANCE.createDiagnosticInfo()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DiscoveryConfiguration(),
				 TypesFactory.eINSTANCE.createDiscoveryConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DiscoveryConfiguration(),
				 TypesFactory.eINSTANCE.createMdnsDiscoveryConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_DoubleComplexNumberType(),
				 TypesFactory.eINSTANCE.createDoubleComplexNumberType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ElementOperand(),
				 TypesFactory.eINSTANCE.createElementOperand()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EndpointConfiguration(),
				 TypesFactory.eINSTANCE.createEndpointConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EndpointDescription(),
				 TypesFactory.eINSTANCE.createEndpointDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EndpointType(),
				 TypesFactory.eINSTANCE.createEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EndpointUrlListDataType(),
				 TypesFactory.eINSTANCE.createEndpointUrlListDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EnumDefinition(),
				 TypesFactory.eINSTANCE.createEnumDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EnumDescription(),
				 TypesFactory.eINSTANCE.createEnumDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EnumField(),
				 TypesFactory.eINSTANCE.createEnumField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EnumValueType(),
				 TypesFactory.eINSTANCE.createEnumValueType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EnumValueType(),
				 TypesFactory.eINSTANCE.createEnumField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EUInformation(),
				 TypesFactory.eINSTANCE.createEUInformation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EventFieldList(),
				 TypesFactory.eINSTANCE.createEventFieldList()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EventFilter(),
				 TypesFactory.eINSTANCE.createEventFilter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EventFilterResult(),
				 TypesFactory.eINSTANCE.createEventFilterResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_EventNotificationList(),
				 TypesFactory.eINSTANCE.createEventNotificationList()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ExpandedNodeId(),
				 TypesFactory.eINSTANCE.createExpandedNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ExtensionObject(),
				 TypesFactory.eINSTANCE.createExtensionObject()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FieldMetaData(),
				 TypesFactory.eINSTANCE.createFieldMetaData()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FieldTargetDataType(),
				 TypesFactory.eINSTANCE.createFieldTargetDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(),
				 TypesFactory.eINSTANCE.createFilterOperand()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(),
				 TypesFactory.eINSTANCE.createAttributeOperand()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(),
				 TypesFactory.eINSTANCE.createElementOperand()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(),
				 TypesFactory.eINSTANCE.createLiteralOperand()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(),
				 TypesFactory.eINSTANCE.createSimpleAttributeOperand()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkRequest(),
				 TypesFactory.eINSTANCE.createFindServersOnNetworkRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkResponse(),
				 TypesFactory.eINSTANCE.createFindServersOnNetworkResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FindServersRequest(),
				 TypesFactory.eINSTANCE.createFindServersRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_FindServersResponse(),
				 TypesFactory.eINSTANCE.createFindServersResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Frame(),
				 TypesFactory.eINSTANCE.createFrame()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Frame(),
				 TypesFactory.eINSTANCE.createThreeDFrame()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributes(),
				 TypesFactory.eINSTANCE.createGenericAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributeValue(),
				 TypesFactory.eINSTANCE.createGenericAttributeValue()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsRequest(),
				 TypesFactory.eINSTANCE.createGetEndpointsRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsResponse(),
				 TypesFactory.eINSTANCE.createGetEndpointsResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Guid(),
				 TypesFactory.eINSTANCE.createGuid()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryData(),
				 TypesFactory.eINSTANCE.createHistoryData()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryData(),
				 TypesFactory.eINSTANCE.createHistoryModifiedData()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEvent(),
				 TypesFactory.eINSTANCE.createHistoryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEventFieldList(),
				 TypesFactory.eINSTANCE.createHistoryEventFieldList()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryModifiedData(),
				 TypesFactory.eINSTANCE.createHistoryModifiedData()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
				 TypesFactory.eINSTANCE.createHistoryReadDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
				 TypesFactory.eINSTANCE.createReadAnnotationDataDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
				 TypesFactory.eINSTANCE.createReadAtTimeDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
				 TypesFactory.eINSTANCE.createReadEventDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
				 TypesFactory.eINSTANCE.createReadProcessedDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
				 TypesFactory.eINSTANCE.createReadRawModifiedDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadRequest(),
				 TypesFactory.eINSTANCE.createHistoryReadRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResponse(),
				 TypesFactory.eINSTANCE.createHistoryReadResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResult(),
				 TypesFactory.eINSTANCE.createHistoryReadResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadValueId(),
				 TypesFactory.eINSTANCE.createHistoryReadValueId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
				 TypesFactory.eINSTANCE.createHistoryUpdateDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
				 TypesFactory.eINSTANCE.createDeleteAtTimeDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
				 TypesFactory.eINSTANCE.createDeleteEventDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
				 TypesFactory.eINSTANCE.createDeleteRawModifiedDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
				 TypesFactory.eINSTANCE.createUpdateDataDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
				 TypesFactory.eINSTANCE.createUpdateEventDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
				 TypesFactory.eINSTANCE.createUpdateStructureDataDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateRequest(),
				 TypesFactory.eINSTANCE.createHistoryUpdateRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResponse(),
				 TypesFactory.eINSTANCE.createHistoryUpdateResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResult(),
				 TypesFactory.eINSTANCE.createHistoryUpdateResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_IdentityMappingRuleType(),
				 TypesFactory.eINSTANCE.createIdentityMappingRuleType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(),
				 TypesFactory.eINSTANCE.createInstanceNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(),
				 TypesFactory.eINSTANCE.createMethodNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(),
				 TypesFactory.eINSTANCE.createObjectNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(),
				 TypesFactory.eINSTANCE.createVariableNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(),
				 TypesFactory.eINSTANCE.createViewNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_IssuedIdentityToken(),
				 TypesFactory.eINSTANCE.createIssuedIdentityToken()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetReaderMessageDataType(),
				 TypesFactory.eINSTANCE.createJsonDataSetReaderMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetWriterMessageDataType(),
				 TypesFactory.eINSTANCE.createJsonDataSetWriterMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_JsonWriterGroupMessageDataType(),
				 TypesFactory.eINSTANCE.createJsonWriterGroupMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_KeyValuePair(),
				 TypesFactory.eINSTANCE.createKeyValuePair()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesItem(),
				 TypesFactory.eINSTANCE.createListOfAddNodesItem()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesResult(),
				 TypesFactory.eINSTANCE.createListOfAddNodesResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddReferencesItem(),
				 TypesFactory.eINSTANCE.createListOfAddReferencesItem()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAliasNameDataType(),
				 TypesFactory.eINSTANCE.createListOfAliasNameDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfApplicationDescription(),
				 TypesFactory.eINSTANCE.createListOfApplicationDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfArgument(),
				 TypesFactory.eINSTANCE.createListOfArgument()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBoolean(),
				 TypesFactory.eINSTANCE.createListOfBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerConnectionTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfBrokerConnectionTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetReaderTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfBrokerDataSetReaderTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetWriterTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfBrokerDataSetWriterTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerTransportQualityOfService(),
				 TypesFactory.eINSTANCE.createListOfBrokerTransportQualityOfService()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerWriterGroupTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfBrokerWriterGroupTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseDescription(),
				 TypesFactory.eINSTANCE.createListOfBrowseDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePath(),
				 TypesFactory.eINSTANCE.createListOfBrowsePath()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathResult(),
				 TypesFactory.eINSTANCE.createListOfBrowsePathResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathTarget(),
				 TypesFactory.eINSTANCE.createListOfBrowsePathTarget()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseResult(),
				 TypesFactory.eINSTANCE.createListOfBrowseResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByte(),
				 TypesFactory.eINSTANCE.createListOfByte()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByteString(),
				 TypesFactory.eINSTANCE.createListOfByteString()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodRequest(),
				 TypesFactory.eINSTANCE.createListOfCallMethodRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodResult(),
				 TypesFactory.eINSTANCE.createListOfCallMethodResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCartesianCoordinates(),
				 TypesFactory.eINSTANCE.createListOfCartesianCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConfigurationVersionDataType(),
				 TypesFactory.eINSTANCE.createListOfConfigurationVersionDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConnectionTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfConnectionTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilter(),
				 TypesFactory.eINSTANCE.createListOfContentFilter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElement(),
				 TypesFactory.eINSTANCE.createListOfContentFilterElement()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElementResult(),
				 TypesFactory.eINSTANCE.createListOfContentFilterElementResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCurrencyUnitType(),
				 TypesFactory.eINSTANCE.createListOfCurrencyUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramConnectionTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfDatagramConnectionTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramWriterGroupTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfDatagramWriterGroupTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetFieldContentMask(),
				 TypesFactory.eINSTANCE.createListOfDataSetFieldContentMask()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetMetaDataType(),
				 TypesFactory.eINSTANCE.createListOfDataSetMetaDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetOrderingType(),
				 TypesFactory.eINSTANCE.createListOfDataSetOrderingType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderDataType(),
				 TypesFactory.eINSTANCE.createListOfDataSetReaderDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderMessageDataType(),
				 TypesFactory.eINSTANCE.createListOfDataSetReaderMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfDataSetReaderTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterDataType(),
				 TypesFactory.eINSTANCE.createListOfDataSetWriterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterMessageDataType(),
				 TypesFactory.eINSTANCE.createListOfDataSetWriterMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfDataSetWriterTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDefinition(),
				 TypesFactory.eINSTANCE.createListOfDataTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDescription(),
				 TypesFactory.eINSTANCE.createListOfDataTypeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeSchemaHeader(),
				 TypesFactory.eINSTANCE.createListOfDataTypeSchemaHeader()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataValue(),
				 TypesFactory.eINSTANCE.createListOfDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDateTime(),
				 TypesFactory.eINSTANCE.createListOfDateTime()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteNodesItem(),
				 TypesFactory.eINSTANCE.createListOfDeleteNodesItem()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteReferencesItem(),
				 TypesFactory.eINSTANCE.createListOfDeleteReferencesItem()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticInfo(),
				 TypesFactory.eINSTANCE.createListOfDiagnosticInfo()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticsLevel(),
				 TypesFactory.eINSTANCE.createListOfDiagnosticsLevel()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDouble(),
				 TypesFactory.eINSTANCE.createListOfDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointConfiguration(),
				 TypesFactory.eINSTANCE.createListOfEndpointConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointDescription(),
				 TypesFactory.eINSTANCE.createListOfEndpointDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointType(),
				 TypesFactory.eINSTANCE.createListOfEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointUrlListDataType(),
				 TypesFactory.eINSTANCE.createListOfEndpointUrlListDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDefinition(),
				 TypesFactory.eINSTANCE.createListOfEnumDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDescription(),
				 TypesFactory.eINSTANCE.createListOfEnumDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumField(),
				 TypesFactory.eINSTANCE.createListOfEnumField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumValueType(),
				 TypesFactory.eINSTANCE.createListOfEnumValueType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEventFieldList(),
				 TypesFactory.eINSTANCE.createListOfEventFieldList()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExpandedNodeId(),
				 TypesFactory.eINSTANCE.createListOfExpandedNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExtensionObject(),
				 TypesFactory.eINSTANCE.createListOfExtensionObject()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldMetaData(),
				 TypesFactory.eINSTANCE.createListOfFieldMetaData()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldTargetDataType(),
				 TypesFactory.eINSTANCE.createListOfFieldTargetDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFloat(),
				 TypesFactory.eINSTANCE.createListOfFloat()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFrame(),
				 TypesFactory.eINSTANCE.createListOfFrame()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGenericAttributeValue(),
				 TypesFactory.eINSTANCE.createListOfGenericAttributeValue()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGuid(),
				 TypesFactory.eINSTANCE.createListOfGuid()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryEventFieldList(),
				 TypesFactory.eINSTANCE.createListOfHistoryEventFieldList()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadResult(),
				 TypesFactory.eINSTANCE.createListOfHistoryReadResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadValueId(),
				 TypesFactory.eINSTANCE.createListOfHistoryReadValueId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryUpdateResult(),
				 TypesFactory.eINSTANCE.createListOfHistoryUpdateResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityCriteriaType(),
				 TypesFactory.eINSTANCE.createListOfIdentityCriteriaType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityMappingRuleType(),
				 TypesFactory.eINSTANCE.createListOfIdentityMappingRuleType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdType(),
				 TypesFactory.eINSTANCE.createListOfIdType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt16(),
				 TypesFactory.eINSTANCE.createListOfInt16()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt32(),
				 TypesFactory.eINSTANCE.createListOfInt32()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt64(),
				 TypesFactory.eINSTANCE.createListOfInt64()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetMessageContentMask(),
				 TypesFactory.eINSTANCE.createListOfJsonDataSetMessageContentMask()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetReaderMessageDataType(),
				 TypesFactory.eINSTANCE.createListOfJsonDataSetReaderMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetWriterMessageDataType(),
				 TypesFactory.eINSTANCE.createListOfJsonDataSetWriterMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonNetworkMessageContentMask(),
				 TypesFactory.eINSTANCE.createListOfJsonNetworkMessageContentMask()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonWriterGroupMessageDataType(),
				 TypesFactory.eINSTANCE.createListOfJsonWriterGroupMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfKeyValuePair(),
				 TypesFactory.eINSTANCE.createListOfKeyValuePair()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfLocalizedText(),
				 TypesFactory.eINSTANCE.createListOfLocalizedText()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModelChangeStructureDataType(),
				 TypesFactory.eINSTANCE.createListOfModelChangeStructureDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModificationInfo(),
				 TypesFactory.eINSTANCE.createListOfModificationInfo()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateRequest(),
				 TypesFactory.eINSTANCE.createListOfMonitoredItemCreateRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateResult(),
				 TypesFactory.eINSTANCE.createListOfMonitoredItemCreateResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyRequest(),
				 TypesFactory.eINSTANCE.createListOfMonitoredItemModifyRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyResult(),
				 TypesFactory.eINSTANCE.createListOfMonitoredItemModifyResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemNotification(),
				 TypesFactory.eINSTANCE.createListOfMonitoredItemNotification()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressDataType(),
				 TypesFactory.eINSTANCE.createListOfNetworkAddressDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressUrlDataType(),
				 TypesFactory.eINSTANCE.createListOfNetworkAddressUrlDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkGroupDataType(),
				 TypesFactory.eINSTANCE.createListOfNetworkGroupDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNode(),
				 TypesFactory.eINSTANCE.createListOfNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeId(),
				 TypesFactory.eINSTANCE.createListOfNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeReference(),
				 TypesFactory.eINSTANCE.createListOfNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeTypeDescription(),
				 TypesFactory.eINSTANCE.createListOfNodeTypeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOpenFileMode(),
				 TypesFactory.eINSTANCE.createListOfOpenFileMode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOptionSet(),
				 TypesFactory.eINSTANCE.createListOfOptionSet()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOrientation(),
				 TypesFactory.eINSTANCE.createListOfOrientation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOverrideValueHandling(),
				 TypesFactory.eINSTANCE.createListOfOverrideValueHandling()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfParsingResult(),
				 TypesFactory.eINSTANCE.createListOfParsingResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataItemsDataType(),
				 TypesFactory.eINSTANCE.createListOfPublishedDataItemsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetDataType(),
				 TypesFactory.eINSTANCE.createListOfPublishedDataSetDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetSourceDataType(),
				 TypesFactory.eINSTANCE.createListOfPublishedDataSetSourceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedEventsDataType(),
				 TypesFactory.eINSTANCE.createListOfPublishedEventsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedVariableDataType(),
				 TypesFactory.eINSTANCE.createListOfPublishedVariableDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConfigurationDataType(),
				 TypesFactory.eINSTANCE.createListOfPubSubConfigurationDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConnectionDataType(),
				 TypesFactory.eINSTANCE.createListOfPubSubConnectionDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubDiagnosticsCounterClassification(),
				 TypesFactory.eINSTANCE.createListOfPubSubDiagnosticsCounterClassification()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubGroupDataType(),
				 TypesFactory.eINSTANCE.createListOfPubSubGroupDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubState(),
				 TypesFactory.eINSTANCE.createListOfPubSubState()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQualifiedName(),
				 TypesFactory.eINSTANCE.createListOfQualifiedName()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataDescription(),
				 TypesFactory.eINSTANCE.createListOfQueryDataDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataSet(),
				 TypesFactory.eINSTANCE.createListOfQueryDataSet()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRationalNumber(),
				 TypesFactory.eINSTANCE.createListOfRationalNumber()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupDataType(),
				 TypesFactory.eINSTANCE.createListOfReaderGroupDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupMessageDataType(),
				 TypesFactory.eINSTANCE.createListOfReaderGroupMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfReaderGroupTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReadValueId(),
				 TypesFactory.eINSTANCE.createListOfReadValueId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRedundantServerDataType(),
				 TypesFactory.eINSTANCE.createListOfRedundantServerDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceDescription(),
				 TypesFactory.eINSTANCE.createListOfReferenceDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceNode(),
				 TypesFactory.eINSTANCE.createListOfReferenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRegisteredServer(),
				 TypesFactory.eINSTANCE.createListOfRegisteredServer()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRelativePathElement(),
				 TypesFactory.eINSTANCE.createListOfRelativePathElement()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRolePermissionType(),
				 TypesFactory.eINSTANCE.createListOfRolePermissionType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSamplingIntervalDiagnosticsDataType(),
				 TypesFactory.eINSTANCE.createListOfSamplingIntervalDiagnosticsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSByte(),
				 TypesFactory.eINSTANCE.createListOfSByte()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSemanticChangeStructureDataType(),
				 TypesFactory.eINSTANCE.createListOfSemanticChangeStructureDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfServerOnNetwork(),
				 TypesFactory.eINSTANCE.createListOfServerOnNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionDiagnosticsDataType(),
				 TypesFactory.eINSTANCE.createListOfSessionDiagnosticsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionSecurityDiagnosticsDataType(),
				 TypesFactory.eINSTANCE.createListOfSessionSecurityDiagnosticsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSignedSoftwareCertificate(),
				 TypesFactory.eINSTANCE.createListOfSignedSoftwareCertificate()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleAttributeOperand(),
				 TypesFactory.eINSTANCE.createListOfSimpleAttributeOperand()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleTypeDescription(),
				 TypesFactory.eINSTANCE.createListOfSimpleTypeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusCode(),
				 TypesFactory.eINSTANCE.createListOfStatusCode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusResult(),
				 TypesFactory.eINSTANCE.createListOfStatusResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfString(),
				 TypesFactory.eINSTANCE.createListOfString()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDefinition(),
				 TypesFactory.eINSTANCE.createListOfStructureDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDescription(),
				 TypesFactory.eINSTANCE.createListOfStructureDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureField(),
				 TypesFactory.eINSTANCE.createListOfStructureField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetDataType(),
				 TypesFactory.eINSTANCE.createListOfSubscribedDataSetDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetMirrorDataType(),
				 TypesFactory.eINSTANCE.createListOfSubscribedDataSetMirrorDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionAcknowledgement(),
				 TypesFactory.eINSTANCE.createListOfSubscriptionAcknowledgement()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionDiagnosticsDataType(),
				 TypesFactory.eINSTANCE.createListOfSubscriptionDiagnosticsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTargetVariablesDataType(),
				 TypesFactory.eINSTANCE.createListOfTargetVariablesDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDCartesianCoordinates(),
				 TypesFactory.eINSTANCE.createListOfThreeDCartesianCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDFrame(),
				 TypesFactory.eINSTANCE.createListOfThreeDFrame()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDOrientation(),
				 TypesFactory.eINSTANCE.createListOfThreeDOrientation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDVector(),
				 TypesFactory.eINSTANCE.createListOfThreeDVector()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTimeZoneDataType(),
				 TypesFactory.eINSTANCE.createListOfTimeZoneDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTransferResult(),
				 TypesFactory.eINSTANCE.createListOfTransferResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTrustListDataType(),
				 TypesFactory.eINSTANCE.createListOfTrustListDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUABinaryFileDataType(),
				 TypesFactory.eINSTANCE.createListOfUABinaryFileDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetMessageContentMask(),
				 TypesFactory.eINSTANCE.createListOfUadpDataSetMessageContentMask()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetReaderMessageDataType(),
				 TypesFactory.eINSTANCE.createListOfUadpDataSetReaderMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetWriterMessageDataType(),
				 TypesFactory.eINSTANCE.createListOfUadpDataSetWriterMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpNetworkMessageContentMask(),
				 TypesFactory.eINSTANCE.createListOfUadpNetworkMessageContentMask()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpWriterGroupMessageDataType(),
				 TypesFactory.eINSTANCE.createListOfUadpWriterGroupMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt16(),
				 TypesFactory.eINSTANCE.createListOfUInt16()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt32(),
				 TypesFactory.eINSTANCE.createListOfUInt32()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt64(),
				 TypesFactory.eINSTANCE.createListOfUInt64()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUnion(),
				 TypesFactory.eINSTANCE.createListOfUnion()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUserTokenPolicy(),
				 TypesFactory.eINSTANCE.createListOfUserTokenPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVariant(),
				 TypesFactory.eINSTANCE.createListOfVariant()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVector(),
				 TypesFactory.eINSTANCE.createListOfVector()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupDataType(),
				 TypesFactory.eINSTANCE.createListOfWriterGroupDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupMessageDataType(),
				 TypesFactory.eINSTANCE.createListOfWriterGroupMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupTransportDataType(),
				 TypesFactory.eINSTANCE.createListOfWriterGroupTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriteValue(),
				 TypesFactory.eINSTANCE.createListOfWriteValue()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ListOfXmlElement(),
				 TypesFactory.eINSTANCE.createListOfXmlElement()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_LiteralOperand(),
				 TypesFactory.eINSTANCE.createLiteralOperand()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_LocalizedText(),
				 TypesFactory.eINSTANCE.createLocalizedText()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MdnsDiscoveryConfiguration(),
				 TypesFactory.eINSTANCE.createMdnsDiscoveryConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MethodAttributes(),
				 TypesFactory.eINSTANCE.createMethodAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MethodNode(),
				 TypesFactory.eINSTANCE.createMethodNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ModelChangeStructureDataType(),
				 TypesFactory.eINSTANCE.createModelChangeStructureDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ModificationInfo(),
				 TypesFactory.eINSTANCE.createModificationInfo()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsRequest(),
				 TypesFactory.eINSTANCE.createModifyMonitoredItemsRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsResponse(),
				 TypesFactory.eINSTANCE.createModifyMonitoredItemsResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionRequest(),
				 TypesFactory.eINSTANCE.createModifySubscriptionRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionResponse(),
				 TypesFactory.eINSTANCE.createModifySubscriptionResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateRequest(),
				 TypesFactory.eINSTANCE.createMonitoredItemCreateRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateResult(),
				 TypesFactory.eINSTANCE.createMonitoredItemCreateResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyRequest(),
				 TypesFactory.eINSTANCE.createMonitoredItemModifyRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyResult(),
				 TypesFactory.eINSTANCE.createMonitoredItemModifyResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemNotification(),
				 TypesFactory.eINSTANCE.createMonitoredItemNotification()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(),
				 TypesFactory.eINSTANCE.createMonitoringFilter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(),
				 TypesFactory.eINSTANCE.createAggregateFilter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(),
				 TypesFactory.eINSTANCE.createDataChangeFilter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(),
				 TypesFactory.eINSTANCE.createEventFilter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult(),
				 TypesFactory.eINSTANCE.createMonitoringFilterResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult(),
				 TypesFactory.eINSTANCE.createAggregateFilterResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult(),
				 TypesFactory.eINSTANCE.createEventFilterResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringParameters(),
				 TypesFactory.eINSTANCE.createMonitoringParameters()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressDataType(),
				 TypesFactory.eINSTANCE.createNetworkAddressDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressDataType(),
				 TypesFactory.eINSTANCE.createNetworkAddressUrlDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressUrlDataType(),
				 TypesFactory.eINSTANCE.createNetworkAddressUrlDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NetworkGroupDataType(),
				 TypesFactory.eINSTANCE.createNetworkGroupDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createDataTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createInstanceNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createMethodNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createObjectNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createObjectTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createReferenceTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createVariableNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createVariableTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
				 TypesFactory.eINSTANCE.createViewNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
				 TypesFactory.eINSTANCE.createNodeAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
				 TypesFactory.eINSTANCE.createDataTypeAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
				 TypesFactory.eINSTANCE.createGenericAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
				 TypesFactory.eINSTANCE.createMethodAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
				 TypesFactory.eINSTANCE.createObjectAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
				 TypesFactory.eINSTANCE.createObjectTypeAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
				 TypesFactory.eINSTANCE.createReferenceTypeAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
				 TypesFactory.eINSTANCE.createVariableAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
				 TypesFactory.eINSTANCE.createVariableTypeAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
				 TypesFactory.eINSTANCE.createViewAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeId(),
				 TypesFactory.eINSTANCE.createNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeReference(),
				 TypesFactory.eINSTANCE.createNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NodeTypeDescription(),
				 TypesFactory.eINSTANCE.createNodeTypeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(),
				 TypesFactory.eINSTANCE.createNotificationData()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(),
				 TypesFactory.eINSTANCE.createDataChangeNotification()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(),
				 TypesFactory.eINSTANCE.createEventNotificationList()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(),
				 TypesFactory.eINSTANCE.createStatusChangeNotification()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_NotificationMessage(),
				 TypesFactory.eINSTANCE.createNotificationMessage()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ObjectAttributes(),
				 TypesFactory.eINSTANCE.createObjectAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ObjectNode(),
				 TypesFactory.eINSTANCE.createObjectNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeAttributes(),
				 TypesFactory.eINSTANCE.createObjectTypeAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeNode(),
				 TypesFactory.eINSTANCE.createObjectTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelRequest(),
				 TypesFactory.eINSTANCE.createOpenSecureChannelRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelResponse(),
				 TypesFactory.eINSTANCE.createOpenSecureChannelResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_OptionSet(),
				 TypesFactory.eINSTANCE.createOptionSet()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Orientation(),
				 TypesFactory.eINSTANCE.createOrientation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Orientation(),
				 TypesFactory.eINSTANCE.createThreeDOrientation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ParsingResult(),
				 TypesFactory.eINSTANCE.createParsingResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnostic2DataType(),
				 TypesFactory.eINSTANCE.createProgramDiagnostic2DataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnosticDataType(),
				 TypesFactory.eINSTANCE.createProgramDiagnosticDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataItemsDataType(),
				 TypesFactory.eINSTANCE.createPublishedDataItemsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetDataType(),
				 TypesFactory.eINSTANCE.createPublishedDataSetDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType(),
				 TypesFactory.eINSTANCE.createPublishedDataSetSourceDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType(),
				 TypesFactory.eINSTANCE.createPublishedDataItemsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType(),
				 TypesFactory.eINSTANCE.createPublishedEventsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PublishedEventsDataType(),
				 TypesFactory.eINSTANCE.createPublishedEventsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PublishedVariableDataType(),
				 TypesFactory.eINSTANCE.createPublishedVariableDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PublishRequest(),
				 TypesFactory.eINSTANCE.createPublishRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PublishResponse(),
				 TypesFactory.eINSTANCE.createPublishResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConfigurationDataType(),
				 TypesFactory.eINSTANCE.createPubSubConfigurationDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConnectionDataType(),
				 TypesFactory.eINSTANCE.createPubSubConnectionDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType(),
				 TypesFactory.eINSTANCE.createPubSubGroupDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType(),
				 TypesFactory.eINSTANCE.createReaderGroupDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType(),
				 TypesFactory.eINSTANCE.createWriterGroupDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_QualifiedName(),
				 TypesFactory.eINSTANCE.createQualifiedName()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataDescription(),
				 TypesFactory.eINSTANCE.createQueryDataDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataSet(),
				 TypesFactory.eINSTANCE.createQueryDataSet()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstRequest(),
				 TypesFactory.eINSTANCE.createQueryFirstRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstResponse(),
				 TypesFactory.eINSTANCE.createQueryFirstResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextRequest(),
				 TypesFactory.eINSTANCE.createQueryNextRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextResponse(),
				 TypesFactory.eINSTANCE.createQueryNextResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Range(),
				 TypesFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RationalNumber(),
				 TypesFactory.eINSTANCE.createRationalNumber()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReadAnnotationDataDetails(),
				 TypesFactory.eINSTANCE.createReadAnnotationDataDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReadAtTimeDetails(),
				 TypesFactory.eINSTANCE.createReadAtTimeDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupDataType(),
				 TypesFactory.eINSTANCE.createReaderGroupDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupMessageDataType(),
				 TypesFactory.eINSTANCE.createReaderGroupMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupTransportDataType(),
				 TypesFactory.eINSTANCE.createReaderGroupTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReadEventDetails(),
				 TypesFactory.eINSTANCE.createReadEventDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReadProcessedDetails(),
				 TypesFactory.eINSTANCE.createReadProcessedDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReadRawModifiedDetails(),
				 TypesFactory.eINSTANCE.createReadRawModifiedDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReadRequest(),
				 TypesFactory.eINSTANCE.createReadRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReadResponse(),
				 TypesFactory.eINSTANCE.createReadResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReadValueId(),
				 TypesFactory.eINSTANCE.createReadValueId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RedundantServerDataType(),
				 TypesFactory.eINSTANCE.createRedundantServerDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceDescription(),
				 TypesFactory.eINSTANCE.createReferenceDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceNode(),
				 TypesFactory.eINSTANCE.createReferenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeAttributes(),
				 TypesFactory.eINSTANCE.createReferenceTypeAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeNode(),
				 TypesFactory.eINSTANCE.createReferenceTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RegisteredServer(),
				 TypesFactory.eINSTANCE.createRegisteredServer()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesRequest(),
				 TypesFactory.eINSTANCE.createRegisterNodesRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesResponse(),
				 TypesFactory.eINSTANCE.createRegisterNodesResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Request(),
				 TypesFactory.eINSTANCE.createRegisterServer2Request()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Response(),
				 TypesFactory.eINSTANCE.createRegisterServer2Response()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerRequest(),
				 TypesFactory.eINSTANCE.createRegisterServerRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerResponse(),
				 TypesFactory.eINSTANCE.createRegisterServerResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RelativePath(),
				 TypesFactory.eINSTANCE.createRelativePath()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RelativePathElement(),
				 TypesFactory.eINSTANCE.createRelativePathElement()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RepublishRequest(),
				 TypesFactory.eINSTANCE.createRepublishRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RepublishResponse(),
				 TypesFactory.eINSTANCE.createRepublishResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RequestHeader(),
				 TypesFactory.eINSTANCE.createRequestHeader()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ResponseHeader(),
				 TypesFactory.eINSTANCE.createResponseHeader()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RolePermissionType(),
				 TypesFactory.eINSTANCE.createRolePermissionType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_RsaEncryptedSecret(),
				 TypesFactory.eINSTANCE.createVariant()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SamplingIntervalDiagnosticsDataType(),
				 TypesFactory.eINSTANCE.createSamplingIntervalDiagnosticsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SemanticChangeStructureDataType(),
				 TypesFactory.eINSTANCE.createSemanticChangeStructureDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ServerDiagnosticsSummaryDataType(),
				 TypesFactory.eINSTANCE.createServerDiagnosticsSummaryDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ServerOnNetwork(),
				 TypesFactory.eINSTANCE.createServerOnNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ServerStatusDataType(),
				 TypesFactory.eINSTANCE.createServerStatusDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ServiceCounterDataType(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ServiceFault(),
				 TypesFactory.eINSTANCE.createServiceFault()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SessionAuthenticationToken(),
				 TypesFactory.eINSTANCE.createNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SessionDiagnosticsDataType(),
				 TypesFactory.eINSTANCE.createSessionDiagnosticsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeRequestType(),
				 TypesFactory.eINSTANCE.createSessionlessInvokeRequestType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeResponseType(),
				 TypesFactory.eINSTANCE.createSessionlessInvokeResponseType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SessionSecurityDiagnosticsDataType(),
				 TypesFactory.eINSTANCE.createSessionSecurityDiagnosticsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeRequest(),
				 TypesFactory.eINSTANCE.createSetMonitoringModeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeResponse(),
				 TypesFactory.eINSTANCE.createSetMonitoringModeResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeRequest(),
				 TypesFactory.eINSTANCE.createSetPublishingModeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeResponse(),
				 TypesFactory.eINSTANCE.createSetPublishingModeResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringRequest(),
				 TypesFactory.eINSTANCE.createSetTriggeringRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringResponse(),
				 TypesFactory.eINSTANCE.createSetTriggeringResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SignatureData(),
				 TypesFactory.eINSTANCE.createSignatureData()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SignedSoftwareCertificate(),
				 TypesFactory.eINSTANCE.createSignedSoftwareCertificate()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SimpleAttributeOperand(),
				 TypesFactory.eINSTANCE.createSimpleAttributeOperand()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SimpleTypeDescription(),
				 TypesFactory.eINSTANCE.createSimpleTypeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_StatusChangeNotification(),
				 TypesFactory.eINSTANCE.createStatusChangeNotification()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_StatusCode(),
				 TypesFactory.eINSTANCE.createStatusCode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_StatusResult(),
				 TypesFactory.eINSTANCE.createStatusResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_StructureDefinition(),
				 TypesFactory.eINSTANCE.createStructureDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_StructureDescription(),
				 TypesFactory.eINSTANCE.createStructureDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_StructureField(),
				 TypesFactory.eINSTANCE.createStructureField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType(),
				 TypesFactory.eINSTANCE.createSubscribedDataSetDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType(),
				 TypesFactory.eINSTANCE.createSubscribedDataSetMirrorDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType(),
				 TypesFactory.eINSTANCE.createTargetVariablesDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetMirrorDataType(),
				 TypesFactory.eINSTANCE.createSubscribedDataSetMirrorDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionAcknowledgement(),
				 TypesFactory.eINSTANCE.createSubscriptionAcknowledgement()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionDiagnosticsDataType(),
				 TypesFactory.eINSTANCE.createSubscriptionDiagnosticsDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TargetVariablesDataType(),
				 TypesFactory.eINSTANCE.createTargetVariablesDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDCartesianCoordinates(),
				 TypesFactory.eINSTANCE.createThreeDCartesianCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDFrame(),
				 TypesFactory.eINSTANCE.createThreeDFrame()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDOrientation(),
				 TypesFactory.eINSTANCE.createThreeDOrientation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDVector(),
				 TypesFactory.eINSTANCE.createThreeDVector()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TimeZoneDataType(),
				 TypesFactory.eINSTANCE.createTimeZoneDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TransferResult(),
				 TypesFactory.eINSTANCE.createTransferResult()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsRequest(),
				 TypesFactory.eINSTANCE.createTransferSubscriptionsRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsResponse(),
				 TypesFactory.eINSTANCE.createTransferSubscriptionsResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsRequest(),
				 TypesFactory.eINSTANCE.createTranslateBrowsePathsToNodeIdsRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsResponse(),
				 TypesFactory.eINSTANCE.createTranslateBrowsePathsToNodeIdsResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TrustListDataType(),
				 TypesFactory.eINSTANCE.createTrustListDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(),
				 TypesFactory.eINSTANCE.createTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(),
				 TypesFactory.eINSTANCE.createDataTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(),
				 TypesFactory.eINSTANCE.createObjectTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(),
				 TypesFactory.eINSTANCE.createReferenceTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(),
				 TypesFactory.eINSTANCE.createVariableTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UABinaryFileDataType(),
				 TypesFactory.eINSTANCE.createUABinaryFileDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetReaderMessageDataType(),
				 TypesFactory.eINSTANCE.createUadpDataSetReaderMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetWriterMessageDataType(),
				 TypesFactory.eINSTANCE.createUadpDataSetWriterMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UadpWriterGroupMessageDataType(),
				 TypesFactory.eINSTANCE.createUadpWriterGroupMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Union(),
				 TypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesRequest(),
				 TypesFactory.eINSTANCE.createUnregisterNodesRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesResponse(),
				 TypesFactory.eINSTANCE.createUnregisterNodesResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UpdateDataDetails(),
				 TypesFactory.eINSTANCE.createUpdateDataDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UpdateEventDetails(),
				 TypesFactory.eINSTANCE.createUpdateEventDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UpdateStructureDataDetails(),
				 TypesFactory.eINSTANCE.createUpdateStructureDataDetails()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(),
				 TypesFactory.eINSTANCE.createUserIdentityToken()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(),
				 TypesFactory.eINSTANCE.createAnonymousIdentityToken()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(),
				 TypesFactory.eINSTANCE.createIssuedIdentityToken()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(),
				 TypesFactory.eINSTANCE.createUserNameIdentityToken()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(),
				 TypesFactory.eINSTANCE.createX509IdentityToken()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UserNameIdentityToken(),
				 TypesFactory.eINSTANCE.createUserNameIdentityToken()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_UserTokenPolicy(),
				 TypesFactory.eINSTANCE.createUserTokenPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_VariableAttributes(),
				 TypesFactory.eINSTANCE.createVariableAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_VariableNode(),
				 TypesFactory.eINSTANCE.createVariableNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeAttributes(),
				 TypesFactory.eINSTANCE.createVariableTypeAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeNode(),
				 TypesFactory.eINSTANCE.createVariableTypeNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Variant(),
				 TypesFactory.eINSTANCE.createVariant()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Vector(),
				 TypesFactory.eINSTANCE.createVector()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_Vector(),
				 TypesFactory.eINSTANCE.createThreeDVector()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ViewAttributes(),
				 TypesFactory.eINSTANCE.createViewAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ViewDescription(),
				 TypesFactory.eINSTANCE.createViewDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_ViewNode(),
				 TypesFactory.eINSTANCE.createViewNode()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_WriteRequest(),
				 TypesFactory.eINSTANCE.createWriteRequest()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_WriteResponse(),
				 TypesFactory.eINSTANCE.createWriteResponse()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupDataType(),
				 TypesFactory.eINSTANCE.createWriterGroupDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType(),
				 TypesFactory.eINSTANCE.createWriterGroupMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType(),
				 TypesFactory.eINSTANCE.createJsonWriterGroupMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType(),
				 TypesFactory.eINSTANCE.createUadpWriterGroupMessageDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType(),
				 TypesFactory.eINSTANCE.createWriterGroupTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType(),
				 TypesFactory.eINSTANCE.createBrokerWriterGroupTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType(),
				 TypesFactory.eINSTANCE.createDatagramWriterGroupTransportDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_WriteValue(),
				 TypesFactory.eINSTANCE.createWriteValue()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_X509IdentityToken(),
				 TypesFactory.eINSTANCE.createX509IdentityToken()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDocumentRoot_XVType(),
				 TypesFactory.eINSTANCE.createXVType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilter() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilterResult() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_AnonymousIdentityToken() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_AttributeOperand() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_BrokerConnectionTransportDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetReaderTransportDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderTransportDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetWriterTransportDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterTransportDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_BrokerWriterGroupTransportDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_CartesianCoordinates() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ThreeDCartesianCoordinates() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DatagramConnectionTransportDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataChangeFilter() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataChangeNotification() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_NotificationData() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DatagramWriterGroupTransportDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataSetMetaDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetReaderMessageDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetReaderMessageDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetWriterMessageDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetWriterMessageDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataTypeAttributes() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_EnumDefinition() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_StructureDefinition() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_EnumDescription() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_SimpleTypeDescription() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_StructureDescription() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DataTypeNode() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_Node() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_TypeNode() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_UABinaryFileDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DeleteAtTimeDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DeleteEventDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DeleteRawModifiedDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_DiscoveryConfiguration() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_MdnsDiscoveryConfiguration() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ElementOperand() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_EnumField() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_EnumValueType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_EventFilter() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_EventFilterResult() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_EventNotificationList() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_LiteralOperand() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_SimpleAttributeOperand() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_Frame() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ThreeDFrame() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributes() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_HistoryData() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_HistoryModifiedData() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ReadAnnotationDataDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ReadAtTimeDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ReadEventDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ReadProcessedDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ReadRawModifiedDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_UpdateDataDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_UpdateEventDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_UpdateStructureDataDetails() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_MethodNode() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ObjectNode() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_VariableNode() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ViewNode() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_IssuedIdentityToken() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_JsonWriterGroupMessageDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_MethodAttributes() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressUrlDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeNode() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeNode() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeNode() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ObjectAttributes() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeAttributes() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeAttributes() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_VariableAttributes() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeAttributes() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ViewAttributes() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_NodeId() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_SessionAuthenticationToken() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_StatusChangeNotification() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_Orientation() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ThreeDOrientation() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataItemsDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_PublishedEventsDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_RsaEncryptedSecret() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_Variant() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetMirrorDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_TargetVariablesDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_ThreeDVector() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_Vector() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_UadpWriterGroupMessageDataType() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_UserNameIdentityToken() ||
			childFeature == TypesPackage.eINSTANCE.getDocumentRoot_X509IdentityToken();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OpcUaEditPlugin.INSTANCE;
	}

}
