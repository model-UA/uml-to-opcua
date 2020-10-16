/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ListOfFieldTargetDataType;
import org.opcfoundation.ua._2008._02.types.TargetVariablesDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Variables Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TargetVariablesDataTypeImpl#getTargetVariables <em>Target Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetVariablesDataTypeImpl extends SubscribedDataSetDataTypeImpl implements TargetVariablesDataType {
	/**
	 * The cached value of the '{@link #getTargetVariables() <em>Target Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariables()
	 * @generated
	 * @ordered
	 */
	protected ListOfFieldTargetDataType targetVariables;

	/**
	 * This is true if the Target Variables containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetVariablesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetVariablesDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getTargetVariablesDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfFieldTargetDataType getTargetVariables() {
		return targetVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetVariables(ListOfFieldTargetDataType newTargetVariables, NotificationChain msgs) {
		ListOfFieldTargetDataType oldTargetVariables = targetVariables;
		targetVariables = newTargetVariables;
		boolean oldTargetVariablesESet = targetVariablesESet;
		targetVariablesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES, oldTargetVariables, newTargetVariables, !oldTargetVariablesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVariables(ListOfFieldTargetDataType newTargetVariables) {
		if (newTargetVariables != targetVariables) {
			NotificationChain msgs = null;
			if (targetVariables != null)
				msgs = ((InternalEObject)targetVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES, null, msgs);
			if (newTargetVariables != null)
				msgs = ((InternalEObject)newTargetVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES, null, msgs);
			msgs = basicSetTargetVariables(newTargetVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetVariablesESet = targetVariablesESet;
			targetVariablesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES, newTargetVariables, newTargetVariables, !oldTargetVariablesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTargetVariables(NotificationChain msgs) {
		ListOfFieldTargetDataType oldTargetVariables = targetVariables;
		targetVariables = null;
		boolean oldTargetVariablesESet = targetVariablesESet;
		targetVariablesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES, oldTargetVariables, null, oldTargetVariablesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetVariables() {
		if (targetVariables != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)targetVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES, null, msgs);
			msgs = basicUnsetTargetVariables(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetVariablesESet = targetVariablesESet;
			targetVariablesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES, null, null, oldTargetVariablesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetVariables() {
		return targetVariablesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES:
				return basicUnsetTargetVariables(msgs);
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
			case TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES:
				return getTargetVariables();
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
			case TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES:
				setTargetVariables((ListOfFieldTargetDataType)newValue);
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
			case TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES:
				unsetTargetVariables();
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
			case TypesPackage.TARGET_VARIABLES_DATA_TYPE__TARGET_VARIABLES:
				return isSetTargetVariables();
		}
		return super.eIsSet(featureID);
	}

} //TargetVariablesDataTypeImpl
