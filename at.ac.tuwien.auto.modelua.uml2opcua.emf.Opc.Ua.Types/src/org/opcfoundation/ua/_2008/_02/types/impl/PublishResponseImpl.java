/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfStatusCode;
import org.opcfoundation.ua._2008._02.types.ListOfUInt32;
import org.opcfoundation.ua._2008._02.types.NotificationMessage;
import org.opcfoundation.ua._2008._02.types.PublishResponse;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publish Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishResponseImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishResponseImpl#getAvailableSequenceNumbers <em>Available Sequence Numbers</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishResponseImpl#isMoreNotifications <em>More Notifications</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishResponseImpl#getNotificationMessage <em>Notification Message</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishResponseImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishResponseImpl#getDiagnosticInfos <em>Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublishResponseImpl extends MinimalEObjectImpl.Container implements PublishResponse {
	/**
	 * The cached value of the '{@link #getResponseHeader() <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseHeader()
	 * @generated
	 * @ordered
	 */
	protected ResponseHeader responseHeader;

	/**
	 * This is true if the Response Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean responseHeaderESet;

	/**
	 * The default value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final long SUBSCRIPTION_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected long subscriptionId = SUBSCRIPTION_ID_EDEFAULT;

	/**
	 * This is true if the Subscription Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subscriptionIdESet;

	/**
	 * The cached value of the '{@link #getAvailableSequenceNumbers() <em>Available Sequence Numbers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSequenceNumbers()
	 * @generated
	 * @ordered
	 */
	protected ListOfUInt32 availableSequenceNumbers;

	/**
	 * This is true if the Available Sequence Numbers containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean availableSequenceNumbersESet;

	/**
	 * The default value of the '{@link #isMoreNotifications() <em>More Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoreNotifications()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MORE_NOTIFICATIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoreNotifications() <em>More Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoreNotifications()
	 * @generated
	 * @ordered
	 */
	protected boolean moreNotifications = MORE_NOTIFICATIONS_EDEFAULT;

	/**
	 * This is true if the More Notifications attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moreNotificationsESet;

	/**
	 * The cached value of the '{@link #getNotificationMessage() <em>Notification Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationMessage()
	 * @generated
	 * @ordered
	 */
	protected NotificationMessage notificationMessage;

	/**
	 * This is true if the Notification Message containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notificationMessageESet;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected ListOfStatusCode results;

	/**
	 * This is true if the Results containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultsESet;

	/**
	 * The cached value of the '{@link #getDiagnosticInfos() <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfDiagnosticInfo diagnosticInfos;

	/**
	 * This is true if the Diagnostic Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diagnosticInfosESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublishResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getPublishResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseHeader(ResponseHeader newResponseHeader, NotificationChain msgs) {
		ResponseHeader oldResponseHeader = responseHeader;
		responseHeader = newResponseHeader;
		boolean oldResponseHeaderESet = responseHeaderESet;
		responseHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseHeader(ResponseHeader newResponseHeader) {
		if (newResponseHeader != responseHeader) {
			NotificationChain msgs = null;
			if (responseHeader != null)
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetResponseHeader(NotificationChain msgs) {
		ResponseHeader oldResponseHeader = responseHeader;
		responseHeader = null;
		boolean oldResponseHeaderESet = responseHeaderESet;
		responseHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponseHeader() {
		if (responseHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponseHeader() {
		return responseHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionId(long newSubscriptionId) {
		long oldSubscriptionId = subscriptionId;
		subscriptionId = newSubscriptionId;
		boolean oldSubscriptionIdESet = subscriptionIdESet;
		subscriptionIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId, !oldSubscriptionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubscriptionId() {
		long oldSubscriptionId = subscriptionId;
		boolean oldSubscriptionIdESet = subscriptionIdESet;
		subscriptionId = SUBSCRIPTION_ID_EDEFAULT;
		subscriptionIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__SUBSCRIPTION_ID, oldSubscriptionId, SUBSCRIPTION_ID_EDEFAULT, oldSubscriptionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubscriptionId() {
		return subscriptionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt32 getAvailableSequenceNumbers() {
		return availableSequenceNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableSequenceNumbers(ListOfUInt32 newAvailableSequenceNumbers, NotificationChain msgs) {
		ListOfUInt32 oldAvailableSequenceNumbers = availableSequenceNumbers;
		availableSequenceNumbers = newAvailableSequenceNumbers;
		boolean oldAvailableSequenceNumbersESet = availableSequenceNumbersESet;
		availableSequenceNumbersESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS, oldAvailableSequenceNumbers, newAvailableSequenceNumbers, !oldAvailableSequenceNumbersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableSequenceNumbers(ListOfUInt32 newAvailableSequenceNumbers) {
		if (newAvailableSequenceNumbers != availableSequenceNumbers) {
			NotificationChain msgs = null;
			if (availableSequenceNumbers != null)
				msgs = ((InternalEObject)availableSequenceNumbers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS, null, msgs);
			if (newAvailableSequenceNumbers != null)
				msgs = ((InternalEObject)newAvailableSequenceNumbers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS, null, msgs);
			msgs = basicSetAvailableSequenceNumbers(newAvailableSequenceNumbers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAvailableSequenceNumbersESet = availableSequenceNumbersESet;
			availableSequenceNumbersESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS, newAvailableSequenceNumbers, newAvailableSequenceNumbers, !oldAvailableSequenceNumbersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAvailableSequenceNumbers(NotificationChain msgs) {
		ListOfUInt32 oldAvailableSequenceNumbers = availableSequenceNumbers;
		availableSequenceNumbers = null;
		boolean oldAvailableSequenceNumbersESet = availableSequenceNumbersESet;
		availableSequenceNumbersESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS, oldAvailableSequenceNumbers, null, oldAvailableSequenceNumbersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvailableSequenceNumbers() {
		if (availableSequenceNumbers != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)availableSequenceNumbers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS, null, msgs);
			msgs = basicUnsetAvailableSequenceNumbers(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAvailableSequenceNumbersESet = availableSequenceNumbersESet;
			availableSequenceNumbersESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS, null, null, oldAvailableSequenceNumbersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvailableSequenceNumbers() {
		return availableSequenceNumbersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoreNotifications() {
		return moreNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoreNotifications(boolean newMoreNotifications) {
		boolean oldMoreNotifications = moreNotifications;
		moreNotifications = newMoreNotifications;
		boolean oldMoreNotificationsESet = moreNotificationsESet;
		moreNotificationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__MORE_NOTIFICATIONS, oldMoreNotifications, moreNotifications, !oldMoreNotificationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoreNotifications() {
		boolean oldMoreNotifications = moreNotifications;
		boolean oldMoreNotificationsESet = moreNotificationsESet;
		moreNotifications = MORE_NOTIFICATIONS_EDEFAULT;
		moreNotificationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__MORE_NOTIFICATIONS, oldMoreNotifications, MORE_NOTIFICATIONS_EDEFAULT, oldMoreNotificationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoreNotifications() {
		return moreNotificationsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationMessage getNotificationMessage() {
		return notificationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationMessage(NotificationMessage newNotificationMessage, NotificationChain msgs) {
		NotificationMessage oldNotificationMessage = notificationMessage;
		notificationMessage = newNotificationMessage;
		boolean oldNotificationMessageESet = notificationMessageESet;
		notificationMessageESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE, oldNotificationMessage, newNotificationMessage, !oldNotificationMessageESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationMessage(NotificationMessage newNotificationMessage) {
		if (newNotificationMessage != notificationMessage) {
			NotificationChain msgs = null;
			if (notificationMessage != null)
				msgs = ((InternalEObject)notificationMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE, null, msgs);
			if (newNotificationMessage != null)
				msgs = ((InternalEObject)newNotificationMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE, null, msgs);
			msgs = basicSetNotificationMessage(newNotificationMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNotificationMessageESet = notificationMessageESet;
			notificationMessageESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE, newNotificationMessage, newNotificationMessage, !oldNotificationMessageESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNotificationMessage(NotificationChain msgs) {
		NotificationMessage oldNotificationMessage = notificationMessage;
		notificationMessage = null;
		boolean oldNotificationMessageESet = notificationMessageESet;
		notificationMessageESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE, oldNotificationMessage, null, oldNotificationMessageESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotificationMessage() {
		if (notificationMessage != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)notificationMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE, null, msgs);
			msgs = basicUnsetNotificationMessage(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNotificationMessageESet = notificationMessageESet;
			notificationMessageESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE, null, null, oldNotificationMessageESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotificationMessage() {
		return notificationMessageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusCode getResults() {
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResults(ListOfStatusCode newResults, NotificationChain msgs) {
		ListOfStatusCode oldResults = results;
		results = newResults;
		boolean oldResultsESet = resultsESet;
		resultsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__RESULTS, oldResults, newResults, !oldResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResults(ListOfStatusCode newResults) {
		if (newResults != results) {
			NotificationChain msgs = null;
			if (results != null)
				msgs = ((InternalEObject)results).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__RESULTS, null, msgs);
			if (newResults != null)
				msgs = ((InternalEObject)newResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__RESULTS, null, msgs);
			msgs = basicSetResults(newResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResultsESet = resultsESet;
			resultsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__RESULTS, newResults, newResults, !oldResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetResults(NotificationChain msgs) {
		ListOfStatusCode oldResults = results;
		results = null;
		boolean oldResultsESet = resultsESet;
		resultsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__RESULTS, oldResults, null, oldResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResults() {
		if (results != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)results).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__RESULTS, null, msgs);
			msgs = basicUnsetResults(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResultsESet = resultsESet;
			resultsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__RESULTS, null, null, oldResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResults() {
		return resultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getDiagnosticInfos() {
		return diagnosticInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticInfos(ListOfDiagnosticInfo newDiagnosticInfos, NotificationChain msgs) {
		ListOfDiagnosticInfo oldDiagnosticInfos = diagnosticInfos;
		diagnosticInfos = newDiagnosticInfos;
		boolean oldDiagnosticInfosESet = diagnosticInfosESet;
		diagnosticInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS, oldDiagnosticInfos, newDiagnosticInfos, !oldDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticInfos(ListOfDiagnosticInfo newDiagnosticInfos) {
		if (newDiagnosticInfos != diagnosticInfos) {
			NotificationChain msgs = null;
			if (diagnosticInfos != null)
				msgs = ((InternalEObject)diagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS, null, msgs);
			if (newDiagnosticInfos != null)
				msgs = ((InternalEObject)newDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetDiagnosticInfos(newDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfosESet = diagnosticInfosESet;
			diagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS, newDiagnosticInfos, newDiagnosticInfos, !oldDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDiagnosticInfos(NotificationChain msgs) {
		ListOfDiagnosticInfo oldDiagnosticInfos = diagnosticInfos;
		diagnosticInfos = null;
		boolean oldDiagnosticInfosESet = diagnosticInfosESet;
		diagnosticInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS, oldDiagnosticInfos, null, oldDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiagnosticInfos() {
		if (diagnosticInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)diagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfosESet = diagnosticInfosESet;
			diagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS, null, null, oldDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiagnosticInfos() {
		return diagnosticInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
			case TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS:
				return basicUnsetAvailableSequenceNumbers(msgs);
			case TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE:
				return basicUnsetNotificationMessage(msgs);
			case TypesPackage.PUBLISH_RESPONSE__RESULTS:
				return basicUnsetResults(msgs);
			case TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS:
				return basicUnsetDiagnosticInfos(msgs);
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
			case TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.PUBLISH_RESPONSE__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS:
				return getAvailableSequenceNumbers();
			case TypesPackage.PUBLISH_RESPONSE__MORE_NOTIFICATIONS:
				return isMoreNotifications();
			case TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE:
				return getNotificationMessage();
			case TypesPackage.PUBLISH_RESPONSE__RESULTS:
				return getResults();
			case TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS:
				return getDiagnosticInfos();
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
			case TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.PUBLISH_RESPONSE__SUBSCRIPTION_ID:
				setSubscriptionId((Long)newValue);
				return;
			case TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS:
				setAvailableSequenceNumbers((ListOfUInt32)newValue);
				return;
			case TypesPackage.PUBLISH_RESPONSE__MORE_NOTIFICATIONS:
				setMoreNotifications((Boolean)newValue);
				return;
			case TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE:
				setNotificationMessage((NotificationMessage)newValue);
				return;
			case TypesPackage.PUBLISH_RESPONSE__RESULTS:
				setResults((ListOfStatusCode)newValue);
				return;
			case TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS:
				setDiagnosticInfos((ListOfDiagnosticInfo)newValue);
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
			case TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.PUBLISH_RESPONSE__SUBSCRIPTION_ID:
				unsetSubscriptionId();
				return;
			case TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS:
				unsetAvailableSequenceNumbers();
				return;
			case TypesPackage.PUBLISH_RESPONSE__MORE_NOTIFICATIONS:
				unsetMoreNotifications();
				return;
			case TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE:
				unsetNotificationMessage();
				return;
			case TypesPackage.PUBLISH_RESPONSE__RESULTS:
				unsetResults();
				return;
			case TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS:
				unsetDiagnosticInfos();
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
			case TypesPackage.PUBLISH_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.PUBLISH_RESPONSE__SUBSCRIPTION_ID:
				return isSetSubscriptionId();
			case TypesPackage.PUBLISH_RESPONSE__AVAILABLE_SEQUENCE_NUMBERS:
				return isSetAvailableSequenceNumbers();
			case TypesPackage.PUBLISH_RESPONSE__MORE_NOTIFICATIONS:
				return isSetMoreNotifications();
			case TypesPackage.PUBLISH_RESPONSE__NOTIFICATION_MESSAGE:
				return isSetNotificationMessage();
			case TypesPackage.PUBLISH_RESPONSE__RESULTS:
				return isSetResults();
			case TypesPackage.PUBLISH_RESPONSE__DIAGNOSTIC_INFOS:
				return isSetDiagnosticInfos();
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
		result.append(" (subscriptionId: ");
		if (subscriptionIdESet) result.append(subscriptionId); else result.append("<unset>");
		result.append(", moreNotifications: ");
		if (moreNotificationsESet) result.append(moreNotifications); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PublishResponseImpl
