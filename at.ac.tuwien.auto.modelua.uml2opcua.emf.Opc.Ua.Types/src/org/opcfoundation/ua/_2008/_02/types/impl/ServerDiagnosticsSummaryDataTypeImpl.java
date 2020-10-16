/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Diagnostics Summary Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getServerViewCount <em>Server View Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getCurrentSessionCount <em>Current Session Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getCumulatedSessionCount <em>Cumulated Session Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getSecurityRejectedSessionCount <em>Security Rejected Session Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getRejectedSessionCount <em>Rejected Session Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getSessionTimeoutCount <em>Session Timeout Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getSessionAbortCount <em>Session Abort Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getCurrentSubscriptionCount <em>Current Subscription Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getCumulatedSubscriptionCount <em>Cumulated Subscription Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getPublishingIntervalCount <em>Publishing Interval Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getSecurityRejectedRequestsCount <em>Security Rejected Requests Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerDiagnosticsSummaryDataTypeImpl#getRejectedRequestsCount <em>Rejected Requests Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerDiagnosticsSummaryDataTypeImpl extends MinimalEObjectImpl.Container implements ServerDiagnosticsSummaryDataType {
	/**
	 * The default value of the '{@link #getServerViewCount() <em>Server View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerViewCount()
	 * @generated
	 * @ordered
	 */
	protected static final long SERVER_VIEW_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getServerViewCount() <em>Server View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerViewCount()
	 * @generated
	 * @ordered
	 */
	protected long serverViewCount = SERVER_VIEW_COUNT_EDEFAULT;

	/**
	 * This is true if the Server View Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverViewCountESet;

	/**
	 * The default value of the '{@link #getCurrentSessionCount() <em>Current Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSessionCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_SESSION_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentSessionCount() <em>Current Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSessionCount()
	 * @generated
	 * @ordered
	 */
	protected long currentSessionCount = CURRENT_SESSION_COUNT_EDEFAULT;

	/**
	 * This is true if the Current Session Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentSessionCountESet;

	/**
	 * The default value of the '{@link #getCumulatedSessionCount() <em>Cumulated Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulatedSessionCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CUMULATED_SESSION_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCumulatedSessionCount() <em>Cumulated Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulatedSessionCount()
	 * @generated
	 * @ordered
	 */
	protected long cumulatedSessionCount = CUMULATED_SESSION_COUNT_EDEFAULT;

	/**
	 * This is true if the Cumulated Session Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cumulatedSessionCountESet;

	/**
	 * The default value of the '{@link #getSecurityRejectedSessionCount() <em>Security Rejected Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRejectedSessionCount()
	 * @generated
	 * @ordered
	 */
	protected static final long SECURITY_REJECTED_SESSION_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSecurityRejectedSessionCount() <em>Security Rejected Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRejectedSessionCount()
	 * @generated
	 * @ordered
	 */
	protected long securityRejectedSessionCount = SECURITY_REJECTED_SESSION_COUNT_EDEFAULT;

	/**
	 * This is true if the Security Rejected Session Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityRejectedSessionCountESet;

	/**
	 * The default value of the '{@link #getRejectedSessionCount() <em>Rejected Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedSessionCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REJECTED_SESSION_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRejectedSessionCount() <em>Rejected Session Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedSessionCount()
	 * @generated
	 * @ordered
	 */
	protected long rejectedSessionCount = REJECTED_SESSION_COUNT_EDEFAULT;

	/**
	 * This is true if the Rejected Session Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rejectedSessionCountESet;

	/**
	 * The default value of the '{@link #getSessionTimeoutCount() <em>Session Timeout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTimeoutCount()
	 * @generated
	 * @ordered
	 */
	protected static final long SESSION_TIMEOUT_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSessionTimeoutCount() <em>Session Timeout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTimeoutCount()
	 * @generated
	 * @ordered
	 */
	protected long sessionTimeoutCount = SESSION_TIMEOUT_COUNT_EDEFAULT;

	/**
	 * This is true if the Session Timeout Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sessionTimeoutCountESet;

	/**
	 * The default value of the '{@link #getSessionAbortCount() <em>Session Abort Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionAbortCount()
	 * @generated
	 * @ordered
	 */
	protected static final long SESSION_ABORT_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSessionAbortCount() <em>Session Abort Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionAbortCount()
	 * @generated
	 * @ordered
	 */
	protected long sessionAbortCount = SESSION_ABORT_COUNT_EDEFAULT;

	/**
	 * This is true if the Session Abort Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sessionAbortCountESet;

	/**
	 * The default value of the '{@link #getCurrentSubscriptionCount() <em>Current Subscription Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSubscriptionCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_SUBSCRIPTION_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentSubscriptionCount() <em>Current Subscription Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSubscriptionCount()
	 * @generated
	 * @ordered
	 */
	protected long currentSubscriptionCount = CURRENT_SUBSCRIPTION_COUNT_EDEFAULT;

	/**
	 * This is true if the Current Subscription Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentSubscriptionCountESet;

	/**
	 * The default value of the '{@link #getCumulatedSubscriptionCount() <em>Cumulated Subscription Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulatedSubscriptionCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CUMULATED_SUBSCRIPTION_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCumulatedSubscriptionCount() <em>Cumulated Subscription Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulatedSubscriptionCount()
	 * @generated
	 * @ordered
	 */
	protected long cumulatedSubscriptionCount = CUMULATED_SUBSCRIPTION_COUNT_EDEFAULT;

	/**
	 * This is true if the Cumulated Subscription Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cumulatedSubscriptionCountESet;

	/**
	 * The default value of the '{@link #getPublishingIntervalCount() <em>Publishing Interval Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingIntervalCount()
	 * @generated
	 * @ordered
	 */
	protected static final long PUBLISHING_INTERVAL_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPublishingIntervalCount() <em>Publishing Interval Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingIntervalCount()
	 * @generated
	 * @ordered
	 */
	protected long publishingIntervalCount = PUBLISHING_INTERVAL_COUNT_EDEFAULT;

	/**
	 * This is true if the Publishing Interval Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishingIntervalCountESet;

	/**
	 * The default value of the '{@link #getSecurityRejectedRequestsCount() <em>Security Rejected Requests Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRejectedRequestsCount()
	 * @generated
	 * @ordered
	 */
	protected static final long SECURITY_REJECTED_REQUESTS_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSecurityRejectedRequestsCount() <em>Security Rejected Requests Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRejectedRequestsCount()
	 * @generated
	 * @ordered
	 */
	protected long securityRejectedRequestsCount = SECURITY_REJECTED_REQUESTS_COUNT_EDEFAULT;

	/**
	 * This is true if the Security Rejected Requests Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityRejectedRequestsCountESet;

	/**
	 * The default value of the '{@link #getRejectedRequestsCount() <em>Rejected Requests Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedRequestsCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REJECTED_REQUESTS_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRejectedRequestsCount() <em>Rejected Requests Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedRequestsCount()
	 * @generated
	 * @ordered
	 */
	protected long rejectedRequestsCount = REJECTED_REQUESTS_COUNT_EDEFAULT;

	/**
	 * This is true if the Rejected Requests Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rejectedRequestsCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerDiagnosticsSummaryDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getServerDiagnosticsSummaryDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getServerViewCount() {
		return serverViewCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerViewCount(long newServerViewCount) {
		long oldServerViewCount = serverViewCount;
		serverViewCount = newServerViewCount;
		boolean oldServerViewCountESet = serverViewCountESet;
		serverViewCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SERVER_VIEW_COUNT, oldServerViewCount, serverViewCount, !oldServerViewCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerViewCount() {
		long oldServerViewCount = serverViewCount;
		boolean oldServerViewCountESet = serverViewCountESet;
		serverViewCount = SERVER_VIEW_COUNT_EDEFAULT;
		serverViewCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SERVER_VIEW_COUNT, oldServerViewCount, SERVER_VIEW_COUNT_EDEFAULT, oldServerViewCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerViewCount() {
		return serverViewCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCurrentSessionCount() {
		return currentSessionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSessionCount(long newCurrentSessionCount) {
		long oldCurrentSessionCount = currentSessionCount;
		currentSessionCount = newCurrentSessionCount;
		boolean oldCurrentSessionCountESet = currentSessionCountESet;
		currentSessionCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SESSION_COUNT, oldCurrentSessionCount, currentSessionCount, !oldCurrentSessionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentSessionCount() {
		long oldCurrentSessionCount = currentSessionCount;
		boolean oldCurrentSessionCountESet = currentSessionCountESet;
		currentSessionCount = CURRENT_SESSION_COUNT_EDEFAULT;
		currentSessionCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SESSION_COUNT, oldCurrentSessionCount, CURRENT_SESSION_COUNT_EDEFAULT, oldCurrentSessionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentSessionCount() {
		return currentSessionCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCumulatedSessionCount() {
		return cumulatedSessionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCumulatedSessionCount(long newCumulatedSessionCount) {
		long oldCumulatedSessionCount = cumulatedSessionCount;
		cumulatedSessionCount = newCumulatedSessionCount;
		boolean oldCumulatedSessionCountESet = cumulatedSessionCountESet;
		cumulatedSessionCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SESSION_COUNT, oldCumulatedSessionCount, cumulatedSessionCount, !oldCumulatedSessionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCumulatedSessionCount() {
		long oldCumulatedSessionCount = cumulatedSessionCount;
		boolean oldCumulatedSessionCountESet = cumulatedSessionCountESet;
		cumulatedSessionCount = CUMULATED_SESSION_COUNT_EDEFAULT;
		cumulatedSessionCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SESSION_COUNT, oldCumulatedSessionCount, CUMULATED_SESSION_COUNT_EDEFAULT, oldCumulatedSessionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCumulatedSessionCount() {
		return cumulatedSessionCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSecurityRejectedSessionCount() {
		return securityRejectedSessionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityRejectedSessionCount(long newSecurityRejectedSessionCount) {
		long oldSecurityRejectedSessionCount = securityRejectedSessionCount;
		securityRejectedSessionCount = newSecurityRejectedSessionCount;
		boolean oldSecurityRejectedSessionCountESet = securityRejectedSessionCountESet;
		securityRejectedSessionCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_SESSION_COUNT, oldSecurityRejectedSessionCount, securityRejectedSessionCount, !oldSecurityRejectedSessionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityRejectedSessionCount() {
		long oldSecurityRejectedSessionCount = securityRejectedSessionCount;
		boolean oldSecurityRejectedSessionCountESet = securityRejectedSessionCountESet;
		securityRejectedSessionCount = SECURITY_REJECTED_SESSION_COUNT_EDEFAULT;
		securityRejectedSessionCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_SESSION_COUNT, oldSecurityRejectedSessionCount, SECURITY_REJECTED_SESSION_COUNT_EDEFAULT, oldSecurityRejectedSessionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityRejectedSessionCount() {
		return securityRejectedSessionCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRejectedSessionCount() {
		return rejectedSessionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRejectedSessionCount(long newRejectedSessionCount) {
		long oldRejectedSessionCount = rejectedSessionCount;
		rejectedSessionCount = newRejectedSessionCount;
		boolean oldRejectedSessionCountESet = rejectedSessionCountESet;
		rejectedSessionCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_SESSION_COUNT, oldRejectedSessionCount, rejectedSessionCount, !oldRejectedSessionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRejectedSessionCount() {
		long oldRejectedSessionCount = rejectedSessionCount;
		boolean oldRejectedSessionCountESet = rejectedSessionCountESet;
		rejectedSessionCount = REJECTED_SESSION_COUNT_EDEFAULT;
		rejectedSessionCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_SESSION_COUNT, oldRejectedSessionCount, REJECTED_SESSION_COUNT_EDEFAULT, oldRejectedSessionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRejectedSessionCount() {
		return rejectedSessionCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSessionTimeoutCount() {
		return sessionTimeoutCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionTimeoutCount(long newSessionTimeoutCount) {
		long oldSessionTimeoutCount = sessionTimeoutCount;
		sessionTimeoutCount = newSessionTimeoutCount;
		boolean oldSessionTimeoutCountESet = sessionTimeoutCountESet;
		sessionTimeoutCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_TIMEOUT_COUNT, oldSessionTimeoutCount, sessionTimeoutCount, !oldSessionTimeoutCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSessionTimeoutCount() {
		long oldSessionTimeoutCount = sessionTimeoutCount;
		boolean oldSessionTimeoutCountESet = sessionTimeoutCountESet;
		sessionTimeoutCount = SESSION_TIMEOUT_COUNT_EDEFAULT;
		sessionTimeoutCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_TIMEOUT_COUNT, oldSessionTimeoutCount, SESSION_TIMEOUT_COUNT_EDEFAULT, oldSessionTimeoutCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSessionTimeoutCount() {
		return sessionTimeoutCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSessionAbortCount() {
		return sessionAbortCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionAbortCount(long newSessionAbortCount) {
		long oldSessionAbortCount = sessionAbortCount;
		sessionAbortCount = newSessionAbortCount;
		boolean oldSessionAbortCountESet = sessionAbortCountESet;
		sessionAbortCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_ABORT_COUNT, oldSessionAbortCount, sessionAbortCount, !oldSessionAbortCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSessionAbortCount() {
		long oldSessionAbortCount = sessionAbortCount;
		boolean oldSessionAbortCountESet = sessionAbortCountESet;
		sessionAbortCount = SESSION_ABORT_COUNT_EDEFAULT;
		sessionAbortCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_ABORT_COUNT, oldSessionAbortCount, SESSION_ABORT_COUNT_EDEFAULT, oldSessionAbortCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSessionAbortCount() {
		return sessionAbortCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCurrentSubscriptionCount() {
		return currentSubscriptionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSubscriptionCount(long newCurrentSubscriptionCount) {
		long oldCurrentSubscriptionCount = currentSubscriptionCount;
		currentSubscriptionCount = newCurrentSubscriptionCount;
		boolean oldCurrentSubscriptionCountESet = currentSubscriptionCountESet;
		currentSubscriptionCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SUBSCRIPTION_COUNT, oldCurrentSubscriptionCount, currentSubscriptionCount, !oldCurrentSubscriptionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentSubscriptionCount() {
		long oldCurrentSubscriptionCount = currentSubscriptionCount;
		boolean oldCurrentSubscriptionCountESet = currentSubscriptionCountESet;
		currentSubscriptionCount = CURRENT_SUBSCRIPTION_COUNT_EDEFAULT;
		currentSubscriptionCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SUBSCRIPTION_COUNT, oldCurrentSubscriptionCount, CURRENT_SUBSCRIPTION_COUNT_EDEFAULT, oldCurrentSubscriptionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentSubscriptionCount() {
		return currentSubscriptionCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCumulatedSubscriptionCount() {
		return cumulatedSubscriptionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCumulatedSubscriptionCount(long newCumulatedSubscriptionCount) {
		long oldCumulatedSubscriptionCount = cumulatedSubscriptionCount;
		cumulatedSubscriptionCount = newCumulatedSubscriptionCount;
		boolean oldCumulatedSubscriptionCountESet = cumulatedSubscriptionCountESet;
		cumulatedSubscriptionCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SUBSCRIPTION_COUNT, oldCumulatedSubscriptionCount, cumulatedSubscriptionCount, !oldCumulatedSubscriptionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCumulatedSubscriptionCount() {
		long oldCumulatedSubscriptionCount = cumulatedSubscriptionCount;
		boolean oldCumulatedSubscriptionCountESet = cumulatedSubscriptionCountESet;
		cumulatedSubscriptionCount = CUMULATED_SUBSCRIPTION_COUNT_EDEFAULT;
		cumulatedSubscriptionCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SUBSCRIPTION_COUNT, oldCumulatedSubscriptionCount, CUMULATED_SUBSCRIPTION_COUNT_EDEFAULT, oldCumulatedSubscriptionCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCumulatedSubscriptionCount() {
		return cumulatedSubscriptionCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPublishingIntervalCount() {
		return publishingIntervalCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishingIntervalCount(long newPublishingIntervalCount) {
		long oldPublishingIntervalCount = publishingIntervalCount;
		publishingIntervalCount = newPublishingIntervalCount;
		boolean oldPublishingIntervalCountESet = publishingIntervalCountESet;
		publishingIntervalCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__PUBLISHING_INTERVAL_COUNT, oldPublishingIntervalCount, publishingIntervalCount, !oldPublishingIntervalCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishingIntervalCount() {
		long oldPublishingIntervalCount = publishingIntervalCount;
		boolean oldPublishingIntervalCountESet = publishingIntervalCountESet;
		publishingIntervalCount = PUBLISHING_INTERVAL_COUNT_EDEFAULT;
		publishingIntervalCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__PUBLISHING_INTERVAL_COUNT, oldPublishingIntervalCount, PUBLISHING_INTERVAL_COUNT_EDEFAULT, oldPublishingIntervalCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishingIntervalCount() {
		return publishingIntervalCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSecurityRejectedRequestsCount() {
		return securityRejectedRequestsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityRejectedRequestsCount(long newSecurityRejectedRequestsCount) {
		long oldSecurityRejectedRequestsCount = securityRejectedRequestsCount;
		securityRejectedRequestsCount = newSecurityRejectedRequestsCount;
		boolean oldSecurityRejectedRequestsCountESet = securityRejectedRequestsCountESet;
		securityRejectedRequestsCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_REQUESTS_COUNT, oldSecurityRejectedRequestsCount, securityRejectedRequestsCount, !oldSecurityRejectedRequestsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityRejectedRequestsCount() {
		long oldSecurityRejectedRequestsCount = securityRejectedRequestsCount;
		boolean oldSecurityRejectedRequestsCountESet = securityRejectedRequestsCountESet;
		securityRejectedRequestsCount = SECURITY_REJECTED_REQUESTS_COUNT_EDEFAULT;
		securityRejectedRequestsCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_REQUESTS_COUNT, oldSecurityRejectedRequestsCount, SECURITY_REJECTED_REQUESTS_COUNT_EDEFAULT, oldSecurityRejectedRequestsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityRejectedRequestsCount() {
		return securityRejectedRequestsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRejectedRequestsCount() {
		return rejectedRequestsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRejectedRequestsCount(long newRejectedRequestsCount) {
		long oldRejectedRequestsCount = rejectedRequestsCount;
		rejectedRequestsCount = newRejectedRequestsCount;
		boolean oldRejectedRequestsCountESet = rejectedRequestsCountESet;
		rejectedRequestsCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_REQUESTS_COUNT, oldRejectedRequestsCount, rejectedRequestsCount, !oldRejectedRequestsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRejectedRequestsCount() {
		long oldRejectedRequestsCount = rejectedRequestsCount;
		boolean oldRejectedRequestsCountESet = rejectedRequestsCountESet;
		rejectedRequestsCount = REJECTED_REQUESTS_COUNT_EDEFAULT;
		rejectedRequestsCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_REQUESTS_COUNT, oldRejectedRequestsCount, REJECTED_REQUESTS_COUNT_EDEFAULT, oldRejectedRequestsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRejectedRequestsCount() {
		return rejectedRequestsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SERVER_VIEW_COUNT:
				return getServerViewCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SESSION_COUNT:
				return getCurrentSessionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SESSION_COUNT:
				return getCumulatedSessionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_SESSION_COUNT:
				return getSecurityRejectedSessionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_SESSION_COUNT:
				return getRejectedSessionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_TIMEOUT_COUNT:
				return getSessionTimeoutCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_ABORT_COUNT:
				return getSessionAbortCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SUBSCRIPTION_COUNT:
				return getCurrentSubscriptionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SUBSCRIPTION_COUNT:
				return getCumulatedSubscriptionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__PUBLISHING_INTERVAL_COUNT:
				return getPublishingIntervalCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_REQUESTS_COUNT:
				return getSecurityRejectedRequestsCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_REQUESTS_COUNT:
				return getRejectedRequestsCount();
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
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SERVER_VIEW_COUNT:
				setServerViewCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SESSION_COUNT:
				setCurrentSessionCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SESSION_COUNT:
				setCumulatedSessionCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_SESSION_COUNT:
				setSecurityRejectedSessionCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_SESSION_COUNT:
				setRejectedSessionCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_TIMEOUT_COUNT:
				setSessionTimeoutCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_ABORT_COUNT:
				setSessionAbortCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SUBSCRIPTION_COUNT:
				setCurrentSubscriptionCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SUBSCRIPTION_COUNT:
				setCumulatedSubscriptionCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__PUBLISHING_INTERVAL_COUNT:
				setPublishingIntervalCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_REQUESTS_COUNT:
				setSecurityRejectedRequestsCount((Long)newValue);
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_REQUESTS_COUNT:
				setRejectedRequestsCount((Long)newValue);
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
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SERVER_VIEW_COUNT:
				unsetServerViewCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SESSION_COUNT:
				unsetCurrentSessionCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SESSION_COUNT:
				unsetCumulatedSessionCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_SESSION_COUNT:
				unsetSecurityRejectedSessionCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_SESSION_COUNT:
				unsetRejectedSessionCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_TIMEOUT_COUNT:
				unsetSessionTimeoutCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_ABORT_COUNT:
				unsetSessionAbortCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SUBSCRIPTION_COUNT:
				unsetCurrentSubscriptionCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SUBSCRIPTION_COUNT:
				unsetCumulatedSubscriptionCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__PUBLISHING_INTERVAL_COUNT:
				unsetPublishingIntervalCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_REQUESTS_COUNT:
				unsetSecurityRejectedRequestsCount();
				return;
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_REQUESTS_COUNT:
				unsetRejectedRequestsCount();
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
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SERVER_VIEW_COUNT:
				return isSetServerViewCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SESSION_COUNT:
				return isSetCurrentSessionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SESSION_COUNT:
				return isSetCumulatedSessionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_SESSION_COUNT:
				return isSetSecurityRejectedSessionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_SESSION_COUNT:
				return isSetRejectedSessionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_TIMEOUT_COUNT:
				return isSetSessionTimeoutCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SESSION_ABORT_COUNT:
				return isSetSessionAbortCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CURRENT_SUBSCRIPTION_COUNT:
				return isSetCurrentSubscriptionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__CUMULATED_SUBSCRIPTION_COUNT:
				return isSetCumulatedSubscriptionCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__PUBLISHING_INTERVAL_COUNT:
				return isSetPublishingIntervalCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__SECURITY_REJECTED_REQUESTS_COUNT:
				return isSetSecurityRejectedRequestsCount();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE__REJECTED_REQUESTS_COUNT:
				return isSetRejectedRequestsCount();
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
		result.append(" (serverViewCount: ");
		if (serverViewCountESet) result.append(serverViewCount); else result.append("<unset>");
		result.append(", currentSessionCount: ");
		if (currentSessionCountESet) result.append(currentSessionCount); else result.append("<unset>");
		result.append(", cumulatedSessionCount: ");
		if (cumulatedSessionCountESet) result.append(cumulatedSessionCount); else result.append("<unset>");
		result.append(", securityRejectedSessionCount: ");
		if (securityRejectedSessionCountESet) result.append(securityRejectedSessionCount); else result.append("<unset>");
		result.append(", rejectedSessionCount: ");
		if (rejectedSessionCountESet) result.append(rejectedSessionCount); else result.append("<unset>");
		result.append(", sessionTimeoutCount: ");
		if (sessionTimeoutCountESet) result.append(sessionTimeoutCount); else result.append("<unset>");
		result.append(", sessionAbortCount: ");
		if (sessionAbortCountESet) result.append(sessionAbortCount); else result.append("<unset>");
		result.append(", currentSubscriptionCount: ");
		if (currentSubscriptionCountESet) result.append(currentSubscriptionCount); else result.append("<unset>");
		result.append(", cumulatedSubscriptionCount: ");
		if (cumulatedSubscriptionCountESet) result.append(cumulatedSubscriptionCount); else result.append("<unset>");
		result.append(", publishingIntervalCount: ");
		if (publishingIntervalCountESet) result.append(publishingIntervalCount); else result.append("<unset>");
		result.append(", securityRejectedRequestsCount: ");
		if (securityRejectedRequestsCountESet) result.append(securityRejectedRequestsCount); else result.append("<unset>");
		result.append(", rejectedRequestsCount: ");
		if (rejectedRequestsCountESet) result.append(rejectedRequestsCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServerDiagnosticsSummaryDataTypeImpl
