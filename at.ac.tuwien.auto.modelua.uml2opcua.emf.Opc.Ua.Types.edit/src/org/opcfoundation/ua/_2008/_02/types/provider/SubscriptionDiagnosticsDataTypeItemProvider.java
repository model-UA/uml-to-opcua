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

import org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubscriptionDiagnosticsDataTypeItemProvider 
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
	public SubscriptionDiagnosticsDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addSubscriptionIdPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addPublishingIntervalPropertyDescriptor(object);
			addMaxKeepAliveCountPropertyDescriptor(object);
			addMaxLifetimeCountPropertyDescriptor(object);
			addMaxNotificationsPerPublishPropertyDescriptor(object);
			addPublishingEnabledPropertyDescriptor(object);
			addModifyCountPropertyDescriptor(object);
			addEnableCountPropertyDescriptor(object);
			addDisableCountPropertyDescriptor(object);
			addRepublishRequestCountPropertyDescriptor(object);
			addRepublishMessageRequestCountPropertyDescriptor(object);
			addRepublishMessageCountPropertyDescriptor(object);
			addTransferRequestCountPropertyDescriptor(object);
			addTransferredToAltClientCountPropertyDescriptor(object);
			addTransferredToSameClientCountPropertyDescriptor(object);
			addPublishRequestCountPropertyDescriptor(object);
			addDataChangeNotificationsCountPropertyDescriptor(object);
			addEventNotificationsCountPropertyDescriptor(object);
			addNotificationsCountPropertyDescriptor(object);
			addLatePublishRequestCountPropertyDescriptor(object);
			addCurrentKeepAliveCountPropertyDescriptor(object);
			addCurrentLifetimeCountPropertyDescriptor(object);
			addUnacknowledgedMessageCountPropertyDescriptor(object);
			addDiscardedMessageCountPropertyDescriptor(object);
			addMonitoredItemCountPropertyDescriptor(object);
			addDisabledMonitoredItemCountPropertyDescriptor(object);
			addMonitoringQueueOverflowCountPropertyDescriptor(object);
			addNextSequenceNumberPropertyDescriptor(object);
			addEventQueueOverFlowCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Subscription Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscriptionIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_subscriptionId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_subscriptionId_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_SubscriptionId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_priority_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_Priority(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publishing Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishingIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_publishingInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_publishingInterval_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_PublishingInterval(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Keep Alive Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxKeepAliveCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_maxKeepAliveCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_maxKeepAliveCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_MaxKeepAliveCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Lifetime Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxLifetimeCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_maxLifetimeCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_maxLifetimeCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_MaxLifetimeCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Notifications Per Publish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxNotificationsPerPublishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_maxNotificationsPerPublish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_maxNotificationsPerPublish_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_MaxNotificationsPerPublish(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publishing Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishingEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_publishingEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_publishingEnabled_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_PublishingEnabled(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modify Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifyCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_modifyCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_modifyCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_ModifyCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_enableCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_enableCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_EnableCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disable Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisableCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_disableCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_disableCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_DisableCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Republish Request Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepublishRequestCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_republishRequestCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_republishRequestCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_RepublishRequestCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Republish Message Request Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepublishMessageRequestCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_republishMessageRequestCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_republishMessageRequestCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_RepublishMessageRequestCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Republish Message Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepublishMessageCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_republishMessageCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_republishMessageCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_RepublishMessageCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transfer Request Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransferRequestCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_transferRequestCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_transferRequestCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_TransferRequestCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transferred To Alt Client Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransferredToAltClientCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_transferredToAltClientCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_transferredToAltClientCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_TransferredToAltClientCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transferred To Same Client Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransferredToSameClientCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_transferredToSameClientCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_transferredToSameClientCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_TransferredToSameClientCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publish Request Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishRequestCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_publishRequestCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_publishRequestCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_PublishRequestCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Change Notifications Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataChangeNotificationsCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_dataChangeNotificationsCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_dataChangeNotificationsCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_DataChangeNotificationsCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Notifications Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventNotificationsCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_eventNotificationsCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_eventNotificationsCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_EventNotificationsCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notifications Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotificationsCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_notificationsCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_notificationsCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_NotificationsCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Late Publish Request Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLatePublishRequestCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_latePublishRequestCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_latePublishRequestCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_LatePublishRequestCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Keep Alive Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentKeepAliveCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_currentKeepAliveCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_currentKeepAliveCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_CurrentKeepAliveCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Lifetime Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentLifetimeCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_currentLifetimeCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_currentLifetimeCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_CurrentLifetimeCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unacknowledged Message Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnacknowledgedMessageCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_unacknowledgedMessageCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_unacknowledgedMessageCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_UnacknowledgedMessageCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discarded Message Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscardedMessageCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_discardedMessageCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_discardedMessageCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_DiscardedMessageCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitored Item Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoredItemCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_monitoredItemCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_monitoredItemCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_MonitoredItemCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disabled Monitored Item Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisabledMonitoredItemCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_disabledMonitoredItemCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_disabledMonitoredItemCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_DisabledMonitoredItemCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitoring Queue Overflow Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoringQueueOverflowCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_monitoringQueueOverflowCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_monitoringQueueOverflowCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_MonitoringQueueOverflowCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Sequence Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextSequenceNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_nextSequenceNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_nextSequenceNumber_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_NextSequenceNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Queue Over Flow Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventQueueOverFlowCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubscriptionDiagnosticsDataType_eventQueueOverFlowCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionDiagnosticsDataType_eventQueueOverFlowCount_feature", "_UI_SubscriptionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_EventQueueOverFlowCount(),
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
			childrenFeatures.add(TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_SessionId());
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
	 * This returns SubscriptionDiagnosticsDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SubscriptionDiagnosticsDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SubscriptionDiagnosticsDataType subscriptionDiagnosticsDataType = (SubscriptionDiagnosticsDataType)object;
		return getString("_UI_SubscriptionDiagnosticsDataType_type") + " " + subscriptionDiagnosticsDataType.getSubscriptionId();
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

		switch (notification.getFeatureID(SubscriptionDiagnosticsDataType.class)) {
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_ID:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PRIORITY:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_INTERVAL:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_KEEP_ALIVE_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_LIFETIME_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_NOTIFICATIONS_PER_PUBLISH:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_ENABLED:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MODIFY_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__ENABLE_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLE_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_REQUEST_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_REQUEST_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFER_REQUEST_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_ALT_CLIENT_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_SAME_CLIENT_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISH_REQUEST_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DATA_CHANGE_NOTIFICATIONS_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_NOTIFICATIONS_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NOTIFICATIONS_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__LATE_PUBLISH_REQUEST_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_KEEP_ALIVE_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_LIFETIME_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__UNACKNOWLEDGED_MESSAGE_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISCARDED_MESSAGE_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORING_QUEUE_OVERFLOW_COUNT:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NEXT_SEQUENCE_NUMBER:
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_QUEUE_OVER_FLOW_COUNT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
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
				(TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType_SessionId(),
				 TypesFactory.eINSTANCE.createNodeId()));
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
