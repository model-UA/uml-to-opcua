/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.HistoryUpdateType;
import org.opcfoundation.ua._2008._02.types.ModificationInfo;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modification Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModificationInfoImpl#getModificationTime <em>Modification Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModificationInfoImpl#getUpdateType <em>Update Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModificationInfoImpl#getUserName <em>User Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModificationInfoImpl extends MinimalEObjectImpl.Container implements ModificationInfo {
	/**
	 * The default value of the '{@link #getModificationTime() <em>Modification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MODIFICATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModificationTime() <em>Modification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar modificationTime = MODIFICATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateType() <em>Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateType()
	 * @generated
	 * @ordered
	 */
	protected static final HistoryUpdateType UPDATE_TYPE_EDEFAULT = HistoryUpdateType.INSERT1;

	/**
	 * The cached value of the '{@link #getUpdateType() <em>Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateType()
	 * @generated
	 * @ordered
	 */
	protected HistoryUpdateType updateType = UPDATE_TYPE_EDEFAULT;

	/**
	 * This is true if the Update Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateTypeESet;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * This is true if the User Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userNameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModificationInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getModificationInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getModificationTime() {
		return modificationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationTime(XMLGregorianCalendar newModificationTime) {
		XMLGregorianCalendar oldModificationTime = modificationTime;
		modificationTime = newModificationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFICATION_INFO__MODIFICATION_TIME, oldModificationTime, modificationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateType getUpdateType() {
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateType(HistoryUpdateType newUpdateType) {
		HistoryUpdateType oldUpdateType = updateType;
		updateType = newUpdateType == null ? UPDATE_TYPE_EDEFAULT : newUpdateType;
		boolean oldUpdateTypeESet = updateTypeESet;
		updateTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFICATION_INFO__UPDATE_TYPE, oldUpdateType, updateType, !oldUpdateTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdateType() {
		HistoryUpdateType oldUpdateType = updateType;
		boolean oldUpdateTypeESet = updateTypeESet;
		updateType = UPDATE_TYPE_EDEFAULT;
		updateTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFICATION_INFO__UPDATE_TYPE, oldUpdateType, UPDATE_TYPE_EDEFAULT, oldUpdateTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdateType() {
		return updateTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		boolean oldUserNameESet = userNameESet;
		userNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFICATION_INFO__USER_NAME, oldUserName, userName, !oldUserNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserName() {
		String oldUserName = userName;
		boolean oldUserNameESet = userNameESet;
		userName = USER_NAME_EDEFAULT;
		userNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFICATION_INFO__USER_NAME, oldUserName, USER_NAME_EDEFAULT, oldUserNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserName() {
		return userNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.MODIFICATION_INFO__MODIFICATION_TIME:
				return getModificationTime();
			case TypesPackage.MODIFICATION_INFO__UPDATE_TYPE:
				return getUpdateType();
			case TypesPackage.MODIFICATION_INFO__USER_NAME:
				return getUserName();
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
			case TypesPackage.MODIFICATION_INFO__MODIFICATION_TIME:
				setModificationTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.MODIFICATION_INFO__UPDATE_TYPE:
				setUpdateType((HistoryUpdateType)newValue);
				return;
			case TypesPackage.MODIFICATION_INFO__USER_NAME:
				setUserName((String)newValue);
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
			case TypesPackage.MODIFICATION_INFO__MODIFICATION_TIME:
				setModificationTime(MODIFICATION_TIME_EDEFAULT);
				return;
			case TypesPackage.MODIFICATION_INFO__UPDATE_TYPE:
				unsetUpdateType();
				return;
			case TypesPackage.MODIFICATION_INFO__USER_NAME:
				unsetUserName();
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
			case TypesPackage.MODIFICATION_INFO__MODIFICATION_TIME:
				return MODIFICATION_TIME_EDEFAULT == null ? modificationTime != null : !MODIFICATION_TIME_EDEFAULT.equals(modificationTime);
			case TypesPackage.MODIFICATION_INFO__UPDATE_TYPE:
				return isSetUpdateType();
			case TypesPackage.MODIFICATION_INFO__USER_NAME:
				return isSetUserName();
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
		result.append(" (modificationTime: ");
		result.append(modificationTime);
		result.append(", updateType: ");
		if (updateTypeESet) result.append(updateType); else result.append("<unset>");
		result.append(", userName: ");
		if (userNameESet) result.append(userName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModificationInfoImpl
