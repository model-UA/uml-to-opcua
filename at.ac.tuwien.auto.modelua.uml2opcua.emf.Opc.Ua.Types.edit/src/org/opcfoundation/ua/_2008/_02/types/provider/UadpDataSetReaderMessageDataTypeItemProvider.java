/**
 */
package org.opcfoundation.ua._2008._02.types.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UadpDataSetReaderMessageDataTypeItemProvider extends DataSetReaderMessageDataTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UadpDataSetReaderMessageDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addGroupVersionPropertyDescriptor(object);
			addNetworkMessageNumberPropertyDescriptor(object);
			addDataSetOffsetPropertyDescriptor(object);
			addNetworkMessageContentMaskPropertyDescriptor(object);
			addDataSetMessageContentMaskPropertyDescriptor(object);
			addPublishingIntervalPropertyDescriptor(object);
			addReceiveOffsetPropertyDescriptor(object);
			addProcessingOffsetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Group Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UadpDataSetReaderMessageDataType_groupVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetReaderMessageDataType_groupVersion_feature", "_UI_UadpDataSetReaderMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType_GroupVersion(),
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
				 getString("_UI_UadpDataSetReaderMessageDataType_networkMessageNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetReaderMessageDataType_networkMessageNumber_feature", "_UI_UadpDataSetReaderMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType_NetworkMessageNumber(),
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
				 getString("_UI_UadpDataSetReaderMessageDataType_dataSetOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetReaderMessageDataType_dataSetOffset_feature", "_UI_UadpDataSetReaderMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType_DataSetOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Message Content Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkMessageContentMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UadpDataSetReaderMessageDataType_networkMessageContentMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetReaderMessageDataType_networkMessageContentMask_feature", "_UI_UadpDataSetReaderMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType_NetworkMessageContentMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_UadpDataSetReaderMessageDataType_dataSetMessageContentMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetReaderMessageDataType_dataSetMessageContentMask_feature", "_UI_UadpDataSetReaderMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType_DataSetMessageContentMask(),
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
				 getString("_UI_UadpDataSetReaderMessageDataType_publishingInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetReaderMessageDataType_publishingInterval_feature", "_UI_UadpDataSetReaderMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType_PublishingInterval(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Receive Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceiveOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UadpDataSetReaderMessageDataType_receiveOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetReaderMessageDataType_receiveOffset_feature", "_UI_UadpDataSetReaderMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType_ReceiveOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processing Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UadpDataSetReaderMessageDataType_processingOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpDataSetReaderMessageDataType_processingOffset_feature", "_UI_UadpDataSetReaderMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType_ProcessingOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
			childrenFeatures.add(TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType_DataSetClassId());
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
	 * This returns UadpDataSetReaderMessageDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UadpDataSetReaderMessageDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UadpDataSetReaderMessageDataType uadpDataSetReaderMessageDataType = (UadpDataSetReaderMessageDataType)object;
		return getString("_UI_UadpDataSetReaderMessageDataType_type") + " " + uadpDataSetReaderMessageDataType.getGroupVersion();
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

		switch (notification.getFeatureID(UadpDataSetReaderMessageDataType.class)) {
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__GROUP_VERSION:
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_NUMBER:
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_OFFSET:
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_MESSAGE_CONTENT_MASK:
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PUBLISHING_INTERVAL:
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__RECEIVE_OFFSET:
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__PROCESSING_OFFSET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_CLASS_ID:
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
				(TypesPackage.eINSTANCE.getUadpDataSetReaderMessageDataType_DataSetClassId(),
				 TypesFactory.eINSTANCE.createGuid()));
	}

}
