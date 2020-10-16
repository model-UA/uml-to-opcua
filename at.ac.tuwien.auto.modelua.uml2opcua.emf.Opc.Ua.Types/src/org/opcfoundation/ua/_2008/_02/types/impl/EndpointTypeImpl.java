/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.EndpointType;
import org.opcfoundation.ua._2008._02.types.MessageSecurityMode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointTypeImpl#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointTypeImpl#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointTypeImpl#getSecurityPolicyUri <em>Security Policy Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointTypeImpl#getTransportProfileUri <em>Transport Profile Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointTypeImpl extends MinimalEObjectImpl.Container implements EndpointType {
	/**
	 * The default value of the '{@link #getEndpointUrl() <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointUrl() <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected String endpointUrl = ENDPOINT_URL_EDEFAULT;

	/**
	 * This is true if the Endpoint Url attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endpointUrlESet;

	/**
	 * The default value of the '{@link #getSecurityMode() <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityMode()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSecurityMode SECURITY_MODE_EDEFAULT = MessageSecurityMode.INVALID0;

	/**
	 * The cached value of the '{@link #getSecurityMode() <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityMode()
	 * @generated
	 * @ordered
	 */
	protected MessageSecurityMode securityMode = SECURITY_MODE_EDEFAULT;

	/**
	 * This is true if the Security Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityModeESet;

	/**
	 * The default value of the '{@link #getSecurityPolicyUri() <em>Security Policy Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPolicyUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_POLICY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityPolicyUri() <em>Security Policy Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPolicyUri()
	 * @generated
	 * @ordered
	 */
	protected String securityPolicyUri = SECURITY_POLICY_URI_EDEFAULT;

	/**
	 * This is true if the Security Policy Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityPolicyUriESet;

	/**
	 * The default value of the '{@link #getTransportProfileUri() <em>Transport Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportProfileUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSPORT_PROFILE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransportProfileUri() <em>Transport Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportProfileUri()
	 * @generated
	 * @ordered
	 */
	protected String transportProfileUri = TRANSPORT_PROFILE_URI_EDEFAULT;

	/**
	 * This is true if the Transport Profile Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportProfileUriESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getEndpointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointUrl() {
		return endpointUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointUrl(String newEndpointUrl) {
		String oldEndpointUrl = endpointUrl;
		endpointUrl = newEndpointUrl;
		boolean oldEndpointUrlESet = endpointUrlESet;
		endpointUrlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_TYPE__ENDPOINT_URL, oldEndpointUrl, endpointUrl, !oldEndpointUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndpointUrl() {
		String oldEndpointUrl = endpointUrl;
		boolean oldEndpointUrlESet = endpointUrlESet;
		endpointUrl = ENDPOINT_URL_EDEFAULT;
		endpointUrlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_TYPE__ENDPOINT_URL, oldEndpointUrl, ENDPOINT_URL_EDEFAULT, oldEndpointUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndpointUrl() {
		return endpointUrlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSecurityMode getSecurityMode() {
		return securityMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityMode(MessageSecurityMode newSecurityMode) {
		MessageSecurityMode oldSecurityMode = securityMode;
		securityMode = newSecurityMode == null ? SECURITY_MODE_EDEFAULT : newSecurityMode;
		boolean oldSecurityModeESet = securityModeESet;
		securityModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_TYPE__SECURITY_MODE, oldSecurityMode, securityMode, !oldSecurityModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityMode() {
		MessageSecurityMode oldSecurityMode = securityMode;
		boolean oldSecurityModeESet = securityModeESet;
		securityMode = SECURITY_MODE_EDEFAULT;
		securityModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_TYPE__SECURITY_MODE, oldSecurityMode, SECURITY_MODE_EDEFAULT, oldSecurityModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityMode() {
		return securityModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityPolicyUri() {
		return securityPolicyUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityPolicyUri(String newSecurityPolicyUri) {
		String oldSecurityPolicyUri = securityPolicyUri;
		securityPolicyUri = newSecurityPolicyUri;
		boolean oldSecurityPolicyUriESet = securityPolicyUriESet;
		securityPolicyUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_TYPE__SECURITY_POLICY_URI, oldSecurityPolicyUri, securityPolicyUri, !oldSecurityPolicyUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityPolicyUri() {
		String oldSecurityPolicyUri = securityPolicyUri;
		boolean oldSecurityPolicyUriESet = securityPolicyUriESet;
		securityPolicyUri = SECURITY_POLICY_URI_EDEFAULT;
		securityPolicyUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_TYPE__SECURITY_POLICY_URI, oldSecurityPolicyUri, SECURITY_POLICY_URI_EDEFAULT, oldSecurityPolicyUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityPolicyUri() {
		return securityPolicyUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransportProfileUri() {
		return transportProfileUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportProfileUri(String newTransportProfileUri) {
		String oldTransportProfileUri = transportProfileUri;
		transportProfileUri = newTransportProfileUri;
		boolean oldTransportProfileUriESet = transportProfileUriESet;
		transportProfileUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_TYPE__TRANSPORT_PROFILE_URI, oldTransportProfileUri, transportProfileUri, !oldTransportProfileUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportProfileUri() {
		String oldTransportProfileUri = transportProfileUri;
		boolean oldTransportProfileUriESet = transportProfileUriESet;
		transportProfileUri = TRANSPORT_PROFILE_URI_EDEFAULT;
		transportProfileUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_TYPE__TRANSPORT_PROFILE_URI, oldTransportProfileUri, TRANSPORT_PROFILE_URI_EDEFAULT, oldTransportProfileUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportProfileUri() {
		return transportProfileUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.ENDPOINT_TYPE__ENDPOINT_URL:
				return getEndpointUrl();
			case TypesPackage.ENDPOINT_TYPE__SECURITY_MODE:
				return getSecurityMode();
			case TypesPackage.ENDPOINT_TYPE__SECURITY_POLICY_URI:
				return getSecurityPolicyUri();
			case TypesPackage.ENDPOINT_TYPE__TRANSPORT_PROFILE_URI:
				return getTransportProfileUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.ENDPOINT_TYPE__ENDPOINT_URL:
				setEndpointUrl((String)newValue);
				return;
			case TypesPackage.ENDPOINT_TYPE__SECURITY_MODE:
				setSecurityMode((MessageSecurityMode)newValue);
				return;
			case TypesPackage.ENDPOINT_TYPE__SECURITY_POLICY_URI:
				setSecurityPolicyUri((String)newValue);
				return;
			case TypesPackage.ENDPOINT_TYPE__TRANSPORT_PROFILE_URI:
				setTransportProfileUri((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.ENDPOINT_TYPE__ENDPOINT_URL:
				unsetEndpointUrl();
				return;
			case TypesPackage.ENDPOINT_TYPE__SECURITY_MODE:
				unsetSecurityMode();
				return;
			case TypesPackage.ENDPOINT_TYPE__SECURITY_POLICY_URI:
				unsetSecurityPolicyUri();
				return;
			case TypesPackage.ENDPOINT_TYPE__TRANSPORT_PROFILE_URI:
				unsetTransportProfileUri();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.ENDPOINT_TYPE__ENDPOINT_URL:
				return isSetEndpointUrl();
			case TypesPackage.ENDPOINT_TYPE__SECURITY_MODE:
				return isSetSecurityMode();
			case TypesPackage.ENDPOINT_TYPE__SECURITY_POLICY_URI:
				return isSetSecurityPolicyUri();
			case TypesPackage.ENDPOINT_TYPE__TRANSPORT_PROFILE_URI:
				return isSetTransportProfileUri();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (endpointUrl: ");
		if (endpointUrlESet) result.append(endpointUrl); else result.append("<unset>");
		result.append(", securityMode: ");
		if (securityModeESet) result.append(securityMode); else result.append("<unset>");
		result.append(", securityPolicyUri: ");
		if (securityPolicyUriESet) result.append(securityPolicyUri); else result.append("<unset>");
		result.append(", transportProfileUri: ");
		if (transportProfileUriESet) result.append(transportProfileUri); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EndpointTypeImpl
