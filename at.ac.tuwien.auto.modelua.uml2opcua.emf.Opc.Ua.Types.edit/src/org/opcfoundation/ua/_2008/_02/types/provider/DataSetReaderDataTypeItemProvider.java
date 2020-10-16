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

import org.opcfoundation.ua._2008._02.types.DataSetReaderDataType;
import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSetReaderDataTypeItemProvider 
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
	public DataSetReaderDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addEnabledPropertyDescriptor(object);
			addWriterGroupIdPropertyDescriptor(object);
			addDataSetWriterIdPropertyDescriptor(object);
			addDataSetFieldContentMaskPropertyDescriptor(object);
			addMessageReceiveTimeoutPropertyDescriptor(object);
			addKeyFrameCountPropertyDescriptor(object);
			addHeaderLayoutUriPropertyDescriptor(object);
			addSecurityModePropertyDescriptor(object);
			addSecurityGroupIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSetReaderDataType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSetReaderDataType_name_feature", "_UI_DataSetReaderDataType_type"),
				 TypesPackage.eINSTANCE.getDataSetReaderDataType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSetReaderDataType_enabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSetReaderDataType_enabled_feature", "_UI_DataSetReaderDataType_type"),
				 TypesPackage.eINSTANCE.getDataSetReaderDataType_Enabled(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Writer Group Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriterGroupIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSetReaderDataType_writerGroupId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSetReaderDataType_writerGroupId_feature", "_UI_DataSetReaderDataType_type"),
				 TypesPackage.eINSTANCE.getDataSetReaderDataType_WriterGroupId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Set Writer Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSetWriterIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSetReaderDataType_dataSetWriterId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSetReaderDataType_dataSetWriterId_feature", "_UI_DataSetReaderDataType_type"),
				 TypesPackage.eINSTANCE.getDataSetReaderDataType_DataSetWriterId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Set Field Content Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSetFieldContentMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSetReaderDataType_dataSetFieldContentMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSetReaderDataType_dataSetFieldContentMask_feature", "_UI_DataSetReaderDataType_type"),
				 TypesPackage.eINSTANCE.getDataSetReaderDataType_DataSetFieldContentMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Receive Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageReceiveTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSetReaderDataType_messageReceiveTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSetReaderDataType_messageReceiveTimeout_feature", "_UI_DataSetReaderDataType_type"),
				 TypesPackage.eINSTANCE.getDataSetReaderDataType_MessageReceiveTimeout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Frame Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyFrameCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSetReaderDataType_keyFrameCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSetReaderDataType_keyFrameCount_feature", "_UI_DataSetReaderDataType_type"),
				 TypesPackage.eINSTANCE.getDataSetReaderDataType_KeyFrameCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Header Layout Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderLayoutUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSetReaderDataType_headerLayoutUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSetReaderDataType_headerLayoutUri_feature", "_UI_DataSetReaderDataType_type"),
				 TypesPackage.eINSTANCE.getDataSetReaderDataType_HeaderLayoutUri(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSetReaderDataType_securityMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSetReaderDataType_securityMode_feature", "_UI_DataSetReaderDataType_type"),
				 TypesPackage.eINSTANCE.getDataSetReaderDataType_SecurityMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Group Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityGroupIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSetReaderDataType_securityGroupId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSetReaderDataType_securityGroupId_feature", "_UI_DataSetReaderDataType_type"),
				 TypesPackage.eINSTANCE.getDataSetReaderDataType_SecurityGroupId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(TypesPackage.eINSTANCE.getDataSetReaderDataType_PublisherId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDataSetReaderDataType_DataSetMetaData());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDataSetReaderDataType_SecurityKeyServices());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDataSetReaderDataType_DataSetReaderProperties());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDataSetReaderDataType_TransportSettings());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDataSetReaderDataType_MessageSettings());
			childrenFeatures.add(TypesPackage.eINSTANCE.getDataSetReaderDataType_SubscribedDataSet());
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
	 * This returns DataSetReaderDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataSetReaderDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataSetReaderDataType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataSetReaderDataType_type") :
			getString("_UI_DataSetReaderDataType_type") + " " + label;
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

		switch (notification.getFeatureID(DataSetReaderDataType.class)) {
			case TypesPackage.DATA_SET_READER_DATA_TYPE__NAME:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__ENABLED:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__WRITER_GROUP_ID:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_WRITER_ID:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_RECEIVE_TIMEOUT:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__KEY_FRAME_COUNT:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__HEADER_LAYOUT_URI:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_MODE:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_GROUP_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__PUBLISHER_ID:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS:
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET:
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
				(TypesPackage.eINSTANCE.getDataSetReaderDataType_PublisherId(),
				 TypesFactory.eINSTANCE.createVariant()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDataSetReaderDataType_DataSetMetaData(),
				 TypesFactory.eINSTANCE.createDataSetMetaDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDataSetReaderDataType_SecurityKeyServices(),
				 TypesFactory.eINSTANCE.createListOfEndpointDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDataSetReaderDataType_DataSetReaderProperties(),
				 TypesFactory.eINSTANCE.createListOfKeyValuePair()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDataSetReaderDataType_TransportSettings(),
				 TypesFactory.eINSTANCE.createExtensionObject()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDataSetReaderDataType_MessageSettings(),
				 TypesFactory.eINSTANCE.createExtensionObject()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getDataSetReaderDataType_SubscribedDataSet(),
				 TypesFactory.eINSTANCE.createExtensionObject()));
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
			childFeature == TypesPackage.eINSTANCE.getDataSetReaderDataType_TransportSettings() ||
			childFeature == TypesPackage.eINSTANCE.getDataSetReaderDataType_MessageSettings() ||
			childFeature == TypesPackage.eINSTANCE.getDataSetReaderDataType_SubscribedDataSet();

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
