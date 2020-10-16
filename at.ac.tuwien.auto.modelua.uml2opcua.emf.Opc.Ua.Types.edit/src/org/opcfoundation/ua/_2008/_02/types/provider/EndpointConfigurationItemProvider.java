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

import org.opcfoundation.ua._2008._02.types.EndpointConfiguration;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EndpointConfigurationItemProvider 
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
	public EndpointConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addOperationTimeoutPropertyDescriptor(object);
			addUseBinaryEncodingPropertyDescriptor(object);
			addMaxStringLengthPropertyDescriptor(object);
			addMaxByteStringLengthPropertyDescriptor(object);
			addMaxArrayLengthPropertyDescriptor(object);
			addMaxMessageSizePropertyDescriptor(object);
			addMaxBufferSizePropertyDescriptor(object);
			addChannelLifetimePropertyDescriptor(object);
			addSecurityTokenLifetimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operation Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EndpointConfiguration_operationTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EndpointConfiguration_operationTimeout_feature", "_UI_EndpointConfiguration_type"),
				 TypesPackage.eINSTANCE.getEndpointConfiguration_OperationTimeout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Binary Encoding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseBinaryEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EndpointConfiguration_useBinaryEncoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EndpointConfiguration_useBinaryEncoding_feature", "_UI_EndpointConfiguration_type"),
				 TypesPackage.eINSTANCE.getEndpointConfiguration_UseBinaryEncoding(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max String Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxStringLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EndpointConfiguration_maxStringLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EndpointConfiguration_maxStringLength_feature", "_UI_EndpointConfiguration_type"),
				 TypesPackage.eINSTANCE.getEndpointConfiguration_MaxStringLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Byte String Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxByteStringLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EndpointConfiguration_maxByteStringLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EndpointConfiguration_maxByteStringLength_feature", "_UI_EndpointConfiguration_type"),
				 TypesPackage.eINSTANCE.getEndpointConfiguration_MaxByteStringLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Array Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxArrayLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EndpointConfiguration_maxArrayLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EndpointConfiguration_maxArrayLength_feature", "_UI_EndpointConfiguration_type"),
				 TypesPackage.eINSTANCE.getEndpointConfiguration_MaxArrayLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Message Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxMessageSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EndpointConfiguration_maxMessageSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EndpointConfiguration_maxMessageSize_feature", "_UI_EndpointConfiguration_type"),
				 TypesPackage.eINSTANCE.getEndpointConfiguration_MaxMessageSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Buffer Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxBufferSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EndpointConfiguration_maxBufferSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EndpointConfiguration_maxBufferSize_feature", "_UI_EndpointConfiguration_type"),
				 TypesPackage.eINSTANCE.getEndpointConfiguration_MaxBufferSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Channel Lifetime feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChannelLifetimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EndpointConfiguration_channelLifetime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EndpointConfiguration_channelLifetime_feature", "_UI_EndpointConfiguration_type"),
				 TypesPackage.eINSTANCE.getEndpointConfiguration_ChannelLifetime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Token Lifetime feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityTokenLifetimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EndpointConfiguration_securityTokenLifetime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EndpointConfiguration_securityTokenLifetime_feature", "_UI_EndpointConfiguration_type"),
				 TypesPackage.eINSTANCE.getEndpointConfiguration_SecurityTokenLifetime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EndpointConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EndpointConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EndpointConfiguration endpointConfiguration = (EndpointConfiguration)object;
		return getString("_UI_EndpointConfiguration_type") + " " + endpointConfiguration.getOperationTimeout();
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

		switch (notification.getFeatureID(EndpointConfiguration.class)) {
			case TypesPackage.ENDPOINT_CONFIGURATION__OPERATION_TIMEOUT:
			case TypesPackage.ENDPOINT_CONFIGURATION__USE_BINARY_ENCODING:
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_STRING_LENGTH:
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_BYTE_STRING_LENGTH:
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_ARRAY_LENGTH:
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_MESSAGE_SIZE:
			case TypesPackage.ENDPOINT_CONFIGURATION__MAX_BUFFER_SIZE:
			case TypesPackage.ENDPOINT_CONFIGURATION__CHANNEL_LIFETIME:
			case TypesPackage.ENDPOINT_CONFIGURATION__SECURITY_TOKEN_LIFETIME:
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
