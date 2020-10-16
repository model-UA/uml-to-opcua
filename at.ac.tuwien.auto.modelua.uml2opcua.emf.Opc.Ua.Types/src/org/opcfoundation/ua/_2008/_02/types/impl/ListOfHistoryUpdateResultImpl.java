/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2008._02.types.HistoryUpdateResult;
import org.opcfoundation.ua._2008._02.types.ListOfHistoryUpdateResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of History Update Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfHistoryUpdateResultImpl#getHistoryUpdateResult <em>History Update Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfHistoryUpdateResultImpl extends MinimalEObjectImpl.Container implements ListOfHistoryUpdateResult {
	/**
	 * The cached value of the '{@link #getHistoryUpdateResult() <em>History Update Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryUpdateResult()
	 * @generated
	 * @ordered
	 */
	protected EList<HistoryUpdateResult> historyUpdateResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfHistoryUpdateResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfHistoryUpdateResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HistoryUpdateResult> getHistoryUpdateResult() {
		if (historyUpdateResult == null) {
			historyUpdateResult = new EObjectContainmentEList<HistoryUpdateResult>(HistoryUpdateResult.class, this, TypesPackage.LIST_OF_HISTORY_UPDATE_RESULT__HISTORY_UPDATE_RESULT);
		}
		return historyUpdateResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_HISTORY_UPDATE_RESULT__HISTORY_UPDATE_RESULT:
				return ((InternalEList<?>)getHistoryUpdateResult()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_HISTORY_UPDATE_RESULT__HISTORY_UPDATE_RESULT:
				return getHistoryUpdateResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.LIST_OF_HISTORY_UPDATE_RESULT__HISTORY_UPDATE_RESULT:
				getHistoryUpdateResult().clear();
				getHistoryUpdateResult().addAll((Collection<? extends HistoryUpdateResult>)newValue);
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
			case TypesPackage.LIST_OF_HISTORY_UPDATE_RESULT__HISTORY_UPDATE_RESULT:
				getHistoryUpdateResult().clear();
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
			case TypesPackage.LIST_OF_HISTORY_UPDATE_RESULT__HISTORY_UPDATE_RESULT:
				return historyUpdateResult != null && !historyUpdateResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfHistoryUpdateResultImpl
