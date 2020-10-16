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

import org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesFactory;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SessionSecurityDiagnosticsDataTypeItemProvider 
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
	public SessionSecurityDiagnosticsDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addClientUserIdOfSessionPropertyDescriptor(object);
			addAuthenticationMechanismPropertyDescriptor(object);
			addEncodingPropertyDescriptor(object);
			addTransportProtocolPropertyDescriptor(object);
			addSecurityModePropertyDescriptor(object);
			addSecurityPolicyUriPropertyDescriptor(object);
			addClientCertificatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Client User Id Of Session feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientUserIdOfSessionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionSecurityDiagnosticsDataType_clientUserIdOfSession_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionSecurityDiagnosticsDataType_clientUserIdOfSession_feature", "_UI_SessionSecurityDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_ClientUserIdOfSession(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authentication Mechanism feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationMechanismPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionSecurityDiagnosticsDataType_authenticationMechanism_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionSecurityDiagnosticsDataType_authenticationMechanism_feature", "_UI_SessionSecurityDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_AuthenticationMechanism(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encoding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionSecurityDiagnosticsDataType_encoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionSecurityDiagnosticsDataType_encoding_feature", "_UI_SessionSecurityDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_Encoding(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transport Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransportProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionSecurityDiagnosticsDataType_transportProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionSecurityDiagnosticsDataType_transportProtocol_feature", "_UI_SessionSecurityDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_TransportProtocol(),
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
				 getString("_UI_SessionSecurityDiagnosticsDataType_securityMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionSecurityDiagnosticsDataType_securityMode_feature", "_UI_SessionSecurityDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_SecurityMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Policy Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityPolicyUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionSecurityDiagnosticsDataType_securityPolicyUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionSecurityDiagnosticsDataType_securityPolicyUri_feature", "_UI_SessionSecurityDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_SecurityPolicyUri(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Certificate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientCertificatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionSecurityDiagnosticsDataType_clientCertificate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionSecurityDiagnosticsDataType_clientCertificate_feature", "_UI_SessionSecurityDiagnosticsDataType_type"),
				 TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_ClientCertificate(),
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
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_SessionId());
			childrenFeatures.add(TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_ClientUserIdHistory());
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
	 * This returns SessionSecurityDiagnosticsDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SessionSecurityDiagnosticsDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SessionSecurityDiagnosticsDataType)object).getClientUserIdOfSession();
		return label == null || label.length() == 0 ?
			getString("_UI_SessionSecurityDiagnosticsDataType_type") :
			getString("_UI_SessionSecurityDiagnosticsDataType_type") + " " + label;
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

		switch (notification.getFeatureID(SessionSecurityDiagnosticsDataType.class)) {
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_OF_SESSION:
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__AUTHENTICATION_MECHANISM:
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__ENCODING:
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__TRANSPORT_PROTOCOL:
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_MODE:
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_POLICY_URI:
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_CERTIFICATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY:
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
				(TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_SessionId(),
				 TypesFactory.eINSTANCE.createNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType_ClientUserIdHistory(),
				 TypesFactory.eINSTANCE.createListOfString()));
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
