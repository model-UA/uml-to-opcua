/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datagram Connection Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DatagramConnectionTransportDataTypeImpl#getDiscoveryAddress <em>Discovery Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatagramConnectionTransportDataTypeImpl extends ConnectionTransportDataTypeImpl implements DatagramConnectionTransportDataType {
	/**
	 * The cached value of the '{@link #getDiscoveryAddress() <em>Discovery Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryAddress()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject discoveryAddress;

	/**
	 * This is true if the Discovery Address containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discoveryAddressESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatagramConnectionTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDatagramConnectionTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getDiscoveryAddress() {
		return discoveryAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscoveryAddress(ExtensionObject newDiscoveryAddress, NotificationChain msgs) {
		ExtensionObject oldDiscoveryAddress = discoveryAddress;
		discoveryAddress = newDiscoveryAddress;
		boolean oldDiscoveryAddressESet = discoveryAddressESet;
		discoveryAddressESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS, oldDiscoveryAddress, newDiscoveryAddress, !oldDiscoveryAddressESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryAddress(ExtensionObject newDiscoveryAddress) {
		if (newDiscoveryAddress != discoveryAddress) {
			NotificationChain msgs = null;
			if (discoveryAddress != null)
				msgs = ((InternalEObject)discoveryAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS, null, msgs);
			if (newDiscoveryAddress != null)
				msgs = ((InternalEObject)newDiscoveryAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS, null, msgs);
			msgs = basicSetDiscoveryAddress(newDiscoveryAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiscoveryAddressESet = discoveryAddressESet;
			discoveryAddressESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS, newDiscoveryAddress, newDiscoveryAddress, !oldDiscoveryAddressESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDiscoveryAddress(NotificationChain msgs) {
		ExtensionObject oldDiscoveryAddress = discoveryAddress;
		discoveryAddress = null;
		boolean oldDiscoveryAddressESet = discoveryAddressESet;
		discoveryAddressESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS, oldDiscoveryAddress, null, oldDiscoveryAddressESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiscoveryAddress() {
		if (discoveryAddress != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)discoveryAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS, null, msgs);
			msgs = basicUnsetDiscoveryAddress(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiscoveryAddressESet = discoveryAddressESet;
			discoveryAddressESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS, null, null, oldDiscoveryAddressESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiscoveryAddress() {
		return discoveryAddressESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS:
				return basicUnsetDiscoveryAddress(msgs);
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
			case TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS:
				return getDiscoveryAddress();
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
			case TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS:
				setDiscoveryAddress((ExtensionObject)newValue);
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
			case TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS:
				unsetDiscoveryAddress();
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
			case TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DISCOVERY_ADDRESS:
				return isSetDiscoveryAddress();
		}
		return super.eIsSet(featureID);
	}

} //DatagramConnectionTransportDataTypeImpl
