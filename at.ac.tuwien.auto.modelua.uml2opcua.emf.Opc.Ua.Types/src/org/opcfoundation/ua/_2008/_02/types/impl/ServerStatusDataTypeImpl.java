/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.BuildInfo;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.ServerState;
import org.opcfoundation.ua._2008._02.types.ServerStatusDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Status Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerStatusDataTypeImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerStatusDataTypeImpl#getCurrentTime <em>Current Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerStatusDataTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerStatusDataTypeImpl#getBuildInfo <em>Build Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerStatusDataTypeImpl#getSecondsTillShutdown <em>Seconds Till Shutdown</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerStatusDataTypeImpl#getShutdownReason <em>Shutdown Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerStatusDataTypeImpl extends MinimalEObjectImpl.Container implements ServerStatusDataType {
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CURRENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar currentTime = CURRENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ServerState STATE_EDEFAULT = ServerState.RUNNING0;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ServerState state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The cached value of the '{@link #getBuildInfo() <em>Build Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildInfo()
	 * @generated
	 * @ordered
	 */
	protected BuildInfo buildInfo;

	/**
	 * This is true if the Build Info containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean buildInfoESet;

	/**
	 * The default value of the '{@link #getSecondsTillShutdown() <em>Seconds Till Shutdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondsTillShutdown()
	 * @generated
	 * @ordered
	 */
	protected static final long SECONDS_TILL_SHUTDOWN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSecondsTillShutdown() <em>Seconds Till Shutdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondsTillShutdown()
	 * @generated
	 * @ordered
	 */
	protected long secondsTillShutdown = SECONDS_TILL_SHUTDOWN_EDEFAULT;

	/**
	 * This is true if the Seconds Till Shutdown attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondsTillShutdownESet;

	/**
	 * The cached value of the '{@link #getShutdownReason() <em>Shutdown Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownReason()
	 * @generated
	 * @ordered
	 */
	protected LocalizedText shutdownReason;

	/**
	 * This is true if the Shutdown Reason containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shutdownReasonESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerStatusDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getServerStatusDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(XMLGregorianCalendar newStartTime) {
		XMLGregorianCalendar oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_STATUS_DATA_TYPE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCurrentTime() {
		return currentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentTime(XMLGregorianCalendar newCurrentTime) {
		XMLGregorianCalendar oldCurrentTime = currentTime;
		currentTime = newCurrentTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_STATUS_DATA_TYPE__CURRENT_TIME, oldCurrentTime, currentTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ServerState newState) {
		ServerState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_STATUS_DATA_TYPE__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		ServerState oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_STATUS_DATA_TYPE__STATE, oldState, STATE_EDEFAULT, oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetState() {
		return stateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildInfo getBuildInfo() {
		return buildInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildInfo(BuildInfo newBuildInfo, NotificationChain msgs) {
		BuildInfo oldBuildInfo = buildInfo;
		buildInfo = newBuildInfo;
		boolean oldBuildInfoESet = buildInfoESet;
		buildInfoESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO, oldBuildInfo, newBuildInfo, !oldBuildInfoESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildInfo(BuildInfo newBuildInfo) {
		if (newBuildInfo != buildInfo) {
			NotificationChain msgs = null;
			if (buildInfo != null)
				msgs = ((InternalEObject)buildInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO, null, msgs);
			if (newBuildInfo != null)
				msgs = ((InternalEObject)newBuildInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO, null, msgs);
			msgs = basicSetBuildInfo(newBuildInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBuildInfoESet = buildInfoESet;
			buildInfoESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO, newBuildInfo, newBuildInfo, !oldBuildInfoESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBuildInfo(NotificationChain msgs) {
		BuildInfo oldBuildInfo = buildInfo;
		buildInfo = null;
		boolean oldBuildInfoESet = buildInfoESet;
		buildInfoESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO, oldBuildInfo, null, oldBuildInfoESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBuildInfo() {
		if (buildInfo != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)buildInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO, null, msgs);
			msgs = basicUnsetBuildInfo(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBuildInfoESet = buildInfoESet;
			buildInfoESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO, null, null, oldBuildInfoESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBuildInfo() {
		return buildInfoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSecondsTillShutdown() {
		return secondsTillShutdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondsTillShutdown(long newSecondsTillShutdown) {
		long oldSecondsTillShutdown = secondsTillShutdown;
		secondsTillShutdown = newSecondsTillShutdown;
		boolean oldSecondsTillShutdownESet = secondsTillShutdownESet;
		secondsTillShutdownESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_STATUS_DATA_TYPE__SECONDS_TILL_SHUTDOWN, oldSecondsTillShutdown, secondsTillShutdown, !oldSecondsTillShutdownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondsTillShutdown() {
		long oldSecondsTillShutdown = secondsTillShutdown;
		boolean oldSecondsTillShutdownESet = secondsTillShutdownESet;
		secondsTillShutdown = SECONDS_TILL_SHUTDOWN_EDEFAULT;
		secondsTillShutdownESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_STATUS_DATA_TYPE__SECONDS_TILL_SHUTDOWN, oldSecondsTillShutdown, SECONDS_TILL_SHUTDOWN_EDEFAULT, oldSecondsTillShutdownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondsTillShutdown() {
		return secondsTillShutdownESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedText getShutdownReason() {
		return shutdownReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShutdownReason(LocalizedText newShutdownReason, NotificationChain msgs) {
		LocalizedText oldShutdownReason = shutdownReason;
		shutdownReason = newShutdownReason;
		boolean oldShutdownReasonESet = shutdownReasonESet;
		shutdownReasonESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON, oldShutdownReason, newShutdownReason, !oldShutdownReasonESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShutdownReason(LocalizedText newShutdownReason) {
		if (newShutdownReason != shutdownReason) {
			NotificationChain msgs = null;
			if (shutdownReason != null)
				msgs = ((InternalEObject)shutdownReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON, null, msgs);
			if (newShutdownReason != null)
				msgs = ((InternalEObject)newShutdownReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON, null, msgs);
			msgs = basicSetShutdownReason(newShutdownReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldShutdownReasonESet = shutdownReasonESet;
			shutdownReasonESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON, newShutdownReason, newShutdownReason, !oldShutdownReasonESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetShutdownReason(NotificationChain msgs) {
		LocalizedText oldShutdownReason = shutdownReason;
		shutdownReason = null;
		boolean oldShutdownReasonESet = shutdownReasonESet;
		shutdownReasonESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON, oldShutdownReason, null, oldShutdownReasonESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShutdownReason() {
		if (shutdownReason != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)shutdownReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON, null, msgs);
			msgs = basicUnsetShutdownReason(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldShutdownReasonESet = shutdownReasonESet;
			shutdownReasonESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON, null, null, oldShutdownReasonESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShutdownReason() {
		return shutdownReasonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO:
				return basicUnsetBuildInfo(msgs);
			case TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON:
				return basicUnsetShutdownReason(msgs);
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
			case TypesPackage.SERVER_STATUS_DATA_TYPE__START_TIME:
				return getStartTime();
			case TypesPackage.SERVER_STATUS_DATA_TYPE__CURRENT_TIME:
				return getCurrentTime();
			case TypesPackage.SERVER_STATUS_DATA_TYPE__STATE:
				return getState();
			case TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO:
				return getBuildInfo();
			case TypesPackage.SERVER_STATUS_DATA_TYPE__SECONDS_TILL_SHUTDOWN:
				return getSecondsTillShutdown();
			case TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON:
				return getShutdownReason();
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
			case TypesPackage.SERVER_STATUS_DATA_TYPE__START_TIME:
				setStartTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.SERVER_STATUS_DATA_TYPE__CURRENT_TIME:
				setCurrentTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.SERVER_STATUS_DATA_TYPE__STATE:
				setState((ServerState)newValue);
				return;
			case TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO:
				setBuildInfo((BuildInfo)newValue);
				return;
			case TypesPackage.SERVER_STATUS_DATA_TYPE__SECONDS_TILL_SHUTDOWN:
				setSecondsTillShutdown((Long)newValue);
				return;
			case TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON:
				setShutdownReason((LocalizedText)newValue);
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
			case TypesPackage.SERVER_STATUS_DATA_TYPE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case TypesPackage.SERVER_STATUS_DATA_TYPE__CURRENT_TIME:
				setCurrentTime(CURRENT_TIME_EDEFAULT);
				return;
			case TypesPackage.SERVER_STATUS_DATA_TYPE__STATE:
				unsetState();
				return;
			case TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO:
				unsetBuildInfo();
				return;
			case TypesPackage.SERVER_STATUS_DATA_TYPE__SECONDS_TILL_SHUTDOWN:
				unsetSecondsTillShutdown();
				return;
			case TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON:
				unsetShutdownReason();
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
			case TypesPackage.SERVER_STATUS_DATA_TYPE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case TypesPackage.SERVER_STATUS_DATA_TYPE__CURRENT_TIME:
				return CURRENT_TIME_EDEFAULT == null ? currentTime != null : !CURRENT_TIME_EDEFAULT.equals(currentTime);
			case TypesPackage.SERVER_STATUS_DATA_TYPE__STATE:
				return isSetState();
			case TypesPackage.SERVER_STATUS_DATA_TYPE__BUILD_INFO:
				return isSetBuildInfo();
			case TypesPackage.SERVER_STATUS_DATA_TYPE__SECONDS_TILL_SHUTDOWN:
				return isSetSecondsTillShutdown();
			case TypesPackage.SERVER_STATUS_DATA_TYPE__SHUTDOWN_REASON:
				return isSetShutdownReason();
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
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", currentTime: ");
		result.append(currentTime);
		result.append(", state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", secondsTillShutdown: ");
		if (secondsTillShutdownESet) result.append(secondsTillShutdown); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServerStatusDataTypeImpl
