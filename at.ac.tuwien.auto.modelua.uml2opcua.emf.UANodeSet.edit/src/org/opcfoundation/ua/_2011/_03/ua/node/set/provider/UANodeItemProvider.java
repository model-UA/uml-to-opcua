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
import org.opcfoundation.ua._2011._03.ua.node.set.UANode;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2011._03.ua.node.set.UANode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UANodeItemProvider 
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
	public UANodeItemProvider(AdapterFactory adapterFactory) {
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

			addCategoryPropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
			addAccessRestrictionsPropertyDescriptor(object);
			addBrowseNamePropertyDescriptor(object);
			addNodeIdPropertyDescriptor(object);
			addReleaseStatusPropertyDescriptor(object);
			addSymbolicNamePropertyDescriptor(object);
			addUserWriteMaskPropertyDescriptor(object);
			addWriteMaskPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANode_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANode_category_feature", "_UI_UANode_type"),
				 SetPackage.Literals.UA_NODE__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANode_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANode_documentation_feature", "_UI_UANode_type"),
				 SetPackage.Literals.UA_NODE__DOCUMENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Restrictions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessRestrictionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANode_accessRestrictions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANode_accessRestrictions_feature", "_UI_UANode_type"),
				 SetPackage.Literals.UA_NODE__ACCESS_RESTRICTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Browse Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrowseNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANode_browseName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANode_browseName_feature", "_UI_UANode_type"),
				 SetPackage.Literals.UA_NODE__BROWSE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANode_nodeId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANode_nodeId_feature", "_UI_UANode_type"),
				 SetPackage.Literals.UA_NODE__NODE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Release Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReleaseStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANode_releaseStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANode_releaseStatus_feature", "_UI_UANode_type"),
				 SetPackage.Literals.UA_NODE__RELEASE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Symbolic Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymbolicNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANode_symbolicName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANode_symbolicName_feature", "_UI_UANode_type"),
				 SetPackage.Literals.UA_NODE__SYMBOLIC_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Write Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserWriteMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANode_userWriteMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANode_userWriteMask_feature", "_UI_UANode_type"),
				 SetPackage.Literals.UA_NODE__USER_WRITE_MASK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Write Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriteMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UANode_writeMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UANode_writeMask_feature", "_UI_UANode_type"),
				 SetPackage.Literals.UA_NODE__WRITE_MASK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(SetPackage.Literals.UA_NODE__DISPLAY_NAME);
			childrenFeatures.add(SetPackage.Literals.UA_NODE__DESCRIPTION);
			childrenFeatures.add(SetPackage.Literals.UA_NODE__REFERENCES);
			childrenFeatures.add(SetPackage.Literals.UA_NODE__ROLE_PERMISSIONS);
			childrenFeatures.add(SetPackage.Literals.UA_NODE__EXTENSIONS);
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
	 * This returns UANode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UANode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UANode)object).getBrowseName();
		return label == null || label.length() == 0 ?
			getString("_UI_UANode_type") :
			getString("_UI_UANode_type") + " " + label;
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

		switch (notification.getFeatureID(UANode.class)) {
			case SetPackage.UA_NODE__CATEGORY:
			case SetPackage.UA_NODE__DOCUMENTATION:
			case SetPackage.UA_NODE__ACCESS_RESTRICTIONS:
			case SetPackage.UA_NODE__BROWSE_NAME:
			case SetPackage.UA_NODE__NODE_ID:
			case SetPackage.UA_NODE__RELEASE_STATUS:
			case SetPackage.UA_NODE__SYMBOLIC_NAME:
			case SetPackage.UA_NODE__USER_WRITE_MASK:
			case SetPackage.UA_NODE__WRITE_MASK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SetPackage.UA_NODE__DISPLAY_NAME:
			case SetPackage.UA_NODE__DESCRIPTION:
			case SetPackage.UA_NODE__REFERENCES:
			case SetPackage.UA_NODE__ROLE_PERMISSIONS:
			case SetPackage.UA_NODE__EXTENSIONS:
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
				(SetPackage.Literals.UA_NODE__DISPLAY_NAME,
				 SetFactory.eINSTANCE.createLocalizedText()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE__DESCRIPTION,
				 SetFactory.eINSTANCE.createLocalizedText()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE__REFERENCES,
				 SetFactory.eINSTANCE.createListOfReferences()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE__ROLE_PERMISSIONS,
				 SetFactory.eINSTANCE.createListOfRolePermissions()));

		newChildDescriptors.add
			(createChildParameter
				(SetPackage.Literals.UA_NODE__EXTENSIONS,
				 SetFactory.eINSTANCE.createListOfExtensions()));
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
			childFeature == SetPackage.Literals.UA_NODE__DISPLAY_NAME ||
			childFeature == SetPackage.Literals.UA_NODE__DESCRIPTION;

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
