/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.HistoryModifiedData;
import org.opcfoundation.ua._2008._02.types.ListOfModificationInfo;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Modified Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryModifiedDataImpl#getModificationInfos <em>Modification Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryModifiedDataImpl extends HistoryDataImpl implements HistoryModifiedData {
	/**
	 * The cached value of the '{@link #getModificationInfos() <em>Modification Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfModificationInfo modificationInfos;

	/**
	 * This is true if the Modification Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modificationInfosESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryModifiedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getHistoryModifiedData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfModificationInfo getModificationInfos() {
		return modificationInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModificationInfos(ListOfModificationInfo newModificationInfos, NotificationChain msgs) {
		ListOfModificationInfo oldModificationInfos = modificationInfos;
		modificationInfos = newModificationInfos;
		boolean oldModificationInfosESet = modificationInfosESet;
		modificationInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS, oldModificationInfos, newModificationInfos, !oldModificationInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationInfos(ListOfModificationInfo newModificationInfos) {
		if (newModificationInfos != modificationInfos) {
			NotificationChain msgs = null;
			if (modificationInfos != null)
				msgs = ((InternalEObject)modificationInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS, null, msgs);
			if (newModificationInfos != null)
				msgs = ((InternalEObject)newModificationInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS, null, msgs);
			msgs = basicSetModificationInfos(newModificationInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldModificationInfosESet = modificationInfosESet;
			modificationInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS, newModificationInfos, newModificationInfos, !oldModificationInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetModificationInfos(NotificationChain msgs) {
		ListOfModificationInfo oldModificationInfos = modificationInfos;
		modificationInfos = null;
		boolean oldModificationInfosESet = modificationInfosESet;
		modificationInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS, oldModificationInfos, null, oldModificationInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModificationInfos() {
		if (modificationInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)modificationInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS, null, msgs);
			msgs = basicUnsetModificationInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldModificationInfosESet = modificationInfosESet;
			modificationInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS, null, null, oldModificationInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModificationInfos() {
		return modificationInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS:
				return basicUnsetModificationInfos(msgs);
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
			case TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS:
				return getModificationInfos();
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
			case TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS:
				setModificationInfos((ListOfModificationInfo)newValue);
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
			case TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS:
				unsetModificationInfos();
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
			case TypesPackage.HISTORY_MODIFIED_DATA__MODIFICATION_INFOS:
				return isSetModificationInfos();
		}
		return super.eIsSet(featureID);
	}

} //HistoryModifiedDataImpl
