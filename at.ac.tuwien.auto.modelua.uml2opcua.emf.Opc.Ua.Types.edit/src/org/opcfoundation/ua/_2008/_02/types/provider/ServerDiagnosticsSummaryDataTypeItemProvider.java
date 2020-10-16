/**
 */
package org.opcfoundation.ua._2008._02.types.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerDiagnosticsSummaryDataTypeItemProvider 
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
	public ServerDiagnosticsSummaryDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addServerViewCountPropertyDescriptor(object);
			addCurrentSessionCountPropertyDescriptor(object);
			addCumulatedSessionCountPropertyDescriptor(object);
			addSecurityRejectedSessionCountPropertyDescriptor(object);
			addRejectedSessionCountPropertyDescriptor(object);
			addSessionTimeoutCountPropertyDescriptor(object);
			addSessionAbortCountPropertyDescriptor(object);
			addCurrentSubscriptionCountPropertyDescriptor(object);
			addCumulatedSubscriptionCountPropertyDescriptor(object);
			addPublishingIntervalCountPropertyDescriptor(object);
			addSecurityRejectedRequestsCountPropertyDescriptor(object);
			addRejectedRequestsCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Server View Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerViewCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_serverViewCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_serverViewCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_ServerViewCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Session Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentSessionCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_currentSessionCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_currentSessionCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_CurrentSessionCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cumulated Session Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCumulatedSessionCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_cumulatedSessionCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_cumulatedSessionCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_CumulatedSessionCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Rejected Session Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityRejectedSessionCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_securityRejectedSessionCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_securityRejectedSessionCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_SecurityRejectedSessionCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rejected Session Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRejectedSessionCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_rejectedSessionCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_rejectedSessionCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_RejectedSessionCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Session Timeout Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSessionTimeoutCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_sessionTimeoutCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_sessionTimeoutCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_SessionTimeoutCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Session Abort Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSessionAbortCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_sessionAbortCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_sessionAbortCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_SessionAbortCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Subscription Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentSubscriptionCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_currentSubscriptionCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_currentSubscriptionCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_CurrentSubscriptionCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cumulated Subscription Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCumulatedSubscriptionCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_cumulatedSubscriptionCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_cumulatedSubscriptionCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_CumulatedSubscriptionCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publishing Interval Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishingIntervalCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_publishingIntervalCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_publishingIntervalCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_PublishingIntervalCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Rejected Requests Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityRejectedRequestsCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_securityRejectedRequestsCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_securityRejectedRequestsCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_SecurityRejectedRequestsCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rejected Requests Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRejectedRequestsCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerDiagnosticsSummaryDataType_rejectedRequestsCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerDiagnosticsSummaryDataType_rejectedRequestsCount_feature", "_UI_ServerDiagnosticsSummaryDataType_type"),
				 TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType_RejectedRequestsCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ServerDiagnosticsSummaryDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServerDiagnosticsSummaryDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ServerDiagnosticsSummaryDataType serverDiagnosticsSummaryDataType = (ServerDiagnosticsSummaryDataType)object;
		return getString("_UI_ServerDiagnosticsSummaryDataType_type") + " " + serverDiagnosticsSummaryDataType.getServerViewCount();
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

		switch (notification.getFeatureID(ServerDiagnosticsSummaryDataType.class)) {
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SERVER_VIEW_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SESSION_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SESSION_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_SESSION_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_SESSION_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_TIMEOUT_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_ABORT_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SUBSCRIPTION_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SUBSCRIPTION_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__PUBLISHING_INTERVAL_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_REQUESTS_COUNT:
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_REQUESTS_COUNT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
