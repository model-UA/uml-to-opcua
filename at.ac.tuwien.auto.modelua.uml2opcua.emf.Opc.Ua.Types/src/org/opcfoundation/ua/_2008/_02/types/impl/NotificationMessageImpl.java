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

import org.opcfoundation.ua._2008._02.types.ListOfExtensionObject;
import org.opcfoundation.ua._2008._02.types.NotificationMessage;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NotificationMessageImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NotificationMessageImpl#getPublishTime <em>Publish Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NotificationMessageImpl#getNotificationData <em>Notification Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationMessageImpl extends MinimalEObjectImpl.Container implements NotificationMessage {
	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceNumberESet;

	/**
	 * The default value of the '{@link #getPublishTime() <em>Publish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PUBLISH_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublishTime() <em>Publish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar publishTime = PUBLISH_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotificationData() <em>Notification Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationData()
	 * @generated
	 * @ordered
	 */
	protected ListOfExtensionObject notificationData;

	/**
	 * This is true if the Notification Data containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notificationDataESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getNotificationMessage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(long newSequenceNumber) {
		long oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		boolean oldSequenceNumberESet = sequenceNumberESet;
		sequenceNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NOTIFICATION_MESSAGE__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber, !oldSequenceNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSequenceNumber() {
		long oldSequenceNumber = sequenceNumber;
		boolean oldSequenceNumberESet = sequenceNumberESet;
		sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
		sequenceNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NOTIFICATION_MESSAGE__SEQUENCE_NUMBER, oldSequenceNumber, SEQUENCE_NUMBER_EDEFAULT, oldSequenceNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSequenceNumber() {
		return sequenceNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getPublishTime() {
		return publishTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishTime(XMLGregorianCalendar newPublishTime) {
		XMLGregorianCalendar oldPublishTime = publishTime;
		publishTime = newPublishTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NOTIFICATION_MESSAGE__PUBLISH_TIME, oldPublishTime, publishTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfExtensionObject getNotificationData() {
		return notificationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationData(ListOfExtensionObject newNotificationData, NotificationChain msgs) {
		ListOfExtensionObject oldNotificationData = notificationData;
		notificationData = newNotificationData;
		boolean oldNotificationDataESet = notificationDataESet;
		notificationDataESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA, oldNotificationData, newNotificationData, !oldNotificationDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationData(ListOfExtensionObject newNotificationData) {
		if (newNotificationData != notificationData) {
			NotificationChain msgs = null;
			if (notificationData != null)
				msgs = ((InternalEObject)notificationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA, null, msgs);
			if (newNotificationData != null)
				msgs = ((InternalEObject)newNotificationData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA, null, msgs);
			msgs = basicSetNotificationData(newNotificationData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNotificationDataESet = notificationDataESet;
			notificationDataESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA, newNotificationData, newNotificationData, !oldNotificationDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNotificationData(NotificationChain msgs) {
		ListOfExtensionObject oldNotificationData = notificationData;
		notificationData = null;
		boolean oldNotificationDataESet = notificationDataESet;
		notificationDataESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA, oldNotificationData, null, oldNotificationDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotificationData() {
		if (notificationData != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)notificationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA, null, msgs);
			msgs = basicUnsetNotificationData(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNotificationDataESet = notificationDataESet;
			notificationDataESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA, null, null, oldNotificationDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotificationData() {
		return notificationDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA:
				return basicUnsetNotificationData(msgs);
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
			case TypesPackage.NOTIFICATION_MESSAGE__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case TypesPackage.NOTIFICATION_MESSAGE__PUBLISH_TIME:
				return getPublishTime();
			case TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA:
				return getNotificationData();
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
			case TypesPackage.NOTIFICATION_MESSAGE__SEQUENCE_NUMBER:
				setSequenceNumber((Long)newValue);
				return;
			case TypesPackage.NOTIFICATION_MESSAGE__PUBLISH_TIME:
				setPublishTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA:
				setNotificationData((ListOfExtensionObject)newValue);
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
			case TypesPackage.NOTIFICATION_MESSAGE__SEQUENCE_NUMBER:
				unsetSequenceNumber();
				return;
			case TypesPackage.NOTIFICATION_MESSAGE__PUBLISH_TIME:
				setPublishTime(PUBLISH_TIME_EDEFAULT);
				return;
			case TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA:
				unsetNotificationData();
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
			case TypesPackage.NOTIFICATION_MESSAGE__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
			case TypesPackage.NOTIFICATION_MESSAGE__PUBLISH_TIME:
				return PUBLISH_TIME_EDEFAULT == null ? publishTime != null : !PUBLISH_TIME_EDEFAULT.equals(publishTime);
			case TypesPackage.NOTIFICATION_MESSAGE__NOTIFICATION_DATA:
				return isSetNotificationData();
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
		result.append(" (sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(", publishTime: ");
		result.append(publishTime);
		result.append(')');
		return result.toString();
	}

} //NotificationMessageImpl
