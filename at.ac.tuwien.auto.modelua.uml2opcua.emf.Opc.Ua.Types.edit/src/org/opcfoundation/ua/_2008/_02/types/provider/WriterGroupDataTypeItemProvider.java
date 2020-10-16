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
import org.opcfoundation.ua._2008._02.types.WriterGroupDataType;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WriterGroupDataTypeItemProvider extends PubSubGroupDataTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriterGroupDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addWriterGroupIdPropertyDescriptor(object);
			addPublishingIntervalPropertyDescriptor(object);
			addKeepAliveTimePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addHeaderLayoutUriPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_WriterGroupDataType_writerGroupId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WriterGroupDataType_writerGroupId_feature", "_UI_WriterGroupDataType_type"),
				 TypesPackage.eINSTANCE.getWriterGroupDataType_WriterGroupId(),
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
				 getString("_UI_WriterGroupDataType_publishingInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WriterGroupDataType_publishingInterval_feature", "_UI_WriterGroupDataType_type"),
				 TypesPackage.eINSTANCE.getWriterGroupDataType_PublishingInterval(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keep Alive Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeepAliveTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WriterGroupDataType_keepAliveTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WriterGroupDataType_keepAliveTime_feature", "_UI_WriterGroupDataType_type"),
				 TypesPackage.eINSTANCE.getWriterGroupDataType_KeepAliveTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_WriterGroupDataType_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WriterGroupDataType_priority_feature", "_UI_WriterGroupDataType_type"),
				 TypesPackage.eINSTANCE.getWriterGroupDataType_Priority(),
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
				 getString("_UI_WriterGroupDataType_headerLayoutUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WriterGroupDataType_headerLayoutUri_feature", "_UI_WriterGroupDataType_type"),
				 TypesPackage.eINSTANCE.getWriterGroupDataType_HeaderLayoutUri(),
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
			childrenFeatures.add(TypesPackage.eINSTANCE.getWriterGroupDataType_LocaleIds());
			childrenFeatures.add(TypesPackage.eINSTANCE.getWriterGroupDataType_TransportSettings());
			childrenFeatures.add(TypesPackage.eINSTANCE.getWriterGroupDataType_MessageSettings());
			childrenFeatures.add(TypesPackage.eINSTANCE.getWriterGroupDataType_DataSetWriters());
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
	 * This returns WriterGroupDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WriterGroupDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WriterGroupDataType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WriterGroupDataType_type") :
			getString("_UI_WriterGroupDataType_type") + " " + label;
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

		switch (notification.getFeatureID(WriterGroupDataType.class)) {
			case TypesPackage.WRITER_GROUP_DATA_TYPE__WRITER_GROUP_ID:
			case TypesPackage.WRITER_GROUP_DATA_TYPE__PUBLISHING_INTERVAL:
			case TypesPackage.WRITER_GROUP_DATA_TYPE__KEEP_ALIVE_TIME:
			case TypesPackage.WRITER_GROUP_DATA_TYPE__PRIORITY:
			case TypesPackage.WRITER_GROUP_DATA_TYPE__HEADER_LAYOUT_URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS:
			case TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
			case TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
			case TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS:
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
				(TypesPackage.eINSTANCE.getWriterGroupDataType_LocaleIds(),
				 TypesFactory.eINSTANCE.createListOfString()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getWriterGroupDataType_TransportSettings(),
				 TypesFactory.eINSTANCE.createExtensionObject()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getWriterGroupDataType_MessageSettings(),
				 TypesFactory.eINSTANCE.createExtensionObject()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getWriterGroupDataType_DataSetWriters(),
				 TypesFactory.eINSTANCE.createListOfDataSetWriterDataType()));
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
			childFeature == TypesPackage.eINSTANCE.getWriterGroupDataType_TransportSettings() ||
			childFeature == TypesPackage.eINSTANCE.getWriterGroupDataType_MessageSettings();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
