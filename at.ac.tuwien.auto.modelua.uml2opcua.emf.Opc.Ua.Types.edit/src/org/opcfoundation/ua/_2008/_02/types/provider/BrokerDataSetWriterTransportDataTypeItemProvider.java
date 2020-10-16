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

import org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BrokerDataSetWriterTransportDataTypeItemProvider extends DataSetWriterTransportDataTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerDataSetWriterTransportDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addQueueNamePropertyDescriptor(object);
			addResourceUriPropertyDescriptor(object);
			addAuthenticationProfileUriPropertyDescriptor(object);
			addRequestedDeliveryGuaranteePropertyDescriptor(object);
			addMetaDataQueueNamePropertyDescriptor(object);
			addMetaDataUpdateTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Queue Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueueNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BrokerDataSetWriterTransportDataType_queueName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BrokerDataSetWriterTransportDataType_queueName_feature", "_UI_BrokerDataSetWriterTransportDataType_type"),
				 TypesPackage.eINSTANCE.getBrokerDataSetWriterTransportDataType_QueueName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BrokerDataSetWriterTransportDataType_resourceUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BrokerDataSetWriterTransportDataType_resourceUri_feature", "_UI_BrokerDataSetWriterTransportDataType_type"),
				 TypesPackage.eINSTANCE.getBrokerDataSetWriterTransportDataType_ResourceUri(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authentication Profile Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationProfileUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BrokerDataSetWriterTransportDataType_authenticationProfileUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BrokerDataSetWriterTransportDataType_authenticationProfileUri_feature", "_UI_BrokerDataSetWriterTransportDataType_type"),
				 TypesPackage.eINSTANCE.getBrokerDataSetWriterTransportDataType_AuthenticationProfileUri(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requested Delivery Guarantee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestedDeliveryGuaranteePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BrokerDataSetWriterTransportDataType_requestedDeliveryGuarantee_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BrokerDataSetWriterTransportDataType_requestedDeliveryGuarantee_feature", "_UI_BrokerDataSetWriterTransportDataType_type"),
				 TypesPackage.eINSTANCE.getBrokerDataSetWriterTransportDataType_RequestedDeliveryGuarantee(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta Data Queue Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaDataQueueNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BrokerDataSetWriterTransportDataType_metaDataQueueName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BrokerDataSetWriterTransportDataType_metaDataQueueName_feature", "_UI_BrokerDataSetWriterTransportDataType_type"),
				 TypesPackage.eINSTANCE.getBrokerDataSetWriterTransportDataType_MetaDataQueueName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta Data Update Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaDataUpdateTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BrokerDataSetWriterTransportDataType_metaDataUpdateTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BrokerDataSetWriterTransportDataType_metaDataUpdateTime_feature", "_UI_BrokerDataSetWriterTransportDataType_type"),
				 TypesPackage.eINSTANCE.getBrokerDataSetWriterTransportDataType_MetaDataUpdateTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns BrokerDataSetWriterTransportDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BrokerDataSetWriterTransportDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BrokerDataSetWriterTransportDataType)object).getQueueName();
		return label == null || label.length() == 0 ?
			getString("_UI_BrokerDataSetWriterTransportDataType_type") :
			getString("_UI_BrokerDataSetWriterTransportDataType_type") + " " + label;
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

		switch (notification.getFeatureID(BrokerDataSetWriterTransportDataType.class)) {
			case TypesPackage.BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__QUEUE_NAME:
			case TypesPackage.BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__RESOURCE_URI:
			case TypesPackage.BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__AUTHENTICATION_PROFILE_URI:
			case TypesPackage.BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__REQUESTED_DELIVERY_GUARANTEE:
			case TypesPackage.BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__META_DATA_QUEUE_NAME:
			case TypesPackage.BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__META_DATA_UPDATE_TIME:
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
