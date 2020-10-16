/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.RedundantServerDataType;
import org.opcfoundation.ua._2008._02.types.ServerState;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redundant Server Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RedundantServerDataTypeImpl#getServerId <em>Server Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RedundantServerDataTypeImpl#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RedundantServerDataTypeImpl#getServerState <em>Server State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedundantServerDataTypeImpl extends MinimalEObjectImpl.Container implements RedundantServerDataType {
	/**
	 * The default value of the '{@link #getServerId() <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerId() <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerId()
	 * @generated
	 * @ordered
	 */
	protected String serverId = SERVER_ID_EDEFAULT;

	/**
	 * This is true if the Server Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverIdESet;

	/**
	 * The default value of the '{@link #getServiceLevel() <em>Service Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final short SERVICE_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServiceLevel() <em>Service Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevel()
	 * @generated
	 * @ordered
	 */
	protected short serviceLevel = SERVICE_LEVEL_EDEFAULT;

	/**
	 * This is true if the Service Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceLevelESet;

	/**
	 * The default value of the '{@link #getServerState() <em>Server State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerState()
	 * @generated
	 * @ordered
	 */
	protected static final ServerState SERVER_STATE_EDEFAULT = ServerState.RUNNING0;

	/**
	 * The cached value of the '{@link #getServerState() <em>Server State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerState()
	 * @generated
	 * @ordered
	 */
	protected ServerState serverState = SERVER_STATE_EDEFAULT;

	/**
	 * This is true if the Server State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverStateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedundantServerDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRedundantServerDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerId() {
		return serverId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerId(String newServerId) {
		String oldServerId = serverId;
		serverId = newServerId;
		boolean oldServerIdESet = serverIdESet;
		serverIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_ID, oldServerId, serverId, !oldServerIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerId() {
		String oldServerId = serverId;
		boolean oldServerIdESet = serverIdESet;
		serverId = SERVER_ID_EDEFAULT;
		serverIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_ID, oldServerId, SERVER_ID_EDEFAULT, oldServerIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerId() {
		return serverIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getServiceLevel() {
		return serviceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLevel(short newServiceLevel) {
		short oldServiceLevel = serviceLevel;
		serviceLevel = newServiceLevel;
		boolean oldServiceLevelESet = serviceLevelESet;
		serviceLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVICE_LEVEL, oldServiceLevel, serviceLevel, !oldServiceLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServiceLevel() {
		short oldServiceLevel = serviceLevel;
		boolean oldServiceLevelESet = serviceLevelESet;
		serviceLevel = SERVICE_LEVEL_EDEFAULT;
		serviceLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVICE_LEVEL, oldServiceLevel, SERVICE_LEVEL_EDEFAULT, oldServiceLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServiceLevel() {
		return serviceLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerState getServerState() {
		return serverState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerState(ServerState newServerState) {
		ServerState oldServerState = serverState;
		serverState = newServerState == null ? SERVER_STATE_EDEFAULT : newServerState;
		boolean oldServerStateESet = serverStateESet;
		serverStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_STATE, oldServerState, serverState, !oldServerStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerState() {
		ServerState oldServerState = serverState;
		boolean oldServerStateESet = serverStateESet;
		serverState = SERVER_STATE_EDEFAULT;
		serverStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_STATE, oldServerState, SERVER_STATE_EDEFAULT, oldServerStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerState() {
		return serverStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_ID:
				return getServerId();
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVICE_LEVEL:
				return getServiceLevel();
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_STATE:
				return getServerState();
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
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_ID:
				setServerId((String)newValue);
				return;
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVICE_LEVEL:
				setServiceLevel((Short)newValue);
				return;
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_STATE:
				setServerState((ServerState)newValue);
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
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_ID:
				unsetServerId();
				return;
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVICE_LEVEL:
				unsetServiceLevel();
				return;
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_STATE:
				unsetServerState();
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
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_ID:
				return isSetServerId();
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVICE_LEVEL:
				return isSetServiceLevel();
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE__SERVER_STATE:
				return isSetServerState();
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
		result.append(" (serverId: ");
		if (serverIdESet) result.append(serverId); else result.append("<unset>");
		result.append(", serviceLevel: ");
		if (serviceLevelESet) result.append(serviceLevel); else result.append("<unset>");
		result.append(", serverState: ");
		if (serverStateESet) result.append(serverState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RedundantServerDataTypeImpl
