/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ApplicationDescription;
import org.opcfoundation.ua._2008._02.types.ApplicationType;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ApplicationDescriptionImpl#getApplicationUri <em>Application Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ApplicationDescriptionImpl#getProductUri <em>Product Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ApplicationDescriptionImpl#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ApplicationDescriptionImpl#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ApplicationDescriptionImpl#getGatewayServerUri <em>Gateway Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ApplicationDescriptionImpl#getDiscoveryProfileUri <em>Discovery Profile Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ApplicationDescriptionImpl#getDiscoveryUrls <em>Discovery Urls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationDescriptionImpl extends MinimalEObjectImpl.Container implements ApplicationDescription {
	/**
	 * The default value of the '{@link #getApplicationUri() <em>Application Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationUri()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationUri() <em>Application Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationUri()
	 * @generated
	 * @ordered
	 */
	protected String applicationUri = APPLICATION_URI_EDEFAULT;

	/**
	 * This is true if the Application Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicationUriESet;

	/**
	 * The default value of the '{@link #getProductUri() <em>Product Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductUri()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductUri() <em>Product Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductUri()
	 * @generated
	 * @ordered
	 */
	protected String productUri = PRODUCT_URI_EDEFAULT;

	/**
	 * This is true if the Product Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean productUriESet;

	/**
	 * The cached value of the '{@link #getApplicationName() <em>Application Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected LocalizedText applicationName;

	/**
	 * This is true if the Application Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicationNameESet;

	/**
	 * The default value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationType APPLICATION_TYPE_EDEFAULT = ApplicationType.SERVER0;

	/**
	 * The cached value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected ApplicationType applicationType = APPLICATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Application Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicationTypeESet;

	/**
	 * The default value of the '{@link #getGatewayServerUri() <em>Gateway Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayServerUri()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_SERVER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayServerUri() <em>Gateway Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayServerUri()
	 * @generated
	 * @ordered
	 */
	protected String gatewayServerUri = GATEWAY_SERVER_URI_EDEFAULT;

	/**
	 * This is true if the Gateway Server Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gatewayServerUriESet;

	/**
	 * The default value of the '{@link #getDiscoveryProfileUri() <em>Discovery Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryProfileUri()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVERY_PROFILE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscoveryProfileUri() <em>Discovery Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryProfileUri()
	 * @generated
	 * @ordered
	 */
	protected String discoveryProfileUri = DISCOVERY_PROFILE_URI_EDEFAULT;

	/**
	 * This is true if the Discovery Profile Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discoveryProfileUriESet;

	/**
	 * The cached value of the '{@link #getDiscoveryUrls() <em>Discovery Urls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryUrls()
	 * @generated
	 * @ordered
	 */
	protected ListOfString discoveryUrls;

	/**
	 * This is true if the Discovery Urls containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discoveryUrlsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getApplicationDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationUri() {
		return applicationUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationUri(String newApplicationUri) {
		String oldApplicationUri = applicationUri;
		applicationUri = newApplicationUri;
		boolean oldApplicationUriESet = applicationUriESet;
		applicationUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_URI, oldApplicationUri, applicationUri, !oldApplicationUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicationUri() {
		String oldApplicationUri = applicationUri;
		boolean oldApplicationUriESet = applicationUriESet;
		applicationUri = APPLICATION_URI_EDEFAULT;
		applicationUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_URI, oldApplicationUri, APPLICATION_URI_EDEFAULT, oldApplicationUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicationUri() {
		return applicationUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductUri() {
		return productUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductUri(String newProductUri) {
		String oldProductUri = productUri;
		productUri = newProductUri;
		boolean oldProductUriESet = productUriESet;
		productUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.APPLICATION_DESCRIPTION__PRODUCT_URI, oldProductUri, productUri, !oldProductUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProductUri() {
		String oldProductUri = productUri;
		boolean oldProductUriESet = productUriESet;
		productUri = PRODUCT_URI_EDEFAULT;
		productUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.APPLICATION_DESCRIPTION__PRODUCT_URI, oldProductUri, PRODUCT_URI_EDEFAULT, oldProductUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProductUri() {
		return productUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedText getApplicationName() {
		return applicationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationName(LocalizedText newApplicationName, NotificationChain msgs) {
		LocalizedText oldApplicationName = applicationName;
		applicationName = newApplicationName;
		boolean oldApplicationNameESet = applicationNameESet;
		applicationNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME, oldApplicationName, newApplicationName, !oldApplicationNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationName(LocalizedText newApplicationName) {
		if (newApplicationName != applicationName) {
			NotificationChain msgs = null;
			if (applicationName != null)
				msgs = ((InternalEObject)applicationName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME, null, msgs);
			if (newApplicationName != null)
				msgs = ((InternalEObject)newApplicationName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME, null, msgs);
			msgs = basicSetApplicationName(newApplicationName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldApplicationNameESet = applicationNameESet;
			applicationNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME, newApplicationName, newApplicationName, !oldApplicationNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetApplicationName(NotificationChain msgs) {
		LocalizedText oldApplicationName = applicationName;
		applicationName = null;
		boolean oldApplicationNameESet = applicationNameESet;
		applicationNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME, oldApplicationName, null, oldApplicationNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicationName() {
		if (applicationName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)applicationName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME, null, msgs);
			msgs = basicUnsetApplicationName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldApplicationNameESet = applicationNameESet;
			applicationNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME, null, null, oldApplicationNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicationName() {
		return applicationNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType getApplicationType() {
		return applicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationType(ApplicationType newApplicationType) {
		ApplicationType oldApplicationType = applicationType;
		applicationType = newApplicationType == null ? APPLICATION_TYPE_EDEFAULT : newApplicationType;
		boolean oldApplicationTypeESet = applicationTypeESet;
		applicationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_TYPE, oldApplicationType, applicationType, !oldApplicationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicationType() {
		ApplicationType oldApplicationType = applicationType;
		boolean oldApplicationTypeESet = applicationTypeESet;
		applicationType = APPLICATION_TYPE_EDEFAULT;
		applicationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_TYPE, oldApplicationType, APPLICATION_TYPE_EDEFAULT, oldApplicationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicationType() {
		return applicationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGatewayServerUri() {
		return gatewayServerUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGatewayServerUri(String newGatewayServerUri) {
		String oldGatewayServerUri = gatewayServerUri;
		gatewayServerUri = newGatewayServerUri;
		boolean oldGatewayServerUriESet = gatewayServerUriESet;
		gatewayServerUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.APPLICATION_DESCRIPTION__GATEWAY_SERVER_URI, oldGatewayServerUri, gatewayServerUri, !oldGatewayServerUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGatewayServerUri() {
		String oldGatewayServerUri = gatewayServerUri;
		boolean oldGatewayServerUriESet = gatewayServerUriESet;
		gatewayServerUri = GATEWAY_SERVER_URI_EDEFAULT;
		gatewayServerUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.APPLICATION_DESCRIPTION__GATEWAY_SERVER_URI, oldGatewayServerUri, GATEWAY_SERVER_URI_EDEFAULT, oldGatewayServerUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGatewayServerUri() {
		return gatewayServerUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscoveryProfileUri() {
		return discoveryProfileUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryProfileUri(String newDiscoveryProfileUri) {
		String oldDiscoveryProfileUri = discoveryProfileUri;
		discoveryProfileUri = newDiscoveryProfileUri;
		boolean oldDiscoveryProfileUriESet = discoveryProfileUriESet;
		discoveryProfileUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_PROFILE_URI, oldDiscoveryProfileUri, discoveryProfileUri, !oldDiscoveryProfileUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiscoveryProfileUri() {
		String oldDiscoveryProfileUri = discoveryProfileUri;
		boolean oldDiscoveryProfileUriESet = discoveryProfileUriESet;
		discoveryProfileUri = DISCOVERY_PROFILE_URI_EDEFAULT;
		discoveryProfileUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_PROFILE_URI, oldDiscoveryProfileUri, DISCOVERY_PROFILE_URI_EDEFAULT, oldDiscoveryProfileUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiscoveryProfileUri() {
		return discoveryProfileUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getDiscoveryUrls() {
		return discoveryUrls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscoveryUrls(ListOfString newDiscoveryUrls, NotificationChain msgs) {
		ListOfString oldDiscoveryUrls = discoveryUrls;
		discoveryUrls = newDiscoveryUrls;
		boolean oldDiscoveryUrlsESet = discoveryUrlsESet;
		discoveryUrlsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS, oldDiscoveryUrls, newDiscoveryUrls, !oldDiscoveryUrlsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryUrls(ListOfString newDiscoveryUrls) {
		if (newDiscoveryUrls != discoveryUrls) {
			NotificationChain msgs = null;
			if (discoveryUrls != null)
				msgs = ((InternalEObject)discoveryUrls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS, null, msgs);
			if (newDiscoveryUrls != null)
				msgs = ((InternalEObject)newDiscoveryUrls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS, null, msgs);
			msgs = basicSetDiscoveryUrls(newDiscoveryUrls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiscoveryUrlsESet = discoveryUrlsESet;
			discoveryUrlsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS, newDiscoveryUrls, newDiscoveryUrls, !oldDiscoveryUrlsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDiscoveryUrls(NotificationChain msgs) {
		ListOfString oldDiscoveryUrls = discoveryUrls;
		discoveryUrls = null;
		boolean oldDiscoveryUrlsESet = discoveryUrlsESet;
		discoveryUrlsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS, oldDiscoveryUrls, null, oldDiscoveryUrlsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiscoveryUrls() {
		if (discoveryUrls != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)discoveryUrls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS, null, msgs);
			msgs = basicUnsetDiscoveryUrls(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiscoveryUrlsESet = discoveryUrlsESet;
			discoveryUrlsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS, null, null, oldDiscoveryUrlsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiscoveryUrls() {
		return discoveryUrlsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME:
				return basicUnsetApplicationName(msgs);
			case TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS:
				return basicUnsetDiscoveryUrls(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_URI:
				return getApplicationUri();
			case TypesPackage.APPLICATION_DESCRIPTION__PRODUCT_URI:
				return getProductUri();
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME:
				return getApplicationName();
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_TYPE:
				return getApplicationType();
			case TypesPackage.APPLICATION_DESCRIPTION__GATEWAY_SERVER_URI:
				return getGatewayServerUri();
			case TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_PROFILE_URI:
				return getDiscoveryProfileUri();
			case TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS:
				return getDiscoveryUrls();
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
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_URI:
				setApplicationUri((String)newValue);
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__PRODUCT_URI:
				setProductUri((String)newValue);
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME:
				setApplicationName((LocalizedText)newValue);
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_TYPE:
				setApplicationType((ApplicationType)newValue);
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__GATEWAY_SERVER_URI:
				setGatewayServerUri((String)newValue);
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_PROFILE_URI:
				setDiscoveryProfileUri((String)newValue);
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS:
				setDiscoveryUrls((ListOfString)newValue);
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
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_URI:
				unsetApplicationUri();
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__PRODUCT_URI:
				unsetProductUri();
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME:
				unsetApplicationName();
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_TYPE:
				unsetApplicationType();
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__GATEWAY_SERVER_URI:
				unsetGatewayServerUri();
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_PROFILE_URI:
				unsetDiscoveryProfileUri();
				return;
			case TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS:
				unsetDiscoveryUrls();
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
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_URI:
				return isSetApplicationUri();
			case TypesPackage.APPLICATION_DESCRIPTION__PRODUCT_URI:
				return isSetProductUri();
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_NAME:
				return isSetApplicationName();
			case TypesPackage.APPLICATION_DESCRIPTION__APPLICATION_TYPE:
				return isSetApplicationType();
			case TypesPackage.APPLICATION_DESCRIPTION__GATEWAY_SERVER_URI:
				return isSetGatewayServerUri();
			case TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_PROFILE_URI:
				return isSetDiscoveryProfileUri();
			case TypesPackage.APPLICATION_DESCRIPTION__DISCOVERY_URLS:
				return isSetDiscoveryUrls();
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
		result.append(" (applicationUri: ");
		if (applicationUriESet) result.append(applicationUri); else result.append("<unset>");
		result.append(", productUri: ");
		if (productUriESet) result.append(productUri); else result.append("<unset>");
		result.append(", applicationType: ");
		if (applicationTypeESet) result.append(applicationType); else result.append("<unset>");
		result.append(", gatewayServerUri: ");
		if (gatewayServerUriESet) result.append(gatewayServerUri); else result.append("<unset>");
		result.append(", discoveryProfileUri: ");
		if (discoveryProfileUriESet) result.append(discoveryProfileUri); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ApplicationDescriptionImpl
