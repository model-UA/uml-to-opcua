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

import org.opcfoundation.ua._2008._02.types.ProgramDiagnosticDataType;
import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.ProgramDiagnosticDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramDiagnosticDataTypeItemProvider 
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
	public ProgramDiagnosticDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addCreateClientNamePropertyDescriptor(object);
			addInvocationCreationTimePropertyDescriptor(object);
			addLastTransitionTimePropertyDescriptor(object);
			addLastMethodCallPropertyDescriptor(object);
			addLastMethodCallTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Create Client Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateClientNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProgramDiagnosticDataType_createClientName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProgramDiagnosticDataType_createClientName_feature", "_UI_ProgramDiagnosticDataType_type"),
				 TypesPackage.eINSTANCE.getProgramDiagnosticDataType_CreateClientName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invocation Creation Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvocationCreationTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProgramDiagnosticDataType_invocationCreationTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProgramDiagnosticDataType_invocationCreationTime_feature", "_UI_ProgramDiagnosticDataType_type"),
				 TypesPackage.eINSTANCE.getProgramDiagnosticDataType_InvocationCreationTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Transition Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastTransitionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProgramDiagnosticDataType_lastTransitionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProgramDiagnosticDataType_lastTransitionTime_feature", "_UI_ProgramDiagnosticDataType_type"),
				 TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastTransitionTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Method Call feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastMethodCallPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProgramDiagnosticDataType_lastMethodCall_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProgramDiagnosticDataType_lastMethodCall_feature", "_UI_ProgramDiagnosticDataType_type"),
				 TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodCall(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Method Call Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastMethodCallTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProgramDiagnosticDataType_lastMethodCallTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProgramDiagnosticDataType_lastMethodCallTime_feature", "_UI_ProgramDiagnosticDataType_type"),
				 TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodCallTime(),
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
			childrenFeatures.add(TypesPackage.eINSTANCE.getProgramDiagnosticDataType_CreateSessionId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodSessionId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodInputArguments());
			childrenFeatures.add(TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodOutputArguments());
			childrenFeatures.add(TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodReturnStatus());
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
	 * This returns ProgramDiagnosticDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProgramDiagnosticDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProgramDiagnosticDataType)object).getCreateClientName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProgramDiagnosticDataType_type") :
			getString("_UI_ProgramDiagnosticDataType_type") + " " + label;
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

		switch (notification.getFeatureID(ProgramDiagnosticDataType.class)) {
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE__CREATE_CLIENT_NAME:
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE__INVOCATION_CREATION_TIME:
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE__LAST_TRANSITION_TIME:
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE__LAST_METHOD_CALL:
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE__LAST_METHOD_CALL_TIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE__CREATE_SESSION_ID:
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE__LAST_METHOD_SESSION_ID:
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE__LAST_METHOD_INPUT_ARGUMENTS:
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE__LAST_METHOD_OUTPUT_ARGUMENTS:
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE__LAST_METHOD_RETURN_STATUS:
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
				(TypesPackage.eINSTANCE.getProgramDiagnosticDataType_CreateSessionId(),
				 TypesFactory.eINSTANCE.createNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodSessionId(),
				 TypesFactory.eINSTANCE.createNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodInputArguments(),
				 TypesFactory.eINSTANCE.createListOfArgument()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodOutputArguments(),
				 TypesFactory.eINSTANCE.createListOfArgument()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodReturnStatus(),
				 TypesFactory.eINSTANCE.createStatusResult()));
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
			childFeature == TypesPackage.eINSTANCE.getProgramDiagnosticDataType_CreateSessionId() ||
			childFeature == TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodSessionId() ||
			childFeature == TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodInputArguments() ||
			childFeature == TypesPackage.eINSTANCE.getProgramDiagnosticDataType_LastMethodOutputArguments();

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
