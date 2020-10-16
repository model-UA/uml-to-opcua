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

import org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SessionDiagnosticsDataTypeItemProvider 
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
	public SessionDiagnosticsDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addSessionNamePropertyDescriptor(object);
			addServerUriPropertyDescriptor(object);
			addEndpointUrlPropertyDescriptor(object);
			addActualSessionTimeoutPropertyDescriptor(object);
			addMaxResponseMessageSizePropertyDescriptor(object);
			addClientConnectionTimePropertyDescriptor(object);
			addClientLastContactTimePropertyDescriptor(object);
			addCurrentSubscriptionsCountPropertyDescriptor(object);
			addCurrentMonitoredItemsCountPropertyDescriptor(object);
			addCurrentPublishRequestsInQueuePropertyDescriptor(object);
			addUnauthorizedRequestCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Session Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSessionNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_sessionName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_sessionName_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SessionName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_serverUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_serverUri_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ServerUri(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endpoint Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_endpointUrl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_endpointUrl_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_EndpointUrl(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Session Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualSessionTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_actualSessionTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_actualSessionTimeout_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ActualSessionTimeout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Response Message Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxResponseMessageSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_maxResponseMessageSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_maxResponseMessageSize_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_MaxResponseMessageSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Connection Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientConnectionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_clientConnectionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_clientConnectionTime_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ClientConnectionTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Last Contact Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientLastContactTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_clientLastContactTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_clientLastContactTime_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ClientLastContactTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Subscriptions Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentSubscriptionsCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_currentSubscriptionsCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_currentSubscriptionsCount_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CurrentSubscriptionsCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Monitored Items Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentMonitoredItemsCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_currentMonitoredItemsCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_currentMonitoredItemsCount_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CurrentMonitoredItemsCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Publish Requests In Queue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentPublishRequestsInQueuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_currentPublishRequestsInQueue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_currentPublishRequestsInQueue_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CurrentPublishRequestsInQueue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unauthorized Request Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnauthorizedRequestCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionDiagnosticsDataType_unauthorizedRequestCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionDiagnosticsDataType_unauthorizedRequestCount_feature", "_UI_SessionDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_UnauthorizedRequestCount(),
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
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SessionId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ClientDescription());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_LocaleIds());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_TotalRequestCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ReadCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_HistoryReadCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_WriteCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_HistoryUpdateCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CallCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CreateMonitoredItemsCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ModifyMonitoredItemsCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SetMonitoringModeCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SetTriggeringCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteMonitoredItemsCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CreateSubscriptionCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ModifySubscriptionCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SetPublishingModeCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_PublishCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_RepublishCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_TransferSubscriptionsCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteSubscriptionsCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_AddNodesCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_AddReferencesCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteNodesCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteReferencesCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_BrowseCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_BrowseNextCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_TranslateBrowsePathsToNodeIdsCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_QueryFirstCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_QueryNextCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_RegisterNodesCount());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_UnregisterNodesCount());
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
	 * This returns SessionDiagnosticsDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SessionDiagnosticsDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SessionDiagnosticsDataType)object).getSessionName();
		return label == null || label.length() == 0 ?
			getString("_UI_SessionDiagnosticsDataType_type") :
			getString("_UI_SessionDiagnosticsDataType_type") + " " + label;
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

		switch (notification.getFeatureID(SessionDiagnosticsDataType.class)) {
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_NAME:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SERVER_URI:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ENDPOINT_URL:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ACTUAL_SESSION_TIMEOUT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MAX_RESPONSE_MESSAGE_SIZE:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_CONNECTION_TIME:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_LAST_CONTACT_TIME:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_SUBSCRIPTIONS_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_MONITORED_ITEMS_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_PUBLISH_REQUESTS_IN_QUEUE:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNAUTHORIZED_REQUEST_COUNT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT:
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT:
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
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SessionId(),
				 TypesFactory.eINSTANCE.createNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ClientDescription(),
				 TypesFactory.eINSTANCE.createApplicationDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_LocaleIds(),
				 TypesFactory.eINSTANCE.createListOfString()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_TotalRequestCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ReadCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_HistoryReadCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_WriteCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_HistoryUpdateCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CallCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CreateMonitoredItemsCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ModifyMonitoredItemsCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SetMonitoringModeCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SetTriggeringCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteMonitoredItemsCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CreateSubscriptionCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ModifySubscriptionCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SetPublishingModeCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_PublishCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_RepublishCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_TransferSubscriptionsCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteSubscriptionsCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_AddNodesCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_AddReferencesCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteNodesCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteReferencesCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_BrowseCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_BrowseNextCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_TranslateBrowsePathsToNodeIdsCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_QueryFirstCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_QueryNextCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_RegisterNodesCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_UnregisterNodesCount(),
				 TypesFactory.eINSTANCE.createServiceCounterDataType()));
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
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_TotalRequestCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ReadCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_HistoryReadCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_WriteCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_HistoryUpdateCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CallCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CreateMonitoredItemsCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ModifyMonitoredItemsCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SetMonitoringModeCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SetTriggeringCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteMonitoredItemsCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_CreateSubscriptionCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_ModifySubscriptionCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_SetPublishingModeCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_PublishCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_RepublishCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_TransferSubscriptionsCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteSubscriptionsCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_AddNodesCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_AddReferencesCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteNodesCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_DeleteReferencesCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_BrowseCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_BrowseNextCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_TranslateBrowsePathsToNodeIdsCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_QueryFirstCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_QueryNextCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_RegisterNodesCount() ||
			childFeature == TypesPackage.eINSTANCE.getSessionDiagnosticsDataType_UnregisterNodesCount();

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
