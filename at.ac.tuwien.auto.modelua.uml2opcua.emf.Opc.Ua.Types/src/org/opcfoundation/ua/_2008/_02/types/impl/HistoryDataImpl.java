/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.HistoryData;
import org.opcfoundation.ua._2008._02.types.ListOfDataValue;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryDataImpl#getDataValues <em>Data Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryDataImpl extends MinimalEObjectImpl.Container implements HistoryData {
	/**
	 * The cached value of the '{@link #getDataValues() <em>Data Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValues()
	 * @generated
	 * @ordered
	 */
	protected ListOfDataValue dataValues;

	/**
	 * This is true if the Data Values containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataValuesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getHistoryData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataValue getDataValues() {
		return dataValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataValues(ListOfDataValue newDataValues, NotificationChain msgs) {
		ListOfDataValue oldDataValues = dataValues;
		dataValues = newDataValues;
		boolean oldDataValuesESet = dataValuesESet;
		dataValuesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_DATA__DATA_VALUES, oldDataValues, newDataValues, !oldDataValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValues(ListOfDataValue newDataValues) {
		if (newDataValues != dataValues) {
			NotificationChain msgs = null;
			if (dataValues != null)
				msgs = ((InternalEObject)dataValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_DATA__DATA_VALUES, null, msgs);
			if (newDataValues != null)
				msgs = ((InternalEObject)newDataValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_DATA__DATA_VALUES, null, msgs);
			msgs = basicSetDataValues(newDataValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataValuesESet = dataValuesESet;
			dataValuesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_DATA__DATA_VALUES, newDataValues, newDataValues, !oldDataValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataValues(NotificationChain msgs) {
		ListOfDataValue oldDataValues = dataValues;
		dataValues = null;
		boolean oldDataValuesESet = dataValuesESet;
		dataValuesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_DATA__DATA_VALUES, oldDataValues, null, oldDataValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataValues() {
		if (dataValues != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_DATA__DATA_VALUES, null, msgs);
			msgs = basicUnsetDataValues(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataValuesESet = dataValuesESet;
			dataValuesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_DATA__DATA_VALUES, null, null, oldDataValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataValues() {
		return dataValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.HISTORY_DATA__DATA_VALUES:
				return basicUnsetDataValues(msgs);
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
			case TypesPackage.HISTORY_DATA__DATA_VALUES:
				return getDataValues();
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
			case TypesPackage.HISTORY_DATA__DATA_VALUES:
				setDataValues((ListOfDataValue)newValue);
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
			case TypesPackage.HISTORY_DATA__DATA_VALUES:
				unsetDataValues();
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
			case TypesPackage.HISTORY_DATA__DATA_VALUES:
				return isSetDataValues();
		}
		return super.eIsSet(featureID);
	}

} //HistoryDataImpl
