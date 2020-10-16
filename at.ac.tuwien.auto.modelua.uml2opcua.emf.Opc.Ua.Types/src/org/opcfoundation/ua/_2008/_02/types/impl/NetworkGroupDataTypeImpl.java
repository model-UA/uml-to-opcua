/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfEndpointUrlListDataType;
import org.opcfoundation.ua._2008._02.types.NetworkGroupDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NetworkGroupDataTypeImpl#getServerUri <em>Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NetworkGroupDataTypeImpl#getNetworkPaths <em>Network Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkGroupDataTypeImpl extends MinimalEObjectImpl.Container implements NetworkGroupDataType {
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
	 * The cached value of the '{@link #getNetworkPaths() <em>Network Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPaths()
	 * @generated
	 * @ordered
	 */
	protected ListOfEndpointUrlListDataType networkPaths;

	/**
	 * This is true if the Network Paths containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean networkPathsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkGroupDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getNetworkGroupDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NETWORK_GROUP_DATA_TYPE__SERVER_URI, oldServerUri, serverUri, !oldServerUriESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NETWORK_GROUP_DATA_TYPE__SERVER_URI, oldServerUri, SERVER_URI_EDEFAULT, oldServerUriESet));
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
	public ListOfEndpointUrlListDataType getNetworkPaths() {
		return networkPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkPaths(ListOfEndpointUrlListDataType newNetworkPaths, NotificationChain msgs) {
		ListOfEndpointUrlListDataType oldNetworkPaths = networkPaths;
		networkPaths = newNetworkPaths;
		boolean oldNetworkPathsESet = networkPathsESet;
		networkPathsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS, oldNetworkPaths, newNetworkPaths, !oldNetworkPathsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkPaths(ListOfEndpointUrlListDataType newNetworkPaths) {
		if (newNetworkPaths != networkPaths) {
			NotificationChain msgs = null;
			if (networkPaths != null)
				msgs = ((InternalEObject)networkPaths).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS, null, msgs);
			if (newNetworkPaths != null)
				msgs = ((InternalEObject)newNetworkPaths).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS, null, msgs);
			msgs = basicSetNetworkPaths(newNetworkPaths, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNetworkPathsESet = networkPathsESet;
			networkPathsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS, newNetworkPaths, newNetworkPaths, !oldNetworkPathsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNetworkPaths(NotificationChain msgs) {
		ListOfEndpointUrlListDataType oldNetworkPaths = networkPaths;
		networkPaths = null;
		boolean oldNetworkPathsESet = networkPathsESet;
		networkPathsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS, oldNetworkPaths, null, oldNetworkPathsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNetworkPaths() {
		if (networkPaths != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)networkPaths).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS, null, msgs);
			msgs = basicUnsetNetworkPaths(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNetworkPathsESet = networkPathsESet;
			networkPathsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS, null, null, oldNetworkPathsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNetworkPaths() {
		return networkPathsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS:
				return basicUnsetNetworkPaths(msgs);
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
			case TypesPackage.NETWORK_GROUP_DATA_TYPE__SERVER_URI:
				return getServerUri();
			case TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS:
				return getNetworkPaths();
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
			case TypesPackage.NETWORK_GROUP_DATA_TYPE__SERVER_URI:
				setServerUri((String)newValue);
				return;
			case TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS:
				setNetworkPaths((ListOfEndpointUrlListDataType)newValue);
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
			case TypesPackage.NETWORK_GROUP_DATA_TYPE__SERVER_URI:
				unsetServerUri();
				return;
			case TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS:
				unsetNetworkPaths();
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
			case TypesPackage.NETWORK_GROUP_DATA_TYPE__SERVER_URI:
				return isSetServerUri();
			case TypesPackage.NETWORK_GROUP_DATA_TYPE__NETWORK_PATHS:
				return isSetNetworkPaths();
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
		result.append(')');
		return result.toString();
	}

} //NetworkGroupDataTypeImpl
