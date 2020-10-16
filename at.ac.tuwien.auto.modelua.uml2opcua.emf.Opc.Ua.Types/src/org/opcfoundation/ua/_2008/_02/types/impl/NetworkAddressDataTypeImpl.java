/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.NetworkAddressDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Address Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.NetworkAddressDataTypeImpl#getNetworkInterface <em>Network Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkAddressDataTypeImpl extends MinimalEObjectImpl.Container implements NetworkAddressDataType {
	/**
	 * The default value of the '{@link #getNetworkInterface() <em>Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkInterface() <em>Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkInterface()
	 * @generated
	 * @ordered
	 */
	protected String networkInterface = NETWORK_INTERFACE_EDEFAULT;

	/**
	 * This is true if the Network Interface attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean networkInterfaceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkAddressDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getNetworkAddressDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkInterface() {
		return networkInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkInterface(String newNetworkInterface) {
		String oldNetworkInterface = networkInterface;
		networkInterface = newNetworkInterface;
		boolean oldNetworkInterfaceESet = networkInterfaceESet;
		networkInterfaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.NETWORK_ADDRESS_DATA_TYPE__NETWORK_INTERFACE, oldNetworkInterface, networkInterface, !oldNetworkInterfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNetworkInterface() {
		String oldNetworkInterface = networkInterface;
		boolean oldNetworkInterfaceESet = networkInterfaceESet;
		networkInterface = NETWORK_INTERFACE_EDEFAULT;
		networkInterfaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.NETWORK_ADDRESS_DATA_TYPE__NETWORK_INTERFACE, oldNetworkInterface, NETWORK_INTERFACE_EDEFAULT, oldNetworkInterfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNetworkInterface() {
		return networkInterfaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.NETWORK_ADDRESS_DATA_TYPE__NETWORK_INTERFACE:
				return getNetworkInterface();
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
			case TypesPackage.NETWORK_ADDRESS_DATA_TYPE__NETWORK_INTERFACE:
				setNetworkInterface((String)newValue);
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
			case TypesPackage.NETWORK_ADDRESS_DATA_TYPE__NETWORK_INTERFACE:
				unsetNetworkInterface();
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
			case TypesPackage.NETWORK_ADDRESS_DATA_TYPE__NETWORK_INTERFACE:
				return isSetNetworkInterface();
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
		result.append(" (networkInterface: ");
		if (networkInterfaceESet) result.append(networkInterface); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NetworkAddressDataTypeImpl
