/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ServiceCounterDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Counter Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServiceCounterDataTypeImpl#getTotalCount <em>Total Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServiceCounterDataTypeImpl#getErrorCount <em>Error Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceCounterDataTypeImpl extends MinimalEObjectImpl.Container implements ServiceCounterDataType {
	/**
	 * The default value of the '{@link #getTotalCount() <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCount()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalCount() <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCount()
	 * @generated
	 * @ordered
	 */
	protected long totalCount = TOTAL_COUNT_EDEFAULT;

	/**
	 * This is true if the Total Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalCountESet;

	/**
	 * The default value of the '{@link #getErrorCount() <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCount()
	 * @generated
	 * @ordered
	 */
	protected static final long ERROR_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getErrorCount() <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCount()
	 * @generated
	 * @ordered
	 */
	protected long errorCount = ERROR_COUNT_EDEFAULT;

	/**
	 * This is true if the Error Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCounterDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getServiceCounterDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTotalCount() {
		return totalCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCount(long newTotalCount) {
		long oldTotalCount = totalCount;
		totalCount = newTotalCount;
		boolean oldTotalCountESet = totalCountESet;
		totalCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVICE_COUNTER_DATA_TYPE__TOTAL_COUNT, oldTotalCount, totalCount, !oldTotalCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalCount() {
		long oldTotalCount = totalCount;
		boolean oldTotalCountESet = totalCountESet;
		totalCount = TOTAL_COUNT_EDEFAULT;
		totalCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVICE_COUNTER_DATA_TYPE__TOTAL_COUNT, oldTotalCount, TOTAL_COUNT_EDEFAULT, oldTotalCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalCount() {
		return totalCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getErrorCount() {
		return errorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCount(long newErrorCount) {
		long oldErrorCount = errorCount;
		errorCount = newErrorCount;
		boolean oldErrorCountESet = errorCountESet;
		errorCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVICE_COUNTER_DATA_TYPE__ERROR_COUNT, oldErrorCount, errorCount, !oldErrorCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorCount() {
		long oldErrorCount = errorCount;
		boolean oldErrorCountESet = errorCountESet;
		errorCount = ERROR_COUNT_EDEFAULT;
		errorCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVICE_COUNTER_DATA_TYPE__ERROR_COUNT, oldErrorCount, ERROR_COUNT_EDEFAULT, oldErrorCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorCount() {
		return errorCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.SERVICE_COUNTER_DATA_TYPE__TOTAL_COUNT:
				return getTotalCount();
			case TypesPackage.SERVICE_COUNTER_DATA_TYPE__ERROR_COUNT:
				return getErrorCount();
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
			case TypesPackage.SERVICE_COUNTER_DATA_TYPE__TOTAL_COUNT:
				setTotalCount((Long)newValue);
				return;
			case TypesPackage.SERVICE_COUNTER_DATA_TYPE__ERROR_COUNT:
				setErrorCount((Long)newValue);
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
			case TypesPackage.SERVICE_COUNTER_DATA_TYPE__TOTAL_COUNT:
				unsetTotalCount();
				return;
			case TypesPackage.SERVICE_COUNTER_DATA_TYPE__ERROR_COUNT:
				unsetErrorCount();
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
			case TypesPackage.SERVICE_COUNTER_DATA_TYPE__TOTAL_COUNT:
				return isSetTotalCount();
			case TypesPackage.SERVICE_COUNTER_DATA_TYPE__ERROR_COUNT:
				return isSetErrorCount();
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
		result.append(" (totalCount: ");
		if (totalCountESet) result.append(totalCount); else result.append("<unset>");
		result.append(", errorCount: ");
		if (errorCountESet) result.append(errorCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServiceCounterDataTypeImpl
