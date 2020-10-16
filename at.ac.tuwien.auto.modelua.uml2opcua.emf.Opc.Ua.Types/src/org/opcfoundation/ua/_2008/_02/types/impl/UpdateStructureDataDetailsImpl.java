/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ListOfDataValue;
import org.opcfoundation.ua._2008._02.types.PerformUpdateType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UpdateStructureDataDetails;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Structure Data Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UpdateStructureDataDetailsImpl#getPerformInsertReplace <em>Perform Insert Replace</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UpdateStructureDataDetailsImpl#getUpdateValues <em>Update Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateStructureDataDetailsImpl extends HistoryUpdateDetailsImpl implements UpdateStructureDataDetails {
	/**
	 * The default value of the '{@link #getPerformInsertReplace() <em>Perform Insert Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformInsertReplace()
	 * @generated
	 * @ordered
	 */
	protected static final PerformUpdateType PERFORM_INSERT_REPLACE_EDEFAULT = PerformUpdateType.INSERT1;

	/**
	 * The cached value of the '{@link #getPerformInsertReplace() <em>Perform Insert Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformInsertReplace()
	 * @generated
	 * @ordered
	 */
	protected PerformUpdateType performInsertReplace = PERFORM_INSERT_REPLACE_EDEFAULT;

	/**
	 * This is true if the Perform Insert Replace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean performInsertReplaceESet;

	/**
	 * The cached value of the '{@link #getUpdateValues() <em>Update Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateValues()
	 * @generated
	 * @ordered
	 */
	protected ListOfDataValue updateValues;

	/**
	 * This is true if the Update Values containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateValuesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateStructureDataDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getUpdateStructureDataDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformUpdateType getPerformInsertReplace() {
		return performInsertReplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformInsertReplace(PerformUpdateType newPerformInsertReplace) {
		PerformUpdateType oldPerformInsertReplace = performInsertReplace;
		performInsertReplace = newPerformInsertReplace == null ? PERFORM_INSERT_REPLACE_EDEFAULT : newPerformInsertReplace;
		boolean oldPerformInsertReplaceESet = performInsertReplaceESet;
		performInsertReplaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__PERFORM_INSERT_REPLACE, oldPerformInsertReplace, performInsertReplace, !oldPerformInsertReplaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPerformInsertReplace() {
		PerformUpdateType oldPerformInsertReplace = performInsertReplace;
		boolean oldPerformInsertReplaceESet = performInsertReplaceESet;
		performInsertReplace = PERFORM_INSERT_REPLACE_EDEFAULT;
		performInsertReplaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__PERFORM_INSERT_REPLACE, oldPerformInsertReplace, PERFORM_INSERT_REPLACE_EDEFAULT, oldPerformInsertReplaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPerformInsertReplace() {
		return performInsertReplaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataValue getUpdateValues() {
		return updateValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateValues(ListOfDataValue newUpdateValues, NotificationChain msgs) {
		ListOfDataValue oldUpdateValues = updateValues;
		updateValues = newUpdateValues;
		boolean oldUpdateValuesESet = updateValuesESet;
		updateValuesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES, oldUpdateValues, newUpdateValues, !oldUpdateValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateValues(ListOfDataValue newUpdateValues) {
		if (newUpdateValues != updateValues) {
			NotificationChain msgs = null;
			if (updateValues != null)
				msgs = ((InternalEObject)updateValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES, null, msgs);
			if (newUpdateValues != null)
				msgs = ((InternalEObject)newUpdateValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES, null, msgs);
			msgs = basicSetUpdateValues(newUpdateValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUpdateValuesESet = updateValuesESet;
			updateValuesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES, newUpdateValues, newUpdateValues, !oldUpdateValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetUpdateValues(NotificationChain msgs) {
		ListOfDataValue oldUpdateValues = updateValues;
		updateValues = null;
		boolean oldUpdateValuesESet = updateValuesESet;
		updateValuesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES, oldUpdateValues, null, oldUpdateValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdateValues() {
		if (updateValues != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)updateValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES, null, msgs);
			msgs = basicUnsetUpdateValues(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUpdateValuesESet = updateValuesESet;
			updateValuesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES, null, null, oldUpdateValuesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdateValues() {
		return updateValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES:
				return basicUnsetUpdateValues(msgs);
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
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__PERFORM_INSERT_REPLACE:
				return getPerformInsertReplace();
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES:
				return getUpdateValues();
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
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__PERFORM_INSERT_REPLACE:
				setPerformInsertReplace((PerformUpdateType)newValue);
				return;
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES:
				setUpdateValues((ListOfDataValue)newValue);
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
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__PERFORM_INSERT_REPLACE:
				unsetPerformInsertReplace();
				return;
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES:
				unsetUpdateValues();
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
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__PERFORM_INSERT_REPLACE:
				return isSetPerformInsertReplace();
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS__UPDATE_VALUES:
				return isSetUpdateValues();
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
		result.append(" (performInsertReplace: ");
		if (performInsertReplaceESet) result.append(performInsertReplace); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UpdateStructureDataDetailsImpl
