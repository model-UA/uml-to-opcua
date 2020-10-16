/**
 */
package org.opcfoundation.ua._2008._02.types.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UadpDataSetWriterMessageDataTypeItemProvider extends DataSetWriterMessageDataTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UadpDataSetWriterMessageDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDataSetMessageContentMaskPropertyDescriptor(object);
			addConfiguredSizePropertyDescriptor(object);
			addNetworkMessageNumberPropertyDescriptor(object);
			addDataSetOffsetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Set Message Content Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSetMessageContentMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UadpDataSetWriterMessageDataType_dataSetMessageContentMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetWriterMessageDataType_dataSetMessageContentMask_feature", "_UI_UadpDataSetWriterMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetWriterMessageDataType_DataSetMessageContentMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Configured Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfiguredSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UadpDataSetWriterMessageDataType_configuredSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetWriterMessageDataType_configuredSize_feature", "_UI_UadpDataSetWriterMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetWriterMessageDataType_ConfiguredSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Message Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkMessageNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UadpDataSetWriterMessageDataType_networkMessageNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetWriterMessageDataType_networkMessageNumber_feature", "_UI_UadpDataSetWriterMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetWriterMessageDataType_NetworkMessageNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Set Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSetOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UadpDataSetWriterMessageDataType_dataSetOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetWriterMessageDataType_dataSetOffset_feature", "_UI_UadpDataSetWriterMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetWriterMessageDataType_DataSetOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns UadpDataSetWriterMessageDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UadpDataSetWriterMessageDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UadpDataSetWriterMessageDataType uadpDataSetWriterMessageDataType = (UadpDataSetWriterMessageDataType)object;
		return getString("_UI_UadpDataSetWriterMessageDataType_type") + " " + uadpDataSetWriterMessageDataType.getDataSetMessageContentMask();
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

		switch (notification.getFeatureID(UadpDataSetWriterMessageDataType.class)) {
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__CONFIGURED_SIZE:
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER:
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET:
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

}
