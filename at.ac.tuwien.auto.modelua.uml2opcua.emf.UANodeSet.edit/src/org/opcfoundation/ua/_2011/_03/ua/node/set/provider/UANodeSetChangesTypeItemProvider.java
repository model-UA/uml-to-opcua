/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.provider;


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

import org.opcfoundation.ua._2011._03.ua.node.set.SetFactory;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2011._03.ua.node.set.UANodeSetChangesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UANodeSetChangesTypeItemProvider 
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
	public UANodeSetChangesTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAcceptAllOrNothingPropertyDescriptor(object);
			addLastModifiedPropertyDescriptor(object);
			addTransactionIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Accept All Or Nothing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcceptAllOrNothingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANodeSetChangesType_acceptAllOrNothing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANodeSetChangesType_acceptAllOrNothing_feature", "_UI_UANodeSetChangesType_type"),
				 SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Modified feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastModifiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANodeSetChangesType_lastModified_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANodeSetChangesType_lastModified_feature", "_UI_UANodeSetChangesType_type"),
				 SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__LAST_MODIFIED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transaction Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransactionIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANodeSetChangesType_transactionId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANodeSetChangesType_transactionId_feature", "_UI_UANodeSetChangesType_type"),
				 SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__TRANSACTION_ID,
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
			childrenFeatures.add(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS);
			childrenFeatures.add(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS);
			childrenFeatures.add(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__ALIASES);
			childrenFeatures.add(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS);
			childrenFeatures.add(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD);
			childrenFeatures.add(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD);
			childrenFeatures.add(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE);
			childrenFeatures.add(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE);
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
	 * This returns UANodeSetChangesType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UANodeSetChangesType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UANodeSetChangesType uaNodeSetChangesType = (UANodeSetChangesType)object;
		return getString("_UI_UANodeSetChangesType_type") + " " + uaNodeSetChangesType.isAcceptAllOrNothing();
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

		switch (notification.getFeatureID(UANodeSetChangesType.class)) {
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ACCEPT_ALL_OR_NOTHING:
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__LAST_MODIFIED:
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__TRANSACTION_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS:
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS:
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__ALIASES:
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS:
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD:
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD:
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE:
			case SetPackage.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE:
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
				(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS,
				 SetFactory.eINSTANCE.createUriTable()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS,
				 SetFactory.eINSTANCE.createUriTable()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__ALIASES,
				 SetFactory.eINSTANCE.createAliasTable()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__EXTENSIONS,
				 SetFactory.eINSTANCE.createListOfExtensions()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__NODES_TO_ADD,
				 SetFactory.eINSTANCE.createNodesToAdd()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD,
				 SetFactory.eINSTANCE.createReferencesToChange()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__NODES_TO_DELETE,
				 SetFactory.eINSTANCE.createNodesToDelete()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE,
				 SetFactory.eINSTANCE.createReferencesToChange()));
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
			childFeature == SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__NAMESPACE_URIS ||
			childFeature == SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__SERVER_URIS ||
			childFeature == SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_ADD ||
			childFeature == SetPackage.Literals.UA_NODE_SET_CHANGES_TYPE__REFERENCES_TO_DELETE;

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
		return UANodeSetEditPlugin.INSTANCE;
	}

}
