/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DataValue;
import org.opcfoundation.ua._2008._02.types.MonitoredItemNotification;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitored Item Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemNotificationImpl#getClientHandle <em>Client Handle</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemNotificationImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoredItemNotificationImpl extends MinimalEObjectImpl.Container implements MonitoredItemNotification {
	/**
	 * The default value of the '{@link #getClientHandle() <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientHandle()
	 * @generated
	 * @ordered
	 */
	protected static final long CLIENT_HANDLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClientHandle() <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientHandle()
	 * @generated
	 * @ordered
	 */
	protected long clientHandle = CLIENT_HANDLE_EDEFAULT;

	/**
	 * This is true if the Client Handle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientHandleESet;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue value;

	/**
	 * This is true if the Value containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoredItemNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getMonitoredItemNotification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClientHandle() {
		return clientHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientHandle(long newClientHandle) {
		long oldClientHandle = clientHandle;
		clientHandle = newClientHandle;
		boolean oldClientHandleESet = clientHandleESet;
		clientHandleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_NOTIFICATION__CLIENT_HANDLE, oldClientHandle, clientHandle, !oldClientHandleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientHandle() {
		long oldClientHandle = clientHandle;
		boolean oldClientHandleESet = clientHandleESet;
		clientHandle = CLIENT_HANDLE_EDEFAULT;
		clientHandleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_NOTIFICATION__CLIENT_HANDLE, oldClientHandle, CLIENT_HANDLE_EDEFAULT, oldClientHandleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientHandle() {
		return clientHandleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(DataValue newValue, NotificationChain msgs) {
		DataValue oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE, oldValue, newValue, !oldValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(DataValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldValueESet = valueESet;
			valueESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE, newValue, newValue, !oldValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetValue(NotificationChain msgs) {
		DataValue oldValue = value;
		value = null;
		boolean oldValueESet = valueESet;
		valueESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE, oldValue, null, oldValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		if (value != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE, null, msgs);
			msgs = basicUnsetValue(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldValueESet = valueESet;
			valueESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE, null, null, oldValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE:
				return basicUnsetValue(msgs);
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
			case TypesPackage.MONITORED_ITEM_NOTIFICATION__CLIENT_HANDLE:
				return getClientHandle();
			case TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE:
				return getValue();
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
			case TypesPackage.MONITORED_ITEM_NOTIFICATION__CLIENT_HANDLE:
				setClientHandle((Long)newValue);
				return;
			case TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE:
				setValue((DataValue)newValue);
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
			case TypesPackage.MONITORED_ITEM_NOTIFICATION__CLIENT_HANDLE:
				unsetClientHandle();
				return;
			case TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE:
				unsetValue();
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
			case TypesPackage.MONITORED_ITEM_NOTIFICATION__CLIENT_HANDLE:
				return isSetClientHandle();
			case TypesPackage.MONITORED_ITEM_NOTIFICATION__VALUE:
				return isSetValue();
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
		result.append(" (clientHandle: ");
		if (clientHandleESet) result.append(clientHandle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MonitoredItemNotificationImpl
