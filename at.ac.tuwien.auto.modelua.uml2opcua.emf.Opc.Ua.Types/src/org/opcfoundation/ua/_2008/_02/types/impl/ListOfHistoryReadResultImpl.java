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

import org.opcfoundation.ua._2008._02.types.HistoryReadResult;
import org.opcfoundation.ua._2008._02.types.ListOfHistoryReadResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of History Read Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfHistoryReadResultImpl#getHistoryReadResult <em>History Read Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfHistoryReadResultImpl extends MinimalEObjectImpl.Container implements ListOfHistoryReadResult {
	/**
	 * The cached value of the '{@link #getHistoryReadResult() <em>History Read Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryReadResult()
	 * @generated
	 * @ordered
	 */
	protected EList<HistoryReadResult> historyReadResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfHistoryReadResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfHistoryReadResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HistoryReadResult> getHistoryReadResult() {
		if (historyReadResult == null) {
			historyReadResult = new EObjectContainmentEList<HistoryReadResult>(HistoryReadResult.class, this, TypesPackage.LIST_OF_HISTORY_READ_RESULT__HISTORY_READ_RESULT);
		}
		return historyReadResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_HISTORY_READ_RESULT__HISTORY_READ_RESULT:
				return ((InternalEList<?>)getHistoryReadResult()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_HISTORY_READ_RESULT__HISTORY_READ_RESULT:
				return getHistoryReadResult();
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
			case TypesPackage.LIST_OF_HISTORY_READ_RESULT__HISTORY_READ_RESULT:
				getHistoryReadResult().clear();
				getHistoryReadResult().addAll((Collection<? extends HistoryReadResult>)newValue);
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
			case TypesPackage.LIST_OF_HISTORY_READ_RESULT__HISTORY_READ_RESULT:
				getHistoryReadResult().clear();
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
			case TypesPackage.LIST_OF_HISTORY_READ_RESULT__HISTORY_READ_RESULT:
				return historyReadResult != null && !historyReadResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfHistoryReadResultImpl
