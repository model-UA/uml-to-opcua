/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Raw Modified Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteRawModifiedDetailsImpl#isIsDeleteModified <em>Is Delete Modified</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteRawModifiedDetailsImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteRawModifiedDetailsImpl#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteRawModifiedDetailsImpl extends HistoryUpdateDetailsImpl implements DeleteRawModifiedDetails {
	/**
	 * The default value of the '{@link #isIsDeleteModified() <em>Is Delete Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeleteModified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DELETE_MODIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDeleteModified() <em>Is Delete Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeleteModified()
	 * @generated
	 * @ordered
	 */
	protected boolean isDeleteModified = IS_DELETE_MODIFIED_EDEFAULT;

	/**
	 * This is true if the Is Delete Modified attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDeleteModifiedESet;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endTime = END_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteRawModifiedDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDeleteRawModifiedDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDeleteModified() {
		return isDeleteModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeleteModified(boolean newIsDeleteModified) {
		boolean oldIsDeleteModified = isDeleteModified;
		isDeleteModified = newIsDeleteModified;
		boolean oldIsDeleteModifiedESet = isDeleteModifiedESet;
		isDeleteModifiedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_RAW_MODIFIED_DETAILS__IS_DELETE_MODIFIED, oldIsDeleteModified, isDeleteModified, !oldIsDeleteModifiedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDeleteModified() {
		boolean oldIsDeleteModified = isDeleteModified;
		boolean oldIsDeleteModifiedESet = isDeleteModifiedESet;
		isDeleteModified = IS_DELETE_MODIFIED_EDEFAULT;
		isDeleteModifiedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_RAW_MODIFIED_DETAILS__IS_DELETE_MODIFIED, oldIsDeleteModified, IS_DELETE_MODIFIED_EDEFAULT, oldIsDeleteModifiedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDeleteModified() {
		return isDeleteModifiedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(XMLGregorianCalendar newStartTime) {
		XMLGregorianCalendar oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_RAW_MODIFIED_DETAILS__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(XMLGregorianCalendar newEndTime) {
		XMLGregorianCalendar oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_RAW_MODIFIED_DETAILS__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__IS_DELETE_MODIFIED:
				return isIsDeleteModified();
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__START_TIME:
				return getStartTime();
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__END_TIME:
				return getEndTime();
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
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__IS_DELETE_MODIFIED:
				setIsDeleteModified((Boolean)newValue);
				return;
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__START_TIME:
				setStartTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__END_TIME:
				setEndTime((XMLGregorianCalendar)newValue);
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
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__IS_DELETE_MODIFIED:
				unsetIsDeleteModified();
				return;
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
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
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__IS_DELETE_MODIFIED:
				return isSetIsDeleteModified();
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
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
		result.append(" (isDeleteModified: ");
		if (isDeleteModifiedESet) result.append(isDeleteModified); else result.append("<unset>");
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} //DeleteRawModifiedDetailsImpl
