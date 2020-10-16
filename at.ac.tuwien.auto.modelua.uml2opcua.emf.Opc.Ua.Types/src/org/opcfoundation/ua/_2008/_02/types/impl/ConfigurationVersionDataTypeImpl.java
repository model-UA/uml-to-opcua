/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Version Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ConfigurationVersionDataTypeImpl#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ConfigurationVersionDataTypeImpl#getMinorVersion <em>Minor Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationVersionDataTypeImpl extends MinimalEObjectImpl.Container implements ConfigurationVersionDataType {
	/**
	 * The default value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long MAJOR_VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected long majorVersion = MAJOR_VERSION_EDEFAULT;

	/**
	 * This is true if the Major Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean majorVersionESet;

	/**
	 * The default value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long MINOR_VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected long minorVersion = MINOR_VERSION_EDEFAULT;

	/**
	 * This is true if the Minor Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minorVersionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationVersionDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getConfigurationVersionDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMajorVersion() {
		return majorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorVersion(long newMajorVersion) {
		long oldMajorVersion = majorVersion;
		majorVersion = newMajorVersion;
		boolean oldMajorVersionESet = majorVersionESet;
		majorVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MAJOR_VERSION, oldMajorVersion, majorVersion, !oldMajorVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMajorVersion() {
		long oldMajorVersion = majorVersion;
		boolean oldMajorVersionESet = majorVersionESet;
		majorVersion = MAJOR_VERSION_EDEFAULT;
		majorVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MAJOR_VERSION, oldMajorVersion, MAJOR_VERSION_EDEFAULT, oldMajorVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMajorVersion() {
		return majorVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMinorVersion() {
		return minorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorVersion(long newMinorVersion) {
		long oldMinorVersion = minorVersion;
		minorVersion = newMinorVersion;
		boolean oldMinorVersionESet = minorVersionESet;
		minorVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MINOR_VERSION, oldMinorVersion, minorVersion, !oldMinorVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinorVersion() {
		long oldMinorVersion = minorVersion;
		boolean oldMinorVersionESet = minorVersionESet;
		minorVersion = MINOR_VERSION_EDEFAULT;
		minorVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MINOR_VERSION, oldMinorVersion, MINOR_VERSION_EDEFAULT, oldMinorVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinorVersion() {
		return minorVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MAJOR_VERSION:
				return getMajorVersion();
			case TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MINOR_VERSION:
				return getMinorVersion();
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
			case TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MAJOR_VERSION:
				setMajorVersion((Long)newValue);
				return;
			case TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MINOR_VERSION:
				setMinorVersion((Long)newValue);
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
			case TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MAJOR_VERSION:
				unsetMajorVersion();
				return;
			case TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MINOR_VERSION:
				unsetMinorVersion();
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
			case TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MAJOR_VERSION:
				return isSetMajorVersion();
			case TypesPackage.CONFIGURATION_VERSION_DATA_TYPE__MINOR_VERSION:
				return isSetMinorVersion();
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
		result.append(" (majorVersion: ");
		if (majorVersionESet) result.append(majorVersion); else result.append("<unset>");
		result.append(", minorVersion: ");
		if (minorVersionESet) result.append(minorVersion); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConfigurationVersionDataTypeImpl
