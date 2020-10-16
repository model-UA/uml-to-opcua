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

import org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SamplingIntervalDiagnosticsDataTypeItemProvider 
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
	public SamplingIntervalDiagnosticsDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addSamplingIntervalPropertyDescriptor(object);
			addMonitoredItemCountPropertyDescriptor(object);
			addMaxMonitoredItemCountPropertyDescriptor(object);
			addDisabledMonitoredItemCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sampling Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplingIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SamplingIntervalDiagnosticsDataType_samplingInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SamplingIntervalDiagnosticsDataType_samplingInterval_feature", "_UI_SamplingIntervalDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSamplingIntervalDiagnosticsDataType_SamplingInterval(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_SamplingIntervalDiagnosticsDataType_monitoredItemCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SamplingIntervalDiagnosticsDataType_monitoredItemCount_feature", "_UI_SamplingIntervalDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSamplingIntervalDiagnosticsDataType_MonitoredItemCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Monitored Item Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxMonitoredItemCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SamplingIntervalDiagnosticsDataType_maxMonitoredItemCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SamplingIntervalDiagnosticsDataType_maxMonitoredItemCount_feature", "_UI_SamplingIntervalDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSamplingIntervalDiagnosticsDataType_MaxMonitoredItemCount(),
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
				 getString("_UI_SamplingIntervalDiagnosticsDataType_disabledMonitoredItemCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SamplingIntervalDiagnosticsDataType_disabledMonitoredItemCount_feature", "_UI_SamplingIntervalDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSamplingIntervalDiagnosticsDataType_DisabledMonitoredItemCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SamplingIntervalDiagnosticsDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SamplingIntervalDiagnosticsDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SamplingIntervalDiagnosticsDataType samplingIntervalDiagnosticsDataType = (SamplingIntervalDiagnosticsDataType)object;
		return getString("_UI_SamplingIntervalDiagnosticsDataType_type") + " " + samplingIntervalDiagnosticsDataType.getSamplingInterval();
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

		switch (notification.getFeatureID(SamplingIntervalDiagnosticsDataType.class)) {
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL:
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT:
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MAX_MONITORED_ITEM_COUNT:
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT:
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
