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
import org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UadpWriterGroupMessageDataTypeItemProvider extends WriterGroupMessageDataTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UadpWriterGroupMessageDataTypeItemProvider(AdapterFactory adapterFactory) {
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
			addDataSetOrderingPropertyDescriptor(object);
			addNetworkMessageContentMaskPropertyDescriptor(object);
			addSamplingOffsetPropertyDescriptor(object);
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
				 getString("_UI_UadpWriterGroupMessageDataType_groupVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpWriterGroupMessageDataType_groupVersion_feature", "_UI_UadpWriterGroupMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpWriterGroupMessageDataType_GroupVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Set Ordering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSetOrderingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UadpWriterGroupMessageDataType_dataSetOrdering_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpWriterGroupMessageDataType_dataSetOrdering_feature", "_UI_UadpWriterGroupMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpWriterGroupMessageDataType_DataSetOrdering(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_UadpWriterGroupMessageDataType_networkMessageContentMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpWriterGroupMessageDataType_networkMessageContentMask_feature", "_UI_UadpWriterGroupMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpWriterGroupMessageDataType_NetworkMessageContentMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sampling Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplingOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UadpWriterGroupMessageDataType_samplingOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UadpWriterGroupMessageDataType_samplingOffset_feature", "_UI_UadpWriterGroupMessageDataType_type"),
				 TypesPackage.eINSTANCE.getUadpWriterGroupMessageDataType_SamplingOffset(),
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
			childrenFeatures.add(TypesPackage.eINSTANCE.getUadpWriterGroupMessageDataType_PublishingOffset());
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
	 * This returns UadpWriterGroupMessageDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UadpWriterGroupMessageDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UadpWriterGroupMessageDataType uadpWriterGroupMessageDataType = (UadpWriterGroupMessageDataType)object;
		return getString("_UI_UadpWriterGroupMessageDataType_type") + " " + uadpWriterGroupMessageDataType.getGroupVersion();
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

		switch (notification.getFeatureID(UadpWriterGroupMessageDataType.class)) {
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__GROUP_VERSION:
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__DATA_SET_ORDERING:
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__NETWORK_MESSAGE_CONTENT_MASK:
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__SAMPLING_OFFSET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE__PUBLISHING_OFFSET:
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
				(TypesPackage.eINSTANCE.getUadpWriterGroupMessageDataType_PublishingOffset(),
				 TypesFactory.eINSTANCE.createListOfDouble()));
	}

}
