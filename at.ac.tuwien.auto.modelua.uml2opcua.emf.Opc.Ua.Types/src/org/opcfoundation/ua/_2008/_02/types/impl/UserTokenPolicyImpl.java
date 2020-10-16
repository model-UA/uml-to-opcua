/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UserTokenPolicy;
import org.opcfoundation.ua._2008._02.types.UserTokenType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Token Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UserTokenPolicyImpl#getPolicyId <em>Policy Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UserTokenPolicyImpl#getTokenType <em>Token Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UserTokenPolicyImpl#getIssuedTokenType <em>Issued Token Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UserTokenPolicyImpl#getIssuerEndpointUrl <em>Issuer Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UserTokenPolicyImpl#getSecurityPolicyUri <em>Security Policy Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserTokenPolicyImpl extends MinimalEObjectImpl.Container implements UserTokenPolicy {
	/**
	 * The default value of the '{@link #getPolicyId() <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyId()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyId() <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyId()
	 * @generated
	 * @ordered
	 */
	protected String policyId = POLICY_ID_EDEFAULT;

	/**
	 * This is true if the Policy Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean policyIdESet;

	/**
	 * The default value of the '{@link #getTokenType() <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenType()
	 * @generated
	 * @ordered
	 */
	protected static final UserTokenType TOKEN_TYPE_EDEFAULT = UserTokenType.ANONYMOUS0;

	/**
	 * The cached value of the '{@link #getTokenType() <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenType()
	 * @generated
	 * @ordered
	 */
	protected UserTokenType tokenType = TOKEN_TYPE_EDEFAULT;

	/**
	 * This is true if the Token Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tokenTypeESet;

	/**
	 * The default value of the '{@link #getIssuedTokenType() <em>Issued Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedTokenType()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUED_TOKEN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuedTokenType() <em>Issued Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedTokenType()
	 * @generated
	 * @ordered
	 */
	protected String issuedTokenType = ISSUED_TOKEN_TYPE_EDEFAULT;

	/**
	 * This is true if the Issued Token Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean issuedTokenTypeESet;

	/**
	 * The default value of the '{@link #getIssuerEndpointUrl() <em>Issuer Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_ENDPOINT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuerEndpointUrl() <em>Issuer Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected String issuerEndpointUrl = ISSUER_ENDPOINT_URL_EDEFAULT;

	/**
	 * This is true if the Issuer Endpoint Url attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean issuerEndpointUrlESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserTokenPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getUserTokenPolicy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyId() {
		return policyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyId(String newPolicyId) {
		String oldPolicyId = policyId;
		policyId = newPolicyId;
		boolean oldPolicyIdESet = policyIdESet;
		policyIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.USER_TOKEN_POLICY__POLICY_ID, oldPolicyId, policyId, !oldPolicyIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolicyId() {
		String oldPolicyId = policyId;
		boolean oldPolicyIdESet = policyIdESet;
		policyId = POLICY_ID_EDEFAULT;
		policyIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.USER_TOKEN_POLICY__POLICY_ID, oldPolicyId, POLICY_ID_EDEFAULT, oldPolicyIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolicyId() {
		return policyIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTokenType getTokenType() {
		return tokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenType(UserTokenType newTokenType) {
		UserTokenType oldTokenType = tokenType;
		tokenType = newTokenType == null ? TOKEN_TYPE_EDEFAULT : newTokenType;
		boolean oldTokenTypeESet = tokenTypeESet;
		tokenTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.USER_TOKEN_POLICY__TOKEN_TYPE, oldTokenType, tokenType, !oldTokenTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTokenType() {
		UserTokenType oldTokenType = tokenType;
		boolean oldTokenTypeESet = tokenTypeESet;
		tokenType = TOKEN_TYPE_EDEFAULT;
		tokenTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.USER_TOKEN_POLICY__TOKEN_TYPE, oldTokenType, TOKEN_TYPE_EDEFAULT, oldTokenTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTokenType() {
		return tokenTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssuedTokenType() {
		return issuedTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuedTokenType(String newIssuedTokenType) {
		String oldIssuedTokenType = issuedTokenType;
		issuedTokenType = newIssuedTokenType;
		boolean oldIssuedTokenTypeESet = issuedTokenTypeESet;
		issuedTokenTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.USER_TOKEN_POLICY__ISSUED_TOKEN_TYPE, oldIssuedTokenType, issuedTokenType, !oldIssuedTokenTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIssuedTokenType() {
		String oldIssuedTokenType = issuedTokenType;
		boolean oldIssuedTokenTypeESet = issuedTokenTypeESet;
		issuedTokenType = ISSUED_TOKEN_TYPE_EDEFAULT;
		issuedTokenTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.USER_TOKEN_POLICY__ISSUED_TOKEN_TYPE, oldIssuedTokenType, ISSUED_TOKEN_TYPE_EDEFAULT, oldIssuedTokenTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIssuedTokenType() {
		return issuedTokenTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssuerEndpointUrl() {
		return issuerEndpointUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuerEndpointUrl(String newIssuerEndpointUrl) {
		String oldIssuerEndpointUrl = issuerEndpointUrl;
		issuerEndpointUrl = newIssuerEndpointUrl;
		boolean oldIssuerEndpointUrlESet = issuerEndpointUrlESet;
		issuerEndpointUrlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.USER_TOKEN_POLICY__ISSUER_ENDPOINT_URL, oldIssuerEndpointUrl, issuerEndpointUrl, !oldIssuerEndpointUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIssuerEndpointUrl() {
		String oldIssuerEndpointUrl = issuerEndpointUrl;
		boolean oldIssuerEndpointUrlESet = issuerEndpointUrlESet;
		issuerEndpointUrl = ISSUER_ENDPOINT_URL_EDEFAULT;
		issuerEndpointUrlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.USER_TOKEN_POLICY__ISSUER_ENDPOINT_URL, oldIssuerEndpointUrl, ISSUER_ENDPOINT_URL_EDEFAULT, oldIssuerEndpointUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIssuerEndpointUrl() {
		return issuerEndpointUrlESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.USER_TOKEN_POLICY__SECURITY_POLICY_URI, oldSecurityPolicyUri, securityPolicyUri, !oldSecurityPolicyUriESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.USER_TOKEN_POLICY__SECURITY_POLICY_URI, oldSecurityPolicyUri, SECURITY_POLICY_URI_EDEFAULT, oldSecurityPolicyUriESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.USER_TOKEN_POLICY__POLICY_ID:
				return getPolicyId();
			case TypesPackage.USER_TOKEN_POLICY__TOKEN_TYPE:
				return getTokenType();
			case TypesPackage.USER_TOKEN_POLICY__ISSUED_TOKEN_TYPE:
				return getIssuedTokenType();
			case TypesPackage.USER_TOKEN_POLICY__ISSUER_ENDPOINT_URL:
				return getIssuerEndpointUrl();
			case TypesPackage.USER_TOKEN_POLICY__SECURITY_POLICY_URI:
				return getSecurityPolicyUri();
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
			case TypesPackage.USER_TOKEN_POLICY__POLICY_ID:
				setPolicyId((String)newValue);
				return;
			case TypesPackage.USER_TOKEN_POLICY__TOKEN_TYPE:
				setTokenType((UserTokenType)newValue);
				return;
			case TypesPackage.USER_TOKEN_POLICY__ISSUED_TOKEN_TYPE:
				setIssuedTokenType((String)newValue);
				return;
			case TypesPackage.USER_TOKEN_POLICY__ISSUER_ENDPOINT_URL:
				setIssuerEndpointUrl((String)newValue);
				return;
			case TypesPackage.USER_TOKEN_POLICY__SECURITY_POLICY_URI:
				setSecurityPolicyUri((String)newValue);
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
			case TypesPackage.USER_TOKEN_POLICY__POLICY_ID:
				unsetPolicyId();
				return;
			case TypesPackage.USER_TOKEN_POLICY__TOKEN_TYPE:
				unsetTokenType();
				return;
			case TypesPackage.USER_TOKEN_POLICY__ISSUED_TOKEN_TYPE:
				unsetIssuedTokenType();
				return;
			case TypesPackage.USER_TOKEN_POLICY__ISSUER_ENDPOINT_URL:
				unsetIssuerEndpointUrl();
				return;
			case TypesPackage.USER_TOKEN_POLICY__SECURITY_POLICY_URI:
				unsetSecurityPolicyUri();
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
			case TypesPackage.USER_TOKEN_POLICY__POLICY_ID:
				return isSetPolicyId();
			case TypesPackage.USER_TOKEN_POLICY__TOKEN_TYPE:
				return isSetTokenType();
			case TypesPackage.USER_TOKEN_POLICY__ISSUED_TOKEN_TYPE:
				return isSetIssuedTokenType();
			case TypesPackage.USER_TOKEN_POLICY__ISSUER_ENDPOINT_URL:
				return isSetIssuerEndpointUrl();
			case TypesPackage.USER_TOKEN_POLICY__SECURITY_POLICY_URI:
				return isSetSecurityPolicyUri();
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
		result.append(" (policyId: ");
		if (policyIdESet) result.append(policyId); else result.append("<unset>");
		result.append(", tokenType: ");
		if (tokenTypeESet) result.append(tokenType); else result.append("<unset>");
		result.append(", issuedTokenType: ");
		if (issuedTokenTypeESet) result.append(issuedTokenType); else result.append("<unset>");
		result.append(", issuerEndpointUrl: ");
		if (issuerEndpointUrlESet) result.append(issuerEndpointUrl); else result.append("<unset>");
		result.append(", securityPolicyUri: ");
		if (securityPolicyUriESet) result.append(securityPolicyUri); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserTokenPolicyImpl
