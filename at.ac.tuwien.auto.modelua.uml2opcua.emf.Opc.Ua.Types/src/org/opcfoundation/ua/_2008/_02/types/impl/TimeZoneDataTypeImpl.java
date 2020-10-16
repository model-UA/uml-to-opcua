/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.TimeZoneDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Zone Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TimeZoneDataTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TimeZoneDataTypeImpl#isDaylightSavingInOffset <em>Daylight Saving In Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeZoneDataTypeImpl extends MinimalEObjectImpl.Container implements TimeZoneDataType {
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final short OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected short offset = OFFSET_EDEFAULT;

	/**
	 * This is true if the Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetESet;

	/**
	 * The default value of the '{@link #isDaylightSavingInOffset() <em>Daylight Saving In Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDaylightSavingInOffset()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DAYLIGHT_SAVING_IN_OFFSET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDaylightSavingInOffset() <em>Daylight Saving In Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDaylightSavingInOffset()
	 * @generated
	 * @ordered
	 */
	protected boolean daylightSavingInOffset = DAYLIGHT_SAVING_IN_OFFSET_EDEFAULT;

	/**
	 * This is true if the Daylight Saving In Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean daylightSavingInOffsetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeZoneDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getTimeZoneDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(short newOffset) {
		short oldOffset = offset;
		offset = newOffset;
		boolean oldOffsetESet = offsetESet;
		offsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TIME_ZONE_DATA_TYPE__OFFSET, oldOffset, offset, !oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOffset() {
		short oldOffset = offset;
		boolean oldOffsetESet = offsetESet;
		offset = OFFSET_EDEFAULT;
		offsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TIME_ZONE_DATA_TYPE__OFFSET, oldOffset, OFFSET_EDEFAULT, oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOffset() {
		return offsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDaylightSavingInOffset() {
		return daylightSavingInOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaylightSavingInOffset(boolean newDaylightSavingInOffset) {
		boolean oldDaylightSavingInOffset = daylightSavingInOffset;
		daylightSavingInOffset = newDaylightSavingInOffset;
		boolean oldDaylightSavingInOffsetESet = daylightSavingInOffsetESet;
		daylightSavingInOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TIME_ZONE_DATA_TYPE__DAYLIGHT_SAVING_IN_OFFSET, oldDaylightSavingInOffset, daylightSavingInOffset, !oldDaylightSavingInOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDaylightSavingInOffset() {
		boolean oldDaylightSavingInOffset = daylightSavingInOffset;
		boolean oldDaylightSavingInOffsetESet = daylightSavingInOffsetESet;
		daylightSavingInOffset = DAYLIGHT_SAVING_IN_OFFSET_EDEFAULT;
		daylightSavingInOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TIME_ZONE_DATA_TYPE__DAYLIGHT_SAVING_IN_OFFSET, oldDaylightSavingInOffset, DAYLIGHT_SAVING_IN_OFFSET_EDEFAULT, oldDaylightSavingInOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDaylightSavingInOffset() {
		return daylightSavingInOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.TIME_ZONE_DATA_TYPE__OFFSET:
				return getOffset();
			case TypesPackage.TIME_ZONE_DATA_TYPE__DAYLIGHT_SAVING_IN_OFFSET:
				return isDaylightSavingInOffset();
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
			case TypesPackage.TIME_ZONE_DATA_TYPE__OFFSET:
				setOffset((Short)newValue);
				return;
			case TypesPackage.TIME_ZONE_DATA_TYPE__DAYLIGHT_SAVING_IN_OFFSET:
				setDaylightSavingInOffset((Boolean)newValue);
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
			case TypesPackage.TIME_ZONE_DATA_TYPE__OFFSET:
				unsetOffset();
				return;
			case TypesPackage.TIME_ZONE_DATA_TYPE__DAYLIGHT_SAVING_IN_OFFSET:
				unsetDaylightSavingInOffset();
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
			case TypesPackage.TIME_ZONE_DATA_TYPE__OFFSET:
				return isSetOffset();
			case TypesPackage.TIME_ZONE_DATA_TYPE__DAYLIGHT_SAVING_IN_OFFSET:
				return isSetDaylightSavingInOffset();
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
		result.append(" (offset: ");
		if (offsetESet) result.append(offset); else result.append("<unset>");
		result.append(", daylightSavingInOffset: ");
		if (daylightSavingInOffsetESet) result.append(daylightSavingInOffset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimeZoneDataTypeImpl
