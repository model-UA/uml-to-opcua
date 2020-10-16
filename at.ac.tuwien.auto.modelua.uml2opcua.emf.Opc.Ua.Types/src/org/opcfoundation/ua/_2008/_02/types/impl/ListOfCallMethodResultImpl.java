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

import org.opcfoundation.ua._2008._02.types.CallMethodResult;
import org.opcfoundation.ua._2008._02.types.ListOfCallMethodResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Call Method Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfCallMethodResultImpl#getCallMethodResult <em>Call Method Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfCallMethodResultImpl extends MinimalEObjectImpl.Container implements ListOfCallMethodResult {
	/**
	 * The cached value of the '{@link #getCallMethodResult() <em>Call Method Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallMethodResult()
	 * @generated
	 * @ordered
	 */
	protected EList<CallMethodResult> callMethodResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfCallMethodResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfCallMethodResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallMethodResult> getCallMethodResult() {
		if (callMethodResult == null) {
			callMethodResult = new EObjectContainmentEList<CallMethodResult>(CallMethodResult.class, this, TypesPackage.LIST_OF_CALL_METHOD_RESULT__CALL_METHOD_RESULT);
		}
		return callMethodResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_CALL_METHOD_RESULT__CALL_METHOD_RESULT:
				return ((InternalEList<?>)getCallMethodResult()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_CALL_METHOD_RESULT__CALL_METHOD_RESULT:
				return getCallMethodResult();
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
			case TypesPackage.LIST_OF_CALL_METHOD_RESULT__CALL_METHOD_RESULT:
				getCallMethodResult().clear();
				getCallMethodResult().addAll((Collection<? extends CallMethodResult>)newValue);
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
			case TypesPackage.LIST_OF_CALL_METHOD_RESULT__CALL_METHOD_RESULT:
				getCallMethodResult().clear();
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
			case TypesPackage.LIST_OF_CALL_METHOD_RESULT__CALL_METHOD_RESULT:
				return callMethodResult != null && !callMethodResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfCallMethodResultImpl
