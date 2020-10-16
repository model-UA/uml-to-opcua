/**
 */
package org.opcfoundation.ua._2008._02.types.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.opcfoundation.ua._2008._02.types.ApplicationType;
import org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration;
import org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService;
import org.opcfoundation.ua._2008._02.types.BrowseDirection;
import org.opcfoundation.ua._2008._02.types.BrowseResultMask;
import org.opcfoundation.ua._2008._02.types.DataChangeTrigger;
import org.opcfoundation.ua._2008._02.types.DataSetOrderingType;
import org.opcfoundation.ua._2008._02.types.DeadbandType;
import org.opcfoundation.ua._2008._02.types.DiagnosticsLevel;
import org.opcfoundation.ua._2008._02.types.ExceptionDeviationFormat;
import org.opcfoundation.ua._2008._02.types.FilterOperator;
import org.opcfoundation.ua._2008._02.types.HistoryUpdateType;
import org.opcfoundation.ua._2008._02.types.IdType;
import org.opcfoundation.ua._2008._02.types.IdentityCriteriaType;
import org.opcfoundation.ua._2008._02.types.MessageSecurityMode;
import org.opcfoundation.ua._2008._02.types.ModelChangeStructureVerbMask;
import org.opcfoundation.ua._2008._02.types.MonitoringMode;
import org.opcfoundation.ua._2008._02.types.NodeAttributesMask;
import org.opcfoundation.ua._2008._02.types.NodeClass;
import org.opcfoundation.ua._2008._02.types.OpenFileMode;
import org.opcfoundation.ua._2008._02.types.OverrideValueHandling;
import org.opcfoundation.ua._2008._02.types.PerformUpdateType;
import org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification;
import org.opcfoundation.ua._2008._02.types.PubSubState;
import org.opcfoundation.ua._2008._02.types.RedundancySupport;
import org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType;
import org.opcfoundation.ua._2008._02.types.ServerState;
import org.opcfoundation.ua._2008._02.types.StructureType;
import org.opcfoundation.ua._2008._02.types.TimestampsToReturn;
import org.opcfoundation.ua._2008._02.types.TrustListMasks;
import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UserTokenType;
import org.opcfoundation.ua._2008._02.types.ValueType;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.ValueType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueTypeItemProvider 
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
	public ValueTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(TypesPackage.eINSTANCE.getValueType_Any());
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
	 * This returns ValueType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ValueType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ValueType_type");
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

		switch (notification.getFeatureID(ValueType.class)) {
			case TypesPackage.VALUE_TYPE__ANY:
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
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AccessLevelExType(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getAccessLevelExType(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AccessLevelType(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getAccessLevelType(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionRequest(),
					 TypesFactory.eINSTANCE.createActivateSessionRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ActivateSessionResponse(),
					 TypesFactory.eINSTANCE.createActivateSessionResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesItem(),
					 TypesFactory.eINSTANCE.createAddNodesItem())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesRequest(),
					 TypesFactory.eINSTANCE.createAddNodesRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResponse(),
					 TypesFactory.eINSTANCE.createAddNodesResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AddNodesResult(),
					 TypesFactory.eINSTANCE.createAddNodesResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesItem(),
					 TypesFactory.eINSTANCE.createAddReferencesItem())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesRequest(),
					 TypesFactory.eINSTANCE.createAddReferencesRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AddReferencesResponse(),
					 TypesFactory.eINSTANCE.createAddReferencesResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AggregateConfiguration(),
					 TypesFactory.eINSTANCE.createAggregateConfiguration())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilter(),
					 TypesFactory.eINSTANCE.createAggregateFilter())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AggregateFilterResult(),
					 TypesFactory.eINSTANCE.createAggregateFilterResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AliasNameDataType(),
					 TypesFactory.eINSTANCE.createAliasNameDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Annotation(),
					 TypesFactory.eINSTANCE.createAnnotation())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AnonymousIdentityToken(),
					 TypesFactory.eINSTANCE.createAnonymousIdentityToken())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationDescription(),
					 TypesFactory.eINSTANCE.createApplicationDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationInstanceCertificate(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ApplicationType(),
					 ApplicationType.SERVER0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Argument(),
					 TypesFactory.eINSTANCE.createArgument())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AttributeOperand(),
					 TypesFactory.eINSTANCE.createAttributeOperand())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AttributeWriteMask(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getAttributeWriteMask(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AudioDataType(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AxisInformation(),
					 TypesFactory.eINSTANCE.createAxisInformation())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_AxisScaleEnumeration(),
					 AxisScaleEnumeration.LINEAR0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BitFieldMaskDataType(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_LONG, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Boolean(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN_OBJECT, "false"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrokerConnectionTransportDataType(),
					 TypesFactory.eINSTANCE.createBrokerConnectionTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetReaderTransportDataType(),
					 TypesFactory.eINSTANCE.createBrokerDataSetReaderTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrokerDataSetWriterTransportDataType(),
					 TypesFactory.eINSTANCE.createBrokerDataSetWriterTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrokerTransportQualityOfService(),
					 BrokerTransportQualityOfService.NOT_SPECIFIED0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrokerWriterGroupTransportDataType(),
					 TypesFactory.eINSTANCE.createBrokerWriterGroupTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowseDescription(),
					 TypesFactory.eINSTANCE.createBrowseDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowseDirection(),
					 BrowseDirection.FORWARD0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextRequest(),
					 TypesFactory.eINSTANCE.createBrowseNextRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowseNextResponse(),
					 TypesFactory.eINSTANCE.createBrowseNextResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePath(),
					 TypesFactory.eINSTANCE.createBrowsePath())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathResult(),
					 TypesFactory.eINSTANCE.createBrowsePathResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowsePathTarget(),
					 TypesFactory.eINSTANCE.createBrowsePathTarget())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowseRequest(),
					 TypesFactory.eINSTANCE.createBrowseRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResponse(),
					 TypesFactory.eINSTANCE.createBrowseResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResult(),
					 TypesFactory.eINSTANCE.createBrowseResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BrowseResultMask(),
					 BrowseResultMask.NONE0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_BuildInfo(),
					 TypesFactory.eINSTANCE.createBuildInfo())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Byte(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_BYTE_OBJECT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ByteString(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodRequest(),
					 TypesFactory.eINSTANCE.createCallMethodRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CallMethodResult(),
					 TypesFactory.eINSTANCE.createCallMethodResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CallRequest(),
					 TypesFactory.eINSTANCE.createCallRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CallResponse(),
					 TypesFactory.eINSTANCE.createCallResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CancelRequest(),
					 TypesFactory.eINSTANCE.createCancelRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CancelResponse(),
					 TypesFactory.eINSTANCE.createCancelResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CartesianCoordinates(),
					 TypesFactory.eINSTANCE.createCartesianCoordinates())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CartesianCoordinates(),
					 TypesFactory.eINSTANCE.createThreeDCartesianCoordinates())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ChannelSecurityToken(),
					 TypesFactory.eINSTANCE.createChannelSecurityToken())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelRequest(),
					 TypesFactory.eINSTANCE.createCloseSecureChannelRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CloseSecureChannelResponse(),
					 TypesFactory.eINSTANCE.createCloseSecureChannelResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionRequest(),
					 TypesFactory.eINSTANCE.createCloseSessionRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CloseSessionResponse(),
					 TypesFactory.eINSTANCE.createCloseSessionResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ComplexNumberType(),
					 TypesFactory.eINSTANCE.createComplexNumberType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ConfigurationVersionDataType(),
					 TypesFactory.eINSTANCE.createConfigurationVersionDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType(),
					 TypesFactory.eINSTANCE.createConnectionTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType(),
					 TypesFactory.eINSTANCE.createBrokerConnectionTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ConnectionTransportDataType(),
					 TypesFactory.eINSTANCE.createDatagramConnectionTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilter(),
					 TypesFactory.eINSTANCE.createContentFilter())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElement(),
					 TypesFactory.eINSTANCE.createContentFilterElement())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterElementResult(),
					 TypesFactory.eINSTANCE.createContentFilterElementResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ContentFilterResult(),
					 TypesFactory.eINSTANCE.createContentFilterResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ContinuationPoint(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Counter(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsRequest(),
					 TypesFactory.eINSTANCE.createCreateMonitoredItemsRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CreateMonitoredItemsResponse(),
					 TypesFactory.eINSTANCE.createCreateMonitoredItemsResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionRequest(),
					 TypesFactory.eINSTANCE.createCreateSessionRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CreateSessionResponse(),
					 TypesFactory.eINSTANCE.createCreateSessionResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionRequest(),
					 TypesFactory.eINSTANCE.createCreateSubscriptionRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CreateSubscriptionResponse(),
					 TypesFactory.eINSTANCE.createCreateSubscriptionResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_CurrencyUnitType(),
					 TypesFactory.eINSTANCE.createCurrencyUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeFilter(),
					 TypesFactory.eINSTANCE.createDataChangeFilter())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeNotification(),
					 TypesFactory.eINSTANCE.createDataChangeNotification())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataChangeTrigger(),
					 DataChangeTrigger.STATUS0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DatagramConnectionTransportDataType(),
					 TypesFactory.eINSTANCE.createDatagramConnectionTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DatagramWriterGroupTransportDataType(),
					 TypesFactory.eINSTANCE.createDatagramWriterGroupTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetFieldContentMask(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getDataSetFieldContentMask(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetFieldFlags(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getDataSetFieldFlags(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetMetaDataType(),
					 TypesFactory.eINSTANCE.createDataSetMetaDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetOrderingType(),
					 DataSetOrderingType.UNDEFINED0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderDataType(),
					 TypesFactory.eINSTANCE.createDataSetReaderDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType(),
					 TypesFactory.eINSTANCE.createDataSetReaderMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType(),
					 TypesFactory.eINSTANCE.createJsonDataSetReaderMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderMessageDataType(),
					 TypesFactory.eINSTANCE.createUadpDataSetReaderMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderTransportDataType(),
					 TypesFactory.eINSTANCE.createDataSetReaderTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetReaderTransportDataType(),
					 TypesFactory.eINSTANCE.createBrokerDataSetReaderTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterDataType(),
					 TypesFactory.eINSTANCE.createDataSetWriterDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType(),
					 TypesFactory.eINSTANCE.createDataSetWriterMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType(),
					 TypesFactory.eINSTANCE.createJsonDataSetWriterMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterMessageDataType(),
					 TypesFactory.eINSTANCE.createUadpDataSetWriterMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterTransportDataType(),
					 TypesFactory.eINSTANCE.createDataSetWriterTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataSetWriterTransportDataType(),
					 TypesFactory.eINSTANCE.createBrokerDataSetWriterTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeAttributes(),
					 TypesFactory.eINSTANCE.createDataTypeAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition(),
					 TypesFactory.eINSTANCE.createDataTypeDefinition())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition(),
					 TypesFactory.eINSTANCE.createEnumDefinition())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDefinition(),
					 TypesFactory.eINSTANCE.createStructureDefinition())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(),
					 TypesFactory.eINSTANCE.createDataTypeDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(),
					 TypesFactory.eINSTANCE.createEnumDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(),
					 TypesFactory.eINSTANCE.createSimpleTypeDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeDescription(),
					 TypesFactory.eINSTANCE.createStructureDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeNode(),
					 TypesFactory.eINSTANCE.createDataTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader(),
					 TypesFactory.eINSTANCE.createDataTypeSchemaHeader())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader(),
					 TypesFactory.eINSTANCE.createDataSetMetaDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataTypeSchemaHeader(),
					 TypesFactory.eINSTANCE.createUABinaryFileDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DataValue(),
					 TypesFactory.eINSTANCE.createDataValue())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Date(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DateString(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DateTime(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeadbandType(),
					 DeadbandType.NONE0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DecimalDataType(),
					 TypesFactory.eINSTANCE.createDecimalDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DecimalString(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteAtTimeDetails(),
					 TypesFactory.eINSTANCE.createDeleteAtTimeDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteEventDetails(),
					 TypesFactory.eINSTANCE.createDeleteEventDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsRequest(),
					 TypesFactory.eINSTANCE.createDeleteMonitoredItemsRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteMonitoredItemsResponse(),
					 TypesFactory.eINSTANCE.createDeleteMonitoredItemsResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesItem(),
					 TypesFactory.eINSTANCE.createDeleteNodesItem())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesRequest(),
					 TypesFactory.eINSTANCE.createDeleteNodesRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteNodesResponse(),
					 TypesFactory.eINSTANCE.createDeleteNodesResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteRawModifiedDetails(),
					 TypesFactory.eINSTANCE.createDeleteRawModifiedDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesItem(),
					 TypesFactory.eINSTANCE.createDeleteReferencesItem())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesRequest(),
					 TypesFactory.eINSTANCE.createDeleteReferencesRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteReferencesResponse(),
					 TypesFactory.eINSTANCE.createDeleteReferencesResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsRequest(),
					 TypesFactory.eINSTANCE.createDeleteSubscriptionsRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DeleteSubscriptionsResponse(),
					 TypesFactory.eINSTANCE.createDeleteSubscriptionsResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DiagnosticInfo(),
					 TypesFactory.eINSTANCE.createDiagnosticInfo())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DiagnosticsLevel(),
					 DiagnosticsLevel.BASIC0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DiscoveryConfiguration(),
					 TypesFactory.eINSTANCE.createDiscoveryConfiguration())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DiscoveryConfiguration(),
					 TypesFactory.eINSTANCE.createMdnsDiscoveryConfiguration())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Double(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE_OBJECT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DoubleComplexNumberType(),
					 TypesFactory.eINSTANCE.createDoubleComplexNumberType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Duration(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_DurationString(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ElementOperand(),
					 TypesFactory.eINSTANCE.createElementOperand())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EndpointConfiguration(),
					 TypesFactory.eINSTANCE.createEndpointConfiguration())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EndpointDescription(),
					 TypesFactory.eINSTANCE.createEndpointDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EndpointType(),
					 TypesFactory.eINSTANCE.createEndpointType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EndpointUrlListDataType(),
					 TypesFactory.eINSTANCE.createEndpointUrlListDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EnumDefinition(),
					 TypesFactory.eINSTANCE.createEnumDefinition())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EnumDescription(),
					 TypesFactory.eINSTANCE.createEnumDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EnumField(),
					 TypesFactory.eINSTANCE.createEnumField())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EnumValueType(),
					 TypesFactory.eINSTANCE.createEnumValueType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EnumValueType(),
					 TypesFactory.eINSTANCE.createEnumField())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EUInformation(),
					 TypesFactory.eINSTANCE.createEUInformation())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EventFieldList(),
					 TypesFactory.eINSTANCE.createEventFieldList())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EventFilter(),
					 TypesFactory.eINSTANCE.createEventFilter())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EventFilterResult(),
					 TypesFactory.eINSTANCE.createEventFilterResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EventNotificationList(),
					 TypesFactory.eINSTANCE.createEventNotificationList())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_EventNotifierType(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getEventNotifierType(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ExceptionDeviationFormat(),
					 ExceptionDeviationFormat.ABSOLUTE_VALUE0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ExpandedNodeId(),
					 TypesFactory.eINSTANCE.createExpandedNodeId())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ExtensionObject(),
					 TypesFactory.eINSTANCE.createExtensionObject())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FieldMetaData(),
					 TypesFactory.eINSTANCE.createFieldMetaData())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FieldTargetDataType(),
					 TypesFactory.eINSTANCE.createFieldTargetDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(),
					 TypesFactory.eINSTANCE.createFilterOperand())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(),
					 TypesFactory.eINSTANCE.createAttributeOperand())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(),
					 TypesFactory.eINSTANCE.createElementOperand())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(),
					 TypesFactory.eINSTANCE.createLiteralOperand())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperand(),
					 TypesFactory.eINSTANCE.createSimpleAttributeOperand())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FilterOperator(),
					 FilterOperator.EQUALS0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkRequest(),
					 TypesFactory.eINSTANCE.createFindServersOnNetworkRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FindServersOnNetworkResponse(),
					 TypesFactory.eINSTANCE.createFindServersOnNetworkResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FindServersRequest(),
					 TypesFactory.eINSTANCE.createFindServersRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_FindServersResponse(),
					 TypesFactory.eINSTANCE.createFindServersResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Float(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT_OBJECT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Frame(),
					 TypesFactory.eINSTANCE.createFrame())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Frame(),
					 TypesFactory.eINSTANCE.createThreeDFrame())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributes(),
					 TypesFactory.eINSTANCE.createGenericAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_GenericAttributeValue(),
					 TypesFactory.eINSTANCE.createGenericAttributeValue())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsRequest(),
					 TypesFactory.eINSTANCE.createGetEndpointsRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_GetEndpointsResponse(),
					 TypesFactory.eINSTANCE.createGetEndpointsResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Guid(),
					 TypesFactory.eINSTANCE.createGuid())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryData(),
					 TypesFactory.eINSTANCE.createHistoryData())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryData(),
					 TypesFactory.eINSTANCE.createHistoryModifiedData())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEvent(),
					 TypesFactory.eINSTANCE.createHistoryEvent())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryEventFieldList(),
					 TypesFactory.eINSTANCE.createHistoryEventFieldList())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryModifiedData(),
					 TypesFactory.eINSTANCE.createHistoryModifiedData())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
					 TypesFactory.eINSTANCE.createHistoryReadDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
					 TypesFactory.eINSTANCE.createReadAnnotationDataDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
					 TypesFactory.eINSTANCE.createReadAtTimeDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
					 TypesFactory.eINSTANCE.createReadEventDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
					 TypesFactory.eINSTANCE.createReadProcessedDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadDetails(),
					 TypesFactory.eINSTANCE.createReadRawModifiedDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadRequest(),
					 TypesFactory.eINSTANCE.createHistoryReadRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResponse(),
					 TypesFactory.eINSTANCE.createHistoryReadResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadResult(),
					 TypesFactory.eINSTANCE.createHistoryReadResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryReadValueId(),
					 TypesFactory.eINSTANCE.createHistoryReadValueId())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
					 TypesFactory.eINSTANCE.createHistoryUpdateDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
					 TypesFactory.eINSTANCE.createDeleteAtTimeDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
					 TypesFactory.eINSTANCE.createDeleteEventDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
					 TypesFactory.eINSTANCE.createDeleteRawModifiedDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
					 TypesFactory.eINSTANCE.createUpdateDataDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
					 TypesFactory.eINSTANCE.createUpdateEventDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateDetails(),
					 TypesFactory.eINSTANCE.createUpdateStructureDataDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateRequest(),
					 TypesFactory.eINSTANCE.createHistoryUpdateRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResponse(),
					 TypesFactory.eINSTANCE.createHistoryUpdateResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateResult(),
					 TypesFactory.eINSTANCE.createHistoryUpdateResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_HistoryUpdateType(),
					 HistoryUpdateType.INSERT1)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_IdentityCriteriaType(),
					 IdentityCriteriaType.USER_NAME1)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_IdentityMappingRuleType(),
					 TypesFactory.eINSTANCE.createIdentityMappingRuleType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_IdType(),
					 IdType.NUMERIC0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ImageBMP(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ImageGIF(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ImageJPG(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ImagePNG(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Index(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(),
					 TypesFactory.eINSTANCE.createInstanceNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(),
					 TypesFactory.eINSTANCE.createMethodNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(),
					 TypesFactory.eINSTANCE.createObjectNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(),
					 TypesFactory.eINSTANCE.createVariableNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_InstanceNode(),
					 TypesFactory.eINSTANCE.createViewNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Int16(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.SHORT_OBJECT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Int32(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT_OBJECT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Int64(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG_OBJECT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_IntegerId(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_InvokeServiceRequest(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_InvokeServiceResponse(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_IssuedIdentityToken(),
					 TypesFactory.eINSTANCE.createIssuedIdentityToken())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetMessageContentMask(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getJsonDataSetMessageContentMask(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetReaderMessageDataType(),
					 TypesFactory.eINSTANCE.createJsonDataSetReaderMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_JsonDataSetWriterMessageDataType(),
					 TypesFactory.eINSTANCE.createJsonDataSetWriterMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_JsonNetworkMessageContentMask(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getJsonNetworkMessageContentMask(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_JsonWriterGroupMessageDataType(),
					 TypesFactory.eINSTANCE.createJsonWriterGroupMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_KeyValuePair(),
					 TypesFactory.eINSTANCE.createKeyValuePair())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesItem(),
					 TypesFactory.eINSTANCE.createListOfAddNodesItem())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddNodesResult(),
					 TypesFactory.eINSTANCE.createListOfAddNodesResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAddReferencesItem(),
					 TypesFactory.eINSTANCE.createListOfAddReferencesItem())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfAliasNameDataType(),
					 TypesFactory.eINSTANCE.createListOfAliasNameDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfApplicationDescription(),
					 TypesFactory.eINSTANCE.createListOfApplicationDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfArgument(),
					 TypesFactory.eINSTANCE.createListOfArgument())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBoolean(),
					 TypesFactory.eINSTANCE.createListOfBoolean())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerConnectionTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfBrokerConnectionTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetReaderTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfBrokerDataSetReaderTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerDataSetWriterTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfBrokerDataSetWriterTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerTransportQualityOfService(),
					 TypesFactory.eINSTANCE.createListOfBrokerTransportQualityOfService())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrokerWriterGroupTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfBrokerWriterGroupTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseDescription(),
					 TypesFactory.eINSTANCE.createListOfBrowseDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePath(),
					 TypesFactory.eINSTANCE.createListOfBrowsePath())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathResult(),
					 TypesFactory.eINSTANCE.createListOfBrowsePathResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowsePathTarget(),
					 TypesFactory.eINSTANCE.createListOfBrowsePathTarget())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfBrowseResult(),
					 TypesFactory.eINSTANCE.createListOfBrowseResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByte(),
					 TypesFactory.eINSTANCE.createListOfByte())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfByteString(),
					 TypesFactory.eINSTANCE.createListOfByteString())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodRequest(),
					 TypesFactory.eINSTANCE.createListOfCallMethodRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCallMethodResult(),
					 TypesFactory.eINSTANCE.createListOfCallMethodResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCartesianCoordinates(),
					 TypesFactory.eINSTANCE.createListOfCartesianCoordinates())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConfigurationVersionDataType(),
					 TypesFactory.eINSTANCE.createListOfConfigurationVersionDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfConnectionTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfConnectionTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilter(),
					 TypesFactory.eINSTANCE.createListOfContentFilter())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElement(),
					 TypesFactory.eINSTANCE.createListOfContentFilterElement())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfContentFilterElementResult(),
					 TypesFactory.eINSTANCE.createListOfContentFilterElementResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfCurrencyUnitType(),
					 TypesFactory.eINSTANCE.createListOfCurrencyUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramConnectionTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfDatagramConnectionTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDatagramWriterGroupTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfDatagramWriterGroupTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetFieldContentMask(),
					 TypesFactory.eINSTANCE.createListOfDataSetFieldContentMask())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetMetaDataType(),
					 TypesFactory.eINSTANCE.createListOfDataSetMetaDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetOrderingType(),
					 TypesFactory.eINSTANCE.createListOfDataSetOrderingType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderDataType(),
					 TypesFactory.eINSTANCE.createListOfDataSetReaderDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderMessageDataType(),
					 TypesFactory.eINSTANCE.createListOfDataSetReaderMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetReaderTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfDataSetReaderTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterDataType(),
					 TypesFactory.eINSTANCE.createListOfDataSetWriterDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterMessageDataType(),
					 TypesFactory.eINSTANCE.createListOfDataSetWriterMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataSetWriterTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfDataSetWriterTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDefinition(),
					 TypesFactory.eINSTANCE.createListOfDataTypeDefinition())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeDescription(),
					 TypesFactory.eINSTANCE.createListOfDataTypeDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataTypeSchemaHeader(),
					 TypesFactory.eINSTANCE.createListOfDataTypeSchemaHeader())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDataValue(),
					 TypesFactory.eINSTANCE.createListOfDataValue())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDateTime(),
					 TypesFactory.eINSTANCE.createListOfDateTime())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteNodesItem(),
					 TypesFactory.eINSTANCE.createListOfDeleteNodesItem())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDeleteReferencesItem(),
					 TypesFactory.eINSTANCE.createListOfDeleteReferencesItem())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticInfo(),
					 TypesFactory.eINSTANCE.createListOfDiagnosticInfo())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDiagnosticsLevel(),
					 TypesFactory.eINSTANCE.createListOfDiagnosticsLevel())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfDouble(),
					 TypesFactory.eINSTANCE.createListOfDouble())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointConfiguration(),
					 TypesFactory.eINSTANCE.createListOfEndpointConfiguration())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointDescription(),
					 TypesFactory.eINSTANCE.createListOfEndpointDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointType(),
					 TypesFactory.eINSTANCE.createListOfEndpointType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEndpointUrlListDataType(),
					 TypesFactory.eINSTANCE.createListOfEndpointUrlListDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDefinition(),
					 TypesFactory.eINSTANCE.createListOfEnumDefinition())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumDescription(),
					 TypesFactory.eINSTANCE.createListOfEnumDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumField(),
					 TypesFactory.eINSTANCE.createListOfEnumField())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEnumValueType(),
					 TypesFactory.eINSTANCE.createListOfEnumValueType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfEventFieldList(),
					 TypesFactory.eINSTANCE.createListOfEventFieldList())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExpandedNodeId(),
					 TypesFactory.eINSTANCE.createListOfExpandedNodeId())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfExtensionObject(),
					 TypesFactory.eINSTANCE.createListOfExtensionObject())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldMetaData(),
					 TypesFactory.eINSTANCE.createListOfFieldMetaData())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFieldTargetDataType(),
					 TypesFactory.eINSTANCE.createListOfFieldTargetDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFloat(),
					 TypesFactory.eINSTANCE.createListOfFloat())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfFrame(),
					 TypesFactory.eINSTANCE.createListOfFrame())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGenericAttributeValue(),
					 TypesFactory.eINSTANCE.createListOfGenericAttributeValue())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfGuid(),
					 TypesFactory.eINSTANCE.createListOfGuid())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryEventFieldList(),
					 TypesFactory.eINSTANCE.createListOfHistoryEventFieldList())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadResult(),
					 TypesFactory.eINSTANCE.createListOfHistoryReadResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryReadValueId(),
					 TypesFactory.eINSTANCE.createListOfHistoryReadValueId())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfHistoryUpdateResult(),
					 TypesFactory.eINSTANCE.createListOfHistoryUpdateResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityCriteriaType(),
					 TypesFactory.eINSTANCE.createListOfIdentityCriteriaType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdentityMappingRuleType(),
					 TypesFactory.eINSTANCE.createListOfIdentityMappingRuleType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfIdType(),
					 TypesFactory.eINSTANCE.createListOfIdType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt16(),
					 TypesFactory.eINSTANCE.createListOfInt16())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt32(),
					 TypesFactory.eINSTANCE.createListOfInt32())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfInt64(),
					 TypesFactory.eINSTANCE.createListOfInt64())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetMessageContentMask(),
					 TypesFactory.eINSTANCE.createListOfJsonDataSetMessageContentMask())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetReaderMessageDataType(),
					 TypesFactory.eINSTANCE.createListOfJsonDataSetReaderMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonDataSetWriterMessageDataType(),
					 TypesFactory.eINSTANCE.createListOfJsonDataSetWriterMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonNetworkMessageContentMask(),
					 TypesFactory.eINSTANCE.createListOfJsonNetworkMessageContentMask())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfJsonWriterGroupMessageDataType(),
					 TypesFactory.eINSTANCE.createListOfJsonWriterGroupMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfKeyValuePair(),
					 TypesFactory.eINSTANCE.createListOfKeyValuePair())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfLocalizedText(),
					 TypesFactory.eINSTANCE.createListOfLocalizedText())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModelChangeStructureDataType(),
					 TypesFactory.eINSTANCE.createListOfModelChangeStructureDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfModificationInfo(),
					 TypesFactory.eINSTANCE.createListOfModificationInfo())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateRequest(),
					 TypesFactory.eINSTANCE.createListOfMonitoredItemCreateRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemCreateResult(),
					 TypesFactory.eINSTANCE.createListOfMonitoredItemCreateResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyRequest(),
					 TypesFactory.eINSTANCE.createListOfMonitoredItemModifyRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemModifyResult(),
					 TypesFactory.eINSTANCE.createListOfMonitoredItemModifyResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfMonitoredItemNotification(),
					 TypesFactory.eINSTANCE.createListOfMonitoredItemNotification())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressDataType(),
					 TypesFactory.eINSTANCE.createListOfNetworkAddressDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkAddressUrlDataType(),
					 TypesFactory.eINSTANCE.createListOfNetworkAddressUrlDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNetworkGroupDataType(),
					 TypesFactory.eINSTANCE.createListOfNetworkGroupDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNode(),
					 TypesFactory.eINSTANCE.createListOfNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeId(),
					 TypesFactory.eINSTANCE.createListOfNodeId())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeReference(),
					 TypesFactory.eINSTANCE.createListOfNodeReference())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfNodeTypeDescription(),
					 TypesFactory.eINSTANCE.createListOfNodeTypeDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOpenFileMode(),
					 TypesFactory.eINSTANCE.createListOfOpenFileMode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOptionSet(),
					 TypesFactory.eINSTANCE.createListOfOptionSet())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOrientation(),
					 TypesFactory.eINSTANCE.createListOfOrientation())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfOverrideValueHandling(),
					 TypesFactory.eINSTANCE.createListOfOverrideValueHandling())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfParsingResult(),
					 TypesFactory.eINSTANCE.createListOfParsingResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataItemsDataType(),
					 TypesFactory.eINSTANCE.createListOfPublishedDataItemsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetDataType(),
					 TypesFactory.eINSTANCE.createListOfPublishedDataSetDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedDataSetSourceDataType(),
					 TypesFactory.eINSTANCE.createListOfPublishedDataSetSourceDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedEventsDataType(),
					 TypesFactory.eINSTANCE.createListOfPublishedEventsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPublishedVariableDataType(),
					 TypesFactory.eINSTANCE.createListOfPublishedVariableDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConfigurationDataType(),
					 TypesFactory.eINSTANCE.createListOfPubSubConfigurationDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubConnectionDataType(),
					 TypesFactory.eINSTANCE.createListOfPubSubConnectionDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubDiagnosticsCounterClassification(),
					 TypesFactory.eINSTANCE.createListOfPubSubDiagnosticsCounterClassification())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubGroupDataType(),
					 TypesFactory.eINSTANCE.createListOfPubSubGroupDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfPubSubState(),
					 TypesFactory.eINSTANCE.createListOfPubSubState())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQualifiedName(),
					 TypesFactory.eINSTANCE.createListOfQualifiedName())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataDescription(),
					 TypesFactory.eINSTANCE.createListOfQueryDataDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfQueryDataSet(),
					 TypesFactory.eINSTANCE.createListOfQueryDataSet())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRationalNumber(),
					 TypesFactory.eINSTANCE.createListOfRationalNumber())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupDataType(),
					 TypesFactory.eINSTANCE.createListOfReaderGroupDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupMessageDataType(),
					 TypesFactory.eINSTANCE.createListOfReaderGroupMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReaderGroupTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfReaderGroupTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReadValueId(),
					 TypesFactory.eINSTANCE.createListOfReadValueId())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRedundantServerDataType(),
					 TypesFactory.eINSTANCE.createListOfRedundantServerDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceDescription(),
					 TypesFactory.eINSTANCE.createListOfReferenceDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfReferenceNode(),
					 TypesFactory.eINSTANCE.createListOfReferenceNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRegisteredServer(),
					 TypesFactory.eINSTANCE.createListOfRegisteredServer())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRelativePathElement(),
					 TypesFactory.eINSTANCE.createListOfRelativePathElement())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfRolePermissionType(),
					 TypesFactory.eINSTANCE.createListOfRolePermissionType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSamplingIntervalDiagnosticsDataType(),
					 TypesFactory.eINSTANCE.createListOfSamplingIntervalDiagnosticsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSByte(),
					 TypesFactory.eINSTANCE.createListOfSByte())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSemanticChangeStructureDataType(),
					 TypesFactory.eINSTANCE.createListOfSemanticChangeStructureDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfServerOnNetwork(),
					 TypesFactory.eINSTANCE.createListOfServerOnNetwork())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionDiagnosticsDataType(),
					 TypesFactory.eINSTANCE.createListOfSessionDiagnosticsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSessionSecurityDiagnosticsDataType(),
					 TypesFactory.eINSTANCE.createListOfSessionSecurityDiagnosticsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSignedSoftwareCertificate(),
					 TypesFactory.eINSTANCE.createListOfSignedSoftwareCertificate())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleAttributeOperand(),
					 TypesFactory.eINSTANCE.createListOfSimpleAttributeOperand())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSimpleTypeDescription(),
					 TypesFactory.eINSTANCE.createListOfSimpleTypeDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusCode(),
					 TypesFactory.eINSTANCE.createListOfStatusCode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStatusResult(),
					 TypesFactory.eINSTANCE.createListOfStatusResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfString(),
					 TypesFactory.eINSTANCE.createListOfString())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDefinition(),
					 TypesFactory.eINSTANCE.createListOfStructureDefinition())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureDescription(),
					 TypesFactory.eINSTANCE.createListOfStructureDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfStructureField(),
					 TypesFactory.eINSTANCE.createListOfStructureField())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetDataType(),
					 TypesFactory.eINSTANCE.createListOfSubscribedDataSetDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscribedDataSetMirrorDataType(),
					 TypesFactory.eINSTANCE.createListOfSubscribedDataSetMirrorDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionAcknowledgement(),
					 TypesFactory.eINSTANCE.createListOfSubscriptionAcknowledgement())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfSubscriptionDiagnosticsDataType(),
					 TypesFactory.eINSTANCE.createListOfSubscriptionDiagnosticsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTargetVariablesDataType(),
					 TypesFactory.eINSTANCE.createListOfTargetVariablesDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDCartesianCoordinates(),
					 TypesFactory.eINSTANCE.createListOfThreeDCartesianCoordinates())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDFrame(),
					 TypesFactory.eINSTANCE.createListOfThreeDFrame())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDOrientation(),
					 TypesFactory.eINSTANCE.createListOfThreeDOrientation())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfThreeDVector(),
					 TypesFactory.eINSTANCE.createListOfThreeDVector())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTimeZoneDataType(),
					 TypesFactory.eINSTANCE.createListOfTimeZoneDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTransferResult(),
					 TypesFactory.eINSTANCE.createListOfTransferResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfTrustListDataType(),
					 TypesFactory.eINSTANCE.createListOfTrustListDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUABinaryFileDataType(),
					 TypesFactory.eINSTANCE.createListOfUABinaryFileDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetMessageContentMask(),
					 TypesFactory.eINSTANCE.createListOfUadpDataSetMessageContentMask())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetReaderMessageDataType(),
					 TypesFactory.eINSTANCE.createListOfUadpDataSetReaderMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpDataSetWriterMessageDataType(),
					 TypesFactory.eINSTANCE.createListOfUadpDataSetWriterMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpNetworkMessageContentMask(),
					 TypesFactory.eINSTANCE.createListOfUadpNetworkMessageContentMask())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUadpWriterGroupMessageDataType(),
					 TypesFactory.eINSTANCE.createListOfUadpWriterGroupMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt16(),
					 TypesFactory.eINSTANCE.createListOfUInt16())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt32(),
					 TypesFactory.eINSTANCE.createListOfUInt32())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUInt64(),
					 TypesFactory.eINSTANCE.createListOfUInt64())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUnion(),
					 TypesFactory.eINSTANCE.createListOfUnion())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfUserTokenPolicy(),
					 TypesFactory.eINSTANCE.createListOfUserTokenPolicy())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVariant(),
					 TypesFactory.eINSTANCE.createListOfVariant())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfVector(),
					 TypesFactory.eINSTANCE.createListOfVector())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupDataType(),
					 TypesFactory.eINSTANCE.createListOfWriterGroupDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupMessageDataType(),
					 TypesFactory.eINSTANCE.createListOfWriterGroupMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriterGroupTransportDataType(),
					 TypesFactory.eINSTANCE.createListOfWriterGroupTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfWriteValue(),
					 TypesFactory.eINSTANCE.createListOfWriteValue())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ListOfXmlElement(),
					 TypesFactory.eINSTANCE.createListOfXmlElement())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_LiteralOperand(),
					 TypesFactory.eINSTANCE.createLiteralOperand())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_LocaleId(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_LocalizedText(),
					 TypesFactory.eINSTANCE.createLocalizedText())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MdnsDiscoveryConfiguration(),
					 TypesFactory.eINSTANCE.createMdnsDiscoveryConfiguration())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MessageSecurityMode(),
					 MessageSecurityMode.INVALID0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MethodAttributes(),
					 TypesFactory.eINSTANCE.createMethodAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MethodNode(),
					 TypesFactory.eINSTANCE.createMethodNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ModelChangeStructureDataType(),
					 TypesFactory.eINSTANCE.createModelChangeStructureDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ModelChangeStructureVerbMask(),
					 ModelChangeStructureVerbMask.NODE_ADDED1)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ModificationInfo(),
					 TypesFactory.eINSTANCE.createModificationInfo())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsRequest(),
					 TypesFactory.eINSTANCE.createModifyMonitoredItemsRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ModifyMonitoredItemsResponse(),
					 TypesFactory.eINSTANCE.createModifyMonitoredItemsResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionRequest(),
					 TypesFactory.eINSTANCE.createModifySubscriptionRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ModifySubscriptionResponse(),
					 TypesFactory.eINSTANCE.createModifySubscriptionResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateRequest(),
					 TypesFactory.eINSTANCE.createMonitoredItemCreateRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemCreateResult(),
					 TypesFactory.eINSTANCE.createMonitoredItemCreateResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyRequest(),
					 TypesFactory.eINSTANCE.createMonitoredItemModifyRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemModifyResult(),
					 TypesFactory.eINSTANCE.createMonitoredItemModifyResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoredItemNotification(),
					 TypesFactory.eINSTANCE.createMonitoredItemNotification())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(),
					 TypesFactory.eINSTANCE.createMonitoringFilter())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(),
					 TypesFactory.eINSTANCE.createAggregateFilter())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(),
					 TypesFactory.eINSTANCE.createDataChangeFilter())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilter(),
					 TypesFactory.eINSTANCE.createEventFilter())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult(),
					 TypesFactory.eINSTANCE.createMonitoringFilterResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult(),
					 TypesFactory.eINSTANCE.createAggregateFilterResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringFilterResult(),
					 TypesFactory.eINSTANCE.createEventFilterResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringMode(),
					 MonitoringMode.DISABLED0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_MonitoringParameters(),
					 TypesFactory.eINSTANCE.createMonitoringParameters())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressDataType(),
					 TypesFactory.eINSTANCE.createNetworkAddressDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressDataType(),
					 TypesFactory.eINSTANCE.createNetworkAddressUrlDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NetworkAddressUrlDataType(),
					 TypesFactory.eINSTANCE.createNetworkAddressUrlDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NetworkGroupDataType(),
					 TypesFactory.eINSTANCE.createNetworkGroupDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createDataTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createInstanceNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createMethodNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createObjectNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createObjectTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createReferenceTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createVariableNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createVariableTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Node(),
					 TypesFactory.eINSTANCE.createViewNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
					 TypesFactory.eINSTANCE.createNodeAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
					 TypesFactory.eINSTANCE.createDataTypeAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
					 TypesFactory.eINSTANCE.createGenericAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
					 TypesFactory.eINSTANCE.createMethodAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
					 TypesFactory.eINSTANCE.createObjectAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
					 TypesFactory.eINSTANCE.createObjectTypeAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
					 TypesFactory.eINSTANCE.createReferenceTypeAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
					 TypesFactory.eINSTANCE.createVariableAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
					 TypesFactory.eINSTANCE.createVariableTypeAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributes(),
					 TypesFactory.eINSTANCE.createViewAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeAttributesMask(),
					 NodeAttributesMask.NONE0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeClass(),
					 NodeClass.UNSPECIFIED0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeId(),
					 TypesFactory.eINSTANCE.createNodeId())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeReference(),
					 TypesFactory.eINSTANCE.createNodeReference())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NodeTypeDescription(),
					 TypesFactory.eINSTANCE.createNodeTypeDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NormalizedString(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(),
					 TypesFactory.eINSTANCE.createNotificationData())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(),
					 TypesFactory.eINSTANCE.createDataChangeNotification())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(),
					 TypesFactory.eINSTANCE.createEventNotificationList())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NotificationData(),
					 TypesFactory.eINSTANCE.createStatusChangeNotification())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NotificationMessage(),
					 TypesFactory.eINSTANCE.createNotificationMessage())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_NumericRange(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ObjectAttributes(),
					 TypesFactory.eINSTANCE.createObjectAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ObjectNode(),
					 TypesFactory.eINSTANCE.createObjectNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeAttributes(),
					 TypesFactory.eINSTANCE.createObjectTypeAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ObjectTypeNode(),
					 TypesFactory.eINSTANCE.createObjectTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_OpenFileMode(),
					 OpenFileMode.READ1)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelRequest(),
					 TypesFactory.eINSTANCE.createOpenSecureChannelRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_OpenSecureChannelResponse(),
					 TypesFactory.eINSTANCE.createOpenSecureChannelResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_OptionSet(),
					 TypesFactory.eINSTANCE.createOptionSet())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Orientation(),
					 TypesFactory.eINSTANCE.createOrientation())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Orientation(),
					 TypesFactory.eINSTANCE.createThreeDOrientation())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_OverrideValueHandling(),
					 OverrideValueHandling.DISABLED0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ParsingResult(),
					 TypesFactory.eINSTANCE.createParsingResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PerformUpdateType(),
					 PerformUpdateType.INSERT1)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PermissionType(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getPermissionType(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnostic2DataType(),
					 TypesFactory.eINSTANCE.createProgramDiagnostic2DataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ProgramDiagnosticDataType(),
					 TypesFactory.eINSTANCE.createProgramDiagnosticDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataItemsDataType(),
					 TypesFactory.eINSTANCE.createPublishedDataItemsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetDataType(),
					 TypesFactory.eINSTANCE.createPublishedDataSetDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType(),
					 TypesFactory.eINSTANCE.createPublishedDataSetSourceDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType(),
					 TypesFactory.eINSTANCE.createPublishedDataItemsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PublishedDataSetSourceDataType(),
					 TypesFactory.eINSTANCE.createPublishedEventsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PublishedEventsDataType(),
					 TypesFactory.eINSTANCE.createPublishedEventsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PublishedVariableDataType(),
					 TypesFactory.eINSTANCE.createPublishedVariableDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PublishRequest(),
					 TypesFactory.eINSTANCE.createPublishRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PublishResponse(),
					 TypesFactory.eINSTANCE.createPublishResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConfigurationDataType(),
					 TypesFactory.eINSTANCE.createPubSubConfigurationDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PubSubConnectionDataType(),
					 TypesFactory.eINSTANCE.createPubSubConnectionDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PubSubDiagnosticsCounterClassification(),
					 PubSubDiagnosticsCounterClassification.INFORMATION0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType(),
					 TypesFactory.eINSTANCE.createPubSubGroupDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType(),
					 TypesFactory.eINSTANCE.createReaderGroupDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PubSubGroupDataType(),
					 TypesFactory.eINSTANCE.createWriterGroupDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_PubSubState(),
					 PubSubState.DISABLED0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_QualifiedName(),
					 TypesFactory.eINSTANCE.createQualifiedName())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataDescription(),
					 TypesFactory.eINSTANCE.createQueryDataDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_QueryDataSet(),
					 TypesFactory.eINSTANCE.createQueryDataSet())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstRequest(),
					 TypesFactory.eINSTANCE.createQueryFirstRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_QueryFirstResponse(),
					 TypesFactory.eINSTANCE.createQueryFirstResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextRequest(),
					 TypesFactory.eINSTANCE.createQueryNextRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_QueryNextResponse(),
					 TypesFactory.eINSTANCE.createQueryNextResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Range(),
					 TypesFactory.eINSTANCE.createRange())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RationalNumber(),
					 TypesFactory.eINSTANCE.createRationalNumber())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReadAnnotationDataDetails(),
					 TypesFactory.eINSTANCE.createReadAnnotationDataDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReadAtTimeDetails(),
					 TypesFactory.eINSTANCE.createReadAtTimeDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupDataType(),
					 TypesFactory.eINSTANCE.createReaderGroupDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupMessageDataType(),
					 TypesFactory.eINSTANCE.createReaderGroupMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReaderGroupTransportDataType(),
					 TypesFactory.eINSTANCE.createReaderGroupTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReadEventDetails(),
					 TypesFactory.eINSTANCE.createReadEventDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReadProcessedDetails(),
					 TypesFactory.eINSTANCE.createReadProcessedDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReadRawModifiedDetails(),
					 TypesFactory.eINSTANCE.createReadRawModifiedDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReadRequest(),
					 TypesFactory.eINSTANCE.createReadRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReadResponse(),
					 TypesFactory.eINSTANCE.createReadResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReadValueId(),
					 TypesFactory.eINSTANCE.createReadValueId())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RedundancySupport(),
					 RedundancySupport.NONE0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RedundantServerDataType(),
					 TypesFactory.eINSTANCE.createRedundantServerDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceDescription(),
					 TypesFactory.eINSTANCE.createReferenceDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceNode(),
					 TypesFactory.eINSTANCE.createReferenceNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeAttributes(),
					 TypesFactory.eINSTANCE.createReferenceTypeAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ReferenceTypeNode(),
					 TypesFactory.eINSTANCE.createReferenceTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RegisteredServer(),
					 TypesFactory.eINSTANCE.createRegisteredServer())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesRequest(),
					 TypesFactory.eINSTANCE.createRegisterNodesRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RegisterNodesResponse(),
					 TypesFactory.eINSTANCE.createRegisterNodesResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Request(),
					 TypesFactory.eINSTANCE.createRegisterServer2Request())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServer2Response(),
					 TypesFactory.eINSTANCE.createRegisterServer2Response())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerRequest(),
					 TypesFactory.eINSTANCE.createRegisterServerRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RegisterServerResponse(),
					 TypesFactory.eINSTANCE.createRegisterServerResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RelativePath(),
					 TypesFactory.eINSTANCE.createRelativePath())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RelativePathElement(),
					 TypesFactory.eINSTANCE.createRelativePathElement())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RepublishRequest(),
					 TypesFactory.eINSTANCE.createRepublishRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RepublishResponse(),
					 TypesFactory.eINSTANCE.createRepublishResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RequestHeader(),
					 TypesFactory.eINSTANCE.createRequestHeader())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ResponseHeader(),
					 TypesFactory.eINSTANCE.createResponseHeader())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RolePermissionType(),
					 TypesFactory.eINSTANCE.createRolePermissionType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_RsaEncryptedSecret(),
					 TypesFactory.eINSTANCE.createVariant())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SamplingIntervalDiagnosticsDataType(),
					 TypesFactory.eINSTANCE.createSamplingIntervalDiagnosticsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SByte(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BYTE_OBJECT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SecurityTokenRequestType(),
					 SecurityTokenRequestType.ISSUE0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SemanticChangeStructureDataType(),
					 TypesFactory.eINSTANCE.createSemanticChangeStructureDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ServerDiagnosticsSummaryDataType(),
					 TypesFactory.eINSTANCE.createServerDiagnosticsSummaryDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ServerOnNetwork(),
					 TypesFactory.eINSTANCE.createServerOnNetwork())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ServerState(),
					 ServerState.RUNNING0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ServerStatusDataType(),
					 TypesFactory.eINSTANCE.createServerStatusDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ServiceCounterDataType(),
					 TypesFactory.eINSTANCE.createServiceCounterDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ServiceFault(),
					 TypesFactory.eINSTANCE.createServiceFault())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SessionAuthenticationToken(),
					 TypesFactory.eINSTANCE.createNodeId())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SessionDiagnosticsDataType(),
					 TypesFactory.eINSTANCE.createSessionDiagnosticsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeRequestType(),
					 TypesFactory.eINSTANCE.createSessionlessInvokeRequestType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SessionlessInvokeResponseType(),
					 TypesFactory.eINSTANCE.createSessionlessInvokeResponseType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SessionSecurityDiagnosticsDataType(),
					 TypesFactory.eINSTANCE.createSessionSecurityDiagnosticsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeRequest(),
					 TypesFactory.eINSTANCE.createSetMonitoringModeRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SetMonitoringModeResponse(),
					 TypesFactory.eINSTANCE.createSetMonitoringModeResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeRequest(),
					 TypesFactory.eINSTANCE.createSetPublishingModeRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SetPublishingModeResponse(),
					 TypesFactory.eINSTANCE.createSetPublishingModeResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringRequest(),
					 TypesFactory.eINSTANCE.createSetTriggeringRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SetTriggeringResponse(),
					 TypesFactory.eINSTANCE.createSetTriggeringResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SignatureData(),
					 TypesFactory.eINSTANCE.createSignatureData())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SignedSoftwareCertificate(),
					 TypesFactory.eINSTANCE.createSignedSoftwareCertificate())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SimpleAttributeOperand(),
					 TypesFactory.eINSTANCE.createSimpleAttributeOperand())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SimpleTypeDescription(),
					 TypesFactory.eINSTANCE.createSimpleTypeDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_StatusChangeNotification(),
					 TypesFactory.eINSTANCE.createStatusChangeNotification())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_StatusCode(),
					 TypesFactory.eINSTANCE.createStatusCode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_StatusResult(),
					 TypesFactory.eINSTANCE.createStatusResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_String(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_StructureDefinition(),
					 TypesFactory.eINSTANCE.createStructureDefinition())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_StructureDescription(),
					 TypesFactory.eINSTANCE.createStructureDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_StructureField(),
					 TypesFactory.eINSTANCE.createStructureField())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_StructureType(),
					 StructureType.STRUCTURE0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType(),
					 TypesFactory.eINSTANCE.createSubscribedDataSetDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType(),
					 TypesFactory.eINSTANCE.createSubscribedDataSetMirrorDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetDataType(),
					 TypesFactory.eINSTANCE.createTargetVariablesDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SubscribedDataSetMirrorDataType(),
					 TypesFactory.eINSTANCE.createSubscribedDataSetMirrorDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionAcknowledgement(),
					 TypesFactory.eINSTANCE.createSubscriptionAcknowledgement())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_SubscriptionDiagnosticsDataType(),
					 TypesFactory.eINSTANCE.createSubscriptionDiagnosticsDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TargetVariablesDataType(),
					 TypesFactory.eINSTANCE.createTargetVariablesDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDCartesianCoordinates(),
					 TypesFactory.eINSTANCE.createThreeDCartesianCoordinates())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDFrame(),
					 TypesFactory.eINSTANCE.createThreeDFrame())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDOrientation(),
					 TypesFactory.eINSTANCE.createThreeDOrientation())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ThreeDVector(),
					 TypesFactory.eINSTANCE.createThreeDVector())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Time(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TimestampsToReturn(),
					 TimestampsToReturn.SOURCE0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TimeString(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TimeZoneDataType(),
					 TypesFactory.eINSTANCE.createTimeZoneDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TransferResult(),
					 TypesFactory.eINSTANCE.createTransferResult())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsRequest(),
					 TypesFactory.eINSTANCE.createTransferSubscriptionsRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TransferSubscriptionsResponse(),
					 TypesFactory.eINSTANCE.createTransferSubscriptionsResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsRequest(),
					 TypesFactory.eINSTANCE.createTranslateBrowsePathsToNodeIdsRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TranslateBrowsePathsToNodeIdsResponse(),
					 TypesFactory.eINSTANCE.createTranslateBrowsePathsToNodeIdsResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TrustListDataType(),
					 TypesFactory.eINSTANCE.createTrustListDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TrustListMasks(),
					 TrustListMasks.NONE0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(),
					 TypesFactory.eINSTANCE.createTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(),
					 TypesFactory.eINSTANCE.createDataTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(),
					 TypesFactory.eINSTANCE.createObjectTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(),
					 TypesFactory.eINSTANCE.createReferenceTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_TypeNode(),
					 TypesFactory.eINSTANCE.createVariableTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UABinaryFileDataType(),
					 TypesFactory.eINSTANCE.createUABinaryFileDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetMessageContentMask(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getUadpDataSetMessageContentMask(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetReaderMessageDataType(),
					 TypesFactory.eINSTANCE.createUadpDataSetReaderMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UadpDataSetWriterMessageDataType(),
					 TypesFactory.eINSTANCE.createUadpDataSetWriterMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UadpNetworkMessageContentMask(),
					 TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getUadpNetworkMessageContentMask(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UadpWriterGroupMessageDataType(),
					 TypesFactory.eINSTANCE.createUadpWriterGroupMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UInt16(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_SHORT_OBJECT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UInt32(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT_OBJECT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UInt64(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_LONG, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Union(),
					 TypesFactory.eINSTANCE.createUnion())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesRequest(),
					 TypesFactory.eINSTANCE.createUnregisterNodesRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UnregisterNodesResponse(),
					 TypesFactory.eINSTANCE.createUnregisterNodesResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UpdateDataDetails(),
					 TypesFactory.eINSTANCE.createUpdateDataDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UpdateEventDetails(),
					 TypesFactory.eINSTANCE.createUpdateEventDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UpdateStructureDataDetails(),
					 TypesFactory.eINSTANCE.createUpdateStructureDataDetails())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(),
					 TypesFactory.eINSTANCE.createUserIdentityToken())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(),
					 TypesFactory.eINSTANCE.createAnonymousIdentityToken())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(),
					 TypesFactory.eINSTANCE.createIssuedIdentityToken())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(),
					 TypesFactory.eINSTANCE.createUserNameIdentityToken())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UserIdentityToken(),
					 TypesFactory.eINSTANCE.createX509IdentityToken())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UserNameIdentityToken(),
					 TypesFactory.eINSTANCE.createUserNameIdentityToken())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UserTokenPolicy(),
					 TypesFactory.eINSTANCE.createUserTokenPolicy())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UserTokenType(),
					 UserTokenType.ANONYMOUS0)));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_UtcTime(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_VariableAttributes(),
					 TypesFactory.eINSTANCE.createVariableAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_VariableNode(),
					 TypesFactory.eINSTANCE.createVariableNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeAttributes(),
					 TypesFactory.eINSTANCE.createVariableTypeAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_VariableTypeNode(),
					 TypesFactory.eINSTANCE.createVariableTypeNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Variant(),
					 TypesFactory.eINSTANCE.createVariant())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Vector(),
					 TypesFactory.eINSTANCE.createVector())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_Vector(),
					 TypesFactory.eINSTANCE.createThreeDVector())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_VersionTime(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ViewAttributes(),
					 TypesFactory.eINSTANCE.createViewAttributes())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ViewDescription(),
					 TypesFactory.eINSTANCE.createViewDescription())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_ViewNode(),
					 TypesFactory.eINSTANCE.createViewNode())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_WriteRequest(),
					 TypesFactory.eINSTANCE.createWriteRequest())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_WriteResponse(),
					 TypesFactory.eINSTANCE.createWriteResponse())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupDataType(),
					 TypesFactory.eINSTANCE.createWriterGroupDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType(),
					 TypesFactory.eINSTANCE.createWriterGroupMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType(),
					 TypesFactory.eINSTANCE.createJsonWriterGroupMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupMessageDataType(),
					 TypesFactory.eINSTANCE.createUadpWriterGroupMessageDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType(),
					 TypesFactory.eINSTANCE.createWriterGroupTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType(),
					 TypesFactory.eINSTANCE.createBrokerWriterGroupTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_WriterGroupTransportDataType(),
					 TypesFactory.eINSTANCE.createDatagramWriterGroupTransportDataType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_WriteValue(),
					 TypesFactory.eINSTANCE.createWriteValue())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_X509IdentityToken(),
					 TypesFactory.eINSTANCE.createX509IdentityToken())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getValueType_Any(),
				 FeatureMapUtil.createEntry
					(TypesPackage.eINSTANCE.getDocumentRoot_XVType(),
					 TypesFactory.eINSTANCE.createXVType())));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

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
