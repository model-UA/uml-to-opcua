/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datagram Writer Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DatagramWriterGroupTransportDataTypeImpl#getMessageRepeatCount <em>Message Repeat Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DatagramWriterGroupTransportDataTypeImpl#getMessageRepeatDelay <em>Message Repeat Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatagramWriterGroupTransportDataTypeImpl extends WriterGroupTransportDataTypeImpl implements DatagramWriterGroupTransportDataType {
	/**
	 * The default value of the '{@link #getMessageRepeatCount() <em>Message Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected static final short MESSAGE_REPEAT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMessageRepeatCount() <em>Message Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected short messageRepeatCount = MESSAGE_REPEAT_COUNT_EDEFAULT;

	/**
	 * This is true if the Message Repeat Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageRepeatCountESet;

	/**
	 * The default value of the '{@link #getMessageRepeatDelay() <em>Message Repeat Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRepeatDelay()
	 * @generated
	 * @ordered
	 */
	protected static final double MESSAGE_REPEAT_DELAY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMessageRepeatDelay() <em>Message Repeat Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRepeatDelay()
	 * @generated
	 * @ordered
	 */
	protected double messageRepeatDelay = MESSAGE_REPEAT_DELAY_EDEFAULT;

	/**
	 * This is true if the Message Repeat Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageRepeatDelayESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatagramWriterGroupTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDatagramWriterGroupTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getMessageRepeatCount() {
		return messageRepeatCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRepeatCount(short newMessageRepeatCount) {
		short oldMessageRepeatCount = messageRepeatCount;
		messageRepeatCount = newMessageRepeatCount;
		boolean oldMessageRepeatCountESet = messageRepeatCountESet;
		messageRepeatCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_COUNT, oldMessageRepeatCount, messageRepeatCount, !oldMessageRepeatCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageRepeatCount() {
		short oldMessageRepeatCount = messageRepeatCount;
		boolean oldMessageRepeatCountESet = messageRepeatCountESet;
		messageRepeatCount = MESSAGE_REPEAT_COUNT_EDEFAULT;
		messageRepeatCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_COUNT, oldMessageRepeatCount, MESSAGE_REPEAT_COUNT_EDEFAULT, oldMessageRepeatCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageRepeatCount() {
		return messageRepeatCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMessageRepeatDelay() {
		return messageRepeatDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRepeatDelay(double newMessageRepeatDelay) {
		double oldMessageRepeatDelay = messageRepeatDelay;
		messageRepeatDelay = newMessageRepeatDelay;
		boolean oldMessageRepeatDelayESet = messageRepeatDelayESet;
		messageRepeatDelayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_DELAY, oldMessageRepeatDelay, messageRepeatDelay, !oldMessageRepeatDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageRepeatDelay() {
		double oldMessageRepeatDelay = messageRepeatDelay;
		boolean oldMessageRepeatDelayESet = messageRepeatDelayESet;
		messageRepeatDelay = MESSAGE_REPEAT_DELAY_EDEFAULT;
		messageRepeatDelayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_DELAY, oldMessageRepeatDelay, MESSAGE_REPEAT_DELAY_EDEFAULT, oldMessageRepeatDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageRepeatDelay() {
		return messageRepeatDelayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_COUNT:
				return getMessageRepeatCount();
			case TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_DELAY:
				return getMessageRepeatDelay();
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
			case TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_COUNT:
				setMessageRepeatCount((Short)newValue);
				return;
			case TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_DELAY:
				setMessageRepeatDelay((Double)newValue);
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
			case TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_COUNT:
				unsetMessageRepeatCount();
				return;
			case TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_DELAY:
				unsetMessageRepeatDelay();
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
			case TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_COUNT:
				return isSetMessageRepeatCount();
			case TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE__MESSAGE_REPEAT_DELAY:
				return isSetMessageRepeatDelay();
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
		result.append(" (messageRepeatCount: ");
		if (messageRepeatCountESet) result.append(messageRepeatCount); else result.append("<unset>");
		result.append(", messageRepeatDelay: ");
		if (messageRepeatDelayESet) result.append(messageRepeatDelay); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DatagramWriterGroupTransportDataTypeImpl
