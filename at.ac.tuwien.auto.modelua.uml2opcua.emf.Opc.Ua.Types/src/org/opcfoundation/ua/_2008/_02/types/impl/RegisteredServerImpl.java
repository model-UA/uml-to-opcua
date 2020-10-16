/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ApplicationType;
import org.opcfoundation.ua._2008._02.types.ListOfLocalizedText;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.RegisteredServer;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registered Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisteredServerImpl#getServerUri <em>Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisteredServerImpl#getProductUri <em>Product Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisteredServerImpl#getServerNames <em>Server Names</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisteredServerImpl#getServerType <em>Server Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisteredServerImpl#getGatewayServerUri <em>Gateway Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisteredServerImpl#getDiscoveryUrls <em>Discovery Urls</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisteredServerImpl#getSemaphoreFilePath <em>Semaphore File Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisteredServerImpl#isIsOnline <em>Is Online</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisteredServerImpl extends MinimalEObjectImpl.Container implements RegisteredServer {
	/**
	 * The default value of the '{@link #getServerUri() <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerUri() <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUri()
	 * @generated
	 * @ordered
	 */
	protected String serverUri = SERVER_URI_EDEFAULT;

	/**
	 * This is true if the Server Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverUriESet;

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
	 * The cached value of the '{@link #getServerNames() <em>Server Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerNames()
	 * @generated
	 * @ordered
	 */
	protected ListOfLocalizedText serverNames;

	/**
	 * This is true if the Server Names containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverNamesESet;

	/**
	 * The default value of the '{@link #getServerType() <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerType()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationType SERVER_TYPE_EDEFAULT = ApplicationType.SERVER0;

	/**
	 * The cached value of the '{@link #getServerType() <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerType()
	 * @generated
	 * @ordered
	 */
	protected ApplicationType serverType = SERVER_TYPE_EDEFAULT;

	/**
	 * This is true if the Server Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverTypeESet;

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
	 * The default value of the '{@link #getSemaphoreFilePath() <em>Semaphore File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphoreFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMAPHORE_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemaphoreFilePath() <em>Semaphore File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphoreFilePath()
	 * @generated
	 * @ordered
	 */
	protected String semaphoreFilePath = SEMAPHORE_FILE_PATH_EDEFAULT;

	/**
	 * This is true if the Semaphore File Path attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean semaphoreFilePathESet;

	/**
	 * The default value of the '{@link #isIsOnline() <em>Is Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOnline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ONLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOnline() <em>Is Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOnline()
	 * @generated
	 * @ordered
	 */
	protected boolean isOnline = IS_ONLINE_EDEFAULT;

	/**
	 * This is true if the Is Online attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isOnlineESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRegisteredServer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerUri() {
		return serverUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerUri(String newServerUri) {
		String oldServerUri = serverUri;
		serverUri = newServerUri;
		boolean oldServerUriESet = serverUriESet;
		serverUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTERED_SERVER__SERVER_URI, oldServerUri, serverUri, !oldServerUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerUri() {
		String oldServerUri = serverUri;
		boolean oldServerUriESet = serverUriESet;
		serverUri = SERVER_URI_EDEFAULT;
		serverUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTERED_SERVER__SERVER_URI, oldServerUri, SERVER_URI_EDEFAULT, oldServerUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerUri() {
		return serverUriESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTERED_SERVER__PRODUCT_URI, oldProductUri, productUri, !oldProductUriESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTERED_SERVER__PRODUCT_URI, oldProductUri, PRODUCT_URI_EDEFAULT, oldProductUriESet));
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
	public ListOfLocalizedText getServerNames() {
		return serverNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerNames(ListOfLocalizedText newServerNames, NotificationChain msgs) {
		ListOfLocalizedText oldServerNames = serverNames;
		serverNames = newServerNames;
		boolean oldServerNamesESet = serverNamesESet;
		serverNamesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTERED_SERVER__SERVER_NAMES, oldServerNames, newServerNames, !oldServerNamesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerNames(ListOfLocalizedText newServerNames) {
		if (newServerNames != serverNames) {
			NotificationChain msgs = null;
			if (serverNames != null)
				msgs = ((InternalEObject)serverNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTERED_SERVER__SERVER_NAMES, null, msgs);
			if (newServerNames != null)
				msgs = ((InternalEObject)newServerNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTERED_SERVER__SERVER_NAMES, null, msgs);
			msgs = basicSetServerNames(newServerNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerNamesESet = serverNamesESet;
			serverNamesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTERED_SERVER__SERVER_NAMES, newServerNames, newServerNames, !oldServerNamesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServerNames(NotificationChain msgs) {
		ListOfLocalizedText oldServerNames = serverNames;
		serverNames = null;
		boolean oldServerNamesESet = serverNamesESet;
		serverNamesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTERED_SERVER__SERVER_NAMES, oldServerNames, null, oldServerNamesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerNames() {
		if (serverNames != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)serverNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTERED_SERVER__SERVER_NAMES, null, msgs);
			msgs = basicUnsetServerNames(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerNamesESet = serverNamesESet;
			serverNamesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTERED_SERVER__SERVER_NAMES, null, null, oldServerNamesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerNames() {
		return serverNamesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType getServerType() {
		return serverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerType(ApplicationType newServerType) {
		ApplicationType oldServerType = serverType;
		serverType = newServerType == null ? SERVER_TYPE_EDEFAULT : newServerType;
		boolean oldServerTypeESet = serverTypeESet;
		serverTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTERED_SERVER__SERVER_TYPE, oldServerType, serverType, !oldServerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerType() {
		ApplicationType oldServerType = serverType;
		boolean oldServerTypeESet = serverTypeESet;
		serverType = SERVER_TYPE_EDEFAULT;
		serverTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTERED_SERVER__SERVER_TYPE, oldServerType, SERVER_TYPE_EDEFAULT, oldServerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerType() {
		return serverTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTERED_SERVER__GATEWAY_SERVER_URI, oldGatewayServerUri, gatewayServerUri, !oldGatewayServerUriESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTERED_SERVER__GATEWAY_SERVER_URI, oldGatewayServerUri, GATEWAY_SERVER_URI_EDEFAULT, oldGatewayServerUriESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS, oldDiscoveryUrls, newDiscoveryUrls, !oldDiscoveryUrlsESet);
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
				msgs = ((InternalEObject)discoveryUrls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS, null, msgs);
			if (newDiscoveryUrls != null)
				msgs = ((InternalEObject)newDiscoveryUrls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS, null, msgs);
			msgs = basicSetDiscoveryUrls(newDiscoveryUrls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiscoveryUrlsESet = discoveryUrlsESet;
			discoveryUrlsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS, newDiscoveryUrls, newDiscoveryUrls, !oldDiscoveryUrlsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS, oldDiscoveryUrls, null, oldDiscoveryUrlsESet);
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
			msgs = ((InternalEObject)discoveryUrls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS, null, msgs);
			msgs = basicUnsetDiscoveryUrls(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiscoveryUrlsESet = discoveryUrlsESet;
			discoveryUrlsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS, null, null, oldDiscoveryUrlsESet));
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
	public String getSemaphoreFilePath() {
		return semaphoreFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemaphoreFilePath(String newSemaphoreFilePath) {
		String oldSemaphoreFilePath = semaphoreFilePath;
		semaphoreFilePath = newSemaphoreFilePath;
		boolean oldSemaphoreFilePathESet = semaphoreFilePathESet;
		semaphoreFilePathESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTERED_SERVER__SEMAPHORE_FILE_PATH, oldSemaphoreFilePath, semaphoreFilePath, !oldSemaphoreFilePathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSemaphoreFilePath() {
		String oldSemaphoreFilePath = semaphoreFilePath;
		boolean oldSemaphoreFilePathESet = semaphoreFilePathESet;
		semaphoreFilePath = SEMAPHORE_FILE_PATH_EDEFAULT;
		semaphoreFilePathESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTERED_SERVER__SEMAPHORE_FILE_PATH, oldSemaphoreFilePath, SEMAPHORE_FILE_PATH_EDEFAULT, oldSemaphoreFilePathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSemaphoreFilePath() {
		return semaphoreFilePathESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOnline() {
		return isOnline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOnline(boolean newIsOnline) {
		boolean oldIsOnline = isOnline;
		isOnline = newIsOnline;
		boolean oldIsOnlineESet = isOnlineESet;
		isOnlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTERED_SERVER__IS_ONLINE, oldIsOnline, isOnline, !oldIsOnlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsOnline() {
		boolean oldIsOnline = isOnline;
		boolean oldIsOnlineESet = isOnlineESet;
		isOnline = IS_ONLINE_EDEFAULT;
		isOnlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTERED_SERVER__IS_ONLINE, oldIsOnline, IS_ONLINE_EDEFAULT, oldIsOnlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsOnline() {
		return isOnlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.REGISTERED_SERVER__SERVER_NAMES:
				return basicUnsetServerNames(msgs);
			case TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS:
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
			case TypesPackage.REGISTERED_SERVER__SERVER_URI:
				return getServerUri();
			case TypesPackage.REGISTERED_SERVER__PRODUCT_URI:
				return getProductUri();
			case TypesPackage.REGISTERED_SERVER__SERVER_NAMES:
				return getServerNames();
			case TypesPackage.REGISTERED_SERVER__SERVER_TYPE:
				return getServerType();
			case TypesPackage.REGISTERED_SERVER__GATEWAY_SERVER_URI:
				return getGatewayServerUri();
			case TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS:
				return getDiscoveryUrls();
			case TypesPackage.REGISTERED_SERVER__SEMAPHORE_FILE_PATH:
				return getSemaphoreFilePath();
			case TypesPackage.REGISTERED_SERVER__IS_ONLINE:
				return isIsOnline();
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
			case TypesPackage.REGISTERED_SERVER__SERVER_URI:
				setServerUri((String)newValue);
				return;
			case TypesPackage.REGISTERED_SERVER__PRODUCT_URI:
				setProductUri((String)newValue);
				return;
			case TypesPackage.REGISTERED_SERVER__SERVER_NAMES:
				setServerNames((ListOfLocalizedText)newValue);
				return;
			case TypesPackage.REGISTERED_SERVER__SERVER_TYPE:
				setServerType((ApplicationType)newValue);
				return;
			case TypesPackage.REGISTERED_SERVER__GATEWAY_SERVER_URI:
				setGatewayServerUri((String)newValue);
				return;
			case TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS:
				setDiscoveryUrls((ListOfString)newValue);
				return;
			case TypesPackage.REGISTERED_SERVER__SEMAPHORE_FILE_PATH:
				setSemaphoreFilePath((String)newValue);
				return;
			case TypesPackage.REGISTERED_SERVER__IS_ONLINE:
				setIsOnline((Boolean)newValue);
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
			case TypesPackage.REGISTERED_SERVER__SERVER_URI:
				unsetServerUri();
				return;
			case TypesPackage.REGISTERED_SERVER__PRODUCT_URI:
				unsetProductUri();
				return;
			case TypesPackage.REGISTERED_SERVER__SERVER_NAMES:
				unsetServerNames();
				return;
			case TypesPackage.REGISTERED_SERVER__SERVER_TYPE:
				unsetServerType();
				return;
			case TypesPackage.REGISTERED_SERVER__GATEWAY_SERVER_URI:
				unsetGatewayServerUri();
				return;
			case TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS:
				unsetDiscoveryUrls();
				return;
			case TypesPackage.REGISTERED_SERVER__SEMAPHORE_FILE_PATH:
				unsetSemaphoreFilePath();
				return;
			case TypesPackage.REGISTERED_SERVER__IS_ONLINE:
				unsetIsOnline();
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
			case TypesPackage.REGISTERED_SERVER__SERVER_URI:
				return isSetServerUri();
			case TypesPackage.REGISTERED_SERVER__PRODUCT_URI:
				return isSetProductUri();
			case TypesPackage.REGISTERED_SERVER__SERVER_NAMES:
				return isSetServerNames();
			case TypesPackage.REGISTERED_SERVER__SERVER_TYPE:
				return isSetServerType();
			case TypesPackage.REGISTERED_SERVER__GATEWAY_SERVER_URI:
				return isSetGatewayServerUri();
			case TypesPackage.REGISTERED_SERVER__DISCOVERY_URLS:
				return isSetDiscoveryUrls();
			case TypesPackage.REGISTERED_SERVER__SEMAPHORE_FILE_PATH:
				return isSetSemaphoreFilePath();
			case TypesPackage.REGISTERED_SERVER__IS_ONLINE:
				return isSetIsOnline();
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
		result.append(" (serverUri: ");
		if (serverUriESet) result.append(serverUri); else result.append("<unset>");
		result.append(", productUri: ");
		if (productUriESet) result.append(productUri); else result.append("<unset>");
		result.append(", serverType: ");
		if (serverTypeESet) result.append(serverType); else result.append("<unset>");
		result.append(", gatewayServerUri: ");
		if (gatewayServerUriESet) result.append(gatewayServerUri); else result.append("<unset>");
		result.append(", semaphoreFilePath: ");
		if (semaphoreFilePathESet) result.append(semaphoreFilePath); else result.append("<unset>");
		result.append(", isOnline: ");
		if (isOnlineESet) result.append(isOnline); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RegisteredServerImpl
