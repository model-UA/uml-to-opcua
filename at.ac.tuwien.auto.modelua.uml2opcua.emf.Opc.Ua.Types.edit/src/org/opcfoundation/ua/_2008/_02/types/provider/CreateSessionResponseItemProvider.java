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

import org.opcfoundation.ua._2008._02.types.CreateSessionResponse;
import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateSessionResponseItemProvider 
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
	public CreateSessionResponseItemProvider(AdapterFactory adapterFactory) {
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

			addRevisedSessionTimeoutPropertyDescriptor(object);
			addServerNoncePropertyDescriptor(object);
			addServerCertificatePropertyDescriptor(object);
			addMaxRequestMessageSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Revised Session Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevisedSessionTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CreateSessionResponse_revisedSessionTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateSessionResponse_revisedSessionTimeout_feature", "_UI_CreateSessionResponse_type"),
				 TypesPackage.eINSTANCE.getCreateSessionResponse_RevisedSessionTimeout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server Nonce feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerNoncePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CreateSessionResponse_serverNonce_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateSessionResponse_serverNonce_feature", "_UI_CreateSessionResponse_type"),
				 TypesPackage.eINSTANCE.getCreateSessionResponse_ServerNonce(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server Certificate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerCertificatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CreateSessionResponse_serverCertificate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateSessionResponse_serverCertificate_feature", "_UI_CreateSessionResponse_type"),
				 TypesPackage.eINSTANCE.getCreateSessionResponse_ServerCertificate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Request Message Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxRequestMessageSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CreateSessionResponse_maxRequestMessageSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateSessionResponse_maxRequestMessageSize_feature", "_UI_CreateSessionResponse_type"),
				 TypesPackage.eINSTANCE.getCreateSessionResponse_MaxRequestMessageSize(),
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
			childrenFeatures.add(TypesPackage.eINSTANCE.getCreateSessionResponse_ResponseHeader());
			childrenFeatures.add(TypesPackage.eINSTANCE.getCreateSessionResponse_SessionId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getCreateSessionResponse_AuthenticationToken());
			childrenFeatures.add(TypesPackage.eINSTANCE.getCreateSessionResponse_ServerEndpoints());
			childrenFeatures.add(TypesPackage.eINSTANCE.getCreateSessionResponse_ServerSoftwareCertificates());
			childrenFeatures.add(TypesPackage.eINSTANCE.getCreateSessionResponse_ServerSignature());
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
	 * This returns CreateSessionResponse.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CreateSessionResponse"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CreateSessionResponse createSessionResponse = (CreateSessionResponse)object;
		return getString("_UI_CreateSessionResponse_type") + " " + createSessionResponse.getRevisedSessionTimeout();
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

		switch (notification.getFeatureID(CreateSessionResponse.class)) {
			case TypesPackage.CREATE_SESSION_RESPONSE__REVISED_SESSION_TIMEOUT:
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_NONCE:
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_CERTIFICATE:
			case TypesPackage.CREATE_SESSION_RESPONSE__MAX_REQUEST_MESSAGE_SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER:
			case TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID:
			case TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN:
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS:
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES:
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE:
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
				(TypesPackage.eINSTANCE.getCreateSessionResponse_ResponseHeader(),
				 TypesFactory.eINSTANCE.createResponseHeader()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getCreateSessionResponse_SessionId(),
				 TypesFactory.eINSTANCE.createNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getCreateSessionResponse_AuthenticationToken(),
				 TypesFactory.eINSTANCE.createNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getCreateSessionResponse_ServerEndpoints(),
				 TypesFactory.eINSTANCE.createListOfEndpointDescription()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getCreateSessionResponse_ServerSoftwareCertificates(),
				 TypesFactory.eINSTANCE.createListOfSignedSoftwareCertificate()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getCreateSessionResponse_ServerSignature(),
				 TypesFactory.eINSTANCE.createSignatureData()));
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
			childFeature == TypesPackage.eINSTANCE.getCreateSessionResponse_SessionId() ||
			childFeature == TypesPackage.eINSTANCE.getCreateSessionResponse_AuthenticationToken();

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
